package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelUtils {
    private static final String INNER_BUNDLE_KEY = "a";

    private ParcelUtils() {
    }

    public static Parcelable toParcelable(VersionedParcelable obj) {
        return new ParcelImpl(obj);
    }

    public static <T extends VersionedParcelable> T fromParcelable(Parcelable r2) {
        if ((r2 instanceof ParcelImpl) == false) goto L7;
        return (T) ((ParcelImpl) r2).getVersionedParcel();
    L7:
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static void toOutputStream(VersionedParcelable obj, OutputStream output) {
        VersionedParcelStream stream = new VersionedParcelStream(null, output);
        stream.writeVersionedParcelable(obj);
        stream.closeField();
    }

    public static <T extends VersionedParcelable> T fromInputStream(InputStream r2) {
        return (T) new VersionedParcelStream(r2, null).readVersionedParcelable();
    }

    public static void putVersionedParcelable(Bundle b, String key, VersionedParcelable obj) {
        if (obj != null) goto L4;
        return;
    L4:
        Bundle innerBundle = new Bundle();
        innerBundle.putParcelable(INNER_BUNDLE_KEY, toParcelable(obj));
        b.putParcelable(key, innerBundle);
    }

    public static <T extends VersionedParcelable> T getVersionedParcelable(Bundle r3, String r4) {
        Bundle r1 = (Bundle) r3.getParcelable(r4);     // Catch: RuntimeException -> L8
        if (r1 != null) goto L6;
        return null;
    L6:
        r1.setClassLoader(ParcelUtils.class.getClassLoader());     // Catch: RuntimeException -> L8
        return (T) fromParcelable(r1.getParcelable(INNER_BUNDLE_KEY));
    L9:
        return null;
    }

    public static void putVersionedParcelableList(Bundle b, String key, List<? extends VersionedParcelable> list) {
        Bundle innerBundle = new Bundle();
        ArrayList<Parcelable> toWrite = new ArrayList();
        Iterator<? extends VersionedParcelable> r2 = list.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        VersionedParcelable obj = r2.next();
        toWrite.add(toParcelable(obj));
        goto L4
    L6:
        innerBundle.putParcelableArrayList(INNER_BUNDLE_KEY, toWrite);
        b.putParcelable(key, innerBundle);
    }

    public static <T extends VersionedParcelable> List<T> getVersionedParcelableList(Bundle bundle, String key) {
        ArrayList r0 = new ArrayList();
        Bundle innerBundle = (Bundle) bundle.getParcelable(key);     // Catch: RuntimeException -> L9
        innerBundle.setClassLoader(ParcelUtils.class.getClassLoader());     // Catch: RuntimeException -> L9
        ArrayList<Parcelable> parcelableArrayList = innerBundle.getParcelableArrayList(INNER_BUNDLE_KEY);     // Catch: RuntimeException -> L9
        Iterator<Parcelable> r3 = parcelableArrayList.iterator();     // Catch: RuntimeException -> L9
    L5:
        if (r3.hasNext() == false) goto L8;
        Parcelable parcelable = r3.next();     // Catch: RuntimeException -> L9
        r0.add(fromParcelable(parcelable));     // Catch: RuntimeException -> L9
    L8:
        return r0;
    L10:
        return null;
    }
}
