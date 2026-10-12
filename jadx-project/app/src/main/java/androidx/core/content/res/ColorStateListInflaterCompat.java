package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R;
import androidx.core.math.MathUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = null;

    static {
        sTempTypedValue = new ThreadLocal();
    }

    private ColorStateListInflaterCompat() {
    }

    public static ColorStateList inflate(Resources resources, int resId, Resources.Theme theme) {
        XmlPullParser parser = resources.getXml(resId);     // Catch: Exception -> L4
        return createFromXml(resources, parser, theme);
    L4:
        e = move-exception;
        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
        return null;
    }

    public static ColorStateList createFromXml(Resources r, XmlPullParser parser, Resources.Theme theme) throws XmlPullParserException, IOException {
        AttributeSet attrs = Xml.asAttributeSet(parser);
    L3:
        int type = parser.next();
        if (type == 2) goto L8;
        if (type != 1) goto L3;
    L8:
        if (type != 2) goto L12;
        return createFromXmlInner(r, parser, attrs, theme);
    L12:
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = parser.getName();
        if (name.equals("selector") == false) goto L7;
        return inflate(r, parser, attrs, theme);
    L7:
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static ColorStateList inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        r = r;
        theme = theme;
        int r4 = 1;
        int innerDepth = parser.getDepth() + 1;
        int[][] stateSpecList = new int[20][];
        int[] colorList = new int[stateSpecList.length];
        int listSize = 0;
        int[] colorList2 = colorList;
        int[][] stateSpecList2 = stateSpecList;
    L3:
        int r0 = parser.next();
        int type = r0;
        if (r0 == r4) goto L59;
        int depth = parser.getDepth();
        if (depth >= innerDepth) goto L12;
        if (type == 3) goto L59;
    L12:
        if (type != 2) goto L57;
        if (depth > innerDepth) goto L57;
        if (parser.getName().equals("item") == false) goto L57;
        TypedArray a = obtainAttributes(r, theme, attrs, R.styleable.ColorStateListItem);
        int resourceId = a.getResourceId(R.styleable.ColorStateListItem_android_color, -1);
        if (resourceId != (-1)) goto L20;
    L26:
        int baseColor = R.styleable.ColorStateListItem_android_color;
        int baseColor2 = a.getColor(baseColor, -65281);
    L27:
        float alphaMod = 1.0f;
        if (a.hasValue(R.styleable.ColorStateListItem_android_alpha) == false) goto L31;
        alphaMod = a.getFloat(R.styleable.ColorStateListItem_android_alpha, 1.0f);
    L34:
        if (Build.VERSION.SDK_INT >= 31) goto L36;
    L38:
        float lStar = a.getFloat(R.styleable.ColorStateListItem_lStar, -1.0f);
    L39:
        a.recycle();
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] stateSpec = new int[numAttrs];
        int i = 0;
    L40:
        if (i >= numAttrs) goto L55;
        int innerDepth2 = innerDepth;
        int stateResId = attrs.getAttributeNameResource(i);
        int type2 = type;
        if (stateResId == 16843173) goto L54;
        if (stateResId == 16843551) goto L54;
        if (stateResId == R.attr.alpha) goto L54;
        if (stateResId == R.attr.lStar) goto L54;
        int j2 = j + 1;
        if (attrs.getAttributeBooleanValue(i, false) == false) goto L52;
        int r9 = stateResId;
    L53:
        stateSpec[j] = r9;
        j = j2;
        goto L54
    L52:
        r9 = -stateResId;
    L54:
        i = i + 1;
        innerDepth = innerDepth2;
        type = type2;
        goto L40
    L55:
        int[] stateSpec2 = StateSet.trimStateSet(stateSpec, j);
        int color = modulateColorAlpha(baseColor2, alphaMod, lStar);
        colorList2 = GrowingArrayUtils.append(colorList2, listSize, color);
        stateSpecList2 = (int[][]) GrowingArrayUtils.append(stateSpecList2, listSize, stateSpec2);
        listSize = listSize + 1;
        innerDepth = innerDepth;
        r4 = 1;
        goto L3
    L36:
        if (a.hasValue(R.styleable.ColorStateListItem_android_lStar) == false) goto L38;
        lStar = a.getFloat(R.styleable.ColorStateListItem_android_lStar, -1.0f);
        goto L39
    L31:
        if (a.hasValue(R.styleable.ColorStateListItem_alpha) == false) goto L34;
        alphaMod = a.getFloat(R.styleable.ColorStateListItem_alpha, 1.0f);
        goto L34
    L20:
        if (isColorInt(r, resourceId) == true) goto L26;
        baseColor2 = createFromXml(r, r.getXml(resourceId), theme).getDefaultColor();     // Catch: Exception -> L23
    L24:
        baseColor2 = a.getColor(R.styleable.ColorStateListItem_android_color, -65281);
    L57:
        innerDepth = innerDepth;
        r4 = 1;
    L59:
        int[] colors = new int[listSize];
        int[][] stateSpecs = new int[listSize][];
        System.arraycopy(colorList2, 0, colors, 0, listSize);
        System.arraycopy(stateSpecList2, 0, stateSpecs, 0, listSize);
        return new ColorStateList(stateSpecs, colors);
    }

    private static boolean isColorInt(Resources r, int resId) {
        TypedValue value = getTypedValue();
        r.getValue(resId, value, true);
        if (value.type >= 28) goto L5;
    L7:
        return false;
    L5:
        if (value.type > 31) goto L7;
        return true;
    }

    private static TypedValue getTypedValue() {
        TypedValue tv = sTempTypedValue.get();
        if (tv != null) goto L6;
        TypedValue tv2 = new TypedValue();
        sTempTypedValue.set(tv2);
        return tv2;
    L6:
        return tv;
    }

    private static TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme != null) goto L5;
        return res.obtainAttributes(set, attrs);
    L5:
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    private static int modulateColorAlpha(int color, float alphaMod, float lStar) {
        if (lStar >= 0.0f) goto L5;
    L7:
        boolean validLStar = false;
    L9:
        if (alphaMod != 1.0f) goto L12;
        if (validLStar == true) goto L12;
        return color;
    L12:
        int baseAlpha = Color.alpha(color);
        int alpha = MathUtils.clamp((int) ((baseAlpha * alphaMod) + 0.5f), 0, 255);
        if (validLStar == false) goto L16;
        CamColor baseCam = CamColor.fromColor(color);
        color = CamColor.toColor(baseCam.getHue(), baseCam.getChroma(), lStar);
    L16:
        return (16777215 & color) | (alpha << 24);
    L5:
        if (lStar > 100.0f) goto L7;
        validLStar = true;
        goto L9
    }
}
