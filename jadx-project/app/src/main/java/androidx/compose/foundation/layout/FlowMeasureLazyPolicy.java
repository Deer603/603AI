package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014\u0012;\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u001fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0012HÂ\u0003J\u001a\u0010+\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014HÂ\u0003JC\u0010,\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017HÂ\u0003¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0016\u00100\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u0016\u00104\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00102J\t\u00106\u001a\u00020\u000eHÂ\u0003J\t\u00107\u001a\u00020\u000eHÂ\u0003J\t\u00108\u001a\u00020\u000eHÂ\u0003JÑ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u00142=\b\u0002\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0\u0019J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001J\u001e\u0010F\u001a\u00020B*\u00020@2\u0006\u0010G\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010IR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"RE\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010&R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "itemCount", "", "maxLines", "maxItemsInMainAxis", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "Lkotlin/jvm/functions/Function4;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component10", "component11", "component12", "()Lkotlin/jvm/functions/Function4;", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-E4Q9ldg", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "equals", "other", "", "getMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "hashCode", "toString", "", "measure", "constraints", "measure-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<Function2<Composer, Integer, Unit>> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean r1, Arrangement.Horizontal r2, Arrangement.Vertical r3, float r4, CrossAxisAlignment r5, float r6, int r7, int r8, int r9, FlowLayoutOverflowState r10, List r11, Function4 r12, DefaultConstructorMarker r13) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<Function2<Composer, Integer, Unit>> component11() {
        return this.overflowComposables;
    }

    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> component12() {
        return this.getComposable;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m662component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m663component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m664copyE4Q9ldg$default(FlowMeasureLazyPolicy r0, boolean r1, Arrangement.Horizontal r2, Arrangement.Vertical r3, float r4, CrossAxisAlignment r5, float r6, int r7, int r8, int r9, FlowLayoutOverflowState r10, List r11, Function4 r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.isHorizontal;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.horizontalArrangement;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.verticalArrangement;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.mainAxisSpacing;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.crossAxisAlignment;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.crossAxisArrangementSpacing;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.itemCount;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.maxLines;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.maxItemsInMainAxis;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.overflow;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.overflowComposables;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.getComposable;
    L38:
        List r15 = r11;
        Function4 r16 = r12;
        int r17 = r9;
        FlowLayoutOverflowState r18 = r10;
        int r19 = r7;
        int r110 = r8;
        CrossAxisAlignment r20 = r5;
        float r21 = r6;
        Arrangement.Vertical r22 = r3;
        float r23 = r4;
        return r0.m666copyE4Q9ldg(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m666copyE4Q9ldg(boolean r15, Arrangement.Horizontal r16, Arrangement.Vertical r17, float r18, CrossAxisAlignment r19, float r20, int r21, int r22, int r23, FlowLayoutOverflowState r24, List<? extends Function2<? super Composer, ? super Integer, Unit>> r25, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> r26) {
        return new FlowMeasureLazyPolicy(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, null);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof FlowMeasureLazyPolicy) == true) goto L8;
        return false;
    L8:
        FlowMeasureLazyPolicy r1 = (FlowMeasureLazyPolicy) r6;
        if (this.isHorizontal == r1.isHorizontal) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.horizontalArrangement, r1.horizontalArrangement) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.verticalArrangement, r1.verticalArrangement) == true) goto L18;
        return false;
    L18:
        if (Dp.m6978equalsimpl0(this.mainAxisSpacing, r1.mainAxisSpacing) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.crossAxisAlignment, r1.crossAxisAlignment) == true) goto L24;
        return false;
    L24:
        if (Dp.m6978equalsimpl0(this.crossAxisArrangementSpacing, r1.crossAxisArrangementSpacing) == true) goto L27;
        return false;
    L27:
        if (this.itemCount == r1.itemCount) goto L30;
        return false;
    L30:
        if (this.maxLines == r1.maxLines) goto L33;
        return false;
    L33:
        if (this.maxItemsInMainAxis == r1.maxItemsInMainAxis) goto L36;
        return false;
    L36:
        if (Intrinsics.areEqual(this.overflow, r1.overflow) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.areEqual(this.overflowComposables, r1.overflowComposables) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.areEqual(this.getComposable, r1.getComposable) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m6979hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6979hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("FlowMeasureLazyPolicy(isHorizontal=").append(this.isHorizontal).append(", horizontalArrangement=").append(this.horizontalArrangement).append(", verticalArrangement=").append(this.verticalArrangement).append(", mainAxisSpacing=").append(Dp.m6984toStringimpl(this.mainAxisSpacing)).append(", crossAxisAlignment=").append(this.crossAxisAlignment).append(", crossAxisArrangementSpacing=").append(Dp.m6984toStringimpl(this.crossAxisArrangementSpacing)).append(", itemCount=").append(this.itemCount).append(", maxLines=").append(this.maxLines).append(", maxItemsInMainAxis=").append(this.maxItemsInMainAxis).append(", overflow=").append(this.overflow).append(", overflowComposables=").append(this.overflowComposables).append(", getComposable=");
        r0.append(this.getComposable).append(')');
        return r0.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int itemCount, int maxLines, int maxItemsInMainAxis, FlowLayoutOverflowState overflow, List<? extends Function2<? super Composer, ? super Integer, Unit>> r11, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> r12) {
        this.isHorizontal = isHorizontal;
        this.horizontalArrangement = horizontalArrangement;
        this.verticalArrangement = verticalArrangement;
        this.mainAxisSpacing = mainAxisSpacing;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = crossAxisArrangementSpacing;
        this.itemCount = itemCount;
        this.maxLines = maxLines;
        this.maxItemsInMainAxis = maxItemsInMainAxis;
        this.overflow = overflow;
        this.overflowComposables = r11;
        this.getComposable = r12;
    }

    public static final /* synthetic */ Function4 access$getGetComposable$p(FlowMeasureLazyPolicy $this) {
        return $this.getComposable;
    }

    public static final /* synthetic */ int access$getItemCount$p(FlowMeasureLazyPolicy $this) {
        return $this.itemCount;
    }

    public static final /* synthetic */ List access$getOverflowComposables$p(FlowMeasureLazyPolicy $this) {
        return $this.overflowComposables;
    }

    /* JADX INFO: renamed from: access$measure-0kLqBqw, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m661access$measure0kLqBqw(FlowMeasureLazyPolicy $this, SubcomposeMeasureScope $receiver, long constraints) {
        return $this.m665measure0kLqBqw($receiver, constraints);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new AnonymousClass1(this);
    }

    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    private final MeasureResult m665measure0kLqBqw(final SubcomposeMeasureScope $this$measure_u2d0kLqBqw, long constraints) {
        if (this.itemCount <= 0) goto L20;
        if (this.maxLines == 0) goto L20;
        if (this.maxItemsInMainAxis == 0) goto L20;
        if (Constraints.m6925getMaxHeightimpl(constraints) == 0) goto L11;
    L13:
        ContextualFlowItemIterator measurablesIterator = new ContextualFlowItemIterator(this.itemCount, new FlowMeasureLazyPolicy$measure$measurablesIterator$1($this$measure_u2d0kLqBqw, this));
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        this.overflow.m655setOverflowMeasurablesVKLhPVY$foundation_layout_release(this, constraints, new FlowMeasureLazyPolicy$measure$2(this, $this$measure_u2d0kLqBqw));
        SubcomposeMeasureScope r8 = $this$measure_u2d0kLqBqw;
        FlowMeasureLazyPolicy r9 = this;
        ContextualFlowItemIterator r10 = measurablesIterator;
        float r11 = this.mainAxisSpacing;
        float r12 = this.crossAxisArrangementSpacing;
        if (isHorizontal() == false) goto L16;
        LayoutOrientation r5 = LayoutOrientation.Horizontal;
    L18:
        return FlowLayoutKt.m649breakDownItemsdi9J0FM(r8, r9, r10, r11, r12, OrientationIndependentConstraints.m694constructorimpl(constraints, r5), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L16:
        r5 = LayoutOrientation.Vertical;
        goto L18
    L11:
        if (this.overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.Visible) goto L13;
    L20:
        return MeasureScope.layout$default($this$measure_u2d0kLqBqw, 0, 0, null, FlowMeasureLazyPolicy$measure$1.INSTANCE, 4, null);
    }
}
