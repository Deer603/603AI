package androidx.core.content;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    private static boolean mimeTypeAgainstFilter(String[] mimeTypeParts, String[] filterParts) {
        if (filterParts.length != 2) goto L25;
        if (filterParts[0].isEmpty() == true) goto L23;
        if (filterParts[1].isEmpty() == true) goto L23;
        if (mimeTypeParts.length == 2) goto L12;
        return false;
    L12:
        if (ProxyConfig.MATCH_ALL_SCHEMES.equals(filterParts[0]) == true) goto L17;
        if (filterParts[0].equals(mimeTypeParts[0]) == true) goto L17;
        return false;
    L17:
        if (ProxyConfig.MATCH_ALL_SCHEMES.equals(filterParts[1]) == false) goto L19;
    L21:
        return true;
    L19:
        if (filterParts[1].equals(mimeTypeParts[1]) == true) goto L21;
        return false;
    L23:
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
    L25:
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }

    public static boolean matches(String mimeType, String filter) {
        if (mimeType != null) goto L5;
        return false;
    L5:
        String[] mimeTypeParts = mimeType.split("/");
        String[] filterParts = filter.split("/");
        return mimeTypeAgainstFilter(mimeTypeParts, filterParts);
    }

    public static String matches(String mimeType, String[] filters) {
        if (mimeType != null) goto L5;
        return null;
    L5:
        String[] mimeTypeParts = mimeType.split("/");
        int r3 = filters.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        String filter = filters[r4];
        String[] filterParts = filter.split("/");
        if (mimeTypeAgainstFilter(mimeTypeParts, filterParts) == true) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return filter;
    L11:
        return null;
    }

    public static String matches(String[] mimeTypes, String filter) {
        if (mimeTypes != null) goto L5;
        return null;
    L5:
        String[] filterParts = filter.split("/");
        int r3 = mimeTypes.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L11;
        String mimeType = mimeTypes[r4];
        String[] mimeTypeParts = mimeType.split("/");
        if (mimeTypeAgainstFilter(mimeTypeParts, filterParts) == true) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return mimeType;
    L11:
        return null;
    }

    public static String[] matchesMany(String[] mimeTypes, String filter) {
        int r0 = 0;
        if (mimeTypes == null) goto L5;
        ArrayList<String> list = new ArrayList();
        String[] filterParts = filter.split("/");
        int r4 = mimeTypes.length;
    L7:
        if (r0 >= r4) goto L13;
        String mimeType = mimeTypes[r0];
        String[] mimeTypeParts = mimeType.split("/");
        if (mimeTypeAgainstFilter(mimeTypeParts, filterParts) == false) goto L11;
        list.add(mimeType);
    L11:
        r0 = r0 + 1;
        goto L7
    L13:
        return (String[]) list.toArray(new String[list.size()]);
    L5:
        return new String[0];
    }
}
