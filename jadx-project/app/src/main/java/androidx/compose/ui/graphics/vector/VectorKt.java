package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a(\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-H\u0086\b\u001a\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020%0$2\b\u0010/\u001a\u0004\u0018\u00010\u0006\u001a\u001e\u00100\u001a\u000201*\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u000e\u00105\u001a\u000201*\u0004\u0018\u000106H\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0013\u0010\u0011\u001a\u00020\u0012¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0013\u0010\u0003\"\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0016\u001a\u00020\u0017¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0018\u0010\u0003\"\u0013\u0010\u0019\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\"\u000e\u0010\u001e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"DefaultFillType", "Landroidx/compose/ui/graphics/PathFillType;", "getDefaultFillType", "()I", "I", "DefaultGroupName", "", "DefaultPathName", "DefaultPivotX", "", "DefaultPivotY", "DefaultRotation", "DefaultScaleX", "DefaultScaleY", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultStrokeLineCap", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultStrokeLineJoin", "DefaultStrokeLineMiter", "DefaultStrokeLineWidth", "DefaultTintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTintBlendMode", "DefaultTintColor", "Landroidx/compose/ui/graphics/Color;", "getDefaultTintColor", "()J", "J", "DefaultTranslationX", "DefaultTranslationY", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "DefaultTrimPathStart", "EmptyPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "getEmptyPath", "()Ljava/util/List;", "PathData", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "addPathNodes", "pathStr", "rgbEqual", "", "other", "rgbEqual--OWjLjI", "(JJ)Z", "tintableWithAlphaMask", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorKt {
    private static final int DefaultFillType = 0;
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    private static final int DefaultStrokeLineCap = 0;
    private static final int DefaultStrokeLineJoin = 0;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    private static final int DefaultTintBlendMode = 0;
    private static final long DefaultTintColor = 0;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = null;

    static {
        EmptyPath = CollectionsKt.emptyList();
        DefaultStrokeLineCap = StrokeCap.Companion.m4719getButtKaPHkGw();
        DefaultStrokeLineJoin = StrokeJoin.Companion.m4730getMiterLxFBmk8();
        DefaultTintBlendMode = BlendMode.Companion.m4306getSrcIn0nO6VwU();
        DefaultTintColor = Color.Companion.m4401getTransparent0d7_KjU();
        DefaultFillType = PathFillType.Companion.m4649getNonZeroRgk1Os();
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final List<PathNode> PathData(Function1<? super PathBuilder, Unit> r3) {
        PathBuilder $this$PathData_u24lambda_u240 = new PathBuilder();
        r3.invoke($this$PathData_u24lambda_u240);
        return $this$PathData_u24lambda_u240.getNodes();
    }

    public static final List<PathNode> addPathNodes(String pathStr) {
        if (pathStr != null) goto L5;
        return EmptyPath;
    L5:
        return new PathParser().parsePathString(pathStr).toNodes();
    }

    /* JADX INFO: renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m5068rgbEqualOWjLjI(long $this$rgbEqual_u2d_u2dOWjLjI, long other) {
        if (Color.m4372getRedimpl($this$rgbEqual_u2d_u2dOWjLjI) != Color.m4372getRedimpl(other)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L19;
        if (Color.m4371getGreenimpl($this$rgbEqual_u2d_u2dOWjLjI) != Color.m4371getGreenimpl(other)) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L19;
        if (Color.m4369getBlueimpl($this$rgbEqual_u2d_u2dOWjLjI) != Color.m4369getBlueimpl(other)) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L19;
        return true;
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L19:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final boolean tintableWithAlphaMask(ColorFilter $this$tintableWithAlphaMask) {
        if (($this$tintableWithAlphaMask instanceof BlendModeColorFilter) == true) goto L5;
        if ($this$tintableWithAlphaMask != null) goto L13;
        return true;
    L13:
        return false;
    L5:
        if (BlendMode.m4277equalsimpl0(((BlendModeColorFilter) $this$tintableWithAlphaMask).m4310getBlendMode0nO6VwU(), BlendMode.Companion.m4306getSrcIn0nO6VwU()) == false) goto L7;
        return true;
    L7:
        if (BlendMode.m4277equalsimpl0(((BlendModeColorFilter) $this$tintableWithAlphaMask).m4310getBlendMode0nO6VwU(), BlendMode.Companion.m4308getSrcOver0nO6VwU()) == false) goto L15;
        return true;
    L15:
        return false;
    }
}
