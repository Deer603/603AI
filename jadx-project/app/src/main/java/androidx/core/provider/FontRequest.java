package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(providerAuthority);
        this.mProviderPackage = (String) Preconditions.checkNotNull(providerPackage);
        this.mQuery = (String) Preconditions.checkNotNull(query);
        this.mCertificates = (List) Preconditions.checkNotNull(certificates);
        this.mCertificatesArray = 0;
        this.mIdentifier = createIdentifier(providerAuthority, providerPackage, query);
    }

    public FontRequest(String providerAuthority, String providerPackage, String query, int certificates) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(providerAuthority);
        this.mProviderPackage = (String) Preconditions.checkNotNull(providerPackage);
        this.mQuery = (String) Preconditions.checkNotNull(query);
        this.mCertificates = null;
        if (certificates == 0) goto L5;
        boolean r0 = true;
    L6:
        Preconditions.checkArgument(r0);
        this.mCertificatesArray = certificates;
        this.mIdentifier = createIdentifier(providerAuthority, providerPackage, query);
        return;
    L5:
        r0 = false;
        goto L6
    }

    private String createIdentifier(String providerAuthority, String providerPackage, String query) {
        return providerAuthority + "-" + providerPackage + "-" + query;
    }

    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    public String getQuery() {
        return this.mQuery;
    }

    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @Deprecated
    public String getIdentifier() {
        return this.mIdentifier;
    }

    String getId() {
        return this.mIdentifier;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        int i = 0;
    L4:
        if (i >= this.mCertificates.size()) goto L10;
        builder.append(" [");
        List<byte[]> set = this.mCertificates.get(i);
        int j = 0;
    L7:
        if (j >= set.size()) goto L9;
        builder.append(" \"");
        byte[] array = set.get(j);
        builder.append(Base64.encodeToString(array, 0));
        builder.append("\"");
        j = j + 1;
        goto L7
    L9:
        builder.append(" ]");
        i = i + 1;
        goto L4
    L10:
        builder.append("}");
        builder.append("mCertificatesArray: " + this.mCertificatesArray);
        return builder.toString();
    }
}
