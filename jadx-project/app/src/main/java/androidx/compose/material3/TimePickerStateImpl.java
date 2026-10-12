package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R$\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R1\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 8V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl;", "Landroidx/compose/material3/TimePickerState;", "initialHour", "", "initialMinute", "is24Hour", "", "(IIZ)V", "value", "hour", "getHour", "()I", "setHour", "(I)V", "hourState", "Landroidx/compose/runtime/MutableIntState;", "getHourState", "()Landroidx/compose/runtime/MutableIntState;", "is24hour", "()Z", "set24hour", "(Z)V", "<set-?>", "isAfternoon", "setAfternoon", "isAfternoon$delegate", "Landroidx/compose/runtime/MutableState;", "minute", "getMinute", "setMinute", "minuteState", "getMinuteState", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "getSelection-yecRtBI", "setSelection-6_8s6DQ", "selection$delegate", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TimePickerStateImpl implements TimePickerState {
    public static final Companion Companion = null;
    private final MutableIntState hourState;
    private boolean is24hour;
    private final MutableState isAfternoon$delegate;
    private final MutableIntState minuteState;
    private final MutableState selection$delegate;

    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerStateImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<TimePickerStateImpl, ?> Saver() {
            return SaverKt.Saver(TimePickerStateImpl$Companion$Saver$1.INSTANCE, TimePickerStateImpl$Companion$Saver$2.INSTANCE);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public TimePickerStateImpl(int initialHour, int initialMinute, boolean is24Hour) {
        boolean r0 = true;
        if (initialHour >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L24;
        if (initialMinute >= 0) goto L11;
    L13:
        boolean r3 = false;
    L14:
        if (r3 == false) goto L22;
        this.is24hour = is24Hour;
        this.selection$delegate = SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.m2871boximpl(TimePickerSelectionMode.Companion.m2878getHouryecRtBI()), null, 2, null);
        if (initialHour >= 12) goto L19;
        r0 = false;
    L19:
        this.isAfternoon$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r0), null, 2, null);
        this.hourState = SnapshotIntStateKt.mutableIntStateOf(initialHour % 12);
        this.minuteState = SnapshotIntStateKt.mutableIntStateOf(initialMinute);
        return;
    L22:
        throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
    L11:
        if (initialMinute >= 60) goto L13;
        r3 = true;
        goto L14
    L24:
        throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
    L5:
        if (initialHour >= 24) goto L7;
        r2 = true;
        goto L8
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.is24hour;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean r1) {
        this.is24hour = r1;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: getSelection-yecRtBI */
    public int mo1887getSelectionyecRtBI() {
        State $this$getValue$iv = this.selection$delegate;
        return ((TimePickerSelectionMode) $this$getValue$iv.getValue()).m2877unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: setSelection-6_8s6DQ */
    public void mo1888setSelection6_8s6DQ(int r5) {
        MutableState $this$setValue$iv = this.selection$delegate;
        $this$setValue$iv.setValue(TimePickerSelectionMode.m2871boximpl(r5));
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        State $this$getValue$iv = this.isAfternoon$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean r5) {
        MutableState $this$setValue$iv = this.isAfternoon$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final MutableIntState getHourState() {
        return this.hourState;
    }

    public final MutableIntState getMinuteState() {
        return this.minuteState;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.minuteState.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int value) {
        this.minuteState.setIntValue(value);
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        int r0 = this.hourState.getIntValue();
        if (isAfternoon() == false) goto L5;
        int r1 = 12;
    L7:
        return r0 + r1;
    L5:
        r1 = 0;
        goto L7
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int value) {
        if (value < 12) goto L5;
        boolean r0 = true;
    L6:
        setAfternoon(r0);
        this.hourState.setIntValue(value % 12);
        return;
    L5:
        r0 = false;
        goto L6
    }
}
