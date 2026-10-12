.class public final Landroidx/compose/material3/ChipKt;
.super Ljava/lang/Object;
.source "Chip.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n1223#2,6:2819\n148#3:2818\n148#3:2825\n148#3:2827\n148#3:2828\n148#3:2829\n1#4:2826\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n218#1:2788,6\n380#1:2794,6\n829#1:2800,6\n985#1:2806,6\n1966#1:2812,6\n2012#1:2819,6\n1973#1:2818\n2021#1:2825\n2767#1:2827\n2768#1:2828\n2773#1:2829\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u001a\u00a8\u0001\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010%\u001a\u00a6\u0001\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010&2\u0008\u0008\u0002\u0010#\u001a\u00020$H\u0007\u00a2\u0006\u0002\u0010\'\u001a\u00bb\u0001\u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100\u001a\u0094\u0001\u00101\u001a\u00020\u00112\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106\u001a\u00a8\u0001\u00107\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010%\u001a\u00a6\u0001\u00107\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010&2\u0008\u0008\u0002\u0010#\u001a\u00020$H\u0007\u00a2\u0006\u0002\u0010\'\u001a\u00b0\u0001\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020:2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010<\u001a\u0091\u0001\u0010=\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010?\u001a\u008f\u0001\u0010=\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010&2\u0008\u0008\u0002\u0010#\u001a\u00020$H\u0007\u00a2\u0006\u0002\u0010@\u001a\u00b0\u0001\u0010A\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020:2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010<\u001a\u00c7\u0001\u0010B\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0015\u0008\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020:2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010C\u001a\u00d0\u0001\u0010D\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u0010)\u001a\u00020*2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020:2\u0008\u0010\u001f\u001a\u0004\u0018\u00010;2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010F\u001a\u0091\u0001\u0010G\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0002\u0010?\u001a\u008f\u0001\u0010G\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00152\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010&2\u0008\u0008\u0002\u0010#\u001a\u00020$H\u0007\u00a2\u0006\u0002\u0010@\u001a&\u0010H\u001a\u00020\u00012\u0008\u0008\u0002\u0010I\u001a\u00020\u00192\u0008\u0008\u0002\u0010J\u001a\u00020\u00192\u0008\u0008\u0002\u0010K\u001a\u00020\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u000b\u001a\u00020\u000c*\u00020\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006L"
    }
    d2 = {
        "AssistChipPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "FilterChipPadding",
        "HorizontalElementsPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "LabelLayoutId",
        "",
        "LeadingIconLayoutId",
        "SuggestionChipPadding",
        "TrailingIconLayoutId",
        "defaultSuggestionChipColors",
        "Landroidx/compose/material3/ChipColors;",
        "Landroidx/compose/material3/ColorScheme;",
        "getDefaultSuggestionChipColors",
        "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;",
        "AssistChip",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "label",
        "Landroidx/compose/runtime/Composable;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "leadingIcon",
        "trailingIcon",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "elevation",
        "Landroidx/compose/material3/ChipElevation;",
        "border",
        "Landroidx/compose/foundation/BorderStroke;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/material3/ChipBorder;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "Chip",
        "labelTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "labelColor",
        "Landroidx/compose/ui/graphics/Color;",
        "minHeight",
        "paddingValues",
        "Chip-nkUnTEs",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "ChipContent",
        "avatar",
        "leadingIconColor",
        "trailingIconColor",
        "ChipContent-fe0OD_I",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V",
        "ElevatedAssistChip",
        "ElevatedFilterChip",
        "selected",
        "Landroidx/compose/material3/SelectableChipColors;",
        "Landroidx/compose/material3/SelectableChipElevation;",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "ElevatedSuggestionChip",
        "icon",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "FilterChip",
        "InputChip",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "SelectableChip",
        "SelectableChip-u0RnIRE",
        "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "SuggestionChip",
        "inputChipPadding",
        "hasAvatar",
        "hasLeadingIcon",
        "hasTrailingIcon",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final HorizontalElementsPadding:F

.field private static final LabelLayoutId:Ljava/lang/String; = "label"

.field private static final LeadingIconLayoutId:Ljava/lang/String; = "leadingIcon"

.field private static final SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final TrailingIconLayoutId:Ljava/lang/String; = "trailingIcon"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 2773
    const/16 v0, 0x8

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 2829
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 2773
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    .line 2776
    sget v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2779
    sget v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 2782
    sget v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    sput-object v0, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    return-void
.end method

.method public static final AssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p7, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p8, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p9, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 133
    move/from16 v12, p12

    move/from16 v14, p14

    const v0, 0x12aedeb8

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)126@6277L5,127@6328L18,128@6399L21,129@6469L25,137@6729L5,132@6561L541:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p12

    .local v1, "$dirty":I
    move/from16 v2, p13

    .local v2, "$dirty1":I
    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v14, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v3, v14, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v1, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v14, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v14, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move-object/from16 v15, p4

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move-object/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v4, p5

    goto :goto_b

    :cond_f
    and-int v17, v12, v17

    if-nez v17, :cond_11

    move-object/from16 v4, p5

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v1, v1, v17

    goto :goto_b

    :cond_11
    move-object/from16 v4, p5

    :goto_b
    const/high16 v17, 0x180000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    and-int/lit8 v17, v14, 0x40

    if-nez v17, :cond_12

    move-object/from16 v0, p6

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v0, p6

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v1, v1, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v18, 0xc00000

    and-int v18, v12, v18

    if-nez v18, :cond_17

    and-int/lit16 v5, v14, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v1, v1, v19

    goto :goto_f

    :cond_17
    move-object/from16 v5, p7

    :goto_f
    const/high16 v19, 0x6000000

    and-int v19, v12, v19

    if-nez v19, :cond_1a

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v19, 0x2000000

    :goto_10
    or-int v1, v1, v19

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    const/high16 v19, 0x30000000

    and-int v19, v12, v19

    if-nez v19, :cond_1d

    and-int/lit16 v0, v14, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    and-int/lit16 v2, v14, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v19, v19, 0x6

    move/from16 v20, v2

    goto :goto_15

    :cond_1e
    and-int/lit8 v20, p13, 0x6

    if-nez v20, :cond_20

    move/from16 v20, v2

    move-object/from16 v2, p10

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v19, v19, v21

    goto :goto_15

    :cond_20
    move/from16 v20, v2

    move-object/from16 v2, p10

    :goto_15
    move/from16 v2, v19

    .end local v19    # "$dirty1":I
    .restart local v2    # "$dirty1":I
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 p11, v1

    .end local v1    # "$dirty":I
    .local p11, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_22

    and-int/lit8 v0, v2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_16

    .line 149
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move v0, v2

    move-object v3, v6

    move-object/from16 v31, v8

    move-object v6, v4

    move-object v8, v5

    move v4, v9

    move-object v5, v15

    move-object/from16 v9, p8

    move/from16 v15, p11

    goto/16 :goto_21

    .line 133
    :cond_22
    :goto_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const v18, -0xe000001

    const v1, -0x1c00001

    const v19, -0x380001

    move/from16 v21, v2

    .end local v2    # "$dirty1":I
    .local v21, "$dirty1":I
    const/4 v2, 0x6

    if-eqz v0, :cond_28

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 131
    :cond_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_24

    and-int v0, p11, v19

    .end local p11    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_17

    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_24
    move/from16 v0, p11

    .end local p11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_17
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_25

    and-int/2addr v0, v1

    :cond_25
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_26

    and-int v0, v0, v18

    :cond_26
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_27

    const v1, -0x70000001

    and-int/2addr v0, v1

    :cond_27
    move-object/from16 v24, p6

    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v30, p10

    move v1, v0

    move v11, v2

    move-object/from16 v23, v4

    move v2, v9

    move-object/from16 v22, v15

    move/from16 v0, v21

    move-object v15, v6

    goto/16 :goto_20

    .line 133
    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_28
    :goto_18
    if-eqz v3, :cond_29

    .line 123
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_19

    .line 133
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_29
    move-object v0, v6

    .line 123
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    if-eqz v7, :cond_2a

    .line 124
    const/4 v3, 0x1

    move/from16 v22, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1a

    .line 123
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_2a
    move/from16 v22, v9

    .line 124
    .end local p3    # "enabled":Z
    .local v22, "enabled":Z
    :goto_1a
    if-eqz v10, :cond_2b

    .line 125
    const/4 v3, 0x0

    move-object v15, v3

    .end local p4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v15, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2b
    if-eqz v16, :cond_2c

    .line 126
    const/4 v3, 0x0

    move-object/from16 v16, v3

    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1b

    .line 125
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2c
    move-object/from16 v16, v4

    .line 126
    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v16, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1b
    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_2d

    .line 127
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, p11, v19

    move-object/from16 v19, v3

    .end local p11    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_1c

    .line 126
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p11    # "$dirty":I
    :cond_2d
    move-object/from16 v19, p6

    move/from16 v4, p11

    .line 127
    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p11    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1c
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_2e

    .line 128
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->assistChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v23, v3

    move/from16 v24, v4

    goto :goto_1d

    .line 127
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p7    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2e
    move-object/from16 v23, v5

    move/from16 v24, v4

    .line 128
    .end local v4    # "$dirty":I
    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1d
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_2f

    .line 129
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v25, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v21

    move/from16 v11, v25

    .end local v21    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->assistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v24, v24, v18

    move-object/from16 v18, v1

    goto :goto_1e

    .line 128
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v21    # "$dirty1":I
    .restart local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2f
    move-object/from16 p2, v0

    move v11, v2

    move/from16 v0, v21

    .end local v21    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v18, p8

    .line 129
    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v18, "elevation":Landroidx/compose/material3/ChipElevation;
    :goto_1e
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_30

    .line 130
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    shr-int/lit8 v2, v24, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v9, v2, 0x6000

    const/16 v10, 0xe

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move/from16 v2, v22

    .end local v22    # "enabled":Z
    .local v2, "enabled":Z
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->assistChipBorder-h1eT-Ww(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;

    move-result-object v1

    .end local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v1, "border":Landroidx/compose/foundation/BorderStroke;
    const v3, -0x70000001

    and-int v24, v24, v3

    goto :goto_1f

    .line 129
    .end local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v2    # "enabled":Z
    .restart local v22    # "enabled":Z
    .restart local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_30
    move/from16 v2, v22

    .end local v22    # "enabled":Z
    .restart local v2    # "enabled":Z
    move-object/from16 v1, p9

    .line 130
    .end local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_1f
    if-eqz v20, :cond_31

    .line 131
    const/4 v3, 0x0

    move-object/from16 v27, v1

    move-object/from16 v30, v3

    move-object/from16 v22, v15

    move-object/from16 v26, v18

    move-object/from16 v5, v23

    move/from16 v1, v24

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_20

    .line 130
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_31
    move-object/from16 v30, p10

    move-object/from16 v27, v1

    move-object/from16 v22, v15

    move-object/from16 v26, v18

    move-object/from16 v5, v23

    move/from16 v1, v24

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    .line 131
    .end local v16    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v18    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v5, "colors":Landroidx/compose/material3/ChipColors;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v23, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v27, "border":Landroidx/compose/foundation/BorderStroke;
    .local v30, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_32

    .line 133
    const-string v3, "androidx.compose.material3.AssistChip (Chip.kt:132)"

    const v4, 0x12aedeb8

    invoke-static {v4, v1, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 134
    :cond_32
    nop

    .line 135
    nop

    .line 136
    nop

    .line 137
    nop

    .line 138
    sget-object v3, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v3, v8, v11}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 139
    invoke-virtual {v5, v2}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v20

    .line 140
    nop

    .line 141
    nop

    .line 142
    nop

    .line 143
    nop

    .line 144
    nop

    .line 145
    nop

    .line 146
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v28

    .line 147
    sget-object v29, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 148
    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0xe

    shl-int/lit8 v4, v1, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x380000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x1c00000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0xe000000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x70000000

    and-int/2addr v4, v6

    or-int v32, v3, v4

    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0xd80

    shr-int/lit8 v4, v1, 0x18

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shl-int/lit8 v4, v0, 0xc

    const v6, 0xe000

    and-int/2addr v4, v6

    or-int v33, v3, v4

    .line 133
    move-object/from16 v16, p0

    move/from16 v17, v2

    move-object/from16 v25, v5

    move-object/from16 v31, v8

    move-object/from16 v18, v13

    .end local v2    # "enabled":Z
    .end local v5    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v17, "enabled":Z
    .local v25, "colors":Landroidx/compose/material3/ChipColors;
    .local v31, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v33}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 149
    :cond_33
    move-object v3, v15

    move/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move-object/from16 v11, v30

    move v15, v1

    .end local v1    # "$dirty":I
    .end local v17    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v23    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v26    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v27    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v30    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v6, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v10, "border":Landroidx/compose/foundation/BorderStroke;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "$dirty":I
    :goto_21
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_34

    move/from16 v21, v0

    .end local v0    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    new-instance v0, Landroidx/compose/material3/ChipKt$AssistChip$1;

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p0

    .end local v15    # "$dirty":I
    .local p2, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$AssistChip$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_22

    .end local v21    # "$dirty1":I
    .end local p2    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_34
    move/from16 v21, v0

    move/from16 p2, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v21    # "$dirty1":I
    .restart local p2    # "$dirty":I
    :goto_22
    return-void
.end method

.method public static final synthetic AssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p7, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p8, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p9, "border"    # Landroidx/compose/material3/ChipBorder;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource"
            imports = {}
        .end subannotation
    .end annotation

    .line 220
    move/from16 v12, p12

    move/from16 v14, p14

    const v0, -0x732c9134

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)213@10395L5,214@10446L18,215@10517L21,216@10585L18,217@10655L39,224@10872L5,219@10704L571:Chip.kt#uh7d8r"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p12

    .local v1, "$dirty":I
    move/from16 v2, p13

    .local v2, "$dirty1":I
    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v14, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v3, v14, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v1, v8

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v8, v14, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v14, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move-object/from16 v15, p4

    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move-object/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v4, p5

    goto :goto_b

    :cond_f
    and-int v17, v12, v17

    if-nez v17, :cond_11

    move-object/from16 v4, p5

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v1, v1, v17

    goto :goto_b

    :cond_11
    move-object/from16 v4, p5

    :goto_b
    const/high16 v17, 0x180000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    and-int/lit8 v17, v14, 0x40

    if-nez v17, :cond_12

    move-object/from16 v0, p6

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v0, p6

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v1, v1, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v18, 0xc00000

    and-int v18, v12, v18

    if-nez v18, :cond_17

    and-int/lit16 v5, v14, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v1, v1, v19

    goto :goto_f

    :cond_17
    move-object/from16 v5, p7

    :goto_f
    const/high16 v19, 0x6000000

    and-int v19, v12, v19

    if-nez v19, :cond_1a

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v19, 0x2000000

    :goto_10
    or-int v1, v1, v19

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    const/high16 v19, 0x30000000

    and-int v19, v12, v19

    if-nez v19, :cond_1d

    and-int/lit16 v0, v14, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    and-int/lit16 v2, v14, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v19, v19, 0x6

    move/from16 v20, v2

    goto :goto_15

    :cond_1e
    and-int/lit8 v20, p13, 0x6

    if-nez v20, :cond_20

    move/from16 v20, v2

    move-object/from16 v2, p10

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v21, 0x4

    goto :goto_14

    :cond_1f
    const/16 v21, 0x2

    :goto_14
    or-int v19, v19, v21

    goto :goto_15

    :cond_20
    move/from16 v20, v2

    move-object/from16 v2, p10

    :goto_15
    move/from16 v2, v19

    .end local v19    # "$dirty1":I
    .restart local v2    # "$dirty1":I
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 p11, v1

    .end local v1    # "$dirty":I
    .local p11, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_22

    and-int/lit8 v0, v2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_16

    .line 236
    :cond_21
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move v0, v2

    move-object v8, v5

    move-object v3, v6

    move-object/from16 v31, v7

    move-object v5, v15

    move-object/from16 v7, p6

    move/from16 v15, p11

    move-object v6, v4

    move v4, v9

    move-object/from16 v9, p8

    goto/16 :goto_24

    .line 220
    :cond_22
    :goto_16
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const v18, -0xe000001

    const v1, -0x1c00001

    const v19, -0x380001

    move/from16 v21, v2

    .end local v2    # "$dirty1":I
    .local v21, "$dirty1":I
    const/4 v2, 0x6

    if-eqz v0, :cond_28

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 218
    :cond_23
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_24

    and-int v0, p11, v19

    .end local p11    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_17

    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_24
    move/from16 v0, p11

    .end local p11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_17
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_25

    and-int/2addr v0, v1

    :cond_25
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_26

    and-int v0, v0, v18

    :cond_26
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_27

    const v1, -0x70000001

    and-int/2addr v0, v1

    :cond_27
    move-object/from16 v24, p6

    move-object/from16 v26, p8

    move-object/from16 v1, p9

    move-object/from16 v30, p10

    move v11, v2

    move-object/from16 v23, v4

    move-object/from16 v22, v15

    move v2, v0

    move-object v15, v6

    move/from16 v0, v21

    goto/16 :goto_21

    .line 220
    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_28
    :goto_18
    if-eqz v3, :cond_29

    .line 210
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_19

    .line 220
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_29
    move-object v0, v6

    .line 210
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    if-eqz v8, :cond_2a

    .line 211
    const/4 v3, 0x1

    move/from16 v22, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1a

    .line 210
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_2a
    move/from16 v22, v9

    .line 211
    .end local p3    # "enabled":Z
    .local v22, "enabled":Z
    :goto_1a
    if-eqz v10, :cond_2b

    .line 212
    const/4 v3, 0x0

    move-object v15, v3

    .end local p4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v15, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2b
    if-eqz v16, :cond_2c

    .line 213
    const/4 v3, 0x0

    move-object/from16 v16, v3

    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1b

    .line 212
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2c
    move-object/from16 v16, v4

    .line 213
    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v16, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1b
    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_2d

    .line 214
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v7, v2}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, p11, v19

    move-object/from16 v19, v3

    .end local p11    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_1c

    .line 213
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p11    # "$dirty":I
    :cond_2d
    move-object/from16 v19, p6

    move/from16 v4, p11

    .line 214
    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p11    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1c
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_2e

    .line 215
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v7, v2}, Landroidx/compose/material3/AssistChipDefaults;->assistChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v23, v3

    move/from16 v24, v4

    goto :goto_1d

    .line 214
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p7    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2e
    move-object/from16 v23, v5

    move/from16 v24, v4

    .line 215
    .end local v4    # "$dirty":I
    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1d
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_2f

    .line 216
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object/from16 v31, v7

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v31, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    move-object/from16 p2, v0

    move v11, v8

    move/from16 v0, v21

    move-object/from16 v8, v31

    .end local v21    # "$dirty1":I
    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .local v0, "$dirty1":I
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->assistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    and-int v24, v24, v18

    move-object v10, v1

    goto :goto_1e

    .line 215
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v21    # "$dirty1":I
    .restart local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2f
    move-object/from16 p2, v0

    move v11, v2

    move-object/from16 v31, v7

    move/from16 v0, v21

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v21    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v10, p8

    .line 216
    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v10, "elevation":Landroidx/compose/material3/ChipElevation;
    :goto_1e
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_30

    .line 217
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/16 v8, 0xc00

    const/4 v9, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, v31

    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v1 .. v9}, Landroidx/compose/material3/AssistChipDefaults;->assistChipBorder-d_3_b6Q(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;

    move-result-object v1

    .end local p9    # "border":Landroidx/compose/material3/ChipBorder;
    .local v1, "border":Landroidx/compose/material3/ChipBorder;
    const v2, -0x70000001

    and-int v24, v24, v2

    goto :goto_1f

    .line 216
    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p9    # "border":Landroidx/compose/material3/ChipBorder;
    :cond_30
    move-object/from16 v7, v31

    .end local v31    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    move-object/from16 v1, p9

    .line 217
    .end local p9    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local v1    # "border":Landroidx/compose/material3/ChipBorder;
    :goto_1f
    if-eqz v20, :cond_32

    .line 218
    const v2, 0xfeeba7f

    const-string v3, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid$iv":Z
    move-object v3, v7

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 2788
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2789
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_31

    .line 2790
    const/4 v8, 0x0

    .line 218
    .local v8, "$i$a$-cache-ChipKt$AssistChip$2":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    .line 2790
    .end local v8    # "$i$a$-cache-ChipKt$AssistChip$2":I
    nop

    .line 2791
    .local v8, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2792
    nop

    .end local v8    # "value$iv":Ljava/lang/Object;
    goto :goto_20

    .line 2793
    :cond_31
    move-object v8, v5

    .line 2789
    :goto_20
    nop

    .line 2788
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 218
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    move-object v2, v8

    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v30, v2

    move-object/from16 v26, v10

    move/from16 v9, v22

    move-object/from16 v5, v23

    move/from16 v2, v24

    move-object/from16 v22, v15

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    move-object/from16 v15, p2

    goto :goto_21

    .line 217
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_32
    move-object/from16 v30, p10

    move-object/from16 v26, v10

    move/from16 v9, v22

    move-object/from16 v5, v23

    move/from16 v2, v24

    move-object/from16 v22, v15

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    move-object/from16 v15, p2

    .line 218
    .end local v10    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v16    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "$dirty":I
    .local v5, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "enabled":Z
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v23, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v30, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_21
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_33

    .line 220
    const-string v3, "androidx.compose.material3.AssistChip (Chip.kt:219)"

    const v4, -0x732c9134

    invoke-static {v4, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 221
    :cond_33
    nop

    .line 222
    nop

    .line 223
    nop

    .line 224
    nop

    .line 225
    sget-object v3, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v3, v7, v11}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 226
    invoke-virtual {v5, v9}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v20

    .line 227
    nop

    .line 228
    nop

    .line 229
    nop

    .line 230
    nop

    .line 231
    nop

    .line 232
    const v3, 0xfeef28d

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "231@11104L21"

    invoke-static {v7, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v1, :cond_34

    const/4 v3, 0x0

    goto :goto_22

    :cond_34
    shr-int/lit8 v3, v2, 0x9

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v4, v2, 0x18

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-virtual {v1, v9, v7, v3}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    :goto_22
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v3, :cond_35

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/BorderStroke;

    goto :goto_23

    :cond_35
    const/4 v3, 0x0

    :goto_23
    move-object/from16 v27, v3

    .line 233
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v28

    .line 234
    sget-object v29, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 235
    shr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0xe

    shl-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v6, 0x380000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v6, 0x1c00000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v6, 0xe000000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v6, 0x70000000

    and-int/2addr v4, v6

    or-int v32, v3, v4

    shr-int/lit8 v3, v2, 0x18

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0xd80

    shl-int/lit8 v4, v0, 0xc

    const v6, 0xe000

    and-int/2addr v4, v6

    or-int v33, v3, v4

    .line 220
    move-object/from16 v16, p0

    move-object/from16 v25, v5

    move-object/from16 v31, v7

    move/from16 v17, v9

    move-object/from16 v18, v13

    .end local v5    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v9    # "enabled":Z
    .local v17, "enabled":Z
    .local v25, "colors":Landroidx/compose/material3/ChipColors;
    .restart local v31    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v33}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 236
    :cond_36
    move-object v10, v1

    move-object v3, v15

    move/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v11, v30

    move v15, v2

    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v2    # "$dirty":I
    .end local v17    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v23    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v26    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v30    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v6, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v10, "border":Landroidx/compose/material3/ChipBorder;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "$dirty":I
    :goto_24
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_37

    move/from16 v21, v0

    .end local v0    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    new-instance v0, Landroidx/compose/material3/ChipKt$AssistChip$3;

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p0

    .end local v15    # "$dirty":I
    .local p2, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$AssistChip$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_25

    .end local v21    # "$dirty1":I
    .end local p2    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_37
    move/from16 v21, v0

    move/from16 p2, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v21    # "$dirty1":I
    .restart local p2    # "$dirty":I
    :goto_25
    return-void
.end method

.method private static final Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "enabled"    # Z
    .param p3, "label"    # Lkotlin/jvm/functions/Function2;
    .param p4, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p5, "labelColor"    # J
    .param p7, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p9, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p10, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p11, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p12, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p13, "minHeight"    # F
    .param p14, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p15, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "F",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1964
    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v9, p10

    move-object/from16 v0, p11

    move-object/from16 v13, p15

    move/from16 v14, p17

    move/from16 v15, p18

    const v2, 0x537a018f

    move-object/from16 v4, p16

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1975@97230L477,1966@96860L847:Chip.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p17

    .local v5, "$dirty":I
    move/from16 v6, p18

    .local v6, "$dirty1":I
    and-int/lit8 v7, v14, 0x6

    if-nez v7, :cond_1

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v5, v7

    :cond_1
    and-int/lit8 v7, v14, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_1

    :cond_2
    const/16 v16, 0x10

    :goto_1
    or-int v5, v5, v16

    goto :goto_2

    :cond_3
    move-object/from16 v7, p1

    :goto_2
    and-int/lit16 v8, v14, 0x180

    const/16 v16, 0x100

    const/16 v17, 0x80

    if-nez v8, :cond_5

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    move/from16 v8, v16

    goto :goto_3

    :cond_4
    move/from16 v8, v17

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v14, 0xc00

    const/16 v18, 0x800

    const/16 v19, 0x400

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_6

    move/from16 v20, v18

    goto :goto_4

    :cond_6
    move/from16 v20, v19

    :goto_4
    or-int v5, v5, v20

    goto :goto_5

    :cond_7
    move-object/from16 v8, p3

    :goto_5
    and-int/lit16 v10, v14, 0x6000

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_8

    move/from16 v23, v21

    goto :goto_6

    :cond_8
    move/from16 v23, v22

    :goto_6
    or-int v5, v5, v23

    goto :goto_7

    :cond_9
    move-object/from16 v10, p4

    :goto_7
    const/high16 v23, 0x30000

    and-int v23, v14, v23

    if-nez v23, :cond_b

    move-wide/from16 v11, p5

    invoke-interface {v4, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v24

    if-eqz v24, :cond_a

    const/high16 v24, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v24, 0x10000

    :goto_8
    or-int v5, v5, v24

    goto :goto_9

    :cond_b
    move-wide/from16 v11, p5

    :goto_9
    const/high16 v24, 0x180000

    and-int v24, v14, v24

    if-nez v24, :cond_d

    move-object/from16 v2, p7

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_c

    const/high16 v25, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v25, 0x80000

    :goto_a
    or-int v5, v5, v25

    goto :goto_b

    :cond_d
    move-object/from16 v2, p7

    :goto_b
    const/high16 v25, 0xc00000

    and-int v25, v14, v25

    if-nez v25, :cond_f

    move-object/from16 v2, p8

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_e

    const/high16 v25, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v25, 0x400000

    :goto_c
    or-int v5, v5, v25

    goto :goto_d

    :cond_f
    move-object/from16 v2, p8

    :goto_d
    const/high16 v25, 0x6000000

    and-int v25, v14, v25

    if-nez v25, :cond_11

    move-object/from16 v14, p9

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x4000000

    goto :goto_e

    :cond_10
    const/high16 v25, 0x2000000

    :goto_e
    or-int v5, v5, v25

    goto :goto_f

    :cond_11
    move-object/from16 v14, p9

    :goto_f
    const/high16 v25, 0x30000000

    and-int v25, p17, v25

    if-nez v25, :cond_13

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x20000000

    goto :goto_10

    :cond_12
    const/high16 v25, 0x10000000

    :goto_10
    or-int v5, v5, v25

    :cond_13
    and-int/lit8 v25, v15, 0x6

    if-nez v25, :cond_15

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_14

    const/16 v20, 0x4

    goto :goto_11

    :cond_14
    const/16 v20, 0x2

    :goto_11
    or-int v6, v6, v20

    :cond_15
    and-int/lit8 v20, v15, 0x30

    if-nez v20, :cond_17

    move-object/from16 v14, p12

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/16 v23, 0x20

    goto :goto_12

    :cond_16
    const/16 v23, 0x10

    :goto_12
    or-int v6, v6, v23

    goto :goto_13

    :cond_17
    move-object/from16 v14, p12

    :goto_13
    and-int/lit16 v2, v15, 0x180

    if-nez v2, :cond_19

    move/from16 v2, p13

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v20

    if-eqz v20, :cond_18

    goto :goto_14

    :cond_18
    move/from16 v16, v17

    :goto_14
    or-int v6, v6, v16

    goto :goto_15

    :cond_19
    move/from16 v2, p13

    :goto_15
    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_1b

    move-object/from16 v2, p14

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    goto :goto_16

    :cond_1a
    move/from16 v18, v19

    :goto_16
    or-int v6, v6, v18

    goto :goto_17

    :cond_1b
    move-object/from16 v2, p14

    :goto_17
    and-int/lit16 v2, v15, 0x6000

    if-nez v2, :cond_1d

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_18

    :cond_1c
    move/from16 v21, v22

    :goto_18
    or-int v6, v6, v21

    :cond_1d
    move v2, v6

    .end local v6    # "$dirty1":I
    .local v2, "$dirty1":I
    const v6, 0x12492493

    and-int/2addr v6, v5

    const v7, 0x12492492

    if-ne v6, v7, :cond_1f

    and-int/lit16 v6, v2, 0x2493

    const/16 v7, 0x2492

    if-ne v6, v7, :cond_1f

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v6

    if-nez v6, :cond_1e

    goto :goto_19

    .line 1990
    :cond_1e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v22, v2

    move-object/from16 v19, v4

    move v0, v5

    goto/16 :goto_1e

    .line 1964
    :cond_1f
    :goto_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_20

    const-string v6, "androidx.compose.material3.Chip (Chip.kt:1963)"

    const v7, 0x537a018f

    invoke-static {v7, v5, v2, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    const v6, 0x765a148b

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v6, "1965@96816L39"

    invoke-static {v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 1966
    if-nez v13, :cond_22

    const v6, 0x765a1716

    const-string v7, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v6, 0x0

    .local v6, "invalid$iv":Z
    move-object v7, v4

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 2812
    .local v16, "$i$f$cache":I
    move/from16 v17, v2

    .end local v2    # "$dirty1":I
    .local v17, "$dirty1":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 2813
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p16, v5

    .end local v5    # "$dirty":I
    .local p16, "$dirty":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_21

    .line 2814
    const/4 v5, 0x0

    .line 1966
    .local v5, "$i$a$-cache-ChipKt$Chip$interactionSource$1":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v5

    .line 2814
    .end local v5    # "$i$a$-cache-ChipKt$Chip$interactionSource$1":I
    nop

    .line 2815
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2816
    nop

    .end local v5    # "value$iv":Ljava/lang/Object;
    goto :goto_1a

    .line 2817
    :cond_21
    move-object v5, v2

    .line 2813
    :goto_1a
    nop

    .line 2812
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 1966
    .end local v6    # "invalid$iv":Z
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    goto :goto_1b

    .end local v17    # "$dirty1":I
    .end local p16    # "$dirty":I
    .local v2, "$dirty1":I
    .local v5, "$dirty":I
    :cond_22
    move/from16 v17, v2

    move/from16 p16, v5

    .end local v2    # "$dirty1":I
    .end local v5    # "$dirty":I
    .restart local v17    # "$dirty1":I
    .restart local p16    # "$dirty":I
    move-object v5, v13

    :goto_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v16, v5

    .line 1968
    .local v16, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    nop

    .line 1969
    sget-object v2, Landroidx/compose/material3/ChipKt$Chip$1;->INSTANCE:Landroidx/compose/material3/ChipKt$Chip$1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v1, v5, v2, v6, v7}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    .line 1970
    nop

    .line 1971
    nop

    .line 1972
    invoke-virtual {v9, v3}, Landroidx/compose/material3/ChipColors;->containerColor-vNxB06k$material3_release(Z)J

    move-result-wide v19

    .line 1973
    const v2, 0x765a39ba

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "1972@97093L43"

    invoke-static {v4, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v0, :cond_23

    goto :goto_1c

    :cond_23
    move-object/from16 v2, v16

    check-cast v2, Landroidx/compose/foundation/interaction/InteractionSource;

    shr-int/lit8 v5, p16, 0x6

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v7, v17, 0x6

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v5, v7

    invoke-virtual {v0, v3, v2, v4, v5}, Landroidx/compose/material3/ChipElevation;->shadowElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    :goto_1c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v7, :cond_24

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v2

    move/from16 v21, v2

    goto :goto_1d

    :cond_24
    const/4 v2, 0x0

    .local v2, "$this$dp$iv":I
    const/4 v5, 0x0

    .line 2818
    .local v5, "$i$f$getDp":I
    int-to-float v7, v2

    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    move/from16 v21, v7

    .line 1974
    .end local v2    # "$this$dp$iv":I
    .end local v5    # "$i$f$getDp":I
    :goto_1d
    nop

    .line 1975
    nop

    .line 1976
    new-instance v2, Landroidx/compose/material3/ChipKt$Chip$2;

    move-object/from16 v7, p7

    move/from16 v0, p16

    move-object v15, v4

    move v1, v6

    move-object v4, v10

    move-wide v5, v11

    move/from16 v22, v17

    move/from16 v11, p13

    move-object/from16 v12, p14

    move v10, v3

    move-object v3, v8

    move-object/from16 v8, p8

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v17    # "$dirty1":I
    .end local p16    # "$dirty":I
    .local v0, "$dirty":I
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$dirty1":I
    invoke-direct/range {v2 .. v12}, Landroidx/compose/material3/ChipKt$Chip$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ChipColors;ZFLandroidx/compose/foundation/layout/PaddingValues;)V

    const/16 v3, 0x36

    const v4, -0x765f629c

    invoke-static {v4, v1, v2, v15, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0xe

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v2, v3

    shr-int/lit8 v3, v0, 0xf

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v22, 0x15

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    .line 1967
    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x6

    move-object/from16 v3, v18

    const/16 v18, 0x60

    move/from16 v4, p2

    move-object/from16 v5, p9

    move-object v12, v14

    move-object/from16 v13, v16

    move-wide/from16 v6, v19

    move/from16 v11, v21

    move-object v14, v1

    move/from16 v16, v2

    move-object/from16 v2, p1

    .end local v16    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v13, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static/range {v2 .. v18}, Landroidx/compose/material3/SurfaceKt;->Surface-o_FOJdg(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v19, v15

    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1990
    .end local v13    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_25
    :goto_1e
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_26

    move v5, v0

    .end local v0    # "$dirty":I
    .local v5, "$dirty":I
    new-instance v0, Landroidx/compose/material3/ChipKt$Chip$3;

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v26, v1

    move/from16 v20, v5

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    .end local v5    # "$dirty":I
    .local v20, "$dirty":I
    invoke-direct/range {v0 .. v18}, Landroidx/compose/material3/ChipKt$Chip$3;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v26

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1f

    .end local v20    # "$dirty":I
    .restart local v0    # "$dirty":I
    :cond_26
    move/from16 v20, v0

    .end local v0    # "$dirty":I
    .restart local v20    # "$dirty":I
    :goto_1f
    return-void
.end method

.method private static final ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .param p0, "label"    # Lkotlin/jvm/functions/Function2;
    .param p1, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p2, "labelColor"    # J
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "avatar"    # Lkotlin/jvm/functions/Function2;
    .param p6, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "leadingIconColor"    # J
    .param p9, "trailingIconColor"    # J
    .param p11, "minHeight"    # F
    .param p12, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 2052
    move-object/from16 v2, p1

    move/from16 v14, p14

    const v0, -0x2ea9c614

    move-object/from16 v1, p13

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .end local p13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)2055@99907L3519,2052@99781L3645:Chip.kt#uh7d8r"

    invoke-static {v15, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p14

    .local v1, "$dirty":I
    and-int/lit8 v3, v14, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    :goto_1
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_3

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_3
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_5

    move-wide/from16 v5, p2

    invoke-interface {v15, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    goto :goto_4

    :cond_5
    move-wide/from16 v5, p2

    :goto_4
    and-int/lit16 v7, v14, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p4

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v1, v8

    goto :goto_6

    :cond_7
    move-object/from16 v7, p4

    :goto_6
    and-int/lit16 v8, v14, 0x6000

    if-nez v8, :cond_9

    move-object/from16 v8, p5

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_7

    :cond_8
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v1, v9

    goto :goto_8

    :cond_9
    move-object/from16 v8, p5

    :goto_8
    const/high16 v9, 0x30000

    and-int/2addr v9, v14

    if-nez v9, :cond_b

    move-object/from16 v9, p6

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v10, 0x10000

    :goto_9
    or-int/2addr v1, v10

    goto :goto_a

    :cond_b
    move-object/from16 v9, p6

    :goto_a
    const/high16 v10, 0x180000

    and-int/2addr v10, v14

    if-nez v10, :cond_d

    move-wide/from16 v10, p7

    invoke-interface {v15, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v12, 0x80000

    :goto_b
    or-int/2addr v1, v12

    goto :goto_c

    :cond_d
    move-wide/from16 v10, p7

    :goto_c
    const/high16 v12, 0xc00000

    and-int/2addr v12, v14

    if-nez v12, :cond_f

    move-wide/from16 v12, p9

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_d

    :cond_e
    const/high16 v16, 0x400000

    :goto_d
    or-int v1, v1, v16

    goto :goto_e

    :cond_f
    move-wide/from16 v12, p9

    :goto_e
    const/high16 v16, 0x6000000

    and-int v16, v14, v16

    if-nez v16, :cond_11

    move/from16 v4, p11

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x4000000

    goto :goto_f

    :cond_10
    const/high16 v16, 0x2000000

    :goto_f
    or-int v1, v1, v16

    goto :goto_10

    :cond_11
    move/from16 v4, p11

    :goto_10
    const/high16 v16, 0x30000000

    and-int v16, v14, v16

    if-nez v16, :cond_13

    move-object/from16 v0, p12

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x20000000

    goto :goto_11

    :cond_12
    const/high16 v17, 0x10000000

    :goto_11
    or-int v1, v1, v17

    goto :goto_12

    :cond_13
    move-object/from16 v0, p12

    :goto_12
    const v17, 0x12492493

    and-int v0, v1, v17

    const v3, 0x12492492

    if-ne v0, v3, :cond_15

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_13

    .line 2134
    :cond_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_14

    .line 2052
    :cond_15
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, -0x1

    const-string v3, "androidx.compose.material3.ChipContent (Chip.kt:2051)"

    const v4, -0x2ea9c614

    invoke-static {v4, v1, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2054
    :cond_16
    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/compose/runtime/ProvidedValue;

    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v0, v4

    .line 2055
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    .line 2054
    nop

    .line 2056
    new-instance v16, Landroidx/compose/material3/ChipKt$ChipContent$1;

    move-object/from16 v24, p0

    move/from16 v17, p11

    move-object/from16 v18, p12

    move-object/from16 v20, v7

    move-object/from16 v19, v8

    move-object/from16 v21, v9

    move-wide/from16 v22, v10

    move-wide/from16 v25, v12

    invoke-direct/range {v16 .. v26}, Landroidx/compose/material3/ChipKt$ChipContent$1;-><init>(FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLkotlin/jvm/functions/Function2;J)V

    move-object/from16 v3, v16

    const/16 v7, 0x36

    const v8, 0x683c8eac

    invoke-static {v8, v4, v3, v15, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    sget v4, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v4, v4, 0x30

    .line 2053
    invoke-static {v0, v3, v15, v4}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 2134
    :cond_17
    :goto_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_18

    move-object v3, v0

    new-instance v0, Landroidx/compose/material3/ChipKt$ChipContent$2;

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v16, v1

    move-object/from16 p13, v15

    move-object/from16 v1, p0

    move-object v15, v3

    move-wide v3, v5

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .end local v1    # "$dirty":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v16, "$dirty":I
    .restart local p13    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$ChipContent$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;I)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_15

    .end local v16    # "$dirty":I
    .end local p13    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$dirty":I
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_18
    move/from16 v16, v1

    move-object/from16 p13, v15

    .end local v1    # "$dirty":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v16    # "$dirty":I
    .restart local p13    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_15
    return-void
.end method

.method public static final ElevatedAssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p7, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p8, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p9, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 296
    move/from16 v12, p12

    move/from16 v14, p14

    const v0, 0x5f0e902e

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)289@14186L5,290@14237L26,291@14316L29,300@14613L5,295@14445L541:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p12

    .local v1, "$dirty":I
    move/from16 v2, p13

    .local v2, "$dirty1":I
    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v14, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v3, v14, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v1, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v14, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v14, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move-object/from16 v15, p4

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move-object/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v4, p5

    goto :goto_b

    :cond_f
    and-int v17, v12, v17

    if-nez v17, :cond_11

    move-object/from16 v4, p5

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v1, v1, v17

    goto :goto_b

    :cond_11
    move-object/from16 v4, p5

    :goto_b
    const/high16 v17, 0x180000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    and-int/lit8 v17, v14, 0x40

    if-nez v17, :cond_12

    move-object/from16 v0, p6

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v0, p6

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v1, v1, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v18, 0xc00000

    and-int v18, v12, v18

    if-nez v18, :cond_17

    and-int/lit16 v5, v14, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v1, v1, v19

    goto :goto_f

    :cond_17
    move-object/from16 v5, p7

    :goto_f
    const/high16 v19, 0x6000000

    and-int v19, v12, v19

    if-nez v19, :cond_1a

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v19, 0x2000000

    :goto_10
    or-int v1, v1, v19

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    and-int/lit16 v2, v14, 0x200

    const/high16 v20, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v20

    move/from16 v20, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v20, v12, v20

    if-nez v20, :cond_1d

    move/from16 v20, v2

    move-object/from16 v2, p9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v1, v1, v21

    goto :goto_13

    :cond_1d
    move/from16 v20, v2

    move-object/from16 v2, p9

    :goto_13
    and-int/lit16 v2, v14, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v19, v19, 0x6

    move/from16 v21, v2

    goto :goto_15

    :cond_1e
    and-int/lit8 v21, p13, 0x6

    if-nez v21, :cond_20

    move/from16 v21, v2

    move-object/from16 v2, p10

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1f

    const/16 v22, 0x4

    goto :goto_14

    :cond_1f
    const/16 v22, 0x2

    :goto_14
    or-int v19, v19, v22

    goto :goto_15

    :cond_20
    move/from16 v21, v2

    move-object/from16 v2, p10

    :goto_15
    move/from16 v2, v19

    .end local v19    # "$dirty1":I
    .restart local v2    # "$dirty1":I
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 p11, v1

    .end local v1    # "$dirty":I
    .local p11, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_22

    and-int/lit8 v0, v2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_16

    .line 312
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move v0, v2

    move-object v3, v6

    move-object/from16 v31, v8

    move-object v6, v4

    move-object v8, v5

    move v4, v9

    move-object v5, v15

    move-object/from16 v9, p8

    move/from16 v15, p11

    goto/16 :goto_21

    .line 296
    :cond_22
    :goto_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const v18, -0xe000001

    const v1, -0x1c00001

    const v19, -0x380001

    move/from16 v22, v2

    .end local v2    # "$dirty1":I
    .local v22, "$dirty1":I
    const/4 v2, 0x6

    if-eqz v0, :cond_27

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 294
    :cond_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_24

    and-int v0, p11, v19

    .end local p11    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_17

    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_24
    move/from16 v0, p11

    .end local p11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_17
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_25

    and-int/2addr v0, v1

    :cond_25
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_26

    and-int v0, v0, v18

    :cond_26
    move-object/from16 v24, p6

    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v30, p10

    move v1, v0

    move v11, v2

    move-object/from16 v23, v4

    move/from16 v0, v22

    move-object/from16 v22, v15

    move-object v15, v6

    goto/16 :goto_20

    .line 296
    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_27
    :goto_18
    if-eqz v3, :cond_28

    .line 286
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_19

    .line 296
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_28
    move-object v0, v6

    .line 286
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    if-eqz v7, :cond_29

    .line 287
    const/4 v3, 0x1

    move/from16 v23, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1a

    .line 286
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_29
    move/from16 v23, v9

    .line 287
    .end local p3    # "enabled":Z
    .local v23, "enabled":Z
    :goto_1a
    if-eqz v10, :cond_2a

    .line 288
    const/4 v3, 0x0

    move-object v15, v3

    .end local p4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v15, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2a
    if-eqz v16, :cond_2b

    .line 289
    const/4 v3, 0x0

    move-object/from16 v16, v3

    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1b

    .line 288
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2b
    move-object/from16 v16, v4

    .line 289
    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v16, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1b
    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_2c

    .line 290
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, p11, v19

    move-object/from16 v19, v3

    .end local p11    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_1c

    .line 289
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p11    # "$dirty":I
    :cond_2c
    move-object/from16 v19, p6

    move/from16 v4, p11

    .line 290
    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p11    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1c
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_2d

    .line 291
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v24, v3

    move/from16 v25, v4

    goto :goto_1d

    .line 290
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p7    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2d
    move-object/from16 v24, v5

    move/from16 v25, v4

    .line 291
    .end local v4    # "$dirty":I
    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "colors":Landroidx/compose/material3/ChipColors;
    .local v25, "$dirty":I
    :goto_1d
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_2e

    .line 292
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v22

    move/from16 v11, v26

    .end local v22    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v25, v25, v18

    goto :goto_1e

    .line 291
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v22    # "$dirty1":I
    .restart local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2e
    move-object/from16 p2, v0

    move v11, v2

    move/from16 v0, v22

    .end local v22    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v1, p8

    .line 292
    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    :goto_1e
    if-eqz v20, :cond_2f

    .line 293
    const/4 v2, 0x0

    .end local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v2, "border":Landroidx/compose/foundation/BorderStroke;
    goto :goto_1f

    .line 292
    .end local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_2f
    move-object/from16 v2, p9

    .line 293
    .end local p9    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_1f
    if-eqz v21, :cond_30

    .line 294
    const/4 v3, 0x0

    move-object/from16 v26, v1

    move-object/from16 v27, v2

    move-object/from16 v30, v3

    move-object/from16 v22, v15

    move/from16 v9, v23

    move-object/from16 v5, v24

    move/from16 v1, v25

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_20

    .line 293
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_30
    move-object/from16 v30, p10

    move-object/from16 v26, v1

    move-object/from16 v27, v2

    move-object/from16 v22, v15

    move/from16 v9, v23

    move-object/from16 v5, v24

    move/from16 v1, v25

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    .line 294
    .end local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v16    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "$dirty":I
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v5, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "enabled":Z
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v23, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v27, "border":Landroidx/compose/foundation/BorderStroke;
    .local v30, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_31

    .line 296
    const-string v2, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)"

    const v3, 0x5f0e902e

    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 301
    :cond_31
    sget-object v2, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v2

    invoke-static {v2, v8, v11}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 302
    invoke-virtual {v5, v9}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v20

    .line 307
    sget-object v2, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v28

    .line 308
    sget-object v29, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 297
    nop

    .line 298
    nop

    .line 299
    nop

    .line 300
    nop

    .line 301
    nop

    .line 302
    nop

    .line 303
    nop

    .line 304
    nop

    .line 309
    nop

    .line 306
    nop

    .line 305
    nop

    .line 310
    nop

    .line 307
    nop

    .line 308
    nop

    .line 311
    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0x380000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int v32, v2, v3

    shr-int/lit8 v2, v1, 0x18

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0xd80

    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0xc

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v33, v2, v3

    .line 296
    move-object/from16 v16, p0

    move-object/from16 v25, v5

    move-object/from16 v31, v8

    move/from16 v17, v9

    move-object/from16 v18, v13

    .end local v5    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v9    # "enabled":Z
    .local v17, "enabled":Z
    .local v25, "colors":Landroidx/compose/material3/ChipColors;
    .local v31, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v33}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_32

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 312
    :cond_32
    move-object v3, v15

    move/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move-object/from16 v11, v30

    move v15, v1

    .end local v1    # "$dirty":I
    .end local v17    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v23    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v26    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v27    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v30    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v6, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v10, "border":Landroidx/compose/foundation/BorderStroke;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "$dirty":I
    :goto_21
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_33

    move/from16 v22, v0

    .end local v0    # "$dirty1":I
    .local v22, "$dirty1":I
    new-instance v0, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$1;

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p0

    .end local v15    # "$dirty":I
    .local p2, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_22

    .end local v22    # "$dirty1":I
    .end local p2    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_33
    move/from16 v22, v0

    move/from16 p2, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v22    # "$dirty1":I
    .restart local p2    # "$dirty":I
    :goto_22
    return-void
.end method

.method public static final synthetic ElevatedAssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p7, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p8, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p9, "border"    # Landroidx/compose/material3/ChipBorder;
    .param p10, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource"
            imports = {}
        .end subannotation
    .end annotation

    .line 382
    move/from16 v12, p12

    move/from16 v14, p14

    const v0, 0x4d3d05c2    # 1.9820445E8f

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)375@18287L5,376@18338L26,377@18417L29,379@18530L39,386@18746L5,381@18578L571:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p12

    .local v1, "$dirty":I
    move/from16 v2, p13

    .local v2, "$dirty1":I
    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v14, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v3, v14, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v1, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v7, v14, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v14, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_e

    move-object/from16 v15, p4

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move-object/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v4, p5

    goto :goto_b

    :cond_f
    and-int v17, v12, v17

    if-nez v17, :cond_11

    move-object/from16 v4, p5

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v1, v1, v17

    goto :goto_b

    :cond_11
    move-object/from16 v4, p5

    :goto_b
    const/high16 v17, 0x180000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    and-int/lit8 v17, v14, 0x40

    if-nez v17, :cond_12

    move-object/from16 v0, p6

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v0, p6

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v1, v1, v18

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    const/high16 v18, 0xc00000

    and-int v18, v12, v18

    if-nez v18, :cond_17

    and-int/lit16 v5, v14, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v1, v1, v19

    goto :goto_f

    :cond_17
    move-object/from16 v5, p7

    :goto_f
    const/high16 v19, 0x6000000

    and-int v19, v12, v19

    if-nez v19, :cond_1a

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v19, 0x2000000

    :goto_10
    or-int v1, v1, v19

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    and-int/lit16 v2, v14, 0x200

    const/high16 v20, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v20

    move/from16 v20, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v20, v12, v20

    if-nez v20, :cond_1d

    move/from16 v20, v2

    move-object/from16 v2, p9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v1, v1, v21

    goto :goto_13

    :cond_1d
    move/from16 v20, v2

    move-object/from16 v2, p9

    :goto_13
    and-int/lit16 v2, v14, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v19, v19, 0x6

    move/from16 v21, v2

    goto :goto_15

    :cond_1e
    and-int/lit8 v21, p13, 0x6

    if-nez v21, :cond_20

    move/from16 v21, v2

    move-object/from16 v2, p10

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1f

    const/16 v22, 0x4

    goto :goto_14

    :cond_1f
    const/16 v22, 0x2

    :goto_14
    or-int v19, v19, v22

    goto :goto_15

    :cond_20
    move/from16 v21, v2

    move-object/from16 v2, p10

    :goto_15
    move/from16 v2, v19

    .end local v19    # "$dirty1":I
    .restart local v2    # "$dirty1":I
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 p11, v1

    .end local v1    # "$dirty":I
    .local p11, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_22

    and-int/lit8 v0, v2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_22

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_16

    .line 398
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move v0, v2

    move-object v3, v6

    move-object/from16 v31, v8

    move-object v6, v4

    move-object v8, v5

    move v4, v9

    move-object v5, v15

    move-object/from16 v9, p8

    move/from16 v15, p11

    goto/16 :goto_24

    .line 382
    :cond_22
    :goto_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const v18, -0xe000001

    const v1, -0x1c00001

    const v19, -0x380001

    move/from16 v22, v2

    .end local v2    # "$dirty1":I
    .local v22, "$dirty1":I
    const/4 v2, 0x6

    if-eqz v0, :cond_27

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_18

    .line 380
    :cond_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_24

    and-int v0, p11, v19

    .end local p11    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_17

    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_24
    move/from16 v0, p11

    .end local p11    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_17
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_25

    and-int/2addr v0, v1

    :cond_25
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_26

    and-int v0, v0, v18

    :cond_26
    move-object/from16 v24, p6

    move-object/from16 v26, p8

    move-object/from16 v30, p10

    move v1, v0

    move v11, v2

    move-object/from16 v23, v4

    move/from16 v0, v22

    move-object/from16 v2, p9

    move-object/from16 v22, v15

    move-object v15, v6

    goto/16 :goto_21

    .line 382
    .end local v0    # "$dirty":I
    .restart local p11    # "$dirty":I
    :cond_27
    :goto_18
    if-eqz v3, :cond_28

    .line 372
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_19

    .line 382
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_28
    move-object v0, v6

    .line 372
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_19
    if-eqz v7, :cond_29

    .line 373
    const/4 v3, 0x1

    move/from16 v23, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1a

    .line 372
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_29
    move/from16 v23, v9

    .line 373
    .end local p3    # "enabled":Z
    .local v23, "enabled":Z
    :goto_1a
    if-eqz v10, :cond_2a

    .line 374
    const/4 v3, 0x0

    move-object v15, v3

    .end local p4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v15, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2a
    if-eqz v16, :cond_2b

    .line 375
    const/4 v3, 0x0

    move-object/from16 v16, v3

    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1b

    .line 374
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2b
    move-object/from16 v16, v4

    .line 375
    .end local p5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v16, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1b
    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_2c

    .line 376
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, p11, v19

    move-object/from16 v19, v3

    .end local p11    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_1c

    .line 375
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p11    # "$dirty":I
    :cond_2c
    move-object/from16 v19, p6

    move/from16 v4, p11

    .line 376
    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p11    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1c
    and-int/lit16 v3, v14, 0x80

    if-eqz v3, :cond_2d

    .line 377
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v24, v3

    move/from16 v25, v4

    goto :goto_1d

    .line 376
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p7    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2d
    move-object/from16 v24, v5

    move/from16 v25, v4

    .line 377
    .end local v4    # "$dirty":I
    .end local p7    # "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "colors":Landroidx/compose/material3/ChipColors;
    .local v25, "$dirty":I
    :goto_1d
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_2e

    .line 378
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v22

    move/from16 v11, v26

    .end local v22    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v25, v25, v18

    goto :goto_1e

    .line 377
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v22    # "$dirty1":I
    .restart local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2e
    move-object/from16 p2, v0

    move v11, v2

    move/from16 v0, v22

    .end local v22    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v1, p8

    .line 378
    .end local p8    # "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    :goto_1e
    if-eqz v20, :cond_2f

    .line 379
    const/4 v2, 0x0

    .end local p9    # "border":Landroidx/compose/material3/ChipBorder;
    .local v2, "border":Landroidx/compose/material3/ChipBorder;
    goto :goto_1f

    .line 378
    .end local v2    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local p9    # "border":Landroidx/compose/material3/ChipBorder;
    :cond_2f
    move-object/from16 v2, p9

    .line 379
    .end local p9    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local v2    # "border":Landroidx/compose/material3/ChipBorder;
    :goto_1f
    if-eqz v21, :cond_31

    .line 380
    const v3, 0x5c817ca9

    const-string v4, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v8, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    move-object v4, v8

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 2794
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 2795
    .local v7, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_30

    .line 2796
    const/4 v9, 0x0

    .line 380
    .local v9, "$i$a$-cache-ChipKt$ElevatedAssistChip$2":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v9

    .line 2796
    .end local v9    # "$i$a$-cache-ChipKt$ElevatedAssistChip$2":I
    nop

    .line 2797
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2798
    nop

    .end local v9    # "value$iv":Ljava/lang/Object;
    goto :goto_20

    .line 2799
    :cond_30
    move-object v9, v6

    .line 2795
    :goto_20
    nop

    .line 2794
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 380
    .end local v3    # "invalid$iv":Z
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    move-object v3, v9

    check-cast v3, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v26, v1

    move-object/from16 v30, v3

    move-object/from16 v22, v15

    move/from16 v9, v23

    move-object/from16 v5, v24

    move/from16 v1, v25

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    goto :goto_21

    .line 379
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_31
    move-object/from16 v30, p10

    move-object/from16 v26, v1

    move-object/from16 v22, v15

    move/from16 v9, v23

    move-object/from16 v5, v24

    move/from16 v1, v25

    move-object/from16 v15, p2

    move-object/from16 v23, v16

    move-object/from16 v24, v19

    .line 380
    .end local v16    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "$dirty":I
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p10    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v5, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "enabled":Z
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v23, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v30, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_32

    .line 382
    const-string v3, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)"

    const v4, 0x4d3d05c2    # 1.9820445E8f

    invoke-static {v4, v1, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 387
    :cond_32
    sget-object v3, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v3, v8, v11}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v19

    .line 388
    invoke-virtual {v5, v9}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v20

    .line 393
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v28

    .line 394
    sget-object v29, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 396
    const v3, 0x5c81bfd7

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "395@19068L21"

    invoke-static {v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v2, :cond_33

    const/4 v3, 0x0

    goto :goto_22

    :cond_33
    shr-int/lit8 v3, v1, 0x9

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v4, v1, 0x18

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-virtual {v2, v9, v8, v3}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    :goto_22
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v3, :cond_34

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/BorderStroke;

    goto :goto_23

    :cond_34
    const/4 v3, 0x0

    :goto_23
    move-object/from16 v27, v3

    .line 383
    nop

    .line 384
    nop

    .line 385
    nop

    .line 386
    nop

    .line 387
    nop

    .line 388
    nop

    .line 389
    nop

    .line 390
    nop

    .line 395
    nop

    .line 392
    nop

    .line 391
    nop

    .line 396
    nop

    .line 393
    nop

    .line 394
    nop

    .line 397
    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0xe

    shl-int/lit8 v4, v1, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x380000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x1c00000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0xe000000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    const/high16 v6, 0x70000000

    and-int/2addr v4, v6

    or-int v32, v3, v4

    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0xd80

    shl-int/lit8 v4, v0, 0xc

    const v6, 0xe000

    and-int/2addr v4, v6

    or-int v33, v3, v4

    .line 382
    move-object/from16 v16, p0

    move-object/from16 v25, v5

    move-object/from16 v31, v8

    move/from16 v17, v9

    move-object/from16 v18, v13

    .end local v5    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v9    # "enabled":Z
    .local v17, "enabled":Z
    .local v25, "colors":Landroidx/compose/material3/ChipColors;
    .local v31, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v33}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 398
    :cond_35
    move-object v10, v2

    move-object v3, v15

    move/from16 v4, v17

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v11, v30

    move v15, v1

    .end local v1    # "$dirty":I
    .end local v2    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v17    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v23    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v25    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v26    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v30    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v6, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "colors":Landroidx/compose/material3/ChipColors;
    .local v9, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v10, "border":Landroidx/compose/material3/ChipBorder;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v15, "$dirty":I
    :goto_24
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_36

    move/from16 v22, v0

    .end local v0    # "$dirty1":I
    .local v22, "$dirty1":I
    new-instance v0, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$3;

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p0

    .end local v15    # "$dirty":I
    .local p2, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_25

    .end local v22    # "$dirty1":I
    .end local p2    # "$dirty":I
    .restart local v0    # "$dirty1":I
    .restart local v15    # "$dirty":I
    :cond_36
    move/from16 v22, v0

    move/from16 p2, v15

    .end local v0    # "$dirty1":I
    .end local v15    # "$dirty":I
    .restart local v22    # "$dirty1":I
    .restart local p2    # "$dirty":I
    :goto_25
    return-void
.end method

.method public static final ElevatedFilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 36
    .param p0, "selected"    # Z
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "label"    # Lkotlin/jvm/functions/Function2;
    .param p3, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p4, "enabled"    # Z
    .param p5, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p8, "colors"    # Landroidx/compose/material3/SelectableChipColors;
    .param p9, "elevation"    # Landroidx/compose/material3/SelectableChipElevation;
    .param p10, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p11, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I
    .param p14, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 553
    move/from16 v13, p13

    move/from16 v15, p15

    const v0, -0x65b4f5d

    move-object/from16 v1, p12

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)546@26622L5,547@26683L26,548@26772L29,558@27108L5,552@26901L554:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p13

    .local v1, "$dirty":I
    move/from16 v2, p14

    .local v2, "$dirty1":I
    and-int/lit8 v3, v15, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0x6

    if-nez v3, :cond_2

    move/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v12, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x30

    if-nez v3, :cond_5

    move-object/from16 v12, p1

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v12, p1

    :goto_3
    and-int/lit8 v3, v15, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v14, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v13, 0x180

    if-nez v3, :cond_8

    move-object/from16 v14, p2

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v3, v15, 0x8

    if-eqz v3, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_b

    move-object/from16 v9, p3

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move-object/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v15, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move/from16 v4, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v4, v13, 0x6000

    if-nez v4, :cond_e

    move/from16 v4, p4

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move/from16 v4, p4

    :goto_9
    and-int/lit8 v16, v15, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v5, p5

    goto :goto_b

    :cond_f
    and-int v17, v13, v17

    if-nez v17, :cond_11

    move-object/from16 v5, p5

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v1, v1, v18

    goto :goto_b

    :cond_11
    move-object/from16 v5, p5

    :goto_b
    and-int/lit8 v18, v15, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v1, v1, v19

    move-object/from16 v6, p6

    goto :goto_d

    :cond_12
    and-int v19, v13, v19

    if-nez v19, :cond_14

    move-object/from16 v6, p6

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v1, v1, v20

    goto :goto_d

    :cond_14
    move-object/from16 v6, p6

    :goto_d
    const/high16 v20, 0xc00000

    and-int v21, v13, v20

    if-nez v21, :cond_17

    and-int/lit16 v7, v15, 0x80

    if-nez v7, :cond_15

    move-object/from16 v7, p7

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v7, p7

    :cond_16
    const/high16 v22, 0x400000

    :goto_e
    or-int v1, v1, v22

    goto :goto_f

    :cond_17
    move-object/from16 v7, p7

    :goto_f
    const/high16 v22, 0x6000000

    and-int v22, v13, v22

    if-nez v22, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v23, 0x2000000

    :goto_10
    or-int v1, v1, v23

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    const/high16 v23, 0x30000000

    and-int v23, v13, v23

    if-nez v23, :cond_1d

    and-int/lit16 v0, v15, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_12
    or-int v1, v1, v23

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    move/from16 v23, v2

    .end local v2    # "$dirty1":I
    .local v23, "$dirty1":I
    and-int/lit16 v2, v15, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v17, v23, 0x6

    move/from16 v24, v2

    move-object/from16 v2, p10

    .end local v23    # "$dirty1":I
    .local v17, "$dirty1":I
    :goto_14
    goto :goto_16

    .end local v17    # "$dirty1":I
    .restart local v23    # "$dirty1":I
    :cond_1e
    and-int/lit8 v24, p14, 0x6

    if-nez v24, :cond_20

    move/from16 v24, v2

    move-object/from16 v2, p10

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1f

    const/16 v17, 0x4

    goto :goto_15

    :cond_1f
    const/16 v17, 0x2

    :goto_15
    or-int v17, v23, v17

    goto :goto_14

    :cond_20
    move/from16 v24, v2

    move-object/from16 v2, p10

    move/from16 v17, v23

    .end local v23    # "$dirty1":I
    .restart local v17    # "$dirty1":I
    :goto_16
    and-int/lit16 v2, v15, 0x800

    if-eqz v2, :cond_21

    or-int/lit8 v17, v17, 0x30

    move/from16 v23, v2

    goto :goto_18

    :cond_21
    and-int/lit8 v23, p14, 0x30

    if-nez v23, :cond_23

    move/from16 v23, v2

    move-object/from16 v2, p11

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_22

    const/16 v19, 0x20

    goto :goto_17

    :cond_22
    const/16 v19, 0x10

    :goto_17
    or-int v17, v17, v19

    goto :goto_18

    :cond_23
    move/from16 v23, v2

    move-object/from16 v2, p11

    :goto_18
    move/from16 v2, v17

    .end local v17    # "$dirty1":I
    .restart local v2    # "$dirty1":I
    const v17, 0x12492493

    and-int v0, v1, v17

    move/from16 p12, v1

    .end local v1    # "$dirty":I
    .local p12, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_25

    and-int/lit8 v0, v2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_25

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_19

    .line 570
    :cond_24
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p12

    move v0, v2

    move-object/from16 v32, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move v5, v4

    move-object v4, v9

    move-object/from16 v9, p8

    goto/16 :goto_25

    .line 553
    :cond_25
    :goto_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v13, 0x1

    const v1, -0xe000001

    const v17, -0x1c00001

    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    const/4 v2, 0x6

    if-eqz v0, :cond_2a

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_1b

    .line 551
    :cond_26
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_27

    and-int v0, p12, v17

    .end local p12    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_1a

    .end local v0    # "$dirty":I
    .restart local p12    # "$dirty":I
    :cond_27
    move/from16 v0, p12

    .end local p12    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_1a
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_28

    and-int/2addr v0, v1

    :cond_28
    and-int/lit16 v1, v15, 0x200

    if-eqz v1, :cond_29

    const v1, -0x70000001

    and-int/2addr v0, v1

    :cond_29
    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v31, p11

    move v1, v0

    move v11, v2

    move-object/from16 v22, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v17, v9

    move/from16 v0, v19

    const v2, -0x65b4f5d

    move/from16 v19, v4

    goto/16 :goto_24

    .line 553
    .end local v0    # "$dirty":I
    .restart local p12    # "$dirty":I
    :cond_2a
    :goto_1b
    if-eqz v3, :cond_2b

    .line 543
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_1c

    .line 553
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2b
    move-object v0, v9

    .line 543
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1c
    if-eqz v10, :cond_2c

    .line 544
    const/4 v3, 0x1

    move/from16 v21, v3

    .end local p4    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1d

    .line 543
    .end local v3    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_2c
    move/from16 v21, v4

    .line 544
    .end local p4    # "enabled":Z
    .local v21, "enabled":Z
    :goto_1d
    if-eqz v16, :cond_2d

    .line 545
    const/4 v3, 0x0

    move-object/from16 v16, v3

    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1e

    .line 544
    .end local v3    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2d
    move-object/from16 v16, v5

    .line 545
    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v16, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1e
    if-eqz v18, :cond_2e

    .line 546
    const/4 v3, 0x0

    move-object/from16 v18, v3

    .end local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1f

    .line 545
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2e
    move-object/from16 v18, v6

    .line 546
    .end local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v18, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1f
    and-int/lit16 v3, v15, 0x80

    if-eqz v3, :cond_2f

    .line 547
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/FilterChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, p12, v17

    move-object/from16 v17, v3

    .end local p12    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_20

    .line 546
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p12    # "$dirty":I
    :cond_2f
    move/from16 v4, p12

    move-object/from16 v17, v7

    .line 547
    .end local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p12    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v17, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_20
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_30

    .line 548
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/FilterChipDefaults;->elevatedFilterChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v3

    .end local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v3, "colors":Landroidx/compose/material3/SelectableChipColors;
    and-int/2addr v4, v1

    move-object/from16 v25, v3

    move/from16 v26, v4

    goto :goto_21

    .line 547
    .end local v3    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .restart local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    :cond_30
    move-object/from16 v25, p8

    move/from16 v26, v4

    .line 548
    .end local v4    # "$dirty":I
    .end local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v25, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v26, "$dirty":I
    :goto_21
    and-int/lit16 v1, v15, 0x200

    if-eqz v1, :cond_31

    .line 549
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v27, v7

    const/4 v7, 0x0

    move-object/from16 p3, v0

    move/from16 v0, v19

    move/from16 v11, v27

    .end local v19    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/FilterChipDefaults;->elevatedFilterChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v1

    .end local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    const v2, -0x70000001

    and-int v26, v26, v2

    goto :goto_22

    .line 548
    .end local v1    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v19    # "$dirty1":I
    .restart local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    :cond_31
    move-object/from16 p3, v0

    move v11, v2

    move/from16 v0, v19

    .end local v19    # "$dirty1":I
    .local v0, "$dirty1":I
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v1, p9

    .line 549
    .end local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .restart local v1    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    :goto_22
    if-eqz v24, :cond_32

    .line 550
    const/4 v2, 0x0

    .end local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v2, "border":Landroidx/compose/foundation/BorderStroke;
    goto :goto_23

    .line 549
    .end local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_32
    move-object/from16 v2, p10

    .line 550
    .end local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_23
    if-eqz v23, :cond_33

    .line 551
    const/4 v3, 0x0

    move-object/from16 v27, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v22, v16

    move-object/from16 v24, v18

    move/from16 v19, v21

    move/from16 v1, v26

    const v2, -0x65b4f5d

    move-object/from16 v26, v25

    move-object/from16 v25, v17

    move-object/from16 v17, p3

    .end local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_24

    .line 550
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_33
    move-object/from16 v31, p11

    move-object/from16 v27, v1

    move-object/from16 v28, v2

    move-object/from16 v22, v16

    move-object/from16 v24, v18

    move/from16 v19, v21

    move/from16 v1, v26

    const v2, -0x65b4f5d

    move-object/from16 v26, v25

    move-object/from16 v25, v17

    move-object/from16 v17, p3

    .line 551
    .end local v2    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v16    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v18    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v21    # "enabled":Z
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v17, "modifier":Landroidx/compose/ui/Modifier;
    .local v19, "enabled":Z
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v25, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v27, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v28, "border":Landroidx/compose/foundation/BorderStroke;
    .local v31, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_24
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_34

    .line 553
    const-string v3, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)"

    invoke-static {v2, v1, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 559
    :cond_34
    sget-object v2, Landroidx/compose/material3/tokens/FilterChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilterChipTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/FilterChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v2

    invoke-static {v2, v8, v11}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 565
    sget-object v2, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/FilterChipDefaults;->getHeight-D9Ej5fM()F

    move-result v29

    .line 566
    sget-object v30, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 554
    nop

    .line 555
    nop

    .line 556
    nop

    .line 557
    nop

    .line 558
    nop

    .line 559
    nop

    .line 560
    nop

    .line 561
    nop

    .line 562
    nop

    .line 567
    nop

    .line 564
    nop

    .line 563
    nop

    .line 568
    nop

    .line 565
    nop

    .line 566
    nop

    .line 569
    and-int/lit8 v2, v1, 0xe

    or-int v2, v2, v20

    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/high16 v3, 0x380000

    shl-int/lit8 v4, v1, 0x3

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int v33, v2, v3

    shr-int/lit8 v2, v1, 0x18

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6c00

    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0xc

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int v34, v2, v3

    .line 553
    const/16 v23, 0x0

    move/from16 v16, p0

    move-object/from16 v32, v8

    move-object/from16 v18, v12

    move-object/from16 v20, v14

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v32, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v34}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 570
    :cond_35
    move/from16 v16, v1

    move-object/from16 v4, v17

    move/from16 v5, v19

    move-object/from16 v6, v22

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move-object/from16 v11, v28

    move-object/from16 v12, v31

    .end local v1    # "$dirty":I
    .end local v17    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v19    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v25    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v26    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .end local v27    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local v28    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v31    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "enabled":Z
    .local v6, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v9, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v10, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v11, "border":Landroidx/compose/foundation/BorderStroke;
    .local v12, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v16, "$dirty":I
    :goto_25
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_36

    move/from16 v19, v0

    .end local v0    # "$dirty1":I
    .local v19, "$dirty1":I
    new-instance v0, Landroidx/compose/material3/ChipKt$ElevatedFilterChip$1;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v14, p14

    move-object/from16 v35, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/ChipKt$ElevatedFilterChip$1;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_26

    .end local v19    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    :cond_36
    move/from16 v19, v0

    .end local v0    # "$dirty1":I
    .restart local v19    # "$dirty1":I
    :goto_26
    return-void
.end method

.method public static final ElevatedSuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "icon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p7, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p8, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p9, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 904
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, -0x30ce6e19

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)897@43055L5,898@43110L30,899@43197L33,908@43503L5,903@43331L538:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p11

    .local v1, "$dirty":I
    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v14, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v14, p0

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p0

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v3, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move-object/from16 v3, p2

    :goto_5
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    goto :goto_7

    :cond_b
    move/from16 v5, p3

    :goto_7
    and-int/lit8 v6, v12, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v7, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v7, v11, 0x6000

    if-nez v7, :cond_e

    move-object/from16 v7, p4

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v1, v9

    goto :goto_9

    :cond_e
    move-object/from16 v7, p4

    :goto_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    if-nez v9, :cond_11

    and-int/lit8 v9, v12, 0x20

    if-nez v9, :cond_f

    move-object/from16 v9, p5

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v9, p5

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v1, v10

    goto :goto_b

    :cond_11
    move-object/from16 v9, p5

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v11

    if-nez v10, :cond_14

    and-int/lit8 v10, v12, 0x40

    if-nez v10, :cond_12

    move-object/from16 v10, p6

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    const/high16 v15, 0xc00000

    and-int v16, v11, v15

    if-nez v16, :cond_17

    move/from16 p10, v15

    and-int/lit16 v15, v12, 0x80

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v15, p7

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v1, v1, v16

    goto :goto_f

    :cond_17
    move/from16 p10, v15

    move-object/from16 v15, p7

    :goto_f
    and-int/lit16 v0, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_18

    or-int v1, v1, v17

    move/from16 v17, v2

    move-object/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v17, v11, v17

    if-nez v17, :cond_1a

    move/from16 v17, v2

    move-object/from16 v2, p8

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    goto :goto_11

    :cond_1a
    move/from16 v17, v2

    move-object/from16 v2, p8

    :goto_11
    and-int/lit16 v2, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v18

    move/from16 v18, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v18, v11, v18

    if-nez v18, :cond_1d

    move/from16 v18, v2

    move-object/from16 v2, p9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move/from16 v18, v2

    move-object/from16 v2, p9

    :goto_13
    const v19, 0x12492493

    move/from16 v20, v0

    and-int v0, v1, v19

    move/from16 v19, v1

    .end local v1    # "$dirty":I
    .local v19, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_14

    .line 920
    :cond_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v4, v5

    move-object v5, v7

    move-object/from16 v29, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v15

    move-object/from16 v9, p8

    move-object v10, v2

    goto/16 :goto_1e

    .line 904
    :cond_1f
    :goto_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v11, 0x1

    const v21, -0x1c00001

    const v1, -0x380001

    const v22, -0x70001

    const/4 v2, 0x6

    if-eqz v0, :cond_24

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_15

    .line 902
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v0, v19, v22

    move/from16 v19, v0

    :cond_21
    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_22

    and-int v19, v19, v1

    :cond_22
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_23

    and-int v0, v19, v21

    move-object/from16 v25, p8

    move-object/from16 v28, p9

    move v1, v0

    move v0, v2

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move v15, v5

    .end local v19    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1d

    .end local v0    # "$dirty":I
    .restart local v19    # "$dirty":I
    :cond_23
    move-object/from16 v25, p8

    move-object/from16 v28, p9

    move v0, v2

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move/from16 v1, v19

    move v15, v5

    goto/16 :goto_1d

    .line 904
    :cond_24
    :goto_15
    if-eqz v17, :cond_25

    .line 895
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 904
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_25
    move-object v0, v3

    .line 895
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    if-eqz v4, :cond_26

    .line 896
    const/4 v3, 0x1

    move/from16 v17, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_17

    .line 895
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_26
    move/from16 v17, v5

    .line 896
    .end local p3    # "enabled":Z
    .local v17, "enabled":Z
    :goto_17
    if-eqz v6, :cond_27

    .line 897
    const/4 v3, 0x0

    move-object/from16 v23, v3

    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v3, "icon":Lkotlin/jvm/functions/Function2;
    goto :goto_18

    .line 896
    .end local v3    # "icon":Lkotlin/jvm/functions/Function2;
    .restart local p4    # "icon":Lkotlin/jvm/functions/Function2;
    :cond_27
    move-object/from16 v23, v7

    .line 897
    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v23, "icon":Lkotlin/jvm/functions/Function2;
    :goto_18
    and-int/lit8 v3, v12, 0x20

    if-eqz v3, :cond_28

    .line 898
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, v19, v22

    move-object/from16 v19, v3

    .end local v19    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_19

    .line 897
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local v19    # "$dirty":I
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_28
    move/from16 v4, v19

    move-object/from16 v19, v9

    .line 898
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_19
    and-int/lit8 v3, v12, 0x40

    if-eqz v3, :cond_29

    .line 899
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v22, v3

    move/from16 v24, v4

    goto :goto_1a

    .line 898
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p6    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_29
    move-object/from16 v22, v10

    move/from16 v24, v4

    .line 899
    .end local v4    # "$dirty":I
    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v22, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1a
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_2a

    .line 900
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v25, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v25

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v24, v24, v21

    move-object v15, v1

    goto :goto_1b

    .line 899
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2a
    move-object/from16 p2, v0

    move v0, v2

    .line 900
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v15, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1b
    if-eqz v20, :cond_2b

    .line 901
    const/4 v1, 0x0

    .end local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v1, "border":Landroidx/compose/foundation/BorderStroke;
    goto :goto_1c

    .line 900
    .end local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_2b
    move-object/from16 v1, p8

    .line 901
    .end local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_1c
    if-eqz v18, :cond_2c

    .line 902
    const/4 v2, 0x0

    move-object/from16 v3, p2

    move-object/from16 v25, v1

    move-object/from16 v28, v2

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v1, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_1d

    .line 901
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_2c
    move-object/from16 v3, p2

    move-object/from16 v28, p9

    move-object/from16 v25, v1

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v1, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    .line 902
    .end local v17    # "enabled":Z
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "icon":Lkotlin/jvm/functions/Function2;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "colors":Landroidx/compose/material3/ChipColors;
    .local v15, "enabled":Z
    .local v20, "icon":Lkotlin/jvm/functions/Function2;
    .local v22, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v24, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v25, "border":Landroidx/compose/foundation/BorderStroke;
    .local v28, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 904
    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)"

    const v5, -0x30ce6e19

    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 909
    :cond_2d
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v2

    invoke-static {v2, v8, v0}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    .line 910
    invoke-virtual {v10, v15}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v18

    .line 915
    sget-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    move-result v26

    .line 916
    sget-object v27, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 905
    nop

    .line 906
    nop

    .line 907
    nop

    .line 908
    nop

    .line 909
    nop

    .line 910
    nop

    .line 911
    nop

    .line 912
    nop

    .line 917
    nop

    .line 914
    nop

    .line 913
    nop

    .line 918
    nop

    .line 915
    nop

    .line 916
    nop

    .line 919
    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, p10

    shl-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shr-int/lit8 v2, v1, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    const/high16 v4, 0xe000000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    const/high16 v4, 0x70000000

    and-int/2addr v2, v4

    or-int v30, v0, v2

    shr-int/lit8 v0, v1, 0x15

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    shr-int/lit8 v2, v1, 0x15

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shr-int/lit8 v2, v1, 0xf

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int v31, v0, v2

    .line 904
    const/16 v21, 0x0

    move-object/from16 v29, v8

    move-object/from16 v23, v10

    move-object/from16 v16, v13

    move-object v13, v3

    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v10    # "colors":Landroidx/compose/material3/ChipColors;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v31}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 920
    :cond_2e
    move/from16 v19, v1

    move-object v3, v13

    move v4, v15

    move-object/from16 v5, v20

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, v28

    .end local v1    # "$dirty":I
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "enabled":Z
    .end local v20    # "icon":Lkotlin/jvm/functions/Function2;
    .end local v22    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v24    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v25    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v28    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "icon":Lkotlin/jvm/functions/Function2;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "colors":Landroidx/compose/material3/ChipColors;
    .local v8, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v9, "border":Landroidx/compose/foundation/BorderStroke;
    .local v10, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v19, "$dirty":I
    :goto_1e
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_2f

    new-instance v0, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2f
    return-void
.end method

.method public static final synthetic ElevatedSuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "icon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p7, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p8, "border"    # Landroidx/compose/material3/ChipBorder;
    .param p9, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource"
            imports = {}
        .end subannotation
    .end annotation

    .line 987
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, 0x637721bb

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)980@46960L5,981@47015L30,982@47102L33,984@47219L39,991@47440L5,986@47268L568:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p11

    .local v1, "$dirty":I
    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v14, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v14, p0

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p0

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v3, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move-object/from16 v3, p2

    :goto_5
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    goto :goto_7

    :cond_b
    move/from16 v5, p3

    :goto_7
    and-int/lit8 v6, v12, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v7, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v7, v11, 0x6000

    if-nez v7, :cond_e

    move-object/from16 v7, p4

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v1, v9

    goto :goto_9

    :cond_e
    move-object/from16 v7, p4

    :goto_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    if-nez v9, :cond_11

    and-int/lit8 v9, v12, 0x20

    if-nez v9, :cond_f

    move-object/from16 v9, p5

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v9, p5

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v1, v10

    goto :goto_b

    :cond_11
    move-object/from16 v9, p5

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v11

    if-nez v10, :cond_14

    and-int/lit8 v10, v12, 0x40

    if-nez v10, :cond_12

    move-object/from16 v10, p6

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    const/high16 v15, 0xc00000

    and-int v16, v11, v15

    if-nez v16, :cond_17

    move/from16 p10, v15

    and-int/lit16 v15, v12, 0x80

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v15, p7

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v1, v1, v16

    goto :goto_f

    :cond_17
    move/from16 p10, v15

    move-object/from16 v15, p7

    :goto_f
    and-int/lit16 v0, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_18

    or-int v1, v1, v17

    move/from16 v17, v2

    move-object/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v17, v11, v17

    if-nez v17, :cond_1a

    move/from16 v17, v2

    move-object/from16 v2, p8

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    goto :goto_11

    :cond_1a
    move/from16 v17, v2

    move-object/from16 v2, p8

    :goto_11
    and-int/lit16 v2, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v18

    move/from16 v18, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v18, v11, v18

    if-nez v18, :cond_1d

    move/from16 v18, v2

    move-object/from16 v2, p9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move/from16 v18, v2

    move-object/from16 v2, p9

    :goto_13
    const v19, 0x12492493

    move/from16 v20, v0

    and-int v0, v1, v19

    move/from16 v19, v1

    .end local v1    # "$dirty":I
    .local v19, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_14

    .line 1003
    :cond_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v4, v5

    move-object v5, v7

    move-object/from16 v29, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v15

    move-object/from16 v9, p8

    move-object v10, v2

    goto/16 :goto_21

    .line 987
    :cond_1f
    :goto_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v11, 0x1

    const v21, -0x1c00001

    const v1, -0x380001

    const v22, -0x70001

    const/4 v2, 0x6

    if-eqz v0, :cond_24

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_15

    .line 985
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v0, v19, v22

    move/from16 v19, v0

    :cond_21
    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_22

    and-int v19, v19, v1

    :cond_22
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_23

    and-int v0, v19, v21

    move v1, v2

    move v2, v0

    move v0, v1

    move-object/from16 v1, p8

    move-object/from16 v28, p9

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move v15, v5

    .end local v19    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1e

    .end local v0    # "$dirty":I
    .restart local v19    # "$dirty":I
    :cond_23
    move-object/from16 v1, p8

    move-object/from16 v28, p9

    move v0, v2

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move/from16 v2, v19

    move v15, v5

    goto/16 :goto_1e

    .line 987
    :cond_24
    :goto_15
    if-eqz v17, :cond_25

    .line 978
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 987
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_25
    move-object v0, v3

    .line 978
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    if-eqz v4, :cond_26

    .line 979
    const/4 v3, 0x1

    move/from16 v17, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_17

    .line 978
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_26
    move/from16 v17, v5

    .line 979
    .end local p3    # "enabled":Z
    .local v17, "enabled":Z
    :goto_17
    if-eqz v6, :cond_27

    .line 980
    const/4 v3, 0x0

    move-object/from16 v23, v3

    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v3, "icon":Lkotlin/jvm/functions/Function2;
    goto :goto_18

    .line 979
    .end local v3    # "icon":Lkotlin/jvm/functions/Function2;
    .restart local p4    # "icon":Lkotlin/jvm/functions/Function2;
    :cond_27
    move-object/from16 v23, v7

    .line 980
    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v23, "icon":Lkotlin/jvm/functions/Function2;
    :goto_18
    and-int/lit8 v3, v12, 0x20

    if-eqz v3, :cond_28

    .line 981
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, v19, v22

    move-object/from16 v19, v3

    .end local v19    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_19

    .line 980
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local v19    # "$dirty":I
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_28
    move/from16 v4, v19

    move-object/from16 v19, v9

    .line 981
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_19
    and-int/lit8 v3, v12, 0x40

    if-eqz v3, :cond_29

    .line 982
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v22, v3

    move/from16 v24, v4

    goto :goto_1a

    .line 981
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p6    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_29
    move-object/from16 v22, v10

    move/from16 v24, v4

    .line 982
    .end local v4    # "$dirty":I
    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v22, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1a
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_2a

    .line 983
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v25, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v25

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v24, v24, v21

    move-object v15, v1

    goto :goto_1b

    .line 982
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2a
    move-object/from16 p2, v0

    move v0, v2

    .line 983
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v15, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1b
    if-eqz v20, :cond_2b

    .line 984
    const/4 v1, 0x0

    .end local p8    # "border":Landroidx/compose/material3/ChipBorder;
    .local v1, "border":Landroidx/compose/material3/ChipBorder;
    goto :goto_1c

    .line 983
    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local p8    # "border":Landroidx/compose/material3/ChipBorder;
    :cond_2b
    move-object/from16 v1, p8

    .line 984
    .end local p8    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local v1    # "border":Landroidx/compose/material3/ChipBorder;
    :goto_1c
    if-eqz v18, :cond_2d

    .line 985
    const v2, 0x7e7807a4

    const-string v3, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v8, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid$iv":Z
    move-object v3, v8

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 2806
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2807
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2c

    .line 2808
    const/4 v7, 0x0

    .line 985
    .local v7, "$i$a$-cache-ChipKt$ElevatedSuggestionChip$2":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v7

    .line 2808
    .end local v7    # "$i$a$-cache-ChipKt$ElevatedSuggestionChip$2":I
    nop

    .line 2809
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2810
    nop

    .end local v7    # "value$iv":Ljava/lang/Object;
    goto :goto_1d

    .line 2811
    :cond_2c
    move-object v7, v5

    .line 2807
    :goto_1d
    nop

    .line 2806
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 985
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    move-object v2, v7

    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v3, p2

    move-object/from16 v28, v2

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v2, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    goto :goto_1e

    .line 984
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_2d
    move-object/from16 v3, p2

    move-object/from16 v28, p9

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v2, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    .line 985
    .end local v17    # "enabled":Z
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "icon":Lkotlin/jvm/functions/Function2;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "$dirty":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "colors":Landroidx/compose/material3/ChipColors;
    .local v15, "enabled":Z
    .local v20, "icon":Lkotlin/jvm/functions/Function2;
    .local v22, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v24, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v28, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 987
    const/4 v4, -0x1

    const-string v5, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)"

    const v6, 0x637721bb

    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 992
    :cond_2e
    sget-object v4, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v4

    invoke-static {v4, v8, v0}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    .line 993
    invoke-virtual {v10, v15}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v18

    .line 998
    sget-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    move-result v26

    .line 999
    sget-object v27, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 1001
    const v0, 0x7e784a92

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "1000@47755L21"

    invoke-static {v8, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v1, :cond_2f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_2f
    shr-int/lit8 v0, v2, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v4, v2, 0x15

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    invoke-virtual {v1, v15, v8, v0}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    :goto_1f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v0, :cond_30

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    goto :goto_20

    :cond_30
    const/4 v0, 0x0

    :goto_20
    move-object/from16 v25, v0

    .line 988
    nop

    .line 989
    nop

    .line 990
    nop

    .line 991
    nop

    .line 992
    nop

    .line 993
    nop

    .line 994
    nop

    .line 995
    nop

    .line 1000
    nop

    .line 997
    nop

    .line 996
    nop

    .line 1001
    nop

    .line 998
    nop

    .line 999
    nop

    .line 1002
    shr-int/lit8 v0, v2, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, p10

    shl-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    shr-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v5, 0x380000

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x9

    const/high16 v5, 0xe000000

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    const/high16 v4, 0x70000000

    shl-int/lit8 v5, v2, 0x9

    and-int/2addr v4, v5

    or-int v30, v0, v4

    shr-int/lit8 v0, v2, 0x15

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    shr-int/lit8 v4, v2, 0xf

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int v31, v0, v4

    .line 987
    const/16 v21, 0x0

    move-object/from16 v29, v8

    move-object/from16 v23, v10

    move-object/from16 v16, v13

    move-object v13, v3

    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v10    # "colors":Landroidx/compose/material3/ChipColors;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v31}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1003
    :cond_31
    move-object v9, v1

    move/from16 v19, v2

    move-object v3, v13

    move v4, v15

    move-object/from16 v5, v20

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v10, v28

    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v2    # "$dirty":I
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "enabled":Z
    .end local v20    # "icon":Lkotlin/jvm/functions/Function2;
    .end local v22    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v24    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v28    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "icon":Lkotlin/jvm/functions/Function2;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "colors":Landroidx/compose/material3/ChipColors;
    .local v8, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v9, "border":Landroidx/compose/material3/ChipBorder;
    .local v10, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v19, "$dirty":I
    :goto_21
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_32

    new-instance v0, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_32
    return-void
.end method

.method public static final FilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 41
    .param p0, "selected"    # Z
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "label"    # Lkotlin/jvm/functions/Function2;
    .param p3, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p4, "enabled"    # Z
    .param p5, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p8, "colors"    # Landroidx/compose/material3/SelectableChipColors;
    .param p9, "elevation"    # Landroidx/compose/material3/SelectableChipElevation;
    .param p10, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p11, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I
    .param p14, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 469
    move/from16 v13, p13

    move/from16 v15, p15

    const v0, -0x660ad3d3

    move-object/from16 v1, p12

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)462@22511L5,463@22572L18,464@22653L21,465@22723L35,474@23031L5,468@22824L554:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p13

    .local v1, "$dirty":I
    move/from16 v2, p14

    .local v2, "$dirty1":I
    and-int/lit8 v3, v15, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v1, v1, 0x6

    move/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0x6

    if-nez v3, :cond_2

    move/from16 v11, p0

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_2
    move/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v12, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x30

    if-nez v3, :cond_5

    move-object/from16 v12, p1

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_5
    move-object/from16 v12, p1

    :goto_3
    and-int/lit8 v3, v15, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v14, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v13, 0x180

    if-nez v3, :cond_8

    move-object/from16 v14, p2

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v3, v15, 0x8

    if-eqz v3, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_b

    move-object/from16 v9, p3

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    goto :goto_7

    :cond_b
    move-object/from16 v9, p3

    :goto_7
    and-int/lit8 v10, v15, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move/from16 v4, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v4, v13, 0x6000

    if-nez v4, :cond_e

    move/from16 v4, p4

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    goto :goto_9

    :cond_e
    move/from16 v4, p4

    :goto_9
    and-int/lit8 v16, v15, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move-object/from16 v5, p5

    goto :goto_b

    :cond_f
    and-int v17, v13, v17

    if-nez v17, :cond_11

    move-object/from16 v5, p5

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v1, v1, v18

    goto :goto_b

    :cond_11
    move-object/from16 v5, p5

    :goto_b
    and-int/lit8 v18, v15, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v1, v1, v19

    move-object/from16 v6, p6

    goto :goto_d

    :cond_12
    and-int v19, v13, v19

    if-nez v19, :cond_14

    move-object/from16 v6, p6

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v1, v1, v20

    goto :goto_d

    :cond_14
    move-object/from16 v6, p6

    :goto_d
    const/high16 v32, 0xc00000

    and-int v20, v13, v32

    if-nez v20, :cond_17

    and-int/lit16 v7, v15, 0x80

    if-nez v7, :cond_15

    move-object/from16 v7, p7

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_16

    const/high16 v21, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v7, p7

    :cond_16
    const/high16 v21, 0x400000

    :goto_e
    or-int v1, v1, v21

    goto :goto_f

    :cond_17
    move-object/from16 v7, p7

    :goto_f
    const/high16 v21, 0x6000000

    and-int v21, v13, v21

    if-nez v21, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v21, 0x2000000

    :goto_10
    or-int v1, v1, v21

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    const/high16 v21, 0x30000000

    and-int v21, v13, v21

    if-nez v21, :cond_1d

    and-int/lit16 v0, v15, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_12
    or-int v1, v1, v21

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p9

    :goto_13
    and-int/lit8 v21, p14, 0x6

    if-nez v21, :cond_20

    and-int/lit16 v0, v15, 0x400

    if-nez v0, :cond_1e

    move-object/from16 v0, p10

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v17, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v0, p10

    :cond_1f
    const/16 v17, 0x2

    :goto_14
    or-int v2, v2, v17

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    :goto_15
    move/from16 p12, v2

    .end local v2    # "$dirty1":I
    .local p12, "$dirty1":I
    and-int/lit16 v2, v15, 0x800

    if-eqz v2, :cond_21

    or-int/lit8 v17, p12, 0x30

    move/from16 v34, v17

    move/from16 v17, v2

    move-object/from16 v2, p11

    .end local p12    # "$dirty1":I
    .local v17, "$dirty1":I
    goto :goto_17

    .end local v17    # "$dirty1":I
    .restart local p12    # "$dirty1":I
    :cond_21
    and-int/lit8 v17, p14, 0x30

    if-nez v17, :cond_23

    move/from16 v17, v2

    move-object/from16 v2, p11

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_22

    const/16 v19, 0x20

    goto :goto_16

    :cond_22
    const/16 v19, 0x10

    :goto_16
    or-int v19, p12, v19

    move/from16 v34, v19

    .end local p12    # "$dirty1":I
    .local v19, "$dirty1":I
    goto :goto_17

    .end local v19    # "$dirty1":I
    .restart local p12    # "$dirty1":I
    :cond_23
    move/from16 v17, v2

    move-object/from16 v2, p11

    move/from16 v34, p12

    .end local p12    # "$dirty1":I
    .local v34, "$dirty1":I
    :goto_17
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 p12, v1

    .end local v1    # "$dirty":I
    .local p12, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_25

    and-int/lit8 v0, v34, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_25

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_18

    .line 486
    :cond_24
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v16, p12

    move-object v12, v2

    move-object/from16 v32, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move v5, v4

    move-object v4, v9

    move-object/from16 v9, p8

    goto/16 :goto_24

    .line 469
    :cond_25
    :goto_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v13, 0x1

    const/4 v1, 0x6

    if-eqz v0, :cond_2b

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_26

    goto/16 :goto_1a

    .line 467
    :cond_26
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_27

    const v0, -0x1c00001

    and-int v0, p12, v0

    .end local p12    # "$dirty":I
    .local v0, "$dirty":I
    goto :goto_19

    .end local v0    # "$dirty":I
    .restart local p12    # "$dirty":I
    :cond_27
    move/from16 v0, p12

    .end local p12    # "$dirty":I
    .restart local v0    # "$dirty":I
    :goto_19
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_28

    const v3, -0xe000001

    and-int/2addr v0, v3

    :cond_28
    and-int/lit16 v3, v15, 0x200

    if-eqz v3, :cond_29

    const v3, -0x70000001

    and-int/2addr v0, v3

    :cond_29
    and-int/lit16 v3, v15, 0x400

    if-eqz v3, :cond_2a

    and-int/lit8 v3, v34, -0xf

    move/from16 v17, v1

    move v1, v0

    move/from16 v0, v17

    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v31, v2

    move/from16 v19, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v17, v9

    .end local v34    # "$dirty1":I
    .local v3, "$dirty1":I
    goto/16 :goto_23

    .end local v3    # "$dirty1":I
    .restart local v34    # "$dirty1":I
    :cond_2a
    move v3, v1

    move v1, v0

    move v0, v3

    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v31, v2

    move/from16 v19, v4

    move-object/from16 v22, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v17, v9

    move/from16 v3, v34

    goto/16 :goto_23

    .line 469
    .end local v0    # "$dirty":I
    .restart local p12    # "$dirty":I
    :cond_2b
    :goto_1a
    if-eqz v3, :cond_2c

    .line 459
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_1b

    .line 469
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2c
    move-object v0, v9

    .line 459
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1b
    if-eqz v10, :cond_2d

    .line 460
    const/4 v3, 0x1

    move/from16 v19, v3

    .end local p4    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_1c

    .line 459
    .end local v3    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_2d
    move/from16 v19, v4

    .line 460
    .end local p4    # "enabled":Z
    .local v19, "enabled":Z
    :goto_1c
    if-eqz v16, :cond_2e

    .line 461
    const/4 v3, 0x0

    move-object/from16 v35, v3

    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1d

    .line 460
    .end local v3    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2e
    move-object/from16 v35, v5

    .line 461
    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v35, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1d
    if-eqz v18, :cond_2f

    .line 462
    const/4 v3, 0x0

    move-object/from16 v36, v3

    .end local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1e

    .line 461
    .end local v3    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_2f
    move-object/from16 v36, v6

    .line 462
    .end local p6    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v36, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1e
    and-int/lit16 v3, v15, 0x80

    if-eqz v3, :cond_30

    .line 463
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v8, v1}, Landroidx/compose/material3/FilterChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    const v4, -0x1c00001

    and-int v4, p12, v4

    move-object/from16 v37, v3

    .end local p12    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_1f

    .line 462
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p12    # "$dirty":I
    :cond_30
    move/from16 v4, p12

    move-object/from16 v37, v7

    .line 463
    .end local p7    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p12    # "$dirty":I
    .restart local v4    # "$dirty":I
    .local v37, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1f
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_31

    .line 464
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v8, v1}, Landroidx/compose/material3/FilterChipDefaults;->filterChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v3

    .end local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v3, "colors":Landroidx/compose/material3/SelectableChipColors;
    const v5, -0xe000001

    and-int/2addr v4, v5

    move-object/from16 v38, v3

    move/from16 v16, v4

    goto :goto_20

    .line 463
    .end local v3    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .restart local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    :cond_31
    move-object/from16 v38, p8

    move/from16 v16, v4

    .line 464
    .end local v4    # "$dirty":I
    .end local p8    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v16, "$dirty":I
    .local v38, "colors":Landroidx/compose/material3/SelectableChipColors;
    :goto_20
    and-int/lit16 v3, v15, 0x200

    if-eqz v3, :cond_32

    .line 465
    move v3, v1

    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 p3, v0

    move/from16 v39, v17

    move/from16 v0, v18

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/FilterChipDefaults;->filterChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v1

    .end local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    const v2, -0x70000001

    and-int v16, v16, v2

    move/from16 v2, v16

    goto :goto_21

    .line 464
    .end local v1    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    :cond_32
    move-object/from16 p3, v0

    move v0, v1

    move/from16 v39, v17

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v1, p9

    move/from16 v2, v16

    .line 465
    .end local v16    # "$dirty":I
    .end local p9    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .restart local v1    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v2, "$dirty":I
    :goto_21
    and-int/lit16 v3, v15, 0x400

    if-eqz v3, :cond_33

    .line 466
    sget-object v16, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    shr-int/lit8 v3, v2, 0xc

    and-int/lit8 v3, v3, 0xe

    const/high16 v4, 0x6000000

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int v30, v3, v4

    const/16 v31, 0xfc

    move/from16 v17, v19

    .end local v19    # "enabled":Z
    .local v17, "enabled":Z
    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v8

    move/from16 v18, v11

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v16 .. v31}, Landroidx/compose/material3/FilterChipDefaults;->filterChipBorder-_7El2pE(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;

    move-result-object v3

    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v3, "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v8    # "$composer":Landroidx/compose/runtime/Composer;
    and-int/lit8 v34, v34, -0xf

    goto :goto_22

    .line 465
    .end local v3    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v17    # "enabled":Z
    .restart local v19    # "enabled":Z
    .restart local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_33
    move/from16 v17, v19

    .end local v19    # "enabled":Z
    .restart local v17    # "enabled":Z
    move-object/from16 v3, p10

    .line 466
    .end local p10    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v3    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_22
    if-eqz v39, :cond_34

    .line 467
    const/4 v4, 0x0

    move-object/from16 v27, v1

    move v1, v2

    move-object/from16 v28, v3

    move-object/from16 v31, v4

    move/from16 v19, v17

    move/from16 v3, v34

    move-object/from16 v22, v35

    move-object/from16 v24, v36

    move-object/from16 v25, v37

    move-object/from16 v26, v38

    move-object/from16 v17, p3

    .end local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v4, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_23

    .line 466
    .end local v4    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_34
    move-object/from16 v31, p11

    move-object/from16 v27, v1

    move v1, v2

    move-object/from16 v28, v3

    move/from16 v19, v17

    move/from16 v3, v34

    move-object/from16 v22, v35

    move-object/from16 v24, v36

    move-object/from16 v25, v37

    move-object/from16 v26, v38

    move-object/from16 v17, p3

    .line 467
    .end local v2    # "$dirty":I
    .end local v34    # "$dirty1":I
    .end local v35    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v36    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v37    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v38    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v3, "$dirty1":I
    .local v17, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v19    # "enabled":Z
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v25, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v27, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v28, "border":Landroidx/compose/foundation/BorderStroke;
    .local v31, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_35

    .line 469
    const-string v2, "androidx.compose.material3.FilterChip (Chip.kt:468)"

    const v4, -0x660ad3d3

    invoke-static {v4, v1, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 475
    :cond_35
    sget-object v2, Landroidx/compose/material3/tokens/FilterChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilterChipTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/FilterChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v2

    invoke-static {v2, v8, v0}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 481
    sget-object v0, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/FilterChipDefaults;->getHeight-D9Ej5fM()F

    move-result v29

    .line 482
    sget-object v30, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 470
    nop

    .line 471
    nop

    .line 472
    nop

    .line 473
    nop

    .line 474
    nop

    .line 475
    nop

    .line 476
    nop

    .line 477
    nop

    .line 478
    nop

    .line 483
    nop

    .line 480
    nop

    .line 479
    nop

    .line 484
    nop

    .line 481
    nop

    .line 482
    nop

    .line 485
    and-int/lit8 v0, v1, 0xe

    or-int v0, v0, v32

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shr-int/lit8 v2, v1, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x3

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    const/high16 v4, 0xe000000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    const/high16 v4, 0x70000000

    and-int/2addr v2, v4

    or-int v33, v0, v2

    shr-int/lit8 v0, v1, 0x18

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x6c00

    shr-int/lit8 v2, v1, 0x18

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shl-int/lit8 v2, v3, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shl-int/lit8 v2, v3, 0xc

    const/high16 v4, 0x70000

    and-int/2addr v2, v4

    or-int v34, v0, v2

    .line 469
    const/16 v23, 0x0

    move/from16 v16, p0

    move-object/from16 v32, v8

    move-object/from16 v18, v12

    move-object/from16 v20, v14

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v32, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v34}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 486
    :cond_36
    move/from16 v16, v1

    move/from16 v34, v3

    move-object/from16 v4, v17

    move/from16 v5, v19

    move-object/from16 v6, v22

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move-object/from16 v11, v28

    move-object/from16 v12, v31

    .end local v1    # "$dirty":I
    .end local v3    # "$dirty1":I
    .end local v17    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v19    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v25    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v26    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .end local v27    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local v28    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v31    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "enabled":Z
    .local v6, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v9, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v10, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v11, "border":Landroidx/compose/foundation/BorderStroke;
    .local v12, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v16    # "$dirty":I
    .restart local v34    # "$dirty1":I
    :goto_24
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_37

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/ChipKt$FilterChip$1;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v14, p14

    move-object/from16 v40, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/ChipKt$FilterChip$1;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v40

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_37
    return-void
.end method

.method public static final InputChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 41
    .param p0, "selected"    # Z
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "label"    # Lkotlin/jvm/functions/Function2;
    .param p3, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p4, "enabled"    # Z
    .param p5, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p6, "avatar"    # Lkotlin/jvm/functions/Function2;
    .param p7, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p9, "colors"    # Landroidx/compose/material3/SelectableChipColors;
    .param p10, "elevation"    # Landroidx/compose/material3/SelectableChipElevation;
    .param p11, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p12, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I
    .param p15, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 644
    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v0, p16

    const v1, 0x62e13c03

    move-object/from16 v2, p13

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .end local p13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)638@30882L5,639@30942L17,640@31021L20,641@31089L34,671@32220L5,665@32014L745:Chip.kt#uh7d8r"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p14

    .local v2, "$dirty":I
    move/from16 v3, p15

    .local v3, "$dirty1":I
    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v2, v2, 0x6

    move/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v14, 0x6

    if-nez v4, :cond_2

    move/from16 v12, p0

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move/from16 v12, p0

    :goto_1
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v4, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v14, 0x180

    if-nez v4, :cond_8

    move-object/from16 v4, p2

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v2, v2, v16

    goto :goto_5

    :cond_8
    move-object/from16 v4, p2

    :goto_5
    and-int/lit8 v16, v0, 0x8

    if-eqz v16, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v14, 0xc00

    if-nez v5, :cond_b

    move-object/from16 v5, p3

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_a

    const/16 v17, 0x800

    goto :goto_6

    :cond_a
    const/16 v17, 0x400

    :goto_6
    or-int v2, v2, v17

    goto :goto_7

    :cond_b
    move-object/from16 v5, p3

    :goto_7
    and-int/lit8 v17, v0, 0x10

    if-eqz v17, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v6, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v6, v14, 0x6000

    if-nez v6, :cond_e

    move/from16 v6, p4

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_d

    const/16 v19, 0x4000

    goto :goto_8

    :cond_d
    const/16 v19, 0x2000

    :goto_8
    or-int v2, v2, v19

    goto :goto_9

    :cond_e
    move/from16 v6, p4

    :goto_9
    and-int/lit8 v19, v0, 0x20

    const/high16 v20, 0x30000

    if-eqz v19, :cond_f

    or-int v2, v2, v20

    move-object/from16 v7, p5

    goto :goto_b

    :cond_f
    and-int v20, v14, v20

    if-nez v20, :cond_11

    move-object/from16 v7, p5

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v21, 0x10000

    :goto_a
    or-int v2, v2, v21

    goto :goto_b

    :cond_11
    move-object/from16 v7, p5

    :goto_b
    and-int/lit8 v21, v0, 0x40

    const/high16 v22, 0x180000

    if-eqz v21, :cond_12

    or-int v2, v2, v22

    move-object/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v22, v14, v22

    if-nez v22, :cond_14

    move-object/from16 v8, p6

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_13

    const/high16 v23, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v23, 0x80000

    :goto_c
    or-int v2, v2, v23

    goto :goto_d

    :cond_14
    move-object/from16 v8, p6

    :goto_d
    and-int/lit16 v10, v0, 0x80

    const/high16 v24, 0xc00000

    if-eqz v10, :cond_15

    or-int v2, v2, v24

    move-object/from16 v11, p7

    goto :goto_f

    :cond_15
    and-int v24, v14, v24

    if-nez v24, :cond_17

    move-object/from16 v11, p7

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_16

    const/high16 v25, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v25, 0x400000

    :goto_e
    or-int v2, v2, v25

    goto :goto_f

    :cond_17
    move-object/from16 v11, p7

    :goto_f
    const/high16 v25, 0x6000000

    and-int v25, v14, v25

    if-nez v25, :cond_1a

    and-int/lit16 v1, v0, 0x100

    if-nez v1, :cond_18

    move-object/from16 v1, p8

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_19

    const/high16 v25, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v1, p8

    :cond_19
    const/high16 v25, 0x2000000

    :goto_10
    or-int v2, v2, v25

    goto :goto_11

    :cond_1a
    move-object/from16 v1, p8

    :goto_11
    const/high16 v25, 0x30000000

    and-int v25, v14, v25

    if-nez v25, :cond_1d

    and-int/lit16 v1, v0, 0x200

    if-nez v1, :cond_1b

    move-object/from16 v1, p9

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1c

    const/high16 v25, 0x20000000

    goto :goto_12

    :cond_1b
    move-object/from16 v1, p9

    :cond_1c
    const/high16 v25, 0x10000000

    :goto_12
    or-int v2, v2, v25

    goto :goto_13

    :cond_1d
    move-object/from16 v1, p9

    :goto_13
    and-int/lit8 v25, v15, 0x6

    if-nez v25, :cond_20

    and-int/lit16 v1, v0, 0x400

    if-nez v1, :cond_1e

    move-object/from16 v1, p10

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1f

    const/16 v18, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v1, p10

    :cond_1f
    const/16 v18, 0x2

    :goto_14
    or-int v3, v3, v18

    goto :goto_15

    :cond_20
    move-object/from16 v1, p10

    :goto_15
    and-int/lit8 v18, v15, 0x30

    if-nez v18, :cond_23

    and-int/lit16 v1, v0, 0x800

    if-nez v1, :cond_21

    move-object/from16 v1, p11

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_22

    const/16 v20, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v1, p11

    :cond_22
    const/16 v20, 0x10

    :goto_16
    or-int v3, v3, v20

    goto :goto_17

    :cond_23
    move-object/from16 v1, p11

    :goto_17
    and-int/lit16 v4, v0, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v3, v3, 0x180

    move-object/from16 v1, p12

    goto :goto_19

    :cond_24
    and-int/lit16 v1, v15, 0x180

    if-nez v1, :cond_26

    move-object/from16 v1, p12

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_25

    const/16 v23, 0x100

    goto :goto_18

    :cond_25
    const/16 v23, 0x80

    :goto_18
    or-int v3, v3, v23

    goto :goto_19

    :cond_26
    move-object/from16 v1, p12

    :goto_19
    const v18, 0x12492493

    and-int v1, v2, v18

    move/from16 p13, v2

    .end local v2    # "$dirty":I
    .local p13, "$dirty":I
    const v2, 0x12492492

    if-ne v1, v2, :cond_28

    and-int/lit16 v1, v3, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_28

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_27

    goto :goto_1a

    .line 689
    :cond_27
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v17, p13

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object/from16 v32, v9

    move-object v8, v11

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v18, v3

    goto/16 :goto_2c

    .line 644
    :cond_28
    :goto_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const/4 v2, 0x6

    if-eqz v1, :cond_2e

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_29

    goto :goto_1c

    .line 643
    :cond_29
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2a

    const v1, -0xe000001

    and-int v1, p13, v1

    .end local p13    # "$dirty":I
    .local v1, "$dirty":I
    goto :goto_1b

    .end local v1    # "$dirty":I
    .restart local p13    # "$dirty":I
    :cond_2a
    move/from16 v1, p13

    .end local p13    # "$dirty":I
    .restart local v1    # "$dirty":I
    :goto_1b
    and-int/lit16 v4, v0, 0x200

    if-eqz v4, :cond_2b

    const v4, -0x70000001

    and-int/2addr v1, v4

    :cond_2b
    and-int/lit16 v4, v0, 0x400

    if-eqz v4, :cond_2c

    and-int/lit8 v3, v3, -0xf

    :cond_2c
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_2d

    and-int/lit8 v3, v3, -0x71

    :cond_2d
    move/from16 v17, v2

    move v2, v1

    move/from16 v1, v17

    move-object/from16 v25, p8

    move-object/from16 v26, p9

    move-object/from16 v27, p10

    move-object/from16 v28, p11

    move-object/from16 v31, p12

    move-object/from16 v17, v5

    move/from16 v19, v6

    move-object/from16 v22, v7

    move-object/from16 v24, v11

    goto/16 :goto_26

    .line 644
    .end local v1    # "$dirty":I
    .restart local p13    # "$dirty":I
    :cond_2e
    :goto_1c
    if-eqz v16, :cond_2f

    .line 634
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_1d

    .line 644
    .end local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2f
    move-object v1, v5

    .line 634
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v1    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1d
    if-eqz v17, :cond_30

    .line 635
    const/4 v5, 0x1

    move/from16 v17, v5

    .end local p4    # "enabled":Z
    .local v5, "enabled":Z
    goto :goto_1e

    .line 634
    .end local v5    # "enabled":Z
    .restart local p4    # "enabled":Z
    :cond_30
    move/from16 v17, v6

    .line 635
    .end local p4    # "enabled":Z
    .local v17, "enabled":Z
    :goto_1e
    if-eqz v19, :cond_31

    .line 636
    const/4 v5, 0x0

    move-object/from16 v33, v5

    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v5, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_1f

    .line 635
    .end local v5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_31
    move-object/from16 v33, v7

    .line 636
    .end local p5    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v33, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_1f
    if-eqz v21, :cond_32

    .line 637
    const/4 v5, 0x0

    move-object/from16 v34, v5

    .end local p6    # "avatar":Lkotlin/jvm/functions/Function2;
    .local v5, "avatar":Lkotlin/jvm/functions/Function2;
    goto :goto_20

    .line 636
    .end local v5    # "avatar":Lkotlin/jvm/functions/Function2;
    .restart local p6    # "avatar":Lkotlin/jvm/functions/Function2;
    :cond_32
    move-object/from16 v34, v8

    .line 637
    .end local p6    # "avatar":Lkotlin/jvm/functions/Function2;
    .local v34, "avatar":Lkotlin/jvm/functions/Function2;
    :goto_20
    if-eqz v10, :cond_33

    .line 638
    const/4 v5, 0x0

    move-object/from16 v35, v5

    .end local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v5, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_21

    .line 637
    .end local v5    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_33
    move-object/from16 v35, v11

    .line 638
    .end local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v35, "trailingIcon":Lkotlin/jvm/functions/Function2;
    :goto_21
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_34

    .line 639
    sget-object v5, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    invoke-virtual {v5, v9, v2}, Landroidx/compose/material3/InputChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v5

    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v5, "shape":Landroidx/compose/ui/graphics/Shape;
    const v6, -0xe000001

    and-int v6, p13, v6

    move-object/from16 v36, v5

    .end local p13    # "$dirty":I
    .local v6, "$dirty":I
    goto :goto_22

    .line 638
    .end local v5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v6    # "$dirty":I
    .restart local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p13    # "$dirty":I
    :cond_34
    move-object/from16 v36, p8

    move/from16 v6, p13

    .line 639
    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p13    # "$dirty":I
    .restart local v6    # "$dirty":I
    .local v36, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_22
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_35

    .line 640
    sget-object v5, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    invoke-virtual {v5, v9, v2}, Landroidx/compose/material3/InputChipDefaults;->inputChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v5

    .end local p9    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v5, "colors":Landroidx/compose/material3/SelectableChipColors;
    const v7, -0x70000001

    and-int/2addr v6, v7

    move-object/from16 v37, v5

    move/from16 v38, v6

    goto :goto_23

    .line 639
    .end local v5    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .restart local p9    # "colors":Landroidx/compose/material3/SelectableChipColors;
    :cond_35
    move-object/from16 v37, p9

    move/from16 v38, v6

    .line 640
    .end local v6    # "$dirty":I
    .end local p9    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v37, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v38, "$dirty":I
    :goto_23
    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_36

    .line 641
    move v5, v2

    sget-object v2, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    const/high16 v10, 0x180000

    const/16 v11, 0x3f

    move v6, v3

    .end local v3    # "$dirty1":I
    .local v6, "$dirty1":I
    const/4 v3, 0x0

    move v7, v4

    const/4 v4, 0x0

    move v8, v5

    const/4 v5, 0x0

    move/from16 v16, v6

    .end local v6    # "$dirty1":I
    .local v16, "$dirty1":I
    const/4 v6, 0x0

    move/from16 v18, v7

    const/4 v7, 0x0

    move/from16 v19, v8

    const/4 v8, 0x0

    move-object/from16 p3, v1

    move/from16 v39, v18

    move/from16 v1, v19

    .end local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v2 .. v11}, Landroidx/compose/material3/InputChipDefaults;->inputChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v2

    .end local p10    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v2, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    and-int/lit8 v3, v16, -0xf

    .end local v16    # "$dirty1":I
    .restart local v3    # "$dirty1":I
    goto :goto_24

    .line 640
    .end local v2    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p10    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    :cond_36
    move-object/from16 p3, v1

    move v1, v2

    move/from16 v16, v3

    move/from16 v39, v4

    .end local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v3    # "$dirty1":I
    .restart local v16    # "$dirty1":I
    .restart local p3    # "modifier":Landroidx/compose/ui/Modifier;
    move-object/from16 v2, p10

    .line 641
    .end local v16    # "$dirty1":I
    .end local p10    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .restart local v2    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .restart local v3    # "$dirty1":I
    :goto_24
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_37

    .line 642
    sget-object v16, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    shr-int/lit8 v4, v38, 0xc

    and-int/lit8 v4, v4, 0xe

    const/high16 v5, 0x6000000

    or-int/2addr v4, v5

    shl-int/lit8 v5, v38, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int v30, v4, v5

    const/16 v31, 0xfc

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v9

    move/from16 v18, v12

    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v16 .. v31}, Landroidx/compose/material3/InputChipDefaults;->inputChipBorder-_7El2pE(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;

    move-result-object v4

    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p11    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v4, "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v9    # "$composer":Landroidx/compose/runtime/Composer;
    and-int/lit8 v3, v3, -0x71

    goto :goto_25

    .line 641
    .end local v4    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p11    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_37
    move-object/from16 v4, p11

    .line 642
    .end local p11    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v4    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_25
    if-eqz v39, :cond_38

    .line 643
    const/4 v5, 0x0

    move-object/from16 v27, v2

    move-object/from16 v28, v4

    move-object/from16 v31, v5

    move/from16 v19, v17

    move-object/from16 v22, v33

    move-object/from16 v8, v34

    move-object/from16 v24, v35

    move-object/from16 v25, v36

    move-object/from16 v26, v37

    move/from16 v2, v38

    move-object/from16 v17, p3

    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v5, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_26

    .line 642
    .end local v5    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_38
    move-object/from16 v31, p12

    move-object/from16 v27, v2

    move-object/from16 v28, v4

    move/from16 v19, v17

    move-object/from16 v22, v33

    move-object/from16 v8, v34

    move-object/from16 v24, v35

    move-object/from16 v25, v36

    move-object/from16 v26, v37

    move/from16 v2, v38

    move-object/from16 v17, p3

    .line 643
    .end local v4    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v33    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v34    # "avatar":Lkotlin/jvm/functions/Function2;
    .end local v35    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v36    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v37    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .end local v38    # "$dirty":I
    .end local p3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "$dirty":I
    .local v8, "avatar":Lkotlin/jvm/functions/Function2;
    .local v17, "modifier":Landroidx/compose/ui/Modifier;
    .local v19, "enabled":Z
    .local v22, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v25, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v26, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v27, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v28, "border":Landroidx/compose/foundation/BorderStroke;
    .local v31, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_26
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_39

    .line 644
    const-string v4, "androidx.compose.material3.InputChip (Chip.kt:643)"

    const v5, 0x62e13c03

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 647
    :cond_39
    const/4 v4, 0x0

    .local v4, "shapedAvatar":Lkotlin/jvm/functions/Function2;
    const v5, 0x18e8f774

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v5, "649@31531L5,651@31584L419"

    invoke-static {v9, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 648
    const/4 v5, 0x1

    if-eqz v8, :cond_3b

    .line 649
    if-eqz v19, :cond_3a

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_27

    :cond_3a
    const v6, 0x3ec28f5c    # 0.38f

    .line 650
    .local v6, "avatarOpacity":F
    :goto_27
    sget-object v7, Landroidx/compose/material3/tokens/InputChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/InputChipTokens;

    invoke-virtual {v7}, Landroidx/compose/material3/tokens/InputChipTokens;->getAvatarShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    move-result-object v7

    invoke-static {v7, v9, v1}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v7

    .line 652
    .local v7, "avatarShape":Landroidx/compose/ui/graphics/Shape;
    new-instance v10, Landroidx/compose/material3/ChipKt$InputChip$1;

    invoke-direct {v10, v6, v7, v8}, Landroidx/compose/material3/ChipKt$InputChip$1;-><init>(FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;)V

    const/16 v11, 0x36

    const v12, 0x44cc1d33

    invoke-static {v12, v5, v10, v9, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 651
    move-object v4, v10

    move-object/from16 v23, v4

    goto :goto_28

    .line 648
    .end local v6    # "avatarOpacity":F
    .end local v7    # "avatarShape":Landroidx/compose/ui/graphics/Shape;
    :cond_3b
    move-object/from16 v23, v4

    .line 651
    .end local v4    # "shapedAvatar":Lkotlin/jvm/functions/Function2;
    .local v23, "shapedAvatar":Lkotlin/jvm/functions/Function2;
    :goto_28
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 667
    nop

    .line 668
    nop

    .line 669
    nop

    .line 670
    nop

    .line 671
    nop

    .line 672
    sget-object v4, Landroidx/compose/material3/tokens/InputChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/InputChipTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/InputChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v4

    invoke-static {v4, v9, v1}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 673
    nop

    .line 674
    nop

    .line 675
    nop

    .line 676
    nop

    .line 677
    nop

    .line 678
    nop

    .line 679
    nop

    .line 680
    sget-object v1, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    invoke-virtual {v1}, Landroidx/compose/material3/InputChipDefaults;->getHeight-D9Ej5fM()F

    move-result v29

    .line 683
    const/4 v1, 0x0

    if-eqz v23, :cond_3c

    move v4, v5

    goto :goto_29

    :cond_3c
    move v4, v1

    .line 684
    :goto_29
    if-eqz v22, :cond_3d

    move v6, v5

    goto :goto_2a

    :cond_3d
    move v6, v1

    .line 685
    :goto_2a
    if-eqz v24, :cond_3e

    goto :goto_2b

    :cond_3e
    move v5, v1

    .line 682
    :goto_2b
    invoke-static {v4, v6, v5}, Landroidx/compose/material3/ChipKt;->inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v30

    .line 687
    and-int/lit8 v1, v2, 0xe

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v1, v4

    shr-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x6

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v5, 0x380000

    and-int/2addr v4, v5

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v5, 0xe000000

    and-int/2addr v4, v5

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v5, 0x70000000

    and-int/2addr v4, v5

    or-int v33, v1, v4

    shr-int/lit8 v1, v2, 0x1b

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0xc00

    shl-int/lit8 v4, v3, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v1, v4

    shl-int/lit8 v4, v3, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v1, v4

    shl-int/lit8 v4, v3, 0x9

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    or-int v34, v1, v4

    .line 666
    move/from16 v16, p0

    move-object/from16 v20, p2

    move-object/from16 v32, v9

    move-object/from16 v18, v13

    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v32, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v16 .. v34}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 689
    .end local v23    # "shapedAvatar":Lkotlin/jvm/functions/Function2;
    :cond_3f
    move-object v7, v8

    move-object/from16 v4, v17

    move/from16 v5, v19

    move-object/from16 v6, v22

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    move-object/from16 v11, v27

    move-object/from16 v12, v28

    move-object/from16 v13, v31

    move/from16 v17, v2

    move/from16 v18, v3

    .end local v2    # "$dirty":I
    .end local v3    # "$dirty1":I
    .end local v19    # "enabled":Z
    .end local v22    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v25    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v26    # "colors":Landroidx/compose/material3/SelectableChipColors;
    .end local v27    # "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .end local v28    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v31    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "enabled":Z
    .local v6, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "avatar":Lkotlin/jvm/functions/Function2;
    .local v8, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v9, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v10, "colors":Landroidx/compose/material3/SelectableChipColors;
    .local v11, "elevation":Landroidx/compose/material3/SelectableChipElevation;
    .local v12, "border":Landroidx/compose/foundation/BorderStroke;
    .local v13, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v17, "$dirty":I
    .local v18, "$dirty1":I
    :goto_2c
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_40

    new-instance v0, Landroidx/compose/material3/ChipKt$InputChip$2;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v16, p16

    move-object/from16 v40, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/ChipKt$InputChip$2;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v40

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_40
    return-void
.end method

.method private static final SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .param p0, "selected"    # Z
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p3, "enabled"    # Z
    .param p4, "label"    # Lkotlin/jvm/functions/Function2;
    .param p5, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "avatar"    # Lkotlin/jvm/functions/Function2;
    .param p8, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p9, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p10, "colors"    # Landroidx/compose/material3/SelectableChipColors;
    .param p11, "elevation"    # Landroidx/compose/material3/SelectableChipElevation;
    .param p12, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p13, "minHeight"    # F
    .param p14, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p15, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "F",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 2010
    move/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v2, p3

    move-object/from16 v1, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p15

    move/from16 v14, p17

    move/from16 v15, p18

    const v3, 0x18048c8c

    move-object/from16 v4, p16

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)2023@98879L525,2013@98468L936:Chip.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p17

    .local v5, "$dirty":I
    move/from16 v6, p18

    .local v6, "$dirty1":I
    and-int/lit8 v7, v14, 0x6

    if-nez v7, :cond_1

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v5, v7

    :cond_1
    and-int/lit8 v7, v14, 0x30

    const/16 v16, 0x10

    if-nez v7, :cond_3

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_1

    :cond_2
    move/from16 v7, v16

    :goto_1
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v14, 0x180

    const/16 v17, 0x100

    const/16 v18, 0x80

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_4

    move/from16 v19, v17

    goto :goto_2

    :cond_4
    move/from16 v19, v18

    :goto_2
    or-int v5, v5, v19

    goto :goto_3

    :cond_5
    move-object/from16 v7, p2

    :goto_3
    and-int/lit16 v8, v14, 0xc00

    const/16 v19, 0x800

    const/16 v20, 0x400

    if-nez v8, :cond_7

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_6

    move/from16 v8, v19

    goto :goto_4

    :cond_6
    move/from16 v8, v20

    :goto_4
    or-int/2addr v5, v8

    :cond_7
    and-int/lit16 v8, v14, 0x6000

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-nez v8, :cond_9

    move-object/from16 v8, p4

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_8

    move/from16 v23, v21

    goto :goto_5

    :cond_8
    move/from16 v23, v22

    :goto_5
    or-int v5, v5, v23

    goto :goto_6

    :cond_9
    move-object/from16 v8, p4

    :goto_6
    const/high16 v23, 0x30000

    and-int v24, v14, v23

    const/high16 v25, 0x20000

    const/high16 v26, 0x10000

    if-nez v24, :cond_b

    move-object/from16 v9, p5

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_a

    move/from16 v27, v25

    goto :goto_7

    :cond_a
    move/from16 v27, v26

    :goto_7
    or-int v5, v5, v27

    goto :goto_8

    :cond_b
    move-object/from16 v9, p5

    :goto_8
    const/high16 v27, 0x180000

    and-int v27, v14, v27

    if-nez v27, :cond_d

    move-object/from16 v10, p6

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v28, 0x80000

    :goto_9
    or-int v5, v5, v28

    goto :goto_a

    :cond_d
    move-object/from16 v10, p6

    :goto_a
    const/high16 v28, 0xc00000

    and-int v28, v14, v28

    if-nez v28, :cond_f

    move-object/from16 v3, p7

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v29, 0x400000

    :goto_b
    or-int v5, v5, v29

    goto :goto_c

    :cond_f
    move-object/from16 v3, p7

    :goto_c
    const/high16 v29, 0x6000000

    and-int v29, v14, v29

    if-nez v29, :cond_11

    move-object/from16 v3, p8

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v29, 0x2000000

    :goto_d
    or-int v5, v5, v29

    goto :goto_e

    :cond_11
    move-object/from16 v3, p8

    :goto_e
    const/high16 v29, 0x30000000

    and-int v29, v14, v29

    if-nez v29, :cond_13

    move-object/from16 v14, p9

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x20000000

    goto :goto_f

    :cond_12
    const/high16 v29, 0x10000000

    :goto_f
    or-int v5, v5, v29

    goto :goto_10

    :cond_13
    move-object/from16 v14, p9

    :goto_10
    and-int/lit8 v29, v15, 0x6

    if-nez v29, :cond_15

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v24, 0x4

    goto :goto_11

    :cond_14
    const/16 v24, 0x2

    :goto_11
    or-int v6, v6, v24

    :cond_15
    and-int/lit8 v24, v15, 0x30

    if-nez v24, :cond_17

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_16

    const/16 v16, 0x20

    :cond_16
    or-int v6, v6, v16

    :cond_17
    and-int/lit16 v3, v15, 0x180

    if-nez v3, :cond_19

    move-object/from16 v3, p12

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    goto :goto_12

    :cond_18
    move/from16 v17, v18

    :goto_12
    or-int v6, v6, v17

    goto :goto_13

    :cond_19
    move-object/from16 v3, p12

    :goto_13
    and-int/lit16 v3, v15, 0xc00

    if-nez v3, :cond_1b

    move/from16 v3, p13

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_1a

    goto :goto_14

    :cond_1a
    move/from16 v19, v20

    :goto_14
    or-int v6, v6, v19

    goto :goto_15

    :cond_1b
    move/from16 v3, p13

    :goto_15
    and-int/lit16 v3, v15, 0x6000

    if-nez v3, :cond_1d

    move-object/from16 v3, p14

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1c

    goto :goto_16

    :cond_1c
    move/from16 v21, v22

    :goto_16
    or-int v6, v6, v21

    goto :goto_17

    :cond_1d
    move-object/from16 v3, p14

    :goto_17
    and-int v16, v15, v23

    if-nez v16, :cond_1f

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1e

    goto :goto_18

    :cond_1e
    move/from16 v25, v26

    :goto_18
    or-int v6, v6, v25

    :cond_1f
    const v16, 0x12492493

    and-int v3, v5, v16

    const v7, 0x12492492

    if-ne v3, v7, :cond_21

    const v3, 0x12493

    and-int/2addr v3, v6

    const v7, 0x12492

    if-ne v3, v7, :cond_21

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_19

    .line 2038
    :cond_20
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v21, v4

    move/from16 v20, v5

    move/from16 v19, v6

    goto/16 :goto_1e

    .line 2010
    :cond_21
    :goto_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_22

    const-string v3, "androidx.compose.material3.SelectableChip (Chip.kt:2009)"

    const v7, 0x18048c8c

    invoke-static {v7, v5, v6, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_22
    const v3, 0x7b8ba401

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "2011@98346L39"

    invoke-static {v4, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 2012
    if-nez v13, :cond_24

    const v3, 0x7b8ba68c

    const-string v7, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v4, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    move-object v7, v4

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 2819
    .local v16, "$i$f$cache":I
    move/from16 p16, v3

    .end local v3    # "invalid$iv":Z
    .local p16, "invalid$iv":Z
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 2820
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v5

    .end local v5    # "$dirty":I
    .local v19, "$dirty":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_23

    .line 2821
    const/4 v5, 0x0

    .line 2012
    .local v5, "$i$a$-cache-ChipKt$SelectableChip$interactionSource$1":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v5

    .line 2821
    .end local v5    # "$i$a$-cache-ChipKt$SelectableChip$interactionSource$1":I
    nop

    .line 2822
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2823
    nop

    .end local v5    # "value$iv":Ljava/lang/Object;
    goto :goto_1a

    .line 2824
    :cond_23
    move-object v5, v3

    .line 2820
    :goto_1a
    nop

    .line 2819
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 2012
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p16    # "invalid$iv":Z
    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    goto :goto_1b

    .end local v19    # "$dirty":I
    .local v5, "$dirty":I
    :cond_24
    move/from16 v19, v5

    .end local v5    # "$dirty":I
    .restart local v19    # "$dirty":I
    move-object v5, v13

    :goto_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v16, v5

    .line 2015
    .local v16, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    nop

    .line 2016
    nop

    .line 2017
    sget-object v3, Landroidx/compose/material3/ChipKt$SelectableChip$1;->INSTANCE:Landroidx/compose/material3/ChipKt$SelectableChip$1;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v7, 0x1

    move/from16 p16, v6

    .end local v6    # "$dirty1":I
    .local p16, "$dirty1":I
    const/4 v6, 0x0

    invoke-static {v11, v5, v3, v7, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    .line 2018
    nop

    .line 2019
    nop

    .line 2020
    invoke-virtual {v1, v2, v0}, Landroidx/compose/material3/SelectableChipColors;->containerColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v20

    .line 2021
    const v3, 0x7b8bd810

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "2020@98742L43"

    invoke-static {v4, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v12, :cond_25

    goto :goto_1c

    :cond_25
    move-object/from16 v3, v16

    check-cast v3, Landroidx/compose/foundation/interaction/InteractionSource;

    shr-int/lit8 v5, v19, 0x9

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v6, p16, 0x3

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v5, v6

    invoke-virtual {v12, v2, v3, v4, v5}, Landroidx/compose/material3/SelectableChipElevation;->shadowElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v6

    :goto_1c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v6, :cond_26

    invoke-interface {v6}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v3

    move/from16 v18, v3

    goto :goto_1d

    :cond_26
    const/4 v3, 0x0

    .local v3, "$this$dp$iv":I
    const/4 v5, 0x0

    .line 2825
    .local v5, "$i$f$getDp":I
    int-to-float v6, v3

    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    move/from16 v18, v6

    .line 2022
    .end local v3    # "$this$dp$iv":I
    .end local v5    # "$i$f$getDp":I
    :goto_1d
    nop

    .line 2023
    nop

    .line 2024
    new-instance v0, Landroidx/compose/material3/ChipKt$SelectableChip$2;

    move/from16 v3, p0

    move-object v14, v4

    move v12, v7

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move/from16 v11, v19

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p13

    move-object/from16 v10, p14

    move/from16 v19, p16

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p16    # "$dirty1":I
    .local v11, "$dirty":I
    .local v14, "$composer":Landroidx/compose/runtime/Composer;
    .local v19, "$dirty1":I
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/ChipKt$SelectableChip$2;-><init>(Landroidx/compose/material3/SelectableChipColors;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/foundation/layout/PaddingValues;)V

    const/16 v1, 0x36

    const v2, -0x226db3de

    invoke-static {v2, v12, v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v1, v11, 0xe

    shr-int/lit8 v2, v11, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v11, 0x1c00

    or-int/2addr v1, v2

    shr-int/lit8 v2, v11, 0xf

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    shl-int/lit8 v2, v19, 0x15

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 2014
    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v12, v16

    .end local v16    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v12, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    const/16 v16, 0x30

    move-object/from16 v2, v17

    const/16 v17, 0xc0

    move/from16 v3, p3

    move-object/from16 v4, p9

    move-object v13, v0

    move v15, v1

    move/from16 v10, v18

    move-wide/from16 v5, v20

    move/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v20, v11

    move-object/from16 v11, p12

    .end local v11    # "$dirty":I
    .local v20, "$dirty":I
    invoke-static/range {v0 .. v17}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v21, v14

    .end local v14    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 2038
    .end local v12    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_27
    :goto_1e
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_28

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/ChipKt$SelectableChip$3;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Landroidx/compose/material3/ChipKt$SelectableChip$3;-><init>(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_28
    return-void
.end method

.method public static final SuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "icon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p7, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p8, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p9, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 747
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, -0x6555f00f

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)740@35497L5,741@35552L22,742@35631L25,743@35709L29,751@35977L5,746@35805L538:Chip.kt#uh7d8r"

    invoke-static {v8, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p11

    .local v1, "$dirty":I
    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v14, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v14, p0

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p0

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v3, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move-object/from16 v3, p2

    :goto_5
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    goto :goto_7

    :cond_b
    move/from16 v5, p3

    :goto_7
    and-int/lit8 v6, v12, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v7, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v7, v11, 0x6000

    if-nez v7, :cond_e

    move-object/from16 v7, p4

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v1, v9

    goto :goto_9

    :cond_e
    move-object/from16 v7, p4

    :goto_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    if-nez v9, :cond_11

    and-int/lit8 v9, v12, 0x20

    if-nez v9, :cond_f

    move-object/from16 v9, p5

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v9, p5

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v1, v10

    goto :goto_b

    :cond_11
    move-object/from16 v9, p5

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v11

    if-nez v10, :cond_14

    and-int/lit8 v10, v12, 0x40

    if-nez v10, :cond_12

    move-object/from16 v10, p6

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    const/high16 v15, 0xc00000

    and-int v16, v11, v15

    if-nez v16, :cond_17

    move/from16 p10, v15

    and-int/lit16 v15, v12, 0x80

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v15, p7

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v1, v1, v16

    goto :goto_f

    :cond_17
    move/from16 p10, v15

    move-object/from16 v15, p7

    :goto_f
    const/high16 v16, 0x6000000

    and-int v16, v11, v16

    if-nez v16, :cond_1a

    and-int/lit16 v0, v12, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v17, 0x2000000

    :goto_10
    or-int v1, v1, v17

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    move/from16 v17, v2

    and-int/lit16 v2, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v18

    move/from16 v18, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v18, v11, v18

    if-nez v18, :cond_1d

    move/from16 v18, v2

    move-object/from16 v2, p9

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move/from16 v18, v2

    move-object/from16 v2, p9

    :goto_13
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 v19, v1

    .end local v1    # "$dirty":I
    .local v19, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_14

    .line 763
    :cond_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v4, v5

    move-object v5, v7

    move-object/from16 v29, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v15

    move-object/from16 v9, p8

    move-object v10, v2

    goto/16 :goto_1e

    .line 747
    :cond_1f
    :goto_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v11, 0x1

    const v20, -0xe000001

    const v21, -0x1c00001

    const v1, -0x380001

    const v22, -0x70001

    const/4 v2, 0x6

    if-eqz v0, :cond_25

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_15

    .line 745
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v0, v19, v22

    move/from16 v19, v0

    :cond_21
    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_22

    and-int v19, v19, v1

    :cond_22
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_23

    and-int v19, v19, v21

    :cond_23
    and-int/lit16 v0, v12, 0x100

    if-eqz v0, :cond_24

    and-int v0, v19, v20

    move-object/from16 v25, p8

    move-object/from16 v28, p9

    move v1, v0

    move v0, v2

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move v15, v5

    .end local v19    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1d

    .end local v0    # "$dirty":I
    .restart local v19    # "$dirty":I
    :cond_24
    move-object/from16 v25, p8

    move-object/from16 v28, p9

    move v0, v2

    move-object/from16 v20, v7

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move/from16 v1, v19

    move v15, v5

    goto/16 :goto_1d

    .line 747
    :cond_25
    :goto_15
    if-eqz v17, :cond_26

    .line 738
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 747
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_26
    move-object v0, v3

    .line 738
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    if-eqz v4, :cond_27

    .line 739
    const/4 v3, 0x1

    move/from16 v17, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_17

    .line 738
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_27
    move/from16 v17, v5

    .line 739
    .end local p3    # "enabled":Z
    .local v17, "enabled":Z
    :goto_17
    if-eqz v6, :cond_28

    .line 740
    const/4 v3, 0x0

    move-object/from16 v23, v3

    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v3, "icon":Lkotlin/jvm/functions/Function2;
    goto :goto_18

    .line 739
    .end local v3    # "icon":Lkotlin/jvm/functions/Function2;
    .restart local p4    # "icon":Lkotlin/jvm/functions/Function2;
    :cond_28
    move-object/from16 v23, v7

    .line 740
    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v23, "icon":Lkotlin/jvm/functions/Function2;
    :goto_18
    and-int/lit8 v3, v12, 0x20

    if-eqz v3, :cond_29

    .line 741
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, v19, v22

    move-object/from16 v19, v3

    .end local v19    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_19

    .line 740
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local v19    # "$dirty":I
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_29
    move/from16 v4, v19

    move-object/from16 v19, v9

    .line 741
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_19
    and-int/lit8 v3, v12, 0x40

    if-eqz v3, :cond_2a

    .line 742
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v8, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v22, v3

    move/from16 v24, v4

    goto :goto_1a

    .line 741
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p6    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2a
    move-object/from16 v22, v10

    move/from16 v24, v4

    .line 742
    .end local v4    # "$dirty":I
    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v22, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1a
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_2b

    .line 743
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v25, v7

    const/4 v7, 0x0

    move-object/from16 p2, v0

    move/from16 v0, v25

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    and-int v24, v24, v21

    move-object v15, v1

    goto :goto_1b

    .line 742
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2b
    move-object/from16 p2, v0

    move v0, v2

    .line 743
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v15, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1b
    and-int/lit16 v1, v12, 0x100

    if-eqz v1, :cond_2c

    .line 744
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    shr-int/lit8 v2, v24, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v9, v2, 0x6000

    const/16 v10, 0xe

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move/from16 v2, v17

    .end local v17    # "enabled":Z
    .local v2, "enabled":Z
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipBorder-h1eT-Ww(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;

    move-result-object v1

    .end local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v1, "border":Landroidx/compose/foundation/BorderStroke;
    and-int v24, v24, v20

    goto :goto_1c

    .line 743
    .end local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v2    # "enabled":Z
    .restart local v17    # "enabled":Z
    .restart local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_2c
    move/from16 v2, v17

    .end local v17    # "enabled":Z
    .restart local v2    # "enabled":Z
    move-object/from16 v1, p8

    .line 744
    .end local p8    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v1    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_1c
    if-eqz v18, :cond_2d

    .line 745
    const/4 v3, 0x0

    move-object/from16 v25, v1

    move-object/from16 v28, v3

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v1, v24

    move-object/from16 v3, p2

    move-object/from16 v24, v15

    move-object/from16 v22, v19

    move v15, v2

    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_1d

    .line 744
    .end local v3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_2d
    move-object/from16 v3, p2

    move-object/from16 v28, p9

    move-object/from16 v25, v1

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v1, v24

    move-object/from16 v24, v15

    move-object/from16 v22, v19

    move v15, v2

    .line 745
    .end local v2    # "enabled":Z
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "icon":Lkotlin/jvm/functions/Function2;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v1, "$dirty":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "colors":Landroidx/compose/material3/ChipColors;
    .local v15, "enabled":Z
    .local v20, "icon":Lkotlin/jvm/functions/Function2;
    .local v22, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v24, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v25, "border":Landroidx/compose/foundation/BorderStroke;
    .local v28, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2e

    .line 747
    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.SuggestionChip (Chip.kt:746)"

    const v5, -0x6555f00f

    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 748
    :cond_2e
    nop

    .line 749
    nop

    .line 750
    nop

    .line 751
    nop

    .line 752
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v2

    invoke-static {v2, v8, v0}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    .line 753
    invoke-virtual {v10, v15}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v18

    .line 754
    nop

    .line 755
    nop

    .line 756
    nop

    .line 757
    nop

    .line 758
    nop

    .line 759
    nop

    .line 760
    sget-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    move-result v26

    .line 761
    sget-object v27, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 762
    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, p10

    shl-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shr-int/lit8 v2, v1, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    const/high16 v4, 0xe000000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x9

    const/high16 v4, 0x70000000

    and-int/2addr v2, v4

    or-int v30, v0, v2

    shr-int/lit8 v0, v1, 0x15

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    shr-int/lit8 v2, v1, 0x15

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shr-int/lit8 v2, v1, 0xf

    const v4, 0xe000

    and-int/2addr v2, v4

    or-int v31, v0, v2

    .line 747
    const/16 v21, 0x0

    move-object/from16 v29, v8

    move-object/from16 v23, v10

    move-object/from16 v16, v13

    move-object v13, v3

    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v10    # "colors":Landroidx/compose/material3/ChipColors;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v31}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 763
    :cond_2f
    move/from16 v19, v1

    move-object v3, v13

    move v4, v15

    move-object/from16 v5, v20

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, v28

    .end local v1    # "$dirty":I
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "enabled":Z
    .end local v20    # "icon":Lkotlin/jvm/functions/Function2;
    .end local v22    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v24    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v25    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v28    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "icon":Lkotlin/jvm/functions/Function2;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "colors":Landroidx/compose/material3/ChipColors;
    .local v8, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v9, "border":Landroidx/compose/foundation/BorderStroke;
    .local v10, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v19, "$dirty":I
    :goto_1e
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_30

    new-instance v0, Landroidx/compose/material3/ChipKt$SuggestionChip$1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$SuggestionChip$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_30
    return-void
.end method

.method public static final synthetic SuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "label"    # Lkotlin/jvm/functions/Function2;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "icon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p7, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p8, "border"    # Landroidx/compose/material3/ChipBorder;
    .param p9, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p10, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p11, "$changed"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource"
            imports = {}
        .end subannotation
    .end annotation

    .line 831
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, 0xa2b9a45

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p10    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)824@39441L5,825@39496L22,826@39575L25,827@39651L22,828@39725L39,835@39946L5,830@39774L568:Chip.kt#uh7d8r"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p11

    .local v1, "$dirty":I
    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x6

    move-object/from16 v14, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v14, p0

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p0

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v3, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_8
    move-object/from16 v3, p2

    :goto_5
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v5, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    goto :goto_7

    :cond_b
    move/from16 v5, p3

    :goto_7
    and-int/lit8 v6, v12, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v8, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v1, v9

    goto :goto_9

    :cond_e
    move-object/from16 v8, p4

    :goto_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    if-nez v9, :cond_11

    and-int/lit8 v9, v12, 0x20

    if-nez v9, :cond_f

    move-object/from16 v9, p5

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v9, p5

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v1, v10

    goto :goto_b

    :cond_11
    move-object/from16 v9, p5

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v11

    if-nez v10, :cond_14

    and-int/lit8 v10, v12, 0x40

    if-nez v10, :cond_12

    move-object/from16 v10, p6

    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_14
    move-object/from16 v10, p6

    :goto_d
    const/high16 v15, 0xc00000

    and-int v16, v11, v15

    if-nez v16, :cond_17

    move/from16 p10, v15

    and-int/lit16 v15, v12, 0x80

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v15, p7

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v1, v1, v16

    goto :goto_f

    :cond_17
    move/from16 p10, v15

    move-object/from16 v15, p7

    :goto_f
    const/high16 v16, 0x6000000

    and-int v16, v11, v16

    if-nez v16, :cond_1a

    and-int/lit16 v0, v12, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v17, 0x2000000

    :goto_10
    or-int v1, v1, v17

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    move/from16 v17, v2

    and-int/lit16 v2, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v18

    move/from16 v18, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v18, v11, v18

    if-nez v18, :cond_1d

    move/from16 v18, v2

    move-object/from16 v2, p9

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v19, 0x10000000

    :goto_12
    or-int v1, v1, v19

    goto :goto_13

    :cond_1d
    move/from16 v18, v2

    move-object/from16 v2, p9

    :goto_13
    const v19, 0x12492493

    and-int v0, v1, v19

    move/from16 v19, v1

    .end local v1    # "$dirty":I
    .local v19, "$dirty":I
    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_14

    .line 847
    :cond_1e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v4, v5

    move-object/from16 v29, v7

    move-object v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v15

    move-object/from16 v9, p8

    move-object v10, v2

    goto/16 :goto_21

    .line 831
    :cond_1f
    :goto_14
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v11, 0x1

    const v20, -0xe000001

    const v21, -0x1c00001

    const v1, -0x380001

    const v22, -0x70001

    const/4 v2, 0x6

    if-eqz v0, :cond_25

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_15

    .line 829
    :cond_20
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_21

    and-int v0, v19, v22

    move/from16 v19, v0

    :cond_21
    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_22

    and-int v19, v19, v1

    :cond_22
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_23

    and-int v19, v19, v21

    :cond_23
    and-int/lit16 v0, v12, 0x100

    if-eqz v0, :cond_24

    and-int v0, v19, v20

    move v1, v2

    move v2, v0

    move v0, v1

    move-object/from16 v1, p8

    move-object/from16 v28, p9

    move-object/from16 v20, v8

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move v15, v5

    .end local v19    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_1e

    .end local v0    # "$dirty":I
    .restart local v19    # "$dirty":I
    :cond_24
    move-object/from16 v1, p8

    move-object/from16 v28, p9

    move v0, v2

    move-object/from16 v20, v8

    move-object/from16 v22, v9

    move-object/from16 v24, v15

    move/from16 v2, v19

    move v15, v5

    goto/16 :goto_1e

    .line 831
    :cond_25
    :goto_15
    if-eqz v17, :cond_26

    .line 822
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_16

    .line 831
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_26
    move-object v0, v3

    .line 822
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_16
    if-eqz v4, :cond_27

    .line 823
    const/4 v3, 0x1

    move/from16 v17, v3

    .end local p3    # "enabled":Z
    .local v3, "enabled":Z
    goto :goto_17

    .line 822
    .end local v3    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_27
    move/from16 v17, v5

    .line 823
    .end local p3    # "enabled":Z
    .local v17, "enabled":Z
    :goto_17
    if-eqz v6, :cond_28

    .line 824
    const/4 v3, 0x0

    move-object/from16 v23, v3

    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v3, "icon":Lkotlin/jvm/functions/Function2;
    goto :goto_18

    .line 823
    .end local v3    # "icon":Lkotlin/jvm/functions/Function2;
    .restart local p4    # "icon":Lkotlin/jvm/functions/Function2;
    :cond_28
    move-object/from16 v23, v8

    .line 824
    .end local p4    # "icon":Lkotlin/jvm/functions/Function2;
    .local v23, "icon":Lkotlin/jvm/functions/Function2;
    :goto_18
    and-int/lit8 v3, v12, 0x20

    if-eqz v3, :cond_29

    .line 825
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v7, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, v19, v22

    move-object/from16 v19, v3

    .end local v19    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_19

    .line 824
    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local v19    # "$dirty":I
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_29
    move/from16 v4, v19

    move-object/from16 v19, v9

    .line 825
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v4    # "$dirty":I
    .local v19, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_19
    and-int/lit8 v3, v12, 0x40

    if-eqz v3, :cond_2a

    .line 826
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v3, v7, v2}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v3, "colors":Landroidx/compose/material3/ChipColors;
    and-int/2addr v4, v1

    move-object/from16 v22, v3

    move/from16 v24, v4

    goto :goto_1a

    .line 825
    .end local v3    # "colors":Landroidx/compose/material3/ChipColors;
    .restart local p6    # "colors":Landroidx/compose/material3/ChipColors;
    :cond_2a
    move-object/from16 v22, v10

    move/from16 v24, v4

    .line 826
    .end local v4    # "$dirty":I
    .end local p6    # "colors":Landroidx/compose/material3/ChipColors;
    .local v22, "colors":Landroidx/compose/material3/ChipColors;
    .local v24, "$dirty":I
    :goto_1a
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_2b

    .line 827
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    const/high16 v9, 0x180000

    const/16 v10, 0x3f

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object/from16 v29, v7

    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .local v29, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    move-object/from16 p2, v0

    move v0, v8

    move-object/from16 v8, v29

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v1, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    and-int v24, v24, v21

    move-object v15, v1

    goto :goto_1b

    .line 826
    .end local v1    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    :cond_2b
    move-object/from16 p2, v0

    move v0, v2

    move-object/from16 v29, v7

    .line 827
    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p7    # "elevation":Landroidx/compose/material3/ChipElevation;
    .local v15, "elevation":Landroidx/compose/material3/ChipElevation;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1b
    and-int/lit16 v1, v12, 0x100

    if-eqz v1, :cond_2c

    .line 828
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    const/16 v8, 0xc00

    const/4 v9, 0x7

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, v29

    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v1 .. v9}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipBorder-d_3_b6Q(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;

    move-result-object v1

    .end local p8    # "border":Landroidx/compose/material3/ChipBorder;
    .local v1, "border":Landroidx/compose/material3/ChipBorder;
    and-int v24, v24, v20

    goto :goto_1c

    .line 827
    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p8    # "border":Landroidx/compose/material3/ChipBorder;
    :cond_2c
    move-object/from16 v7, v29

    .end local v29    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$composer":Landroidx/compose/runtime/Composer;
    move-object/from16 v1, p8

    .line 828
    .end local p8    # "border":Landroidx/compose/material3/ChipBorder;
    .restart local v1    # "border":Landroidx/compose/material3/ChipBorder;
    :goto_1c
    if-eqz v18, :cond_2e

    .line 829
    const v2, 0x4a636a1a    # 3725958.5f

    const-string v3, "CC(remember):Chip.kt#9igjgp"

    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid$iv":Z
    move-object v3, v7

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 2800
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 2801
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_2d

    .line 2802
    const/4 v8, 0x0

    .line 829
    .local v8, "$i$a$-cache-ChipKt$SuggestionChip$2":I
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    .line 2802
    .end local v8    # "$i$a$-cache-ChipKt$SuggestionChip$2":I
    nop

    .line 2803
    .local v8, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2804
    nop

    .end local v8    # "value$iv":Ljava/lang/Object;
    goto :goto_1d

    .line 2805
    :cond_2d
    move-object v8, v5

    .line 2801
    :goto_1d
    nop

    .line 2800
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 829
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    move-object v2, v8

    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v3, p2

    move-object/from16 v28, v2

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v2, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    goto :goto_1e

    .line 828
    .end local v2    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_2e
    move-object/from16 v3, p2

    move-object/from16 v28, p9

    move-object/from16 v10, v22

    move-object/from16 v20, v23

    move/from16 v2, v24

    move-object/from16 v24, v15

    move/from16 v15, v17

    move-object/from16 v22, v19

    .line 829
    .end local v17    # "enabled":Z
    .end local v19    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "icon":Lkotlin/jvm/functions/Function2;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v2, "$dirty":I
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v10, "colors":Landroidx/compose/material3/ChipColors;
    .local v15, "enabled":Z
    .local v20, "icon":Lkotlin/jvm/functions/Function2;
    .local v22, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v24, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v28, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_1e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_2f

    .line 831
    const/4 v4, -0x1

    const-string v5, "androidx.compose.material3.SuggestionChip (Chip.kt:830)"

    const v6, 0xa2b9a45

    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 832
    :cond_2f
    nop

    .line 833
    nop

    .line 834
    nop

    .line 835
    nop

    .line 836
    sget-object v4, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v4

    invoke-static {v4, v7, v0}, Landroidx/compose/material3/TypographyKt;->getValue(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v17

    .line 837
    invoke-virtual {v10, v15}, Landroidx/compose/material3/ChipColors;->labelColor-vNxB06k$material3_release(Z)J

    move-result-wide v18

    .line 838
    nop

    .line 839
    nop

    .line 840
    nop

    .line 841
    nop

    .line 842
    nop

    .line 843
    const v0, 0x4a63a0c8    # 3729458.0f

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "842@40163L21"

    invoke-static {v7, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v1, :cond_30

    const/4 v0, 0x0

    goto :goto_1f

    :cond_30
    shr-int/lit8 v0, v2, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v4, v2, 0x15

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    invoke-virtual {v1, v15, v7, v0}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    :goto_1f
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v0, :cond_31

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    goto :goto_20

    :cond_31
    const/4 v0, 0x0

    :goto_20
    move-object/from16 v25, v0

    .line 844
    sget-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    move-result v26

    .line 845
    sget-object v27, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 846
    shr-int/lit8 v0, v2, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, p10

    shl-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v0, v4

    shr-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x6

    const/high16 v5, 0x380000

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    shl-int/lit8 v4, v2, 0x9

    const/high16 v5, 0xe000000

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    const/high16 v4, 0x70000000

    shl-int/lit8 v5, v2, 0x9

    and-int/2addr v4, v5

    or-int v30, v0, v4

    shr-int/lit8 v0, v2, 0x15

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    shr-int/lit8 v4, v2, 0xf

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int v31, v0, v4

    .line 831
    const/16 v21, 0x0

    move-object/from16 v29, v7

    move-object/from16 v23, v10

    move-object/from16 v16, v13

    move-object v13, v3

    .end local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v7    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v10    # "colors":Landroidx/compose/material3/ChipColors;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .local v23, "colors":Landroidx/compose/material3/ChipColors;
    .restart local v29    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v13 .. v31}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 847
    :cond_32
    move-object v9, v1

    move/from16 v19, v2

    move-object v3, v13

    move v4, v15

    move-object/from16 v5, v20

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v10, v28

    .end local v1    # "border":Landroidx/compose/material3/ChipBorder;
    .end local v2    # "$dirty":I
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "enabled":Z
    .end local v20    # "icon":Lkotlin/jvm/functions/Function2;
    .end local v22    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "colors":Landroidx/compose/material3/ChipColors;
    .end local v24    # "elevation":Landroidx/compose/material3/ChipElevation;
    .end local v28    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local v3    # "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "icon":Lkotlin/jvm/functions/Function2;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "colors":Landroidx/compose/material3/ChipColors;
    .local v8, "elevation":Landroidx/compose/material3/ChipElevation;
    .local v9, "border":Landroidx/compose/material3/ChipBorder;
    .local v10, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v19, "$dirty":I
    :goto_21
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_33

    new-instance v0, Landroidx/compose/material3/ChipKt$SuggestionChip$3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$SuggestionChip$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_33
    return-void
.end method

.method public static final synthetic access$Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 0
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "enabled"    # Z
    .param p3, "label"    # Lkotlin/jvm/functions/Function2;
    .param p4, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p5, "labelColor"    # J
    .param p7, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p9, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p10, "colors"    # Landroidx/compose/material3/ChipColors;
    .param p11, "elevation"    # Landroidx/compose/material3/ChipElevation;
    .param p12, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p13, "minHeight"    # F
    .param p14, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p15, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I

    .line 1
    invoke-static/range {p0 .. p18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "label"    # Lkotlin/jvm/functions/Function2;
    .param p1, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p2, "labelColor"    # J
    .param p4, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p5, "avatar"    # Lkotlin/jvm/functions/Function2;
    .param p6, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "leadingIconColor"    # J
    .param p9, "trailingIconColor"    # J
    .param p11, "minHeight"    # F
    .param p12, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I

    .line 1
    invoke-static/range {p0 .. p14}, Landroidx/compose/material3/ChipKt;->ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 0
    .param p0, "selected"    # Z
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p3, "enabled"    # Z
    .param p4, "label"    # Lkotlin/jvm/functions/Function2;
    .param p5, "labelTextStyle"    # Landroidx/compose/ui/text/TextStyle;
    .param p6, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p7, "avatar"    # Lkotlin/jvm/functions/Function2;
    .param p8, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p9, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p10, "colors"    # Landroidx/compose/material3/SelectableChipColors;
    .param p11, "elevation"    # Landroidx/compose/material3/SelectableChipElevation;
    .param p12, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p13, "minHeight"    # F
    .param p14, "paddingValues"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p15, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I

    .line 1
    invoke-static/range {p0 .. p18}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$getHorizontalElementsPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    return v0
.end method

.method public static final getDefaultSuggestionChipColors(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;
    .locals 23
    .param p0, "$this$defaultSuggestionChipColors"    # Landroidx/compose/material3/ColorScheme;

    .line 2539
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/material3/ColorScheme;->getDefaultSuggestionChipColorsCached$material3_release()Landroidx/compose/material3/ChipColors;

    move-result-object v1

    if-nez v1, :cond_0

    .line 2540
    new-instance v2, Landroidx/compose/material3/ChipColors;

    .line 2541
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v3

    .line 2542
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v5

    .line 2543
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v7

    .line 2544
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v9

    .line 2545
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v11

    .line 2547
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLabelTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v13

    .line 2548
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLabelTextOpacity()F

    move-result v15

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    .line 2550
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->fromToken(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J

    move-result-wide v15

    .line 2551
    sget-object v1, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getDisabledLeadingIconOpacity()F

    move-result v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v15

    .line 2552
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v17

    .line 2540
    const/16 v19, 0x0

    invoke-direct/range {v2 .. v19}, Landroidx/compose/material3/ChipColors;-><init>(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2554
    move-object v1, v2

    .line 2826
    .local v1, "it":Landroidx/compose/material3/ChipColors;
    const/4 v3, 0x0

    .line 2554
    .local v3, "$i$a$-also-ChipKt$defaultSuggestionChipColors$1":I
    invoke-virtual {v0, v1}, Landroidx/compose/material3/ColorScheme;->setDefaultSuggestionChipColorsCached$material3_release(Landroidx/compose/material3/ChipColors;)V

    .line 2539
    .end local v1    # "it":Landroidx/compose/material3/ChipColors;
    .end local v3    # "$i$a$-also-ChipKt$defaultSuggestionChipColors$1":I
    :cond_0
    return-object v1
.end method

.method private static final inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 9
    .param p0, "hasAvatar"    # Z
    .param p1, "hasLeadingIcon"    # Z
    .param p2, "hasTrailingIcon"    # Z

    .line 2767
    if-nez p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 2827
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    goto :goto_1

    .line 2767
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    :cond_1
    :goto_0
    const/4 v0, 0x4

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 2827
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 2767
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    :goto_1
    move v3, v2

    .line 2768
    .local v3, "start":F
    if-eqz p2, :cond_2

    const/16 v0, 0x8

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 2828
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move v5, v0

    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    goto :goto_2

    .line 2768
    :cond_2
    const/4 v0, 0x4

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 2828
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    move v5, v2

    .line 2768
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    :goto_2
    nop

    .line 2769
    .local v5, "end":F
    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v0

    return-object v0
.end method

.method static synthetic inputChipPadding$default(ZZZILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 2762
    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    .line 2763
    move p0, v0

    .line 2762
    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    .line 2764
    move p1, v0

    .line 2762
    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    .line 2765
    move p2, v0

    .line 2762
    :cond_2
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/ChipKt;->inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object p0

    return-object p0
.end method
