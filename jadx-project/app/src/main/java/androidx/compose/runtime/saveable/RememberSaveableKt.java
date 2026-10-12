package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a>\u0010\u0006\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b0\u0007\"\u0004\b\u0000\u0010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007H\u0002\u001aa\u0010\u000b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00052\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\r\"\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\t0\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001ag\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\r\"\u0004\u0018\u00010\u00052\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0006\b\u0001\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0011H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"MaxSupportedRadix", "", "generateCannotBeSavedErrorMessage", "", "value", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "inner", "rememberSaveable", "inputs", "", "saver", "key", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 0;

    public static final /* synthetic */ void access$requireCanBeSaved(SaveableStateRegistry $receiver, Object value) {
        requireCanBeSaved($receiver, value);
    }

    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m3923rememberSaveable(final Object[] r21, Saver<T, ? extends Object> r22, String r23, Function0<? extends T> r24, Composer r25, int r26, int r27) {
        ComposerKt.sourceInformationMarkerStart(r25, 441892779, "C(rememberSaveable)P(1,3,2)71@3283L23,81@3649L7,83@3675L293,91@4054L59,91@4043L70:RememberSaveable.kt#r2ddri");
        if ((r27 & 2) == 0) goto L5;
        Saver<T, ? extends Object> r1 = SaverKt.autoSaver();
    L7:
        if ((r27 & 4) == 0) goto L9;
        String r9 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(441892779, r26, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
    L13:
        int r11 = ComposablesKt.getCurrentCompositeKeyHash(r25, 0);
        String r0 = r9;
        boolean r6 = true;
        if (r0 != null) goto L16;
    L19:
        boolean r2 = true;
    L20:
        if (r2 == true) goto L22;
        String r3 = r9;
    L23:
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        ProvidableCompositionLocal<SaveableStateRegistry> r4 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart(r25, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = r25.consume(r4);
        ComposerKt.sourceInformationMarkerEnd(r25);
        final SaveableStateRegistry r7 = (SaveableStateRegistry) r5;
        ComposerKt.sourceInformationMarkerStart(r25, -1519361399, "CC(remember):RememberSaveable.kt#9igjgp");
        Object r8 = r25.rememberedValue();
        if (r8 == Composer.Companion.getEmpty()) goto L26;
        Object[] r10 = r21;
    L37:
        final SaveableHolder r12 = (SaveableHolder) r8;
        ComposerKt.sourceInformationMarkerEnd(r25);
        Object r13 = r12.getValueIfInputsDidntChange(r10);
        if (r13 != null) goto L40;
        r13 = r24.invoke();
    L40:
        ComposerKt.sourceInformationMarkerStart(r25, -1519349505, "CC(remember):RememberSaveable.kt#9igjgp");
        boolean r14 = r25.changedInstance(r12);
        if (((r26 & 112) ^ 48) <= 32) goto L45;
        if (r25.changedInstance(r1) == false) goto L45;
    L48:
        boolean r15 = r25.changedInstance(r10) | ((((r6 | r14) | r25.changedInstance(r7)) | r25.changed(r3)) | r25.changedInstance(r13));
        Object r16 = r25.rememberedValue();
        if (r15 == false) goto L51;
    L54:
        final T r17 = (T) r13;
        final String r18 = r3;
        final Saver<T, ? extends Object> r19 = r1;
        Function0<Unit> r20 = new RememberSaveableKt$rememberSaveable$1$1(r12, r19, r7, r18, r17, r21);
        r25.updateRememberedValue(r20);
        r16 = r20;
    L55:
        ComposerKt.sourceInformationMarkerEnd(r25);
        EffectsKt.SideEffect((Function0) r16, r25, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventEnd();
    L58:
        ComposerKt.sourceInformationMarkerEnd(r25);
        return r17;
    L51:
        if (r16 == Composer.Companion.getEmpty()) goto L54;
        r17 = (T) r13;
    L45:
        if ((r26 & 48) == 32) goto L48;
        r6 = false;
        goto L48
    L26:
        if (r7 == null) goto L30;
        Object r28 = r7.consumeRestored(r3);
        if (r28 == null) goto L30;
        Object r29 = r1.restore(r28);
    L31:
        Object r110 = r29;
        if (r110 != null) goto L34;
        Object r30 = r24.invoke();
    L35:
        r10 = r21;
        r8 = new SaveableHolder(r1, r7, r3, r30, r10);
        r25.updateRememberedValue(r8);
        goto L37
    L34:
        r30 = r110;
    L30:
        r29 = null;
        goto L31
    L22:
        String r31 = Integer.toString(r11, CharsKt.checkRadix(MaxSupportedRadix));
        Intrinsics.checkNotNullExpressionValue(r31, "toString(...)");
        r3 = r31;
        goto L23
    L16:
        if (r0.length() == 0) goto L19;
        r2 = false;
        goto L20
    L9:
        r9 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] inputs, Saver<T, ? extends Object> r9, String key, Function0<? extends MutableState<T>> r11, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -202053668, "C(rememberSaveable)P(1,3,2)124@5517L88:RememberSaveable.kt#r2ddri");
        if ((r14 & 4) == 0) goto L5;
        String key2 = null;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-202053668, $changed, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:124)");
    L9:
        MutableState<T> r10 = (MutableState) m3923rememberSaveable(Arrays.copyOf(inputs, inputs.length), mutableStateSaver(r9), key2, r11, $composer, ($changed & 896) | ($changed & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L5:
        key2 = key;
        goto L7
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> r4) {
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(r4), new RememberSaveableKt$mutableStateSaver$1$2(r4));
    }

    private static final void requireCanBeSaved(SaveableStateRegistry $this$requireCanBeSaved, Object value) {
        if (value != null) goto L4;
        return;
    L4:
        if ($this$requireCanBeSaved.canBeSaved(value) == false) goto L6;
        return;
    L6:
        if ((value instanceof SnapshotMutableState) == true) goto L8;
        String r1 = generateCannotBeSavedErrorMessage(value);
    L17:
        throw new IllegalArgumentException(r1);
    L8:
        if (((SnapshotMutableState) value).getPolicy() != SnapshotStateKt.neverEqualPolicy()) goto L10;
    L14:
        r1 = "MutableState containing " + ((SnapshotMutableState) value).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
        goto L17
    L10:
        if (((SnapshotMutableState) value).getPolicy() == SnapshotStateKt.structuralEqualityPolicy()) goto L14;
        if (((SnapshotMutableState) value).getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) goto L14;
        r1 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
        goto L17
    }

    public static final String generateCannotBeSavedErrorMessage(Object value) {
        return value + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    static {
        MaxSupportedRadix = 36;
    }
}
