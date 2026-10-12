package androidx.webkit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class UserAgentMetadata {
    public static final int BITNESS_DEFAULT = 0;
    private final String mArchitecture;
    private int mBitness;
    private final List<BrandVersion> mBrandVersionList;
    private final String mFullVersion;
    private boolean mMobile;
    private final String mModel;
    private final String mPlatform;
    private final String mPlatformVersion;
    private boolean mWow64;

    /* JADX INFO: renamed from: androidx.webkit.UserAgentMetadata$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class BrandVersion {
        private final String mBrand;
        private final String mFullVersion;
        private final String mMajorVersion;

        public static final class Builder {
            private String mBrand;
            private String mFullVersion;
            private String mMajorVersion;

            public Builder() {
            }

            public Builder(BrandVersion brandVersion) {
                this.mBrand = brandVersion.getBrand();
                this.mMajorVersion = brandVersion.getMajorVersion();
                this.mFullVersion = brandVersion.getFullVersion();
            }

            public BrandVersion build() {
                if (this.mBrand == null) goto L17;
                if (this.mBrand.trim().isEmpty() == true) goto L17;
                if (this.mMajorVersion == null) goto L17;
                if (this.mMajorVersion.trim().isEmpty() == true) goto L17;
                if (this.mFullVersion == null) goto L17;
                if (this.mFullVersion.trim().isEmpty() == true) goto L17;
                return new BrandVersion(this.mBrand, this.mMajorVersion, this.mFullVersion, null);
            L17:
                throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
            }

            public Builder setBrand(String brand) {
                if (brand.trim().isEmpty() == true) goto L7;
                this.mBrand = brand;
                return this;
            L7:
                throw new IllegalArgumentException("Brand should not be blank.");
            }

            public Builder setMajorVersion(String majorVersion) {
                if (majorVersion.trim().isEmpty() == true) goto L7;
                this.mMajorVersion = majorVersion;
                return this;
            L7:
                throw new IllegalArgumentException("MajorVersion should not be blank.");
            }

            public Builder setFullVersion(String fullVersion) {
                if (fullVersion.trim().isEmpty() == true) goto L7;
                this.mFullVersion = fullVersion;
                return this;
            L7:
                throw new IllegalArgumentException("FullVersion should not be blank.");
            }
        }

        /* synthetic */ BrandVersion(String x0, String x1, String x2, AnonymousClass1 x3) {
            this(x0, x1, x2);
        }

        private BrandVersion(String brand, String majorVersion, String fullVersion) {
            this.mBrand = brand;
            this.mMajorVersion = majorVersion;
            this.mFullVersion = fullVersion;
        }

        public String getBrand() {
            return this.mBrand;
        }

        public String getMajorVersion() {
            return this.mMajorVersion;
        }

        public String getFullVersion() {
            return this.mFullVersion;
        }

        public String toString() {
            return this.mBrand + "," + this.mMajorVersion + "," + this.mFullVersion;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if ((o instanceof BrandVersion) == true) goto L8;
            return false;
        L8:
            BrandVersion that = (BrandVersion) o;
            if (Objects.equals(this.mBrand, that.mBrand) == false) goto L16;
            if (Objects.equals(this.mMajorVersion, that.mMajorVersion) == false) goto L16;
            if (Objects.equals(this.mFullVersion, that.mFullVersion) == false) goto L16;
            return true;
        L16:
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.mBrand, this.mMajorVersion, this.mFullVersion});
        }
    }

    public static final class Builder {
        private String mArchitecture;
        private int mBitness;
        private List<BrandVersion> mBrandVersionList;
        private String mFullVersion;
        private boolean mMobile;
        private String mModel;
        private String mPlatform;
        private String mPlatformVersion;
        private boolean mWow64;

        public Builder() {
            this.mBrandVersionList = new ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
        }

        public Builder(UserAgentMetadata uaMetadata) {
            this.mBrandVersionList = new ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
            this.mBrandVersionList = uaMetadata.getBrandVersionList();
            this.mFullVersion = uaMetadata.getFullVersion();
            this.mPlatform = uaMetadata.getPlatform();
            this.mPlatformVersion = uaMetadata.getPlatformVersion();
            this.mArchitecture = uaMetadata.getArchitecture();
            this.mModel = uaMetadata.getModel();
            this.mMobile = uaMetadata.isMobile();
            this.mBitness = uaMetadata.getBitness();
            this.mWow64 = uaMetadata.isWow64();
        }

        public UserAgentMetadata build() {
            return new UserAgentMetadata(this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, this.mMobile, this.mBitness, this.mWow64, null);
        }

        public Builder setBrandVersionList(List<BrandVersion> brandVersions) {
            this.mBrandVersionList = brandVersions;
            return this;
        }

        public Builder setFullVersion(String fullVersion) {
            if (fullVersion != null) goto L6;
            this.mFullVersion = null;
            return this;
        L6:
            if (fullVersion.trim().isEmpty() == true) goto L10;
            this.mFullVersion = fullVersion;
            return this;
        L10:
            throw new IllegalArgumentException("Full version should not be blank.");
        }

        public Builder setPlatform(String platform) {
            if (platform != null) goto L6;
            this.mPlatform = null;
            return this;
        L6:
            if (platform.trim().isEmpty() == true) goto L10;
            this.mPlatform = platform;
            return this;
        L10:
            throw new IllegalArgumentException("Platform should not be blank.");
        }

        public Builder setPlatformVersion(String platformVersion) {
            this.mPlatformVersion = platformVersion;
            return this;
        }

        public Builder setArchitecture(String architecture) {
            this.mArchitecture = architecture;
            return this;
        }

        public Builder setModel(String model) {
            this.mModel = model;
            return this;
        }

        public Builder setMobile(boolean mobile) {
            this.mMobile = mobile;
            return this;
        }

        public Builder setBitness(int bitness) {
            this.mBitness = bitness;
            return this;
        }

        public Builder setWow64(boolean wow64) {
            this.mWow64 = wow64;
            return this;
        }
    }

    /* synthetic */ UserAgentMetadata(List x0, String x1, String x2, String x3, String x4, String x5, boolean x6, int x7, boolean x8, AnonymousClass1 x9) {
        this(x0, x1, x2, x3, x4, x5, x6, x7, x8);
    }

    private UserAgentMetadata(List<BrandVersion> brandVersionList, String fullVersion, String platform, String platformVersion, String architecture, String model, boolean mobile, int bitness, boolean wow64) {
        this.mMobile = true;
        this.mBitness = 0;
        this.mWow64 = false;
        this.mBrandVersionList = brandVersionList;
        this.mFullVersion = fullVersion;
        this.mPlatform = platform;
        this.mPlatformVersion = platformVersion;
        this.mArchitecture = architecture;
        this.mModel = model;
        this.mMobile = mobile;
        this.mBitness = bitness;
        this.mWow64 = wow64;
    }

    public List<BrandVersion> getBrandVersionList() {
        return this.mBrandVersionList;
    }

    public String getFullVersion() {
        return this.mFullVersion;
    }

    public String getPlatform() {
        return this.mPlatform;
    }

    public String getPlatformVersion() {
        return this.mPlatformVersion;
    }

    public String getArchitecture() {
        return this.mArchitecture;
    }

    public String getModel() {
        return this.mModel;
    }

    public boolean isMobile() {
        return this.mMobile;
    }

    public int getBitness() {
        return this.mBitness;
    }

    public boolean isWow64() {
        return this.mWow64;
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof UserAgentMetadata) == true) goto L8;
        return false;
    L8:
        UserAgentMetadata that = (UserAgentMetadata) o;
        if (this.mMobile != that.mMobile) goto L28;
        if (this.mBitness != that.mBitness) goto L28;
        if (this.mWow64 != that.mWow64) goto L28;
        if (Objects.equals(this.mBrandVersionList, that.mBrandVersionList) == false) goto L28;
        if (Objects.equals(this.mFullVersion, that.mFullVersion) == false) goto L28;
        if (Objects.equals(this.mPlatform, that.mPlatform) == false) goto L28;
        if (Objects.equals(this.mPlatformVersion, that.mPlatformVersion) == false) goto L28;
        if (Objects.equals(this.mArchitecture, that.mArchitecture) == false) goto L28;
        if (Objects.equals(this.mModel, that.mModel) == false) goto L28;
        return true;
    L28:
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, Boolean.valueOf(this.mMobile), Integer.valueOf(this.mBitness), Boolean.valueOf(this.mWow64)});
    }
}
