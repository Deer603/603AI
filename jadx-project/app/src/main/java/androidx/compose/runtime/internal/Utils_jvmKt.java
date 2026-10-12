package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Utils.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\nH\u0000¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"identityHashCode", "", "instance", "", "invokeComposable", "", "composer", "Landroidx/compose/runtime/Composer;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utils_jvmKt {
    public static final int identityHashCode(Object instance) {
        return System.identityHashCode(instance);
    }

    public static final void invokeComposable(Composer composer, Function2<? super Composer, ? super Integer, Unit> r3) {
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        Function2 realFn = (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 2);
        realFn.invoke(composer, 1);
    }
}
