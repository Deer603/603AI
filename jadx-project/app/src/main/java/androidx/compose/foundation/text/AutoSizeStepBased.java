package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextAutoSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\t*\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "didOverflow", "Landroidx/compose/ui/text/TextLayoutResult;", "didOverflowBounds", "didOverflowByEllipsize", "getFontSize", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long r1, long r3, long r5, DefaultConstructorMarker r7) {
        this(r1, r3, r5);
    }

    private AutoSizeStepBased(long minFontSize, long maxFontSize, long stepSize) {
        this.minFontSize = minFontSize;
        this.maxFontSize = maxFontSize;
        this.stepSize = stepSize;
        if (TextUnit.m7164equalsimpl0(this.minFontSize, TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L34;
        if (TextUnit.m7164equalsimpl0(this.maxFontSize, TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L32;
        if (TextUnit.m7164equalsimpl0(this.stepSize, TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L30;
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(this.minFontSize), TextUnit.m7166getTypeUIouoOA(this.maxFontSize)) == false) goto L14;
        long arg0$iv = this.minFontSize;
        long other$iv = this.maxFontSize;
        TextUnitKt.m7181checkArithmeticNB67dxo(arg0$iv, other$iv);
        if (Float.compare(TextUnit.m7167getValueimpl(arg0$iv), TextUnit.m7167getValueimpl(other$iv)) <= 0) goto L14;
        this.minFontSize = this.maxFontSize;
    L14:
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(this.stepSize), TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L21;
        long arg0$iv2 = this.stepSize;
        long other$iv2 = TextUnitKt.getSp(1.0E-4f);
        TextUnitKt.m7181checkArithmeticNB67dxo(arg0$iv2, other$iv2);
        if (Float.compare(TextUnit.m7167getValueimpl(arg0$iv2), TextUnit.m7167getValueimpl(other$iv2)) >= 0) goto L21;
        throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
    L21:
        if (TextUnit.m7167getValueimpl(this.minFontSize) < 0.0f) goto L28;
        if (TextUnit.m7167getValueimpl(this.maxFontSize) < 0.0f) goto L26;
        return;
    L26:
        throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
    L28:
        throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
    L30:
        throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
    L32:
        throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
    L34:
        throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* JADX INFO: renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo1022getFontSizeCi0_558(TextAutoSizeLayoutScope $this$getFontSize_u2dCi0_558, long constraints, AnnotatedString text) {
        float stepSize = $this$getFontSize_u2dCi0_558.mo375toPxR2X_6o(this.stepSize);
        float smallest = $this$getFontSize_u2dCi0_558.mo375toPxR2X_6o(this.minFontSize);
        float largest = $this$getFontSize_u2dCi0_558.mo375toPxR2X_6o(this.maxFontSize);
        float min = smallest;
        float max = largest;
        float current = (smallest + largest) / 2.0f;
    L4:
        if ((max - min) < stepSize) goto L10;
        TextLayoutResult layoutResult = $this$getFontSize_u2dCi0_558.mo1410performLayout5ZSfY2I(constraints, text, $this$getFontSize_u2dCi0_558.mo379toSpkPz2Gy4(current));
        if (didOverflow(layoutResult) == false) goto L8;
        max = current;
    L9:
        current = (min + max) / 2.0f;
        goto L4
    L8:
        float max2 = current;
        min = max2;
        goto L9
    L10:
        float current2 = (((float) Math.floor((min - smallest) / stepSize)) * stepSize) + smallest;
        if ((current2 + stepSize) > largest) goto L16;
        TextLayoutResult layoutResult2 = $this$getFontSize_u2dCi0_558.mo1410performLayout5ZSfY2I(constraints, text, $this$getFontSize_u2dCi0_558.mo379toSpkPz2Gy4(current2 + stepSize));
        if (didOverflow(layoutResult2) == true) goto L16;
        current2 = current2 + stepSize;
    L16:
        return $this$getFontSize_u2dCi0_558.mo379toSpkPz2Gy4(current2);
    }

    private final boolean didOverflow(TextLayoutResult $this$didOverflow) {
        int r0 = $this$didOverflow.getLayoutInput().m6384getOverflowgIe3tQ8();
        boolean r2 = true;
        if (TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6886getClipgIe3tQ8()) == false) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return didOverflowBounds($this$didOverflow);
    L9:
        if (TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == false) goto L11;
        boolean r3 = true;
    L12:
        if (r3 == true) goto L15;
        r2 = TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6887getEllipsisgIe3tQ8());
    L15:
        if (r2 == false) goto L19;
        return didOverflowByEllipsize($this$didOverflow);
    L19:
        throw new IllegalArgumentException("TextOverflow type " + TextOverflow.m6879toStringimpl($this$didOverflow.getLayoutInput().m6384getOverflowgIe3tQ8()) + " is not supported.");
    L11:
        r3 = TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8());
        goto L12
    L5:
        r1 = TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6890getVisiblegIe3tQ8());
        goto L6
    }

    private final boolean didOverflowBounds(TextLayoutResult $this$didOverflowBounds) {
        if ($this$didOverflowBounds.getDidOverflowWidth() == false) goto L5;
    L8:
        return true;
    L5:
        if ($this$didOverflowBounds.getDidOverflowHeight() == true) goto L8;
        return false;
    }

    private final boolean didOverflowByEllipsize(TextLayoutResult $this$didOverflowByEllipsize) {
        switch($this$didOverflowByEllipsize.getLineCount()) {
            case 0: goto L19;
            case 1: goto L16;
            default: goto L4;
        };
    L4:
        int r0 = $this$didOverflowByEllipsize.getLayoutInput().m6384getOverflowgIe3tQ8();
        if (TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == false) goto L9;
        boolean r2 = true;
    L10:
        if (r2 == false) goto L13;
        return didOverflowBounds($this$didOverflowByEllipsize);
    L13:
        if (TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == true) goto L18;
        return false;
    L18:
        return $this$didOverflowByEllipsize.isLineEllipsized($this$didOverflowByEllipsize.getLineCount() - 1);
    L9:
        r2 = TextOverflow.m6877equalsimpl0(r0, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8());
        goto L10
    L19:
        return false;
    L16:
        return $this$didOverflowByEllipsize.isLineEllipsized(0);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object other) {
        if (other != this) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if ((other instanceof AutoSizeStepBased) == true) goto L12;
        return false;
    L12:
        if (TextUnit.m7164equalsimpl0(((AutoSizeStepBased) other).minFontSize, this.minFontSize) == true) goto L15;
        return false;
    L15:
        if (TextUnit.m7164equalsimpl0(((AutoSizeStepBased) other).maxFontSize, this.maxFontSize) == true) goto L18;
        return false;
    L18:
        if (TextUnit.m7164equalsimpl0(((AutoSizeStepBased) other).stepSize, this.stepSize) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        int result = TextUnit.m7168hashCodeimpl(this.minFontSize);
        int result2 = (result * 31) + TextUnit.m7168hashCodeimpl(this.maxFontSize);
        return (result2 * 31) + TextUnit.m7168hashCodeimpl(this.stepSize);
    }
}
