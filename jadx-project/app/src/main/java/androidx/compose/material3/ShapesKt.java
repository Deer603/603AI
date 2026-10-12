package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\u0014\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\f\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/Shapes;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "bottom", "Landroidx/compose/foundation/shape/CornerBasedShape;", "end", "fromToken", "start", "top", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = null;

    /* JADX INFO: compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ShapeKeyTokens.values().length];
            r0[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L38:
            r0[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L50:
            r0[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L54:
            r0[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L40:
            r0[ShapeKeyTokens.CornerFull.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L44:
            r0[ShapeKeyTokens.CornerLarge.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L58:
            r0[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L42:
            r0[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L46:
            r0[ShapeKeyTokens.CornerMedium.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L48:
            r0[ShapeKeyTokens.CornerNone.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L56:
            r0[ShapeKeyTokens.CornerSmall.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L36:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final CornerBasedShape top(CornerBasedShape $this$top) {
        CornerSize r5 = CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d));
        return CornerBasedShape.copy$default($this$top, null, null, CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), r5, 3, null);
    }

    public static final CornerBasedShape bottom(CornerBasedShape $this$bottom) {
        return CornerBasedShape.copy$default($this$bottom, CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), null, null, 12, null);
    }

    public static final CornerBasedShape start(CornerBasedShape $this$start) {
        return CornerBasedShape.copy$default($this$start, null, CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), null, 9, null);
    }

    public static final CornerBasedShape end(CornerBasedShape $this$end) {
        return CornerBasedShape.copy$default($this$end, CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), null, null, CornerSizeKt.m1010CornerSize0680j_4(Dp.m6973constructorimpl((float) 0.0d)), 6, null);
    }

    public static final Shape fromToken(Shapes $this$fromToken, ShapeKeyTokens value) {
        switch(WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1: goto L17;
            case 2: goto L27;
            case 3: goto L26;
            case 4: goto L25;
            case 5: goto L24;
            case 6: goto L23;
            case 7: goto L22;
            case 8: goto L21;
            case 9: goto L20;
            case 10: goto L19;
            case 11: goto L18;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L18:
        return $this$fromToken.getSmall();
    L19:
        return RectangleShapeKt.getRectangleShape();
    L20:
        return $this$fromToken.getMedium();
    L21:
        return top($this$fromToken.getLarge());
    L22:
        return end($this$fromToken.getLarge());
    L23:
        return $this$fromToken.getLarge();
    L24:
        return RoundedCornerShapeKt.getCircleShape();
    L25:
        return top($this$fromToken.getExtraSmall());
    L26:
        return $this$fromToken.getExtraSmall();
    L27:
        return top($this$fromToken.getExtraLarge());
    L17:
        return $this$fromToken.getExtraLarge();
    }

    public static final Shape getValue(ShapeKeyTokens $this$value, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1629172543, "C191@7815L6:Shapes.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1629172543, $changed, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
    L5:
        Shape r0 = fromToken(MaterialTheme.INSTANCE.getShapes($composer, 6), $this$value);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        LocalShapes = CompositionLocalKt.staticCompositionLocalOf(ShapesKt$LocalShapes$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
