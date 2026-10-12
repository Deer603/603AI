package androidx.compose.material3;

import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\u0010\fJ\u001d\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020+2\u0006\u0010g\u001a\u00020\u0003H\u0000¢\u0006\u0002\bhJ \u0010i\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u0003H\u0002J*\u0010k\u001a\u00020>2\u0006\u00109\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010g\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u00020\tH\u0000¢\u0006\u0002\boR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R+\u0010%\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t0*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R+\u0010.\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020+8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0017\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R+\u00109\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0017\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010-\"\u0004\b@\u0010AR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010F\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u0017\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R+\u0010J\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u0017\u001a\u0004\bK\u0010\u000f\"\u0004\bL\u0010\u0011R\u0014\u0010N\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010$R+\u0010P\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010\u0017\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010$R\u0014\u0010U\u001a\u00020VX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR+\u0010Y\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\bZ\u0010$\"\u0004\b[\u0010\\R+\u0010_\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010\u0017\u001a\u0004\b`\u0010\u000f\"\u0004\ba\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "activeRangeStart", "", "activeRangeEnd", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "newVal", "getActiveRangeEnd", "()F", "setActiveRangeEnd", "(F)V", "<set-?>", "activeRangeEndState", "getActiveRangeEndState", "setActiveRangeEndState", "activeRangeEndState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getActiveRangeStart", "setActiveRangeStart", "activeRangeStartState", "getActiveRangeStartState", "setActiveRangeStartState", "activeRangeStartState$delegate", "coercedActiveRangeEndAsFraction", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getCoercedActiveRangeStartAsFraction$material3_release", "endSteps", "getEndSteps$material3_release", "()I", "endThumbWidth", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth$delegate", "gestureEndAction", "Lkotlin/Function1;", "", "getGestureEndAction$material3_release", "()Lkotlin/jvm/functions/Function1;", "isRtl", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl$delegate", "Landroidx/compose/runtime/MutableState;", "maxPx", "getMaxPx", "setMaxPx", "maxPx$delegate", "minPx", "getMinPx", "setMinPx", "minPx$delegate", "onValueChange", "Landroidx/compose/material3/SliderRange;", "getOnValueChange$material3_release", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnValueChangeFinished", "()Lkotlin/jvm/functions/Function0;", "setOnValueChangeFinished", "(Lkotlin/jvm/functions/Function0;)V", "rawOffsetEnd", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd$delegate", "rawOffsetStart", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart$delegate", "startSteps", "getStartSteps$material3_release", "startThumbWidth", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth$delegate", "getSteps", "tickFractions", "", "getTickFractions$material3_release", "()[F", "totalWidth", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "trackHeight", "getTrackHeight$material3_release", "setTrackHeight$material3_release", "trackHeight$delegate", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "onDrag", "isStart", "offset", "onDrag$material3_release", "scaleToOffset", "userValue", "scaleToUserValue", "scaleToUserValue-owVgs5E", "(FFJ)J", "updateMinMaxPx", "updateMinMaxPx$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RangeSliderState {
    public static final int $stable = 0;
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final Function1<Boolean, Unit> gestureEndAction;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private Function1<? super SliderRange, Unit> onValueChange;
    private Function0<Unit> onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final ClosedFloatingPointRange<Float> valueRange;

    static {
        $stable = 8;
    }

    public RangeSliderState() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        int r3 = 0;
        Function0 r4 = null;
        ClosedFloatingPointRange r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public RangeSliderState(float activeRangeStart, float activeRangeEnd, int steps, Function0<Unit> r8, ClosedFloatingPointRange<Float> r9) {
        this.steps = steps;
        this.onValueChangeFinished = r8;
        this.valueRange = r9;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(activeRangeStart);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(activeRangeEnd);
        this.tickFractions = SliderKt.access$stepsToTickFractions(this.steps);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new RangeSliderState$gestureEndAction$1(this);
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public /* synthetic */ RangeSliderState(float r3, float r4, int r5, Function0 r6, ClosedFloatingPointRange r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0.0f;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = 1.0f;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r8 & 16) == 0) goto L17;
        ClosedFloatingPointRange r10 = RangesKt.rangeTo(0.0f, 1.0f);
    L18:
        Function0 r11 = r6;
        int r12 = r5;
        this(r3, r4, r12, r11, r10);
        return;
    L17:
        r10 = r7;
        goto L18
    }

    public final int getSteps() {
        return this.steps;
    }

    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final void setOnValueChangeFinished(Function0<Unit> r1) {
        this.onValueChangeFinished = r1;
    }

    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getActiveRangeStartState() {
        FloatState $this$getValue$iv = this.activeRangeStartState$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setActiveRangeStartState(float r4) {
        MutableFloatState $this$setValue$iv = this.activeRangeStartState$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float getActiveRangeEndState() {
        FloatState $this$getValue$iv = this.activeRangeEndState$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setActiveRangeEndState(float r4) {
        MutableFloatState $this$setValue$iv = this.activeRangeEndState$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final void setActiveRangeStart(float newVal) {
        float coercedValue = RangesKt.coerceIn(newVal, this.valueRange.getStart().floatValue(), getActiveRangeEnd());
        float snappedValue = SliderKt.access$snapValueToTick(coercedValue, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setActiveRangeStartState(snappedValue);
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final void setActiveRangeEnd(float newVal) {
        float coercedValue = RangesKt.coerceIn(newVal, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue());
        float snappedValue = SliderKt.access$snapValueToTick(coercedValue, this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
        setActiveRangeEndState(snappedValue);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final Function1<SliderRange, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(Function1<? super SliderRange, Unit> r1) {
        this.onValueChange = r1;
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final float getTrackHeight$material3_release() {
        FloatState $this$getValue$iv = this.trackHeight$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setTrackHeight$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.trackHeight$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getStartThumbWidth$material3_release() {
        FloatState $this$getValue$iv = this.startThumbWidth$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setStartThumbWidth$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.startThumbWidth$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getEndThumbWidth$material3_release() {
        FloatState $this$getValue$iv = this.endThumbWidth$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setEndThumbWidth$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.endThumbWidth$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final int getTotalWidth$material3_release() {
        IntState $this$getValue$iv = this.totalWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    public final void setTotalWidth$material3_release(int r4) {
        MutableIntState $this$setValue$iv = this.totalWidth$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final float getRawOffsetStart$material3_release() {
        FloatState $this$getValue$iv = this.rawOffsetStart$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setRawOffsetStart$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.rawOffsetStart$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getRawOffsetEnd$material3_release() {
        FloatState $this$getValue$iv = this.rawOffsetEnd$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setRawOffsetEnd$material3_release(float r4) {
        MutableFloatState $this$setValue$iv = this.rawOffsetEnd$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final boolean isRtl$material3_release() {
        State $this$getValue$iv = this.isRtl$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setRtl$material3_release(boolean r5) {
        MutableState $this$setValue$iv = this.isRtl$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final Function1<Boolean, Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    private final float getMaxPx() {
        FloatState $this$getValue$iv = this.maxPx$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setMaxPx(float r4) {
        MutableFloatState $this$setValue$iv = this.maxPx$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float getMinPx() {
        FloatState $this$getValue$iv = this.minPx$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setMinPx(float r4) {
        MutableFloatState $this$setValue$iv = this.minPx$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final void onDrag$material3_release(boolean isStart, float offset) {
        if (isStart == false) goto L4;
        setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + offset);
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
        float offsetEnd = getRawOffsetEnd$material3_release();
        long offsetRange = SliderKt.SliderRange(SliderKt.access$snapValueToTick(RangesKt.coerceIn(getRawOffsetStart$material3_release(), getMinPx(), offsetEnd), this.tickFractions, getMinPx(), getMaxPx()), offsetEnd);
    L5:
        long scaledUserValue = m2522scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), offsetRange);
        if (SliderRange.m2644equalsimpl0(scaledUserValue, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd())) == false) goto L8;
        return;
    L8:
        if (this.onValueChange == null) goto L12;
        Function1<? super SliderRange, Unit> r4 = this.onValueChange;
        if (r4 == null) goto L15;
        r4.invoke(SliderRange.m2641boximpl(scaledUserValue));
        return;
    L15:
        return;
    L12:
        setActiveRangeStart(SliderRange.m2646getStartimpl(scaledUserValue));
        setActiveRangeEnd(SliderRange.m2645getEndInclusiveimpl(scaledUserValue));
        return;
    L4:
        setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + offset);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        float offsetStart = getRawOffsetStart$material3_release();
        float offsetEnd2 = RangesKt.coerceIn(getRawOffsetEnd$material3_release(), offsetStart, getMaxPx());
        offsetRange = SliderKt.SliderRange(offsetStart, SliderKt.access$snapValueToTick(offsetEnd2, this.tickFractions, getMinPx(), getMaxPx()));
        goto L5
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.access$calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.access$calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    /* JADX INFO: renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m2522scaleToUserValueowVgs5E(float minPx, float maxPx, long offset) {
        return SliderKt.m2630access$scaleziovWd0(minPx, maxPx, offset, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.access$scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), userValue, minPx, maxPx);
    }

    public final void updateMinMaxPx$material3_release() {
        float newMaxPx = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / 2.0f), 0.0f);
        float newMinPx = Math.min(getStartThumbWidth$material3_release() / 2.0f, newMaxPx);
        boolean r3 = true;
        if (getMinPx() != newMinPx) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L8;
    L12:
        setMinPx(newMinPx);
        setMaxPx(newMaxPx);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
        return;
    L8:
        if (getMaxPx() == newMaxPx) goto L11;
        r3 = false;
    L11:
        if (r3 == false) goto L12;
        return;
    L5:
        r2 = false;
        goto L6
    }
}
