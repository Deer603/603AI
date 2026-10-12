package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AnimationEndReason.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "(Ljava/lang/String;I)V", "BoundReached", "Finished", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum AnimationEndReason extends Enum<AnimationEndReason> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AnimationEndReason[] $VALUES = null;
    public static final AnimationEndReason BoundReached = null;
    public static final AnimationEndReason Finished = null;

    private static final /* synthetic */ AnimationEndReason[] $values() {
        return new AnimationEndReason[]{BoundReached, Finished};
    }

    public static EnumEntries<AnimationEndReason> getEntries() {
        return $ENTRIES;
    }

    public static AnimationEndReason valueOf(String r1) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, r1);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) $VALUES.clone();
    }

    private AnimationEndReason(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        BoundReached = new AnimationEndReason("BoundReached", 0);
        Finished = new AnimationEndReason("Finished", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
