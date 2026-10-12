package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "(Ljava/lang/String;I)V", "Restart", "Reverse", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum RepeatMode extends Enum<RepeatMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ RepeatMode[] $VALUES = null;
    public static final RepeatMode Restart = null;
    public static final RepeatMode Reverse = null;

    private static final /* synthetic */ RepeatMode[] $values() {
        return new RepeatMode[]{Restart, Reverse};
    }

    public static EnumEntries<RepeatMode> getEntries() {
        return $ENTRIES;
    }

    public static RepeatMode valueOf(String r1) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, r1);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) $VALUES.clone();
    }

    private RepeatMode(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Restart = new RepeatMode("Restart", 0);
        Reverse = new RepeatMode("Reverse", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
