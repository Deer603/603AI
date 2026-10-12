package androidx.compose.ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HapticFeedbackType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class HapticFeedbackType {
    public static final Companion Companion = null;
    private final int value;

    /* JADX INFO: compiled from: HapticFeedbackType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eR\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "Confirm", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m5096getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5108getConfirm5zf0vsI();
        }

        /* JADX INFO: renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m5097getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5109getContextClick5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m5098getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5110getGestureEnd5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m5099getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5111getGestureThresholdActivate5zf0vsI();
        }

        /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m5100getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5112getLongPress5zf0vsI();
        }

        /* JADX INFO: renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m5101getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5113getReject5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m5102getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5114getSegmentFrequentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m5103getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5115getSegmentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m5104getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5116getTextHandleMove5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m5105getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5117getToggleOff5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m5106getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5118getToggleOn5zf0vsI();
        }

        /* JADX INFO: renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m5107getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5119getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf(new HapticFeedbackType[]{HapticFeedbackType.m5089boximpl(m5096getConfirm5zf0vsI()), HapticFeedbackType.m5089boximpl(m5097getContextClick5zf0vsI()), HapticFeedbackType.m5089boximpl(m5098getGestureEnd5zf0vsI()), HapticFeedbackType.m5089boximpl(m5099getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m5089boximpl(m5100getLongPress5zf0vsI()), HapticFeedbackType.m5089boximpl(m5101getReject5zf0vsI()), HapticFeedbackType.m5089boximpl(m5102getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m5089boximpl(m5103getSegmentTick5zf0vsI()), HapticFeedbackType.m5089boximpl(m5104getTextHandleMove5zf0vsI()), HapticFeedbackType.m5089boximpl(m5105getToggleOff5zf0vsI()), HapticFeedbackType.m5089boximpl(m5106getToggleOn5zf0vsI()), HapticFeedbackType.m5089boximpl(m5107getVirtualKey5zf0vsI())});
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m5089boximpl(int r1) {
        return new HapticFeedbackType(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m5090constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5091equalsimpl(int r2, Object r3) {
        if ((r3 instanceof HapticFeedbackType) == true) goto L6;
        return false;
    L6:
        if (r2 == ((HapticFeedbackType) r3).m5095unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5092equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5093hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m5091equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m5093hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5095unboximpl() {
        return this.value;
    }

    private /* synthetic */ HapticFeedbackType(int value) {
        this.value = value;
    }

    public String toString() {
        return m5094toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5094toStringimpl(int arg0) {
        if (m5092equalsimpl0(arg0, Companion.m5096getConfirm5zf0vsI()) == false) goto L6;
        return "Confirm";
    L6:
        if (m5092equalsimpl0(arg0, Companion.m5097getContextClick5zf0vsI()) == false) goto L9;
        return "ContextClick";
    L9:
        if (m5092equalsimpl0(arg0, Companion.m5098getGestureEnd5zf0vsI()) == false) goto L12;
        return "GestureEnd";
    L12:
        if (m5092equalsimpl0(arg0, Companion.m5099getGestureThresholdActivate5zf0vsI()) == false) goto L15;
        return "GestureThresholdActivate";
    L15:
        if (m5092equalsimpl0(arg0, Companion.m5100getLongPress5zf0vsI()) == false) goto L18;
        return "LongPress";
    L18:
        if (m5092equalsimpl0(arg0, Companion.m5101getReject5zf0vsI()) == false) goto L21;
        return "Reject";
    L21:
        if (m5092equalsimpl0(arg0, Companion.m5102getSegmentFrequentTick5zf0vsI()) == false) goto L24;
        return "SegmentFrequentTick";
    L24:
        if (m5092equalsimpl0(arg0, Companion.m5103getSegmentTick5zf0vsI()) == false) goto L27;
        return "SegmentTick";
    L27:
        if (m5092equalsimpl0(arg0, Companion.m5104getTextHandleMove5zf0vsI()) == false) goto L30;
        return "TextHandleMove";
    L30:
        if (m5092equalsimpl0(arg0, Companion.m5105getToggleOff5zf0vsI()) == false) goto L33;
        return "ToggleOff";
    L33:
        if (m5092equalsimpl0(arg0, Companion.m5106getToggleOn5zf0vsI()) == false) goto L36;
        return "ToggleOn";
    L36:
        if (m5092equalsimpl0(arg0, Companion.m5107getVirtualKey5zf0vsI()) == false) goto L38;
        return "VirtualKey";
    L38:
        return "Invalid";
    }
}
