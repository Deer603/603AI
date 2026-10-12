package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.net.MailTo;
import androidx.core.util.PatternsCompat;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkifyCompat {
    private static final Comparator<LinkSpec> COMPARATOR = null;
    private static final String[] EMPTY_STRING = null;

    static class Api24Impl {
        private Api24Impl() {
        }

        static void addLinks(TextView text, Pattern pattern, String defaultScheme, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(text, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        }

        static boolean addLinks(Spannable spannable, Pattern pattern, String defaultScheme, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        }
    }

    private static class LinkSpec {
        int end;
        URLSpan frameworkAddedSpan;
        int start;
        String url;

        LinkSpec() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    static {
        EMPTY_STRING = new String[0];
        COMPARATOR = new LinkifyCompat$$ExternalSyntheticLambda0();
    }

    static /* synthetic */ int lambda$static$0(LinkSpec a, LinkSpec b) {
        if (a.start >= b.start) goto L7;
        return -1;
    L7:
        if (a.start <= b.start) goto L11;
        return 1;
    L11:
        return Integer.compare(b.end, a.end);
    }

    public static boolean addLinks(Spannable text, int mask) {
        if (shouldAddLinksFallbackToFramework() == false) goto L7;
        return Linkify.addLinks(text, mask);
    L7:
        if (mask != 0) goto L9;
        return false;
    L9:
        URLSpan[] old = (URLSpan[]) text.getSpans(0, text.length(), URLSpan.class);
        int i = old.length - 1;
    L10:
        if (i < 0) goto L12;
        text.removeSpan(old[i]);
        i = i - 1;
        goto L10
    L12:
        int i2 = mask & 4;
        if (i2 == 0) goto L15;
        Linkify.addLinks(text, 4);
    L15:
        ArrayList<LinkSpec> links = new ArrayList();
        if ((mask & 1) == 0) goto L18;
        Spannable text2 = text;
        gatherLinks(links, text2, PatternsCompat.AUTOLINK_WEB_URL, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
    L20:
        if ((mask & 2) == 0) goto L23;
        gatherLinks(links, text2, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[]{MailTo.MAILTO_SCHEME}, null, null);
    L23:
        if ((mask & 8) == 0) goto L25;
        gatherMapLinks(links, text2);
    L25:
        pruneOverlaps(links, text2);
        if (links.size() != 0) goto L28;
        return false;
    L28:
        Iterator<LinkSpec> r10 = links.iterator();
    L30:
        if (r10.hasNext() == false) goto L35;
        LinkSpec link = r10.next();
        if (link.frameworkAddedSpan != null) goto L30;
        applyLink(link.url, link.start, link.end, text2);
        goto L30
    L35:
        return true;
    L18:
        text2 = text;
        goto L20
    }

    public static boolean addLinks(TextView text, int mask) {
        if (shouldAddLinksFallbackToFramework() == false) goto L7;
        return Linkify.addLinks(text, mask);
    L7:
        if (mask != 0) goto L9;
        return false;
    L9:
        CharSequence t = text.getText();
        if ((t instanceof Spannable) == true) goto L12;
        SpannableString s = SpannableString.valueOf(t);
        if (addLinks(s, mask) == false) goto L19;
        addLinkMovementMethod(text);
        text.setText(s);
        return true;
    L19:
        return false;
    L12:
        if (addLinks((Spannable) t, mask) == false) goto L19;
        addLinkMovementMethod(text);
        return true;
    }

    public static void addLinks(TextView text, Pattern pattern, String scheme) {
        if (shouldAddLinksFallbackToFramework() == false) goto L6;
        Linkify.addLinks(text, pattern, scheme);
        return;
    L6:
        addLinks(text, pattern, scheme, null, null, null);
    }

    public static void addLinks(TextView text, Pattern pattern, String scheme, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework() == false) goto L6;
        Linkify.addLinks(text, pattern, scheme, matchFilter, transformFilter);
        return;
    L6:
        addLinks(text, pattern, scheme, null, matchFilter, transformFilter);
    }

    public static void addLinks(TextView text, Pattern pattern, String defaultScheme, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework() == false) goto L6;
        Api24Impl.addLinks(text, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        return;
    L6:
        SpannableString spannable = SpannableString.valueOf(text.getText());
        boolean linksAdded = addLinks(spannable, pattern, defaultScheme, schemes, matchFilter, transformFilter);
        if (linksAdded == false) goto L10;
        text.setText(spannable);
        addLinkMovementMethod(text);
        return;
    }

    public static boolean addLinks(Spannable text, Pattern pattern, String scheme) {
        if (shouldAddLinksFallbackToFramework() == false) goto L7;
        return Linkify.addLinks(text, pattern, scheme);
    L7:
        return addLinks(text, pattern, scheme, null, null, null);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String scheme, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework() == false) goto L7;
        return Linkify.addLinks(spannable, pattern, scheme, matchFilter, transformFilter);
    L7:
        return addLinks(spannable, pattern, scheme, null, matchFilter, transformFilter);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String defaultScheme, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (shouldAddLinksFallbackToFramework() == true) goto L5;
        if (defaultScheme != null) goto L9;
        defaultScheme = "";
    L9:
        if (schemes != null) goto L11;
    L12:
        schemes = EMPTY_STRING;
    L13:
        String[] schemesCopy = new String[schemes.length + 1];
        schemesCopy[0] = defaultScheme.toLowerCase(Locale.ROOT);
        int index = 0;
    L15:
        if (index >= schemes.length) goto L21;
        String scheme = schemes[index];
        int r4 = index + 1;
        if (scheme != null) goto L19;
        String r5 = "";
    L20:
        schemesCopy[r4] = r5;
        index = index + 1;
        goto L15
    L19:
        r5 = scheme.toLowerCase(Locale.ROOT);
        goto L20
    L21:
        boolean hasMatches = false;
        Matcher m = pattern.matcher(spannable);
    L23:
        if (m.find() == false) goto L31;
        int start = m.start();
        int end = m.end();
        String match = m.group(0);
        boolean allowed = true;
        if (matchFilter == null) goto L27;
        allowed = matchFilter.acceptMatch(spannable, start, end);
    L27:
        if (allowed == false) goto L23;
        if (match == null) goto L23;
        String url = makeUrl(match, schemesCopy, m, transformFilter);
        applyLink(url, start, end, spannable);
        hasMatches = true;
        goto L23
    L31:
        return hasMatches;
    L11:
        if (schemes.length >= 1) goto L13;
    L5:
        return Api24Impl.addLinks(spannable, pattern, defaultScheme, schemes, matchFilter, transformFilter);
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        return true;
    L5:
        return false;
    }

    private static void addLinkMovementMethod(TextView t) {
        MovementMethod m = t.getMovementMethod();
        if ((m instanceof LinkMovementMethod) == false) goto L5;
        return;
    L5:
        if (t.getLinksClickable() == false) goto L9;
        t.setMovementMethod(LinkMovementMethod.getInstance());
        return;
    }

    private static String makeUrl(String url, String[] prefixes, Matcher matcher, Linkify.TransformFilter filter) {
        if (filter == null) goto L4;
        String url2 = filter.transformUrl(matcher, url);
    L5:
        boolean hasPrefix = false;
        int r6 = prefixes.length;
        int r8 = 0;
    L6:
        if (r8 >= r6) goto L13;
        String prefix = prefixes[r8];
        if (url2.regionMatches(true, 0, prefix, 0, prefix.length()) == true) goto L9;
        r8 = r8 + 1;
        goto L6
    L9:
        hasPrefix = true;
        if (url2.regionMatches(false, 0, prefix, 0, prefix.length()) == true) goto L13;
        url2 = prefix + url2.substring(prefix.length());
    L13:
        if (hasPrefix == false) goto L15;
        return url2;
    L15:
        if (prefixes.length > 0) goto L17;
        return url2;
    L17:
        return prefixes[0] + url2;
    L4:
        url2 = url;
        goto L5
    }

    private static void gatherLinks(ArrayList<LinkSpec> links, Spannable s, Pattern pattern, String[] schemes, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher m = pattern.matcher(s);
    L4:
        if (m.find() == false) goto L12;
        int start = m.start();
        int end = m.end();
        String match = m.group(0);
        if (matchFilter == null) goto L9;
        if (matchFilter.acceptMatch(s, start, end) == false) goto L4;
    L9:
        if (match == null) goto L4;
        LinkSpec spec = new LinkSpec();
        spec.url = makeUrl(match, schemes, m, transformFilter);
        spec.start = start;
        spec.end = end;
        links.add(spec);
        goto L4
    }

    private static void applyLink(String url, int start, int end, Spannable text) {
        URLSpan span = new URLSpan(url);
        text.setSpan(span, start, end, 33);
    }

    private static void gatherMapLinks(ArrayList<LinkSpec> links, Spannable s) {
        String string = s.toString();
        int base = 0;
    L18:
        String address = findAddress(string);     // Catch: UnsupportedOperationException -> L16
        if (address == null) goto L29;
        int start = string.indexOf(address);     // Catch: UnsupportedOperationException -> L16
        if (start < 0) goto L28;
        LinkSpec spec = new LinkSpec();     // Catch: UnsupportedOperationException -> L16
        int length = address.length();     // Catch: UnsupportedOperationException -> L16
        int end = start + length;     // Catch: UnsupportedOperationException -> L16
        spec.start = base + start;     // Catch: UnsupportedOperationException -> L16
        spec.end = base + end;     // Catch: UnsupportedOperationException -> L16
        string = string.substring(end);     // Catch: UnsupportedOperationException -> L16
        base = base + end;
        String encodedAddress = URLEncoder.encode(address, "UTF-8");     // Catch: UnsupportedEncodingException -> L13 UnsupportedOperationException -> L16
        spec.url = "geo:0,0?q=" + encodedAddress;     // Catch: UnsupportedOperationException -> L16
        links.add(spec);     // Catch: UnsupportedOperationException -> L16
    L28:
        return;
    L29:
        return;
    }

    private static String findAddress(String addr) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return WebView.findAddress(addr);
    L7:
        return FindAddress.findAddress(addr);
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> links, Spannable text) {
        int r2 = 0;
        URLSpan[] urlSpans = (URLSpan[]) text.getSpans(0, text.length(), URLSpan.class);
        int r1 = urlSpans.length;
    L3:
        if (r2 >= r1) goto L5;
        URLSpan urlSpan = urlSpans[r2];
        LinkSpec spec = new LinkSpec();
        spec.frameworkAddedSpan = urlSpan;
        spec.start = text.getSpanStart(urlSpan);
        spec.end = text.getSpanEnd(urlSpan);
        links.add(spec);
        r2 = r2 + 1;
        goto L3
    L5:
        Collections.sort(links, COMPARATOR);
        int len = links.size();
        int i = 0;
    L7:
        if (i >= (len - 1)) goto L28;
        LinkSpec a = links.get(i);
        LinkSpec b = links.get(i + 1);
        int remove = -1;
        if (a.start > b.start) goto L27;
        if (a.end <= b.start) goto L27;
        if (b.end > a.end) goto L16;
        remove = i + 1;
    L22:
        if (remove == (-1)) goto L27;
        URLSpan span = links.get(remove).frameworkAddedSpan;
        if (span == null) goto L26;
        text.removeSpan(span);
    L26:
        links.remove(remove);
        len = len - 1;
        goto L7
    L16:
        if ((a.end - a.start) <= (b.end - b.start)) goto L19;
        remove = i + 1;
        goto L22
    L19:
        if ((a.end - a.start) >= (b.end - b.start)) goto L22;
        remove = i;
    L27:
        i = i + 1;
        goto L7
    }

    private LinkifyCompat() {
    }
}
