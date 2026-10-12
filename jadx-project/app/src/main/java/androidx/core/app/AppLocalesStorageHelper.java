package androidx.core.app;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";
    private static final Object sAppLocaleStorageSync = null;

    static {
        sAppLocaleStorageSync = new Object();
    }

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006c: IF  (r2 I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('fis' java.io.FileInputStream)]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:46:0x0074 (LINE:94), block:B:41:0x006c */
    public static String readLocales(Context context) {
        Object r0 = sAppLocaleStorageSync;
        monitor-enter(r0);
        String appLocales = "";
        FileInputStream fis = context.openFileInput(APPLICATION_LOCALES_RECORD_FILE);     // Catch: FileNotFoundException -> L47 Throwable -> L50
        goto L49
    L59:
        XmlPullParser parser = Xml.newPullParser();     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
        parser.setInput(fis, "UTF-8");     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
        int outerDepth = parser.getDepth();     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
    L7:
        int type = parser.next();     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
        if (type == 1) goto L22;
        if (type == 3) goto L12;
    L13:
        if (type == 3) goto L7;
        if (type == 4) goto L7;
        String tagName = parser.getName();     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
        if (tagName.equals(LOCALE_RECORD_FILE_TAG) == false) goto L7;
        appLocales = parser.getAttributeValue(null, LOCALE_RECORD_ATTRIBUTE_TAG);     // Catch: Throwable -> L27 IOException -> L29 Throwable -> L31
        goto L22
    L12:
        if (parser.getDepth() > outerDepth) goto L13;
    L22:
        if (fis == null) goto L36;
    L57:
        fis.close();     // Catch: IOException -> L25 Throwable -> L50
    L36:
        if (appLocales.isEmpty() == false) goto L39;
        context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);     // Catch: Throwable -> L50
    L39:
        monitor-exit(r0);     // Catch: Throwable -> L50
        return appLocales;
    L32:
        Log.w(TAG, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L27
        if (fis == null) goto L36;
    L50:
        th = move-exception;
        throw th;
    L27:
        th = move-exception;
        if (fis != null) goto L55;
    L46:
        throw th;     // Catch: Throwable -> L50
    L55:
        fis.close();     // Catch: IOException -> L44 Throwable -> L50
    L49:
        return "";
    }

    public static void persistLocales(Context context, String locales) {
        Object r0 = sAppLocaleStorageSync;
        monitor-enter(r0);
    L36:
        fnfe = move-exception;
        throw fnfe;
    L5:
        if (locales.equals("") == false) goto L41;
        context.deleteFile(APPLICATION_LOCALES_RECORD_FILE);     // Catch: Throwable -> L36
        monitor-exit(r0);     // Catch: Throwable -> L36
        return;
    L41:
        FileOutputStream fos = context.openFileOutput(APPLICATION_LOCALES_RECORD_FILE, 0);     // Catch: FileNotFoundException -> L32 Throwable -> L36
        XmlSerializer serializer = Xml.newSerializer();     // Catch: Throwable -> L36
        serializer.setOutput(fos, null);     // Catch: Throwable -> L15 Exception -> L17
        serializer.startDocument("UTF-8", true);     // Catch: Throwable -> L15 Exception -> L17
        serializer.startTag(null, LOCALE_RECORD_FILE_TAG);     // Catch: Throwable -> L15 Exception -> L17
        serializer.attribute(null, LOCALE_RECORD_ATTRIBUTE_TAG, locales);     // Catch: Throwable -> L15 Exception -> L17
        serializer.endTag(null, LOCALE_RECORD_FILE_TAG);     // Catch: Throwable -> L15 Exception -> L17
        serializer.endDocument();     // Catch: Throwable -> L15 Exception -> L17
        if (fos != null) goto L44;
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L36
        return;
    L44:
        fos.close();     // Catch: IOException -> L22 Throwable -> L36
        goto L24
    L15:
        th = move-exception;
        if (fos != null) goto L47;
    L31:
        throw th;     // Catch: Throwable -> L36
    L47:
        fos.close();     // Catch: IOException -> L29 Throwable -> L36
    L17:
        e = move-exception;
        Log.w(TAG, "Storing App Locales : Failed to persist app-locales in storage ", e);     // Catch: Throwable -> L15
        if (fos == null) goto L24;
    L33:
        Log.w(TAG, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{APPLICATION_LOCALES_RECORD_FILE}));     // Catch: Throwable -> L36
    }
}
