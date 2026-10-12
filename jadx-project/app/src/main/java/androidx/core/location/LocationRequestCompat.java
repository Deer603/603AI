package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    private static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        public static Object toLocationRequest(LocationRequestCompat obj, String provider) {
            if (sLocationRequestClass != null) goto L7;
            sLocationRequestClass = Class.forName("android.location.LocationRequest");     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L7:
            if (sCreateFromDeprecatedProviderMethod != null) goto L9;
            sCreateFromDeprecatedProviderMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            sCreateFromDeprecatedProviderMethod.setAccessible(true);     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L9:
            Object request = sCreateFromDeprecatedProviderMethod.invoke(null, new Object[]{provider, Long.valueOf(obj.getIntervalMillis()), Float.valueOf(obj.getMinUpdateDistanceMeters()), false});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            if (request != null) goto L13;
            return null;
        L13:
            if (sSetQualityMethod != null) goto L15;
            sSetQualityMethod = sLocationRequestClass.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            sSetQualityMethod.setAccessible(true);     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L15:
            sSetQualityMethod.invoke(request, new Object[]{Integer.valueOf(obj.getQuality())});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            if (sSetFastestIntervalMethod != null) goto L18;
            sSetFastestIntervalMethod = sLocationRequestClass.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            sSetFastestIntervalMethod.setAccessible(true);     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L18:
            sSetFastestIntervalMethod.invoke(request, new Object[]{Long.valueOf(obj.getMinUpdateIntervalMillis())});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            if (obj.getMaxUpdates() >= Integer.MAX_VALUE) goto L25;
            if (sSetNumUpdatesMethod != null) goto L23;
            sSetNumUpdatesMethod = sLocationRequestClass.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            sSetNumUpdatesMethod.setAccessible(true);     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L23:
            sSetNumUpdatesMethod.invoke(request, new Object[]{Integer.valueOf(obj.getMaxUpdates())});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L25:
            if (obj.getDurationMillis() < Long.MAX_VALUE) goto L27;
        L30:
            return request;
        L27:
            if (sSetExpireInMethod != null) goto L29;
            sSetExpireInMethod = sLocationRequestClass.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
            sSetExpireInMethod.setAccessible(true);     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L29:
            sSetExpireInMethod.invoke(request, new Object[]{Long.valueOf(obj.getDurationMillis())});     // Catch: Throwable -> L31 IllegalAccessException -> L33 InvocationTargetException -> L35 NoSuchMethodException -> L37
        L38:
            return null;
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        public static LocationRequest toLocationRequest(LocationRequestCompat obj) {
            return new LocationRequest.Builder(obj.getIntervalMillis()).setQuality(obj.getQuality()).setMinUpdateIntervalMillis(obj.getMinUpdateIntervalMillis()).setDurationMillis(obj.getDurationMillis()).setMaxUpdates(obj.getMaxUpdates()).setMinUpdateDistanceMeters(obj.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(obj.getMaxUpdateDelayMillis()).build();
        }
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long intervalMillis) {
            setIntervalMillis(intervalMillis);
            this.mQuality = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0;
        }

        public Builder(LocationRequestCompat locationRequest) {
            this.mIntervalMillis = locationRequest.mIntervalMillis;
            this.mQuality = locationRequest.mQuality;
            this.mDurationMillis = locationRequest.mDurationMillis;
            this.mMaxUpdates = locationRequest.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequest.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequest.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequest.mMaxUpdateDelayMillis;
        }

        public Builder setIntervalMillis(long intervalMillis) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(intervalMillis, 0, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public Builder setQuality(int quality) {
            if (quality != 104) goto L5;
        L10:
            boolean r0 = true;
        L11:
            Preconditions.checkArgument(r0, "quality must be a defined QUALITY constant, not %d", new Object[]{Integer.valueOf(quality)});
            this.mQuality = quality;
            return this;
        L5:
            if (quality == 102) goto L10;
            if (quality == 100) goto L10;
            r0 = false;
            goto L11
        }

        public Builder setDurationMillis(long durationMillis) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(durationMillis, 1, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public Builder setMaxUpdates(int maxUpdates) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(maxUpdates, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long minUpdateIntervalMillis) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(minUpdateIntervalMillis, 0, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float minUpdateDistanceMeters) {
            this.mMinUpdateDistanceMeters = minUpdateDistanceMeters;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(minUpdateDistanceMeters, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long maxUpdateDelayMillis) {
            this.mMaxUpdateDelayMillis = maxUpdateDelayMillis;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(maxUpdateDelayMillis, 0, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        public LocationRequestCompat build() {
            if (this.mIntervalMillis == Long.MAX_VALUE) goto L5;
        L8:
            boolean r0 = true;
        L9:
            Preconditions.checkState(r0, "passive location requests must have an explicit minimum update interval");
            return new LocationRequestCompat(this.mIntervalMillis, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, this.mIntervalMillis), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        L5:
            if (this.mMinUpdateIntervalMillis != (-1)) goto L8;
            r0 = false;
            goto L9
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    LocationRequestCompat(long intervalMillis, int quality, long durationMillis, int maxUpdates, long minUpdateIntervalMillis, float minUpdateDistanceMeters, long maxUpdateDelayMillis) {
        this.mIntervalMillis = intervalMillis;
        this.mQuality = quality;
        this.mMinUpdateIntervalMillis = minUpdateIntervalMillis;
        this.mDurationMillis = durationMillis;
        this.mMaxUpdates = maxUpdates;
        this.mMinUpdateDistanceMeters = minUpdateDistanceMeters;
        this.mMaxUpdateDelayMillis = maxUpdateDelayMillis;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    public long getMinUpdateIntervalMillis() {
        if (this.mMinUpdateIntervalMillis != (-1)) goto L7;
        return this.mIntervalMillis;
    L7:
        return this.mMinUpdateIntervalMillis;
    }

    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    public LocationRequest toLocationRequest(String provider) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return toLocationRequest();
    L7:
        return (LocationRequest) Api19Impl.toLocationRequest(this, provider);
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof LocationRequestCompat) == true) goto L8;
        return false;
    L8:
        LocationRequestCompat that = (LocationRequestCompat) o;
        if (this.mQuality != that.mQuality) goto L24;
        if (this.mIntervalMillis != that.mIntervalMillis) goto L24;
        if (this.mMinUpdateIntervalMillis != that.mMinUpdateIntervalMillis) goto L24;
        if (this.mDurationMillis != that.mDurationMillis) goto L24;
        if (this.mMaxUpdates != that.mMaxUpdates) goto L24;
        if (Float.compare(that.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) != 0) goto L24;
        if (this.mMaxUpdateDelayMillis != that.mMaxUpdateDelayMillis) goto L24;
        return true;
    L24:
        return false;
    }

    public int hashCode() {
        int result = this.mQuality;
        int result2 = (result * 31) + ((int) (this.mIntervalMillis ^ (this.mIntervalMillis >>> 32)));
        return (result2 * 31) + ((int) (this.mMinUpdateIntervalMillis ^ (this.mMinUpdateIntervalMillis >>> 32)));
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Request[");
        if (this.mIntervalMillis == Long.MAX_VALUE) goto L11;
        s.append("@");
        TimeUtils.formatDuration(this.mIntervalMillis, s);
        switch(this.mQuality) {
            case 100: goto L9;
            case 101: goto L13;
            case 102: goto L8;
            case 103: goto L13;
            case 104: goto L7;
            default: goto L13;
        };
    L7:
        s.append(" LOW_POWER");
        goto L13
    L8:
        s.append(" BALANCED");
        goto L13
    L9:
        s.append(" HIGH_ACCURACY");
    L13:
        if (this.mDurationMillis == Long.MAX_VALUE) goto L16;
        s.append(", duration=");
        TimeUtils.formatDuration(this.mDurationMillis, s);
    L16:
        if (this.mMaxUpdates == Integer.MAX_VALUE) goto L19;
        s.append(", maxUpdates=").append(this.mMaxUpdates);
    L19:
        if (this.mMinUpdateIntervalMillis == (-1)) goto L24;
        if (this.mMinUpdateIntervalMillis >= this.mIntervalMillis) goto L24;
        s.append(", minUpdateInterval=");
        TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, s);
    L24:
        if (this.mMinUpdateDistanceMeters <= 0.0d) goto L27;
        s.append(", minUpdateDistance=").append(this.mMinUpdateDistanceMeters);
    L27:
        if ((this.mMaxUpdateDelayMillis / 2) <= this.mIntervalMillis) goto L29;
        s.append(", maxUpdateDelay=");
        TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, s);
    L29:
        s.append(']');
        return s.toString();
    L11:
        s.append("PASSIVE");
        goto L13
    }
}
