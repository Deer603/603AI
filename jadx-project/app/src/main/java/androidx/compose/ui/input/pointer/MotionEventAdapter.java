package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ(\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010J\u001d\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010(\u001a\u00020\u001f*\u00020\u00152\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "()V", "activeHoverIds", "Landroid/util/SparseBooleanArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "nextId", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "previousSource", "", "previousToolType", "addFreshIds", "", "motionEvent", "Landroid/view/MotionEvent;", "clearOnDeviceChange", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui_release", "createPointerInputEventData", "index", "pressed", "", "endStream", "pointerId", "getComposePointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventPointerId", "getComposePointerId-_I2yYro", "(I)J", "removeStaleIds", "hasPointerId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionEventAdapter {
    public static final int $stable = 0;
    private final SparseBooleanArray activeHoverIds;
    private final SparseLongArray motionEventToComposePointerIdMap;
    private long nextId;
    private final List<PointerInputEventData> pointers;
    private int previousSource;
    private int previousToolType;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    public MotionEventAdapter() {
        this.motionEventToComposePointerIdMap = new SparseLongArray();
        this.activeHoverIds = new SparseBooleanArray();
        this.pointers = new ArrayList();
        this.previousToolType = -1;
        this.previousSource = -1;
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int action = motionEvent.getActionMasked();
        switch(action) {
            case 3: goto L11;
            case 4: goto L11;
            default: goto L4;
        };
    L4:
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        if (action != 9) goto L7;
    L14:
        boolean isHover = true;
    L16:
        if (action != 8) goto L18;
        boolean isScroll = true;
    L19:
        if (isHover == false) goto L21;
        int hoverId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.activeHoverIds.put(hoverId, true);
    L21:
        switch(action) {
            case 1: goto L24;
            case 6: goto L23;
            default: goto L22;
        };
    L22:
        int upIndex = -1;
    L25:
        this.pointers.clear();
        int i = 0;
        int r7 = motionEvent.getPointerCount();
    L26:
        if (i >= r7) goto L36;
        List<PointerInputEventData> r8 = this.pointers;
        if (isHover == true) goto L34;
        if (i == upIndex) goto L34;
        if (isScroll == true) goto L32;
    L33:
        boolean r9 = true;
    L35:
        r8.add(createPointerInputEventData(positionCalculator, motionEvent, i, r9));
        i = i + 1;
        goto L26
    L32:
        if (motionEvent.getButtonState() != 0) goto L33;
    L34:
        r9 = false;
        goto L35
    L36:
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    L23:
        upIndex = motionEvent.getActionIndex();
        goto L25
    L24:
        upIndex = 0;
        goto L25
    L18:
        isScroll = false;
        goto L19
    L7:
        if (action == 7) goto L14;
        if (action == 10) goto L14;
        isHover = false;
        goto L16
    L11:
        this.motionEventToComposePointerIdMap.clear();
        this.activeHoverIds.clear();
        return null;
    }

    public final void endStream(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        switch(motionEvent.getActionMasked()) {
            case 0: goto L8;
            case 5: goto L8;
            case 9: goto L5;
            default: goto L18;
        };
    L5:
        int pointerId = motionEvent.getPointerId(0);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) >= 0) goto L14;
        SparseLongArray r3 = this.motionEventToComposePointerIdMap;
        long r4 = this.nextId;
        this.nextId = 1 + r4;
        r3.put(pointerId, r4);
        return;
    L14:
        return;
    L8:
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) >= 0) goto L16;
        SparseLongArray r5 = this.motionEventToComposePointerIdMap;
        long r6 = this.nextId;
        this.nextId = 1 + r6;
        r5.put(pointerId2, r6);
        if (motionEvent.getToolType(actionIndex) != 3) goto L17;
        this.activeHoverIds.put(pointerId2, true);
        return;
    L17:
        return;
    L16:
        return;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        switch(motionEvent.getActionMasked()) {
            case 1: goto L5;
            case 6: goto L5;
            default: goto L9;
        };
    L5:
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (this.activeHoverIds.get(pointerId, false) == true) goto L9;
        this.motionEventToComposePointerIdMap.delete(pointerId);
        this.activeHoverIds.delete(pointerId);
    L9:
        if (this.motionEventToComposePointerIdMap.size() <= motionEvent.getPointerCount()) goto L17;
        int i = this.motionEventToComposePointerIdMap.size();
    L11:
        i = i - 1;
        if ((-1) >= i) goto L21;
        int pointerId2 = this.motionEventToComposePointerIdMap.keyAt(i);
        if (hasPointerId(motionEvent, pointerId2) == true) goto L11;
        this.motionEventToComposePointerIdMap.removeAt(i);
        this.activeHoverIds.delete(pointerId2);
        goto L11
    L21:
        return;
    }

    private final boolean hasPointerId(MotionEvent $this$hasPointerId, int pointerId) {
        int i = 0;
        int r1 = $this$hasPointerId.getPointerCount();
    L3:
        if (i >= r1) goto L9;
        if ($this$hasPointerId.getPointerId(i) == pointerId) goto L6;
        i = i + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m5519getComposePointerId_I2yYro(int motionEventPointerId) {
        int pointerIndex = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (pointerIndex < 0) goto L5;
        long newId = this.motionEventToComposePointerIdMap.valueAt(pointerIndex);
    L7:
        return PointerId.m5569constructorimpl(newId);
    L5:
        newId = this.nextId;
        this.nextId = 1 + newId;
        this.motionEventToComposePointerIdMap.put(motionEventPointerId, newId);
        goto L7
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) goto L5;
        return;
    L5:
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType) goto L8;
    L9:
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
        return;
    L8:
        if (source != this.previousSource) goto L9;
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        int r3 = index;
        int motionEventPointerId = motionEvent.getPointerId(index);
        long pointerId = m5519getComposePointerId_I2yYro(motionEventPointerId);
        float pressure = motionEvent.getPressure(index);
        float x$iv = motionEvent.getX(index);
        float y$iv = motionEvent.getY(index);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long r8 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        long originalPositionEventPosition = Offset.m4119copydBAh8RU$default(r8, 0.0f, 0.0f, 3, null);
        if (r3 != 0) goto L5;
        float x$iv2 = motionEvent.getRawX();
        float y$iv2 = motionEvent.getRawY();
        int motionEventPointerId2 = Float.floatToRawIntBits(x$iv2);
        long v1$iv$iv2 = motionEventPointerId2;
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long rawPosition = Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
        long position = rawPosition;
        long rawPosition2 = positionCalculator.mo5670screenToLocalMKHz9U(rawPosition);
    L10:
        switch(motionEvent.getToolType(index)) {
            case 0: goto L16;
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            default: goto L11;
        };
    L11:
        int toolType = PointerType.Companion.m5668getUnknownT8wyACA();
    L17:
        ArrayList historical = new ArrayList(motionEvent.getHistorySize());
        int r1 = motionEvent.getHistorySize();
        int toolType2 = toolType;
        int toolType3 = 0;
    L18:
        if (toolType3 >= r1) goto L32;
        int pos = toolType3;
        int r25 = r1;
        float x = motionEvent.getHistoricalX(r3, pos);
        float y = motionEvent.getHistoricalY(r3, pos);
        int r29 = toolType3;
        boolean r31 = true;
        if ((Float.floatToRawIntBits(x) & Integer.MAX_VALUE) >= 2139095040) goto L22;
        boolean r4 = true;
    L23:
        if (r4 == false) goto L30;
        if ((Float.floatToRawIntBits(y) & Integer.MAX_VALUE) < 2139095040) goto L28;
        r31 = false;
    L28:
        if (r31 == false) goto L30;
        int $i$f$Offset = Float.floatToRawIntBits(x);
        long v1$iv$iv3 = $i$f$Offset;
        long v2$iv$iv3 = Float.floatToRawIntBits(y);
        long originalEventPosition = Offset.m4117constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L));
        HistoricalChange historicalChange = new HistoricalChange(motionEvent.getHistoricalEventTime(pos), originalEventPosition, originalEventPosition, null);
        historical.add(historicalChange);
    L30:
        toolType3 = r29 + 1;
        r3 = index;
        r1 = r25;
        goto L18
    L22:
        r4 = false;
        goto L23
    L32:
        if (motionEvent.getActionMasked() != 8) goto L34;
        float x2 = motionEvent.getAxisValue(10);
        float y$iv3 = (-motionEvent.getAxisValue(9)) + 0.0f;
        long v1$iv$iv4 = Float.floatToRawIntBits(x2);
        long v2$iv$iv4 = Float.floatToRawIntBits(y$iv3);
        long scrollDelta = Offset.m4117constructorimpl((v1$iv$iv4 << 32) | (v2$iv$iv4 & 4294967295L));
    L35:
        boolean activeHover = this.activeHoverIds.get(motionEvent.getPointerId(index), false);
        long originalPositionEventPosition2 = motionEvent.getEventTime();
        return new PointerInputEventData(pointerId, originalPositionEventPosition2, position, rawPosition2, pressed, pressure, toolType2, activeHover, historical, scrollDelta, originalPositionEventPosition, null);
    L34:
        scrollDelta = Offset.Companion.m4141getZeroF1C5BW0();
        goto L35
    L12:
        toolType = PointerType.Companion.m5664getEraserT8wyACA();
        goto L17
    L13:
        toolType = PointerType.Companion.m5665getMouseT8wyACA();
        goto L17
    L14:
        toolType = PointerType.Companion.m5666getStylusT8wyACA();
        goto L17
    L15:
        toolType = PointerType.Companion.m5667getTouchT8wyACA();
        goto L17
    L16:
        toolType = PointerType.Companion.m5668getUnknownT8wyACA();
        goto L17
    L5:
        int motionEventPointerId3 = Build.VERSION.SDK_INT;
        if (motionEventPointerId3 < 29) goto L8;
        long rawPosition3 = MotionEventHelper.INSTANCE.m5520toRawOffsetdBAh8RU(motionEvent, r3);
        position = rawPosition3;
        rawPosition2 = positionCalculator.mo5670screenToLocalMKHz9U(rawPosition3);
        goto L10
    L8:
        long rawPosition4 = positionCalculator.mo5669localToScreenMKHz9U(r8);
        rawPosition2 = r8;
        position = rawPosition4;
        goto L10
    }
}
