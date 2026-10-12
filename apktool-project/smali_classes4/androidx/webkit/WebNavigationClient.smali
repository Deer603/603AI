.class public interface abstract Landroidx/webkit/WebNavigationClient;
.super Ljava/lang/Object;
.source "WebNavigationClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/webkit/WebNavigationClient$ExperimentalNavigationCallback;
    }
.end annotation


# virtual methods
.method public abstract onFirstContentfulPaint(Landroidx/webkit/Page;)V
.end method

.method public abstract onNavigationCompleted(Landroidx/webkit/Navigation;)V
.end method

.method public abstract onNavigationRedirected(Landroidx/webkit/Navigation;)V
.end method

.method public abstract onNavigationStarted(Landroidx/webkit/Navigation;)V
.end method

.method public abstract onPageDeleted(Landroidx/webkit/Page;)V
.end method

.method public abstract onPageDomContentLoadedEventFired(Landroidx/webkit/Page;)V
.end method

.method public abstract onPageLoadEventFired(Landroidx/webkit/Page;)V
.end method
