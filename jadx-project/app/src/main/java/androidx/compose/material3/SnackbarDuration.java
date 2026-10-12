package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/SnackbarDuration;", "", "(Ljava/lang/String;I)V", "Short", "Long", "Indefinite", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum SnackbarDuration extends Enum<SnackbarDuration> {
    private static final /* synthetic */ SnackbarDuration[] $VALUES = null;
    public static final SnackbarDuration Indefinite = null;
    public static final SnackbarDuration Long = null;
    public static final SnackbarDuration Short = null;

    private static final /* synthetic */ SnackbarDuration[] $values() {
        return new SnackbarDuration[]{Short, Long, Indefinite};
    }

    public static SnackbarDuration valueOf(String r1) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, r1);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }

    private SnackbarDuration(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Short = new SnackbarDuration("Short", 0);
        Long = new SnackbarDuration("Long", 1);
        Indefinite = new SnackbarDuration("Indefinite", 2);
        $VALUES = $values();
    }
}
