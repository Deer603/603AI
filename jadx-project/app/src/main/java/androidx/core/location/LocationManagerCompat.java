package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static Field sContextField;
    private static Method sGnssRequestBuilderBuildMethod;
    private static Class<?> sGnssRequestBuilderClass;
    static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = null;
    private static Method sRegisterGnssMeasurementsCallbackMethod;

    static class Api19Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerTransport transport) {
            if (sLocationRequestClass != null) goto L7;
            sLocationRequestClass = Class.forName("android.location.LocationRequest");     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
        L7:
            if (sRequestLocationUpdatesLooperMethod != null) goto L9;
            sRequestLocationUpdatesLooperMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
            sRequestLocationUpdatesLooperMethod.setAccessible(true);     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
        L9:
            LocationRequest request = locationRequest.toLocationRequest(provider);     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
            if (request == null) goto L29;
            WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> r3 = LocationManagerCompat.sLocationListeners;     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
            monitor-enter(r3);     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
            sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{request, transport, Looper.getMainLooper()});     // Catch: Throwable -> L16
            LocationManagerCompat.registerLocationListenerTransport(locationManager, transport);     // Catch: Throwable -> L16
            monitor-exit(r3);     // Catch: Throwable -> L16
            return true;
        L16:
            th = move-exception;
            throw th;     // Catch: UnsupportedOperationException -> L20 ClassNotFoundException -> L22 IllegalAccessException -> L24 InvocationTargetException -> L26 NoSuchMethodException -> L28
        L29:
            return false;
        }

        static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerCompat listener, Looper looper) {
            if (sLocationRequestClass != null) goto L7;
            sLocationRequestClass = Class.forName("android.location.LocationRequest");     // Catch: UnsupportedOperationException -> L14 ClassNotFoundException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20 NoSuchMethodException -> L22
        L7:
            if (sRequestLocationUpdatesLooperMethod != null) goto L9;
            sRequestLocationUpdatesLooperMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, LocationListener.class, Looper.class});     // Catch: UnsupportedOperationException -> L14 ClassNotFoundException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20 NoSuchMethodException -> L22
            sRequestLocationUpdatesLooperMethod.setAccessible(true);     // Catch: UnsupportedOperationException -> L14 ClassNotFoundException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20 NoSuchMethodException -> L22
        L9:
            LocationRequest request = locationRequest.toLocationRequest(provider);     // Catch: UnsupportedOperationException -> L14 ClassNotFoundException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20 NoSuchMethodException -> L22
            if (request == null) goto L23;
            sRequestLocationUpdatesLooperMethod.invoke(locationManager, new Object[]{request, listener, looper});     // Catch: UnsupportedOperationException -> L14 ClassNotFoundException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20 NoSuchMethodException -> L22
            return true;
        L23:
            return false;
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
            if (baseHandler == null) goto L5;
            boolean r2 = true;
        L6:
            Preconditions.checkArgument(r2);
            SimpleArrayMap<Object, Object> r3 = GnssListenersHolder.sGnssStatusListeners;
            monitor-enter(r3);
            PreRGnssStatusTransport transport = (PreRGnssStatusTransport) GnssListenersHolder.sGnssStatusListeners.get(callback);     // Catch: Throwable -> L19
            if (transport != null) goto L11;
            transport = new PreRGnssStatusTransport(callback);     // Catch: Throwable -> L19
        L12:
            transport.register(executor);     // Catch: Throwable -> L19
            if (locationManager.registerGnssStatusCallback(transport, baseHandler) == false) goto L17;
            GnssListenersHolder.sGnssStatusListeners.put(callback, transport);     // Catch: Throwable -> L19
            monitor-exit(r3);     // Catch: Throwable -> L19
            return true;
        L17:
            monitor-exit(r3);     // Catch: Throwable -> L19
            return false;
        L11:
            transport.unregister();     // Catch: Throwable -> L19
        L19:
            th = move-exception;
            throw th;
        L5:
            r2 = false;
            goto L6
        }

        static void unregisterGnssStatusCallback(LocationManager locationManager, Object callback) {
            if ((callback instanceof PreRGnssStatusTransport) == false) goto L5;
            ((PreRGnssStatusTransport) callback).unregister();
        L5:
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) callback);
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }

        static String getGnssHardwareModelName(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int getGnssYearOfHardware(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
    }

    private static class Api30Impl {
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        static void getCurrentLocation(LocationManager locationManager, String provider, CancellationSignal cancellationSignal, Executor executor, final Consumer<Location> consumer) {
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(provider, cancellationSignal, executor, new LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0(consumer));
        }

        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, Executor executor, LocationListenerCompat listener) {
            if (Build.VERSION.SDK_INT >= 30) goto L25;
        L24:
            return false;
        L25:
            if (sLocationRequestClass != null) goto L8;
            sLocationRequestClass = Class.forName("android.location.LocationRequest");     // Catch: UnsupportedOperationException -> L15 ClassNotFoundException -> L17 IllegalAccessException -> L19 InvocationTargetException -> L21 NoSuchMethodException -> L23
        L8:
            if (sRequestLocationUpdatesExecutorMethod != null) goto L10;
            sRequestLocationUpdatesExecutorMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[]{sLocationRequestClass, Executor.class, LocationListener.class});     // Catch: UnsupportedOperationException -> L15 ClassNotFoundException -> L17 IllegalAccessException -> L19 InvocationTargetException -> L21 NoSuchMethodException -> L23
            sRequestLocationUpdatesExecutorMethod.setAccessible(true);     // Catch: UnsupportedOperationException -> L15 ClassNotFoundException -> L17 IllegalAccessException -> L19 InvocationTargetException -> L21 NoSuchMethodException -> L23
        L10:
            Object request = locationRequest.toLocationRequest(provider);     // Catch: UnsupportedOperationException -> L15 ClassNotFoundException -> L17 IllegalAccessException -> L19 InvocationTargetException -> L21 NoSuchMethodException -> L23
            if (request == null) goto L24;
            sRequestLocationUpdatesExecutorMethod.invoke(locationManager, new Object[]{request, executor, listener});     // Catch: UnsupportedOperationException -> L15 ClassNotFoundException -> L17 IllegalAccessException -> L19 InvocationTargetException -> L21 NoSuchMethodException -> L23
            return true;
            goto L24
        }

        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap<Object, Object> r0 = GnssListenersHolder.sGnssStatusListeners;
            monitor-enter(r0);
            GnssStatusTransport transport = (GnssStatusTransport) GnssListenersHolder.sGnssStatusListeners.get(callback);     // Catch: Throwable -> L16
            if (transport != null) goto L8;
            transport = new GnssStatusTransport(callback);     // Catch: Throwable -> L16
        L8:
            if (locationManager.registerGnssStatusCallback(executor, transport) == false) goto L13;
            GnssListenersHolder.sGnssStatusListeners.put(callback, transport);     // Catch: Throwable -> L16
            monitor-exit(r0);     // Catch: Throwable -> L16
            return true;
        L13:
            monitor-exit(r0);     // Catch: Throwable -> L16
            return false;
        L16:
            th = move-exception;
            throw th;
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static boolean hasProvider(LocationManager locationManager, String provider) {
            return locationManager.hasProvider(provider);
        }

        static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequest locationRequest, Executor executor, LocationListener listener) {
            locationManager.requestLocationUpdates(provider, locationRequest, executor, listener);
        }

        static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }
    }

    private static final class CancellableLocationListener implements LocationListener {
        private Consumer<Location> mConsumer;
        private final Executor mExecutor;
        private final LocationManager mLocationManager;
        private final Handler mTimeoutHandler;
        Runnable mTimeoutRunnable;
        private boolean mTriggered;

        CancellableLocationListener(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mTimeoutHandler = new Handler(Looper.getMainLooper());
            this.mConsumer = consumer;
        }

        public void cancel() {
            monitor-enter(this);
        L11:
            th = move-exception;
            throw th;
        L4:
            if (this.mTriggered == false) goto L7;
            monitor-exit(this);     // Catch: Throwable -> L11
            return;
        L7:
            this.mTriggered = true;     // Catch: Throwable -> L11
            monitor-exit(this);     // Catch: Throwable -> L11
            cleanup();
        }

        public void startTimeout(long timeoutMs) {
            monitor-enter(this);
        L10:
            th = move-exception;
            throw th;
        L4:
            if (this.mTriggered == false) goto L7;
            monitor-exit(this);     // Catch: Throwable -> L10
            return;
        L7:
            this.mTimeoutRunnable = new LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0(this);     // Catch: Throwable -> L10
            this.mTimeoutHandler.postDelayed(this.mTimeoutRunnable, timeoutMs);     // Catch: Throwable -> L10
            monitor-exit(this);     // Catch: Throwable -> L10
        }

        /* JADX INFO: renamed from: lambda$startTimeout$0$androidx-core-location-LocationManagerCompat$CancellableLocationListener, reason: not valid java name */
        /* synthetic */ void m7236x40ccd759() {
            this.mTimeoutRunnable = null;
            Location r1 = (Location) null;
            onLocationChanged(null);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String p) {
            Location r1 = (Location) null;
            onLocationChanged(null);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            monitor-enter(this);
        L11:
            th = move-exception;
            throw th;
        L4:
            if (this.mTriggered == false) goto L7;
            monitor-exit(this);     // Catch: Throwable -> L11
            return;
        L7:
            this.mTriggered = true;     // Catch: Throwable -> L11
            monitor-exit(this);     // Catch: Throwable -> L11
            final Consumer<Location> consumer = this.mConsumer;
            this.mExecutor.execute(new LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1(consumer, location));
            cleanup();
        }

        static /* synthetic */ void lambda$onLocationChanged$1(Consumer consumer, Location location) {
            consumer.accept(location);
        }

        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            if (this.mTimeoutRunnable == null) goto L6;
            this.mTimeoutHandler.removeCallbacks(this.mTimeoutRunnable);
            this.mTimeoutRunnable = null;
            return;
        }
    }

    private static class GnssListenersHolder {
        static final SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = null;
        static final SimpleArrayMap<Object, Object> sGnssStatusListeners = null;

        private GnssListenersHolder() {
        }

        static {
            sGnssStatusListeners = new SimpleArrayMap();
            sGnssMeasurementListeners = new SimpleArrayMap();
        }
    }

    private static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        final GnssMeasurementsEvent.Callback mCallback;
        volatile Executor mExecutor;

        GnssMeasurementsTransport(GnssMeasurementsEvent.Callback callback, Executor executor) {
            this.mCallback = callback;
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0(this, executor, gnssMeasurementsEvent));
        }

        /* JADX INFO: renamed from: lambda$onGnssMeasurementsReceived$0$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m7237xb1484c70(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int status) {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1(this, executor, status));
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$1$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m7238xdc872524(Executor executor, int status) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onStatusChanged(status);
        }
    }

    private static class GnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(GnssStatusCompat.Callback callback) {
            if (callback == null) goto L5;
            boolean r0 = true;
        L6:
            Preconditions.checkArgument(r0, "invalid null callback");
            this.mCallback = callback;
            return;
        L5:
            r0 = false;
            goto L6
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int ttffMillis) {
            this.mCallback.onFirstFix(ttffMillis);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus status) {
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(status));
        }
    }

    private static class GpsStatusTransport implements GpsStatus.Listener {
        final GnssStatusCompat.Callback mCallback;
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            if (callback == null) goto L5;
            boolean r0 = true;
        L6:
            Preconditions.checkArgument(r0, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
            return;
        L5:
            r0 = false;
            goto L6
        }

        public void register(Executor executor) {
            if (this.mExecutor != null) goto L5;
            boolean r0 = true;
        L6:
            Preconditions.checkState(r0);
            this.mExecutor = executor;
            return;
        L5:
            r0 = false;
            goto L6
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int event) {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L6;
            return;
        L6:
            switch(event) {
                case 1: goto L15;
                case 2: goto L14;
                case 3: goto L11;
                case 4: goto L8;
                default: goto L22;
            };
        L8:
            GpsStatus gpsStatus = this.mLocationManager.getGpsStatus(null);
            if (gpsStatus == null) goto L17;
            final GnssStatusCompat gnssStatus = GnssStatusCompat.wrap(gpsStatus);
            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3(this, executor, gnssStatus));
            return;
        L17:
            return;
        L11:
            GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
            if (gpsStatus2 == null) goto L19;
            final int ttff = gpsStatus2.getTimeToFirstFix();
            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2(this, executor, ttff));
            return;
        L19:
            return;
        L14:
            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1(this, executor));
            return;
        L15:
            executor.execute(new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0(this, executor));
            return;
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m7239x75e92221(Executor executor) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onStarted();
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m7240xc3a89a22(Executor executor) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onStopped();
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m7241x11681223(Executor executor, int ttff) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onFirstFix(ttff);
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m7242x5f278a24(Executor executor, GnssStatusCompat gnssStatus) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onSatelliteStatusChanged(gnssStatus);
        }
    }

    private static final class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        InlineHandlerExecutor(Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            if (Looper.myLooper() != this.mHandler.getLooper()) goto L6;
            command.run();
            return;
        L6:
            if (this.mHandler.post((Runnable) Preconditions.checkNotNull(command)) == false) goto L9;
            return;
        L9:
            throw new RejectedExecutionException(this.mHandler + " is shutting down");
        }
    }

    private static class LocationListenerKey {
        final LocationListenerCompat mListener;
        final String mProvider;

        LocationListenerKey(String provider, LocationListenerCompat listener) {
            this.mProvider = (String) ObjectsCompat.requireNonNull(provider, "invalid null provider");
            this.mListener = (LocationListenerCompat) ObjectsCompat.requireNonNull(listener, "invalid null listener");
        }

        public boolean equals(Object o) {
            if ((o instanceof LocationListenerKey) == true) goto L5;
            return false;
        L5:
            LocationListenerKey that = (LocationListenerKey) o;
            if (this.mProvider.equals(that.mProvider) == true) goto L8;
            return false;
        L8:
            if (this.mListener.equals(that.mListener) == false) goto L12;
            return true;
        L12:
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{this.mProvider, this.mListener});
        }
    }

    private static class LocationListenerTransport implements LocationListener {
        final Executor mExecutor;
        volatile LocationListenerKey mKey;

        LocationListenerTransport(LocationListenerKey key, Executor executor) {
            this.mKey = key;
            this.mExecutor = executor;
        }

        public LocationListenerKey getKey() {
            return (LocationListenerKey) ObjectsCompat.requireNonNull(this.mKey);
        }

        public void unregister() {
            this.mKey = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3(this, location));
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$0$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7244xa8d50b3d(Location location) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onLocationChanged(location);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List<Location> locations) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2(this, locations));
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$1$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7245x2b1fc01c(List locations) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onLocationChanged(locations);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int requestCode) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4(this, requestCode));
        }

        /* JADX INFO: renamed from: lambda$onFlushComplete$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7243xf04cfe9d(int requestCode) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onFlushComplete(requestCode);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String provider, final int status, final Bundle extras) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5(this, provider, status, extras));
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7248xdbe6a717(String provider, int status, Bundle extras) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onStatusChanged(provider, status, extras);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String provider) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0(this, provider));
        }

        /* JADX INFO: renamed from: lambda$onProviderEnabled$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7247x5a2a7b08(String provider) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onProviderEnabled(provider);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String provider) {
            if (this.mKey != null) goto L5;
            return;
        L5:
            this.mExecutor.execute(new LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1(this, provider));
        }

        /* JADX INFO: renamed from: lambda$onProviderDisabled$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m7246x442abc92(String provider) {
            LocationListenerKey key = this.mKey;
            if (key != null) goto L5;
            return;
        L5:
            key.mListener.onProviderDisabled(provider);
        }
    }

    private static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;
        volatile Executor mExecutor;

        PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            if (callback == null) goto L5;
            boolean r0 = true;
        L6:
            Preconditions.checkArgument(r0, "invalid null callback");
            this.mCallback = callback;
            return;
        L5:
            r0 = false;
            goto L6
        }

        public void register(Executor executor) {
            boolean r0 = true;
            if (executor == null) goto L5;
            boolean r2 = true;
        L6:
            Preconditions.checkArgument(r2, "invalid null executor");
            if (this.mExecutor == null) goto L10;
            r0 = false;
        L10:
            Preconditions.checkState(r0);
            this.mExecutor = executor;
            return;
        L5:
            r2 = false;
            goto L6
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3(this, executor));
        }

        /* JADX INFO: renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m7251x7ba12b9c(Executor executor) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2(this, executor));
        }

        /* JADX INFO: renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m7252x80a5cd6f(Executor executor) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int ttffMillis) {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0(this, executor, ttffMillis));
        }

        /* JADX INFO: renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m7249x4191f1e(Executor executor, int ttffMillis) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onFirstFix(ttffMillis);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus status) {
            final Executor executor = this.mExecutor;
            if (executor != null) goto L5;
            return;
        L5:
            executor.execute(new LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1(this, executor, status));
        }

        /* JADX INFO: renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m7250xdecf6cdb(Executor executor, GnssStatus status) {
            if (this.mExecutor == executor) goto L5;
            return;
        L5:
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(status));
        }
    }

    public static boolean isLocationEnabled(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return Api28Impl.isLocationEnabled(locationManager);
    L7:
        if (locationManager.isProviderEnabled("network") == false) goto L9;
    L12:
        return true;
    L9:
        if (locationManager.isProviderEnabled("gps") == true) goto L12;
        return false;
    }

    public static boolean hasProvider(LocationManager locationManager, String provider) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return Api31Impl.hasProvider(locationManager, provider);
    L7:
        if (locationManager.getAllProviders().contains(provider) == false) goto L17;
        return true;
    L17:
        if (locationManager.getProvider(provider) == null) goto L14;
        return true;
    L14:
        return false;
    L16:
        return false;
    }

    @Deprecated
    public static void getCurrentLocation(LocationManager locationManager, String provider, androidx.core.os.CancellationSignal cancellationSignal, Executor executor, Consumer<Location> consumer) {
        if (cancellationSignal == null) goto L4;
        CancellationSignal r0 = (CancellationSignal) cancellationSignal.getCancellationSignalObject();
    L5:
        getCurrentLocation(locationManager, provider, r0, executor, consumer);
        return;
    L4:
        r0 = null;
        goto L5
    }

    public static void getCurrentLocation(LocationManager locationManager, String provider, CancellationSignal cancellationSignal, Executor executor, final Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        Api30Impl.getCurrentLocation(locationManager, provider, cancellationSignal, executor, consumer);
        return;
    L6:
        if (cancellationSignal == null) goto L8;
        cancellationSignal.throwIfCanceled();
    L8:
        final Location location = locationManager.getLastKnownLocation(provider);
        if (location == null) goto L14;
        long locationAgeMs = SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(location);
        if (locationAgeMs >= MAX_CURRENT_LOCATION_AGE_MS) goto L14;
        executor.execute(new LocationManagerCompat$$ExternalSyntheticLambda0(consumer, location));
        return;
    L14:
        final CancellableLocationListener listener = new CancellableLocationListener(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(provider, 0, 0.0f, listener, Looper.getMainLooper());
        if (cancellationSignal == null) goto L17;
        Objects.requireNonNull(listener);
        cancellationSignal.setOnCancelListener(new LocationManagerCompat$$ExternalSyntheticLambda1(listener));
    L17:
        listener.startTimeout(GET_CURRENT_LOCATION_TIMEOUT_MS);
    }

    static /* synthetic */ void lambda$getCurrentLocation$0(Consumer consumer, Location location) {
        consumer.accept(location);
    }

    static {
        sLocationListeners = new WeakHashMap();
    }

    public static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, Executor executor, LocationListenerCompat listener) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        Api31Impl.requestLocationUpdates(locationManager, provider, locationRequest.toLocationRequest(), executor, listener);
        return;
    L7:
        if (Build.VERSION.SDK_INT >= 30) goto L9;
    L11:
        LocationListenerTransport transport = new LocationListenerTransport(new LocationListenerKey(provider, listener), executor);
        if (Api19Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, transport) == false) goto L14;
        return;
    L14:
        WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> r1 = sLocationListeners;
        monitor-enter(r1);
        locationManager.requestLocationUpdates(provider, locationRequest.getIntervalMillis(), locationRequest.getMinUpdateDistanceMeters(), transport, Looper.getMainLooper());     // Catch: Throwable -> L25
        registerLocationListenerTransport(locationManager, transport);     // Catch: Throwable -> L25
        monitor-exit(r1);     // Catch: Throwable -> L25
        return;
    L21:
        th = move-exception;
        Throwable r9 = th;
    L23:
        monitor-exit(r1);     // Catch: Throwable -> L25
        throw r9;
    L25:
        th = move-exception;
        r9 = th;
        goto L23
    L9:
        if (Api30Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, executor, listener) == false) goto L11;
    }

    static void registerLocationListenerTransport(LocationManager locationManager, LocationListenerTransport transport) {
        WeakReference<LocationListenerTransport> oldRef = sLocationListeners.put(transport.getKey(), new WeakReference(transport));
        if (oldRef == null) goto L5;
        LocationListenerTransport oldTransport = oldRef.get();
    L6:
        if (oldTransport == null) goto L9;
        oldTransport.unregister();
        locationManager.removeUpdates(oldTransport);
        return;
    L9:
        return;
    L5:
        oldTransport = null;
        goto L6
    }

    public static void requestLocationUpdates(LocationManager locationManager, String provider, LocationRequestCompat locationRequest, LocationListenerCompat listener, Looper looper) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        Api31Impl.requestLocationUpdates(locationManager, provider, locationRequest.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), listener);
        return;
    L7:
        if (Api19Impl.tryRequestLocationUpdates(locationManager, provider, locationRequest, listener, looper) == false) goto L9;
        return;
    L9:
        locationManager.requestLocationUpdates(provider, locationRequest.getIntervalMillis(), locationRequest.getMinUpdateDistanceMeters(), listener, looper);
    }

    public static void removeUpdates(LocationManager locationManager, LocationListenerCompat listener) {
        WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> r0 = sLocationListeners;
        monitor-enter(r0);
        ArrayList<LocationListenerKey> cleanup = null;
        Iterator<WeakReference<LocationListenerTransport>> r2 = sLocationListeners.values().iterator();     // Catch: Throwable -> L25
    L7:
        if (r2.hasNext() == false) goto L17;
        WeakReference<LocationListenerTransport> transportRef = r2.next();     // Catch: Throwable -> L25
        LocationListenerTransport transport = transportRef.get();     // Catch: Throwable -> L25
        if (transport == null) goto L7;
        LocationListenerKey key = transport.getKey();     // Catch: Throwable -> L25
        if (key.mListener != listener) goto L7;
        if (cleanup != null) goto L15;
        cleanup = new ArrayList();     // Catch: Throwable -> L25
    L15:
        cleanup.add(key);     // Catch: Throwable -> L25
        transport.unregister();     // Catch: Throwable -> L25
        locationManager.removeUpdates(transport);     // Catch: Throwable -> L25
        goto L7
    L17:
        if (cleanup == null) goto L22;
        Iterator<LocationListenerKey> r3 = cleanup.iterator();     // Catch: Throwable -> L25
    L20:
        if (r3.hasNext() == false) goto L22;
        LocationListenerKey key2 = r3.next();     // Catch: Throwable -> L25
        sLocationListeners.remove(key2);     // Catch: Throwable -> L25
    L22:
        monitor-exit(r0);     // Catch: Throwable -> L25
        locationManager.removeUpdates(listener);
        return;
    L25:
        th = move-exception;
        throw th;
    }

    public static String getGnssHardwareModelName(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return null;
    L5:
        return Api28Impl.getGnssHardwareModelName(locationManager);
    }

    public static int getGnssYearOfHardware(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return 0;
    L5:
        return Api28Impl.getGnssYearOfHardware(locationManager);
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
        if (Build.VERSION.SDK_INT <= 30) goto L7;
        return Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler);
    L7:
        if (Build.VERSION.SDK_INT == 30) goto L9;
        SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> r0 = GnssListenersHolder.sGnssMeasurementListeners;
        monitor-enter(r0);
        unregisterGnssMeasurementsCallback(locationManager, callback);     // Catch: Throwable -> L21
        if (Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler) == false) goto L18;
        GnssListenersHolder.sGnssMeasurementListeners.put(callback, callback);     // Catch: Throwable -> L21
        monitor-exit(r0);     // Catch: Throwable -> L21
        return true;
    L18:
        monitor-exit(r0);     // Catch: Throwable -> L21
        return false;
    L21:
        th = move-exception;
        throw th;
    L9:
        return registerGnssMeasurementsCallbackOnR(locationManager, ExecutorCompat.create(handler), callback);
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT <= 30) goto L7;
        return Api31Impl.registerGnssMeasurementsCallback(locationManager, executor, callback);
    L7:
        if (Build.VERSION.SDK_INT == 30) goto L9;
        SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> r0 = GnssListenersHolder.sGnssMeasurementListeners;
        monitor-enter(r0);
        GnssMeasurementsTransport newTransport = new GnssMeasurementsTransport(callback, executor);     // Catch: Throwable -> L21
        unregisterGnssMeasurementsCallback(locationManager, callback);     // Catch: Throwable -> L21
        if (Api24Impl.registerGnssMeasurementsCallback(locationManager, newTransport) == false) goto L18;
        GnssListenersHolder.sGnssMeasurementListeners.put(callback, newTransport);     // Catch: Throwable -> L21
        monitor-exit(r0);     // Catch: Throwable -> L21
        return true;
    L18:
        monitor-exit(r0);     // Catch: Throwable -> L21
        return false;
    L21:
        th = move-exception;
        throw th;
    L9:
        return registerGnssMeasurementsCallbackOnR(locationManager, executor, callback);
    }

    public static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        Api24Impl.unregisterGnssMeasurementsCallback(locationManager, callback);
        return;
    L5:
        SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> r0 = GnssListenersHolder.sGnssMeasurementListeners;
        monitor-enter(r0);
        GnssMeasurementsEvent.Callback transport = GnssListenersHolder.sGnssMeasurementListeners.remove(callback);     // Catch: Throwable -> L15
        if (transport != null) goto L10;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L15
        return;
    L10:
        if ((transport instanceof GnssMeasurementsTransport) == false) goto L12;
        ((GnssMeasurementsTransport) transport).unregister();     // Catch: Throwable -> L15
    L12:
        Api24Impl.unregisterGnssMeasurementsCallback(locationManager, transport);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }

    private static boolean registerGnssMeasurementsCallbackOnR(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT != 30) goto L31;
        if (sGnssRequestBuilderClass != null) goto L9;
        sGnssRequestBuilderClass = Class.forName("android.location.GnssRequest$Builder");     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
    L9:
        if (sGnssRequestBuilderBuildMethod != null) goto L12;
        sGnssRequestBuilderBuildMethod = sGnssRequestBuilderClass.getDeclaredMethod("build", new Class[0]);     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
        sGnssRequestBuilderBuildMethod.setAccessible(true);     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
    L12:
        if (sRegisterGnssMeasurementsCallbackMethod != null) goto L14;
        sRegisterGnssMeasurementsCallbackMethod = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", new Class[]{Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class});     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
        sRegisterGnssMeasurementsCallbackMethod.setAccessible(true);     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
    L14:
        Object success = sRegisterGnssMeasurementsCallbackMethod.invoke(locationManager, new Object[]{sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback});     // Catch: InstantiationException -> L20 Throwable -> L22 NoSuchMethodException -> L24 InvocationTargetException -> L26 ClassNotFoundException -> L28
        if (success == null) goto L34;
        if (((Boolean) success).booleanValue() == true) goto L19;
        return false;
    L19:
        return true;
    L34:
        return false;
    L29:
        return false;
    L31:
        throw new IllegalStateException();
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback, Handler handler) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback);
    L7:
        return registerGnssStatusCallback(locationManager, new InlineHandlerExecutor(handler), callback);
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, Executor executor, GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        Looper looper = Looper.myLooper();
        if (looper != null) goto L10;
        looper = Looper.getMainLooper();
    L10:
        return registerGnssStatusCallback(locationManager, new Handler(looper), executor, callback);
    L5:
        return registerGnssStatusCallback(locationManager, null, executor, callback);
    }

    private static boolean registerGnssStatusCallback(LocationManager locationManager, Handler baseHandler, Executor executor, GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.registerGnssStatusCallback(locationManager, baseHandler, executor, callback);
    L7:
        return Api24Impl.registerGnssStatusCallback(locationManager, baseHandler, executor, callback);
    }

    static /* synthetic */ Boolean lambda$registerGnssStatusCallback$1(LocationManager locationManager, GpsStatusTransport myTransport) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(myTransport));
    }

    public static void unregisterGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback) {
        SimpleArrayMap<Object, Object> r0 = GnssListenersHolder.sGnssStatusListeners;
        monitor-enter(r0);
        Object transport = GnssListenersHolder.sGnssStatusListeners.remove(callback);     // Catch: Throwable -> L9
        if (transport == null) goto L7;
        Api24Impl.unregisterGnssStatusCallback(locationManager, transport);     // Catch: Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    private LocationManagerCompat() {
    }
}
