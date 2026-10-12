package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    public static boolean hasAttribute(XmlPullParser parser, String attrName) {
        if (parser.getAttributeValue(NAMESPACE, attrName) == null) goto L5;
        return true;
    L5:
        return false;
    }

    public static float getNamedFloat(TypedArray a, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L6;
        return defaultValue;
    L6:
        return a.getFloat(resId, defaultValue);
    }

    public static boolean getNamedBoolean(TypedArray a, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L6;
        return defaultValue;
    L6:
        return a.getBoolean(resId, defaultValue);
    }

    public static int getNamedInt(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L6;
        return defaultValue;
    L6:
        return a.getInt(resId, defaultValue);
    }

    public static int getNamedColor(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L6;
        return defaultValue;
    L6:
        return a.getColor(resId, defaultValue);
    }

    public static ComplexColorCompat getNamedComplexColor(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (hasAttribute(parser, attrName) == false) goto L14;
        TypedValue value = new TypedValue();
        a.getValue(resId, value);
        if (value.type >= 28) goto L7;
    L10:
        ComplexColorCompat complexColor = ComplexColorCompat.inflate(a.getResources(), a.getResourceId(resId, 0), theme);
        if (complexColor == null) goto L14;
        return complexColor;
    L7:
        if (value.type > 31) goto L10;
        return ComplexColorCompat.from(value.data);
    L14:
        return ComplexColorCompat.from(defaultValue);
    }

    public static ColorStateList getNamedColorStateList(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId) {
        if (hasAttribute(parser, attrName) == false) goto L16;
        TypedValue value = new TypedValue();
        a.getValue(resId, value);
        if (value.type == 2) goto L15;
        if (value.type < 28) goto L13;
        if (value.type > 31) goto L13;
        return getNamedColorStateListFromInt(value);
    L13:
        return ColorStateListInflaterCompat.inflate(a.getResources(), a.getResourceId(resId, 0), theme);
    L15:
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + resId + ": " + value);
    L16:
        return null;
    }

    private static ColorStateList getNamedColorStateListFromInt(TypedValue value) {
        return ColorStateList.valueOf(value.data);
    }

    public static int getNamedResourceId(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L6;
        return defaultValue;
    L6:
        return a.getResourceId(resId, defaultValue);
    }

    public static String getNamedString(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L7;
        return null;
    L7:
        return a.getString(resId);
    }

    public static TypedValue peekNamedValue(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (hasAttr == true) goto L7;
        return null;
    L7:
        return a.peekValue(resId);
    }

    public static TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme != null) goto L6;
        return res.obtainAttributes(set, attrs);
    L6:
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    public static boolean getBoolean(TypedArray a, int index, int fallbackIndex, boolean defaultValue) {
        boolean val = a.getBoolean(fallbackIndex, defaultValue);
        return a.getBoolean(index, val);
    }

    public static Drawable getDrawable(TypedArray a, int index, int fallbackIndex) {
        Drawable val = a.getDrawable(index);
        if (val == null) goto L5;
        return val;
    L5:
        return a.getDrawable(fallbackIndex);
    }

    public static int getInt(TypedArray a, int index, int fallbackIndex, int defaultValue) {
        int val = a.getInt(fallbackIndex, defaultValue);
        return a.getInt(index, val);
    }

    public static int getResourceId(TypedArray a, int index, int fallbackIndex, int defaultValue) {
        int val = a.getResourceId(fallbackIndex, defaultValue);
        return a.getResourceId(index, val);
    }

    public static String getString(TypedArray a, int index, int fallbackIndex) {
        String val = a.getString(index);
        if (val == null) goto L5;
        return val;
    L5:
        return a.getString(fallbackIndex);
    }

    public static CharSequence getText(TypedArray a, int index, int fallbackIndex) {
        CharSequence val = a.getText(index);
        if (val == null) goto L5;
        return val;
    L5:
        return a.getText(fallbackIndex);
    }

    public static CharSequence[] getTextArray(TypedArray a, int index, int fallbackIndex) {
        CharSequence[] val = a.getTextArray(index);
        if (val == null) goto L5;
        return val;
    L5:
        return a.getTextArray(fallbackIndex);
    }

    public static int getAttr(Context context, int attr, int fallbackAttr) {
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(attr, value, true);
        if (value.resourceId == 0) goto L5;
        return attr;
    L5:
        return fallbackAttr;
    }

    private TypedArrayUtils() {
    }
}
