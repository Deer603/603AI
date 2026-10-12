package androidx.core.net;

import android.net.Uri;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class MailTo {
    private static final String BCC = "bcc";
    private static final String BODY = "body";
    private static final String CC = "cc";
    private static final String MAILTO = "mailto";
    public static final String MAILTO_SCHEME = "mailto:";
    private static final String SUBJECT = "subject";
    private static final String TO = "to";
    private HashMap<String, String> mHeaders;

    private MailTo() {
        this.mHeaders = new HashMap();
    }

    public static boolean isMailTo(String uri) {
        if (uri != null) goto L4;
    L6:
        return false;
    L4:
        if (uri.startsWith(MAILTO_SCHEME) == false) goto L6;
        return true;
    }

    public static boolean isMailTo(Uri uri) {
        if (uri != null) goto L4;
    L6:
        return false;
    L4:
        if (MAILTO.equals(uri.getScheme()) == false) goto L6;
        return true;
    }

    public static MailTo parse(String uri) throws ParseException {
        Preconditions.checkNotNull(uri);
        if (isMailTo(uri) == false) goto L30;
        int fragmentIndex = uri.indexOf(35);
        if (fragmentIndex == (-1)) goto L7;
        uri = uri.substring(0, fragmentIndex);
    L7:
        int queryIndex = uri.indexOf(63);
        if (queryIndex != (-1)) goto L10;
        String address = Uri.decode(uri.substring(MAILTO_SCHEME.length()));
        String query = null;
    L11:
        MailTo mailTo = new MailTo();
        if (query == null) goto L24;
        String[] queries = query.split("&");
        int r7 = queries.length;
        int r8 = 0;
    L14:
        if (r8 >= r7) goto L24;
        String queryParameter = queries[r8];
        String[] nameValueArray = queryParameter.split("=", 2);
        if (nameValueArray.length == 0) goto L23;
        String queryParameterKey = Uri.decode(nameValueArray[0]).toLowerCase(Locale.ROOT);
        if (nameValueArray.length <= 1) goto L21;
        String queryParameterValue = Uri.decode(nameValueArray[1]);
    L22:
        mailTo.mHeaders.put(queryParameterKey, queryParameterValue);
        goto L23
    L21:
        queryParameterValue = null;
    L23:
        r8 = r8 + 1;
    L24:
        String toParameter = mailTo.getTo();
        if (toParameter == null) goto L27;
        address = address + ", " + toParameter;
    L27:
        mailTo.mHeaders.put(TO, address);
        return mailTo;
    L10:
        address = Uri.decode(uri.substring(MAILTO_SCHEME.length(), queryIndex));
        query = uri.substring(queryIndex + 1);
        goto L11
    L30:
        throw new ParseException("Not a mailto scheme");
    }

    public static MailTo parse(Uri uri) throws ParseException {
        return parse(uri.toString());
    }

    public String getTo() {
        return this.mHeaders.get(TO);
    }

    public String getCc() {
        return this.mHeaders.get(CC);
    }

    public String getBcc() {
        return this.mHeaders.get(BCC);
    }

    public String getSubject() {
        return this.mHeaders.get(SUBJECT);
    }

    public String getBody() {
        return this.mHeaders.get(BODY);
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(MAILTO_SCHEME);
        sb.append('?');
        Iterator<Map.Entry<String, String>> r1 = this.mHeaders.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        Map.Entry<String, String> header = r1.next();
        sb.append(Uri.encode(header.getKey()));
        sb.append('=');
        sb.append(Uri.encode(header.getValue()));
        sb.append(Typography.amp);
        goto L4
    L7:
        return sb.toString();
    }
}
