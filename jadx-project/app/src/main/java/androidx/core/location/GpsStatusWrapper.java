package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.core.util.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class GpsStatusWrapper extends GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;
    private Iterator<GpsSatellite> mCachedIterator;
    private int mCachedIteratorPosition;
    private GpsSatellite mCachedSatellite;
    private int mCachedSatelliteCount;
    private final GpsStatus mWrapped;

    GpsStatusWrapper(GpsStatus gpsStatus) {
        this.mWrapped = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mCachedSatelliteCount = -1;
        this.mCachedIterator = this.mWrapped.getSatellites().iterator();
        this.mCachedIteratorPosition = -1;
        this.mCachedSatellite = null;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        GpsStatus r0 = this.mWrapped;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.mCachedSatelliteCount != (-1)) goto L11;
        Iterator<GpsSatellite> r1 = this.mWrapped.getSatellites().iterator();     // Catch: Throwable -> L14
    L8:
        if (r1.hasNext() == false) goto L10;
        GpsSatellite r2 = r1.next();     // Catch: Throwable -> L14
        this.mCachedSatelliteCount++;     // Catch: Throwable -> L14
        goto L8
    L10:
        this.mCachedSatelliteCount++;     // Catch: Throwable -> L14
    L11:
        int r3 = this.mCachedSatelliteCount;     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        return r3;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int satelliteIndex) {
        return getConstellationFromPrn(getSatellite(satelliteIndex).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int satelliteIndex) {
        return getSvidFromPrn(getSatellite(satelliteIndex).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int satelliteIndex) {
        return getSatellite(satelliteIndex).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int satelliteIndex) {
        return getSatellite(satelliteIndex).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int satelliteIndex) {
        return getSatellite(satelliteIndex).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int satelliteIndex) {
        return getSatellite(satelliteIndex).hasEphemeris();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int satelliteIndex) {
        return getSatellite(satelliteIndex).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int satelliteIndex) {
        return getSatellite(satelliteIndex).usedInFix();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int satelliteIndex) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int satelliteIndex) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int satelliteIndex) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int satelliteIndex) {
        throw new UnsupportedOperationException();
    }

    private GpsSatellite getSatellite(int satelliteIndex) {
        GpsStatus r0 = this.mWrapped;
        monitor-enter(r0);
    L17:
        th = move-exception;
        throw th;
    L5:
        if (satelliteIndex >= this.mCachedIteratorPosition) goto L8;
        this.mCachedIterator = this.mWrapped.getSatellites().iterator();     // Catch: Throwable -> L17
        this.mCachedIteratorPosition = -1;     // Catch: Throwable -> L17
    L8:
        if (this.mCachedIteratorPosition >= satelliteIndex) goto L13;
        this.mCachedIteratorPosition++;     // Catch: Throwable -> L17
        if (this.mCachedIterator.hasNext() == false) goto L11;
        this.mCachedSatellite = this.mCachedIterator.next();     // Catch: Throwable -> L17
        goto L8
    L11:
        this.mCachedSatellite = null;     // Catch: Throwable -> L17
    L13:
        GpsSatellite satellite = this.mCachedSatellite;     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        return (GpsSatellite) Preconditions.checkNotNull(satellite);
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof GpsStatusWrapper) == true) goto L9;
        return false;
    L9:
        GpsStatusWrapper that = (GpsStatusWrapper) o;
        return this.mWrapped.equals(that.mWrapped);
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    private static int getConstellationFromPrn(int prn) {
        if (prn <= 0) goto L8;
        if (prn > 32) goto L8;
        return 1;
    L8:
        if (prn < 33) goto L12;
        if (prn > 64) goto L12;
        return 2;
    L12:
        if (prn <= 64) goto L18;
        if (prn > 88) goto L18;
        return 3;
    L18:
        if (prn <= 200) goto L24;
        if (prn > 235) goto L24;
        return 5;
    L24:
        if (prn < QZSS_SVID_MIN) goto L28;
        if (prn > 200) goto L30;
        return 4;
    L30:
        return 0;
    L28:
        return 0;
    }

    private static int getSvidFromPrn(int prn) {
        switch(getConstellationFromPrn(prn)) {
            case 2: goto L8;
            case 3: goto L10;
            case 4: goto L11;
            case 5: goto L9;
            default: goto L11;
        };
    L11:
        return prn;
    L9:
        return prn - 200;
    L10:
        return prn - 64;
    L8:
        return prn + 87;
    }
}
