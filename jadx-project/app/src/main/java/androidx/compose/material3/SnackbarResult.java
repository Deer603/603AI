package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/SnackbarResult;", "", "(Ljava/lang/String;I)V", "Dismissed", "ActionPerformed", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum SnackbarResult extends Enum<SnackbarResult> {
    private static final /* synthetic */ SnackbarResult[] $VALUES = null;
    public static final SnackbarResult ActionPerformed = null;
    public static final SnackbarResult Dismissed = null;

    private static final /* synthetic */ SnackbarResult[] $values() {
        return new SnackbarResult[]{Dismissed, ActionPerformed};
    }

    public static SnackbarResult valueOf(String r1) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, r1);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) $VALUES.clone();
    }

    private SnackbarResult(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Dismissed = new SnackbarResult("Dismissed", 0);
        ActionPerformed = new SnackbarResult("ActionPerformed", 1);
        $VALUES = $values();
    }
}
