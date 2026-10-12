package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "FlowLayout overflow is no longer maintained")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u001aB\u0087\u0001\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00120\b\u0002\u0010\u0007\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\b\u00120\b\u0002\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\b¢\u0006\u0002\u0010\u0011J.\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0017\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u0016H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0019R6\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0007\u001a*\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "minLinesToShowCollapse", "", "minCrossAxisSizeToShowCollapse", "seeMoreGetter", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "collapseGetter", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "addOverflowComposables", "list", "", "addOverflowComposables$foundation_layout_release", "createOverflowState", "createOverflowState$foundation_layout_release", "OverflowType", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> seeMoreGetter;
    private final OverflowType type;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "(Ljava/lang/String;I)V", "Visible", "Clip", "ExpandIndicator", "ExpandOrCollapseIndicator", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum OverflowType extends Enum<OverflowType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ OverflowType[] $VALUES = null;
        public static final OverflowType Clip = null;
        public static final OverflowType ExpandIndicator = null;
        public static final OverflowType ExpandOrCollapseIndicator = null;
        public static final OverflowType Visible = null;

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        public static EnumEntries<OverflowType> getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String r1) {
            return (OverflowType) Enum.valueOf(OverflowType.class, r1);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }

        private OverflowType(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            Visible = new OverflowType("Visible", 0);
            Clip = new OverflowType("Clip", 1);
            ExpandIndicator = new OverflowType("ExpandIndicator", 2);
            ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[OverflowType.values().length];
            r0[OverflowType.ExpandIndicator.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType r1, int r2, int r3, Function1 r4, Function1 r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowLayoutOverflow(OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> r4, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> r5) {
        this.type = type;
        this.minLinesToShowCollapse = minLinesToShowCollapse;
        this.minCrossAxisSizeToShowCollapse = minCrossAxisSizeToShowCollapse;
        this.seeMoreGetter = r4;
        this.collapseGetter = r5;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType r9, int r10, int r11, Function1 r12, Function1 r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 2) == 0) goto L5;
        int r3 = 0;
    L7:
        if ((r14 & 4) == 0) goto L9;
        int r4 = 0;
    L11:
        if ((r14 & 8) == 0) goto L13;
        Function1 r5 = null;
    L15:
        if ((r14 & 16) == 0) goto L17;
        Function1 r6 = null;
    L18:
        this(r9, r3, r4, r5, r6, null);
        return;
    L17:
        r6 = r13;
        goto L18
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    public final OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final void addOverflowComposables$foundation_layout_release(FlowLayoutOverflowState state, List<Function2<Composer, Integer, Unit>> r6) {
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> r0 = this.seeMoreGetter;
        Function2<Composer, Integer, Unit> r1 = null;
        if (r0 == null) goto L5;
        Function2<Composer, Integer, Unit> r3 = r0.invoke(state);
    L6:
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> r2 = this.collapseGetter;
        if (r2 == null) goto L10;
        r1 = r2.invoke(state);
    L10:
        switch(WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1: goto L16;
            case 2: goto L12;
            default: goto L22;
        };
    L12:
        if (r3 == null) goto L14;
        r6.add(r3);
    L14:
        if (r1 == null) goto L19;
        r6.add(r1);
        return;
    L19:
        return;
    L16:
        if (r3 == null) goto L21;
        r6.add(r3);
        return;
    L21:
        return;
    L22:
        return;
    L5:
        r3 = null;
        goto L6
    }
}
