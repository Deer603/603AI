package androidx.core.content;

import androidx.core.util.Predicate;
import androidx.core.view.MotionEventCompat;
import com.android.tools.r8.annotations.LambdaMethod;
import com.android.tools.r8.annotations.SynthesizedClassV2;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
@LambdaMethod(holder = "Ljava/lang/String;", method = "equals", proto = "(Ljava/lang/Object;)Z")
@SynthesizedClassV2(apiLevel = -2, kind = MotionEventCompat.AXIS_RELATIVE_Y, versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007")
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda10 implements Predicate {
    public final /* synthetic */ String f$0;

    public /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda10(String r1) {
        this.f$0 = r1;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object r2) {
        return IntentSanitizer.Builder.$r8$lambda$DvjTS4tHjUqRA2QfyccBu7fhDzE(this.f$0, (String) r2);
    }
}
