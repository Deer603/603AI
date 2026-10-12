package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "(Ljava/lang/String;I)V", "PreEnter", "Visible", "PostExit", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum EnterExitState extends Enum<EnterExitState> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ EnterExitState[] $VALUES = null;
    public static final EnterExitState PostExit = null;
    public static final EnterExitState PreEnter = null;
    public static final EnterExitState Visible = null;

    private static final /* synthetic */ EnterExitState[] $values() {
        return new EnterExitState[]{PreEnter, Visible, PostExit};
    }

    public static EnumEntries<EnterExitState> getEntries() {
        return $ENTRIES;
    }

    public static EnterExitState valueOf(String r1) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, r1);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }

    private EnterExitState(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        PreEnter = new EnterExitState("PreEnter", 0);
        Visible = new EnterExitState("Visible", 1);
        PostExit = new EnterExitState("PostExit", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
