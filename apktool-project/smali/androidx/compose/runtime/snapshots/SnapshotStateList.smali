.class public final Landroidx/compose/runtime/snapshots/SnapshotStateList;
.super Ljava/lang/Object;
.source "SnapshotStateList.kt"

# interfaces
.implements Landroidx/compose/runtime/snapshots/StateObject;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Lkotlin/jvm/internal/markers/KMutableList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "Ljava/util/List<",
        "TT;>;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/jvm/internal/markers/KMutableList;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n183#1:540\n216#1,9:548\n225#1:559\n183#1:560\n226#1,9:562\n180#1:571\n235#1,6:581\n209#1,16:587\n225#1:605\n183#1:606\n226#1,9:608\n180#1:617\n235#1,6:627\n214#1:633\n216#1,9:634\n225#1:645\n183#1:646\n226#1,9:648\n180#1:657\n235#1,6:667\n180#1:673\n216#1,9:686\n225#1:697\n183#1:698\n226#1,9:700\n180#1:709\n235#1,6:719\n216#1,9:725\n225#1:736\n183#1:737\n226#1,9:739\n180#1:748\n235#1,6:758\n209#1,16:765\n225#1:783\n183#1:784\n226#1,9:786\n180#1:795\n235#1,6:805\n214#1:811\n213#1,12:813\n225#1:827\n183#1:828\n226#1,9:830\n180#1:839\n235#1,6:849\n214#1:855\n188#1,5:856\n193#1:863\n183#1:864\n194#1,9:866\n180#1:875\n204#1,3:885\n188#1,5:888\n193#1:895\n183#1:896\n194#1,9:898\n180#1:907\n204#1,3:917\n183#1:920\n188#1,5:934\n193#1:941\n183#1:942\n194#1,9:944\n180#1:953\n204#1,3:963\n183#1:968\n180#1:970\n219#1,6:982\n225#1:990\n183#1:991\n226#1,9:993\n180#1:1002\n235#1,6:1012\n219#1,7:1018\n183#1:1025\n226#1,9:1027\n180#1:1036\n235#1,6:1045\n183#1:1053\n180#1:1055\n183#1:1069\n180#1:1071\n2475#2:541\n2475#2:547\n2475#2:561\n2365#2,2:572\n1894#2,2:574\n2367#2,4:576\n2475#2:607\n2365#2,2:618\n1894#2,2:620\n2367#2,4:622\n2475#2:647\n2365#2,2:658\n1894#2,2:660\n2367#2,4:662\n2365#2,2:674\n1894#2,2:676\n2367#2,2:680\n2370#2:684\n2475#2:699\n2365#2,2:710\n1894#2,2:712\n2367#2,4:714\n2475#2:738\n2365#2,2:749\n1894#2,2:751\n2367#2,4:753\n2475#2:785\n2365#2,2:796\n1894#2,2:798\n2367#2,4:800\n2475#2:829\n2365#2,2:840\n1894#2,2:842\n2367#2,4:844\n2475#2:865\n2365#2,2:876\n1894#2,2:878\n2367#2,4:880\n2475#2:897\n2365#2,2:908\n1894#2,2:910\n2367#2,4:912\n2475#2:921\n2365#2,2:922\n1894#2,2:924\n2367#2,4:928\n2475#2:933\n2475#2:943\n2365#2,2:954\n1894#2,2:956\n2367#2,4:958\n2475#2:969\n2365#2,2:971\n1894#2,2:973\n2367#2,4:977\n2475#2:992\n2365#2,2:1003\n1894#2,2:1005\n2367#2,4:1007\n2475#2:1026\n2365#2,2:1037\n1894#2,2:1039\n2367#2,4:1041\n2475#2:1054\n2365#2,2:1056\n1894#2,2:1058\n2367#2,4:1062\n2475#2:1070\n2365#2,2:1072\n1894#2,2:1074\n2367#2,4:1078\n33#3,5:542\n33#4,2:557\n33#4,2:603\n33#4,2:643\n33#4,2:678\n33#4,2:682\n33#4,2:695\n33#4,2:734\n33#4,2:781\n33#4,2:825\n33#4,2:861\n33#4,2:893\n33#4,2:926\n33#4,2:939\n33#4,2:966\n33#4,2:975\n33#4,2:988\n33#4,2:1051\n33#4,2:1060\n33#4,2:1067\n33#4,2:1076\n33#4,2:1082\n1#5:580\n1#5:626\n1#5:666\n1#5:685\n1#5:718\n1#5:757\n1#5:764\n1#5:804\n1#5:812\n1#5:848\n1#5:884\n1#5:916\n1#5:932\n1#5:962\n1#5:981\n1#5:1011\n1#5:1066\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n67#1:540\n129#1:548,9\n129#1:559\n129#1:560\n129#1:562,9\n129#1:571\n129#1:581,6\n131#1:587,16\n131#1:605\n131#1:606\n131#1:608,9\n131#1:617\n131#1:627,6\n131#1:633\n137#1:634,9\n137#1:645\n137#1:646\n137#1:648,9\n137#1:657\n137#1:667,6\n140#1:673\n149#1:686,9\n149#1:697\n149#1:698\n149#1:700,9\n149#1:709\n149#1:719,6\n151#1:725,9\n151#1:736\n151#1:737\n151#1:739,9\n151#1:748\n151#1:758,6\n153#1:765,16\n153#1:783\n153#1:784\n153#1:786,9\n153#1:795\n153#1:805,6\n153#1:811\n158#1:813,12\n158#1:827\n158#1:828\n158#1:830,9\n158#1:839\n158#1:849,6\n158#1:855\n161#1:856,5\n161#1:863\n161#1:864\n161#1:866,9\n161#1:875\n161#1:885,3\n166#1:888,5\n166#1:895\n166#1:896\n166#1:898,9\n166#1:907\n166#1:917,3\n176#1:920\n185#1:934,5\n185#1:941\n185#1:942\n185#1:944,9\n185#1:953\n185#1:963,3\n193#1:968\n202#1:970\n213#1:982,6\n213#1:990\n213#1:991\n213#1:993,9\n213#1:1002\n213#1:1012,6\n213#1:1018,7\n213#1:1025\n213#1:1027,9\n213#1:1036\n213#1:1045,6\n225#1:1053\n234#1:1055\n225#1:1069\n234#1:1071\n67#1:541\n125#1:547\n129#1:561\n129#1:572,2\n129#1:574,2\n129#1:576,4\n131#1:607\n131#1:618,2\n131#1:620,2\n131#1:622,4\n137#1:647\n137#1:658,2\n137#1:660,2\n137#1:662,4\n140#1:674,2\n140#1:676,2\n140#1:680,2\n140#1:684\n149#1:699\n149#1:710,2\n149#1:712,2\n149#1:714,4\n151#1:738\n151#1:749,2\n151#1:751,2\n151#1:753,4\n153#1:785\n153#1:796,2\n153#1:798,2\n153#1:800,4\n158#1:829\n158#1:840,2\n158#1:842,2\n158#1:844,4\n161#1:865\n161#1:876,2\n161#1:878,2\n161#1:880,4\n166#1:897\n166#1:908,2\n166#1:910,2\n166#1:912,4\n176#1:921\n180#1:922,2\n180#1:924,2\n180#1:928,4\n183#1:933\n185#1:943\n185#1:954,2\n185#1:956,2\n185#1:958,4\n193#1:969\n202#1:971,2\n202#1:973,2\n202#1:977,4\n213#1:992\n213#1:1003,2\n213#1:1005,2\n213#1:1007,4\n213#1:1026\n213#1:1037,2\n213#1:1039,2\n213#1:1041,4\n225#1:1054\n234#1:1056,2\n234#1:1058,2\n234#1:1062,4\n225#1:1070\n234#1:1072,2\n234#1:1074,2\n234#1:1078,4\n117#1:542,5\n129#1:557,2\n131#1:603,2\n137#1:643,2\n140#1:678,2\n141#1:682,2\n149#1:695,2\n151#1:734,2\n153#1:781,2\n158#1:825,2\n161#1:861,2\n166#1:893,2\n180#1:926,2\n185#1:939,2\n192#1:966,2\n202#1:975,2\n213#1:988,2\n224#1:1051,2\n234#1:1060,2\n224#1:1067,2\n234#1:1076,2\n248#1:1082,2\n129#1:580\n131#1:626\n137#1:666\n140#1:685\n149#1:718\n151#1:757\n153#1:804\n158#1:848\n161#1:884\n166#1:916\n180#1:932\n185#1:962\n202#1:981\n213#1:1011\n234#1:1066\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0008\u0018\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001ZB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0006B\u0015\u0008\u0000\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\"J\u001d\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001a2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010&\u001a\u00020 2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0008\u0010)\u001a\u00020#H\u0016J3\u0010*\u001a\u00020 2\u0008\u0008\u0002\u0010+\u001a\u00020 2\u001e\u0010,\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080-H\u0082\u0008J\u0016\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\"J\u0016\u0010/\u001a\u00020 2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u00100\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001aH\u0096\u0002\u00a2\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J\u0008\u00104\u001a\u00020 H\u0016J\u000f\u00105\u001a\u0008\u0012\u0004\u0012\u00028\u000006H\u0096\u0002J\u0015\u00107\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J\u000e\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u000009H\u0016J\u0016\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u0000092\u0006\u0010$\u001a\u00020\u001aH\u0016J.\u0010:\u001a\u0002H;\"\u0004\u0008\u0001\u0010;2\u0018\u0010,\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H;0-H\u0082\u0008\u00a2\u0006\u0002\u0010<J\"\u0010=\u001a\u00020 2\u0018\u0010,\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020 0-H\u0002J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\u0010H\u0016J\u0015\u0010@\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\"J\u0016\u0010A\u001a\u00020 2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u00101J\u0016\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001aJ\u0016\u0010F\u001a\u00020 2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016J+\u0010G\u001a\u00020\u001a2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001aH\u0000\u00a2\u0006\u0002\u0008JJ\u001e\u0010K\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020\u00102\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008H\u0002J\u001e\u0010O\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001aH\u0016J\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000bJ\u0008\u0010Q\u001a\u00020RH\u0016J3\u0010S\u001a\u00020#2\u0008\u0008\u0002\u0010+\u001a\u00020 2\u001e\u0010,\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080-H\u0082\u0008J3\u0010T\u001a\u0002H;\"\u0004\u0008\u0001\u0010;2\u001d\u0010,\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u0002H;0-\u00a2\u0006\u0002\u0008UH\u0082\u0008\u00a2\u0006\u0002\u0010<J3\u0010V\u001a\u0002H;\"\u0004\u0008\u0001\u0010;2\u001d\u0010,\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u0002H;0-\u00a2\u0006\u0002\u0008UH\u0082\u0008\u00a2\u0006\u0002\u0010<J0\u0010W\u001a\u00020 *\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010X\u001a\u00020\u001a2\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00082\u0006\u0010+\u001a\u00020 H\u0002R \u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b8AX\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00158@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0016\u0010\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001c\u00a8\u0006["
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "T",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "()V",
        "persistentList",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;",
        "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V",
        "debuggerDisplayValue",
        "",
        "getDebuggerDisplayValue$annotations",
        "getDebuggerDisplayValue",
        "()Ljava/util/List;",
        "<set-?>",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "firstStateRecord",
        "getFirstStateRecord",
        "()Landroidx/compose/runtime/snapshots/StateRecord;",
        "readable",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;",
        "getReadable$runtime_release$annotations",
        "getReadable$runtime_release",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;",
        "size",
        "",
        "getSize",
        "()I",
        "structure",
        "getStructure$runtime_release",
        "add",
        "",
        "element",
        "(Ljava/lang/Object;)Z",
        "",
        "index",
        "(ILjava/lang/Object;)V",
        "addAll",
        "elements",
        "",
        "clear",
        "conditionalUpdate",
        "structural",
        "block",
        "Lkotlin/Function1;",
        "contains",
        "containsAll",
        "get",
        "(I)Ljava/lang/Object;",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "isEmpty",
        "iterator",
        "",
        "lastIndexOf",
        "listIterator",
        "",
        "mutate",
        "R",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "mutateBoolean",
        "prependStateRecord",
        "value",
        "remove",
        "removeAll",
        "removeAt",
        "removeRange",
        "fromIndex",
        "toIndex",
        "retainAll",
        "retainAllInRange",
        "start",
        "end",
        "retainAllInRange$runtime_release",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "stateRecordWith",
        "list",
        "subList",
        "toList",
        "toString",
        "",
        "update",
        "withCurrent",
        "Lkotlin/ExtensionFunctionType;",
        "writable",
        "attemptUpdate",
        "currentModification",
        "newList",
        "StateListStateRecord",
        "runtime_release"
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
.field private firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentListOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V
    .locals 1
    .param p1, "persistentList"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-direct {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->stateRecordWith(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 36
    return-void
.end method

.method public static final synthetic access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .param p1, "$receiver"    # Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .param p2, "currentModification"    # I
    .param p3, "newList"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .param p4, "structural"    # Z

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v0

    return v0
.end method

.method private final attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z
    .locals 5
    .param p1, "$this$attemptUpdate"    # Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .param p2, "currentModification"    # I
    .param p3, "newList"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .param p4, "structural"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord<",
            "TT;>;I",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;Z)Z"
        }
    .end annotation

    .line 248
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v0

    .local v0, "lock$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1082
    .local v1, "$i$f$synchronized":I
    nop

    .line 1083
    monitor-enter v0

    const/4 v2, 0x0

    .line 249
    .local v2, "$i$a$-synchronized-SnapshotStateList$attemptUpdate$1":I
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v3

    if-ne v3, p2, :cond_1

    .line 250
    invoke-virtual {p1, p3}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setList$runtime_release(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    .line 251
    const/4 v3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getStructuralChange$runtime_release()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p1, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setStructuralChange$runtime_release(I)V

    .line 252
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p1, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setModification$runtime_release(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    goto :goto_0

    .line 254
    :cond_1
    const/4 v3, 0x0

    .line 1083
    .end local v2    # "$i$a$-synchronized-SnapshotStateList$attemptUpdate$1":I
    :goto_0
    monitor-exit v0

    .line 255
    .end local v0    # "lock$iv":Ljava/lang/Object;
    .end local v1    # "$i$f$synchronized":I
    return v3

    .line 1083
    .restart local v0    # "lock$iv":Ljava/lang/Object;
    .restart local v1    # "$i$f$synchronized":I
    :catchall_0
    move-exception v2

    monitor-exit v0

    throw v2
.end method

.method private final conditionalUpdate(ZLkotlin/jvm/functions/Function1;)Z
    .locals 21
    .param p1, "structural"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;+",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;>;)Z"
        }
    .end annotation

    const/4 v1, 0x0

    .line 219
    .local v1, "$i$f$conditionalUpdate":I
    move-object/from16 v2, p0

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v2, "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v3, 0x0

    .line 220
    .local v3, "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    const/4 v4, 0x0

    .line 221
    .local v4, "result":Z
    :goto_0
    nop

    .line 222
    const/4 v5, 0x0

    .line 223
    .local v5, "oldList":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 224
    .local v6, "currentModification":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v7

    .local v7, "lock$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1051
    .local v8, "$i$f$synchronized":I
    nop

    .line 1052
    monitor-enter v7

    const/4 v0, 0x0

    .line 225
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1":I
    move-object v9, v2

    .local v9, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v10, 0x0

    .line 1053
    .local v10, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v11

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 1054
    .local v12, "$i$f$withCurrent":I
    invoke-static {v11}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v13

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v13, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v14, 0x0

    .line 225
    .local v14, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1":I
    nop

    .line 1054
    .end local v13    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v14    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1":I
    nop

    .line 1053
    .end local v11    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$withCurrent":I
    nop

    .line 225
    .end local v9    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v10    # "$i$f$withCurrent":I
    nop

    .line 226
    .local v13, "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v9

    move v6, v9

    .line 227
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v9

    move-object v5, v9

    .line 228
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1":I
    .end local v13    # "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1052
    monitor-exit v7

    .line 229
    .end local v7    # "lock$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v9, p2

    invoke-interface {v9, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 230
    .local v7, "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    const/4 v0, 0x0

    .line 232
    .end local v4    # "result":Z
    .local v0, "result":Z
    move/from16 v19, v1

    move/from16 v1, p1

    goto :goto_1

    .line 234
    .end local v0    # "result":Z
    .restart local v4    # "result":Z
    :cond_0
    move-object v8, v2

    .local v8, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v10, 0x0

    .line 1055
    .local v10, "$i$f$writable":I
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v11, v0

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 1056
    .local v12, "$i$f$writable":I
    const/4 v13, 0x0

    .line 1057
    .local v13, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1058
    .local v14, "$i$f$sync":I
    nop

    .line 1059
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v15

    .local v15, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1060
    .local v16, "$i$f$synchronized":I
    nop

    .line 1061
    monitor-enter v15

    const/4 v0, 0x0

    .line 1062
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_1
    sget-object v17, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v17

    move-object/from16 v13, v17

    .line 1063
    move/from16 v17, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .local v17, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    move-object v0, v8

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v11, v0, v13}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v18, 0x0

    .line 234
    .local v18, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2":I
    move/from16 v19, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$conditionalUpdate":I
    .local v19, "$i$f$conditionalUpdate":I
    :try_start_2
    invoke-static {v2, v0, v6, v7, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1063
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v18    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2":I
    nop

    .line 1061
    .end local v17    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v15

    .line 1059
    .end local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    nop

    .line 1065
    .end local v14    # "$i$f$sync":I
    move/from16 v0, v20

    .line 1066
    .local v0, "it$iv$iv":Z
    const/4 v14, 0x0

    .line 1065
    .local v14, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v15, v8

    check-cast v15, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v13, v15}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 1057
    .end local v0    # "it$iv$iv":Z
    .end local v14    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    nop

    .line 1055
    .end local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 234
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v10    # "$i$f$writable":I
    if-eqz v20, :cond_1

    .line 235
    const/4 v0, 0x1

    .line 236
    .end local v4    # "result":Z
    .local v0, "result":Z
    nop

    .line 239
    .end local v5    # "oldList":Ljava/lang/Object;
    .end local v6    # "currentModification":I
    .end local v7    # "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_1
    nop

    .line 219
    .end local v0    # "result":Z
    .end local v2    # "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v3    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    nop

    .line 240
    return v0

    .line 234
    .restart local v2    # "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v3    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    .restart local v4    # "result":Z
    .restart local v5    # "oldList":Ljava/lang/Object;
    .restart local v6    # "currentModification":I
    .restart local v7    # "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :cond_1
    move/from16 v1, v19

    goto/16 :goto_0

    .line 1061
    .restart local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v10    # "$i$f$writable":I
    .restart local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v12    # "$i$f$writable":I
    .restart local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    .local v14, "$i$f$sync":I
    .restart local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_2

    .end local v19    # "$i$f$conditionalUpdate":I
    .restart local v1    # "$i$f$conditionalUpdate":I
    :catchall_1
    move-exception v0

    move/from16 v19, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$conditionalUpdate":I
    .restart local v19    # "$i$f$conditionalUpdate":I
    :goto_2
    monitor-exit v15

    throw v0

    .line 1052
    .end local v10    # "$i$f$writable":I
    .end local v11    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$sync":I
    .end local v15    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    .end local v19    # "$i$f$conditionalUpdate":I
    .restart local v1    # "$i$f$conditionalUpdate":I
    .local v7, "lock$iv":Ljava/lang/Object;
    .local v8, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move-object/from16 v9, p2

    move/from16 v19, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$conditionalUpdate":I
    .restart local v19    # "$i$f$conditionalUpdate":I
    monitor-exit v7

    throw v0
.end method

.method static synthetic conditionalUpdate$default(Landroidx/compose/runtime/snapshots/SnapshotStateList;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z
    .locals 20
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .param p1, "structural"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;

    .line 216
    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 217
    const/4 v0, 0x1

    move v1, v0

    .end local p1    # "structural":Z
    .local v0, "structural":Z
    goto :goto_0

    .line 216
    .end local v0    # "structural":Z
    .restart local p1    # "structural":Z
    :cond_0
    move/from16 v1, p1

    .end local p1    # "structural":Z
    .local v1, "structural":Z
    :goto_0
    const/4 v2, 0x0

    .line 219
    .local v2, "$i$f$conditionalUpdate":I
    move-object/from16 v3, p0

    .local v3, "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 220
    .local v4, "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    const/4 v5, 0x0

    .line 221
    .local v5, "result":Z
    :cond_1
    nop

    .line 222
    const/4 v6, 0x0

    .line 223
    .local v6, "oldList":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 224
    .local v7, "currentModification":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1067
    .local v9, "$i$f$synchronized":I
    nop

    .line 1068
    monitor-enter v8

    const/4 v0, 0x0

    .line 225
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1":I
    move-object v10, v3

    .local v10, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 1069
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 1070
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v15, 0x0

    .line 225
    .local v15, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1":I
    nop

    .line 1070
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1":I
    nop

    .line 1069
    .end local v12    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 225
    .end local v10    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 226
    .local v14, "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 227
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v10

    move-object v6, v10

    .line 228
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1":I
    .end local v14    # "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1068
    monitor-exit v8

    .line 229
    .end local v8    # "lock$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v10, p2

    invoke-interface {v10, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 230
    .local v8, "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    const/4 v0, 0x0

    .line 232
    .end local v5    # "result":Z
    .local v0, "result":Z
    goto :goto_1

    .line 234
    .end local v0    # "result":Z
    .restart local v5    # "result":Z
    :cond_2
    move-object v9, v3

    .local v9, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 1071
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 1072
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 1073
    .local v14, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1074
    .local v15, "$i$f$sync":I
    nop

    .line 1075
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1076
    .local v17, "$i$f$synchronized":I
    nop

    .line 1077
    monitor-enter v16

    const/4 v0, 0x0

    .line 1078
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 1079
    move/from16 p1, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .local p1, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v18, 0x0

    .line 234
    .local v18, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2":I
    invoke-static {v3, v0, v7, v8, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v19
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1079
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v18    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2":I
    nop

    .line 1077
    .end local p1    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v16

    .line 1075
    .end local v16    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 1081
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v19

    .line 1066
    .local v0, "it$iv$iv":Z
    const/4 v15, 0x0

    .line 1081
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move/from16 p1, v0

    .end local v0    # "it$iv$iv":Z
    .local p1, "it$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 1073
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    .end local p1    # "it$iv$iv":Z
    nop

    .line 1071
    .end local v12    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 234
    .end local v9    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v19, :cond_1

    .line 235
    const/4 v0, 0x1

    .line 236
    .end local v5    # "result":Z
    .local v0, "result":Z
    nop

    .line 239
    .end local v6    # "oldList":Ljava/lang/Object;
    .end local v7    # "currentModification":I
    .end local v8    # "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_1
    nop

    .line 219
    .end local v0    # "result":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    nop

    .line 240
    return v0

    .line 1077
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2423":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1":I
    .restart local v5    # "result":Z
    .restart local v6    # "oldList":Ljava/lang/Object;
    .restart local v7    # "currentModification":I
    .restart local v8    # "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v9    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .restart local v16    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .line 1068
    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p2

    monitor-exit v8

    throw v0
.end method

.method public static synthetic getDebuggerDisplayValue$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getReadable$runtime_release$annotations()V
    .locals 0

    return-void
.end method

.method private final mutate(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v1, 0x0

    .line 188
    .local v1, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v2, v0

    .line 189
    .local v2, "result":Ljava/lang/Object;
    :goto_0
    nop

    .line 190
    const/4 v3, 0x0

    .line 191
    .local v3, "oldList":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 192
    .local v4, "currentModification":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v5

    .local v5, "lock$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 966
    .local v6, "$i$f$synchronized":I
    nop

    .line 967
    monitor-enter v5

    const/4 v0, 0x0

    .line 193
    .local v0, "$i$a$-synchronized-SnapshotStateList$mutate$1":I
    move-object/from16 v7, p0

    .local v7, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v8, 0x0

    .line 968
    .local v8, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v7}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v9

    const-string/jumbo v10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v9, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v9, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v10, 0x0

    .line 969
    .local v10, "$i$f$withCurrent":I
    invoke-static {v9}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v11, "$this$mutate_u24lambda_u2418_u24lambda_u2417":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v12, 0x0

    .line 193
    .local v12, "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1":I
    nop

    .line 969
    .end local v11    # "$this$mutate_u24lambda_u2418_u24lambda_u2417":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v12    # "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1":I
    nop

    .line 968
    .end local v9    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v10    # "$i$f$withCurrent":I
    nop

    .line 193
    .end local v7    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v8    # "$i$f$withCurrent":I
    nop

    .line 194
    .local v11, "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v7

    move v4, v7

    .line 195
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v7

    move-object v3, v7

    .line 196
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$mutate$1":I
    .end local v11    # "current":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 967
    monitor-exit v5

    .line 197
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$synchronized":I
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v3}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;

    move-result-object v5

    .line 198
    .local v5, "builder":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    move-object/from16 v7, p1

    invoke-interface {v7, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 199
    invoke-interface {v5}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v6

    .line 200
    .local v6, "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 201
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 202
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v9, 0x0

    .line 970
    .local v9, "$i$f$writable":I
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v10, v0

    check-cast v10, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v10, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v11, 0x0

    .line 971
    .local v11, "$i$f$writable":I
    const/4 v12, 0x0

    .line 972
    .local v12, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 973
    .local v13, "$i$f$sync":I
    nop

    .line 974
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v14

    .local v14, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 975
    .local v15, "$i$f$synchronized":I
    nop

    .line 976
    monitor-enter v14

    const/4 v0, 0x0

    .line 977
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_1
    sget-object v16, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v16

    move-object/from16 v12, v16

    .line 978
    move/from16 v16, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .local v16, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    move-object v0, v8

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v10, v0, v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$mutate_u24lambda_u2419":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v17, 0x0

    .line 202
    .local v17, "$i$a$-writable-SnapshotStateList$mutate$2":I
    move/from16 v18, v1

    .end local v1    # "$i$f$mutate":I
    .local v18, "$i$f$mutate":I
    const/4 v1, 0x1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .end local v2    # "result":Ljava/lang/Object;
    .local v19, "result":Ljava/lang/Object;
    :try_start_2
    invoke-direct {v2, v0, v4, v6, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 978
    .end local v0    # "$this$mutate_u24lambda_u2419":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v17    # "$i$a$-writable-SnapshotStateList$mutate$2":I
    nop

    .line 976
    .end local v16    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v14

    .line 974
    .end local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$synchronized":I
    nop

    .line 980
    .end local v13    # "$i$f$sync":I
    move v0, v1

    .line 981
    .local v0, "it$iv$iv":Z
    const/4 v13, 0x0

    .line 980
    .local v13, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v14, v8

    check-cast v14, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 972
    .end local v0    # "it$iv$iv":Z
    .end local v13    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    nop

    .line 970
    .end local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$writable":I
    .end local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 202
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v9    # "$i$f$writable":I
    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v1, v18

    move-object/from16 v2, v19

    goto/16 :goto_0

    .line 976
    .restart local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v9    # "$i$f$writable":I
    .restart local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    .local v13, "$i$f$sync":I
    .restart local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v15    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_1

    .end local v18    # "$i$f$mutate":I
    .end local v19    # "result":Ljava/lang/Object;
    .restart local v1    # "$i$f$mutate":I
    .restart local v2    # "result":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .end local v1    # "$i$f$mutate":I
    .end local v2    # "result":Ljava/lang/Object;
    .restart local v18    # "$i$f$mutate":I
    .restart local v19    # "result":Ljava/lang/Object;
    :goto_1
    monitor-exit v14

    throw v0

    .line 201
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v9    # "$i$f$writable":I
    .end local v10    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$writable":I
    .end local v12    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$sync":I
    .end local v14    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$synchronized":I
    .end local v18    # "$i$f$mutate":I
    .end local v19    # "result":Ljava/lang/Object;
    .restart local v1    # "$i$f$mutate":I
    .restart local v2    # "result":Ljava/lang/Object;
    :cond_1
    move/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .line 204
    .end local v1    # "$i$f$mutate":I
    .end local v2    # "result":Ljava/lang/Object;
    .restart local v18    # "$i$f$mutate":I
    .restart local v19    # "result":Ljava/lang/Object;
    :goto_2
    nop

    .line 206
    .end local v3    # "oldList":Ljava/lang/Object;
    .end local v4    # "currentModification":I
    .end local v5    # "builder":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    .end local v6    # "newList":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    return-object v19

    .line 967
    .end local v18    # "$i$f$mutate":I
    .end local v19    # "result":Ljava/lang/Object;
    .restart local v1    # "$i$f$mutate":I
    .restart local v2    # "result":Ljava/lang/Object;
    .restart local v3    # "oldList":Ljava/lang/Object;
    .restart local v4    # "currentModification":I
    .local v5, "lock$iv":Ljava/lang/Object;
    .local v6, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move-object/from16 v7, p1

    move/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v2, p0

    .end local v1    # "$i$f$mutate":I
    .end local v2    # "result":Ljava/lang/Object;
    .restart local v18    # "$i$f$mutate":I
    .restart local v19    # "result":Ljava/lang/Object;
    monitor-exit v5

    throw v0
.end method

.method private final mutateBoolean(Lkotlin/jvm/functions/Function1;)Z
    .locals 20
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 185
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v2, 0x0

    .line 934
    .local v2, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v3, v0

    .line 935
    .local v3, "result$iv":Ljava/lang/Object;
    :goto_0
    nop

    .line 936
    const/4 v4, 0x0

    .line 937
    .local v4, "oldList$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 938
    .local v5, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v6

    .local v6, "lock$iv$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 939
    .local v7, "$i$f$synchronized":I
    nop

    .line 940
    monitor-enter v6

    const/4 v0, 0x0

    .line 941
    .local v0, "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    move-object v8, v1

    .local v8, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v9, 0x0

    .line 942
    .local v9, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v10

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v10, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v10, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v11, 0x0

    .line 943
    .local v11, "$i$f$withCurrent":I
    invoke-static {v10}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v12, "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v13, 0x0

    .line 941
    .local v13, "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 943
    .end local v12    # "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v13    # "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 942
    .end local v10    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 941
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v9    # "$i$f$withCurrent":I
    nop

    .line 944
    .local v12, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v8

    move v5, v8

    .line 945
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v8

    move-object v4, v8

    .line 946
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    .end local v12    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 940
    monitor-exit v6

    .line 947
    .end local v6    # "lock$iv$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$synchronized":I
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v4}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;

    move-result-object v6

    .line 948
    .local v6, "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    move-object/from16 v8, p1

    invoke-interface {v8, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 949
    invoke-interface {v6}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v7

    .line 950
    .local v7, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 951
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 952
    move-object v9, v1

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v10, 0x0

    .line 953
    .local v10, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v11, v0

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 954
    .local v12, "$i$f$writable":I
    const/4 v13, 0x0

    .line 955
    .local v13, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 956
    .local v14, "$i$f$sync":I
    nop

    .line 957
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v15

    .local v15, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 939
    .local v16, "$i$f$synchronized":I
    nop

    .line 940
    monitor-enter v15

    const/4 v0, 0x0

    .line 958
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v17, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v17

    move-object/from16 v13, v17

    .line 959
    move/from16 v17, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v17, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v11, v0, v13}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v18, 0x0

    .line 952
    .local v18, "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    move/from16 v19, v2

    .end local v2    # "$i$f$mutate":I
    .local v19, "$i$f$mutate":I
    const/4 v2, 0x1

    :try_start_2
    invoke-direct {v1, v0, v5, v7, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 959
    .end local v0    # "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v18    # "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    nop

    .line 940
    .end local v17    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v15

    .line 957
    .end local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    nop

    .line 961
    .end local v14    # "$i$f$sync":I
    move v0, v2

    .line 962
    .local v0, "it$iv$iv$iv":Z
    const/4 v14, 0x0

    .line 961
    .local v14, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move-object v15, v9

    check-cast v15, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v13, v15}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 955
    .end local v0    # "it$iv$iv$iv":Z
    .end local v14    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    nop

    .line 953
    .end local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 952
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v10    # "$i$f$writable":I
    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v2, v19

    goto/16 :goto_0

    .line 940
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v10    # "$i$f$writable":I
    .restart local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v12    # "$i$f$writable":I
    .restart local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v14, "$i$f$sync":I
    .restart local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_1

    .end local v19    # "$i$f$mutate":I
    .restart local v2    # "$i$f$mutate":I
    :catchall_1
    move-exception v0

    move/from16 v19, v2

    .end local v2    # "$i$f$mutate":I
    .restart local v19    # "$i$f$mutate":I
    :goto_1
    monitor-exit v15

    throw v0

    .line 951
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v10    # "$i$f$writable":I
    .end local v11    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$writable":I
    .end local v13    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$sync":I
    .end local v15    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$synchronized":I
    .end local v19    # "$i$f$mutate":I
    .restart local v2    # "$i$f$mutate":I
    :cond_1
    move/from16 v19, v2

    .line 963
    .end local v2    # "$i$f$mutate":I
    .restart local v19    # "$i$f$mutate":I
    :goto_2
    nop

    .line 965
    .end local v4    # "oldList$iv":Ljava/lang/Object;
    .end local v5    # "currentModification$iv":I
    .end local v6    # "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    .end local v7    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v3    # "result$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$mutate":I
    move-object v0, v3

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 185
    return v0

    .line 940
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v2    # "$i$f$mutate":I
    .restart local v3    # "result$iv":Ljava/lang/Object;
    .restart local v4    # "oldList$iv":Ljava/lang/Object;
    .restart local v5    # "currentModification$iv":I
    .local v6, "lock$iv$iv":Ljava/lang/Object;
    .local v7, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move-object/from16 v8, p1

    move/from16 v19, v2

    .end local v2    # "$i$f$mutate":I
    .restart local v19    # "$i$f$mutate":I
    monitor-exit v6

    throw v0
.end method

.method private final stateRecordWith(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 7
    .param p1, "list"    # Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;)",
            "Landroidx/compose/runtime/snapshots/StateRecord;"
        }
    .end annotation

    .line 258
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v0

    .line 259
    .local v0, "snapshot":Landroidx/compose/runtime/snapshots/Snapshot;
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;-><init>(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    move-object v2, v1

    .local v2, "it":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v3, 0x0

    .line 260
    .local v3, "$i$a$-also-SnapshotStateList$stateRecordWith$1":I
    instance-of v4, v0, Landroidx/compose/runtime/snapshots/GlobalSnapshot;

    if-nez v4, :cond_0

    .line 261
    new-instance v4, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    const/4 v5, 0x1

    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->toSnapshotId(I)J

    move-result-wide v5

    invoke-direct {v4, v5, v6, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;-><init>(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    check-cast v4, Landroidx/compose/runtime/snapshots/StateRecord;

    invoke-virtual {v2, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V

    .line 263
    :cond_0
    nop

    .line 259
    .end local v2    # "it":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v3    # "$i$a$-also-SnapshotStateList$stateRecordWith$1":I
    check-cast v1, Landroidx/compose/runtime/snapshots/StateRecord;

    return-object v1
.end method

.method private final update(ZLkotlin/jvm/functions/Function1;)V
    .locals 23
    .param p1, "structural"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;+",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList<",
            "+TT;>;>;)V"
        }
    .end annotation

    const/4 v1, 0x0

    .line 213
    .local v1, "$i$f$update":I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v3, 0x0

    .line 982
    .local v3, "$i$f$conditionalUpdate":I
    move-object v4, v2

    check-cast v4, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v4, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v5, 0x0

    .line 983
    .local v5, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v6, 0x0

    .line 984
    .local v6, "result$iv":Z
    :goto_0
    nop

    .line 985
    const/4 v7, 0x0

    .line 986
    .local v7, "oldList$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 987
    .local v8, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v9

    .local v9, "lock$iv$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 988
    .local v10, "$i$f$synchronized":I
    nop

    .line 989
    monitor-enter v9

    const/4 v0, 0x0

    .line 990
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v11, v4

    .local v11, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v12, 0x0

    .line 991
    .local v12, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v13

    const-string/jumbo v14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v13, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v13, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v14, 0x0

    .line 992
    .local v14, "$i$f$withCurrent":I
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v15

    check-cast v15, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v15, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v16, 0x0

    .line 990
    .local v16, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 992
    .end local v15    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v16    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 991
    .end local v13    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v14    # "$i$f$withCurrent":I
    nop

    .line 990
    .end local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v12    # "$i$f$withCurrent":I
    nop

    .line 993
    .local v15, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v11

    move v8, v11

    .line 994
    invoke-virtual {v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v11

    move-object v7, v11

    .line 995
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v15    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 989
    monitor-exit v9

    .line 996
    .end local v9    # "lock$iv$iv":Ljava/lang/Object;
    .end local v10    # "$i$f$synchronized":I
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v11, p2

    invoke-interface {v11, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 997
    .local v9, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 998
    const/4 v0, 0x0

    .line 999
    .end local v6    # "result$iv":Z
    .local v0, "result$iv":Z
    move/from16 v21, v1

    move/from16 v1, p1

    goto :goto_1

    .line 1001
    .end local v0    # "result$iv":Z
    .restart local v6    # "result$iv":Z
    :cond_0
    move-object v10, v4

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v12, 0x0

    .line 1002
    .local v12, "$i$f$writable":I
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v13, v0

    check-cast v13, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v13, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v14, 0x0

    .line 1003
    .local v14, "$i$f$writable":I
    const/4 v15, 0x0

    .line 1004
    .local v15, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1005
    .local v16, "$i$f$sync":I
    nop

    .line 1006
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v17

    .local v17, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 988
    .local v18, "$i$f$synchronized":I
    nop

    .line 989
    monitor-enter v17

    const/4 v0, 0x0

    .line 1007
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v19, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v19

    move-object/from16 v15, v19

    .line 1008
    move/from16 v19, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v19, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v10

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v13, v0, v15}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v20, 0x0

    .line 1001
    .local v20, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    move/from16 v21, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$update":I
    .local v21, "$i$f$update":I
    :try_start_2
    invoke-static {v4, v0, v8, v9, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v22
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1008
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v20    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 989
    .end local v19    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v17

    .line 1006
    .end local v17    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v18    # "$i$f$synchronized":I
    nop

    .line 1010
    .end local v16    # "$i$f$sync":I
    move/from16 v0, v22

    .line 1011
    .local v0, "it$iv$iv$iv":Z
    const/16 v16, 0x0

    .line 1010
    .local v16, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v17, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v17, "it$iv$iv$iv":Z
    move-object v0, v10

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v15, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 1004
    .end local v16    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v17    # "it$iv$iv$iv":Z
    nop

    .line 1002
    .end local v13    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v14    # "$i$f$writable":I
    .end local v15    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 1001
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v12    # "$i$f$writable":I
    if-eqz v22, :cond_1

    .line 1012
    const/4 v0, 0x1

    .line 1013
    .end local v6    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 1016
    .end local v7    # "oldList$iv":Ljava/lang/Object;
    .end local v8    # "currentModification$iv":I
    .end local v9    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_1
    nop

    .line 982
    .end local v0    # "result$iv":Z
    .end local v4    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v5    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 1017
    nop

    .line 214
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v3    # "$i$f$conditionalUpdate":I
    return-void

    .line 1001
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v3    # "$i$f$conditionalUpdate":I
    .restart local v4    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v5    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v6    # "result$iv":Z
    .restart local v7    # "oldList$iv":Ljava/lang/Object;
    .restart local v8    # "currentModification$iv":I
    .restart local v9    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :cond_1
    move/from16 v1, v21

    goto/16 :goto_0

    .line 989
    .restart local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v12    # "$i$f$writable":I
    .restart local v13    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v14    # "$i$f$writable":I
    .restart local v15    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v16, "$i$f$sync":I
    .local v17, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v18    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_2

    .end local v21    # "$i$f$update":I
    .restart local v1    # "$i$f$update":I
    :catchall_1
    move-exception v0

    move/from16 v21, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$update":I
    .restart local v21    # "$i$f$update":I
    :goto_2
    monitor-exit v17

    throw v0

    .end local v12    # "$i$f$writable":I
    .end local v13    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v14    # "$i$f$writable":I
    .end local v15    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$sync":I
    .end local v17    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v18    # "$i$f$synchronized":I
    .end local v21    # "$i$f$update":I
    .restart local v1    # "$i$f$update":I
    .local v9, "lock$iv$iv":Ljava/lang/Object;
    .local v10, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move-object/from16 v11, p2

    move/from16 v21, v1

    move/from16 v1, p1

    .end local v1    # "$i$f$update":I
    .restart local v21    # "$i$f$update":I
    monitor-exit v9

    throw v0
.end method

.method static synthetic update$default(Landroidx/compose/runtime/snapshots/SnapshotStateList;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 21
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .param p1, "structural"    # Z
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;

    .line 209
    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 210
    const/4 v0, 0x1

    move v1, v0

    .end local p1    # "structural":Z
    .local v0, "structural":Z
    goto :goto_0

    .line 209
    .end local v0    # "structural":Z
    .restart local p1    # "structural":Z
    :cond_0
    move/from16 v1, p1

    .end local p1    # "structural":Z
    .local v1, "structural":Z
    :goto_0
    const/4 v2, 0x0

    .line 213
    .local v2, "$i$f$update":I
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 1018
    .local v4, "$i$f$conditionalUpdate":I
    move-object v5, v3

    .local v5, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v6, 0x0

    .line 1019
    .local v6, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v7, 0x0

    .line 1020
    .local v7, "result$iv":Z
    :goto_1
    nop

    .line 1021
    const/4 v8, 0x0

    .line 1022
    .local v8, "oldList$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1023
    .local v9, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v10

    .local v10, "lock$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 988
    .local v11, "$i$f$synchronized":I
    nop

    .line 989
    monitor-enter v10

    const/4 v0, 0x0

    .line 1024
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v12, v5

    .local v12, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v13, 0x0

    .line 1025
    .local v13, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    const-string/jumbo v15, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v14, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v14, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v15, 0x0

    .line 1026
    .local v15, "$i$f$withCurrent":I
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v16

    check-cast v16, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v16, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v17, 0x0

    .line 1024
    .local v17, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 1026
    .end local v16    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v17    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 1025
    .end local v14    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$withCurrent":I
    nop

    .line 1024
    .end local v12    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 1027
    .local v16, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v12

    move v9, v12

    .line 1028
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v12

    move-object v8, v12

    .line 1029
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v16    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 989
    monitor-exit v10

    .line 1030
    .end local v10    # "lock$iv$iv":Ljava/lang/Object;
    .end local v11    # "$i$f$synchronized":I
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v12, p2

    invoke-interface {v12, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 1031
    .local v10, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1032
    const/4 v0, 0x0

    .line 1033
    .end local v7    # "result$iv":Z
    .local v0, "result$iv":Z
    move/from16 p4, v2

    goto :goto_2

    .line 1035
    .end local v0    # "result$iv":Z
    .restart local v7    # "result$iv":Z
    :cond_1
    move-object v11, v5

    .local v11, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v13, 0x0

    .line 1036
    .local v13, "$i$f$writable":I
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v14, v0

    check-cast v14, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v14, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v15, 0x0

    .line 1037
    .local v15, "$i$f$writable":I
    const/16 v16, 0x0

    .line 1038
    .local v16, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1039
    .local v17, "$i$f$sync":I
    nop

    .line 1040
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v18

    .local v18, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 988
    .local v19, "$i$f$synchronized":I
    nop

    .line 989
    monitor-enter v18

    const/4 v0, 0x0

    .line 1041
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v20, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 p1, v20

    .line 1042
    .end local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local p1, "snapshot$iv$iv$iv":Ljava/lang/Object;
    move/from16 p3, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local p3, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_2
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move/from16 p4, v2

    move-object/from16 v2, p1

    .end local p1    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local p4, "$i$f$update":I
    :try_start_3
    invoke-static {v14, v0, v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v16, 0x0

    .line 1035
    .local v16, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    invoke-static {v5, v0, v9, v10, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1042
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v16    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 989
    .end local p3    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v18

    .line 1040
    .end local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    nop

    .line 1044
    .end local v17    # "$i$f$sync":I
    move/from16 v0, v20

    .line 1011
    .local v0, "it$iv$iv$iv":Z
    const/16 v16, 0x0

    .line 1044
    .local v16, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 p1, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local p1, "it$iv$iv$iv":Z
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 1038
    .end local v16    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local p1    # "it$iv$iv$iv":Z
    nop

    .line 1036
    .end local v2    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$writable":I
    nop

    .line 1035
    .end local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$writable":I
    if-eqz v20, :cond_2

    .line 1045
    const/4 v0, 0x1

    .line 1046
    .end local v7    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 1049
    .end local v8    # "oldList$iv":Ljava/lang/Object;
    .end local v9    # "currentModification$iv":I
    .end local v10    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_2
    nop

    .line 1018
    .end local v0    # "result$iv":Z
    .end local v5    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v6    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 1050
    nop

    .line 214
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$f$conditionalUpdate":I
    return-void

    .line 1035
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$f$conditionalUpdate":I
    .restart local v5    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v6    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v7    # "result$iv":Z
    .restart local v8    # "oldList$iv":Ljava/lang/Object;
    .restart local v9    # "currentModification$iv":I
    .restart local v10    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :cond_2
    move/from16 v2, p4

    goto/16 :goto_1

    .line 989
    .restart local v2    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .restart local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v15    # "$i$f$writable":I
    .restart local v17    # "$i$f$sync":I
    .restart local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v19    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    move-object/from16 v16, v2

    goto :goto_3

    .end local p4    # "$i$f$update":I
    .local v2, "$i$f$update":I
    .local p1, "snapshot$iv$iv$iv":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move/from16 p4, v2

    move-object/from16 v2, p1

    move-object/from16 v16, v2

    .end local p1    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv":Ljava/lang/Object;
    .restart local p4    # "$i$f$update":I
    goto :goto_3

    .end local p4    # "$i$f$update":I
    .local v2, "$i$f$update":I
    .local v16, "snapshot$iv$iv$iv":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move/from16 p4, v2

    .end local v2    # "$i$f$update":I
    .restart local p4    # "$i$f$update":I
    :goto_3
    monitor-exit v18

    throw v0

    .end local v13    # "$i$f$writable":I
    .end local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$writable":I
    .end local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$sync":I
    .end local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    .end local p4    # "$i$f$update":I
    .restart local v2    # "$i$f$update":I
    .local v10, "lock$iv$iv":Ljava/lang/Object;
    .local v11, "$i$f$synchronized":I
    :catchall_3
    move-exception v0

    move-object/from16 v12, p2

    move/from16 p4, v2

    .end local v2    # "$i$f$update":I
    .restart local p4    # "$i$f$update":I
    monitor-exit v10

    throw v0
.end method

.method private final withCurrent(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 4
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 183
    .local v0, "$i$f$withCurrent":I
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v1, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v1, "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v2, 0x0

    .line 933
    .local v2, "$i$f$withCurrent":I
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v3

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 183
    .end local v1    # "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v2    # "$i$f$withCurrent":I
    return-object v1
.end method

.method private final writable(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 9
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord<",
            "TT;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 180
    .local v0, "$i$f$writable":I
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v1, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v1, "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v2, 0x0

    .line 922
    .local v2, "$i$f$writable":I
    const/4 v3, 0x0

    .line 923
    .local v3, "snapshot$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 924
    .local v4, "$i$f$sync":I
    nop

    .line 925
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v5

    .local v5, "lock$iv$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 926
    .local v6, "$i$f$synchronized":I
    nop

    .line 927
    monitor-enter v5

    const/4 v7, 0x0

    .line 928
    .local v7, "$i$a$-sync-SnapshotKt$writable$3$iv":I
    :try_start_0
    sget-object v8, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v8

    move-object v3, v8

    .line 929
    move-object v8, p0

    check-cast v8, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v1, v8, v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v8

    invoke-interface {p1, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 927
    .end local v7    # "$i$a$-sync-SnapshotKt$writable$3$iv":I
    monitor-exit v5

    .line 925
    .end local v5    # "lock$iv$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$synchronized":I
    nop

    .line 931
    .end local v4    # "$i$f$sync":I
    move-object v4, v8

    .line 932
    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 931
    .local v5, "$i$a$-also-SnapshotKt$writable$4$iv":I
    move-object v6, p0

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v3, v6}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 923
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-also-SnapshotKt$writable$4$iv":I
    nop

    .line 180
    .end local v1    # "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v2    # "$i$f$writable":I
    .end local v3    # "snapshot$iv":Ljava/lang/Object;
    return-object v8

    .line 927
    .restart local v1    # "$this$writable$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "snapshot$iv":Ljava/lang/Object;
    .local v4, "$i$f$sync":I
    .local v5, "lock$iv$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$synchronized":I
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 24
    .param p1, "index"    # I
    .param p2, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .line 131
    nop

    .line 587
    nop

    .line 588
    const/4 v1, 0x1

    .line 587
    .local v1, "structural$iv":Z
    const/4 v2, 0x0

    .line 591
    .local v2, "$i$f$update":I
    move-object/from16 v3, p0

    .local v3, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 597
    .local v4, "$i$f$conditionalUpdate":I
    move-object v5, v3

    check-cast v5, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v5, "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v6, 0x0

    .line 598
    .local v6, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    const/4 v7, 0x0

    .line 599
    .local v7, "result$iv$iv":Z
    :goto_0
    nop

    .line 600
    const/4 v8, 0x0

    .line 601
    .local v8, "oldList$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 602
    .local v9, "currentModification$iv$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v10

    .local v10, "lock$iv$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 603
    .local v11, "$i$f$synchronized":I
    nop

    .line 604
    monitor-enter v10

    const/4 v0, 0x0

    .line 605
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    move-object v12, v5

    .local v12, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v13, 0x0

    .line 606
    .local v13, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    const-string/jumbo v15, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v14, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v14, "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v15, 0x0

    .line 607
    .local v15, "$i$f$withCurrent":I
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v16

    check-cast v16, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v16, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v17, 0x0

    .line 605
    .local v17, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 607
    .end local v16    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v17    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 606
    .end local v14    # "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$withCurrent":I
    nop

    .line 605
    .end local v12    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 608
    .local v16, "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v12

    move v9, v12

    .line 609
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v12

    move-object v8, v12

    .line 610
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    .end local v16    # "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 604
    monitor-exit v10

    .line 611
    .end local v10    # "lock$iv$iv$iv":Ljava/lang/Object;
    .end local v11    # "$i$f$synchronized":I
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v8

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v10, 0x0

    .line 131
    .local v10, "$i$a$-update$default-SnapshotStateList$add$2":I
    move/from16 v12, p1

    move-object/from16 v13, p2

    invoke-interface {v0, v12, v13}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->add(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 611
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v10    # "$i$a$-update$default-SnapshotStateList$add$2":I
    move-object v10, v0

    .line 612
    .local v10, "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    const/4 v0, 0x0

    .line 614
    .end local v7    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    move/from16 v22, v2

    goto :goto_1

    .line 616
    .end local v0    # "result$iv$iv":Z
    .restart local v7    # "result$iv$iv":Z
    :cond_0
    move-object v11, v5

    .local v11, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v14, 0x0

    .line 617
    .local v14, "$i$f$writable":I
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v15, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v15, v0

    check-cast v15, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v15, "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/16 v16, 0x0

    .line 618
    .local v16, "$i$f$writable":I
    const/16 v17, 0x0

    .line 619
    .local v17, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 620
    .local v18, "$i$f$sync":I
    nop

    .line 621
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v19

    .local v19, "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 603
    .local v20, "$i$f$synchronized":I
    nop

    .line 604
    monitor-enter v19

    const/4 v0, 0x0

    .line 622
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_1
    sget-object v21, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v21
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v17, v21

    .line 623
    move/from16 v21, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    .local v21, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_2
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move/from16 v22, v2

    move-object/from16 v2, v17

    .end local v17    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v22, "$i$f$update":I
    :try_start_3
    invoke-static {v15, v0, v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v17, 0x0

    .line 616
    .local v17, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    invoke-static {v5, v0, v9, v10, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v23
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 623
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v17    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    nop

    .line 604
    .end local v21    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    monitor-exit v19

    .line 621
    .end local v19    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$f$synchronized":I
    nop

    .line 625
    .end local v18    # "$i$f$sync":I
    move/from16 v0, v23

    .line 626
    .local v0, "it$iv$iv$iv$iv":Z
    const/16 v17, 0x0

    .line 625
    .local v17, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    move/from16 v18, v0

    .end local v0    # "it$iv$iv$iv$iv":Z
    .local v18, "it$iv$iv$iv$iv":Z
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 619
    .end local v17    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    .end local v18    # "it$iv$iv$iv$iv":Z
    nop

    .line 617
    .end local v2    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v16    # "$i$f$writable":I
    nop

    .line 616
    .end local v11    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v14    # "$i$f$writable":I
    if-eqz v23, :cond_1

    .line 627
    const/4 v0, 0x1

    .line 628
    .end local v7    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    nop

    .line 631
    .end local v8    # "oldList$iv$iv":Ljava/lang/Object;
    .end local v9    # "currentModification$iv$iv":I
    .end local v10    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_1
    nop

    .line 597
    .end local v0    # "result$iv$iv":Z
    .end local v5    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v6    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    nop

    .line 632
    nop

    .line 633
    .end local v3    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$f$conditionalUpdate":I
    nop

    .line 131
    .end local v1    # "structural$iv":Z
    .end local v22    # "$i$f$update":I
    return-void

    .line 616
    .restart local v1    # "structural$iv":Z
    .restart local v3    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$f$conditionalUpdate":I
    .restart local v5    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v6    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    .restart local v7    # "result$iv$iv":Z
    .restart local v8    # "oldList$iv$iv":Ljava/lang/Object;
    .restart local v9    # "currentModification$iv$iv":I
    .restart local v10    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v22    # "$i$f$update":I
    :cond_1
    move/from16 v2, v22

    goto/16 :goto_0

    .line 604
    .restart local v2    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v11    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v14    # "$i$f$writable":I
    .restart local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v16    # "$i$f$writable":I
    .local v18, "$i$f$sync":I
    .restart local v19    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v20    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_2

    .end local v22    # "$i$f$update":I
    .local v2, "$i$f$update":I
    .local v17, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move/from16 v22, v2

    move-object/from16 v2, v17

    .end local v17    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v22    # "$i$f$update":I
    goto :goto_2

    .end local v22    # "$i$f$update":I
    .local v2, "$i$f$update":I
    .restart local v17    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move/from16 v22, v2

    .end local v2    # "$i$f$update":I
    .restart local v22    # "$i$f$update":I
    :goto_2
    monitor-exit v19

    throw v0

    .end local v14    # "$i$f$writable":I
    .end local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v16    # "$i$f$writable":I
    .end local v17    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v18    # "$i$f$sync":I
    .end local v19    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$f$synchronized":I
    .end local v22    # "$i$f$update":I
    .restart local v2    # "$i$f$update":I
    .local v10, "lock$iv$iv$iv":Ljava/lang/Object;
    .local v11, "$i$f$synchronized":I
    :catchall_3
    move-exception v0

    move/from16 v12, p1

    move-object/from16 v13, p2

    move/from16 v22, v2

    .end local v2    # "$i$f$update":I
    .restart local v22    # "$i$f$update":I
    monitor-exit v10

    throw v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 21
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 129
    nop

    .line 548
    nop

    .line 549
    const/4 v1, 0x1

    .line 548
    .local v1, "structural$iv":Z
    const/4 v2, 0x0

    .line 551
    .local v2, "$i$f$conditionalUpdate":I
    move-object/from16 v3, p0

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v3, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 552
    .local v4, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 553
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 554
    const/4 v6, 0x0

    .line 555
    .local v6, "oldList$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 556
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 557
    .local v9, "$i$f$synchronized":I
    nop

    .line 558
    monitor-enter v8

    const/4 v0, 0x0

    .line 559
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 560
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 561
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v15, 0x0

    .line 559
    .local v15, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 561
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 560
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 559
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 562
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 563
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v10

    move-object v6, v10

    .line 564
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 558
    monitor-exit v8

    .line 565
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v8, 0x0

    .line 129
    .local v8, "$i$a$-conditionalUpdate$default-SnapshotStateList$add$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->add(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 565
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v8    # "$i$a$-conditionalUpdate$default-SnapshotStateList$add$1":I
    move-object v8, v0

    .line 566
    .local v8, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 567
    const/4 v0, 0x0

    .line 568
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 570
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 571
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 572
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 573
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 574
    .local v15, "$i$f$sync":I
    nop

    .line 575
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 557
    .local v17, "$i$f$synchronized":I
    nop

    .line 558
    monitor-enter v16

    const/4 v0, 0x0

    .line 576
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 577
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 570
    .local v19, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    invoke-static {v3, v0, v7, v8, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 577
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 558
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 575
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 579
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 580
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 579
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 573
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 571
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 570
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 581
    const/4 v0, 0x1

    .line 582
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 585
    .end local v6    # "oldList$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_0
    nop

    .line 551
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 586
    nop

    .line 129
    .end local v1    # "structural$iv":Z
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 558
    .restart local v1    # "structural$iv":Z
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldList$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1
    .param p1, "index"    # I
    .param p2, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 133
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$addAll$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList$addAll$1;-><init>(ILjava/util/Collection;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->mutateBoolean(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    .line 135
    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 21
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 137
    nop

    .line 634
    nop

    .line 635
    const/4 v1, 0x1

    .line 634
    .local v1, "structural$iv":Z
    const/4 v2, 0x0

    .line 637
    .local v2, "$i$f$conditionalUpdate":I
    move-object/from16 v3, p0

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v3, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 638
    .local v4, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 639
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 640
    const/4 v6, 0x0

    .line 641
    .local v6, "oldList$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 642
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 643
    .local v9, "$i$f$synchronized":I
    nop

    .line 644
    monitor-enter v8

    const/4 v0, 0x0

    .line 645
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 646
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 647
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v15, 0x0

    .line 645
    .local v15, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 647
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 646
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 645
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 648
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 649
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v10

    move-object v6, v10

    .line 650
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 644
    monitor-exit v8

    .line 651
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v8, 0x0

    .line 137
    .local v8, "$i$a$-conditionalUpdate$default-SnapshotStateList$addAll$2":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->addAll(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 651
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v8    # "$i$a$-conditionalUpdate$default-SnapshotStateList$addAll$2":I
    move-object v8, v0

    .line 652
    .local v8, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 653
    const/4 v0, 0x0

    .line 654
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 656
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 657
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 658
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 659
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 660
    .local v15, "$i$f$sync":I
    nop

    .line 661
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 643
    .local v17, "$i$f$synchronized":I
    nop

    .line 644
    monitor-enter v16

    const/4 v0, 0x0

    .line 662
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 663
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 656
    .local v19, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    invoke-static {v3, v0, v7, v8, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 663
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 644
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 661
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 665
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 666
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 665
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 659
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 657
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 656
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 667
    const/4 v0, 0x1

    .line 668
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 671
    .end local v6    # "oldList$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_0
    nop

    .line 637
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 672
    nop

    .line 137
    .end local v1    # "structural$iv":Z
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 644
    .restart local v1    # "structural$iv":Z
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldList$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public clear()V
    .locals 16

    .line 140
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v2, 0x0

    .line 673
    .local v2, "$i$f$writable":I
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v3, v0

    check-cast v3, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v3, "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v4, 0x0

    .line 674
    .local v4, "$i$f$writable":I
    const/4 v5, 0x0

    .line 675
    .local v5, "snapshot$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 676
    .local v6, "$i$f$sync":I
    nop

    .line 677
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v7

    .local v7, "lock$iv$iv$iv$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 678
    .local v8, "$i$f$synchronized":I
    nop

    .line 679
    monitor-enter v7

    const/4 v9, 0x0

    .line 680
    .local v9, "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    :try_start_0
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v0

    move-object v5, v0

    .line 681
    move-object v0, v1

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v3, v0, v5}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v10, v0

    .local v10, "$this$clear_u24lambda_u247":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v11, 0x0

    .line 141
    .local v11, "$i$a$-writable-SnapshotStateList$clear$1":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    .local v12, "lock$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 682
    .local v13, "$i$f$synchronized":I
    nop

    .line 683
    monitor-enter v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x0

    .line 142
    .local v0, "$i$a$-synchronized-SnapshotStateList$clear$1$1":I
    :try_start_1
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentListOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v14

    invoke-virtual {v10, v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setList$runtime_release(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V

    .line 143
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v14

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v10, v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setModification$runtime_release(I)V

    .line 144
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getStructuralChange$runtime_release()I

    move-result v14

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v10, v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->setStructuralChange$runtime_release(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 683
    .end local v0    # "$i$a$-synchronized-SnapshotStateList$clear$1$1":I
    :try_start_2
    monitor-exit v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 145
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    nop

    .line 681
    .end local v10    # "$this$clear_u24lambda_u247":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v11    # "$i$a$-writable-SnapshotStateList$clear$1":I
    nop

    .line 679
    .end local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    monitor-exit v7

    .line 677
    .end local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    nop

    .line 684
    .end local v6    # "$i$f$sync":I
    nop

    .line 685
    .local v14, "it$iv$iv":I
    const/4 v0, 0x0

    .line 684
    .local v0, "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    move-object v6, v1

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 675
    .end local v0    # "$i$a$-also-SnapshotKt$writable$4$iv$iv":I
    .end local v14    # "it$iv$iv":I
    nop

    .line 673
    .end local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v4    # "$i$f$writable":I
    .end local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    nop

    .line 147
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v2    # "$i$f$writable":I
    return-void

    .line 683
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v4    # "$i$f$writable":I
    .restart local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$sync":I
    .restart local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v8    # "$i$f$synchronized":I
    .restart local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .restart local v10    # "$this$clear_u24lambda_u247":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .restart local v11    # "$i$a$-writable-SnapshotStateList$clear$1":I
    .restart local v12    # "lock$iv":Ljava/lang/Object;
    .restart local v13    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v12

    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v2    # "$i$f$writable":I
    .end local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v4    # "$i$f$writable":I
    .end local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$f$sync":I
    .end local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 679
    .end local v9    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv":I
    .end local v10    # "$this$clear_u24lambda_u247":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v11    # "$i$a$-writable-SnapshotStateList$clear$1":I
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v2    # "$i$f$writable":I
    .restart local v3    # "$this$writable$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v4    # "$i$f$writable":I
    .restart local v5    # "snapshot$iv$iv":Ljava/lang/Object;
    .restart local v6    # "$i$f$sync":I
    .restart local v7    # "lock$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v8    # "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    monitor-exit v7

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 98
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 100
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 102
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getDebuggerDisplayValue()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 176
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v1, 0x0

    .line 920
    .local v1, "$i$f$withCurrent":I
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v2, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v2, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v3, 0x0

    .line 921
    .local v3, "$i$f$withCurrent":I
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v4, "$this$_get_debuggerDisplayValue__u24lambda_u2416":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v5, 0x0

    .line 176
    .local v5, "$i$a$-withCurrent-SnapshotStateList$debuggerDisplayValue$1":I
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v4

    .line 921
    .end local v4    # "$this$_get_debuggerDisplayValue__u24lambda_u2416":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v5    # "$i$a$-withCurrent-SnapshotStateList$debuggerDisplayValue$1":I
    nop

    .line 920
    .end local v2    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v3    # "$i$f$withCurrent":I
    nop

    .end local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v1    # "$i$f$withCurrent":I
    check-cast v4, Ljava/util/List;

    .line 176
    return-object v4
.end method

.method public getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1

    .line 40
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    return-object v0
.end method

.method public final getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord<",
            "TT;>;"
        }
    .end annotation

    .line 71
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->readable(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 96
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->size()I

    move-result v0

    return v0
.end method

.method public final getStructure$runtime_release()I
    .locals 6

    .line 67
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v1, 0x0

    .line 540
    .local v1, "$i$f$withCurrent":I
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v2, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v2, "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v3, 0x0

    .line 541
    .local v3, "$i$f$withCurrent":I
    invoke-static {v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v4, "$this$_get_structure__u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v5, 0x0

    .line 67
    .local v5, "$i$a$-withCurrent-SnapshotStateList$structure$1":I
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getStructuralChange$runtime_release()I

    move-result v4

    .line 541
    .end local v4    # "$this$_get_structure__u24lambda_u240":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v5    # "$i$a$-withCurrent-SnapshotStateList$structure$1":I
    nop

    .line 540
    .end local v2    # "$this$withCurrent$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v3    # "$i$f$withCurrent":I
    nop

    .line 67
    .end local v0    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v1    # "$i$f$withCurrent":I
    return v4
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 104
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 106
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 108
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 110
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 112
    new-instance v0, Landroidx/compose/runtime/snapshots/StateListIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/StateListIterator;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 114
    new-instance v0, Landroidx/compose/runtime/snapshots/StateListIterator;

    invoke-direct {v0, p0, p1}, Landroidx/compose/runtime/snapshots/StateListIterator;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method

.method public prependStateRecord(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/runtime/snapshots/StateRecord;

    .line 44
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/StateRecord;->setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V

    .line 46
    const-string/jumbo v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->firstStateRecord:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 47
    return-void
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 35
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->removeAt(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 21
    .param p1, "element"    # Ljava/lang/Object;

    .line 149
    nop

    .line 686
    nop

    .line 687
    const/4 v1, 0x1

    .line 686
    .local v1, "structural$iv":Z
    const/4 v2, 0x0

    .line 689
    .local v2, "$i$f$conditionalUpdate":I
    move-object/from16 v3, p0

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v3, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 690
    .local v4, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 691
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 692
    const/4 v6, 0x0

    .line 693
    .local v6, "oldList$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 694
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 695
    .local v9, "$i$f$synchronized":I
    nop

    .line 696
    monitor-enter v8

    const/4 v0, 0x0

    .line 697
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 698
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 699
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v15, 0x0

    .line 697
    .local v15, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 699
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 698
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 697
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 700
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 701
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v10

    move-object v6, v10

    .line 702
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 696
    monitor-exit v8

    .line 703
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v8, 0x0

    .line 149
    .local v8, "$i$a$-conditionalUpdate$default-SnapshotStateList$remove$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->remove(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 703
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v8    # "$i$a$-conditionalUpdate$default-SnapshotStateList$remove$1":I
    move-object v8, v0

    .line 704
    .local v8, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 705
    const/4 v0, 0x0

    .line 706
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 708
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 709
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 710
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 711
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 712
    .local v15, "$i$f$sync":I
    nop

    .line 713
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 695
    .local v17, "$i$f$synchronized":I
    nop

    .line 696
    monitor-enter v16

    const/4 v0, 0x0

    .line 714
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 715
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 708
    .local v19, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    invoke-static {v3, v0, v7, v8, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 715
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 696
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 713
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 717
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 718
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 717
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 711
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 709
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 708
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 719
    const/4 v0, 0x1

    .line 720
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 723
    .end local v6    # "oldList$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_0
    nop

    .line 689
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 724
    nop

    .line 149
    .end local v1    # "structural$iv":Z
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 696
    .restart local v1    # "structural$iv":Z
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldList$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 21
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 151
    nop

    .line 725
    nop

    .line 726
    const/4 v1, 0x1

    .line 725
    .local v1, "structural$iv":Z
    const/4 v2, 0x0

    .line 728
    .local v2, "$i$f$conditionalUpdate":I
    move-object/from16 v3, p0

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v3, "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v4, 0x0

    .line 729
    .local v4, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    const/4 v5, 0x0

    .line 730
    .local v5, "result$iv":Z
    :cond_0
    nop

    .line 731
    const/4 v6, 0x0

    .line 732
    .local v6, "oldList$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 733
    .local v7, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v8

    .local v8, "lock$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 734
    .local v9, "$i$f$synchronized":I
    nop

    .line 735
    monitor-enter v8

    const/4 v0, 0x0

    .line 736
    .local v0, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    move-object v10, v3

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 737
    .local v11, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    const-string/jumbo v13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 738
    .local v13, "$i$f$withCurrent":I
    invoke-static {v12}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v14

    check-cast v14, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v14, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v15, 0x0

    .line 736
    .local v15, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 738
    .end local v14    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v15    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv":I
    nop

    .line 737
    .end local v12    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$withCurrent":I
    nop

    .line 736
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 739
    .local v14, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v10

    move v7, v10

    .line 740
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v10

    move-object v6, v10

    .line 741
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv":I
    .end local v14    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 735
    monitor-exit v8

    .line 742
    .end local v8    # "lock$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$synchronized":I
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v6

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v8, 0x0

    .line 151
    .local v8, "$i$a$-conditionalUpdate$default-SnapshotStateList$removeAll$1":I
    move-object/from16 v10, p1

    invoke-interface {v0, v10}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->removeAll(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 742
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v8    # "$i$a$-conditionalUpdate$default-SnapshotStateList$removeAll$1":I
    move-object v8, v0

    .line 743
    .local v8, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 744
    const/4 v0, 0x0

    .line 745
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    goto :goto_0

    .line 747
    .end local v0    # "result$iv":Z
    .restart local v5    # "result$iv":Z
    :cond_1
    move-object v9, v3

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 748
    .local v11, "$i$f$writable":I
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 749
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 750
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 751
    .local v15, "$i$f$sync":I
    nop

    .line 752
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 734
    .local v17, "$i$f$synchronized":I
    nop

    .line 735
    monitor-enter v16

    const/4 v0, 0x0

    .line 753
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 754
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 747
    .local v19, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    invoke-static {v3, v0, v7, v8, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 754
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv":I
    nop

    .line 735
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 752
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 756
    .end local v15    # "$i$f$sync":I
    move/from16 v0, v20

    .line 757
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 756
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v9

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 750
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 748
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 747
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v20, :cond_0

    .line 758
    const/4 v0, 0x1

    .line 759
    .end local v5    # "result$iv":Z
    .local v0, "result$iv":Z
    nop

    .line 762
    .end local v6    # "oldList$iv":Ljava/lang/Object;
    .end local v7    # "currentModification$iv":I
    .end local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    :goto_0
    nop

    .line 728
    .end local v0    # "result$iv":Z
    .end local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    nop

    .line 763
    nop

    .line 151
    .end local v1    # "structural$iv":Z
    .end local v2    # "$i$f$conditionalUpdate":I
    return v0

    .line 735
    .restart local v1    # "structural$iv":Z
    .restart local v2    # "$i$f$conditionalUpdate":I
    .restart local v3    # "$this$conditionalUpdate_u24lambda_u2423$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v4    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv":I
    .restart local v5    # "result$iv":Z
    .restart local v6    # "oldList$iv":Ljava/lang/Object;
    .restart local v7    # "currentModification$iv":I
    .restart local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    monitor-exit v16

    throw v0

    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .local v8, "lock$iv$iv":Ljava/lang/Object;
    .local v9, "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move-object/from16 v10, p1

    monitor-exit v8

    throw v0
.end method

.method public removeAt(I)Ljava/lang/Object;
    .locals 26
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 153
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    .line 764
    .local v1, "it":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 153
    .local v2, "$i$a$-also-SnapshotStateList$removeAt$1":I
    nop

    .line 765
    nop

    .line 766
    const/4 v3, 0x1

    .line 765
    .local v3, "structural$iv":Z
    const/4 v4, 0x0

    .line 769
    .local v4, "$i$f$update":I
    move-object/from16 v5, p0

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v6, 0x0

    .line 775
    .local v6, "$i$f$conditionalUpdate":I
    move-object v7, v5

    check-cast v7, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v7, "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v8, 0x0

    .line 776
    .local v8, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    const/4 v9, 0x0

    .line 777
    .local v9, "result$iv$iv":Z
    :goto_0
    nop

    .line 778
    const/4 v10, 0x0

    .line 779
    .local v10, "oldList$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 780
    .local v11, "currentModification$iv$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v12

    .local v12, "lock$iv$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 781
    .local v13, "$i$f$synchronized":I
    nop

    .line 782
    monitor-enter v12

    const/4 v14, 0x0

    .line 783
    .local v14, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    move-object v15, v7

    .local v15, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/16 v16, 0x0

    .line 784
    .local v16, "$i$f$withCurrent":I
    move-object/from16 v17, v0

    :try_start_0
    invoke-virtual {v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move-object/from16 v18, v1

    .end local v1    # "it":Ljava/lang/Object;
    .local v18, "it":Ljava/lang/Object;
    :try_start_1
    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v0, "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v1, 0x0

    .line 785
    .local v1, "$i$f$withCurrent":I
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v19

    check-cast v19, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v19, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v20, 0x0

    .line 783
    .local v20, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 785
    .end local v19    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v20    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 784
    .end local v0    # "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v1    # "$i$f$withCurrent":I
    nop

    .line 783
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v16    # "$i$f$withCurrent":I
    nop

    .line 786
    .local v19, "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v0

    move v11, v0

    .line 787
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    move-object v10, v0

    .line 788
    nop

    .end local v14    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    .end local v19    # "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 782
    monitor-exit v12

    .line 789
    .end local v12    # "lock$iv$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v10

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v1, 0x0

    .line 153
    .local v1, "$i$a$-update$default-SnapshotStateList$removeAt$1$1":I
    move/from16 v14, p1

    invoke-interface {v0, v14}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->removeAt(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 789
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v1    # "$i$a$-update$default-SnapshotStateList$removeAt$1$1":I
    move-object v1, v0

    .line 790
    .local v1, "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 791
    const/4 v0, 0x0

    .line 792
    .end local v9    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    move/from16 v24, v2

    goto :goto_1

    .line 794
    .end local v0    # "result$iv$iv":Z
    .restart local v9    # "result$iv$iv":Z
    :cond_0
    move-object v12, v7

    .local v12, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v13, 0x0

    .line 795
    .local v13, "$i$f$writable":I
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v15, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v15, v0

    check-cast v15, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v15, "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/16 v16, 0x0

    .line 796
    .local v16, "$i$f$writable":I
    const/16 v19, 0x0

    .line 797
    .local v19, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 798
    .local v20, "$i$f$sync":I
    nop

    .line 799
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v21

    .local v21, "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 781
    .local v22, "$i$f$synchronized":I
    nop

    .line 782
    monitor-enter v21

    const/4 v0, 0x0

    .line 800
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_2
    sget-object v23, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v23
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v19, v23

    .line 801
    move/from16 v23, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    .local v23, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_3
    move-object v0, v12

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move/from16 v24, v2

    move-object/from16 v2, v19

    .end local v19    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v24, "$i$a$-also-SnapshotStateList$removeAt$1":I
    :try_start_4
    invoke-static {v15, v0, v2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 794
    .local v19, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    invoke-static {v7, v0, v11, v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v25
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 801
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    nop

    .line 782
    .end local v23    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    monitor-exit v21

    .line 799
    .end local v21    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$f$synchronized":I
    nop

    .line 803
    .end local v20    # "$i$f$sync":I
    move/from16 v0, v25

    .line 804
    .local v0, "it$iv$iv$iv$iv":Z
    const/16 v19, 0x0

    .line 803
    .local v19, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    move/from16 v20, v0

    .end local v0    # "it$iv$iv$iv$iv":Z
    .local v20, "it$iv$iv$iv$iv":Z
    move-object v0, v12

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 797
    .end local v19    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    .end local v20    # "it$iv$iv$iv$iv":Z
    nop

    .line 795
    .end local v2    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v16    # "$i$f$writable":I
    nop

    .line 794
    .end local v12    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$writable":I
    if-eqz v25, :cond_1

    .line 805
    const/4 v0, 0x1

    .line 806
    .end local v9    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    nop

    .line 809
    .end local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v10    # "oldList$iv$iv":Ljava/lang/Object;
    .end local v11    # "currentModification$iv$iv":I
    :goto_1
    nop

    .line 775
    .end local v0    # "result$iv$iv":Z
    .end local v7    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v8    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    nop

    .line 810
    nop

    .line 811
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v6    # "$i$f$conditionalUpdate":I
    nop

    .line 153
    .end local v3    # "structural$iv":Z
    .end local v4    # "$i$f$update":I
    nop

    .end local v18    # "it":Ljava/lang/Object;
    .end local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    return-object v17

    .line 794
    .restart local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v3    # "structural$iv":Z
    .restart local v4    # "$i$f$update":I
    .restart local v5    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v6    # "$i$f$conditionalUpdate":I
    .restart local v7    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v8    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    .restart local v9    # "result$iv$iv":Z
    .restart local v10    # "oldList$iv$iv":Ljava/lang/Object;
    .restart local v11    # "currentModification$iv$iv":I
    .restart local v18    # "it":Ljava/lang/Object;
    .restart local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    :cond_1
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    move/from16 v2, v24

    goto/16 :goto_0

    .line 782
    .restart local v2    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v12    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v13    # "$i$f$writable":I
    .restart local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v16    # "$i$f$writable":I
    .local v20, "$i$f$sync":I
    .restart local v21    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v22    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    move-object/from16 v19, v2

    goto :goto_2

    .end local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .local v2, "$i$a$-also-SnapshotStateList$removeAt$1":I
    .local v19, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move/from16 v24, v2

    move-object/from16 v2, v19

    .end local v19    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    goto :goto_2

    .end local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .local v2, "$i$a$-also-SnapshotStateList$removeAt$1":I
    .restart local v19    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move/from16 v24, v2

    .end local v2    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .restart local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    :goto_2
    monitor-exit v21

    throw v0

    .end local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v15    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v16    # "$i$f$writable":I
    .end local v19    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$f$sync":I
    .end local v21    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$f$synchronized":I
    .end local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .restart local v2    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .local v12, "lock$iv$iv$iv":Ljava/lang/Object;
    .local v13, "$i$f$synchronized":I
    :catchall_3
    move-exception v0

    move/from16 v14, p1

    move/from16 v24, v2

    .end local v2    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .restart local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    goto :goto_3

    .end local v18    # "it":Ljava/lang/Object;
    .end local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .local v1, "it":Ljava/lang/Object;
    .restart local v2    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    :catchall_4
    move-exception v0

    move/from16 v14, p1

    move-object/from16 v18, v1

    move/from16 v24, v2

    .end local v1    # "it":Ljava/lang/Object;
    .end local v2    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    .restart local v18    # "it":Ljava/lang/Object;
    .restart local v24    # "$i$a$-also-SnapshotStateList$removeAt$1":I
    :goto_3
    monitor-exit v12

    throw v0
.end method

.method public final removeRange(II)V
    .locals 21
    .param p1, "fromIndex"    # I
    .param p2, "toIndex"    # I

    .line 161
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v2, 0x0

    .line 856
    .local v2, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v3, v0

    .line 857
    .local v3, "result$iv":Ljava/lang/Object;
    :goto_0
    nop

    .line 858
    const/4 v4, 0x0

    .line 859
    .local v4, "oldList$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 860
    .local v5, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v6

    .local v6, "lock$iv$iv":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 861
    .local v7, "$i$f$synchronized":I
    nop

    .line 862
    monitor-enter v6

    const/4 v0, 0x0

    .line 863
    .local v0, "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    move-object v8, v1

    .local v8, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v9, 0x0

    .line 864
    .local v9, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v10

    const-string/jumbo v11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v10, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v10, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v11, 0x0

    .line 865
    .local v11, "$i$f$withCurrent":I
    invoke-static {v10}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v12, "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v13, 0x0

    .line 863
    .local v13, "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 865
    .end local v12    # "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v13    # "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 864
    .end local v10    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v11    # "$i$f$withCurrent":I
    nop

    .line 863
    .end local v8    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v9    # "$i$f$withCurrent":I
    nop

    .line 866
    .local v12, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v8

    move v5, v8

    .line 867
    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v8

    move-object v4, v8

    .line 868
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    .end local v12    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 862
    monitor-exit v6

    .line 869
    .end local v6    # "lock$iv$iv":Ljava/lang/Object;
    .end local v7    # "$i$f$synchronized":I
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v4}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;

    move-result-object v6

    .line 870
    .local v6, "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .local v0, "it":Ljava/util/List;
    const/4 v7, 0x0

    .line 161
    .local v7, "$i$a$-mutate-SnapshotStateList$removeRange$1":I
    move/from16 v8, p1

    move/from16 v9, p2

    invoke-interface {v0, v8, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->clear()V

    .end local v0    # "it":Ljava/util/List;
    .end local v7    # "$i$a$-mutate-SnapshotStateList$removeRange$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 870
    move-object v3, v0

    .line 871
    invoke-interface {v6}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v7

    .line 872
    .local v7, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 873
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 874
    move-object v10, v1

    .local v10, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v11, 0x0

    .line 875
    .local v11, "$i$f$writable":I
    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v12, v0

    check-cast v12, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v12, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v13, 0x0

    .line 876
    .local v13, "$i$f$writable":I
    const/4 v14, 0x0

    .line 877
    .local v14, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 878
    .local v15, "$i$f$sync":I
    nop

    .line 879
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v16

    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 861
    .local v17, "$i$f$synchronized":I
    nop

    .line 862
    monitor-enter v16

    const/4 v0, 0x0

    .line 880
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v18, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v18

    move-object/from16 v14, v18

    .line 881
    move/from16 v18, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v18, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    move-object v0, v10

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v12, v0, v14}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .local v0, "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v19, 0x0

    .line 874
    .local v19, "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    move/from16 v20, v2

    .end local v2    # "$i$f$mutate":I
    .local v20, "$i$f$mutate":I
    const/4 v2, 0x1

    :try_start_2
    invoke-direct {v1, v0, v5, v7, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 881
    .end local v0    # "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v19    # "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    nop

    .line 862
    .end local v18    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v16

    .line 879
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    nop

    .line 883
    .end local v15    # "$i$f$sync":I
    move v0, v2

    .line 884
    .local v0, "it$iv$iv$iv":Z
    const/4 v15, 0x0

    .line 883
    .local v15, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v16, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v16, "it$iv$iv$iv":Z
    move-object v0, v10

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v14, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 877
    .end local v15    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v16    # "it$iv$iv$iv":Z
    nop

    .line 875
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    nop

    .line 874
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v2, v20

    goto/16 :goto_0

    .line 862
    .restart local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v11    # "$i$f$writable":I
    .restart local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v15, "$i$f$sync":I
    .local v16, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    goto :goto_1

    .end local v20    # "$i$f$mutate":I
    .restart local v2    # "$i$f$mutate":I
    :catchall_1
    move-exception v0

    move/from16 v20, v2

    .end local v2    # "$i$f$mutate":I
    .restart local v20    # "$i$f$mutate":I
    :goto_1
    monitor-exit v16

    throw v0

    .line 873
    .end local v10    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v11    # "$i$f$writable":I
    .end local v12    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$sync":I
    .end local v16    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$synchronized":I
    .end local v20    # "$i$f$mutate":I
    .restart local v2    # "$i$f$mutate":I
    :cond_1
    move/from16 v20, v2

    .line 885
    .end local v2    # "$i$f$mutate":I
    .restart local v20    # "$i$f$mutate":I
    :goto_2
    nop

    .line 887
    .end local v4    # "oldList$iv":Ljava/lang/Object;
    .end local v5    # "currentModification$iv":I
    .end local v6    # "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    .end local v7    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 162
    .end local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v3    # "result$iv":Ljava/lang/Object;
    .end local v20    # "$i$f$mutate":I
    return-void

    .line 862
    .restart local v1    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v2    # "$i$f$mutate":I
    .restart local v3    # "result$iv":Ljava/lang/Object;
    .restart local v4    # "oldList$iv":Ljava/lang/Object;
    .restart local v5    # "currentModification$iv":I
    .local v6, "lock$iv$iv":Ljava/lang/Object;
    .local v7, "$i$f$synchronized":I
    :catchall_2
    move-exception v0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v20, v2

    .end local v2    # "$i$f$mutate":I
    .restart local v20    # "$i$f$mutate":I
    monitor-exit v6

    throw v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 155
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$retainAll$1;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$retainAll$1;-><init>(Ljava/util/Collection;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->mutateBoolean(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    return v0
.end method

.method public final retainAllInRange$runtime_release(Ljava/util/Collection;II)I
    .locals 23
    .param p1, "elements"    # Ljava/util/Collection;
    .param p2, "start"    # I
    .param p3, "end"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;II)I"
        }
    .end annotation

    .line 165
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v1

    .line 166
    .local v1, "startSize":I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v3, 0x0

    .line 888
    .local v3, "$i$f$mutate":I
    const/4 v0, 0x0

    move-object v4, v0

    .line 889
    .local v4, "result$iv":Ljava/lang/Object;
    :goto_0
    nop

    .line 890
    const/4 v5, 0x0

    .line 891
    .local v5, "oldList$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 892
    .local v6, "currentModification$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v7

    .local v7, "lock$iv$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 893
    .local v8, "$i$f$synchronized":I
    nop

    .line 894
    monitor-enter v7

    const/4 v0, 0x0

    .line 895
    .local v0, "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    move-object v9, v2

    .local v9, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v10, 0x0

    .line 896
    .local v10, "$i$f$withCurrent":I
    :try_start_0
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v11

    const-string/jumbo v12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v11, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v11, "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v12, 0x0

    .line 897
    .local v12, "$i$f$withCurrent":I
    invoke-static {v11}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v13

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v13, "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v14, 0x0

    .line 895
    .local v14, "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 897
    .end local v13    # "$this$mutate_u24lambda_u2418_u24lambda_u2417$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v14    # "$i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv":I
    nop

    .line 896
    .end local v11    # "$this$withCurrent$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v12    # "$i$f$withCurrent":I
    nop

    .line 895
    .end local v9    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v10    # "$i$f$withCurrent":I
    nop

    .line 898
    .local v13, "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v9

    move v6, v9

    .line 899
    invoke-virtual {v13}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v9

    move-object v5, v9

    .line 900
    nop

    .end local v0    # "$i$a$-synchronized-SnapshotStateList$mutate$1$iv":I
    .end local v13    # "current$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 894
    monitor-exit v7

    .line 901
    .end local v7    # "lock$iv$iv":Ljava/lang/Object;
    .end local v8    # "$i$f$synchronized":I
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v5}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->builder()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;

    move-result-object v7

    .line 902
    .local v7, "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .local v0, "it":Ljava/util/List;
    const/4 v8, 0x0

    .line 166
    .local v8, "$i$a$-mutate-SnapshotStateList$retainAllInRange$1":I
    move/from16 v9, p2

    move/from16 v10, p3

    invoke-interface {v0, v9, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v11

    move-object/from16 v12, p1

    invoke-interface {v11, v12}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 902
    .end local v0    # "it":Ljava/util/List;
    .end local v8    # "$i$a$-mutate-SnapshotStateList$retainAllInRange$1":I
    move-object v4, v0

    .line 903
    invoke-interface {v7}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;->build()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v8

    .line 904
    .local v8, "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 905
    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 906
    move-object v11, v2

    .local v11, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v13, 0x0

    .line 907
    .local v13, "$i$f$writable":I
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v14, v0

    check-cast v14, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v14, "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v15, 0x0

    .line 908
    .local v15, "$i$f$writable":I
    const/16 v16, 0x0

    .line 909
    .local v16, "snapshot$iv$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 910
    .local v17, "$i$f$sync":I
    nop

    .line 911
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v18

    .local v18, "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 893
    .local v19, "$i$f$synchronized":I
    nop

    .line 894
    monitor-enter v18

    const/4 v0, 0x0

    .line 912
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_1
    sget-object v20, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v20
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v16, v20

    .line 913
    move/from16 v20, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    .local v20, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    :try_start_2
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move/from16 v21, v1

    move-object/from16 v1, v16

    .end local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v1, "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v21, "startSize":I
    :try_start_3
    invoke-static {v14, v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .local v0, "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v16, 0x0

    .line 906
    .local v16, "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    move/from16 v22, v3

    .end local v3    # "$i$f$mutate":I
    .local v22, "$i$f$mutate":I
    const/4 v3, 0x1

    :try_start_4
    invoke-direct {v2, v0, v6, v8, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 913
    .end local v0    # "$this$mutate_u24lambda_u2419$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v16    # "$i$a$-writable-SnapshotStateList$mutate$2$iv":I
    nop

    .line 894
    .end local v20    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv":I
    monitor-exit v18

    .line 911
    .end local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    nop

    .line 915
    .end local v17    # "$i$f$sync":I
    move v0, v3

    .line 916
    .local v0, "it$iv$iv$iv":Z
    const/16 v16, 0x0

    .line 915
    .local v16, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    move/from16 v17, v0

    .end local v0    # "it$iv$iv$iv":Z
    .local v17, "it$iv$iv$iv":Z
    move-object v0, v11

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 909
    .end local v16    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv":I
    .end local v17    # "it$iv$iv$iv":Z
    nop

    .line 907
    .end local v1    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$writable":I
    nop

    .line 906
    .end local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$writable":I
    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v1, v21

    move/from16 v3, v22

    goto/16 :goto_0

    .line 894
    .restart local v1    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .restart local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v13    # "$i$f$writable":I
    .restart local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v15    # "$i$f$writable":I
    .local v17, "$i$f$sync":I
    .restart local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v19    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    move-object/from16 v16, v1

    goto :goto_1

    .end local v22    # "$i$f$mutate":I
    .restart local v3    # "$i$f$mutate":I
    :catchall_1
    move-exception v0

    move/from16 v22, v3

    move-object/from16 v16, v1

    .end local v3    # "$i$f$mutate":I
    .restart local v22    # "$i$f$mutate":I
    goto :goto_1

    .end local v21    # "startSize":I
    .end local v22    # "$i$f$mutate":I
    .local v1, "startSize":I
    .restart local v3    # "$i$f$mutate":I
    .local v16, "snapshot$iv$iv$iv":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move/from16 v21, v1

    move/from16 v22, v3

    move-object/from16 v1, v16

    .end local v3    # "$i$f$mutate":I
    .end local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .local v1, "snapshot$iv$iv$iv":Ljava/lang/Object;
    .restart local v21    # "startSize":I
    .restart local v22    # "$i$f$mutate":I
    goto :goto_1

    .end local v21    # "startSize":I
    .end local v22    # "$i$f$mutate":I
    .local v1, "startSize":I
    .restart local v3    # "$i$f$mutate":I
    .restart local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    :catchall_3
    move-exception v0

    move/from16 v21, v1

    move/from16 v22, v3

    .end local v1    # "startSize":I
    .end local v3    # "$i$f$mutate":I
    .restart local v21    # "startSize":I
    .restart local v22    # "$i$f$mutate":I
    :goto_1
    monitor-exit v18

    throw v0

    .line 905
    .end local v11    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v13    # "$i$f$writable":I
    .end local v14    # "$this$writable$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v15    # "$i$f$writable":I
    .end local v16    # "snapshot$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$f$sync":I
    .end local v18    # "lock$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$f$synchronized":I
    .end local v21    # "startSize":I
    .end local v22    # "$i$f$mutate":I
    .restart local v1    # "startSize":I
    .restart local v3    # "$i$f$mutate":I
    :cond_1
    move/from16 v21, v1

    move/from16 v22, v3

    .line 917
    .end local v1    # "startSize":I
    .end local v3    # "$i$f$mutate":I
    .restart local v21    # "startSize":I
    .restart local v22    # "$i$f$mutate":I
    :goto_2
    nop

    .line 919
    .end local v5    # "oldList$iv":Ljava/lang/Object;
    .end local v6    # "currentModification$iv":I
    .end local v7    # "builder$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;
    .end local v8    # "newList$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    nop

    .line 167
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v4    # "result$iv":Ljava/lang/Object;
    .end local v22    # "$i$f$mutate":I
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    sub-int v1, v21, v0

    return v1

    .line 894
    .end local v21    # "startSize":I
    .restart local v1    # "startSize":I
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v3    # "$i$f$mutate":I
    .restart local v4    # "result$iv":Ljava/lang/Object;
    .restart local v5    # "oldList$iv":Ljava/lang/Object;
    .restart local v6    # "currentModification$iv":I
    .local v7, "lock$iv$iv":Ljava/lang/Object;
    .local v8, "$i$f$synchronized":I
    :catchall_4
    move-exception v0

    move-object/from16 v12, p1

    move/from16 v9, p2

    move/from16 v10, p3

    move/from16 v21, v1

    move/from16 v22, v3

    .end local v1    # "startSize":I
    .end local v3    # "$i$f$mutate":I
    .restart local v21    # "startSize":I
    .restart local v22    # "$i$f$mutate":I
    monitor-exit v7

    throw v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 28
    .param p1, "index"    # I
    .param p2, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .line 158
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    .line 812
    .local v1, "it":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 158
    .local v2, "$i$a$-also-SnapshotStateList$set$1":I
    const/4 v3, 0x0

    .local v3, "structural$iv":Z
    move-object/from16 v4, p0

    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v5, 0x0

    .line 813
    .local v5, "$i$f$update":I
    move-object v6, v4

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v7, 0x0

    .line 819
    .local v7, "$i$f$conditionalUpdate":I
    move-object v8, v6

    check-cast v8, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .local v8, "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/4 v9, 0x0

    .line 820
    .local v9, "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    const/4 v10, 0x0

    .line 821
    .local v10, "result$iv$iv":Z
    :goto_0
    nop

    .line 822
    const/4 v11, 0x0

    .line 823
    .local v11, "oldList$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 824
    .local v12, "currentModification$iv$iv":I
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateListKt;->access$getSync$p()Ljava/lang/Object;

    move-result-object v13

    .local v13, "lock$iv$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 825
    .local v14, "$i$f$synchronized":I
    nop

    .line 826
    monitor-enter v13

    const/4 v15, 0x0

    .line 827
    .local v15, "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    move-object/from16 v16, v8

    .local v16, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/16 v17, 0x0

    .line 828
    .local v17, "$i$f$withCurrent":I
    move-object/from16 v18, v0

    :try_start_0
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move-object/from16 v19, v1

    .end local v1    # "it":Ljava/lang/Object;
    .local v19, "it":Ljava/lang/Object;
    :try_start_1
    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v0, "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v1, 0x0

    .line 829
    .local v1, "$i$f$withCurrent":I
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v20

    check-cast v20, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v20, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v21, 0x0

    .line 827
    .local v21, "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 829
    .end local v20    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2421_u24lambda_u2420$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v21    # "$i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv":I
    nop

    .line 828
    .end local v0    # "$this$withCurrent$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v1    # "$i$f$withCurrent":I
    nop

    .line 827
    .end local v16    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v17    # "$i$f$withCurrent":I
    nop

    .line 830
    .local v20, "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getModification$runtime_release()I

    move-result v0

    move v12, v0

    .line 831
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    move-object v11, v0

    .line 832
    nop

    .end local v15    # "$i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv":I
    .end local v20    # "current$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 826
    monitor-exit v13

    .line 833
    .end local v13    # "lock$iv$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$synchronized":I
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v11

    .local v0, "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    const/4 v1, 0x0

    .line 158
    .local v1, "$i$a$-update-SnapshotStateList$set$1$1":I
    move/from16 v15, p1

    move-object/from16 v13, p2

    invoke-interface {v0, v15, v13}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;->set(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    .line 833
    .end local v0    # "it":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v1    # "$i$a$-update-SnapshotStateList$set$1$1":I
    move-object v1, v0

    .line 834
    .local v1, "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    const/4 v0, 0x0

    .line 836
    .end local v10    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    move/from16 v17, v2

    move-object/from16 v26, v4

    goto :goto_1

    .line 838
    .end local v0    # "result$iv$iv":Z
    .restart local v10    # "result$iv$iv":Z
    :cond_0
    move-object v14, v8

    .local v14, "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    const/16 v16, 0x0

    .line 839
    .local v16, "$i$f$writable":I
    invoke-virtual {v14}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    move/from16 v17, v2

    .end local v2    # "$i$a$-also-SnapshotStateList$set$1":I
    .local v17, "$i$a$-also-SnapshotStateList$set$1":I
    const-string/jumbo v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-object v2, v0

    check-cast v2, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v2, "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/16 v20, 0x0

    .line 840
    .local v20, "$i$f$writable":I
    const/16 v21, 0x0

    .line 841
    .local v21, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 842
    .local v22, "$i$f$sync":I
    nop

    .line 843
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v23

    .local v23, "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 825
    .local v24, "$i$f$synchronized":I
    nop

    .line 826
    monitor-enter v23

    const/4 v0, 0x0

    .line 844
    .local v0, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_2
    sget-object v25, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v25
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v21, v25

    .line 845
    move/from16 v25, v0

    .end local v0    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    .local v25, "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    :try_start_3
    move-object v0, v14

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object/from16 v26, v4

    move-object/from16 v4, v21

    .end local v21    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v4, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v26, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    :try_start_4
    invoke-static {v2, v0, v4}, Landroidx/compose/runtime/snapshots/SnapshotKt;->writableRecord(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v0, "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/16 v21, 0x0

    .line 838
    .local v21, "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    invoke-static {v8, v0, v12, v1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->access$attemptUpdate(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Z)Z

    move-result v27
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 845
    .end local v0    # "$this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v21    # "$i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv":I
    nop

    .line 826
    .end local v25    # "$i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv":I
    monitor-exit v23

    .line 843
    .end local v23    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v24    # "$i$f$synchronized":I
    nop

    .line 847
    .end local v22    # "$i$f$sync":I
    move/from16 v0, v27

    .line 848
    .local v0, "it$iv$iv$iv$iv":Z
    const/16 v21, 0x0

    .line 847
    .local v21, "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    move/from16 v22, v0

    .end local v0    # "it$iv$iv$iv$iv":Z
    .local v22, "it$iv$iv$iv$iv":Z
    move-object v0, v14

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObject;

    invoke-static {v4, v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->notifyWrite(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 841
    .end local v21    # "$i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv":I
    .end local v22    # "it$iv$iv$iv$iv":Z
    nop

    .line 839
    .end local v2    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v4    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$f$writable":I
    nop

    .line 838
    .end local v14    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v16    # "$i$f$writable":I
    if-eqz v27, :cond_1

    .line 849
    const/4 v0, 0x1

    .line 850
    .end local v10    # "result$iv$iv":Z
    .local v0, "result$iv$iv":Z
    nop

    .line 853
    .end local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v11    # "oldList$iv$iv":Ljava/lang/Object;
    .end local v12    # "currentModification$iv$iv":I
    :goto_1
    nop

    .line 819
    .end local v0    # "result$iv$iv":Z
    .end local v8    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v9    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    nop

    .line 854
    nop

    .line 855
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .end local v7    # "$i$f$conditionalUpdate":I
    nop

    .line 158
    .end local v3    # "structural$iv":Z
    .end local v5    # "$i$f$update":I
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    nop

    .end local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .end local v19    # "it":Ljava/lang/Object;
    return-object v18

    .line 838
    .restart local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .restart local v3    # "structural$iv":Z
    .restart local v5    # "$i$f$update":I
    .restart local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v7    # "$i$f$conditionalUpdate":I
    .restart local v8    # "$this$conditionalUpdate_u24lambda_u2423$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v9    # "$i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv":I
    .restart local v10    # "result$iv$iv":Z
    .restart local v11    # "oldList$iv$iv":Ljava/lang/Object;
    .restart local v12    # "currentModification$iv$iv":I
    .restart local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .restart local v19    # "it":Ljava/lang/Object;
    .restart local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    :cond_1
    move/from16 v2, v17

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    move-object/from16 v4, v26

    goto/16 :goto_0

    .line 826
    .restart local v2    # "$this$writable$iv$iv$iv$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .restart local v4    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v14    # "this_$iv$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v16    # "$i$f$writable":I
    .restart local v20    # "$i$f$writable":I
    .local v22, "$i$f$sync":I
    .restart local v23    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$i$f$synchronized":I
    :catchall_0
    move-exception v0

    move-object/from16 v21, v4

    goto :goto_2

    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .local v21, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move-object/from16 v26, v4

    move-object/from16 v4, v21

    .end local v21    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .local v4, "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    goto :goto_2

    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v21    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move-object/from16 v26, v4

    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    :goto_2
    monitor-exit v23

    throw v0

    .end local v1    # "newList$iv$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v16    # "$i$f$writable":I
    .end local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .end local v20    # "$i$f$writable":I
    .end local v21    # "snapshot$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$f$sync":I
    .end local v23    # "lock$iv$iv$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v24    # "$i$f$synchronized":I
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .local v2, "$i$a$-also-SnapshotStateList$set$1":I
    .restart local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v13    # "lock$iv$iv$iv":Ljava/lang/Object;
    .local v14, "$i$f$synchronized":I
    :catchall_3
    move-exception v0

    move/from16 v15, p1

    move/from16 v17, v2

    move-object/from16 v26, v4

    .end local v2    # "$i$a$-also-SnapshotStateList$set$1":I
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .restart local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    goto :goto_3

    .end local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .end local v19    # "it":Ljava/lang/Object;
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .local v1, "it":Ljava/lang/Object;
    .restart local v2    # "$i$a$-also-SnapshotStateList$set$1":I
    .restart local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    :catchall_4
    move-exception v0

    move/from16 v15, p1

    move-object/from16 v19, v1

    move/from16 v17, v2

    move-object/from16 v26, v4

    .end local v1    # "it":Ljava/lang/Object;
    .end local v2    # "$i$a$-also-SnapshotStateList$set$1":I
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .restart local v17    # "$i$a$-also-SnapshotStateList$set$1":I
    .restart local v19    # "it":Ljava/lang/Object;
    .restart local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotStateList;
    :goto_3
    monitor-exit v13

    throw v0
.end method

.method public final bridge size()I
    .locals 1

    .line 35
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getSize()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 3
    .param p1, "fromIndex"    # I
    .param p2, "toIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 117
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v2

    if-gt p2, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    .local v0, "value$iv":Z
    :goto_1
    const/4 v1, 0x0

    .line 542
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 543
    if-nez v0, :cond_2

    .line 544
    const/4 v2, 0x0

    .line 118
    .local v2, "$i$a$-requirePrecondition-SnapshotStateList$subList$1":I
    nop

    .line 544
    .end local v2    # "$i$a$-requirePrecondition-SnapshotStateList$subList$1":I
    const-string v2, "fromIndex or toIndex are out of bounds"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 546
    :cond_2
    nop

    .line 120
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    new-instance v0, Landroidx/compose/runtime/snapshots/SubList;

    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/runtime/snapshots/SubList;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getReadable$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 125
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->getFirstStateRecord()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    check-cast v0, Landroidx/compose/runtime/snapshots/StateRecord;

    .local v0, "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    const/4 v1, 0x0

    .line 547
    .local v1, "$i$f$withCurrent":I
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotKt;->current(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;

    .local v2, "it":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    const/4 v3, 0x0

    .line 126
    .local v3, "$i$a$-withCurrent-SnapshotStateList$toString$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SnapshotStateList(value="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;->getList$runtime_release()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")@"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->hashCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 547
    .end local v2    # "it":Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;
    .end local v3    # "$i$a$-withCurrent-SnapshotStateList$toString$1":I
    nop

    .line 127
    .end local v0    # "$this$withCurrent$iv":Landroidx/compose/runtime/snapshots/StateRecord;
    .end local v1    # "$i$f$withCurrent":I
    return-object v2
.end method
