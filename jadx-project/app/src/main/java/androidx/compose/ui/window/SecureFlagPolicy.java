package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "(Ljava/lang/String;I)V", "Inherit", "SecureOn", "SecureOff", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum SecureFlagPolicy extends Enum<SecureFlagPolicy> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES = null;
    public static final SecureFlagPolicy Inherit = null;
    public static final SecureFlagPolicy SecureOff = null;
    public static final SecureFlagPolicy SecureOn = null;

    private static final /* synthetic */ SecureFlagPolicy[] $values() {
        return new SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }

    public static EnumEntries<SecureFlagPolicy> getEntries() {
        return $ENTRIES;
    }

    public static SecureFlagPolicy valueOf(String r1) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, r1);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }

    private SecureFlagPolicy(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Inherit = new SecureFlagPolicy("Inherit", 0);
        SecureOn = new SecureFlagPolicy("SecureOn", 1);
        SecureOff = new SecureFlagPolicy("SecureOff", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
