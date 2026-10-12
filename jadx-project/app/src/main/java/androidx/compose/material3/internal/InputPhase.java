package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/internal/InputPhase;", "", "(Ljava/lang/String;I)V", "Focused", "UnfocusedEmpty", "UnfocusedNotEmpty", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum InputPhase extends Enum<InputPhase> {
    private static final /* synthetic */ InputPhase[] $VALUES = null;
    public static final InputPhase Focused = null;
    public static final InputPhase UnfocusedEmpty = null;
    public static final InputPhase UnfocusedNotEmpty = null;

    private static final /* synthetic */ InputPhase[] $values() {
        return new InputPhase[]{Focused, UnfocusedEmpty, UnfocusedNotEmpty};
    }

    public static InputPhase valueOf(String r1) {
        return (InputPhase) Enum.valueOf(InputPhase.class, r1);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) $VALUES.clone();
    }

    private InputPhase(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Focused = new InputPhase("Focused", 0);
        UnfocusedEmpty = new InputPhase("UnfocusedEmpty", 1);
        UnfocusedNotEmpty = new InputPhase("UnfocusedNotEmpty", 2);
        $VALUES = $values();
    }
}
