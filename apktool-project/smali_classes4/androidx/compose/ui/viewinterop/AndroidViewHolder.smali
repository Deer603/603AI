.class public Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.super Landroid/view/ViewGroup;
.source "AndroidViewHolder.android.kt"

# interfaces
.implements Landroidx/core/view/NestedScrollingParent3;
.implements Landroidx/compose/runtime/ComposeNodeLifecycleCallback;
.implements Landroidx/compose/ui/node/OwnerScope;
.implements Landroidx/core/view/OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,737:1\n677#1,6:776\n683#1,2:783\n685#1:791\n686#1:802\n687#1,7:807\n677#1,6:814\n683#1,2:821\n685#1:829\n686#1:840\n687#1,7:845\n1#2:738\n56#3,5:739\n30#4:744\n30#4:748\n30#4:758\n30#4:762\n30#4:766\n30#4:803\n30#4:841\n30#4:866\n53#5,3:745\n53#5,3:749\n60#5:753\n70#5:756\n53#5,3:759\n53#5,3:763\n53#5,3:767\n60#5:771\n70#5:774\n85#5:787\n90#5:790\n53#5,3:804\n85#5:825\n90#5:828\n53#5,3:842\n85#5:856\n90#5:859\n85#5:862\n90#5:865\n53#5,3:867\n65#6:752\n69#6:755\n65#6:770\n69#6:773\n22#7:754\n22#7:757\n22#7:772\n22#7:775\n105#8:782\n105#8:820\n105#8:852\n105#8:853\n105#8:870\n105#8:871\n105#8:872\n105#8:873\n105#8:874\n105#8:875\n61#9:785\n54#9:786\n63#9:788\n59#9:789\n54#9,10:792\n61#9:823\n54#9:824\n63#9:826\n59#9:827\n54#9,10:830\n61#9:854\n54#9:855\n63#9:857\n59#9:858\n61#9:860\n54#9:861\n63#9:863\n59#9:864\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n668#1:776,6\n668#1:783,2\n668#1:791\n668#1:802\n668#1:807,7\n672#1:814,6\n672#1:821,2\n672#1:829\n672#1:840\n672#1:845,7\n199#1:739,5\n594#1:744\n595#1:748\n612#1:758\n613#1:762\n622#1:766\n668#1:803\n672#1:841\n686#1:866\n594#1:745,3\n595#1:749,3\n598#1:753\n599#1:756\n612#1:759,3\n613#1:763,3\n622#1:767,3\n625#1:771\n626#1:774\n668#1:787\n668#1:790\n668#1:804,3\n672#1:825\n672#1:828\n672#1:842,3\n684#1:856\n684#1:859\n685#1:862\n685#1:865\n686#1:867,3\n598#1:752\n599#1:755\n625#1:770\n626#1:773\n598#1:754\n599#1:757\n625#1:772\n626#1:775\n668#1:782\n672#1:820\n682#1:852\n683#1:853\n687#1:870\n688#1:871\n699#1:872\n700#1:873\n701#1:874\n702#1:875\n668#1:785\n668#1:786\n668#1:788\n668#1:789\n668#1:792,10\n672#1:823\n672#1:824\n672#1:826\n672#1:827\n672#1:830,10\n684#1:854\n684#1:855\n684#1:857\n684#1:858\n685#1:860\n685#1:861\n685#1:863\n685#1:864\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0007\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0010\u0018\u0000 \u00b4\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u00b4\u0001B7\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010c\u001a\u00020\u001b2\u0008\u0010d\u001a\u0004\u0018\u00010eH\u0016J\u0008\u0010f\u001a\u00020gH\u0016J\u000e\u0010h\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`iJ\n\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0008\u0010l\u001a\u00020\u000bH\u0016J\u0010\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010p\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J~\u0010q\u001a\u0002Hr\"\u0004\u0008\u0000\u0010r2\u0006\u0010\u0013\u001a\u0002Hr2`\u0010s\u001a\\\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008u\u0012\u0008\u0008v\u0012\u0004\u0008\u0008(w\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008u\u0012\u0008\u0008v\u0012\u0004\u0008\u0008(x\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008u\u0012\u0008\u0008v\u0012\u0004\u0008\u0008(y\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008u\u0012\u0008\u0008v\u0012\u0004\u0008\u0008(z\u0012\u0004\u0012\u0002Hr0tH\u0082\u0008\u00a2\u0006\u0002\u0010{J\u001e\u0010|\u001a\u0004\u0018\u00010}2\u0008\u0010-\u001a\u0004\u0018\u00010.2\u0008\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u0007\u0010\u0080\u0001\u001a\u000209J\t\u0010\u0081\u0001\u001a\u00020\u001bH\u0016J$\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u000bH\u0002J\u001a\u0010\u0086\u0001\u001a\u00020\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u0088\u0001\u001a\u000209H\u0014J\t\u0010\u0089\u0001\u001a\u000209H\u0016J\u001b\u0010\u008a\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u008d\u0001\u001a\u000209H\u0014J2\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u008f\u0001\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020\u000bH\u0014J\u001b\u0010\u0090\u0001\u001a\u0002092\u0007\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000bH\u0014J/\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0008\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0008\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u001bH\u0016J&\u0010\u0098\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0008\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0008\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016J6\u0010\u0099\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J?\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010\u00a0\u0001\u001a\u00020\u000b2\u0007\u0010\u00a1\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016JH\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010\u00a0\u0001\u001a\u00020\u000b2\u0007\u0010\u00a1\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.H\u0016J-\u0010\u00a2\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u00a3\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u00a4\u0001\u001a\u000209H\u0016J\t\u0010\u00a5\u0001\u001a\u000209H\u0016J-\u0010\u00a6\u0001\u001a\u00020\u001b2\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u00a3\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u001b\u0010\u00a7\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010\u00a8\u0001\u001a\u0002092\u0007\u0010\u00a9\u0001\u001a\u00020\u000bH\u0014J\u0007\u0010\u00aa\u0001\u001a\u000209J\u0012\u0010\u00ab\u0001\u001a\u0002092\u0007\u0010\u00ac\u0001\u001a\u00020\u001bH\u0016J\t\u0010\u00ad\u0001\u001a\u00020\u001bH\u0016J3\u0010\u00ae\u0001\u001a\u00030\u00af\u0001*\u00030\u00af\u00012\u0007\u0010\u00b0\u0001\u001a\u00020\u000b2\u0007\u0010\u00b1\u0001\u001a\u00020\u000b2\u0007\u0010\u00b2\u0001\u001a\u00020\u000b2\u0007\u0010\u00b3\u0001\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R(\u0010(\u001a\u0004\u0018\u00010\'2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\'@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R(\u0010>\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010;\"\u0004\u0008@\u0010=R(\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008B\u0010;\"\u0004\u0008C\u0010=R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010G\u001a\u0008\u0012\u0004\u0012\u0002090F2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u0002090F@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008H\u0010I\"\u0004\u0008J\u0010KR0\u0010L\u001a\u0008\u0012\u0004\u0012\u0002090F2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u0002090F@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010I\"\u0004\u0008N\u0010KR\u0014\u0010O\u001a\u0008\u0012\u0004\u0012\u0002090FX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u0008\u0012\u0004\u0012\u0002090FX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010R\u001a\u0004\u0018\u00010Q2\u0008\u0010\u0013\u001a\u0004\u0018\u00010Q@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008S\u0010T\"\u0004\u0008U\u0010VR\u0016\u0010W\u001a\u00020XX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010YR\u0014\u0010Z\u001a\u00020[8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010]R0\u0010^\u001a\u0008\u0012\u0004\u0012\u0002090F2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u0002090F@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008_\u0010I\"\u0004\u0008`\u0010KR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00b5\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Landroid/view/ViewGroup;",
        "Landroidx/core/view/NestedScrollingParent3;",
        "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;",
        "Landroidx/compose/ui/node/OwnerScope;",
        "Landroidx/core/view/OnApplyWindowInsetsListener;",
        "context",
        "Landroid/content/Context;",
        "parentContext",
        "Landroidx/compose/runtime/CompositionContext;",
        "compositeKeyHash",
        "",
        "dispatcher",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;",
        "view",
        "Landroid/view/View;",
        "owner",
        "Landroidx/compose/ui/node/Owner;",
        "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V",
        "value",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "getDensity",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity",
        "(Landroidx/compose/ui/unit/Density;)V",
        "hasUpdateBlock",
        "",
        "insets",
        "Landroidx/core/view/WindowInsetsCompat;",
        "isDrawing",
        "isValidOwnerScope",
        "()Z",
        "lastHeightMeasureSpec",
        "lastWidthMeasureSpec",
        "layoutNode",
        "Landroidx/compose/ui/node/LayoutNode;",
        "getLayoutNode",
        "()Landroidx/compose/ui/node/LayoutNode;",
        "Landroidx/lifecycle/LifecycleOwner;",
        "lifecycleOwner",
        "getLifecycleOwner",
        "()Landroidx/lifecycle/LifecycleOwner;",
        "setLifecycleOwner",
        "(Landroidx/lifecycle/LifecycleOwner;)V",
        "location",
        "",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "setModifier",
        "(Landroidx/compose/ui/Modifier;)V",
        "nestedScrollingParentHelper",
        "Landroidx/core/view/NestedScrollingParentHelper;",
        "onDensityChanged",
        "Lkotlin/Function1;",
        "",
        "getOnDensityChanged$ui_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnDensityChanged$ui_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onModifierChanged",
        "getOnModifierChanged$ui_release",
        "setOnModifierChanged$ui_release",
        "onRequestDisallowInterceptTouchEvent",
        "getOnRequestDisallowInterceptTouchEvent$ui_release",
        "setOnRequestDisallowInterceptTouchEvent$ui_release",
        "position",
        "<set-?>",
        "Lkotlin/Function0;",
        "release",
        "getRelease",
        "()Lkotlin/jvm/functions/Function0;",
        "setRelease",
        "(Lkotlin/jvm/functions/Function0;)V",
        "reset",
        "getReset",
        "setReset",
        "runInvalidate",
        "runUpdate",
        "Landroidx/savedstate/SavedStateRegistryOwner;",
        "savedStateRegistryOwner",
        "getSavedStateRegistryOwner",
        "()Landroidx/savedstate/SavedStateRegistryOwner;",
        "setSavedStateRegistryOwner",
        "(Landroidx/savedstate/SavedStateRegistryOwner;)V",
        "size",
        "Landroidx/compose/ui/unit/IntSize;",
        "J",
        "snapshotObserver",
        "Landroidx/compose/ui/node/OwnerSnapshotObserver;",
        "getSnapshotObserver",
        "()Landroidx/compose/ui/node/OwnerSnapshotObserver;",
        "update",
        "getUpdate",
        "setUpdate",
        "getView",
        "()Landroid/view/View;",
        "gatherTransparentRegion",
        "region",
        "Landroid/graphics/Region;",
        "getAccessibilityClassName",
        "",
        "getInteropView",
        "Landroidx/compose/ui/viewinterop/InteropView;",
        "getLayoutParams",
        "Landroid/view/ViewGroup$LayoutParams;",
        "getNestedScrollAxes",
        "insetBounds",
        "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;",
        "bounds",
        "insetToLayoutPosition",
        "insetValue",
        "T",
        "block",
        "Lkotlin/Function4;",
        "Lkotlin/ParameterName;",
        "name",
        "l",
        "t",
        "r",
        "b",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;",
        "invalidateChildInParent",
        "Landroid/view/ViewParent;",
        "dirty",
        "Landroid/graphics/Rect;",
        "invalidateOrDefer",
        "isNestedScrollingEnabled",
        "obtainMeasureSpec",
        "min",
        "max",
        "preferred",
        "onApplyWindowInsets",
        "v",
        "onAttachedToWindow",
        "onDeactivate",
        "onDescendantInvalidated",
        "child",
        "target",
        "onDetachedFromWindow",
        "onLayout",
        "changed",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onNestedFling",
        "velocityX",
        "",
        "velocityY",
        "consumed",
        "onNestedPreFling",
        "onNestedPreScroll",
        "dx",
        "dy",
        "type",
        "onNestedScroll",
        "dxConsumed",
        "dyConsumed",
        "dxUnconsumed",
        "dyUnconsumed",
        "onNestedScrollAccepted",
        "axes",
        "onRelease",
        "onReuse",
        "onStartNestedScroll",
        "onStopNestedScroll",
        "onWindowVisibilityChanged",
        "visibility",
        "remeasure",
        "requestDisallowInterceptTouchEvent",
        "disallowIntercept",
        "shouldDelayChildPressedState",
        "inset",
        "Landroidx/core/graphics/Insets;",
        "left",
        "top",
        "right",
        "bottom",
        "Companion",
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

.field public static final Companion:Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;

.field private static final OnCommitAffectingUpdate:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final compositeKeyHash:I

.field private density:Landroidx/compose/ui/unit/Density;

.field private final dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

.field private hasUpdateBlock:Z

.field private insets:Landroidx/core/view/WindowInsetsCompat;

.field private isDrawing:Z

.field private lastHeightMeasureSpec:I

.field private lastWidthMeasureSpec:I

.field private final layoutNode:Landroidx/compose/ui/node/LayoutNode;

.field private lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private final location:[I

.field private modifier:Landroidx/compose/ui/Modifier;

.field private final nestedScrollingParentHelper:Landroidx/core/view/NestedScrollingParentHelper;

.field private onDensityChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onModifierChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onRequestDisallowInterceptTouchEvent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final owner:Landroidx/compose/ui/node/Owner;

.field private final position:[I

.field private release:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private reset:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final runInvalidate:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final runUpdate:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private savedStateRegistryOwner:Landroidx/savedstate/SavedStateRegistryOwner;

.field private size:J

.field private update:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final view:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->Companion:Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->$stable:I

    .line 707
    sget-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion$OnCommitAffectingUpdate$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion$OnCommitAffectingUpdate$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->OnCommitAffectingUpdate:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V
    .locals 32
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "parentContext"    # Landroidx/compose/runtime/CompositionContext;
    .param p3, "compositeKeyHash"    # I
    .param p4, "dispatcher"    # Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;
    .param p5, "view"    # Landroid/view/View;
    .param p6, "owner"    # Landroidx/compose/ui/node/Owner;

    .line 98
    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 93
    move/from16 v1, p3

    iput v1, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->compositeKeyHash:I

    .line 94
    move-object/from16 v2, p4

    iput-object v2, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    .line 95
    move-object/from16 v3, p5

    iput-object v3, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    .line 96
    move-object/from16 v4, p6

    iput-object v4, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->owner:Landroidx/compose/ui/node/Owner;

    .line 104
    nop

    .line 108
    if-eqz p2, :cond_0

    move-object/from16 v5, p2

    .line 738
    .local v5, "it":Landroidx/compose/runtime/CompositionContext;
    const/4 v6, 0x0

    .line 108
    .local v6, "$i$a$-let-AndroidViewHolder$1":I
    move-object v7, v0

    check-cast v7, Landroid/view/View;

    invoke-static {v7, v5}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt;->setCompositionContext(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V

    .line 110
    .end local v5    # "it":Landroidx/compose/runtime/CompositionContext;
    .end local v6    # "$i$a$-let-AndroidViewHolder$1":I
    :cond_0
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setSaveFromParentEnabled(Z)V

    .line 112
    iget-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->addView(Landroid/view/View;)V

    .line 114
    move-object v6, v0

    check-cast v6, Landroid/view/View;

    .line 115
    new-instance v7, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;

    invoke-direct {v7, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast v7, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;

    .line 113
    invoke-static {v6, v7}, Landroidx/core/view/ViewCompat;->setWindowInsetsAnimationCallback(Landroid/view/View;Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)V

    .line 127
    move-object v6, v0

    check-cast v6, Landroid/view/View;

    move-object v7, v0

    check-cast v7, Landroidx/core/view/OnApplyWindowInsetsListener;

    invoke-static {v6, v7}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 128
    nop

    .line 134
    sget-object v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder$update$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewHolder$update$1;

    check-cast v6, Lkotlin/jvm/functions/Function0;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->update:Lkotlin/jvm/functions/Function0;

    .line 143
    sget-object v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder$reset$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewHolder$reset$1;

    check-cast v6, Lkotlin/jvm/functions/Function0;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->reset:Lkotlin/jvm/functions/Function0;

    .line 146
    sget-object v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder$release$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewHolder$release$1;

    check-cast v6, Lkotlin/jvm/functions/Function0;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->release:Lkotlin/jvm/functions/Function0;

    .line 150
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Landroidx/compose/ui/Modifier;

    .line 161
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/unit/DensityKt;->Density$default(FFILjava/lang/Object;)Landroidx/compose/ui/unit/Density;

    move-result-object v6

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Landroidx/compose/ui/unit/Density;

    .line 189
    new-array v6, v8, [I

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->position:[I

    .line 190
    sget-object v6, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v6

    iput-wide v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->size:J

    .line 205
    new-instance v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;

    invoke-direct {v6, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runUpdate:Lkotlin/jvm/functions/Function0;

    .line 215
    new-instance v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runInvalidate$1;

    invoke-direct {v6, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runInvalidate$1;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runInvalidate:Lkotlin/jvm/functions/Function0;

    .line 219
    new-array v6, v8, [I

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    .line 221
    const/high16 v6, -0x80000000

    iput v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastWidthMeasureSpec:I

    .line 222
    iput v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastHeightMeasureSpec:I

    .line 225
    new-instance v6, Landroidx/core/view/NestedScrollingParentHelper;

    move-object v7, v0

    check-cast v7, Landroid/view/ViewGroup;

    invoke-direct {v6, v7}, Landroidx/core/view/NestedScrollingParentHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object v6, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->nestedScrollingParentHelper:Landroidx/core/view/NestedScrollingParentHelper;

    .line 378
    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .local v6, "$this$layoutNode_u24lambda_u243":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    const/4 v7, 0x0

    .line 380
    .local v7, "$i$a$-run-AndroidViewHolder$layoutNode$1":I
    new-instance v8, Landroidx/compose/ui/node/LayoutNode;

    const/4 v10, 0x3

    invoke-direct {v8, v5, v5, v10, v9}, Landroidx/compose/ui/node/LayoutNode;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 387
    .local v8, "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Landroidx/compose/ui/node/LayoutNode;->setForceUseOldLayers(Z)V

    .line 390
    invoke-virtual {v8, v0}, Landroidx/compose/ui/node/LayoutNode;->setInteropViewFactoryHolder$ui_release(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    .line 393
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v9, Landroidx/compose/ui/Modifier;

    invoke-static {}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$getNoOpScrollConnection$p()Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    iget-object v11, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    invoke-static {v9, v10, v11}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 394
    sget-object v10, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v5, v10}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 395
    invoke-static {v5, v6}, Landroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt;->pointerInteropFilter(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 397
    const v30, 0x1ffff

    const/16 v31, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v9 .. v31}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer-Ap8cVGQ$default(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 398
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2;

    invoke-direct {v9, v6, v8, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v9}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 410
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$3;

    invoke-direct {v9, v6, v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$3;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v9}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 392
    nop

    .line 443
    .local v5, "coreModifier":Landroidx/compose/ui/Modifier;
    iget v9, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->compositeKeyHash:I

    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setCompositeKeyHash(I)V

    .line 444
    iget-object v9, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Landroidx/compose/ui/Modifier;

    invoke-interface {v9, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setModifier(Landroidx/compose/ui/Modifier;)V

    .line 445
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$1;

    invoke-direct {v9, v8, v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$1;-><init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/Modifier;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iput-object v9, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lkotlin/jvm/functions/Function1;

    .line 447
    iget-object v9, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Landroidx/compose/ui/unit/Density;

    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 448
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$2;

    invoke-direct {v9, v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$2;-><init>(Landroidx/compose/ui/node/LayoutNode;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iput-object v9, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lkotlin/jvm/functions/Function1;

    .line 450
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;

    invoke-direct {v9, v6, v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setOnAttach$ui_release(Lkotlin/jvm/functions/Function1;)V

    .line 454
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$4;

    invoke-direct {v9, v6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$4;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setOnDetach$ui_release(Lkotlin/jvm/functions/Function1;)V

    .line 463
    nop

    .line 464
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$5;

    invoke-direct {v9, v6, v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$5;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V

    check-cast v9, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 463
    invoke-virtual {v8, v9}, Landroidx/compose/ui/node/LayoutNode;->setMeasurePolicy(Landroidx/compose/ui/layout/MeasurePolicy;)V

    .line 531
    nop

    .line 378
    .end local v5    # "coreModifier":Landroidx/compose/ui/Modifier;
    .end local v6    # "$this$layoutNode_u24lambda_u243":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .end local v7    # "$i$a$-run-AndroidViewHolder$layoutNode$1":I
    .end local v8    # "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    iput-object v8, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 90
    return-void
.end method

.method public static final synthetic access$getDispatcher$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    return-object v0
.end method

.method public static final synthetic access$getHasUpdateBlock$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->hasUpdateBlock:Z

    return v0
.end method

.method public static final synthetic access$getInsets$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->insets:Landroidx/core/view/WindowInsetsCompat;

    return-object v0
.end method

.method public static final synthetic access$getOnCommitAffectingUpdate$cp()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 90
    sget-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->OnCommitAffectingUpdate:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final synthetic access$getOwner$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/node/Owner;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->owner:Landroidx/compose/ui/node/Owner;

    return-object v0
.end method

.method public static final synthetic access$getPosition$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->position:[I

    return-object v0
.end method

.method public static final synthetic access$getRunUpdate$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runUpdate:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public static final synthetic access$getSize$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    iget-wide v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->size:J

    return-wide v0
.end method

.method public static final synthetic access$getSnapshotObserver(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/node/OwnerSnapshotObserver;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 90
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$insetBounds(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .param p1, "bounds"    # Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    .line 90
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->insetBounds(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$insetToLayoutPosition(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .param p1, "insets"    # Landroidx/core/view/WindowInsetsCompat;

    .line 90
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->insetToLayoutPosition(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$obtainMeasureSpec(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .param p1, "min"    # I
    .param p2, "max"    # I
    .param p3, "preferred"    # I

    .line 90
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->obtainMeasureSpec(III)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$setDrawing$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Z)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .param p1, "<set-?>"    # Z

    .line 90
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isDrawing:Z

    return-void
.end method

.method public static final synthetic access$setSize$p(Landroidx/compose/ui/viewinterop/AndroidViewHolder;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .param p1, "<set-?>"    # J

    .line 90
    iput-wide p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->size:J

    return-void
.end method

.method private final getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;
    .locals 3

    .line 199
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isAttachedToWindow()Z

    move-result v0

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 739
    .local v1, "$i$f$checkPrecondition":I
    nop

    .line 740
    if-nez v0, :cond_0

    .line 741
    const/4 v2, 0x0

    .line 200
    .local v2, "$i$a$-checkPrecondition-AndroidViewHolder$snapshotObserver$1":I
    nop

    .line 741
    .end local v2    # "$i$a$-checkPrecondition-AndroidViewHolder$snapshotObserver$1":I
    const-string v2, "Expected AndroidViewHolder to be attached when observing reads."

    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 743
    :cond_0
    nop

    .line 202
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$checkPrecondition":I
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->owner:Landroidx/compose/ui/node/Owner;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v0

    return-object v0
.end method

.method private final inset(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;
    .locals 6
    .param p1, "$this$inset"    # Landroidx/core/graphics/Insets;
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .line 699
    iget v0, p1, Landroidx/core/graphics/Insets;->left:I

    sub-int/2addr v0, p2

    .local v0, "$this$fastCoerceAtLeast$iv":I
    const/4 v1, 0x0

    .local v1, "minimumValue$iv":I
    const/4 v2, 0x0

    .line 872
    .local v2, "$i$f$fastCoerceAtLeast":I
    if-gez v0, :cond_0

    move v0, v1

    .line 700
    .end local v0    # "$this$fastCoerceAtLeast$iv":I
    .end local v1    # "minimumValue$iv":I
    .end local v2    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    iget v1, p1, Landroidx/core/graphics/Insets;->top:I

    sub-int/2addr v1, p3

    .local v1, "$this$fastCoerceAtLeast$iv":I
    const/4 v2, 0x0

    .local v2, "minimumValue$iv":I
    const/4 v3, 0x0

    .line 873
    .local v3, "$i$f$fastCoerceAtLeast":I
    if-gez v1, :cond_1

    move v1, v2

    .line 701
    .end local v1    # "$this$fastCoerceAtLeast$iv":I
    .end local v2    # "minimumValue$iv":I
    .end local v3    # "$i$f$fastCoerceAtLeast":I
    :cond_1
    iget v2, p1, Landroidx/core/graphics/Insets;->right:I

    sub-int/2addr v2, p4

    .local v2, "$this$fastCoerceAtLeast$iv":I
    const/4 v3, 0x0

    .local v3, "minimumValue$iv":I
    const/4 v4, 0x0

    .line 874
    .local v4, "$i$f$fastCoerceAtLeast":I
    if-gez v2, :cond_2

    move v2, v3

    .line 702
    .end local v2    # "$this$fastCoerceAtLeast$iv":I
    .end local v3    # "minimumValue$iv":I
    .end local v4    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    iget v3, p1, Landroidx/core/graphics/Insets;->bottom:I

    sub-int/2addr v3, p5

    .local v3, "$this$fastCoerceAtLeast$iv":I
    const/4 v4, 0x0

    .local v4, "minimumValue$iv":I
    const/4 v5, 0x0

    .line 875
    .local v5, "$i$f$fastCoerceAtLeast":I
    if-gez v3, :cond_3

    move v3, v4

    .line 698
    .end local v3    # "$this$fastCoerceAtLeast$iv":I
    .end local v4    # "minimumValue$iv":I
    .end local v5    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    invoke-static {v0, v1, v2, v3}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v0

    return-object v0
.end method

.method private final insetBounds(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 24
    .param p1, "bounds"    # Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    .line 672
    move-object/from16 v0, p0

    .local v0, "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    const/4 v1, 0x0

    .line 814
    .local v1, "$i$f$insetValue":I
    iget-object v2, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    .line 815
    .local v2, "coordinates$iv":Landroidx/compose/ui/node/NodeCoordinator;
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    move-result v3

    if-nez v3, :cond_0

    .line 816
    move-object/from16 v12, p1

    goto/16 :goto_1

    .line 818
    :cond_0
    move-object v3, v2

    check-cast v3, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v3

    .line 819
    .local v3, "topLeft$iv":J
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    .local v5, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v6, 0x0

    .local v6, "minimumValue$iv$iv":I
    const/4 v7, 0x0

    .line 820
    .local v7, "$i$f$fastCoerceAtLeast":I
    if-gez v5, :cond_1

    move v5, v6

    .line 819
    .end local v5    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v6    # "minimumValue$iv$iv":I
    .end local v7    # "$i$f$fastCoerceAtLeast":I
    :cond_1
    nop

    .line 821
    .local v5, "left$iv":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    .local v6, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v7, 0x0

    .local v7, "minimumValue$iv$iv":I
    const/4 v8, 0x0

    .line 820
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-gez v6, :cond_2

    move v6, v7

    .line 821
    .end local v6    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v7    # "minimumValue$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .line 822
    .local v6, "top$iv":I
    move-object v7, v2

    check-cast v7, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v7

    const/4 v9, 0x0

    .line 823
    .local v9, "$i$f$component1-impl":I
    const/4 v10, 0x0

    .line 824
    .local v10, "$i$f$getWidth-impl":I
    move-wide v11, v7

    .local v11, "value$iv$iv$iv$iv":J
    const/4 v13, 0x0

    .line 825
    .local v13, "$i$f$unpackInt1":I
    const/16 v16, 0x20

    shr-long v14, v11, v16

    long-to-int v11, v14

    .line 824
    .end local v11    # "value$iv$iv$iv$iv":J
    .end local v13    # "$i$f$unpackInt1":I
    nop

    .line 823
    .end local v10    # "$i$f$getWidth-impl":I
    nop

    .line 822
    .end local v9    # "$i$f$component1-impl":I
    nop

    .local v11, "rootWidth$iv":I
    const/4 v9, 0x0

    .line 826
    .local v9, "$i$f$component2-impl":I
    const/4 v10, 0x0

    .line 827
    .local v10, "$i$f$getHeight-impl":I
    nop

    .local v7, "value$iv$iv$iv$iv":J
    const/4 v12, 0x0

    .line 828
    .local v12, "$i$f$unpackInt2":I
    const-wide v17, 0xffffffffL

    and-long v13, v7, v17

    long-to-int v7, v13

    .line 827
    .end local v7    # "value$iv$iv$iv$iv":J
    .end local v12    # "$i$f$unpackInt2":I
    nop

    .line 826
    .end local v10    # "$i$f$getHeight-impl":I
    nop

    .line 822
    .end local v9    # "$i$f$component2-impl":I
    nop

    .line 829
    .local v7, "rootHeight$iv":I
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    move-result-wide v8

    const/4 v10, 0x0

    .line 823
    .local v10, "$i$f$component1-impl":I
    const/4 v12, 0x0

    .line 830
    .local v12, "$i$f$getWidth-impl":I
    move-wide v13, v8

    .local v13, "value$iv$iv$iv$iv":J
    const/4 v15, 0x0

    .line 825
    .local v15, "$i$f$unpackInt1":I
    move-object/from16 v19, v0

    move/from16 v20, v1

    .end local v0    # "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .end local v1    # "$i$f$insetValue":I
    .local v19, "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .local v20, "$i$f$insetValue":I
    shr-long v0, v13, v16

    long-to-int v0, v0

    .line 830
    .end local v13    # "value$iv$iv$iv$iv":J
    .end local v15    # "$i$f$unpackInt1":I
    nop

    .line 823
    .end local v12    # "$i$f$getWidth-impl":I
    nop

    .line 829
    .end local v10    # "$i$f$component1-impl":I
    nop

    .local v0, "width$iv":I
    const/4 v1, 0x0

    .line 839
    .local v1, "$i$f$component2-impl":I
    const/4 v10, 0x0

    .line 835
    .local v10, "$i$f$getHeight-impl":I
    nop

    .local v8, "value$iv$iv$iv$iv":J
    const/4 v12, 0x0

    .line 828
    .local v12, "$i$f$unpackInt2":I
    and-long v13, v8, v17

    long-to-int v8, v13

    .line 835
    .end local v8    # "value$iv$iv$iv$iv":J
    .end local v12    # "$i$f$unpackInt2":I
    nop

    .line 839
    .end local v10    # "$i$f$getHeight-impl":I
    nop

    .line 829
    .end local v1    # "$i$f$component2-impl":I
    nop

    .line 840
    .local v8, "height$iv":I
    int-to-float v1, v0

    .local v1, "x$iv$iv":F
    int-to-float v9, v8

    .local v9, "y$iv$iv":F
    const/4 v10, 0x0

    .line 841
    .local v10, "$i$f$Offset":I
    const/4 v12, 0x0

    .line 842
    .local v12, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    .line 843
    .local v13, "v1$iv$iv$iv":J
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move/from16 v21, v0

    move/from16 v22, v1

    .end local v0    # "width$iv":I
    .end local v1    # "x$iv$iv":F
    .local v21, "width$iv":I
    .local v22, "x$iv$iv":F
    int-to-long v0, v15

    .line 844
    .local v0, "v2$iv$iv$iv":J
    shl-long v15, v13, v16

    and-long v17, v0, v17

    or-long v0, v15, v17

    .line 841
    .end local v0    # "v2$iv$iv$iv":J
    .end local v12    # "$i$f$packFloats":I
    .end local v13    # "v1$iv$iv$iv":J
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v0

    .line 840
    .end local v9    # "y$iv$iv":F
    .end local v10    # "$i$f$Offset":I
    .end local v22    # "x$iv$iv":F
    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->localToRoot-MK-Hz9U(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v0

    .line 845
    .local v0, "bottomRight$iv":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v9

    sub-int v9, v11, v9

    .local v9, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v10, 0x0

    .local v10, "minimumValue$iv$iv":I
    const/4 v12, 0x0

    .line 820
    .local v12, "$i$f$fastCoerceAtLeast":I
    if-gez v9, :cond_3

    move v9, v10

    .line 845
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v10    # "minimumValue$iv$iv":I
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    nop

    .line 846
    .local v9, "right$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v10

    sub-int v10, v7, v10

    .local v10, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v12, 0x0

    .local v12, "minimumValue$iv$iv":I
    const/4 v13, 0x0

    .line 820
    .local v13, "$i$f$fastCoerceAtLeast":I
    if-gez v10, :cond_4

    move v10, v12

    .line 846
    .end local v10    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v12    # "minimumValue$iv$iv":I
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    nop

    .line 848
    .local v10, "bottom$iv":I
    if-nez v5, :cond_5

    if-nez v6, :cond_5

    if-nez v9, :cond_5

    if-nez v10, :cond_5

    .line 849
    move-object/from16 v12, p1

    move-wide/from16 v22, v0

    goto :goto_0

    .line 851
    :cond_5
    move v14, v5

    .local v14, "l":I
    move v15, v6

    .local v15, "t":I
    move/from16 v17, v10

    .local v17, "b":I
    move/from16 v16, v9

    .local v16, "r":I
    const/16 v18, 0x0

    .line 673
    .local v18, "$i$a$-insetValue-AndroidViewHolder$insetBounds$1":I
    new-instance v12, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    invoke-virtual/range {p1 .. p1}, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;->getLowerBound()Landroidx/core/graphics/Insets;

    move-result-object v13

    move-wide/from16 v22, v0

    move-object v0, v12

    move-object/from16 v12, p0

    .end local v0    # "bottomRight$iv":J
    .local v22, "bottomRight$iv":J
    invoke-direct/range {v12 .. v17}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->inset(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;->getUpperBound()Landroidx/core/graphics/Insets;

    move-result-object v13

    invoke-direct/range {v12 .. v17}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->inset(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;

    move-result-object v13

    invoke-direct {v0, v1, v13}, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;-><init>(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)V

    move-object v12, v0

    .line 851
    .end local v14    # "l":I
    .end local v15    # "t":I
    .end local v16    # "r":I
    .end local v17    # "b":I
    .end local v18    # "$i$a$-insetValue-AndroidViewHolder$insetBounds$1":I
    :goto_0
    nop

    .line 848
    nop

    .line 674
    .end local v2    # "coordinates$iv":Landroidx/compose/ui/node/NodeCoordinator;
    .end local v3    # "topLeft$iv":J
    .end local v5    # "left$iv":I
    .end local v6    # "top$iv":I
    .end local v7    # "rootHeight$iv":I
    .end local v8    # "height$iv":I
    .end local v9    # "right$iv":I
    .end local v10    # "bottom$iv":I
    .end local v11    # "rootWidth$iv":I
    .end local v19    # "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .end local v20    # "$i$f$insetValue":I
    .end local v21    # "width$iv":I
    .end local v22    # "bottomRight$iv":J
    :goto_1
    return-object v12
.end method

.method private final insetToLayoutPosition(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 26
    .param p1, "insets"    # Landroidx/core/view/WindowInsetsCompat;

    .line 665
    move-object/from16 v0, p1

    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->hasInsets()Z

    move-result v1

    if-nez v1, :cond_0

    .line 666
    return-object v0

    .line 668
    :cond_0
    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    const/4 v2, 0x0

    .line 776
    .local v2, "$i$f$insetValue":I
    iget-object v3, v1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v3

    .line 777
    .local v3, "coordinates$iv":Landroidx/compose/ui/node/NodeCoordinator;
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    move-result v4

    if-nez v4, :cond_1

    .line 778
    move-object/from16 v19, v0

    goto/16 :goto_1

    .line 780
    :cond_1
    move-object v4, v3

    check-cast v4, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v4

    .line 781
    .local v4, "topLeft$iv":J
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v6

    .local v6, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v7, 0x0

    .local v7, "minimumValue$iv$iv":I
    const/4 v8, 0x0

    .line 782
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-gez v6, :cond_2

    move v6, v7

    .line 781
    .end local v6    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v7    # "minimumValue$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .line 783
    .local v6, "left$iv":I
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    .local v7, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v8, 0x0

    .local v8, "minimumValue$iv$iv":I
    const/4 v9, 0x0

    .line 782
    .local v9, "$i$f$fastCoerceAtLeast":I
    if-gez v7, :cond_3

    move v7, v8

    .line 783
    .end local v7    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v8    # "minimumValue$iv$iv":I
    .end local v9    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    nop

    .line 784
    .local v7, "top$iv":I
    move-object v8, v3

    check-cast v8, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v8

    invoke-interface {v8}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v8

    const/4 v10, 0x0

    .line 785
    .local v10, "$i$f$component1-impl":I
    const/4 v11, 0x0

    .line 786
    .local v11, "$i$f$getWidth-impl":I
    move-wide v12, v8

    .local v12, "value$iv$iv$iv$iv":J
    const/4 v14, 0x0

    .line 787
    .local v14, "$i$f$unpackInt1":I
    const/16 v15, 0x20

    move-object/from16 v16, v1

    move/from16 v17, v2

    .end local v1    # "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .end local v2    # "$i$f$insetValue":I
    .local v16, "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .local v17, "$i$f$insetValue":I
    shr-long v1, v12, v15

    long-to-int v1, v1

    .line 786
    .end local v12    # "value$iv$iv$iv$iv":J
    .end local v14    # "$i$f$unpackInt1":I
    nop

    .line 785
    .end local v11    # "$i$f$getWidth-impl":I
    nop

    .line 784
    .end local v10    # "$i$f$component1-impl":I
    nop

    .local v1, "rootWidth$iv":I
    const/4 v2, 0x0

    .line 788
    .local v2, "$i$f$component2-impl":I
    const/4 v10, 0x0

    .line 789
    .local v10, "$i$f$getHeight-impl":I
    nop

    .local v8, "value$iv$iv$iv$iv":J
    const/4 v11, 0x0

    .line 790
    .local v11, "$i$f$unpackInt2":I
    const-wide v18, 0xffffffffL

    and-long v12, v8, v18

    long-to-int v8, v12

    .line 789
    .end local v8    # "value$iv$iv$iv$iv":J
    .end local v11    # "$i$f$unpackInt2":I
    nop

    .line 788
    .end local v10    # "$i$f$getHeight-impl":I
    nop

    .line 784
    .end local v2    # "$i$f$component2-impl":I
    nop

    .line 791
    .local v8, "rootHeight$iv":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    move-result-wide v9

    const/4 v2, 0x0

    .line 785
    .local v2, "$i$f$component1-impl":I
    const/4 v11, 0x0

    .line 792
    .local v11, "$i$f$getWidth-impl":I
    move-wide v12, v9

    .restart local v12    # "value$iv$iv$iv$iv":J
    const/4 v14, 0x0

    .line 787
    .restart local v14    # "$i$f$unpackInt1":I
    move/from16 v20, v1

    move/from16 v21, v2

    .end local v1    # "rootWidth$iv":I
    .end local v2    # "$i$f$component1-impl":I
    .local v20, "rootWidth$iv":I
    .local v21, "$i$f$component1-impl":I
    shr-long v1, v12, v15

    long-to-int v1, v1

    .line 792
    .end local v12    # "value$iv$iv$iv$iv":J
    .end local v14    # "$i$f$unpackInt1":I
    nop

    .line 785
    .end local v11    # "$i$f$getWidth-impl":I
    nop

    .line 791
    .end local v21    # "$i$f$component1-impl":I
    nop

    .local v1, "width$iv":I
    const/4 v2, 0x0

    .line 801
    .local v2, "$i$f$component2-impl":I
    const/4 v11, 0x0

    .line 797
    .local v11, "$i$f$getHeight-impl":I
    nop

    .local v9, "value$iv$iv$iv$iv":J
    const/4 v12, 0x0

    .line 790
    .local v12, "$i$f$unpackInt2":I
    and-long v13, v9, v18

    long-to-int v9, v13

    .line 797
    .end local v9    # "value$iv$iv$iv$iv":J
    .end local v12    # "$i$f$unpackInt2":I
    nop

    .line 801
    .end local v11    # "$i$f$getHeight-impl":I
    nop

    .line 791
    .end local v2    # "$i$f$component2-impl":I
    nop

    .line 802
    .local v9, "height$iv":I
    int-to-float v2, v1

    .local v2, "x$iv$iv":F
    int-to-float v10, v9

    .local v10, "y$iv$iv":F
    const/4 v11, 0x0

    .line 803
    .local v11, "$i$f$Offset":I
    const/4 v12, 0x0

    .line 804
    .local v12, "$i$f$packFloats":I
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    .line 805
    .local v13, "v1$iv$iv$iv":J
    move/from16 v21, v15

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move/from16 v22, v1

    move/from16 v23, v2

    .end local v1    # "width$iv":I
    .end local v2    # "x$iv$iv":F
    .local v22, "width$iv":I
    .local v23, "x$iv$iv":F
    int-to-long v1, v15

    .line 806
    .local v1, "v2$iv$iv$iv":J
    shl-long v24, v13, v21

    and-long v18, v1, v18

    or-long v1, v24, v18

    .line 803
    .end local v1    # "v2$iv$iv$iv":J
    .end local v12    # "$i$f$packFloats":I
    .end local v13    # "v1$iv$iv$iv":J
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v1

    .line 802
    .end local v10    # "y$iv$iv":F
    .end local v11    # "$i$f$Offset":I
    .end local v23    # "x$iv$iv":F
    invoke-virtual {v3, v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->localToRoot-MK-Hz9U(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v1

    .line 807
    .local v1, "bottomRight$iv":J
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    sub-int v10, v20, v10

    .local v10, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v11, 0x0

    .local v11, "minimumValue$iv$iv":I
    const/4 v12, 0x0

    .line 782
    .local v12, "$i$f$fastCoerceAtLeast":I
    if-gez v10, :cond_4

    move v10, v11

    .line 807
    .end local v10    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v11    # "minimumValue$iv$iv":I
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    nop

    .line 808
    .local v10, "right$iv":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v11

    sub-int v11, v8, v11

    .local v11, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v12, 0x0

    .local v12, "minimumValue$iv$iv":I
    const/4 v13, 0x0

    .line 782
    .local v13, "$i$f$fastCoerceAtLeast":I
    if-gez v11, :cond_5

    move v11, v12

    .line 808
    .end local v11    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v12    # "minimumValue$iv$iv":I
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_5
    nop

    .line 810
    .local v11, "bottom$iv":I
    if-nez v6, :cond_6

    if-nez v7, :cond_6

    if-nez v10, :cond_6

    if-nez v11, :cond_6

    .line 811
    move-object/from16 v19, v0

    goto :goto_0

    .line 813
    :cond_6
    move v12, v6

    .local v12, "l":I
    move v13, v7

    .local v13, "t":I
    move v14, v11

    .local v14, "b":I
    move v15, v10

    .local v15, "r":I
    const/16 v18, 0x0

    .line 668
    .local v18, "$i$a$-insetValue-AndroidViewHolder$insetToLayoutPosition$1":I
    invoke-virtual {v0, v12, v13, v15, v14}, Landroidx/core/view/WindowInsetsCompat;->inset(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v19

    .line 813
    .end local v12    # "l":I
    .end local v13    # "t":I
    .end local v14    # "b":I
    .end local v15    # "r":I
    .end local v18    # "$i$a$-insetValue-AndroidViewHolder$insetToLayoutPosition$1":I
    :goto_0
    nop

    .line 810
    nop

    .line 668
    .end local v1    # "bottomRight$iv":J
    .end local v3    # "coordinates$iv":Landroidx/compose/ui/node/NodeCoordinator;
    .end local v4    # "topLeft$iv":J
    .end local v6    # "left$iv":I
    .end local v7    # "top$iv":I
    .end local v8    # "rootHeight$iv":I
    .end local v9    # "height$iv":I
    .end local v10    # "right$iv":I
    .end local v11    # "bottom$iv":I
    .end local v16    # "this_$iv":Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .end local v17    # "$i$f$insetValue":I
    .end local v20    # "rootWidth$iv":I
    .end local v22    # "width$iv":I
    :goto_1
    return-object v19
.end method

.method private final insetValue(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;
    .locals 22
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "block"    # Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 677
    .local v0, "$i$f$insetValue":I
    move-object/from16 v1, p0

    iget-object v2, v1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    .line 678
    .local v2, "coordinates":Landroidx/compose/ui/node/NodeCoordinator;
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->isAttached()Z

    move-result v3

    if-nez v3, :cond_0

    .line 679
    return-object p1

    .line 681
    :cond_0
    move-object v3, v2

    check-cast v3, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v3

    .line 682
    .local v3, "topLeft":J
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    .local v5, "$this$fastCoerceAtLeast$iv":I
    const/4 v6, 0x0

    .local v6, "minimumValue$iv":I
    const/4 v7, 0x0

    .line 852
    .local v7, "$i$f$fastCoerceAtLeast":I
    if-gez v5, :cond_1

    move v5, v6

    .line 682
    .end local v5    # "$this$fastCoerceAtLeast$iv":I
    .end local v6    # "minimumValue$iv":I
    .end local v7    # "$i$f$fastCoerceAtLeast":I
    :cond_1
    nop

    .line 683
    .local v5, "left":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v6

    .local v6, "$this$fastCoerceAtLeast$iv":I
    const/4 v7, 0x0

    .local v7, "minimumValue$iv":I
    const/4 v8, 0x0

    .line 853
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-gez v6, :cond_2

    move v6, v7

    .line 683
    .end local v6    # "$this$fastCoerceAtLeast$iv":I
    .end local v7    # "minimumValue$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .line 684
    .local v6, "top":I
    move-object v7, v2

    check-cast v7, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v7

    const/4 v9, 0x0

    .line 854
    .local v9, "$i$f$component1-impl":I
    const/4 v10, 0x0

    .line 855
    .local v10, "$i$f$getWidth-impl":I
    move-wide v11, v7

    .local v11, "value$iv$iv$iv":J
    const/4 v13, 0x0

    .line 856
    .local v13, "$i$f$unpackInt1":I
    const/16 v16, 0x20

    shr-long v14, v11, v16

    long-to-int v11, v14

    .line 855
    .end local v11    # "value$iv$iv$iv":J
    .end local v13    # "$i$f$unpackInt1":I
    nop

    .line 854
    .end local v10    # "$i$f$getWidth-impl":I
    nop

    .line 684
    .end local v9    # "$i$f$component1-impl":I
    nop

    .local v11, "rootWidth":I
    const/4 v9, 0x0

    .line 857
    .local v9, "$i$f$component2-impl":I
    const/4 v10, 0x0

    .line 858
    .local v10, "$i$f$getHeight-impl":I
    nop

    .local v7, "value$iv$iv$iv":J
    const/4 v12, 0x0

    .line 859
    .local v12, "$i$f$unpackInt2":I
    const-wide v17, 0xffffffffL

    and-long v13, v7, v17

    long-to-int v7, v13

    .line 858
    .end local v7    # "value$iv$iv$iv":J
    .end local v12    # "$i$f$unpackInt2":I
    nop

    .line 857
    .end local v10    # "$i$f$getHeight-impl":I
    nop

    .line 684
    .end local v9    # "$i$f$component2-impl":I
    nop

    .line 685
    .local v7, "rootHeight":I
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->getSize-YbymL2g()J

    move-result-wide v8

    const/4 v10, 0x0

    .line 860
    .local v10, "$i$f$component1-impl":I
    const/4 v12, 0x0

    .line 861
    .local v12, "$i$f$getWidth-impl":I
    move-wide v13, v8

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 862
    .local v15, "$i$f$unpackInt1":I
    move/from16 v19, v0

    .end local v0    # "$i$f$insetValue":I
    .local v19, "$i$f$insetValue":I
    shr-long v0, v13, v16

    long-to-int v0, v0

    .line 861
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$unpackInt1":I
    nop

    .line 860
    .end local v12    # "$i$f$getWidth-impl":I
    nop

    .line 685
    .end local v10    # "$i$f$component1-impl":I
    nop

    .local v0, "width":I
    const/4 v1, 0x0

    .line 863
    .local v1, "$i$f$component2-impl":I
    const/4 v10, 0x0

    .line 864
    .local v10, "$i$f$getHeight-impl":I
    nop

    .local v8, "value$iv$iv$iv":J
    const/4 v12, 0x0

    .line 865
    .local v12, "$i$f$unpackInt2":I
    and-long v13, v8, v17

    long-to-int v8, v13

    .line 864
    .end local v8    # "value$iv$iv$iv":J
    .end local v12    # "$i$f$unpackInt2":I
    nop

    .line 863
    .end local v10    # "$i$f$getHeight-impl":I
    nop

    .line 685
    .end local v1    # "$i$f$component2-impl":I
    nop

    .line 686
    .local v8, "height":I
    int-to-float v1, v0

    .local v1, "x$iv":F
    int-to-float v9, v8

    .local v9, "y$iv":F
    const/4 v10, 0x0

    .line 866
    .local v10, "$i$f$Offset":I
    const/4 v12, 0x0

    .line 867
    .local v12, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    .line 868
    .local v13, "v1$iv$iv":J
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move/from16 v20, v0

    move/from16 v21, v1

    .end local v0    # "width":I
    .end local v1    # "x$iv":F
    .local v20, "width":I
    .local v21, "x$iv":F
    int-to-long v0, v15

    .line 869
    .local v0, "v2$iv$iv":J
    shl-long v15, v13, v16

    and-long v17, v0, v17

    or-long v0, v15, v17

    .line 866
    .end local v0    # "v2$iv$iv":J
    .end local v12    # "$i$f$packFloats":I
    .end local v13    # "v1$iv$iv":J
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v0

    .line 686
    .end local v9    # "y$iv":F
    .end local v10    # "$i$f$Offset":I
    .end local v21    # "x$iv":F
    invoke-virtual {v2, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->localToRoot-MK-Hz9U(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v0

    .line 687
    .local v0, "bottomRight":J
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v9

    sub-int v9, v11, v9

    .local v9, "$this$fastCoerceAtLeast$iv":I
    const/4 v10, 0x0

    .local v10, "minimumValue$iv":I
    const/4 v12, 0x0

    .line 870
    .local v12, "$i$f$fastCoerceAtLeast":I
    if-gez v9, :cond_3

    move v9, v10

    .line 687
    .end local v9    # "$this$fastCoerceAtLeast$iv":I
    .end local v10    # "minimumValue$iv":I
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    nop

    .line 688
    .local v9, "right":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v10

    sub-int v10, v7, v10

    .local v10, "$this$fastCoerceAtLeast$iv":I
    const/4 v12, 0x0

    .local v12, "minimumValue$iv":I
    const/4 v13, 0x0

    .line 871
    .local v13, "$i$f$fastCoerceAtLeast":I
    if-gez v10, :cond_4

    move v10, v12

    .line 688
    .end local v10    # "$this$fastCoerceAtLeast$iv":I
    .end local v12    # "minimumValue$iv":I
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    nop

    .line 690
    .local v10, "bottom":I
    if-nez v5, :cond_5

    if-nez v6, :cond_5

    if-nez v9, :cond_5

    if-nez v10, :cond_5

    .line 691
    move-wide/from16 v16, v0

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    goto :goto_0

    .line 693
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-wide/from16 v16, v0

    move-object/from16 v0, p2

    .end local v0    # "bottomRight":J
    .local v16, "bottomRight":J
    invoke-interface {v0, v12, v13, v14, v15}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 690
    :goto_0
    return-object v1
.end method

.method static final invalidateOrDefer$lambda$2(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p0, "$tmp0"    # Lkotlin/jvm/functions/Function0;

    .line 340
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final obtainMeasureSpec(III)I
    .locals 3
    .param p1, "min"    # I
    .param p2, "max"    # I
    .param p3, "preferred"    # I

    .line 539
    nop

    .line 540
    const/high16 v0, 0x40000000    # 2.0f

    if-gez p3, :cond_3

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 544
    :cond_0
    const/4 v1, -0x2

    const v2, 0x7fffffff

    if-ne p3, v1, :cond_1

    if-eq p2, v2, :cond_1

    .line 548
    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_1

    .line 550
    :cond_1
    const/4 v1, -0x1

    if-ne p3, v1, :cond_2

    if-eq p2, v2, :cond_2

    .line 552
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_1

    .line 556
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_1

    .line 542
    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 558
    :goto_1
    return v0
.end method


# virtual methods
.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9
    .param p1, "region"    # Landroid/graphics/Region;

    .line 362
    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 363
    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    invoke-virtual {p0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->getLocationInWindow([I)V

    .line 364
    nop

    .line 365
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    const/4 v2, 0x0

    aget v4, v1, v2

    .line 366
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    aget v5, v1, v0

    .line 367
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    aget v1, v1, v2

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->getWidth()I

    move-result v2

    add-int v6, v1, v2

    .line 368
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->location:[I

    aget v1, v1, v0

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->getHeight()I

    move-result v2

    add-int v7, v1, v2

    .line 369
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 364
    move-object v3, p1

    .end local p1    # "region":Landroid/graphics/Region;
    .local v3, "region":Landroid/graphics/Region;
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 371
    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 233
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getDensity()Landroidx/compose/ui/unit/Density;
    .locals 1

    .line 161
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    .line 131
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    return-object v0
.end method

.method public final getLayoutNode()Landroidx/compose/ui/node/LayoutNode;
    .locals 1

    .line 378
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 300
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    .line 301
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 300
    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;
    .locals 1

    .line 172
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    return-object v0
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 150
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 571
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->nestedScrollingParentHelper:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingParentHelper;->getNestedScrollAxes()I

    move-result v0

    return v0
.end method

.method public final getOnDensityChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 217
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getRelease()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 146
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->release:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getReset()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->reset:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Landroidx/savedstate/SavedStateRegistryOwner;
    .locals 1

    .line 181
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Landroidx/savedstate/SavedStateRegistryOwner;

    return-object v0
.end method

.method public final getUpdate()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 134
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->update:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 95
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    return-object v0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1
    .param p1, "location"    # [I
    .param p2, "dirty"    # Landroid/graphics/Rect;

    .line 325
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 326
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->invalidateOrDefer()V

    .line 327
    const/4 v0, 0x0

    return-object v0
.end method

.method public final invalidateOrDefer()V
    .locals 3

    .line 337
    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isDrawing:Z

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runInvalidate:Lkotlin/jvm/functions/Function0;

    new-instance v2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 344
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->invalidateLayer$ui_release()V

    .line 346
    :goto_0
    return-void
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 655
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public isValidOwnerScope()Z
    .locals 1

    .line 230
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isAttachedToWindow()Z

    move-result v0

    return v0
.end method

.method public onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "insets"    # Landroidx/core/view/WindowInsetsCompat;

    .line 660
    new-instance v0, Landroidx/core/view/WindowInsetsCompat;

    invoke-direct {v0, p2}, Landroidx/core/view/WindowInsetsCompat;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->insets:Landroidx/core/view/WindowInsetsCompat;

    .line 661
    invoke-direct {p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->insetToLayoutPosition(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 310
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 311
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runUpdate:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 312
    return-void
.end method

.method public onDeactivate()V
    .locals 2

    .line 248
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->reset:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 249
    nop

    .line 250
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isRemoveFocusedViewFixEnabled:Z

    if-eqz v0, :cond_0

    .line 251
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-le v0, v1, :cond_0

    .line 258
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 260
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->removeAllViewsInLayout()V

    .line 261
    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .param p1, "child"    # Landroid/view/View;
    .param p2, "target"    # Landroid/view/View;

    .line 332
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 333
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->invalidateOrDefer()V

    .line 334
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 315
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 317
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->clear$ui_release(Ljava/lang/Object;)V

    .line 318
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .line 296
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 297
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .line 268
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 269
    nop

    .line 270
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 271
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 269
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    .line 273
    return-void

    .line 275
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 276
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    .line 277
    return-void

    .line 280
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 281
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    .line 282
    iput p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastWidthMeasureSpec:I

    .line 283
    iput p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastHeightMeasureSpec:I

    .line 284
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 14
    .param p1, "target"    # Landroid/view/View;
    .param p2, "velocityX"    # F
    .param p3, "velocityY"    # F
    .param p4, "consumed"    # Z

    .line 635
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 636
    :cond_0
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeVelocity(F)F

    move-result v0

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeVelocity(F)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    move-result-wide v6

    .line 637
    .local v6, "viewVelocity":J
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    invoke-virtual {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance v3, Landroidx/compose/ui/viewinterop/AndroidViewHolder$onNestedFling$1;

    const/4 v8, 0x0

    move-object v5, p0

    move/from16 v4, p4

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$onNestedFling$1;-><init>(ZLandroidx/compose/ui/viewinterop/AndroidViewHolder;JLkotlin/coroutines/Continuation;)V

    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function2;

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 644
    return v1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 10
    .param p1, "target"    # Landroid/view/View;
    .param p2, "velocityX"    # F
    .param p3, "velocityY"    # F

    .line 648
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 649
    :cond_0
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeVelocity(F)F

    move-result v0

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeVelocity(F)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    move-result-wide v2

    .line 650
    .local v2, "toBeConsumed":J
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    invoke-virtual {v0}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$onNestedPreFling$1;

    const/4 v5, 0x0

    invoke-direct {v0, p0, v2, v3, v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$onNestedPreFling$1;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;JLkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 651
    return v1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 17
    .param p1, "target"    # Landroid/view/View;
    .param p2, "dx"    # I
    .param p3, "dy"    # I
    .param p4, "consumed"    # [I
    .param p5, "type"    # I

    .line 619
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 621
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    .line 622
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v2

    .local v2, "x$iv":F
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v3

    .local v3, "y$iv":F
    const/4 v4, 0x0

    .line 766
    .local v4, "$i$f$Offset":I
    const/4 v5, 0x0

    .line 767
    .local v5, "$i$f$packFloats":I
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    .line 768
    .local v6, "v1$iv$iv":J
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 769
    .local v8, "v2$iv$iv":J
    const/16 v10, 0x20

    shl-long v11, v6, v10

    const-wide v13, 0xffffffffL

    and-long v15, v8, v13

    or-long v5, v11, v15

    .line 766
    .end local v5    # "$i$f$packFloats":I
    .end local v6    # "v1$iv$iv":J
    .end local v8    # "v2$iv$iv":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v2

    .line 623
    .end local v2    # "x$iv":F
    .end local v3    # "y$iv":F
    .end local v4    # "$i$f$Offset":I
    invoke-static/range {p5 .. p5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toNestedScrollSource(I)I

    move-result v4

    .line 621
    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPreScroll-OzD1aCk(JI)J

    move-result-wide v1

    .line 620
    nop

    .line 625
    .local v1, "consumedByParent":J
    const/4 v3, 0x0

    .line 770
    .local v3, "$i$f$getX-impl":I
    move-wide v4, v1

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 771
    .local v6, "$i$f$unpackFloat1":I
    shr-long v7, v4, v10

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 772
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 771
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 770
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat1":I
    nop

    .line 625
    .end local v3    # "$i$f$getX-impl":I
    invoke-static {v7}, Landroidx/compose/ui/platform/NestedScrollInteropConnectionKt;->composeToViewOffset(F)I

    move-result v3

    const/4 v4, 0x0

    aput v3, p4, v4

    .line 626
    const/4 v3, 0x0

    .line 773
    .local v3, "$i$f$getY-impl":I
    move-wide v4, v1

    .restart local v4    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 774
    .local v6, "$i$f$unpackFloat2":I
    and-long v7, v4, v13

    long-to-int v7, v7

    .restart local v7    # "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 775
    .restart local v8    # "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 774
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 773
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat2":I
    nop

    .line 626
    .end local v3    # "$i$f$getY-impl":I
    invoke-static {v7}, Landroidx/compose/ui/platform/NestedScrollInteropConnectionKt;->composeToViewOffset(F)I

    move-result v3

    const/4 v4, 0x1

    aput v3, p4, v4

    .line 627
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 17
    .param p1, "target"    # Landroid/view/View;
    .param p2, "dxConsumed"    # I
    .param p3, "dyConsumed"    # I
    .param p4, "dxUnconsumed"    # I
    .param p5, "dyUnconsumed"    # I
    .param p6, "type"    # I

    .line 610
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 611
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    .line 612
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v2

    .local v2, "x$iv":F
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v3

    .local v3, "y$iv":F
    const/4 v4, 0x0

    .line 758
    .local v4, "$i$f$Offset":I
    const/4 v5, 0x0

    .line 759
    .local v5, "$i$f$packFloats":I
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    .line 760
    .local v6, "v1$iv$iv":J
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 761
    .local v8, "v2$iv$iv":J
    const/16 v10, 0x20

    shl-long v11, v6, v10

    const-wide v13, 0xffffffffL

    and-long v15, v8, v13

    or-long v5, v11, v15

    .line 758
    .end local v5    # "$i$f$packFloats":I
    .end local v6    # "v1$iv$iv":J
    .end local v8    # "v2$iv$iv":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v2

    .line 613
    .end local v2    # "x$iv":F
    .end local v3    # "y$iv":F
    .end local v4    # "$i$f$Offset":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v4

    .local v4, "x$iv":F
    invoke-static/range {p5 .. p5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v5

    .local v5, "y$iv":F
    const/4 v6, 0x0

    .line 762
    .local v6, "$i$f$Offset":I
    const/4 v7, 0x0

    .line 763
    .local v7, "$i$f$packFloats":I
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 764
    .local v8, "v1$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    .line 765
    .local v11, "v2$iv$iv":J
    shl-long v15, v8, v10

    and-long/2addr v13, v11

    or-long v7, v15, v13

    .line 762
    .end local v7    # "$i$f$packFloats":I
    .end local v8    # "v1$iv$iv":J
    .end local v11    # "v2$iv$iv":J
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v4

    .line 614
    .end local v4    # "x$iv":F
    .end local v5    # "y$iv":F
    .end local v6    # "$i$f$Offset":I
    invoke-static/range {p6 .. p6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toNestedScrollSource(I)I

    move-result v6

    .line 611
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPostScroll-DzOQY0M(JJI)J

    .line 616
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 19
    .param p1, "target"    # Landroid/view/View;
    .param p2, "dxConsumed"    # I
    .param p3, "dyConsumed"    # I
    .param p4, "dxUnconsumed"    # I
    .param p5, "dyUnconsumed"    # I
    .param p6, "type"    # I
    .param p7, "consumed"    # [I

    .line 591
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 593
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->dispatcher:Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;

    .line 594
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v2

    .local v2, "x$iv":F
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v3

    .local v3, "y$iv":F
    const/4 v4, 0x0

    .line 744
    .local v4, "$i$f$Offset":I
    const/4 v5, 0x0

    .line 745
    .local v5, "$i$f$packFloats":I
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    .line 746
    .local v6, "v1$iv$iv":J
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 747
    .local v8, "v2$iv$iv":J
    const/16 v10, 0x20

    shl-long v11, v6, v10

    const-wide v13, 0xffffffffL

    and-long v15, v8, v13

    or-long v5, v11, v15

    .line 744
    .end local v5    # "$i$f$packFloats":I
    .end local v6    # "v1$iv$iv":J
    .end local v8    # "v2$iv$iv":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v2

    .line 595
    .end local v2    # "x$iv":F
    .end local v3    # "y$iv":F
    .end local v4    # "$i$f$Offset":I
    invoke-static/range {p4 .. p4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v4

    .local v4, "x$iv":F
    invoke-static/range {p5 .. p5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toComposeOffset(I)F

    move-result v5

    .local v5, "y$iv":F
    const/4 v6, 0x0

    .line 748
    .local v6, "$i$f$Offset":I
    const/4 v7, 0x0

    .line 749
    .local v7, "$i$f$packFloats":I
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 750
    .local v8, "v1$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    .line 751
    .local v11, "v2$iv$iv":J
    shl-long v15, v8, v10

    and-long v17, v11, v13

    or-long v7, v15, v17

    .line 748
    .end local v7    # "$i$f$packFloats":I
    .end local v8    # "v1$iv$iv":J
    .end local v11    # "v2$iv$iv":J
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v4

    .line 596
    .end local v4    # "x$iv":F
    .end local v5    # "y$iv":F
    .end local v6    # "$i$f$Offset":I
    invoke-static/range {p6 .. p6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt;->access$toNestedScrollSource(I)I

    move-result v6

    .line 593
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;->dispatchPostScroll-DzOQY0M(JJI)J

    move-result-wide v1

    .line 592
    nop

    .line 598
    .local v1, "consumedByParent":J
    const/4 v3, 0x0

    .line 752
    .local v3, "$i$f$getX-impl":I
    move-wide v4, v1

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 753
    .local v6, "$i$f$unpackFloat1":I
    shr-long v7, v4, v10

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 754
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 753
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 752
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat1":I
    nop

    .line 598
    .end local v3    # "$i$f$getX-impl":I
    invoke-static {v7}, Landroidx/compose/ui/platform/NestedScrollInteropConnectionKt;->composeToViewOffset(F)I

    move-result v3

    const/4 v4, 0x0

    aput v3, p7, v4

    .line 599
    const/4 v3, 0x0

    .line 755
    .local v3, "$i$f$getY-impl":I
    move-wide v4, v1

    .restart local v4    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 756
    .local v6, "$i$f$unpackFloat2":I
    and-long v7, v4, v13

    long-to-int v7, v7

    .restart local v7    # "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 757
    .restart local v8    # "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 756
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 755
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat2":I
    nop

    .line 599
    .end local v3    # "$i$f$getY-impl":I
    invoke-static {v7}, Landroidx/compose/ui/platform/NestedScrollInteropConnectionKt;->composeToViewOffset(F)I

    move-result v3

    const/4 v4, 0x1

    aput v3, p7, v4

    .line 600
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 1
    .param p1, "child"    # Landroid/view/View;
    .param p2, "target"    # Landroid/view/View;
    .param p3, "axes"    # I
    .param p4, "type"    # I

    .line 575
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->nestedScrollingParentHelper:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/NestedScrollingParentHelper;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    .line 576
    return-void
.end method

.method public onRelease()V
    .locals 1

    .line 264
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->release:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 265
    return-void
.end method

.method public onReuse()V
    .locals 1

    .line 240
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 241
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->view:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 243
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->reset:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 245
    :goto_0
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 1
    .param p1, "child"    # Landroid/view/View;
    .param p2, "target"    # Landroid/view/View;
    .param p3, "axes"    # I
    .param p4, "type"    # I

    .line 566
    and-int/lit8 v0, p3, 0x2

    if-nez v0, :cond_1

    .line 567
    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 566
    :goto_1
    return v0
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 1
    .param p1, "target"    # Landroid/view/View;
    .param p2, "type"    # I

    .line 579
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->nestedScrollingParentHelper:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingParentHelper;->onStopNestedScroll(Landroid/view/View;I)V

    .line 580
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0
    .param p1, "visibility"    # I

    .line 349
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    .line 352
    nop

    .line 355
    return-void
.end method

.method public final remeasure()V
    .locals 2

    .line 287
    iget v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastWidthMeasureSpec:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    iget v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastHeightMeasureSpec:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 292
    :cond_0
    iget v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastWidthMeasureSpec:I

    iget v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lastHeightMeasureSpec:I

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->measure(II)V

    .line 293
    return-void

    .line 290
    :cond_1
    :goto_0
    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2
    .param p1, "disallowIntercept"    # Z

    .line 305
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 307
    return-void
.end method

.method public final setDensity(Landroidx/compose/ui/unit/Density;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/ui/unit/Density;

    .line 163
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Landroidx/compose/ui/unit/Density;

    if-eq p1, v0, :cond_0

    .line 164
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Landroidx/compose/ui/unit/Density;

    .line 165
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .param p1, "value"    # Landroidx/lifecycle/LifecycleOwner;

    .line 174
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    if-eq p1, v0, :cond_0

    .line 175
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 176
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Landroidx/lifecycle/ViewTreeLifecycleOwner;->set(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V

    .line 178
    :cond_0
    return-void
.end method

.method public final setModifier(Landroidx/compose/ui/Modifier;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/ui/Modifier;

    .line 152
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Landroidx/compose/ui/Modifier;

    if-eq p1, v0, :cond_0

    .line 153
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Landroidx/compose/ui/Modifier;

    .line 154
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 169
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 158
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 217
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method protected final setRelease(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 147
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->release:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method protected final setReset(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 144
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->reset:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setSavedStateRegistryOwner(Landroidx/savedstate/SavedStateRegistryOwner;)V
    .locals 1
    .param p1, "value"    # Landroidx/savedstate/SavedStateRegistryOwner;

    .line 183
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Landroidx/savedstate/SavedStateRegistryOwner;

    if-eq p1, v0, :cond_0

    .line 184
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Landroidx/savedstate/SavedStateRegistryOwner;

    .line 185
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Landroidx/savedstate/ViewTreeSavedStateRegistryOwner;->set(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V

    .line 187
    :cond_0
    return-void
.end method

.method protected final setUpdate(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "value"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 136
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->update:Lkotlin/jvm/functions/Function0;

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->hasUpdateBlock:Z

    .line 138
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->runUpdate:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 139
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .line 562
    const/4 v0, 0x1

    return v0
.end method
