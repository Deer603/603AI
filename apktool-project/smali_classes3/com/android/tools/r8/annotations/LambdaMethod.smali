.class public interface abstract synthetic annotation Lcom/android/tools/r8/annotations/LambdaMethod;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = 0x1a
    kind = 0x5
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
.end annotation


# virtual methods
.method public abstract holder()Ljava/lang/String;
.end method

.method public abstract method()Ljava/lang/String;
.end method

.method public abstract proto()Ljava/lang/String;
.end method
