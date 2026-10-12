package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0010\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FlowExtKt {
    public static final <T> State<T> collectAsStateWithLifecycle(StateFlow<? extends T> r9, LifecycleOwner lifecycleOwner, Lifecycle.State minActiveState, CoroutineContext context, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 743249048, "C(collectAsStateWithLifecycle)P(1,2)58@2561L7,62@2705L182:FlowExt.kt#2vxrgp");
        if ((r15 & 1) == 0) goto L6;
        ProvidableCompositionLocal<LifecycleOwner> r1 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        lifecycleOwner = (LifecycleOwner) r4;
    L6:
        if ((r15 & 2) == 0) goto L8;
        Lifecycle.State minActiveState2 = Lifecycle.State.STARTED;
        Lifecycle.State minActiveState3 = minActiveState2;
    L10:
        if ((r15 & 4) == 0) goto L12;
        CoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext context3 = context2;
    L14:
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventStart(743249048, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
    L16:
        State<T> r11 = collectAsStateWithLifecycle(r9, r9.getValue(), lifecycleOwner.getLifecycle(), minActiveState3, context3, $composer, (($changed & 14) | (($changed << 3) & 7168)) | (57344 & ($changed << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L12:
        context3 = context;
        goto L14
    L8:
        minActiveState3 = minActiveState;
        goto L10
    }

    public static final <T> State<T> collectAsStateWithLifecycle(StateFlow<? extends T> r9, Lifecycle lifecycle, Lifecycle.State minActiveState, CoroutineContext context, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -1858162195, "C(collectAsStateWithLifecycle)P(1,2)99@4351L167:FlowExt.kt#2vxrgp");
        if ((r15 & 2) == 0) goto L5;
        Lifecycle.State minActiveState2 = Lifecycle.State.STARTED;
        Lifecycle.State minActiveState3 = minActiveState2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        CoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext context3 = context2;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1858162195, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
    L13:
        State<T> r10 = collectAsStateWithLifecycle(r9, r9.getValue(), lifecycle, minActiveState3, context3, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (57344 & ($changed << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L9:
        context3 = context;
        goto L11
    L5:
        minActiveState3 = minActiveState;
        goto L7
    }

    public static final <T> State<T> collectAsStateWithLifecycle(Flow<? extends T> r10, T r11, LifecycleOwner lifecycleOwner, Lifecycle.State minActiveState, CoroutineContext context, Composer $composer, int $changed, int r17) {
        ComposerKt.sourceInformationMarkerStart($composer, -1485997211, "C(collectAsStateWithLifecycle)P(1,2,3)134@5911L7,138@6055L184:FlowExt.kt#2vxrgp");
        if ((r17 & 2) == 0) goto L6;
        ProvidableCompositionLocal<LifecycleOwner> r2 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        lifecycleOwner = (LifecycleOwner) r5;
    L6:
        if ((r17 & 4) == 0) goto L8;
        Lifecycle.State minActiveState2 = Lifecycle.State.STARTED;
        Lifecycle.State minActiveState3 = minActiveState2;
    L10:
        if ((r17 & 8) == 0) goto L12;
        CoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext context3 = context2;
    L14:
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventStart(-1485997211, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
    L16:
        State<T> r13 = collectAsStateWithLifecycle(r10, r11, lifecycleOwner.getLifecycle(), minActiveState3, context3, $composer, (((($changed & 14) | ((($changed >> 3) & 8) << 3)) | ($changed & 112)) | ($changed & 7168)) | (57344 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L12:
        context3 = context;
        goto L14
    L8:
        minActiveState3 = minActiveState;
        goto L10
    }

    public static final <T> State<T> collectAsStateWithLifecycle(Flow<? extends T> r15, T r16, Lifecycle lifecycle, Lifecycle.State minActiveState, CoroutineContext context, Composer $composer, int $changed, int r22) {
        ComposerKt.sourceInformationMarkerStart($composer, 1977777920, "C(collectAsStateWithLifecycle)P(1,2,3)175@7714L383,175@7645L452:FlowExt.kt#2vxrgp");
        if ((r22 & 4) == 0) goto L5;
        Lifecycle.State minActiveState2 = Lifecycle.State.STARTED;
    L7:
        if ((r22 & 8) == 0) goto L9;
        EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(1977777920, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
    L13:
        Object[] r8 = {r15, lifecycle, minActiveState2, context2};
        ComposerKt.sourceInformationMarkerStart($composer, -2025920321, "CC(remember):FlowExt.kt#9igjgp");
        boolean r0 = $composer.changedInstance(lifecycle);
        if ((($changed & 7168) ^ 3072) <= 2048) goto L18;
        if ($composer.changed(minActiveState2.ordinal()) == false) goto L18;
    L19:
        boolean r4 = true;
    L21:
        boolean invalid$iv = ((r0 | r4) | $composer.changedInstance(context2)) | $composer.changedInstance(r15);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L24;
    L27:
        FlowExtKt$collectAsStateWithLifecycle$1$1 value$iv = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, minActiveState2, context2, r15, null);
        $composer.updateRememberedValue(value$iv);
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        State<T> r1 = SnapshotStateKt.produceState(r16, r8, (Function2) value$iv, $composer, (($changed >> 3) & 8) | (($changed >> 3) & 14));
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L24:
        if (it$iv == Composer.Companion.getEmpty()) goto L27;
        value$iv = it$iv;
    L18:
        if (($changed & 3072) == 2048) goto L19;
        r4 = false;
        goto L21
    L9:
        context2 = context;
        goto L11
    L5:
        minActiveState2 = minActiveState;
        goto L7
    }
}
