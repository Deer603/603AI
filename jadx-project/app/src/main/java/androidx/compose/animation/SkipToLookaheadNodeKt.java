package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkipToLookaheadNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DefaultEnabled", "Lkotlin/Function0;", "", "createContentScaleModifier", "Landroidx/compose/ui/Modifier;", "scaleToBounds", "Landroidx/compose/animation/ScaleToBoundsImpl;", "isEnabled", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SkipToLookaheadNodeKt {
    private static final Function0<Boolean> DefaultEnabled = null;

    public static final /* synthetic */ Function0 access$getDefaultEnabled$p() {
        return DefaultEnabled;
    }

    static {
        DefaultEnabled = SkipToLookaheadNodeKt$DefaultEnabled$1.INSTANCE;
    }

    public static final Modifier createContentScaleModifier(Modifier $this$createContentScaleModifier, ScaleToBoundsImpl scaleToBounds, final Function0<Boolean> r4) {
        if (Intrinsics.areEqual(scaleToBounds.getContentScale(), ContentScale.Companion.getCrop()) == false) goto L5;
        Modifier.Companion r0 = GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new AnonymousClass1(r4));
    L7:
        return $this$createContentScaleModifier.then(r0).then(new SkipToLookaheadElement(scaleToBounds, r4));
    L5:
        r0 = Modifier.Companion;
        goto L7
    }
}
