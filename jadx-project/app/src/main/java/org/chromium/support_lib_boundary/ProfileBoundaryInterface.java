package org.chromium.support_lib_boundary;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface ProfileBoundaryInterface {
    void clearPrefetch(String r1, Executor r2, InvocationHandler r3);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrl(String r1, CancellationSignal r2, Executor r3, InvocationHandler r4);

    void prefetchUrl(String r1, CancellationSignal r2, Executor r3, InvocationHandler r4, InvocationHandler r5);

    void setSpeculativeLoadingConfig(InvocationHandler r1);
}
