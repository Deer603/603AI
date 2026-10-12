package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001ad\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000f\u001aZ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0010\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0013\u001aP\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"produceState", "Landroidx/compose/runtime/State;", "T", "initialValue", "key1", "", "key2", "key3", "producer", "Lkotlin/Function2;", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "keys", "", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final <T> State<T> produceState(T r10, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 10454275, "C(produceState)75@2894L41,76@2961L62,76@2940L83:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(10454275, $changed, -1, "androidx.compose.runtime.produceState (ProduceState.kt:74)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 2142999697, "CC(remember):ProduceState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r10, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState result = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Unit r2 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 2143001862, "CC(remember):ProduceState.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(r11);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = (Function2) new SnapshotStateKt__ProduceStateKt$produceState$1$1(r11, result, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r2, (Function2) it$iv2, $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return result;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }

    public static final <T> State<T> produceState(T r9, Object key1, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1928268701, "C(produceState)105@4191L41,106@4258L62,106@4237L83:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1928268701, $changed, -1, "androidx.compose.runtime.produceState (ProduceState.kt:104)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 2143041201, "CC(remember):ProduceState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r9, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState result = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 2143043366, "CC(remember):ProduceState.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(r11);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = (Function2) new SnapshotStateKt__ProduceStateKt$produceState$2$1(r11, result, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(key1, (Function2) it$iv2, $composer, ($changed >> 3) & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return result;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }

    public static final <T> State<T> produceState(T r9, Object key1, Object key2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r12, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1703169085, "C(produceState)136@5524L41,137@5597L62,137@5570L89:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1703169085, $changed, -1, "androidx.compose.runtime.produceState (ProduceState.kt:135)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 2143083857, "CC(remember):ProduceState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r9, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState result = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 2143086214, "CC(remember):ProduceState.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(r12);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = (Function2) new SnapshotStateKt__ProduceStateKt$produceState$3$1(r12, result, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(key1, key2, (Function2) it$iv2, $composer, (($changed >> 3) & 14) | (($changed >> 3) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return result;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }

    public static final <T> State<T> produceState(T r12, Object key1, Object key2, Object key3, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r16, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1807205155, "C(produceState)168@6894L41,169@6973L62,169@6940L95:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1807205155, $changed, -1, "androidx.compose.runtime.produceState (ProduceState.kt:167)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 2143127697, "CC(remember):ProduceState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r12, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState result = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 2143130246, "CC(remember):ProduceState.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(r16);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = (Function2) new SnapshotStateKt__ProduceStateKt$produceState$4$1(r16, result, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(key1, key2, key3, (Function2) it$iv2, $composer, ((($changed >> 3) & 14) | (($changed >> 3) & 112)) | (($changed >> 3) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return result;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }

    public static final <T> State<T> produceState(T r10, Object[] keys, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r12, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 490154582, "C(produceState)198@8209L41,200@8353L62,200@8325L90:ProduceState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(490154582, $changed, -1, "androidx.compose.runtime.produceState (ProduceState.kt:197)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 2143169777, "CC(remember):ProduceState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r10, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState result = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object[] r2 = Arrays.copyOf(keys, keys.length);
        ComposerKt.sourceInformationMarkerStart($composer, 2143174406, "CC(remember):ProduceState.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(r12);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = (Function2) new SnapshotStateKt__ProduceStateKt$produceState$5$1(r12, result, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r2, (Function2) it$iv2, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return result;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }
}
