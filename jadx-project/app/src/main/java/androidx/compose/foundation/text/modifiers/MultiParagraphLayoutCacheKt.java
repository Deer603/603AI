package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "times", "other", "times-NB67dxo", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = 0;

    /* JADX INFO: renamed from: access$times-NB67dxo, reason: not valid java name */
    public static final /* synthetic */ long m1411access$timesNB67dxo(long $receiver, long other) {
        return m1412timesNB67dxo($receiver, other);
    }

    /* JADX INFO: renamed from: times-NB67dxo, reason: not valid java name */
    private static final long m1412timesNB67dxo(long $this$times_u2dNB67dxo, long other) {
        if (TextUnit.m7169isEmimpl(other) == false) goto L18;
        if (TextUnit.m7169isEmimpl($this$times_u2dNB67dxo) == true) goto L16;
        if (TextUnit.m7165getRawTypeimpl($this$times_u2dNB67dxo) != 0) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L13;
        long arg0$iv = DefaultFontSize;
        float other$iv = TextUnit.m7167getValueimpl(other);
        TextUnitKt.m7180checkArithmeticR2X_6o(arg0$iv);
        return TextUnitKt.pack(TextUnit.m7165getRawTypeimpl(arg0$iv), TextUnit.m7167getValueimpl(arg0$iv) * other$iv);
    L13:
        float other$iv2 = TextUnit.m7167getValueimpl(other);
        TextUnitKt.m7180checkArithmeticR2X_6o($this$times_u2dNB67dxo);
        return TextUnitKt.pack(TextUnit.m7165getRawTypeimpl($this$times_u2dNB67dxo), TextUnit.m7167getValueimpl($this$times_u2dNB67dxo) * other$iv2);
    L9:
        r3 = false;
        goto L10
    L16:
        throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + TextUnit.m7174toStringimpl(other) + "). Please declare the style.fontSize with Sp units instead.");
    L18:
        throw new IllegalArgumentException("The multiplier must be in em, but was " + TextUnit.m7174toStringimpl(other) + '.');
    }

    static {
        DefaultFontSize = TextUnitKt.getSp(14);
    }
}
