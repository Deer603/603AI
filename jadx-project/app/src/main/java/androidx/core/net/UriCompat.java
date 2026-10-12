package androidx.core.net;

import android.net.Uri;
import androidx.webkit.ProxyConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class UriCompat {
    private UriCompat() {
    }

    public static String toSafeString(Uri uri) {
        String scheme = uri.getScheme();
        String ssp = uri.getSchemeSpecificPart();
        if (scheme != null) goto L5;
    L49:
        StringBuilder builder = new StringBuilder(64);
        if (scheme == null) goto L52;
        builder.append(scheme);
        builder.append(':');
    L52:
        if (ssp == null) goto L55;
        builder.append(ssp);
    L55:
        return builder.toString();
    L5:
        if (scheme.equalsIgnoreCase("tel") == false) goto L7;
    L33:
        StringBuilder builder2 = new StringBuilder(64);
        builder2.append(scheme);
        builder2.append(':');
        if (ssp == null) goto L48;
        int i = 0;
    L37:
        if (i >= ssp.length()) goto L48;
        char c = ssp.charAt(i);
        if (c == '-') goto L45;
        if (c == '@') goto L45;
        if (c == '.') goto L45;
        builder2.append('x');
    L46:
        i = i + 1;
    L45:
        builder2.append(c);
    L48:
        return builder2.toString();
    L7:
        if (scheme.equalsIgnoreCase("sip") == true) goto L33;
        if (scheme.equalsIgnoreCase("sms") == true) goto L33;
        if (scheme.equalsIgnoreCase("smsto") == true) goto L33;
        if (scheme.equalsIgnoreCase("mailto") == true) goto L33;
        if (scheme.equalsIgnoreCase("nfc") == true) goto L33;
        if (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTP) == false) goto L20;
    L25:
        StringBuilder r4 = new StringBuilder().append("//");
        String r6 = "";
        if (uri.getHost() == null) goto L28;
        String r5 = uri.getHost();
    L29:
        StringBuilder r7 = r4.append(r5);
        if (uri.getPort() == (-1)) goto L32;
        r6 = ":" + uri.getPort();
    L32:
        ssp = r7.append(r6).append("/...").toString();
        goto L49
    L28:
        r5 = "";
        goto L29
    L20:
        if (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS) == true) goto L25;
        if (scheme.equalsIgnoreCase("ftp") == true) goto L25;
        if (scheme.equalsIgnoreCase("rtsp") == false) goto L49;
        goto L25
    }
}
