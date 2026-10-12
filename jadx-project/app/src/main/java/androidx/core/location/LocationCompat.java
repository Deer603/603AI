package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.ReplaceWith;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static Field sFieldsMaskField;
    private static Integer sHasBearingAccuracyMask;
    private static Integer sHasSpeedAccuracyMask;
    private static Integer sHasVerticalAccuracyMask;
    private static Method sSetIsFromMockProviderMethod;

    private static class Api26Impl {
        private Api26Impl() {
        }

        static boolean hasVerticalAccuracy(Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getVerticalAccuracyMeters(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void setVerticalAccuracyMeters(Location location, float verticalAccuracyM) {
            location.setVerticalAccuracyMeters(verticalAccuracyM);
        }

        static void removeVerticalAccuracy(Location location) {
            byte fieldsMask = LocationCompat.getFieldsMaskField().getByte(location);     // Catch: IllegalAccessException -> L4 Throwable -> L6
            byte fieldsMask2 = (byte) ((~LocationCompat.getHasVerticalAccuracyMask()) & fieldsMask);     // Catch: IllegalAccessException -> L4 Throwable -> L6
            LocationCompat.getFieldsMaskField().setByte(location, fieldsMask2);     // Catch: IllegalAccessException -> L4 Throwable -> L6
            return;
        L6:
            e = move-exception;
            Error error = new IllegalAccessError();
            error.initCause(e);
            throw error;
        }

        static boolean hasSpeedAccuracy(Location location) {
            return location.hasSpeedAccuracy();
        }

        static float getSpeedAccuracyMetersPerSecond(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void setSpeedAccuracyMetersPerSecond(Location location, float speedAccuracyMps) {
            location.setSpeedAccuracyMetersPerSecond(speedAccuracyMps);
        }

        static void removeSpeedAccuracy(Location location) {
            byte fieldsMask = LocationCompat.getFieldsMaskField().getByte(location);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            byte fieldsMask2 = (byte) ((~LocationCompat.getHasSpeedAccuracyMask()) & fieldsMask);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            LocationCompat.getFieldsMaskField().setByte(location, fieldsMask2);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            return;
        L4:
            e = move-exception;
            Error error = new IllegalAccessError();
            error.initCause(e);
            throw error;
        L7:
            e = move-exception;
            Error error2 = new NoSuchFieldError();
            error2.initCause(e);
            throw error2;
        }

        static boolean hasBearingAccuracy(Location location) {
            return location.hasBearingAccuracy();
        }

        static float getBearingAccuracyDegrees(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void setBearingAccuracyDegrees(Location location, float bearingAccuracyD) {
            location.setBearingAccuracyDegrees(bearingAccuracyD);
        }

        static void removeBearingAccuracy(Location location) {
            byte fieldsMask = LocationCompat.getFieldsMaskField().getByte(location);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            byte fieldsMask2 = (byte) ((~LocationCompat.getHasBearingAccuracyMask()) & fieldsMask);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            LocationCompat.getFieldsMaskField().setByte(location, fieldsMask2);     // Catch: IllegalAccessException -> L4 NoSuchFieldException -> L7
            return;
        L4:
            e = move-exception;
            Error error = new IllegalAccessError();
            error.initCause(e);
            throw error;
        L7:
            e = move-exception;
            Error error2 = new NoSuchFieldError();
            error2.initCause(e);
            throw error2;
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            if (location.hasVerticalAccuracy() == true) goto L5;
            return;
        L5:
            String provider = location.getProvider();
            long time = location.getTime();
            long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            boolean hasAltitude = location.hasAltitude();
            double altitude = location.getAltitude();
            boolean hasSpeed = location.hasSpeed();
            float speed = location.getSpeed();
            boolean hasBearing = location.hasBearing();
            float bearing = location.getBearing();
            boolean hasAccuracy = location.hasAccuracy();
            float accuracy = location.getAccuracy();
            boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
            float speedAccuracy = location.getSpeedAccuracyMetersPerSecond();
            boolean hasBearingAccuracy = location.hasBearingAccuracy();
            float bearingAccuracy = location.getBearingAccuracyDegrees();
            Bundle extras = location.getExtras();
            location.reset();
            location.setProvider(provider);
            location.setTime(time);
            location.setElapsedRealtimeNanos(elapsedRealtimeNs);
            location.setLatitude(latitude);
            location.setLongitude(longitude);
            if (hasAltitude == false) goto L8;
            location.setAltitude(altitude);
        L8:
            if (hasSpeed == false) goto L10;
            location.setSpeed(speed);
        L10:
            if (hasBearing == false) goto L12;
            location.setBearing(bearing);
        L12:
            if (hasAccuracy == false) goto L14;
            location.setAccuracy(accuracy);
        L14:
            if (hasSpeedAccuracy == false) goto L16;
            float speedAccuracy2 = speedAccuracy;
            location.setSpeedAccuracyMetersPerSecond(speedAccuracy2);
        L17:
            if (hasBearingAccuracy == false) goto L20;
            location.setBearingAccuracyDegrees(bearingAccuracy);
        L20:
            if (extras == null) goto L23;
            location.setExtras(extras);
            return;
        L23:
            return;
        L16:
            speedAccuracy2 = speedAccuracy;
            goto L17
        }

        static void removeSpeedAccuracy(Location location) {
            if (location.hasSpeedAccuracy() == true) goto L5;
            return;
        L5:
            String provider = location.getProvider();
            long time = location.getTime();
            long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            boolean hasAltitude = location.hasAltitude();
            double altitude = location.getAltitude();
            boolean hasSpeed = location.hasSpeed();
            float speed = location.getSpeed();
            boolean hasBearing = location.hasBearing();
            float bearing = location.getBearing();
            boolean hasAccuracy = location.hasAccuracy();
            float accuracy = location.getAccuracy();
            boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
            float verticalAccuracy = location.getVerticalAccuracyMeters();
            boolean hasBearingAccuracy = location.hasBearingAccuracy();
            float bearingAccuracy = location.getBearingAccuracyDegrees();
            Bundle extras = location.getExtras();
            location.reset();
            location.setProvider(provider);
            location.setTime(time);
            location.setElapsedRealtimeNanos(elapsedRealtimeNs);
            location.setLatitude(latitude);
            location.setLongitude(longitude);
            if (hasAltitude == false) goto L8;
            location.setAltitude(altitude);
        L8:
            if (hasSpeed == false) goto L10;
            location.setSpeed(speed);
        L10:
            if (hasBearing == false) goto L12;
            location.setBearing(bearing);
        L12:
            if (hasAccuracy == false) goto L14;
            location.setAccuracy(accuracy);
        L14:
            if (hasVerticalAccuracy == false) goto L16;
            float verticalAccuracy2 = verticalAccuracy;
            location.setVerticalAccuracyMeters(verticalAccuracy2);
        L17:
            if (hasBearingAccuracy == false) goto L20;
            location.setBearingAccuracyDegrees(bearingAccuracy);
        L20:
            if (extras == null) goto L23;
            location.setExtras(extras);
            return;
        L23:
            return;
        L16:
            verticalAccuracy2 = verticalAccuracy;
            goto L17
        }

        static void removeBearingAccuracy(Location location) {
            if (location.hasBearingAccuracy() == true) goto L5;
            return;
        L5:
            String provider = location.getProvider();
            long time = location.getTime();
            long elapsedRealtimeNs = location.getElapsedRealtimeNanos();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            boolean hasAltitude = location.hasAltitude();
            double altitude = location.getAltitude();
            boolean hasSpeed = location.hasSpeed();
            float speed = location.getSpeed();
            boolean hasBearing = location.hasBearing();
            float bearing = location.getBearing();
            boolean hasAccuracy = location.hasAccuracy();
            float accuracy = location.getAccuracy();
            boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
            float verticalAccuracy = location.getVerticalAccuracyMeters();
            boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
            float speedAccuracy = location.getSpeedAccuracyMetersPerSecond();
            Bundle extras = location.getExtras();
            location.reset();
            location.setProvider(provider);
            location.setTime(time);
            location.setElapsedRealtimeNanos(elapsedRealtimeNs);
            location.setLatitude(latitude);
            location.setLongitude(longitude);
            if (hasAltitude == false) goto L8;
            location.setAltitude(altitude);
        L8:
            if (hasSpeed == false) goto L10;
            location.setSpeed(speed);
        L10:
            if (hasBearing == false) goto L12;
            location.setBearing(bearing);
        L12:
            if (hasAccuracy == false) goto L14;
            location.setAccuracy(accuracy);
        L14:
            if (hasVerticalAccuracy == false) goto L16;
            float verticalAccuracy2 = verticalAccuracy;
            location.setVerticalAccuracyMeters(verticalAccuracy2);
        L17:
            if (hasSpeedAccuracy == false) goto L20;
            location.setBearingAccuracyDegrees(speedAccuracy);
        L20:
            if (extras == null) goto L23;
            location.setExtras(extras);
            return;
        L23:
            return;
        L16:
            verticalAccuracy2 = verticalAccuracy;
            goto L17
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            if (location.hasVerticalAccuracy() == true) goto L5;
            return;
        L5:
            double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.removeVerticalAccuracy(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
        }

        static void removeSpeedAccuracy(Location location) {
            if (location.hasSpeedAccuracy() == true) goto L5;
            return;
        L5:
            double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.removeSpeedAccuracy(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
        }

        static void removeBearingAccuracy(Location location) {
            if (location.hasBearingAccuracy() == true) goto L5;
            return;
        L5:
            double elapsedRealtimeUncertaintyNs = location.getElapsedRealtimeUncertaintyNanos();
            Api28Impl.removeBearingAccuracy(location);
            location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNs);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean isMock(Location location) {
            return location.isMock();
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static void removeVerticalAccuracy(Location location) {
            location.removeVerticalAccuracy();
        }

        static void removeSpeedAccuracy(Location location) {
            location.removeSpeedAccuracy();
        }

        static void removeBearingAccuracy(Location location) {
            location.removeBearingAccuracy();
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static double getMslAltitudeMeters(Location location) {
            return location.getMslAltitudeMeters();
        }

        static void setMslAltitudeMeters(Location location, double mslAltitudeMeters) {
            location.setMslAltitudeMeters(mslAltitudeMeters);
        }

        static boolean hasMslAltitude(Location location) {
            return location.hasMslAltitude();
        }

        static void removeMslAltitude(Location location) {
            location.removeMslAltitude();
        }

        static float getMslAltitudeAccuracyMeters(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static void setMslAltitudeAccuracyMeters(Location location, float mslAltitudeAccuracyMeters) {
            location.setMslAltitudeAccuracyMeters(mslAltitudeAccuracyMeters);
        }

        static boolean hasMslAltitudeAccuracy(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void removeMslAltitudeAccuracy(Location location) {
            location.removeMslAltitudeAccuracy();
        }
    }

    private LocationCompat() {
    }

    @ReplaceWith(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long getElapsedRealtimeNanos(Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static long getElapsedRealtimeMillis(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static boolean hasVerticalAccuracy(Location location) {
        return Api26Impl.hasVerticalAccuracy(location);
    }

    public static float getVerticalAccuracyMeters(Location location) {
        return Api26Impl.getVerticalAccuracyMeters(location);
    }

    public static void setVerticalAccuracyMeters(Location location, float verticalAccuracyM) {
        Api26Impl.setVerticalAccuracyMeters(location, verticalAccuracyM);
    }

    public static void removeVerticalAccuracy(Location location) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        Api33Impl.removeVerticalAccuracy(location);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Api29Impl.removeVerticalAccuracy(location);
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
        Api28Impl.removeVerticalAccuracy(location);
        return;
    L11:
        Api26Impl.removeVerticalAccuracy(location);
    }

    public static boolean hasSpeedAccuracy(Location location) {
        return Api26Impl.hasSpeedAccuracy(location);
    }

    public static float getSpeedAccuracyMetersPerSecond(Location location) {
        return Api26Impl.getSpeedAccuracyMetersPerSecond(location);
    }

    public static void setSpeedAccuracyMetersPerSecond(Location location, float speedAccuracyMps) {
        Api26Impl.setSpeedAccuracyMetersPerSecond(location, speedAccuracyMps);
    }

    public static void removeSpeedAccuracy(Location location) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        Api33Impl.removeSpeedAccuracy(location);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Api29Impl.removeSpeedAccuracy(location);
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
        Api28Impl.removeSpeedAccuracy(location);
        return;
    L11:
        Api26Impl.removeSpeedAccuracy(location);
    }

    public static boolean hasBearingAccuracy(Location location) {
        return Api26Impl.hasBearingAccuracy(location);
    }

    public static float getBearingAccuracyDegrees(Location location) {
        return Api26Impl.getBearingAccuracyDegrees(location);
    }

    public static void setBearingAccuracyDegrees(Location location, float bearingAccuracyD) {
        Api26Impl.setBearingAccuracyDegrees(location, bearingAccuracyD);
    }

    public static void removeBearingAccuracy(Location location) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        Api33Impl.removeBearingAccuracy(location);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Api29Impl.removeBearingAccuracy(location);
        return;
    L9:
        if (Build.VERSION.SDK_INT < 28) goto L11;
        Api28Impl.removeBearingAccuracy(location);
        return;
    L11:
        Api26Impl.removeBearingAccuracy(location);
    }

    public static double getMslAltitudeMeters(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.getMslAltitudeMeters(location);
    L7:
        return getOrCreateExtras(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(Location location, double mslAltitudeMeters) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api34Impl.setMslAltitudeMeters(location, mslAltitudeMeters);
        return;
    L5:
        getOrCreateExtras(location).putDouble(EXTRA_MSL_ALTITUDE, mslAltitudeMeters);
    }

    public static boolean hasMslAltitude(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.hasMslAltitude(location);
    L7:
        return containsExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api34Impl.removeMslAltitude(location);
        return;
    L5:
        removeExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static float getMslAltitudeAccuracyMeters(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.getMslAltitudeAccuracyMeters(location);
    L7:
        return getOrCreateExtras(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(Location location, float mslAltitudeAccuracyMeters) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api34Impl.setMslAltitudeAccuracyMeters(location, mslAltitudeAccuracyMeters);
        return;
    L5:
        getOrCreateExtras(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, mslAltitudeAccuracyMeters);
    }

    public static boolean hasMslAltitudeAccuracy(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.hasMslAltitudeAccuracy(location);
    L7:
        return containsExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(Location location) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api34Impl.removeMslAltitudeAccuracy(location);
        return;
    L5:
        removeExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static boolean isMock(Location location) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return Api31Impl.isMock(location);
    L7:
        return location.isFromMockProvider();
    }

    public static void setMock(Location location, boolean mock) {
        getSetIsFromMockProviderMethod().invoke(location, new Object[]{Boolean.valueOf(mock)});     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L7 NoSuchMethodException -> L10
        return;
    L7:
        e = move-exception;
        Error error = new IllegalAccessError();
        error.initCause(e);
        throw error;
    L10:
        e = move-exception;
        Error error2 = new NoSuchMethodError();
        error2.initCause(e);
        throw error2;
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static Method getSetIsFromMockProviderMethod() throws NoSuchMethodException {
        if (sSetIsFromMockProviderMethod != null) goto L6;
        sSetIsFromMockProviderMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
        sSetIsFromMockProviderMethod.setAccessible(true);
    L6:
        return sSetIsFromMockProviderMethod;
    }

    static Field getFieldsMaskField() throws NoSuchFieldException {
        if (sFieldsMaskField != null) goto L6;
        sFieldsMaskField = Location.class.getDeclaredField("mFieldsMask");
        sFieldsMaskField.setAccessible(true);
    L6:
        return sFieldsMaskField;
    }

    static int getHasSpeedAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasSpeedAccuracyMask != null) goto L6;
        Field hasSpeedAccuracyMaskField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
        hasSpeedAccuracyMaskField.setAccessible(true);
        sHasSpeedAccuracyMask = Integer.valueOf(hasSpeedAccuracyMaskField.getInt(null));
    L6:
        return sHasSpeedAccuracyMask.intValue();
    }

    static int getHasBearingAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasBearingAccuracyMask != null) goto L6;
        Field hasBearingAccuracyMaskField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
        hasBearingAccuracyMaskField.setAccessible(true);
        sHasBearingAccuracyMask = Integer.valueOf(hasBearingAccuracyMaskField.getInt(null));
    L6:
        return sHasBearingAccuracyMask.intValue();
    }

    static int getHasVerticalAccuracyMask() throws NoSuchFieldException, IllegalAccessException {
        if (sHasVerticalAccuracyMask != null) goto L6;
        Field hasVerticalAccuracyMaskField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
        hasVerticalAccuracyMaskField.setAccessible(true);
        sHasVerticalAccuracyMask = Integer.valueOf(hasVerticalAccuracyMaskField.getInt(null));
    L6:
        return sHasVerticalAccuracyMask.intValue();
    }

    private static Bundle getOrCreateExtras(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) goto L6;
        location.setExtras(new Bundle());
        return location.getExtras();
    L6:
        return extras;
    }

    private static boolean containsExtra(Location location, String key) {
        Bundle extras = location.getExtras();
        if (extras != null) goto L5;
    L7:
        return false;
    L5:
        if (extras.containsKey(key) == false) goto L7;
        return true;
    }

    private static void removeExtra(Location location, String key) {
        Bundle extras = location.getExtras();
        if (extras == null) goto L8;
        extras.remove(key);
        if (extras.isEmpty() == false) goto L9;
        location.setExtras(null);
        return;
    L9:
        return;
    }
}
