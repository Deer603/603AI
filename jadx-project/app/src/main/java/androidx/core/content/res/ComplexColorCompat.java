package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, int color) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = color;
    }

    static ComplexColorCompat from(Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    static ComplexColorCompat from(ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    static ComplexColorCompat from(int color) {
        return new ComplexColorCompat(null, null, color);
    }

    public Shader getShader() {
        return this.mShader;
    }

    public int getColor() {
        return this.mColor;
    }

    public void setColor(int color) {
        this.mColor = color;
    }

    public boolean isGradient() {
        if (this.mShader == null) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isStateful() {
        if (this.mShader == null) goto L5;
    L9:
        return false;
    L5:
        if (this.mColorStateList == null) goto L9;
        if (this.mColorStateList.isStateful() == false) goto L9;
        return true;
    }

    public boolean onStateChanged(int[] stateSet) {
        if (isStateful() == false) goto L8;
        int colorForState = this.mColorStateList.getColorForState(stateSet, this.mColorStateList.getDefaultColor());
        if (colorForState == this.mColor) goto L9;
        this.mColor = colorForState;
        return true;
    L9:
        return false;
    L8:
        return false;
    }

    public boolean willDraw() {
        if (isGradient() == false) goto L5;
    L8:
        return true;
    L5:
        if (this.mColor != 0) goto L8;
        return false;
    }

    public static ComplexColorCompat inflate(Resources resources, int resId, Resources.Theme theme) {
        return createFromXml(resources, resId, theme);
    L4:
        e = move-exception;
        Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
        return null;
    }

    private static ComplexColorCompat createFromXml(Resources resources, int resId, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser parser = resources.getXml(resId);
        AttributeSet attrs = Xml.asAttributeSet(parser);
    L3:
        int type = parser.next();
        byte r4 = 1;
        if (type == 2) goto L7;
        if (type != 1) goto L3;
    L7:
        if (type != 2) goto L26;
        String name = parser.getName();
        switch(name.hashCode()) {
            case 89650992: goto L15;
            case 1191572447: goto L12;
            default: goto L17;
        };
    L17:
        r4 = -1;
    L18:
        switch(r4) {
            case 0: goto L24;
            case 1: goto L22;
            default: goto L20;
        };
    L20:
        throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
    L22:
        return from(GradientColorInflaterCompat.createFromXmlInner(resources, parser, attrs, theme));
    L24:
        return from(ColorStateListInflaterCompat.createFromXmlInner(resources, parser, attrs, theme));
    L12:
        if (name.equals("selector") == false) goto L17;
        r4 = 0;
        goto L18
    L15:
        if (name.equals("gradient") == false) goto L17;
    L26:
        throw new XmlPullParserException("No start tag found");
    }
}
