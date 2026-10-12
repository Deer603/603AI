package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HoverInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"collectIsHoveredAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HoverInteractionKt {
    public static final State<Boolean> collectIsHoveredAsState(InteractionSource $this$collectIsHoveredAsState, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1206586544, "C(collectIsHoveredAsState)64@2144L34,65@2204L411,65@2183L432:HoverInteraction.kt#ywyzhk");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1206586544, $changed, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 854987972, "CC(remember):HoverInteraction.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        boolean invalid$iv = false;
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState isHovered = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 854990269, "CC(remember):HoverInteraction.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L14;
        if ($composer.changed($this$collectIsHoveredAsState) == false) goto L14;
    L15:
        invalid$iv = true;
    L16:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv2 = (Function2) new HoverInteractionKt$collectIsHoveredAsState$1$1($this$collectIsHoveredAsState, isHovered, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect($this$collectIsHoveredAsState, (Function2) it$iv2, $composer, $changed & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
    L26:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return isHovered;
    L19:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L23;
    L14:
        if (($changed & 6) != 4) goto L16;
        goto L15
    }
}
