package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007Je\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u001b\b\u0002\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0096\u0001JH\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0096\u0001J(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001e*\u000201H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00100\u001a\u00020\u001e*\u000204H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\u000201*\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0019\u00107\u001a\u000201*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0019\u00107\u001a\u000201*\u00020\u001eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010<J\u0016\u0010=\u001a\u00020>*\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\t*\u000201H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010;J\u0017\u0010B\u001a\u00020\t*\u000204H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bD\u00109J\r\u0010E\u001a\u00020F*\u00020GH\u0097\u0001J\u0016\u0010H\u001a\u00020?*\u00020>H\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010AJ\u0016\u0010J\u001a\u000204*\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010LJ\u0019\u0010J\u001a\u000204*\u00020\u001eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010NR\u0014\u0010\b\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeMeasureScope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "placeablesCache", "Landroidx/collection/MutableIntObjectMap;", "", "Landroidx/compose/ui/layout/Placeable;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measure", "index", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final MutableIntObjectMap<List<Placeable>> placeablesCache;
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    static {
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int r2, int r3, Map<AlignmentLine, Integer> r4, Function1<? super Placeable.PlacementScope, Unit> r5) {
        return this.subcomposeMeasureScope.layout(r2, r3, r4, r5);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int r7, int r8, Map<AlignmentLine, Integer> r9, Function1<? super RulerScope, Unit> r10, Function1<? super Placeable.PlacementScope, Unit> r11) {
        return this.subcomposeMeasureScope.layout(r7, r8, r9, r10, r11);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo369roundToPxR2X_6o(long r2) {
        return this.subcomposeMeasureScope.mo369roundToPxR2X_6o(r2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo370roundToPx0680j_4(float r2) {
        return this.subcomposeMeasureScope.mo370roundToPx0680j_4(r2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo375toPxR2X_6o(long r2) {
        return this.subcomposeMeasureScope.mo375toPxR2X_6o(r2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo376toPx0680j_4(float r2) {
        return this.subcomposeMeasureScope.mo376toPx0680j_4(r2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect r2) {
        return this.subcomposeMeasureScope.toRect(r2);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory itemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = itemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = this.itemContentFactory.getItemProvider().invoke();
        this.placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* JADX INFO: renamed from: measure-0kLqBqw */
    public List<Placeable> mo899measure0kLqBqw(int index, long constraints) {
        List<Placeable> r0 = this.placeablesCache.get(index);
        if (r0 != null) goto L11;
        Object key = this.itemProvider.getKey(index);
        Object contentType = this.itemProvider.getContentType(index);
        Function2<Composer, Integer, Unit> r3 = this.itemContentFactory.getContent(index, key, contentType);
        List<Measurable> r4 = this.subcomposeMeasureScope.subcompose(key, r3);
        int r5 = r4.size();
        ArrayList r6 = new ArrayList(r5);
        int r7 = 0;
    L6:
        if (r7 >= r5) goto L8;
        int i = r7;
        r6.add(r4.get(i).mo5714measureBRTryo0(constraints));
        r7 = r7 + 1;
        goto L6
    L8:
        ArrayList it = r6;
        this.placeablesCache.set(index, it);
        return it;
    L11:
        return r0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo371toDpGaN1DYA(long $this$toDp_u2dGaN1DYA) {
        SubcomposeMeasureScope $this$toDp_GaN1DYA_u24lambda_u242 = this.subcomposeMeasureScope;
        return $this$toDp_GaN1DYA_u24lambda_u242.mo371toDpGaN1DYA($this$toDp_u2dGaN1DYA);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(int $this$toDp_u2du2uoSUM) {
        SubcomposeMeasureScope $this$toDp_u2uoSUM_u24lambda_u243 = this.subcomposeMeasureScope;
        return $this$toDp_u2uoSUM_u24lambda_u243.mo373toDpu2uoSUM($this$toDp_u2du2uoSUM);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo372toDpu2uoSUM(float $this$toDp_u2du2uoSUM) {
        SubcomposeMeasureScope $this$toDp_u2uoSUM_u24lambda_u244 = this.subcomposeMeasureScope;
        return $this$toDp_u2uoSUM_u24lambda_u244.mo372toDpu2uoSUM($this$toDp_u2du2uoSUM);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo379toSpkPz2Gy4(float $this$toSp_u2dkPz2Gy4) {
        SubcomposeMeasureScope $this$toSp_kPz2Gy4_u24lambda_u245 = this.subcomposeMeasureScope;
        return $this$toSp_kPz2Gy4_u24lambda_u245.mo379toSpkPz2Gy4($this$toSp_u2dkPz2Gy4);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(int $this$toSp_u2dkPz2Gy4) {
        SubcomposeMeasureScope $this$toSp_kPz2Gy4_u24lambda_u246 = this.subcomposeMeasureScope;
        return $this$toSp_kPz2Gy4_u24lambda_u246.mo380toSpkPz2Gy4($this$toSp_u2dkPz2Gy4);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo378toSp0xMU5do(float $this$toSp_u2d0xMU5do) {
        SubcomposeMeasureScope $this$toSp_0xMU5do_u24lambda_u247 = this.subcomposeMeasureScope;
        return $this$toSp_0xMU5do_u24lambda_u247.mo378toSp0xMU5do($this$toSp_u2d0xMU5do);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo377toSizeXkaWNTQ(long $this$toSize_u2dXkaWNTQ) {
        SubcomposeMeasureScope $this$toSize_XkaWNTQ_u24lambda_u248 = this.subcomposeMeasureScope;
        return $this$toSize_XkaWNTQ_u24lambda_u248.mo377toSizeXkaWNTQ($this$toSize_u2dXkaWNTQ);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo374toDpSizekrfVVM(long $this$toDpSize_u2dk_u2drfVVM) {
        SubcomposeMeasureScope $this$toDpSize_k_rfVVM_u24lambda_u249 = this.subcomposeMeasureScope;
        return $this$toDpSize_k_rfVVM_u24lambda_u249.mo374toDpSizekrfVVM($this$toDpSize_u2dk_u2drfVVM);
    }
}
