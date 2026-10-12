package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    static PackageManager.ComponentInfoFlags of(long value) {
        return PackageManager.ComponentInfoFlags.of(value);
    }

    static ServiceInfo getServiceInfo(PackageManager packageManager, ComponentName component, PackageManager.ComponentInfoFlags flags) throws PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(component, flags);
    }
}
