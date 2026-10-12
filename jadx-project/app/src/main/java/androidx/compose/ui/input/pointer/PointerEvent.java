package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\fJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010%\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0017\u0010\fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "buttons", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "classification", "", "getClassification", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerEvent {
    public static final int $stable = 0;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    static {
        $stable = 8;
    }

    public PointerEvent(List<PointerInputChange> r3, InternalPointerEvent internalPointerEvent) {
        this.changes = r3;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent r0 = getMotionEvent$ui_release();
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.getButtonState();
    L6:
        this.buttons = PointerButtons.m5522constructorimpl(r2);
        MotionEvent r4 = getMotionEvent$ui_release();
        if (r4 == null) goto L9;
        r1 = r4.getMetaState();
    L9:
        this.keyboardModifiers = PointerKeyboardModifiers.m5651constructorimpl(r1);
        this.type = m5528calculatePointerEventType7fucELk();
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent r0 = this.internalPointerEvent;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getMotionEvent();
    }

    public final int getClassification() {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        MotionEvent r0 = getMotionEvent$ui_release();
        if (r0 != null) goto L9;
        return 0;
    L9:
        return r0.getClassification();
    L10:
        return 0;
    }

    public PointerEvent(List<PointerInputChange> r2) {
        this(r2, null);
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m5529getButtonsry648PA() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m5530getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name */
    public final int m5531getType7fucELk() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m5532setTypeEhbLWgg$ui_release(int r1) {
        this.type = r1;
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m5528calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent$ui_release();
        if (motionEvent != null) goto L5;
        List<PointerInputChange> r1 = this.changes;
        int index$iv = 0;
        int r4 = r1.size();
    L15:
        if (index$iv >= r4) goto L26;
        Object item$iv = r1.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        if (PointerEventKt.changedToUpIgnoreConsumed(it) == true) goto L19;
        if (PointerEventKt.changedToDownIgnoreConsumed(it) == true) goto L23;
        index$iv = index$iv + 1;
        goto L15
    L23:
        return PointerEventType.Companion.m5545getPress7fucELk();
    L19:
        return PointerEventType.Companion.m5546getRelease7fucELk();
    L26:
        return PointerEventType.Companion.m5544getMove7fucELk();
    L5:
        switch(motionEvent.getActionMasked()) {
            case 0: goto L13;
            case 1: goto L35;
            case 2: goto L34;
            case 3: goto L30;
            case 4: goto L30;
            case 5: goto L13;
            case 6: goto L35;
            case 7: goto L34;
            case 8: goto L33;
            case 9: goto L32;
            case 10: goto L31;
            default: goto L30;
        };
    L30:
        return PointerEventType.Companion.m5548getUnknown7fucELk();
    L31:
        return PointerEventType.Companion.m5543getExit7fucELk();
    L32:
        return PointerEventType.Companion.m5542getEnter7fucELk();
    L33:
        return PointerEventType.Companion.m5547getScroll7fucELk();
    L34:
        return PointerEventType.Companion.m5544getMove7fucELk();
    L35:
        return PointerEventType.Companion.m5546getRelease7fucELk();
    L13:
        return PointerEventType.Companion.m5545getPress7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> r37, MotionEvent motionEvent) {
        if (motionEvent != null) goto L6;
        return new PointerEvent(r37, null);
    L6:
        if (Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release()) == true) goto L24;
        LongSparseArray changesArray = new LongSparseArray(r37.size());
        ArrayList pointerEventData = new ArrayList(r37.size());
        List<PointerInputChange> r5 = r37;
        int $i$f$fastForEach = 0;
        int index$iv = 0;
        int r8 = r5.size();
    L9:
        if (index$iv >= r8) goto L17;
        Object item$iv = r5.get(index$iv);
        PointerInputChange change = (PointerInputChange) item$iv;
        changesArray.put(change.m5587getIdJ3iCeTQ(), change);
        ArrayList r12 = pointerEventData;
        long r14 = change.m5587getIdJ3iCeTQ();
        long r16 = change.getUptimeMillis();
        long r18 = change.m5589getPositionF1C5BW0();
        long r20 = change.m5589getPositionF1C5BW0();
        boolean r22 = change.getPressed();
        float r23 = change.getPressure();
        int r24 = change.m5592getTypeT8wyACA();
        ArrayList pointerEventData2 = pointerEventData;
        InternalPointerEvent r4 = this.internalPointerEvent;
        boolean r25 = false;
        if (r4 == null) goto L15;
        List<PointerInputChange> r34 = r5;
        int $i$f$fastForEach2 = $i$f$fastForEach;
        if (r4.m5517activeHoverEvent0FcD4WY(change.m5587getIdJ3iCeTQ()) != true) goto L16;
        r25 = true;
    L16:
        r12.add(new PointerInputEventData(r14, r16, r18, r20, r22, r23, r24, r25, null, 0, 0, 1792, null));
        index$iv = index$iv + 1;
        pointerEventData = pointerEventData2;
        r5 = r34;
        $i$f$fastForEach = $i$f$fastForEach2;
        goto L9
    L15:
        r34 = r5;
        $i$f$fastForEach2 = $i$f$fastForEach;
        goto L16
    L17:
        PointerInputEvent pointerInputEvent = new PointerInputEvent(motionEvent.getEventTime(), pointerEventData, motionEvent);
        InternalPointerEvent event = new InternalPointerEvent(changesArray, pointerInputEvent);
        return new PointerEvent(r37, event);
    L24:
        return new PointerEvent(r37, this.internalPointerEvent);
    }
}
