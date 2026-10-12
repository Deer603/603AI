package androidx.webkit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
public interface WebNavigationClient {

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalNavigationCallback {
    }

    void onFirstContentfulPaint(Page r1);

    void onNavigationCompleted(Navigation r1);

    void onNavigationRedirected(Navigation r1);

    void onNavigationStarted(Navigation r1);

    void onPageDeleted(Page r1);

    void onPageDomContentLoadedEventFired(Page r1);

    void onPageLoadEventFired(Page r1);
}
