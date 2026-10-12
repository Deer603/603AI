package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "(Ljava/lang/String;I)V", "Cursor", "SelectionStart", "SelectionEnd", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum Handle extends Enum<Handle> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ Handle[] $VALUES = null;
    public static final Handle Cursor = null;
    public static final Handle SelectionEnd = null;
    public static final Handle SelectionStart = null;

    private static final /* synthetic */ Handle[] $values() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    public static EnumEntries<Handle> getEntries() {
        return $ENTRIES;
    }

    public static Handle valueOf(String r1) {
        return (Handle) Enum.valueOf(Handle.class, r1);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }

    private Handle(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Cursor = new Handle("Cursor", 0);
        SelectionStart = new Handle("SelectionStart", 1);
        SelectionEnd = new Handle("SelectionEnd", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
