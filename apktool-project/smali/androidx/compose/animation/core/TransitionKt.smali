.class public final Landroidx/compose/animation/core/TransitionKt;
.super Ljava/lang/Object;
.source "Transition.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2141:1\n1832#1,7:2214\n1832#1,7:2221\n1832#1,7:2228\n1832#1,7:2235\n1832#1,7:2242\n1832#1,7:2249\n1832#1,7:2256\n1832#1,7:2263\n1247#2,6:2142\n1247#2,6:2148\n1247#2,6:2154\n1247#2,6:2160\n1247#2,6:2166\n1247#2,6:2172\n1247#2,6:2178\n1247#2,6:2184\n1247#2,6:2190\n1247#2,6:2196\n1247#2,6:2202\n1247#2,6:2208\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1925#1:2214,7\n1955#1:2221,7\n1985#1:2228,7\n2015#1:2235,7\n2049#1:2242,7\n2079#1:2249,7\n2110#1:2256,7\n2140#1:2263,7\n88#1:2142,6\n90#1:2148,6\n806#1:2154,6\n808#1:2160,6\n819#1:2166,6\n1733#1:2172,6\n1734#1:2178,6\n1762#1:2184,6\n1776#1:2190,6\n1780#1:2196,6\n1851#1:2202,6\n1865#1:2208,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\u0008\u0000\u0010\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\u0008\u0000\u0010\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u0010\u001c\u001a3\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\u0008\u0000\u0010\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u001d2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u0010\u001e\u001ai\u0010\u001f\u001a\u00020\u0011\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014\"\u0008\u0008\u0002\u0010!*\u00020\"*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0$R\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u0002H\u00140(H\u0003\u00a2\u0006\u0002\u0010)\u001a\u0082\u0001\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020,0\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00030+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020\u00030\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00010+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u00108\u001a\u0008\u0012\u0004\u0012\u0002090+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002090(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u0002090\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u0010:\u001a\u0008\u0012\u0004\u0012\u00020;0+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020;0\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u0010<\u001a\u0008\u0012\u0004\u0012\u00020=0+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020=0\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u0010>\u001a\u0008\u0012\u0004\u0012\u00020?0+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020?0(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020?0\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u0082\u0001\u0010@\u001a\u0008\u0012\u0004\u0012\u00020A0+\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00132*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020A0(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u00020A0\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u00105\u001a\u00a6\u0001\u0010B\u001a\u0008\u0012\u0004\u0012\u0002H\u00140+\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014\"\u0008\u0008\u0002\u0010!*\u00020\"*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2*\u0008\n\u0010-\u001a$\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00140(0\u000f\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u0002H\u00140\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u0010E\u001a\\\u0010F\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182&\u0010G\u001a\"\u0012\u0013\u0012\u0011H \u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(H\u0012\u0004\u0012\u0002H\u00140\u000f\u00a2\u0006\u0002\u0008/H\u0087\u0008\u00a2\u0006\u0002\u0010I\u001aA\u0010J\u001a\u0008\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010K\u001a\u0002H\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\u0006\u0010L\u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\u0010M\u001aa\u0010N\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0OR\u0008\u0012\u0004\u0012\u0002H 0\u0013\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014\"\u0008\u0008\u0002\u0010!*\u00020\"*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\u0010P\u001am\u0010Q\u001a\u0008\u0012\u0004\u0012\u0002H\u00140+\"\u0004\u0008\u0000\u0010 \"\u0004\u0008\u0001\u0010\u0014\"\u0008\u0008\u0002\u0010!*\u00020\"*\u0008\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u0002H\u00140(2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\u0010R\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u001b\u0010\u0008\u001a\u00020\t8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000b\"\u001e\u0010\u000e\u001a\u0012\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"
    }
    d2 = {
        "AnimationDebugDurationScale",
        "",
        "NoReset",
        "",
        "ResetAnimationSnap",
        "ResetAnimationSnapCurrent",
        "ResetAnimationSnapTarget",
        "ResetNoSnap",
        "SeekableStateObserver",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "getSeekableStateObserver",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "SeekableStateObserver$delegate",
        "Lkotlin/Lazy;",
        "SeekableTransitionStateTotalDurationChanged",
        "Lkotlin/Function1;",
        "Landroidx/compose/animation/core/SeekableTransitionState;",
        "",
        "rememberTransition",
        "Landroidx/compose/animation/core/Transition;",
        "T",
        "transitionState",
        "Landroidx/compose/animation/core/TransitionState;",
        "label",
        "",
        "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;",
        "updateTransition",
        "targetState",
        "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;",
        "Landroidx/compose/animation/core/MutableTransitionState;",
        "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;",
        "UpdateInitialAndTargetValues",
        "S",
        "V",
        "Landroidx/compose/animation/core/AnimationVector;",
        "transitionAnimation",
        "Landroidx/compose/animation/core/Transition$TransitionAnimationState;",
        "initialValue",
        "targetValue",
        "animationSpec",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V",
        "animateDp",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/ui/unit/Dp;",
        "transitionSpec",
        "Landroidx/compose/animation/core/Transition$Segment;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "targetValueByState",
        "Lkotlin/ParameterName;",
        "name",
        "state",
        "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;",
        "animateFloat",
        "animateInt",
        "animateIntOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "animateIntSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "animateOffset",
        "Landroidx/compose/ui/geometry/Offset;",
        "animateRect",
        "Landroidx/compose/ui/geometry/Rect;",
        "animateSize",
        "Landroidx/compose/ui/geometry/Size;",
        "animateValue",
        "typeConverter",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;",
        "createChildTransition",
        "transformToChildState",
        "parentState",
        "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;",
        "createChildTransitionInternal",
        "initialState",
        "childLabel",
        "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;",
        "createDeferredAnimation",
        "Landroidx/compose/animation/core/Transition$DeferredAnimation;",
        "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;",
        "createTransitionAnimation",
        "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;",
        "animation-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AnimationDebugDurationScale:I = 0x1

.field private static final NoReset:F = -1.0f

.field private static final ResetAnimationSnap:F = -3.0f

.field private static final ResetAnimationSnapCurrent:F = -4.0f

.field private static final ResetAnimationSnapTarget:F = -5.0f

.field private static final ResetNoSnap:F = -2.0f

.field private static final SeekableStateObserver$delegate:Lkotlin/Lazy;

.field private static final SeekableTransitionStateTotalDurationChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/core/SeekableTransitionState<",
            "*>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 200
    sget-object v0, Landroidx/compose/animation/core/TransitionKt$SeekableTransitionStateTotalDurationChanged$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$SeekableTransitionStateTotalDurationChanged$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Landroidx/compose/animation/core/TransitionKt;->SeekableTransitionStateTotalDurationChanged:Lkotlin/jvm/functions/Function1;

    .line 206
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Landroidx/compose/animation/core/TransitionKt$SeekableStateObserver$2;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$SeekableStateObserver$2;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/core/TransitionKt;->SeekableStateObserver$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final UpdateInitialAndTargetValues(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p0, "$this$UpdateInitialAndTargetValues"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionAnimation"    # Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .param p2, "initialValue"    # Ljava/lang/Object;
    .param p3, "targetValue"    # Ljava/lang/Object;
    .param p4, "animationSpec"    # Landroidx/compose/animation/core/FiniteAnimationSpec;
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.TransitionAnimationState<TT;TV;>;TT;TT;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1881
    const v0, 0x33ae021d

    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p5

    const-string v1, "C(UpdateInitialAndTargetValues)P(3,1,2):Transition.kt#pdpnli"

    invoke-static {p5, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move v1, p6

    .local v1, "$dirty":I
    and-int/lit8 v2, p6, 0x6

    if-nez v2, :cond_1

    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    and-int/lit8 v2, p6, 0x30

    if-nez v2, :cond_3

    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p6, 0x180

    if-nez v2, :cond_6

    and-int/lit16 v2, p6, 0x200

    if-nez v2, :cond_4

    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_4
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_3

    :cond_5
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, p6, 0xc00

    if-nez v2, :cond_9

    and-int/lit16 v2, p6, 0x1000

    if-nez v2, :cond_7

    invoke-interface {p5, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_7
    invoke-interface {p5, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_8

    const/16 v2, 0x800

    goto :goto_5

    :cond_8
    const/16 v2, 0x400

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    and-int/lit16 v2, p6, 0x6000

    if-nez v2, :cond_c

    const v2, 0x8000

    and-int/2addr v2, p6

    if-nez v2, :cond_a

    invoke-interface {p5, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_6

    :cond_a
    invoke-interface {p5, p4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_6
    if-eqz v2, :cond_b

    const/16 v2, 0x4000

    goto :goto_7

    :cond_b
    const/16 v2, 0x2000

    :goto_7
    or-int/2addr v1, v2

    :cond_c
    and-int/lit16 v2, v1, 0x2493

    const/16 v3, 0x2492

    if-eq v2, v3, :cond_d

    const/4 v2, 0x1

    goto :goto_8

    :cond_d
    const/4 v2, 0x0

    :goto_8
    and-int/lit8 v3, v1, 0x1

    invoke-interface {p5, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1882
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1884
    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;->updateInitialAndTargetValue$animation_core_release(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    goto :goto_9

    .line 1886
    :cond_f
    invoke-virtual {p1, p3, p4}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;->updateTargetValue$animation_core_release(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_a

    .line 1888
    :cond_10
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_11
    :goto_a
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v2, Landroidx/compose/animation/core/TransitionKt$UpdateInitialAndTargetValues$1;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v8, p6

    .end local p0    # "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .end local p1    # "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .end local p2    # "initialValue":Ljava/lang/Object;
    .end local p3    # "targetValue":Ljava/lang/Object;
    .end local p4    # "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p6    # "$changed":I
    .local v3, "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .local v4, "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .local v5, "initialValue":Ljava/lang/Object;
    .local v6, "targetValue":Ljava/lang/Object;
    .local v7, "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v8, "$changed":I
    invoke-direct/range {v2 .. v8}, Landroidx/compose/animation/core/TransitionKt$UpdateInitialAndTargetValues$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;I)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_b

    .end local v3    # "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .end local v4    # "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .end local v5    # "initialValue":Ljava/lang/Object;
    .end local v6    # "targetValue":Ljava/lang/Object;
    .end local v7    # "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v8    # "$changed":I
    .restart local p0    # "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .restart local p1    # "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .restart local p2    # "initialValue":Ljava/lang/Object;
    .restart local p3    # "targetValue":Ljava/lang/Object;
    .restart local p4    # "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local p6    # "$changed":I
    :cond_12
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v8, p6

    .end local p0    # "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .end local p1    # "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .end local p2    # "initialValue":Ljava/lang/Object;
    .end local p3    # "targetValue":Ljava/lang/Object;
    .end local p4    # "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local p6    # "$changed":I
    .restart local v3    # "$this$UpdateInitialAndTargetValues":Landroidx/compose/animation/core/Transition;
    .restart local v4    # "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .restart local v5    # "initialValue":Ljava/lang/Object;
    .restart local v6    # "targetValue":Ljava/lang/Object;
    .restart local v7    # "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .restart local v8    # "$changed":I
    :goto_b
    return-void
.end method

.method public static final synthetic access$UpdateInitialAndTargetValues(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "$receiver"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionAnimation"    # Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    .param p2, "initialValue"    # Ljava/lang/Object;
    .param p3, "targetValue"    # Ljava/lang/Object;
    .param p4, "animationSpec"    # Landroidx/compose/animation/core/FiniteAnimationSpec;
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/animation/core/TransitionKt;->UpdateInitialAndTargetValues(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$getSeekableTransitionStateTotalDurationChanged$p()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/TransitionKt;->SeekableTransitionStateTotalDurationChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final animateDp(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateDp"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/Dp;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 1955
    .local v9, "$i$f$animateDp":I
    const v1, 0xb02cd07

    const-string v2, "CC(animateDp)P(2)1954@83539L75:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 1950
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateDp$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateDp$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 1955
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 1950
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 1953
    const-string v1, "DpAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 1950
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 1955
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2221
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2223
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2224
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2225
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2227
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2221
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2227
    nop

    .line 1955
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateFloat(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateFloat"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 1925
    .local v9, "$i$f$animateFloat":I
    const v1, -0x4fcbfb15

    const-string v2, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 1920
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateFloat$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateFloat$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 1925
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 1920
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 1923
    const-string v1, "FloatAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 1920
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 1925
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2214
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2216
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2217
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2218
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2220
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2214
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2220
    nop

    .line 1925
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateInt(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateInt"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Integer;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 2079
    .local v9, "$i$f$animateInt":I
    const v1, 0x4e9cdbfe

    const-string v2, "CC(animateInt)P(2)2078@90507L76:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 2074
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateInt$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateInt$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 2079
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 2074
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 2077
    const-string v1, "IntAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 2074
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 2079
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Lkotlin/jvm/internal/IntCompanionObject;->INSTANCE:Lkotlin/jvm/internal/IntCompanionObject;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2249
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2251
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2252
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2253
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2255
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2249
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2255
    nop

    .line 2079
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateIntOffset(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateIntOffset"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 2049
    .local v9, "$i$f$animateIntOffset":I
    const v1, 0x2e42d4f1

    const-string v2, "CC(animateIntOffset)P(2)2048@88801L82:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 2043
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateIntOffset$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateIntOffset$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 2049
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 2043
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 2046
    const-string v1, "IntOffsetAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 2043
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 2049
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2242
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2244
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2245
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2246
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2248
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2242
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2248
    nop

    .line 2049
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateIntSize(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateIntSize"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 2110
    .local v9, "$i$f$animateIntSize":I
    const v1, -0x7d6a5f61

    const-string v2, "CC(animateIntSize)P(2)2109@92259L80:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 2105
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateIntSize$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateIntSize$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 2110
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 2105
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 2108
    const-string v1, "IntSizeAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 2105
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 2110
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2256
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2258
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2259
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2260
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2262
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2256
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2262
    nop

    .line 2110
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateOffset(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateOffset"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 1985
    .local v9, "$i$f$animateOffset":I
    const v1, 0x7be30d0e

    const-string v2, "CC(animateOffset)P(2)1984@85282L79:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 1980
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateOffset$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateOffset$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 1985
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 1980
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 1983
    const-string v1, "OffsetAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 1980
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 1985
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2228
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2230
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2231
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2232
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2234
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2228
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2234
    nop

    .line 1985
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateRect(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateRect"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 2140
    .local v9, "$i$f$animateRect":I
    const v1, 0x592f64df

    const-string v2, "CC(animateRect)P(2)2139@93992L77:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 2135
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateRect$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateRect$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 2140
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 2135
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 2138
    const-string v1, "RectAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 2135
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 2140
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2263
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2265
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2266
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2267
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2269
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2263
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2269
    nop

    .line 2140
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateSize(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$animateSize"    # Landroidx/compose/animation/core/Transition;
    .param p1, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/geometry/Size;",
            ">;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/geometry/Size;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/geometry/Size;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v9, 0x0

    .line 2015
    .local v9, "$i$f$animateSize":I
    const v1, -0x2fd0c404

    const-string v2, "CC(animateSize)P(2)2014@87014L77:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    .line 2010
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateSize$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateSize$1;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    move-object v10, v1

    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v1, "transitionSpec":Lkotlin/jvm/functions/Function3;
    goto :goto_0

    .line 2015
    .end local v1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .restart local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    :cond_0
    move-object/from16 v10, p1

    .line 2010
    .end local p1    # "transitionSpec":Lkotlin/jvm/functions/Function3;
    .local v10, "transitionSpec":Lkotlin/jvm/functions/Function3;
    :goto_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    .line 2013
    const-string v1, "SizeAnimation"

    move-object v11, v1

    .end local p2    # "label":Ljava/lang/String;
    .local v1, "label":Ljava/lang/String;
    goto :goto_1

    .line 2010
    .end local v1    # "label":Ljava/lang/String;
    .restart local p2    # "label":Ljava/lang/String;
    :cond_1
    move-object/from16 v11, p2

    .line 2015
    .end local p2    # "label":Ljava/lang/String;
    .local v11, "label":Ljava/lang/String;
    :goto_1
    sget-object v1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, p5, 0xe

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, p5, 0x3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .local v1, "$changed$iv":I
    move-object v6, v11

    .local v6, "label$iv":Ljava/lang/String;
    move v12, v1

    .end local v1    # "$changed$iv":I
    .local v12, "$changed$iv":I
    move-object/from16 v1, p0

    .local v1, "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    move-object v13, v10

    .local v13, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v14, 0x0

    .line 2235
    .local v14, "$i$f$animateValue":I
    const v2, -0x880d1ef

    const-string v4, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {v7, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 2237
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v4, v12, 0x9

    and-int/lit8 v4, v4, 0x70

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v2, v7, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 2238
    .local v2, "initialValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v4

    shr-int/lit8 v8, v12, 0x9

    and-int/lit8 v8, v8, 0x70

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2239
    .local v4, "targetValue$iv":Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v8

    shr-int/lit8 v15, v12, 0x3

    and-int/lit8 v15, v15, 0x70

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v13, v8, v7, v15}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2241
    .local v8, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v15, v12, 0xe

    shl-int/lit8 v16, v12, 0x9

    and-int v3, v16, v3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v12, 0x6

    const/high16 v16, 0x70000

    and-int v15, v15, v16

    or-int/2addr v3, v15

    move-object/from16 v17, v8

    move v8, v3

    move-object v3, v4

    move-object/from16 v4, v17

    .end local v8    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .local v3, "targetValue$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 2235
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 2241
    nop

    .line 2015
    .end local v1    # "$this$animateValue$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v12    # "$changed$iv":I
    .end local v13    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v14    # "$i$f$animateValue":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v8
.end method

.method public static final animateValue(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 9
    .param p0, "$this$animateValue"    # Landroidx/compose/animation/core/Transition;
    .param p1, "typeConverter"    # Landroidx/compose/animation/core/TwoWayConverter;
    .param p2, "transitionSpec"    # Lkotlin/jvm/functions/Function3;
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "targetValueByState"    # Lkotlin/jvm/functions/Function3;
    .param p5, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p6, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/animation/core/Transition$Segment<",
            "TS;>;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1832
    .local v0, "$i$f$animateValue":I
    const v1, -0x880d1ef

    const-string v2, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli"

    invoke-static {p5, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_0

    .line 1827
    sget-object v1, Landroidx/compose/animation/core/TransitionKt$animateValue$1;->INSTANCE:Landroidx/compose/animation/core/TransitionKt$animateValue$1;

    move-object p2, v1

    check-cast p2, Lkotlin/jvm/functions/Function3;

    :cond_0
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_1

    .line 1830
    const-string p3, "ValueAnimation"

    move-object v6, p3

    goto :goto_0

    .line 1827
    :cond_1
    move-object v6, p3

    .line 1834
    .end local p3    # "label":Ljava/lang/String;
    .local v6, "label":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object p3

    shr-int/lit8 v1, p6, 0x9

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, p3, p5, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1835
    .local v2, "initialValue":Ljava/lang/Object;
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object p3

    shr-int/lit8 v1, p6, 0x9

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, p3, p5, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1836
    .local v3, "targetValue":Ljava/lang/Object;
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object p3

    shr-int/lit8 v1, p6, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p3, p5, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 1838
    .local v4, "animationSpec":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 p3, p6, 0xe

    const v1, 0xe000

    shl-int/lit8 v5, p6, 0x9

    and-int/2addr v1, v5

    or-int/2addr p3, v1

    shl-int/lit8 v1, p6, 0x6

    const/high16 v5, 0x70000

    and-int/2addr v1, v5

    or-int v8, p3, v1

    move-object v1, p0

    move-object v5, p1

    move-object v7, p5

    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p3

    .line 1832
    invoke-static {p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1838
    return-object p3
.end method

.method public static final createChildTransition(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
    .locals 8
    .param p0, "$this$createChildTransition"    # Landroidx/compose/animation/core/Transition;
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "transformToChildState"    # Lkotlin/jvm/functions/Function3;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-TS;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1761
    .local v0, "$i$f$createChildTransition":I
    const v1, 0x48730564

    const-string v2, "CC(createChildTransition)1761@74780L36,1762@74840L74,1763@74937L39,1764@74988L63:Transition.kt#pdpnli"

    invoke-static {p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v1, 0x1

    and-int/2addr p5, v1

    if-eqz p5, :cond_0

    .line 1759
    const-string p1, "ChildTransition"

    move-object v5, p1

    goto :goto_0

    .line 1761
    :cond_0
    move-object v5, p1

    .line 1759
    .end local p1    # "label":Ljava/lang/String;
    .local v5, "label":Ljava/lang/String;
    :goto_0
    nop

    .line 1762
    const p1, 0x10371eb5

    const-string p5, "CC(remember):Transition.kt#9igjgp"

    invoke-static {p3, p1, p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p1, p4, 0xe

    xor-int/lit8 p1, p1, 0x6

    const/4 p5, 0x4

    if-le p1, p5, :cond_1

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    and-int/lit8 p1, p4, 0x6

    if-ne p1, p5, :cond_3

    :cond_2
    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .local v1, "invalid$iv":Z
    :goto_1
    move-object p1, p3

    .local p1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 p5, 0x0

    .line 2184
    .local p5, "$i$f$cache":I
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 2185
    .local v3, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_5

    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_4

    goto :goto_2

    .line 2189
    :cond_4
    goto :goto_3

    .line 2186
    :cond_5
    :goto_2
    const/4 v4, 0x0

    .line 1762
    .local v4, "$i$a$-cache-TransitionKt$createChildTransition$initialParentState$1":I
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v4

    .line 2186
    .end local v4    # "$i$a$-cache-TransitionKt$createChildTransition$initialParentState$1":I
    nop

    .line 2187
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2188
    move-object v2, v4

    .line 2184
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v4    # "value$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 1762
    .end local v1    # "invalid$iv":Z
    .end local p1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p5    # "$i$f$cache":I
    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object p1, v2

    .line 1763
    .local p1, "initialParentState":Ljava/lang/Object;
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result p5

    if-eqz p5, :cond_6

    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object p5

    goto :goto_4

    :cond_6
    move-object p5, p1

    :goto_4
    shr-int/lit8 v1, p4, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p5, p3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1764
    .local v3, "initialState":Ljava/lang/Object;
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object p5

    shr-int/lit8 v1, p4, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p5, p3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1765
    .local v4, "targetState":Ljava/lang/Object;
    and-int/lit8 p5, p4, 0xe

    shl-int/lit8 v1, p4, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v7, p5, v1

    move-object v2, p0

    move-object v6, p3

    .end local p0    # "$this$createChildTransition":Landroidx/compose/animation/core/Transition;
    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$this$createChildTransition":Landroidx/compose/animation/core/Transition;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v7}, Landroidx/compose/animation/core/TransitionKt;->createChildTransitionInternal(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;

    move-result-object p0

    .line 1761
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1765
    return-object p0
.end method

.method public static final createChildTransitionInternal(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;
    .locals 16
    .param p0, "$this$createChildTransitionInternal"    # Landroidx/compose/animation/core/Transition;
    .param p1, "initialState"    # Ljava/lang/Object;
    .param p2, "targetState"    # Ljava/lang/Object;
    .param p3, "childLabel"    # Ljava/lang/String;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;TT;TT;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;"
        }
    .end annotation

    .line 1774
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move/from16 v4, p5

    const v5, -0xbd1ef36

    const-string v6, "C(createChildTransitionInternal)P(1,2)1775@75259L124,1779@75418L92,1779@75389L121:Transition.kt#pdpnli"

    invoke-static {v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, -0x1

    const-string v7, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)"

    invoke-static {v5, v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1776
    :cond_0
    const v5, 0x3df2a18a

    const-string v6, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v5, v4, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v9, 0x4

    if-le v5, v9, :cond_1

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    and-int/lit8 v5, v4, 0x6

    if-ne v5, v9, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    .local v5, "invalid$iv":Z
    :goto_0
    move-object/from16 v10, p4

    .local v10, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 2190
    .local v11, "$i$f$cache":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 2191
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_5

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_4

    goto :goto_1

    .line 2195
    :cond_4
    move-object/from16 v9, p3

    goto :goto_2

    .line 2192
    :cond_5
    :goto_1
    const/4 v14, 0x0

    .line 1777
    .local v14, "$i$a$-cache-TransitionKt$createChildTransitionInternal$transition$1":I
    new-instance v15, Landroidx/compose/animation/core/Transition;

    new-instance v7, Landroidx/compose/animation/core/MutableTransitionState;

    invoke-direct {v7, v1}, Landroidx/compose/animation/core/MutableTransitionState;-><init>(Ljava/lang/Object;)V

    check-cast v7, Landroidx/compose/animation/core/TransitionState;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " > "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    move-object/from16 v9, p3

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v15, v7, v0, v8}, Landroidx/compose/animation/core/Transition;-><init>(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V

    .line 2192
    .end local v14    # "$i$a$-cache-TransitionKt$createChildTransitionInternal$transition$1":I
    nop

    .line 2193
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2194
    move-object v12, v15

    .line 2190
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 1776
    .end local v5    # "invalid$iv":Z
    .end local v10    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    check-cast v12, Landroidx/compose/animation/core/Transition;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1775
    nop

    .line 1780
    .local v12, "transition":Landroidx/compose/animation/core/Transition;
    const v5, 0x3df2b54a

    invoke-static {v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v5, v4, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x4

    if-le v5, v6, :cond_6

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x4

    if-ne v5, v6, :cond_8

    :cond_7
    const/4 v7, 0x1

    goto :goto_3

    :cond_8
    const/4 v7, 0x0

    :goto_3
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v7

    .restart local v5    # "invalid$iv":Z
    move-object/from16 v6, p4

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 2196
    .local v7, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 2197
    .local v10, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v5, :cond_a

    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_9

    goto :goto_4

    .line 2201
    :cond_9
    goto :goto_5

    .line 2198
    :cond_a
    :goto_4
    const/4 v11, 0x0

    .line 1780
    .local v11, "$i$a$-cache-TransitionKt$createChildTransitionInternal$1":I
    new-instance v13, Landroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1;

    invoke-direct {v13, v0, v12}, Landroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition;)V

    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 2198
    .end local v11    # "$i$a$-cache-TransitionKt$createChildTransitionInternal$1":I
    nop

    .line 2199
    .local v13, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2200
    move-object v8, v13

    .line 2196
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v13    # "value$iv":Ljava/lang/Object;
    :goto_5
    nop

    .line 1780
    .end local v5    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v5, 0x0

    invoke-static {v12, v8, v3, v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 1785
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result v5

    if-eqz v5, :cond_b

    .line 1786
    nop

    .line 1787
    nop

    .line 1788
    nop

    .line 1789
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getLastSeekedTimeNanos$animation_core_release()J

    move-result-wide v5

    .line 1786
    invoke-virtual {v12, v1, v2, v5, v6}, Landroidx/compose/animation/core/Transition;->seek(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto :goto_6

    .line 1792
    :cond_b
    invoke-virtual {v12, v2}, Landroidx/compose/animation/core/Transition;->updateTarget$animation_core_release(Ljava/lang/Object;)V

    .line 1793
    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Landroidx/compose/animation/core/Transition;->setSeeking$animation_core_release(Z)V

    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1774
    :cond_c
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1795
    return-object v12
.end method

.method public static final createDeferredAnimation(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
    .locals 10
    .param p0, "$this$createDeferredAnimation"    # Landroidx/compose/animation/core/Transition;
    .param p1, "typeConverter"    # Landroidx/compose/animation/core/TwoWayConverter;
    .param p2, "label"    # Ljava/lang/String;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>.DeferredAnimation<TT;TV;>;"
        }
    .end annotation

    .line 1732
    const v0, -0x662b6f20

    const-string v1, "C(createDeferredAnimation)P(1)1732@73286L58,1733@73376L43,1733@73349L70:Transition.kt#pdpnli"

    invoke-static {p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 1731
    const-string p2, "DeferredAnimation"

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 1732
    const/4 p5, -0x1

    const-string v1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)"

    invoke-static {v0, p4, p5, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    nop

    .line 1733
    const p5, -0x5225de21

    const-string v0, "CC(remember):Transition.kt#9igjgp"

    invoke-static {p3, p5, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p5, p4, 0xe

    xor-int/lit8 p5, p5, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le p5, v3, :cond_2

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_3

    :cond_2
    and-int/lit8 p5, p4, 0x6

    if-ne p5, v3, :cond_4

    :cond_3
    move p5, v1

    goto :goto_0

    :cond_4
    move p5, v2

    .local p5, "invalid$iv":Z
    :goto_0
    move-object v4, p3

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 2172
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 2173
    .local v7, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p5, :cond_6

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_5

    goto :goto_1

    .line 2177
    :cond_5
    goto :goto_2

    .line 2174
    :cond_6
    :goto_1
    const/4 v8, 0x0

    .line 1733
    .local v8, "$i$a$-cache-TransitionKt$createDeferredAnimation$lazyAnim$1":I
    new-instance v9, Landroidx/compose/animation/core/Transition$DeferredAnimation;

    invoke-direct {v9, p0, p1, p2}, Landroidx/compose/animation/core/Transition$DeferredAnimation;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V

    .line 2174
    .end local v8    # "$i$a$-cache-TransitionKt$createDeferredAnimation$lazyAnim$1":I
    nop

    .line 2175
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2176
    move-object v6, v9

    .line 2172
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 1733
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    move-object p5, v6

    check-cast p5, Landroidx/compose/animation/core/Transition$DeferredAnimation;

    .local p5, "lazyAnim":Landroidx/compose/animation/core/Transition$DeferredAnimation;
    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1734
    const v4, -0x5225d2f0

    invoke-static {p3, v4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p4, 0xe

    xor-int/lit8 v0, v0, 0x6

    if-le v0, v3, :cond_7

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    and-int/lit8 v0, p4, 0x6

    if-ne v0, v3, :cond_9

    :cond_8
    goto :goto_3

    :cond_9
    move v1, v2

    :goto_3
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    .local v0, "invalid$iv":Z
    move-object v1, p3

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 2178
    .local v3, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 2179
    .local v5, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_b

    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_a

    goto :goto_4

    .line 2183
    :cond_a
    goto :goto_5

    .line 2180
    :cond_b
    :goto_4
    const/4 v6, 0x0

    .line 1734
    .local v6, "$i$a$-cache-TransitionKt$createDeferredAnimation$1":I
    new-instance v7, Landroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1;

    invoke-direct {v7, p0, p5}, Landroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2180
    .end local v6    # "$i$a$-cache-TransitionKt$createDeferredAnimation$1":I
    nop

    .line 2181
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2182
    move-object v4, v7

    .line 2178
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v7    # "value$iv":Ljava/lang/Object;
    :goto_5
    nop

    .line 1734
    .end local v0    # "invalid$iv":Z
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache":I
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {p5, v4, p3, v2}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 1735
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1736
    invoke-virtual {p5}, Landroidx/compose/animation/core/Transition$DeferredAnimation;->setupSeeking$animation_core_release()V

    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1732
    :cond_d
    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1738
    return-object p5
.end method

.method public static final createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 18
    .param p0, "$this$createTransitionAnimation"    # Landroidx/compose/animation/core/Transition;
    .param p1, "initialValue"    # Ljava/lang/Object;
    .param p2, "targetValue"    # Ljava/lang/Object;
    .param p3, "animationSpec"    # Landroidx/compose/animation/core/FiniteAnimationSpec;
    .param p4, "typeConverter"    # Landroidx/compose/animation/core/TwoWayConverter;
    .param p5, "label"    # Ljava/lang/String;
    .param p6, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p7, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            "V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;TT;TT;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .line 1849
    move-object/from16 v0, p0

    move-object/from16 v6, p6

    move/from16 v7, p7

    const v1, -0x122b33ce

    const-string v2, "C(createTransitionAnimation)P(1,3!1,4)1850@78332L543,1862@78880L91,1864@79015L108,1864@78977L146:Transition.kt#pdpnli"

    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)"

    invoke-static {v1, v7, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 1851
    :cond_0
    const v1, 0x534f5f4e

    const-string v8, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v6, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, v7, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x4

    if-le v1, v11, :cond_1

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit8 v1, v7, 0x6

    if-ne v1, v11, :cond_3

    :cond_2
    move v1, v9

    goto :goto_0

    :cond_3
    move v1, v10

    :goto_0
    move v12, v1

    .local v12, "invalid$iv":Z
    move-object/from16 v13, p6

    .local v13, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 2202
    .local v14, "$i$f$cache":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 2203
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v12, :cond_5

    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v15, v1, :cond_4

    goto :goto_1

    .line 2207
    :cond_4
    goto :goto_2

    .line 2204
    :cond_5
    :goto_1
    const/16 v17, 0x0

    .line 1856
    .local v17, "$i$a$-cache-TransitionKt$createTransitionAnimation$transitionAnimation$1":I
    new-instance v0, Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    .line 1857
    nop

    .line 1858
    move-object/from16 v1, p2

    move-object/from16 v4, p4

    invoke-static {v4, v1}, Landroidx/compose/animation/core/AnimationStateKt;->createZeroVectorFrom(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v3

    .line 1859
    nop

    .line 1860
    nop

    .line 1856
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/Transition$TransitionAnimationState;-><init>(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V

    .line 1861
    nop

    .line 2204
    .end local v17    # "$i$a$-cache-TransitionKt$createTransitionAnimation$transitionAnimation$1":I
    nop

    .line 2205
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2206
    move-object v15, v0

    .line 2202
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2
    nop

    .line 1851
    .end local v12    # "invalid$iv":Z
    .end local v13    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    move-object v1, v15

    check-cast v1, Landroidx/compose/animation/core/Transition$TransitionAnimationState;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1850
    nop

    .line 1863
    .local v1, "transitionAnimation":Landroidx/compose/animation/core/Transition$TransitionAnimationState;
    and-int/lit8 v0, v7, 0xe

    shr-int/lit8 v2, v7, 0x3

    and-int/lit8 v2, v2, 0x8

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v0, v2

    shl-int/lit8 v2, v7, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shr-int/lit8 v2, v7, 0x3

    and-int/lit8 v2, v2, 0x8

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v0, v2

    shl-int/lit8 v2, v7, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    shl-int/lit8 v3, v7, 0x3

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v6

    move v6, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/animation/core/TransitionKt;->UpdateInitialAndTargetValues(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V

    .line 1865
    const v2, 0x534fb2fb

    invoke-static {v5, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v7, 0xe

    xor-int/lit8 v2, v2, 0x6

    if-le v2, v11, :cond_6

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    and-int/lit8 v2, v7, 0x6

    if-ne v2, v11, :cond_8

    :cond_7
    goto :goto_3

    :cond_8
    move v9, v10

    :goto_3
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v9

    .local v2, "invalid$iv":Z
    move-object/from16 v3, p6

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 2208
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 2209
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_a

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_9

    goto :goto_4

    .line 2213
    :cond_9
    goto :goto_5

    .line 2210
    :cond_a
    :goto_4
    const/4 v9, 0x0

    .line 1865
    .local v9, "$i$a$-cache-TransitionKt$createTransitionAnimation$1":I
    new-instance v11, Landroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1;

    invoke-direct {v11, v0, v1}, Landroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V

    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 2210
    .end local v9    # "$i$a$-cache-TransitionKt$createTransitionAnimation$1":I
    nop

    .line 2211
    .local v11, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2212
    move-object v6, v11

    .line 2208
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v11    # "value$iv":Ljava/lang/Object;
    :goto_5
    nop

    .line 1865
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v1, v6, v5, v10}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1849
    :cond_b
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/State;

    .line 1869
    return-object v2
.end method

.method public static final getSeekableStateObserver()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .locals 1

    .line 205
    sget-object v0, Landroidx/compose/animation/core/TransitionKt;->SeekableStateObserver$delegate:Lkotlin/Lazy;

    .line 206
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    return-object v0
.end method

.method public static final rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
    .locals 16
    .param p0, "transitionState"    # Landroidx/compose/animation/core/TransitionState;
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/TransitionState<",
            "TT;>;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;"
        }
    .end annotation

    .line 804
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const v3, 0x61f14c21

    const-string v4, "C(rememberTransition)P(1)805@34726L82,818@35438L190,818@35409L219:Transition.kt#pdpnli"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_0

    .line 803
    const/4 v4, 0x0

    .end local p1    # "label":Ljava/lang/String;
    .local v4, "label":Ljava/lang/String;
    goto :goto_0

    .line 804
    .end local v4    # "label":Ljava/lang/String;
    .restart local p1    # "label":Ljava/lang/String;
    :cond_0
    move-object/from16 v4, p1

    .line 803
    .end local p1    # "label":Ljava/lang/String;
    .restart local v4    # "label":Ljava/lang/String;
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 804
    const/4 v5, -0x1

    const-string v6, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)"

    invoke-static {v3, v2, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    nop

    .line 806
    const v3, 0x23039478

    const-string v5, "CC(remember):Transition.kt#9igjgp"

    invoke-static {v1, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v6, 0x1

    const/4 v7, 0x4

    if-le v3, v7, :cond_2

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    and-int/lit8 v3, v2, 0x6

    if-ne v3, v7, :cond_4

    :cond_3
    move v3, v6

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    :goto_1
    move-object/from16 v9, p2

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 2154
    .local v10, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 2155
    .local v12, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_6

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_5

    goto :goto_2

    .line 2159
    :cond_5
    goto :goto_3

    .line 2156
    :cond_6
    :goto_2
    const/4 v13, 0x0

    .line 806
    .local v13, "$i$a$-cache-TransitionKt$rememberTransition$transition$1":I
    new-instance v14, Landroidx/compose/animation/core/Transition;

    invoke-direct {v14, v0, v4}, Landroidx/compose/animation/core/Transition;-><init>(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V

    .line 2156
    .end local v13    # "$i$a$-cache-TransitionKt$rememberTransition$transition$1":I
    nop

    .line 2157
    .local v14, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2158
    move-object v11, v14

    .line 2154
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v14    # "value$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 806
    .end local v3    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    check-cast v11, Landroidx/compose/animation/core/Transition;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 805
    nop

    .line 807
    .local v11, "transition":Landroidx/compose/animation/core/Transition;
    instance-of v3, v0, Landroidx/compose/animation/core/SeekableTransitionState;

    if-eqz v3, :cond_c

    const v3, 0x3d7134e4

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "807@34945L382,807@34871L456"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 808
    invoke-virtual {v0}, Landroidx/compose/animation/core/TransitionState;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Landroidx/compose/animation/core/TransitionState;->getTargetState()Ljava/lang/Object;

    move-result-object v9

    const v10, 0x2303b104

    invoke-static {v1, v10, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v10, v2, 0xe

    xor-int/lit8 v10, v10, 0x6

    if-le v10, v7, :cond_7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    and-int/lit8 v10, v2, 0x6

    if-ne v10, v7, :cond_9

    :cond_8
    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    .local v6, "invalid$iv":Z
    :goto_4
    move-object/from16 v7, p2

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 2160
    .restart local v10    # "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 2161
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v6, :cond_b

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_a

    goto :goto_5

    .line 2165
    :cond_a
    goto :goto_6

    .line 2162
    :cond_b
    :goto_5
    const/4 v14, 0x0

    .line 808
    .local v14, "$i$a$-cache-TransitionKt$rememberTransition$1":I
    new-instance v15, Landroidx/compose/animation/core/TransitionKt$rememberTransition$1$1;

    const/4 v8, 0x0

    invoke-direct {v15, v0, v8}, Landroidx/compose/animation/core/TransitionKt$rememberTransition$1$1;-><init>(Landroidx/compose/animation/core/TransitionState;Lkotlin/coroutines/Continuation;)V

    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 2162
    .end local v14    # "$i$a$-cache-TransitionKt$rememberTransition$1":I
    nop

    .line 2163
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2164
    move-object v12, v15

    .line 2160
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_6
    nop

    .line 808
    .end local v6    # "invalid$iv":Z
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    check-cast v12, Lkotlin/jvm/functions/Function2;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v6, 0x0

    invoke-static {v3, v9, v12, v1, v6}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 807
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_7

    .line 816
    :cond_c
    const/4 v6, 0x0

    const v3, 0x3d783fdb

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "816@35360L38"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 817
    invoke-virtual {v0}, Landroidx/compose/animation/core/TransitionState;->getTargetState()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v11, v3, v1, v6}, Landroidx/compose/animation/core/Transition;->animateTo$animation_core_release(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    .line 816
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 819
    :goto_7
    const v3, 0x2303ede4

    invoke-static {v1, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .restart local v3    # "invalid$iv":Z
    move-object/from16 v5, p2

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 2166
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 2167
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_e

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_d

    goto :goto_8

    .line 2171
    :cond_d
    goto :goto_9

    .line 2168
    :cond_e
    :goto_8
    const/4 v9, 0x0

    .line 819
    .local v9, "$i$a$-cache-TransitionKt$rememberTransition$2":I
    new-instance v10, Landroidx/compose/animation/core/TransitionKt$rememberTransition$2$1;

    invoke-direct {v10, v11}, Landroidx/compose/animation/core/TransitionKt$rememberTransition$2$1;-><init>(Landroidx/compose/animation/core/Transition;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 2168
    .end local v9    # "$i$a$-cache-TransitionKt$rememberTransition$2":I
    nop

    .line 2169
    .local v10, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2170
    move-object v7, v10

    .line 2166
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v10    # "value$iv":Ljava/lang/Object;
    :goto_9
    nop

    .line 819
    .end local v3    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v6, 0x0

    invoke-static {v11, v7, v1, v6}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 804
    :cond_f
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 826
    return-object v11
.end method

.method public static final updateTransition(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
    .locals 2
    .param p0, "transitionState"    # Landroidx/compose/animation/core/MutableTransitionState;
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/MutableTransitionState<",
            "TT;>;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use rememberTransition() instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "rememberTransition(transitionState, label)"
            imports = {}
        .end subannotation
    .end annotation

    .line 857
    const v0, 0x34a03233

    const-string v1, "C(updateTransition)P(1)858@37095L32:Transition.kt#pdpnli"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 856
    const/4 p1, 0x0

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 857
    const/4 p4, -0x1

    const-string v1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)"

    invoke-static {v0, p3, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 858
    :cond_1
    move-object p4, p0

    check-cast p4, Landroidx/compose/animation/core/TransitionState;

    .line 859
    .local p4, "state":Landroidx/compose/animation/core/TransitionState;
    and-int/lit8 v0, p3, 0xe

    and-int/lit8 v1, p3, 0x70

    or-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {p4, p1, p2, v0, v1}, Landroidx/compose/animation/core/TransitionKt;->rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 857
    :cond_2
    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 859
    return-object v0
.end method

.method public static final updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
    .locals 7
    .param p0, "targetState"    # Ljava/lang/Object;
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;"
        }
    .end annotation

    .line 87
    const v0, 0x78f2a0ad

    const-string v1, "C(updateTransition)P(1)87@3839L51,88@3906L22,89@3962L190,89@3933L219:Transition.kt#pdpnli"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)"

    invoke-static {v0, p3, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    :cond_1
    const p4, -0x274bef4b

    const-string v0, "CC(remember):Transition.kt#9igjgp"

    invoke-static {p2, p4, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 p4, 0x0

    .local p4, "invalid$iv":Z
    move-object v1, p2

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 2142
    .local v2, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 2143
    .local v4, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_2

    .line 2144
    const/4 v5, 0x0

    .line 88
    .local v5, "$i$a$-cache-TransitionKt$updateTransition$transition$1":I
    new-instance v6, Landroidx/compose/animation/core/Transition;

    invoke-direct {v6, p0, p1}, Landroidx/compose/animation/core/Transition;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2144
    .end local v5    # "$i$a$-cache-TransitionKt$updateTransition$transition$1":I
    nop

    .line 2145
    .local v6, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2146
    move-object v3, v6

    .end local v6    # "value$iv":Ljava/lang/Object;
    goto :goto_0

    .line 2147
    :cond_2
    nop

    .line 2142
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_0
    nop

    .line 88
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    move-object p4, v3

    check-cast p4, Landroidx/compose/animation/core/Transition;

    .local p4, "transition":Landroidx/compose/animation/core/Transition;
    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 89
    and-int/lit8 v1, p3, 0x8

    or-int/lit8 v1, v1, 0x30

    and-int/lit8 v2, p3, 0xe

    or-int/2addr v1, v2

    invoke-virtual {p4, p0, p2, v1}, Landroidx/compose/animation/core/Transition;->animateTo$animation_core_release(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V

    .line 90
    const v1, -0x274bdf60

    invoke-static {p2, v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid$iv":Z
    move-object v1, p2

    .restart local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 2148
    .restart local v2    # "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .restart local v3    # "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 2149
    .restart local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_3

    .line 2150
    const/4 v5, 0x0

    .line 90
    .local v5, "$i$a$-cache-TransitionKt$updateTransition$1":I
    new-instance v6, Landroidx/compose/animation/core/TransitionKt$updateTransition$1$1;

    invoke-direct {v6, p4}, Landroidx/compose/animation/core/TransitionKt$updateTransition$1$1;-><init>(Landroidx/compose/animation/core/Transition;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 2150
    .end local v5    # "$i$a$-cache-TransitionKt$updateTransition$1":I
    nop

    .line 2151
    .restart local v6    # "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 2152
    move-object v3, v6

    .end local v6    # "value$iv":Ljava/lang/Object;
    goto :goto_1

    .line 2153
    :cond_3
    nop

    .line 2148
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_1
    nop

    .line 90
    .end local v0    # "invalid$iv":Z
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v0, 0x36

    invoke-static {p4, v3, p2, v0}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 87
    :cond_4
    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 97
    return-object p4
.end method
