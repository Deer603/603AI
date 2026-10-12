package androidx.compose.material3.carousel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: CarouselState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberCarouselState", "Landroidx/compose/material3/carousel/CarouselState;", "initialItem", "", "itemCount", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/carousel/CarouselState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CarouselStateKt {
    public static final CarouselState rememberCarouselState(final int initialItem, final Function0<Integer> r10, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, -217285684, "C(rememberCarouselState)*103@3725L181,103@3679L227:CarouselState.kt#dcf9yb");
        boolean r1 = true;
        if ((r13 & 1) == 0) goto L6;
        initialItem = 0;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-217285684, $changed, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:102)");
    L8:
        Object[] r2 = new Object[0];
        Saver<CarouselState, ?> r3 = CarouselState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, -1536566770, "CC(remember):CarouselState.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(initialItem) == false) goto L13;
    L14:
        boolean r0 = true;
    L17:
        if ((($changed & 112) ^ 48) <= 32) goto L21;
        if ($composer.changed(r10) == false) goto L21;
    L24:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L27;
    L30:
        Object value$iv = (Function0) new CarouselStateKt$rememberCarouselState$1$1(initialItem, r10);
        $composer.updateRememberedValue(value$iv);
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object r11 = RememberSaveableKt.m3923rememberSaveable(r2, r3, null, (Function0) value$iv, $composer, 0, 4);
        CarouselState $this$rememberCarouselState_u24lambda_u241 = (CarouselState) r11;
        $this$rememberCarouselState_u24lambda_u241.getItemCountState().setValue(r10);
        CarouselState r12 = (CarouselState) r11;
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventEnd();
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L27:
        if (it$iv == Composer.Companion.getEmpty()) goto L30;
        value$iv = it$iv;
    L21:
        if (($changed & 48) == 32) goto L24;
        r1 = false;
    L13:
        if (($changed & 6) == 4) goto L14;
        r0 = false;
        goto L17
    }
}
