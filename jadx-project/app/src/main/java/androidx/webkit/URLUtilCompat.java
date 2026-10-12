package androidx.webkit;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class URLUtilCompat {
    private static final Pattern DISPOSITION_PATTERN = null;

    private URLUtilCompat() {
    }

    public static String guessFileName(String url, String contentDisposition, String mimeType) {
        if (contentDisposition == null) goto L7;
        String filename = getFilenameFromContentDisposition(contentDisposition);
        if (filename == null) goto L7;
        return replacePathSeparators(filename);
    L7:
        String filename2 = "downloadfile";
        Uri parsedUri = Uri.parse(url);
        if (parsedUri == null) goto L13;
        String lastPathSegment = parsedUri.getLastPathSegment();
        if (lastPathSegment == null) goto L13;
        filename2 = replacePathSeparators(lastPathSegment);
    L13:
        if (filename2.indexOf(46) >= 0) goto L15;
    L18:
        String extensionFromMimeType = suggestExtensionFromMimeType(mimeType);
        return filename2 + extensionFromMimeType;
    L15:
        if (extensionDifferentFromMimeType(filename2, mimeType) == true) goto L18;
        return filename2;
    }

    private static String replacePathSeparators(String raw) {
        return raw.replaceAll("/", "_");
    }

    private static String suggestExtensionFromMimeType(String mimeType) {
        if (mimeType != null) goto L5;
        return "";
    L5:
        String mimeType2 = mimeType.trim().toLowerCase(Locale.ROOT);
        if (mimeType2.equals("application/octet-stream") == false) goto L8;
        return "";
    L8:
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType2);
        if (extensionFromMimeType != null) goto L11;
        return "";
    L11:
        return "." + extensionFromMimeType;
    }

    private static boolean extensionDifferentFromMimeType(String filename, String mimeType) {
        if (mimeType != null) goto L5;
        return false;
    L5:
        int lastDotIndex = filename.lastIndexOf(46);
        String typeFromExt = MimeTypeMap.getSingleton().getMimeTypeFromExtension(filename.substring(lastDotIndex + 1));
        if (typeFromExt != null) goto L8;
        return false;
    L8:
        if (typeFromExt.equalsIgnoreCase(mimeType) == true) goto L12;
        return true;
    L12:
        return false;
    }

    static {
        DISPOSITION_PATTERN = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);
    }

    public static String getFilenameFromContentDisposition(String contentDisposition) {
        String[] parts = contentDisposition.trim().split(";", 2);
        if (parts.length >= 2) goto L5;
        return null;
    L5:
        String dispositionType = parts[0].trim();
        if ("inline".equalsIgnoreCase(dispositionType) == false) goto L8;
        return null;
    L8:
        String dispositionParameters = parts[1];
        Matcher matcher = DISPOSITION_PATTERN.matcher(dispositionParameters);
        String filename = null;
        String filenameExt = null;
    L10:
        if (matcher.find() == false) goto L28;
        String parameter = matcher.group(1);
        if (matcher.group(2) == null) goto L15;
        String value = removeSlashEscapes(matcher.group(2));
    L18:
        if (parameter == null) goto L10;
        if (value == null) goto L10;
        if ("filename*".equalsIgnoreCase(parameter) == true) goto L23;
        if ("filename".equalsIgnoreCase(parameter) == false) goto L10;
        filename = value;
        goto L10
    L23:
        filenameExt = parseExtValueString(value);
        goto L10
    L15:
        if (matcher.group(3) == null) goto L17;
        value = removeSlashEscapes(matcher.group(3));
        goto L18
    L17:
        value = matcher.group(4);
        goto L18
    L28:
        if (filenameExt == null) goto L30;
        return filenameExt;
    L30:
        return filename;
    }

    private static String removeSlashEscapes(String raw) {
        if (raw != null) goto L6;
        return null;
    L6:
        return raw.replaceAll("\\\\(.)", "$1");
    }

    private static String parseExtValueString(String raw) {
        String[] parts = raw.split("'", 3);
        if (parts.length >= 3) goto L5;
        return null;
    L5:
        String encoding = parts[0];
        String valueChars = parts[2];
        String valueWithEncodedPlus = encodePlusCharacters(valueChars, encoding);     // Catch: UnsupportedEncodingException -> L8 Throwable -> L10
        return URLDecoder.decode(valueWithEncodedPlus, encoding);
    L11:
        return null;
    }

    private static String encodePlusCharacters(String valueChars, String encoding) {
        Charset charset = Charset.forName(encoding);
        StringBuilder sb = new StringBuilder();
        byte[] r2 = charset.encode("+").array();
        int r3 = r2.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L6;
        byte b = r2[r4];
        sb.append(String.format("%02x", new Object[]{Byte.valueOf(b)}));
        r4 = r4 + 1;
        goto L3
    L6:
        return valueChars.replaceAll("\\+", sb.toString());
    }
}
