package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class _OneToManyTitlecaseMappingsKt {
    public static final String titlecaseImpl(char $this$titlecaseImpl) {
        String r0 = String.valueOf($this$titlecaseImpl);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.lang.String");
        String uppercase = r0.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(uppercase, "toUpperCase(...)");
        if (uppercase.length() <= 1) goto L10;
        if ($this$titlecaseImpl == 329) goto L11;
        char r2 = uppercase.charAt(0);
        Intrinsics.checkNotNull(uppercase, "null cannot be cast to non-null type java.lang.String");
        String r3 = uppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(r3, "substring(...)");
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type java.lang.String");
        String r1 = r3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r1, "toLowerCase(...)");
        return r2 + r1;
    L11:
        return uppercase;
    L10:
        return String.valueOf(Character.toTitleCase($this$titlecaseImpl));
    }
}
