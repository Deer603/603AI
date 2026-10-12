package androidx.lifecycle;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MethodCallsLogger.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0017R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "<init>", "()V", "calledMethods", "", "", "", "approveCall", "", HintConstants.AUTOFILL_HINT_NAME, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods;

    public MethodCallsLogger() {
        this.calledMethods = new HashMap();
    }

    public boolean approveCall(String name, int type) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        Integer nullableMask = this.calledMethods.get(name);
        if (nullableMask == null) goto L5;
        int mask = nullableMask.intValue();
    L7:
        if ((mask & type) == 0) goto L9;
        boolean wasCalled = true;
    L10:
        this.calledMethods.put(name, Integer.valueOf(mask | type));
        if (wasCalled == false) goto L13;
        return false;
    L13:
        return true;
    L9:
        wasCalled = false;
        goto L10
    L5:
        mask = 0;
        goto L7
    }
}
