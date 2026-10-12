package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,BY\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010*\u001a\u00020\u0013H\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b!\u0010\u001cR\u0019\u0010\f\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", HintConstants.AUTOFILL_HINT_NAME, "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "root", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "autoMirror", "", "genId", "", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoMirror", "()Z", "getDefaultHeight-D9Ej5fM", "()F", "F", "getDefaultWidth-D9Ej5fM", "getGenId$ui_release", "()I", "getName", "()Ljava/lang/String;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", "getTintBlendMode-0nO6VwU", "I", "getTintColor-0d7_KjU", "()J", "J", "getViewportHeight", "getViewportWidth", "equals", "other", "hashCode", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static int imageVectorCount;
    private static final Object lock = null;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001DBE\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eBM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011Jf\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J¤\u0001\u0010)\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020\u0000J\b\u0010@\u001a\u00020AH\u0002J\f\u0010B\u001a\u00020C*\u00020\u0013H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0019j\b\u0012\u0004\u0012\u00020\u0013`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001cR\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", HintConstants.AUTOFILL_HINT_NAME, "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoMirror", "", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "currentGroup", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "getCurrentGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "F", "isConsumed", "nodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "root", "I", "J", "addGroup", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "addPath", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "clearGroup", "ensureNotConsumed", "", "asVectorGroup", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "GroupParams", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 0;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        /* JADX INFO: compiled from: ImageVector.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0002\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 ¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", HintConstants.AUTOFILL_HINT_NAME, "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getClipPathData", "setClipPathData", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPivotX", "()F", "setPivotX", "(F)V", "getPivotY", "setPivotY", "getRotate", "setRotate", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                String r1 = null;
                float r2 = 0.0f;
                float r3 = 0.0f;
                float r4 = 0.0f;
                float r5 = 0.0f;
                float r6 = 0.0f;
                float r7 = 0.0f;
                float r8 = 0.0f;
                List r9 = null;
                List r10 = null;
                this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
            }

            public GroupParams(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends PathNode> r9, List<VectorNode> r10) {
                this.name = name;
                this.rotate = rotate;
                this.pivotX = pivotX;
                this.pivotY = pivotY;
                this.scaleX = scaleX;
                this.scaleY = scaleY;
                this.translationX = translationX;
                this.translationY = translationY;
                this.clipPathData = r9;
                this.children = r10;
            }

            public /* synthetic */ GroupParams(String r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, List r11, List r12, int r13, DefaultConstructorMarker r14) {
                if ((r13 & 1) == 0) goto L6;
                r3 = "";
            L6:
                if ((r13 & 2) == 0) goto L9;
                r4 = 0.0f;
            L9:
                if ((r13 & 4) == 0) goto L12;
                r5 = 0.0f;
            L12:
                if ((r13 & 8) == 0) goto L15;
                r6 = 0.0f;
            L15:
                if ((r13 & 16) == 0) goto L18;
                r7 = 1.0f;
            L18:
                if ((r13 & 32) == 0) goto L21;
                r8 = 1.0f;
            L21:
                if ((r13 & 64) == 0) goto L24;
                r9 = 0.0f;
            L24:
                if ((r13 & 128) == 0) goto L27;
                r10 = 0.0f;
            L27:
                if ((r13 & 256) == 0) goto L30;
                r11 = VectorKt.getEmptyPath();
            L30:
                if ((r13 & 512) == 0) goto L32;
                List r15 = new ArrayList();
            L33:
                float r16 = r10;
                List r17 = r11;
                float r18 = r8;
                float r19 = r9;
                float r20 = r7;
                float r21 = r5;
                String r22 = r3;
                this(r22, r4, r21, r6, r20, r18, r19, r16, r17, r15);
                return;
            L32:
                r15 = r12;
                goto L33
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String r1) {
                this.name = r1;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final void setRotate(float r1) {
                this.rotate = r1;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final void setPivotX(float r1) {
                this.pivotX = r1;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final void setPivotY(float r1) {
                this.pivotY = r1;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final void setScaleX(float r1) {
                this.scaleX = r1;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final void setScaleY(float r1) {
                this.scaleY = r1;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final void setTranslationX(float r1) {
                this.translationX = r1;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setTranslationY(float r1) {
                this.translationY = r1;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final void setClipPathData(List<? extends PathNode> r1) {
                this.clipPathData = r1;
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final void setChildren(List<VectorNode> r1) {
                this.children = r1;
            }
        }

        static {
            $stable = 8;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @ReplaceWith(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ Builder(String r1, float r2, float r3, float r4, float r5, long r6, int r8, DefaultConstructorMarker r9) {
            this(r1, r2, r3, r4, r5, r6, r8);
        }

        public /* synthetic */ Builder(String r1, float r2, float r3, float r4, float r5, long r6, int r8, boolean r9, DefaultConstructorMarker r10) {
            this(r1, r2, r3, r4, r5, r6, r8, r9);
        }

        private Builder(String name, float defaultWidth, float defaultHeight, float viewportWidth, float viewportHeight, long tintColor, int tintBlendMode, boolean autoMirror) {
            this.name = name;
            this.defaultWidth = defaultWidth;
            this.defaultHeight = defaultHeight;
            this.viewportWidth = viewportWidth;
            this.viewportHeight = viewportHeight;
            this.tintColor = tintColor;
            this.tintBlendMode = tintBlendMode;
            this.autoMirror = autoMirror;
            this.nodes = new ArrayList();
            String r12 = null;
            float r13 = 0.0f;
            float r14 = 0.0f;
            float r15 = 0.0f;
            float r16 = 0.0f;
            float r17 = 0.0f;
            float r18 = 0.0f;
            float r19 = 0.0f;
            List r20 = null;
            List r21 = null;
            this.root = new GroupParams(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, 1023, null);
            ImageVectorKt.access$push(this.nodes, this.root);
        }

        public /* synthetic */ Builder(String r12, float r13, float r14, float r15, float r16, long r17, int r19, boolean r20, int r21, DefaultConstructorMarker r22) {
            if ((r21 & 1) == 0) goto L5;
            String r1 = "";
        L7:
            if ((r21 & 32) == 0) goto L9;
            long r6 = Color.Companion.m4402getUnspecified0d7_KjU();
        L11:
            if ((r21 & 64) == 0) goto L13;
            int r8 = BlendMode.Companion.m4306getSrcIn0nO6VwU();
        L15:
            if ((r21 & 128) == 0) goto L17;
            boolean r9 = false;
        L18:
            this(r1, r13, r14, r15, r16, r6, r8, r9, null);
            return;
        L17:
            r9 = r20;
            goto L18
        L13:
            r8 = r19;
            goto L15
        L9:
            r6 = r17;
            goto L11
        L5:
            r1 = r12;
            goto L7
        }

        public /* synthetic */ Builder(String r11, float r12, float r13, float r14, float r15, long r16, int r18, int r19, DefaultConstructorMarker r20) {
            if ((r19 & 1) == 0) goto L5;
            String r1 = "";
        L7:
            if ((r19 & 32) == 0) goto L9;
            long r6 = Color.Companion.m4402getUnspecified0d7_KjU();
        L11:
            if ((r19 & 64) == 0) goto L13;
            int r8 = BlendMode.Companion.m4306getSrcIn0nO6VwU();
        L14:
            this(r1, r12, r13, r14, r15, r6, r8, null);
            return;
        L13:
            r8 = r18;
            goto L14
        L9:
            r6 = r16;
            goto L11
        L5:
            r1 = r11;
            goto L7
        }

        private Builder(String name, float defaultWidth, float defaultHeight, float viewportWidth, float viewportHeight, long tintColor, int tintBlendMode) {
            this(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false, null);
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.access$peek(this.nodes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addGroup$default(Builder r2, String r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, List r11, int r12, Object r13) {
            if ((r12 & 1) == 0) goto L6;
            r3 = "";
        L6:
            if ((r12 & 2) == 0) goto L9;
            r4 = 0.0f;
        L9:
            if ((r12 & 4) == 0) goto L12;
            r5 = 0.0f;
        L12:
            if ((r12 & 8) == 0) goto L15;
            r6 = 0.0f;
        L15:
            if ((r12 & 16) == 0) goto L18;
            r7 = 1.0f;
        L18:
            if ((r12 & 32) == 0) goto L21;
            r8 = 1.0f;
        L21:
            if ((r12 & 64) == 0) goto L24;
            r9 = 0.0f;
        L24:
            if ((r12 & 128) == 0) goto L27;
            r10 = 0.0f;
        L27:
            if ((r12 & 256) == 0) goto L29;
            List r14 = VectorKt.getEmptyPath();
        L30:
            float r15 = r9;
            float r16 = r10;
            float r17 = r7;
            float r18 = r8;
            return r2.addGroup(r3, r4, r5, r6, r17, r18, r15, r16, r14);
        L29:
            r14 = r11;
            goto L30
        }

        public final Builder addGroup(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends PathNode> r22) {
            ensureNotConsumed();
            List r10 = null;
            GroupParams group = new GroupParams(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, r22, r10, 512, null);
            ImageVectorKt.access$push(this.nodes, group);
            return this;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            GroupParams popped = (GroupParams) ImageVectorKt.access$pop(this.nodes);
            getCurrentGroup().getChildren().add(asVectorGroup(popped));
            return this;
        }

        /* JADX INFO: renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m5051addPathoIyEayM$default(Builder r15, List r16, int r17, String r18, Brush r19, float r20, Brush r21, float r22, float r23, int r24, int r25, float r26, float r27, float r28, float r29, int r30, Object r31) {
            if ((r30 & 2) == 0) goto L5;
            int r1 = VectorKt.getDefaultFillType();
        L7:
            if ((r30 & 4) == 0) goto L9;
            String r2 = "";
        L10:
            Brush r4 = null;
            if ((r30 & 8) == 0) goto L13;
            Brush r3 = null;
        L14:
            float r6 = 1.0f;
            if ((r30 & 16) == 0) goto L17;
            float r5 = 1.0f;
        L19:
            if ((r30 & 32) != 0) goto L23;
            r4 = r21;
        L23:
            if ((r30 & 64) == 0) goto L25;
            float r7 = 1.0f;
        L26:
            float r9 = 0.0f;
            if ((r30 & 128) == 0) goto L29;
            float r8 = 0.0f;
        L31:
            if ((r30 & 256) == 0) goto L33;
            int r10 = VectorKt.getDefaultStrokeLineCap();
        L35:
            if ((r30 & 512) == 0) goto L37;
            int r11 = VectorKt.getDefaultStrokeLineJoin();
        L39:
            if ((r30 & 1024) == 0) goto L41;
            float r12 = 4.0f;
        L43:
            if ((r30 & 2048) == 0) goto L45;
            float r13 = 0.0f;
        L47:
            if ((r30 & 4096) != 0) goto L51;
            r6 = r28;
        L51:
            if ((r30 & 8192) != 0) goto L55;
            r9 = r29;
        L55:
            return r15.m5052addPathoIyEayM(r16, r1, r2, r3, r5, r4, r7, r8, r10, r11, r12, r13, r6, r9);
        L45:
            r13 = r27;
            goto L47
        L41:
            r12 = r26;
            goto L43
        L37:
            r11 = r25;
            goto L39
        L33:
            r10 = r24;
            goto L35
        L29:
            r8 = r23;
            goto L31
        L25:
            r7 = r22;
            goto L26
        L17:
            r5 = r20;
            goto L19
        L13:
            r3 = r19;
            goto L14
        L9:
            r2 = r18;
            goto L10
        L5:
            r1 = r17;
            goto L7
        }

        /* JADX INFO: renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m5052addPathoIyEayM(List<? extends PathNode> r18, int pathFillType, String name, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(name, r18, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
        L4:
            if (this.nodes.size() <= 1) goto L6;
            clearGroup();
            goto L4
        L6:
            int r14 = 0;
            ImageVector vectorImage = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, r14, 512, null);
            this.isConsumed = true;
            return vectorImage;
        }

        private final void ensureNotConsumed() {
            boolean value$iv = !this.isConsumed;
            if (value$iv == true) goto L7;
            InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            return;
        }

        private final VectorGroup asVectorGroup(GroupParams $this$asVectorGroup) {
            return new VectorGroup($this$asVectorGroup.getName(), $this$asVectorGroup.getRotate(), $this$asVectorGroup.getPivotX(), $this$asVectorGroup.getPivotY(), $this$asVectorGroup.getScaleX(), $this$asVectorGroup.getScaleY(), $this$asVectorGroup.getTranslationX(), $this$asVectorGroup.getTranslationY(), $this$asVectorGroup.getClipPathData(), $this$asVectorGroup.getChildren());
        }
    }

    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "()V", "imageVectorCount", "", "lock", "generateImageVectorId", "generateImageVectorId$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final int generateImageVectorId$ui_release() {
            Object lock$iv = ImageVector.access$getLock$cp();
            monitor-enter(lock$iv);
            Companion r3 = ImageVector.Companion;     // Catch: Throwable -> L8
            int r4 = ImageVector.access$getImageVectorCount$cp();     // Catch: Throwable -> L8
            ImageVector.access$setImageVectorCount$cp(r4 + 1);     // Catch: Throwable -> L8
            monitor-exit(lock$iv);
            return r4;
        L8:
            th = move-exception;
            throw th;
        }
    }

    public /* synthetic */ ImageVector(String r1, float r2, float r3, float r4, float r5, VectorGroup r6, long r7, int r9, boolean r10, int r11, DefaultConstructorMarker r12) {
        this(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11);
    }

    private ImageVector(String name, float defaultWidth, float defaultHeight, float viewportWidth, float viewportHeight, VectorGroup root, long tintColor, int tintBlendMode, boolean autoMirror, int genId) {
        this.name = name;
        this.defaultWidth = defaultWidth;
        this.defaultHeight = defaultHeight;
        this.viewportWidth = viewportWidth;
        this.viewportHeight = viewportHeight;
        this.root = root;
        this.tintColor = tintColor;
        this.tintBlendMode = tintBlendMode;
        this.autoMirror = autoMirror;
        this.genId = genId;
    }

    public static final /* synthetic */ int access$getImageVectorCount$cp() {
        return imageVectorCount;
    }

    public static final /* synthetic */ Object access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ void access$setImageVectorCount$cp(int r0) {
        imageVectorCount = r0;
    }

    public /* synthetic */ ImageVector(String r15, float r16, float r17, float r18, float r19, VectorGroup r20, long r21, int r23, boolean r24, int r25, int r26, DefaultConstructorMarker r27) {
        if ((r26 & 512) == 0) goto L5;
        int r12 = Companion.generateImageVectorId$ui_release();
    L6:
        this(r15, r16, r17, r18, r19, r20, r21, r23, r24, r12, null);
        return;
    L5:
        r12 = r25;
        goto L6
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m5048getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    /* JADX INFO: renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m5047getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m5050getTintColor0d7_KjU() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5049getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    public final int getGenId$ui_release() {
        return this.genId;
    }

    static {
        Companion = new Companion(null);
        Object ref$iv = Companion;
        if (ref$iv != null) goto L5;
        ref$iv = new Object();
    L5:
        lock = ref$iv;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ImageVector) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.name, ((ImageVector) other).name) == true) goto L12;
        return false;
    L12:
        if (Dp.m6978equalsimpl0(this.defaultWidth, ((ImageVector) other).defaultWidth) == true) goto L15;
        return false;
    L15:
        if (Dp.m6978equalsimpl0(this.defaultHeight, ((ImageVector) other).defaultHeight) == true) goto L18;
        return false;
    L18:
        if (this.viewportWidth != ((ImageVector) other).viewportWidth) goto L20;
        boolean r1 = true;
    L21:
        if (r1 == true) goto L24;
        return false;
    L24:
        if (this.viewportHeight != ((ImageVector) other).viewportHeight) goto L26;
        boolean r2 = true;
    L27:
        if (r2 == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.root, ((ImageVector) other).root) == true) goto L33;
        return false;
    L33:
        if (Color.m4367equalsimpl0(this.tintColor, ((ImageVector) other).tintColor) == true) goto L36;
        return false;
    L36:
        if (BlendMode.m4277equalsimpl0(this.tintBlendMode, ((ImageVector) other).tintBlendMode) == true) goto L39;
        return false;
    L39:
        if (this.autoMirror == ((ImageVector) other).autoMirror) goto L41;
        return false;
    L41:
        return true;
    L26:
        r2 = false;
        goto L27
    L20:
        r1 = false;
        goto L21
    }

    public int hashCode() {
        int result = this.name.hashCode();
        int result2 = (result * 31) + Dp.m6979hashCodeimpl(this.defaultWidth);
        return (((((((((((((result2 * 31) + Dp.m6979hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m4373hashCodeimpl(this.tintColor)) * 31) + BlendMode.m4278hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }
}
