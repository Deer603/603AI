package androidx.webkit;

import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ServiceWorkerControllerCompat {

    private static class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat INSTANCE = null;

        private LAZY_HOLDER() {
        }

        static {
            INSTANCE = new ServiceWorkerControllerImpl();
        }
    }

    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(ServiceWorkerClientCompat r1);

    public ServiceWorkerControllerCompat() {
    }

    public static ServiceWorkerControllerCompat getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }
}
