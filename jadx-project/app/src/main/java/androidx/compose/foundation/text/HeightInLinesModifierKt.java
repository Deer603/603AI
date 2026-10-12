package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: HeightInLinesModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static /* synthetic */ Modifier heightInLines$default(Modifier r0, TextStyle r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 1;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = Integer.MAX_VALUE;
    L9:
        return heightInLines(r0, r1, r2, r3);
    }

    public static final Modifier heightInLines(Modifier $this$heightInLines, final TextStyle textStyle, final int minLines, final int maxLines) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(minLines, maxLines, textStyle);
    L7:
        return ComposedModifierKt.composed($this$heightInLines, r1, new AnonymousClass2(minLines, maxLines, textStyle));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final void validateMinMaxLines(int minLines, int maxLines) {
        boolean value$iv = true;
        if (minLines <= 0) goto L6;
        if (maxLines <= 0) goto L6;
        boolean value$iv2 = true;
    L8:
        if (value$iv2 == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("both minLines " + minLines + " and maxLines " + maxLines + " must be greater than zero");
    L11:
        if (minLines <= maxLines) goto L15;
        value$iv = false;
    L15:
        if (value$iv == true) goto L19;
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + minLines + " must be less than or equal to maxLines " + maxLines);
        return;
    L19:
        return;
    L6:
        value$iv2 = false;
        goto L8
    }
}
