package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "", "(Ljava/lang/String;I)V", "Filled", "Outlined", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum TextFieldType extends Enum<TextFieldType> {
    private static final /* synthetic */ TextFieldType[] $VALUES = null;
    public static final TextFieldType Filled = null;
    public static final TextFieldType Outlined = null;

    private static final /* synthetic */ TextFieldType[] $values() {
        return new TextFieldType[]{Filled, Outlined};
    }

    public static TextFieldType valueOf(String r1) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, r1);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }

    private TextFieldType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Filled = new TextFieldType("Filled", 0);
        Outlined = new TextFieldType("Outlined", 1);
        $VALUES = $values();
    }
}
