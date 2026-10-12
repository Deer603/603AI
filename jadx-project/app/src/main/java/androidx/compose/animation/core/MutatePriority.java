package androidx.compose.animation.core;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/MutatePriority;", "", "(Ljava/lang/String;I)V", Profile.DEFAULT_PROFILE_NAME, "UserInput", "PreventUserInput", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum MutatePriority extends Enum<MutatePriority> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MutatePriority[] $VALUES = null;
    public static final MutatePriority Default = null;
    public static final MutatePriority PreventUserInput = null;
    public static final MutatePriority UserInput = null;

    private static final /* synthetic */ MutatePriority[] $values() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    public static EnumEntries<MutatePriority> getEntries() {
        return $ENTRIES;
    }

    public static MutatePriority valueOf(String r1) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, r1);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }

    private MutatePriority(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Default = new MutatePriority(Profile.DEFAULT_PROFILE_NAME, 0);
        UserInput = new MutatePriority("UserInput", 1);
        PreventUserInput = new MutatePriority("PreventUserInput", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
