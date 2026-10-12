.class public final synthetic Lcom/android/tools/r8/DesugarMethodHandlesLookup;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic findVarHandle(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lcom/android/tools/r8/DesugarVarHandle;
    .locals 0

    new-instance p0, Lcom/android/tools/r8/DesugarVarHandle;

    invoke-direct {p0, p1, p2, p3}, Lcom/android/tools/r8/DesugarVarHandle;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)V

    return-object p0
.end method

.method public synthetic toPrivateLookupIn(Ljava/lang/Class;)Lcom/android/tools/r8/DesugarMethodHandlesLookup;
    .locals 0

    return-object p0
.end method
