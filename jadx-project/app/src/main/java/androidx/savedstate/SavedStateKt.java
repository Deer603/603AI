package androidx.savedstate;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"androidx/savedstate/SavedStateKt__SavedStateKt", "androidx/savedstate/SavedStateKt__SavedState_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class SavedStateKt {
    public static final <T> T read(Bundle r1, Function1<? super SavedStateReader, ? extends T> r2) {
        return (T) SavedStateKt__SavedStateKt.read(r1, r2);
    }

    public static final Bundle savedState(Bundle initialState, Function1<? super SavedStateWriter, Unit> r2) {
        return SavedStateKt__SavedState_androidKt.savedState(initialState, r2);
    }

    public static final Bundle savedState(Map<String, ? extends Object> r1, Function1<? super SavedStateWriter, Unit> r2) {
        return SavedStateKt__SavedState_androidKt.savedState(r1, r2);
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, Function1 builderAction, int r2, Object r3) {
        return SavedStateKt__SavedState_androidKt.savedState$default(initialState, builderAction, r2, r3);
    }

    public static /* synthetic */ Bundle savedState$default(Map initialState, Function1 builderAction, int r2, Object r3) {
        return SavedStateKt__SavedState_androidKt.savedState$default(initialState, builderAction, r2, r3);
    }

    public static final <T> T write(Bundle r1, Function1<? super SavedStateWriter, ? extends T> r2) {
        return (T) SavedStateKt__SavedStateKt.write(r1, r2);
    }
}
