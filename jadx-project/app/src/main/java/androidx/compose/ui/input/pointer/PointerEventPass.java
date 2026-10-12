package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "(Ljava/lang/String;I)V", "Initial", "Main", "Final", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum PointerEventPass extends Enum<PointerEventPass> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PointerEventPass[] $VALUES = null;
    public static final PointerEventPass Final = null;
    public static final PointerEventPass Initial = null;
    public static final PointerEventPass Main = null;

    private static final /* synthetic */ PointerEventPass[] $values() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    public static EnumEntries<PointerEventPass> getEntries() {
        return $ENTRIES;
    }

    public static PointerEventPass valueOf(String r1) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, r1);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }

    private PointerEventPass(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Initial = new PointerEventPass("Initial", 0);
        Main = new PointerEventPass("Main", 1);
        Final = new PointerEventPass("Final", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
