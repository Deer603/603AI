package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: SwipeToDismissBox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart", "Settled", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum SwipeToDismissBoxValue extends Enum<SwipeToDismissBoxValue> {
    private static final /* synthetic */ SwipeToDismissBoxValue[] $VALUES = null;
    public static final SwipeToDismissBoxValue EndToStart = null;
    public static final SwipeToDismissBoxValue Settled = null;
    public static final SwipeToDismissBoxValue StartToEnd = null;

    private static final /* synthetic */ SwipeToDismissBoxValue[] $values() {
        return new SwipeToDismissBoxValue[]{StartToEnd, EndToStart, Settled};
    }

    public static SwipeToDismissBoxValue valueOf(String r1) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, r1);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) $VALUES.clone();
    }

    private SwipeToDismissBoxValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        StartToEnd = new SwipeToDismissBoxValue("StartToEnd", 0);
        EndToStart = new SwipeToDismissBoxValue("EndToStart", 1);
        Settled = new SwipeToDismissBoxValue("Settled", 2);
        $VALUES = $values();
    }
}
