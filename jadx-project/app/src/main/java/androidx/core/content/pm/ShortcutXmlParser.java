package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class ShortcutXmlParser {
    private static final String ATTR_SHORTCUT_ID = "shortcutId";
    private static final Object GET_INSTANCE_LOCK = null;
    private static final String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final String TAG = "ShortcutXmlParser";
    private static final String TAG_SHORTCUT = "shortcut";
    private static volatile ArrayList<String> sShortcutIds;

    static {
        GET_INSTANCE_LOCK = new Object();
    }

    public static List<String> getShortcutIds(Context context) {
        if (sShortcutIds != null) goto L15;
        Object r0 = GET_INSTANCE_LOCK;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (sShortcutIds != null) goto L9;
        sShortcutIds = new ArrayList();     // Catch: Throwable -> L11
        sShortcutIds.addAll(parseShortcutIds(context));     // Catch: Throwable -> L11
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
    L15:
        return sShortcutIds;
    }

    private ShortcutXmlParser() {
    }

    private static Set<String> parseShortcutIds(Context context) {
        Set<String> result = new HashSet();
        Intent mainIntent = new Intent("android.intent.action.MAIN");
        mainIntent.addCategory("android.intent.category.LAUNCHER");
        mainIntent.setPackage(context.getPackageName());
        List<ResolveInfo> resolveInfos = context.getPackageManager().queryIntentActivities(mainIntent, 128);
        if (resolveInfos != null) goto L5;
    L31:
        return result;
    L5:
        if (resolveInfos.size() == 0) goto L31;
        Iterator<ResolveInfo> r3 = resolveInfos.iterator();     // Catch: Exception -> L28
    L9:
        if (r3.hasNext() == false) goto L30;
        ResolveInfo info = r3.next();     // Catch: Exception -> L28
        ActivityInfo activityInfo = info.activityInfo;     // Catch: Exception -> L28
        Bundle metaData = activityInfo.metaData;     // Catch: Exception -> L28
        if (metaData == null) goto L9;
        if (metaData.containsKey(META_DATA_APP_SHORTCUTS) == false) goto L9;
        XmlResourceParser parser = getXmlResourceParser(context, activityInfo);     // Catch: Exception -> L28
        result.addAll(parseShortcutIds(parser));     // Catch: Throwable -> L19
        if (parser == null) goto L9;
        parser.close();     // Catch: Exception -> L28
        goto L9
    L19:
        th = move-exception;
        if (parser != null) goto L32;
    L25:
        throw th;     // Catch: Exception -> L28
    L32:
        parser.close();     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L28
    L30:
        return result;
    L28:
        e = move-exception;
        Log.e(TAG, "Failed to parse the Xml resource: ", e);
        goto L30
    }

    private static XmlResourceParser getXmlResourceParser(Context context, ActivityInfo info) {
        XmlResourceParser parser = info.loadXmlMetaData(context.getPackageManager(), META_DATA_APP_SHORTCUTS);
        if (parser == null) goto L6;
        return parser;
    L6:
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + info.name);
    }

    public static List<String> parseShortcutIds(XmlPullParser parser) throws IOException, XmlPullParserException {
        List<String> result = new ArrayList(1);
    L3:
        int type = parser.next();
        if (type == 1) goto L19;
        if (type == 3) goto L8;
    L9:
        int depth = parser.getDepth();
        String tag = parser.getName();
        if (type != 2) goto L3;
        if (depth != 2) goto L3;
        if (TAG_SHORTCUT.equals(tag) == false) goto L3;
        String shortcutId = getAttributeValue(parser, ATTR_SHORTCUT_ID);
        if (shortcutId == null) goto L3;
        result.add(shortcutId);
        goto L3
    L8:
        if (parser.getDepth() > 0) goto L9;
    L19:
        return result;
    }

    private static String getAttributeValue(XmlPullParser parser, String attribute) {
        String value = parser.getAttributeValue("http://schemas.android.com/apk/res/android", attribute);
        if (value == null) goto L5;
        return value;
    L5:
        return parser.getAttributeValue(null, attribute);
    }
}
