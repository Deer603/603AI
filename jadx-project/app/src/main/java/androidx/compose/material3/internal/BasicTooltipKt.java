package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicTooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001\u001a+\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BasicTooltipState", "Landroidx/compose/material3/TooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BasicTooltipKt {
    public static final TooltipState rememberBasicTooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, -1483057531, "C(rememberBasicTooltipState)88@4062L215:BasicTooltip.kt#mqatfk");
        if ((r11 & 1) == 0) goto L6;
        initialIsVisible = false;
    L6:
        if ((r11 & 2) == 0) goto L9;
        isPersistent = true;
    L9:
        if ((r11 & 4) == 0) goto L12;
        mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(-1483057531, $changed, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:88)");
    L14:
        ComposerKt.sourceInformationMarkerStart($composer, -1300278280, "CC(remember):BasicTooltip.kt#9igjgp");
        boolean r0 = false;
        if ((($changed & 112) ^ 48) <= 32) goto L19;
        if ($composer.changed(isPersistent) == false) goto L19;
    L20:
        boolean r12 = true;
    L23:
        if ((($changed & 896) ^ 384) <= 256) goto L27;
        if ($composer.changed(mutatorMutex) == false) goto L27;
    L28:
        r0 = true;
    L29:
        boolean invalid$iv = r12 | r0;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L32;
    L35:
        Object value$iv = new BasicTooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
        $composer.updateRememberedValue(value$iv);
    L36:
        BasicTooltipStateImpl r5 = (BasicTooltipStateImpl) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L32:
        if (it$iv == Composer.Companion.getEmpty()) goto L35;
        value$iv = it$iv;
    L27:
        if (($changed & 384) != 256) goto L29;
    L19:
        if (($changed & 48) == 32) goto L20;
        r12 = false;
        goto L23
    }

    public static /* synthetic */ TooltipState BasicTooltipState$default(boolean r0, boolean r1, MutatorMutex r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = false;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = true;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
    L12:
        return BasicTooltipState(r0, r1, r2);
    }

    public static final TooltipState BasicTooltipState(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(initialIsVisible, isPersistent, mutatorMutex);
    }
}
