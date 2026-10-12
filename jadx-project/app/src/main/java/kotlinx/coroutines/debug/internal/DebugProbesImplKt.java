package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"repr", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DebugProbesImplKt {
    public static final /* synthetic */ String access$repr(String $receiver) {
        return repr($receiver);
    }

    private static final String repr(String $this$repr) {
        StringBuilder $this$repr_u24lambda_u240 = new StringBuilder();
        $this$repr_u24lambda_u240.append(Typography.quote);
        int r4 = $this$repr.length();
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L24;
        char c = $this$repr.charAt(r5);
        if (c != '\"') goto L8;
        $this$repr_u24lambda_u240.append("\\\"");
    L23:
        r5 = r5 + 1;
        goto L3
    L8:
        if (c != '\\') goto L11;
        $this$repr_u24lambda_u240.append("\\\\");
        goto L23
    L11:
        if (c != '\b') goto L14;
        $this$repr_u24lambda_u240.append("\\b");
        goto L23
    L14:
        if (c != '\n') goto L17;
        $this$repr_u24lambda_u240.append("\\n");
        goto L23
    L17:
        if (c != '\r') goto L20;
        $this$repr_u24lambda_u240.append("\\r");
        goto L23
    L20:
        if (c != '\t') goto L22;
        $this$repr_u24lambda_u240.append("\\t");
        goto L23
    L22:
        $this$repr_u24lambda_u240.append(c);
        goto L23
    L24:
        $this$repr_u24lambda_u240.append(Typography.quote);
        String r0 = $this$repr_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
