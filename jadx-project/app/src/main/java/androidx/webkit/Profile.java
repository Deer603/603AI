package androidx.webkit;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public interface Profile {
    public static final String DEFAULT_PROFILE_NAME = "Default";

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrefetch {
    }

    void clearPrefetchAsync(String r1, Executor r2, OutcomeReceiverCompat<Void, PrefetchException> r3);

    CookieManager getCookieManager();

    GeolocationPermissions getGeolocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrlAsync(String r1, CancellationSignal r2, Executor r3, OutcomeReceiverCompat<Void, PrefetchException> r4);

    void prefetchUrlAsync(String r1, CancellationSignal r2, Executor r3, SpeculativeLoadingParameters r4, OutcomeReceiverCompat<Void, PrefetchException> r5);

    void setSpeculativeLoadingConfig(SpeculativeLoadingConfig r1);
}
