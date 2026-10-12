package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class LocusIdCompat {
    private final String mId;
    private final LocusId mWrapped;

    private static class Api29Impl {
        private Api29Impl() {
        }

        static LocusId create(String id) {
            return new LocusId(id);
        }

        static String getId(LocusId obj) {
            return obj.getId();
        }
    }

    public LocusIdCompat(String id) {
        this.mId = (String) Preconditions.checkStringNotEmpty(id, "id cannot be empty");
        if (Build.VERSION.SDK_INT < 29) goto L5;
        this.mWrapped = Api29Impl.create(id);
        return;
    L5:
        this.mWrapped = null;
    }

    public String getId() {
        return this.mId;
    }

    public int hashCode() {
        int r2 = 1 * 31;
        if (this.mId != null) goto L5;
        int r3 = 0;
    L6:
        int result = r2 + r3;
        return result;
    L5:
        r3 = this.mId.hashCode();
        goto L6
    }

    public boolean equals(Object obj) {
        if (this != obj) goto L6;
        return true;
    L6:
        if (obj != null) goto L9;
        return false;
    L9:
        if (getClass() == obj.getClass()) goto L11;
        return false;
    L11:
        LocusIdCompat other = (LocusIdCompat) obj;
        if (this.mId != null) goto L19;
        if (other.mId != null) goto L17;
        return true;
    L17:
        return false;
    L19:
        return this.mId.equals(other.mId);
    }

    public String toString() {
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }

    public LocusId toLocusId() {
        return this.mWrapped;
    }

    public static LocusIdCompat toLocusIdCompat(LocusId locusId) {
        Preconditions.checkNotNull(locusId, "locusId cannot be null");
        return new LocusIdCompat((String) Preconditions.checkStringNotEmpty(Api29Impl.getId(locusId), "id cannot be empty"));
    }

    private String getSanitizedId() {
        int size = this.mId.length();
        return size + "_chars";
    }
}
