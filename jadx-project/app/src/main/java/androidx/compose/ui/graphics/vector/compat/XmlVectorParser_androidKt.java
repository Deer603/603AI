package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a*\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0000\u001a\f\u0010\"\u001a\u00020#*\u00020$H\u0000\u001a2\u0010%\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH\u0000\u001a<\u0010(\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0001H\u0000\u001a2\u0010*\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH\u0000\u001a2\u0010+\u001a\u00020&*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020\u001aH\u0000\u001a\f\u0010,\u001a\u00020$*\u00020$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"FILL_TYPE_WINDING", "", "LINECAP_BUTT", "LINECAP_ROUND", "LINECAP_SQUARE", "LINEJOIN_BEVEL", "LINEJOIN_MITER", "LINEJOIN_ROUND", "SHAPE_CLIP_PATH", "", "SHAPE_GROUP", "SHAPE_PATH", "getStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "id", "defValue", "getStrokeLineCap-CSYIeUk", "(II)I", "getStrokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeLineJoin-kLtJ_vA", "obtainBrushFromComplexColor", "Landroidx/compose/ui/graphics/Brush;", "complexColor", "Landroidx/core/content/res/ComplexColorCompat;", "createVectorImageBuilder", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "res", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "attrs", "Landroid/util/AttributeSet;", "isAtEnd", "", "Lorg/xmlpull/v1/XmlPullParser;", "parseClipPath", "", "builder", "parseCurrentVectorNode", "nestedGroups", "parseGroup", "parsePath", "seekToStartTag", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    static {
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    static /* synthetic */ int m5085getStrokeLineCapCSYIeUk$default(int r0, int r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = StrokeCap.Companion.m4719getButtKaPHkGw();
    L6:
        return m5084getStrokeLineCapCSYIeUk(r0, r1);
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m5084getStrokeLineCapCSYIeUk(int id, int defValue) {
        switch(id) {
            case 0: goto L7;
            case 1: goto L10;
            case 2: goto L9;
            default: goto L8;
        };
    L8:
        return defValue;
    L9:
        return StrokeCap.Companion.m4721getSquareKaPHkGw();
    L10:
        return StrokeCap.Companion.m4720getRoundKaPHkGw();
    L7:
        return StrokeCap.Companion.m4719getButtKaPHkGw();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    static /* synthetic */ int m5087getStrokeLineJoinkLtJ_vA$default(int r0, int r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = StrokeJoin.Companion.m4730getMiterLxFBmk8();
    L6:
        return m5086getStrokeLineJoinkLtJ_vA(r0, r1);
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m5086getStrokeLineJoinkLtJ_vA(int id, int defValue) {
        switch(id) {
            case 0: goto L7;
            case 1: goto L10;
            case 2: goto L9;
            default: goto L8;
        };
    L8:
        return defValue;
    L9:
        return StrokeJoin.Companion.m4729getBevelLxFBmk8();
    L10:
        return StrokeJoin.Companion.m4731getRoundLxFBmk8();
    L7:
        return StrokeJoin.Companion.m4730getMiterLxFBmk8();
    }

    public static final boolean isAtEnd(XmlPullParser $this$isAtEnd) {
        if ($this$isAtEnd.getEventType() != 1) goto L5;
        return true;
    L5:
        if ($this$isAtEnd.getDepth() < 1) goto L7;
    L9:
        return false;
    L7:
        if ($this$isAtEnd.getEventType() != 3) goto L9;
        return true;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser r6, Resources r7, AttributeSet r8, Resources.Theme r9, ImageVector.Builder r10, int r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        Resources.Theme r3 = null;
    L7:
        return parseCurrentVectorNode(r6, r7, r8, r3, r10, r11);
    L5:
        r3 = r9;
        goto L7
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser $this$parseCurrentVectorNode, Resources res, AttributeSet attrs, Resources.Theme theme, ImageVector.Builder builder, int nestedGroups) {
        switch($this$parseCurrentVectorNode.getXmlParser().getEventType()) {
            case 2: goto L11;
            case 3: goto L6;
            default: goto L30;
        };
    L11:
        String r0 = $this$parseCurrentVectorNode.getXmlParser().getName();
        if (r0 == null) goto L30;
        switch(r0.hashCode()) {
            case -1649314686: goto L25;
            case 3433509: goto L21;
            case 98629247: goto L17;
            default: goto L30;
        };
    L17:
        if (r0.equals(SHAPE_GROUP) == false) goto L30;
        parseGroup($this$parseCurrentVectorNode, res, theme, attrs, builder);
        goto L30
    L21:
        if (r0.equals(SHAPE_PATH) == false) goto L30;
        parsePath($this$parseCurrentVectorNode, res, theme, attrs, builder);
        goto L30
    L25:
        if (r0.equals(SHAPE_CLIP_PATH) == false) goto L30;
        parseClipPath($this$parseCurrentVectorNode, res, theme, attrs, builder);
        return nestedGroups + 1;
    L30:
        return nestedGroups;
    L6:
        if (Intrinsics.areEqual(SHAPE_GROUP, $this$parseCurrentVectorNode.getXmlParser().getName()) == false) goto L30;
        int r1 = nestedGroups + 1;
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L10;
        builder.clearGroup();
        r2 = r2 + 1;
        goto L8
    L10:
        return 0;
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser $this$seekToStartTag) throws XmlPullParserException {
        int type = $this$seekToStartTag.next();
    L4:
        if (type == 2) goto L8;
        if (type == 1) goto L8;
        type = $this$seekToStartTag.next();
    L8:
        if (type != 2) goto L11;
        return $this$seekToStartTag;
    L11:
        throw new XmlPullParserException("No start tag found");
    }

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser $this$createVectorImageBuilder, Resources res, Resources.Theme theme, AttributeSet attrs) {
        TypedArray vectorAttrs = $this$createVectorImageBuilder.obtainAttributes(res, theme, attrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean autoMirror = $this$createVectorImageBuilder.getNamedBoolean(vectorAttrs, "autoMirrored", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float viewportWidth = $this$createVectorImageBuilder.getNamedFloat(vectorAttrs, "viewportWidth", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float viewportHeight = $this$createVectorImageBuilder.getNamedFloat(vectorAttrs, "viewportHeight", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (viewportWidth <= 0.0f) goto L32;
        if (viewportHeight <= 0.0f) goto L30;
        float defaultWidth = $this$createVectorImageBuilder.getDimension(vectorAttrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float defaultHeight = $this$createVectorImageBuilder.getDimension(vectorAttrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (vectorAttrs.hasValue(AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT()) == false) goto L15;
        TypedValue value = new TypedValue();
        vectorAttrs.getValue(AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), value);
        if (value.type != 2) goto L11;
        long tintColor = Color.Companion.m4402getUnspecified0d7_KjU();
    L16:
        int blendModeValue = $this$createVectorImageBuilder.getInt(vectorAttrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (blendModeValue == (-1)) goto L26;
        switch(blendModeValue) {
            case 3: goto L25;
            case 5: goto L24;
            case 9: goto L23;
            case 14: goto L22;
            case 15: goto L21;
            case 16: goto L20;
            default: goto L19;
        };
    L19:
        int tintBlendMode = BlendMode.Companion.m4306getSrcIn0nO6VwU();
    L27:
        float $this$dp$iv = defaultWidth / res.getDisplayMetrics().density;
        float defaultWidthDp = Dp.m6973constructorimpl($this$dp$iv);
        float $this$dp$iv2 = defaultHeight / res.getDisplayMetrics().density;
        float defaultHeightDp = Dp.m6973constructorimpl($this$dp$iv2);
        vectorAttrs.recycle();
        return new ImageVector.Builder(null, defaultWidthDp, defaultHeightDp, viewportWidth, viewportHeight, tintColor, tintBlendMode, autoMirror, 1, null);
    L20:
        tintBlendMode = BlendMode.Companion.m4300getPlus0nO6VwU();
        goto L27
    L21:
        tintBlendMode = BlendMode.Companion.m4302getScreen0nO6VwU();
        goto L27
    L22:
        tintBlendMode = BlendMode.Companion.m4297getModulate0nO6VwU();
        goto L27
    L23:
        tintBlendMode = BlendMode.Companion.m4305getSrcAtop0nO6VwU();
        goto L27
    L24:
        tintBlendMode = BlendMode.Companion.m4306getSrcIn0nO6VwU();
        goto L27
    L25:
        tintBlendMode = BlendMode.Companion.m4308getSrcOver0nO6VwU();
        goto L27
    L26:
        tintBlendMode = BlendMode.Companion.m4306getSrcIn0nO6VwU();
        goto L27
    L11:
        ColorStateList tintColorStateList = $this$createVectorImageBuilder.getNamedColorStateList(vectorAttrs, theme, "tint", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
        if (tintColorStateList == null) goto L14;
        tintColor = ColorKt.Color(tintColorStateList.getDefaultColor());
        goto L16
    L14:
        tintColor = Color.Companion.m4402getUnspecified0d7_KjU();
        goto L16
    L15:
        tintColor = Color.Companion.m4402getUnspecified0d7_KjU();
        goto L16
    L30:
        throw new XmlPullParserException(vectorAttrs.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
    L32:
        throw new XmlPullParserException(vectorAttrs.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    }

    public static final void parsePath(AndroidVectorParser $this$parsePath, Resources res, Resources.Theme theme, AttributeSet attrs, ImageVector.Builder builder) throws IllegalArgumentException {
        TypedArray a = $this$parsePath.obtainAttributes(res, theme, attrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        boolean hasPathData = TypedArrayUtils.hasAttribute($this$parsePath.getXmlParser(), "pathData");
        if (hasPathData == false) goto L18;
        String r3 = $this$parsePath.getString(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (r3 != null) goto L7;
        r3 = "";
    L7:
        String name = r3;
        String pathStr = $this$parsePath.getString(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        if (pathStr != null) goto L10;
        List<PathNode> r10 = VectorKt.getEmptyPath();
    L11:
        ComplexColorCompat fillColor = $this$parsePath.getNamedComplexColor(a, theme, "fillColor", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float fillAlpha = $this$parsePath.getNamedFloat(a, "fillAlpha", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int lineCap = $this$parsePath.getNamedInt(a, "strokeLineCap", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1);
        int strokeLineCap = m5084getStrokeLineCapCSYIeUk(lineCap, StrokeCap.Companion.m4719getButtKaPHkGw());
        int lineJoin = $this$parsePath.getNamedInt(a, "strokeLineJoin", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1);
        int strokeLineJoin = m5086getStrokeLineJoinkLtJ_vA(lineJoin, StrokeJoin.Companion.m4729getBevelLxFBmk8());
        float strokeMiterLimit = $this$parsePath.getNamedFloat(a, "strokeMiterLimit", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat strokeColor = $this$parsePath.getNamedComplexColor(a, theme, "strokeColor", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float strokeAlpha = $this$parsePath.getNamedFloat(a, "strokeAlpha", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float strokeLineWidth = $this$parsePath.getNamedFloat(a, "strokeWidth", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float trimPathEnd = $this$parsePath.getNamedFloat(a, "trimPathEnd", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float trimPathOffset = $this$parsePath.getNamedFloat(a, "trimPathOffset", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float trimPathStart = $this$parsePath.getNamedFloat(a, "trimPathStart", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int fillRule = $this$parsePath.getNamedInt(a, "fillType", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        a.recycle();
        Brush fillBrush = obtainBrushFromComplexColor(fillColor);
        Brush strokeBrush = obtainBrushFromComplexColor(strokeColor);
        PathFillType.Companion r11 = PathFillType.Companion;
        if (fillRule != 0) goto L14;
        int fillPathType = r11.m4649getNonZeroRgk1Os();
    L15:
        builder.m5052addPathoIyEayM(r10, fillPathType, name, fillBrush, fillAlpha, strokeBrush, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeMiterLimit, trimPathStart, trimPathEnd, trimPathOffset);
        return;
    L14:
        fillPathType = r11.m4648getEvenOddRgk1Os();
        goto L15
    L10:
        r10 = PathParser.pathStringToNodes$default($this$parsePath.pathParser, pathStr, null, 2, null);
        goto L11
    L18:
        throw new IllegalArgumentException("No path data available");
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColor) {
        if (complexColor.willDraw() == false) goto L11;
        Shader shader = complexColor.getShader();
        if (shader == null) goto L10;
        return BrushKt.ShaderBrush(shader);
    L10:
        return new SolidColor(ColorKt.Color(complexColor.getColor()), null);
    L11:
        return null;
    }

    public static final void parseClipPath(AndroidVectorParser $this$parseClipPath, Resources res, Resources.Theme theme, AttributeSet attrs, ImageVector.Builder builder) {
        TypedArray a = $this$parseClipPath.obtainAttributes(res, theme, attrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String r5 = $this$parseClipPath.getString(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (r5 != null) goto L5;
        r5 = "";
    L5:
        String name = r5;
        String pathStr = $this$parseClipPath.getString(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        if (pathStr != null) goto L8;
        ArrayList r6 = VectorKt.getEmptyPath();
    L9:
        List pathData = r6;
        a.recycle();
        ImageVector.Builder.addGroup$default(builder, name, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pathData, 254, null);
        return;
    L8:
        r6 = PathParser.pathStringToNodes$default($this$parseClipPath.pathParser, pathStr, null, 2, null);
        goto L9
    }

    public static final void parseGroup(AndroidVectorParser $this$parseGroup, Resources res, Resources.Theme theme, AttributeSet attrs, ImageVector.Builder builder) {
        TypedArray a = $this$parseGroup.obtainAttributes(res, theme, attrs, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float rotate = $this$parseGroup.getNamedFloat(a, "rotation", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float pivotX = $this$parseGroup.getFloat(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float pivotY = $this$parseGroup.getFloat(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float scaleX = $this$parseGroup.getNamedFloat(a, "scaleX", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float scaleY = $this$parseGroup.getNamedFloat(a, "scaleY", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float translateX = $this$parseGroup.getNamedFloat(a, "translateX", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float translateY = $this$parseGroup.getNamedFloat(a, "translateY", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String r5 = $this$parseGroup.getString(a, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (r5 != null) goto L5;
        r5 = "";
    L5:
        String name = r5;
        a.recycle();
        builder.addGroup(name, rotate, pivotX, pivotY, scaleX, scaleY, translateX, translateY, VectorKt.getEmptyPath());
    }
}
