package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\f\u0010\u001d\u001a\u00020\u0013*\u00020\u001eH\u0016R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ripples", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/material/ripple/RippleAnimation;", "addRipple", "", "interaction", "size", "Landroidx/compose/ui/geometry/Size;", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "onDetach", "removeRipple", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 0;
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    static {
        $stable = 8;
    }

    public /* synthetic */ CommonRippleNode(InteractionSource r1, boolean r2, float r3, ColorProducer r4, Function0 r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static final /* synthetic */ MutableScatterMap access$getRipples$p(CommonRippleNode $this) {
        return $this.ripples;
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean bounded, float radius, ColorProducer color, Function0<RippleAlpha> r12) {
        super(interactionSource, bounded, radius, color, r12, null);
        this.ripples = new MutableScatterMap(0, 1, null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: addRipple-12SF9DM */
    public void mo1863addRipple12SF9DM(PressInteraction.Press interaction, long size, float targetRadius) {
        ScatterMap this_$iv = this.ripples;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L20;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L15;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L14;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r110 = k$iv[index$iv$iv];
        RippleAnimation ripple = (RippleAnimation) v$iv[index$iv$iv];
        PressInteraction.Press r111 = (PressInteraction.Press) r110;
        ripple.finish();
    L14:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r19 = false;
        goto L12
    L15:
        if (bitCount$iv$iv != 8) goto L20;
    L16:
        if (i$iv$iv == lastIndex$iv$iv) goto L20;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
    L20:
        DefaultConstructorMarker r3 = null;
        if (getBounded() == false) goto L23;
        Offset origin = Offset.m4114boximpl(interaction.m547getPressPositionF1C5BW0());
    L24:
        RippleAnimation rippleAnimation = new RippleAnimation(origin, targetRadius, getBounded(), r3);
        this.ripples.set(interaction, rippleAnimation);
        BuildersKt.launch$default(getCoroutineScope(), null, null, new CommonRippleNode$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
        DrawModifierNodeKt.invalidateDraw(this);
        return;
    L23:
        origin = null;
        goto L24
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press interaction) {
        RippleAnimation r0 = this.ripples.get(interaction);
        if (r0 == null) goto L6;
        r0.finish();
        return;
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope $this$drawRipples) {
        float alpha = getRippleAlpha().invoke().getPressedAlpha();
        if (alpha != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L32;
        ScatterMap this_$iv = this.ripples;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L38;
    L9:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r9 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        long slot$iv$iv2 = slot$iv$iv;
        int j$iv$iv = 0;
    L12:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r7 = k$iv[index$iv$iv];
        RippleAnimation ripple = (RippleAnimation) v$iv[index$iv$iv];
        PressInteraction.Press r8 = (PressInteraction.Press) r7;
        long[] m$iv$iv2 = m$iv$iv;
        int lastIndex$iv$iv2 = lastIndex$iv$iv;
        int i$iv$iv2 = i$iv$iv;
        ripple.m1867draw4WTKRHQ($this$drawRipples, Color.m4365copywmQWz5c$default(m1875getRippleColor0d7_KjU(), alpha, 0.0f, 0.0f, 0.0f, 14, null));
    L20:
        slot$iv$iv2 = slot$iv$iv2 >> r9;
        j$iv$iv = j$iv$iv + 1;
        alpha = alpha;
        m$iv$iv = m$iv$iv2;
        r9 = r9;
        lastIndex$iv$iv = lastIndex$iv$iv2;
        i$iv$iv = i$iv$iv2;
        goto L12
    L19:
        m$iv$iv2 = m$iv$iv;
        lastIndex$iv$iv2 = lastIndex$iv$iv;
        i$iv$iv2 = i$iv$iv;
        goto L20
    L16:
        r6 = false;
        goto L17
    L21:
        long[] m$iv$iv3 = m$iv$iv;
        int lastIndex$iv$iv3 = lastIndex$iv$iv;
        float alpha2 = alpha;
        int i$iv$iv3 = i$iv$iv;
        if (bitCount$iv$iv != r9) goto L39;
    L25:
        int lastIndex$iv$iv4 = lastIndex$iv$iv3;
        int i$iv$iv4 = i$iv$iv3;
        if (i$iv$iv4 == lastIndex$iv$iv4) goto L40;
        i$iv$iv = i$iv$iv4 + 1;
        alpha = alpha2;
        lastIndex$iv$iv = lastIndex$iv$iv4;
        m$iv$iv = m$iv$iv3;
        goto L9
    L40:
        return;
    L39:
        return;
    L24:
        m$iv$iv3 = m$iv$iv;
        lastIndex$iv$iv3 = lastIndex$iv$iv;
        alpha2 = alpha;
        i$iv$iv3 = i$iv$iv;
        goto L25
    L38:
        return;
    L32:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.clear();
    }
}
