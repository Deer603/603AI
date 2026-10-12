package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020$H\u0000¢\u0006\u0002\b1J\u0018\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b4\u00105J&\u00106\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u001c2\u0006\u00100\u001a\u00020$2\u0006\u00108\u001a\u00020$R+\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u00020\u001eX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "()V", "initialOrientation", "Landroidx/compose/foundation/gestures/Orientation;", "initial", "", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "<set-?>", "maximum", "getMaximum", "()F", "setMaximum", "(F)V", "maximum$delegate", "Landroidx/compose/runtime/MutableFloatState;", "offset", "getOffset", "setOffset", "offset$delegate", "orientation", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "orientation$delegate", "Landroidx/compose/runtime/MutableState;", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "J", "", "viewportSize", "getViewportSize", "()I", "setViewportSize", "(I)V", "viewportSize$delegate", "Landroidx/compose/runtime/MutableIntState;", "coerceOffset", "", "cursorStart", "cursorEnd", "containerSize", "coerceOffset$foundation_release", "getOffsetToFollow", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "update", "cursorRect", "textFieldSize", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Saver<TextFieldScrollerPosition, Object> Saver = null;
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;
    private final MutableIntState viewportSize$delegate;

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.access$getSaver$cp();
        }
    }

    public TextFieldScrollerPosition(Orientation initialOrientation, float initial) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(initial);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m6422getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation r1, float r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0.0f;
    L5:
        this(r1, r2);
    }

    public TextFieldScrollerPosition() {
        float r3 = 0.0f;
        this(Orientation.Vertical, r3, 2, null);
    }

    public final float getOffset() {
        FloatState $this$getValue$iv = this.offset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setOffset(float r4) {
        MutableFloatState $this$setValue$iv = this.offset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final void setMaximum(float r4) {
        MutableFloatState $this$setValue$iv = this.maximum$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getMaximum() {
        FloatState $this$getValue$iv = this.maximum$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setViewportSize(int r4) {
        MutableIntState $this$setValue$iv = this.viewportSize$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getViewportSize() {
        IntState $this$getValue$iv = this.viewportSize$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m1156getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m1157setPreviousSelection5zctL8(long r1) {
        this.previousSelection = r1;
    }

    public final Orientation getOrientation() {
        State $this$getValue$iv = this.orientation$delegate;
        return (Orientation) $this$getValue$iv.getValue();
    }

    public final void setOrientation(Orientation r4) {
        MutableState $this$setValue$iv = this.orientation$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final void update(Orientation orientation, Rect cursorRect, int containerSize, int textFieldSize) {
        float difference = textFieldSize - containerSize;
        setMaximum(difference);
        boolean vertical = true;
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft()) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L13;
        if (cursorRect.getTop() != this.previousCursorRect.getTop()) goto L10;
        boolean r2 = true;
    L11:
        if (r2 == false) goto L13;
    L23:
        float cursorStart = getOffset();
        setOffset(RangesKt.coerceIn(cursorStart, 0.0f, difference));
        setViewportSize(containerSize);
        return;
    L10:
        r2 = false;
    L13:
        if (orientation == Orientation.Vertical) goto L16;
        vertical = false;
    L16:
        if (vertical == false) goto L18;
        float cursorStart2 = cursorRect.getTop();
    L19:
        if (vertical == false) goto L21;
        float cursorEnd = cursorRect.getBottom();
    L22:
        coerceOffset$foundation_release(cursorStart2, cursorEnd, containerSize);
        this.previousCursorRect = cursorRect;
        goto L23
    L21:
        cursorEnd = cursorRect.getRight();
        goto L22
    L18:
        cursorStart2 = cursorRect.getLeft();
        goto L19
    L5:
        r1 = false;
        goto L6
    }

    public final void coerceOffset$foundation_release(float cursorStart, float cursorEnd, int containerSize) {
        float startVisibleBound = getOffset();
        float endVisibleBound = containerSize + startVisibleBound;
        if (cursorEnd <= endVisibleBound) goto L6;
        float offsetDifference = cursorEnd - endVisibleBound;
    L16:
        setOffset(getOffset() + offsetDifference);
        return;
    L6:
        if (cursorStart >= startVisibleBound) goto L11;
        if ((cursorEnd - cursorStart) <= containerSize) goto L11;
        offsetDifference = cursorEnd - endVisibleBound;
    L11:
        if (cursorStart < startVisibleBound) goto L13;
    L15:
        offsetDifference = 0.0f;
        goto L16
    L13:
        if ((cursorEnd - cursorStart) > containerSize) goto L15;
        offsetDifference = cursorStart - startVisibleBound;
        goto L16
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1155getOffsetToFollow5zctL8(long selection) {
        if (TextRange.m6417getStartimpl(selection) == TextRange.m6417getStartimpl(this.previousSelection)) goto L6;
        return TextRange.m6417getStartimpl(selection);
    L6:
        if (TextRange.m6412getEndimpl(selection) == TextRange.m6412getEndimpl(this.previousSelection)) goto L9;
        return TextRange.m6412getEndimpl(selection);
    L9:
        return TextRange.m6415getMinimpl(selection);
    }

    static {
        Companion = new Companion(null);
        Saver = ListSaverKt.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);
    }
}
