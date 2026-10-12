package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: PausableComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "(Ljava/lang/String;I)V", "Invalid", "Cancelled", "InitialPending", "RecomposePending", "ApplyPending", "Applied", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum PausedCompositionState extends Enum<PausedCompositionState> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PausedCompositionState[] $VALUES = null;
    public static final PausedCompositionState Applied = null;
    public static final PausedCompositionState ApplyPending = null;
    public static final PausedCompositionState Cancelled = null;
    public static final PausedCompositionState InitialPending = null;
    public static final PausedCompositionState Invalid = null;
    public static final PausedCompositionState RecomposePending = null;

    private static final /* synthetic */ PausedCompositionState[] $values() {
        return new PausedCompositionState[]{Invalid, Cancelled, InitialPending, RecomposePending, ApplyPending, Applied};
    }

    public static EnumEntries<PausedCompositionState> getEntries() {
        return $ENTRIES;
    }

    public static PausedCompositionState valueOf(String r1) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, r1);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) $VALUES.clone();
    }

    private PausedCompositionState(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Invalid = new PausedCompositionState("Invalid", 0);
        Cancelled = new PausedCompositionState("Cancelled", 1);
        InitialPending = new PausedCompositionState("InitialPending", 2);
        RecomposePending = new PausedCompositionState("RecomposePending", 3);
        ApplyPending = new PausedCompositionState("ApplyPending", 4);
        Applied = new PausedCompositionState("Applied", 5);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
