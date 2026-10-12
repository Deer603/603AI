package kotlin.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum RequireKotlinVersionKind extends Enum<RequireKotlinVersionKind> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ RequireKotlinVersionKind[] $VALUES = null;
    public static final RequireKotlinVersionKind API_VERSION = null;
    public static final RequireKotlinVersionKind COMPILER_VERSION = null;
    public static final RequireKotlinVersionKind LANGUAGE_VERSION = null;

    private static final /* synthetic */ RequireKotlinVersionKind[] $values() {
        return new RequireKotlinVersionKind[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    public static EnumEntries<RequireKotlinVersionKind> getEntries() {
        return $ENTRIES;
    }

    public static RequireKotlinVersionKind valueOf(String r1) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, r1);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) $VALUES.clone();
    }

    private RequireKotlinVersionKind(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        LANGUAGE_VERSION = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        COMPILER_VERSION = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
        API_VERSION = new RequireKotlinVersionKind("API_VERSION", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
