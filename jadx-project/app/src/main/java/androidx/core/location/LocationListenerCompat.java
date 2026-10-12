package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface LocationListenerCompat extends LocationListener {
    @Override // android.location.LocationListener
    default void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(String provider) {
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(String provider) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(List<Location> locations) {
        int size = locations.size();
        int i = 0;
    L3:
        if (i >= size) goto L5;
        onLocationChanged(locations.get(i));
        i = i + 1;
        goto L3
    }

    @Override // android.location.LocationListener
    default void onFlushComplete(int requestCode) {
    }
}
