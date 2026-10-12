package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraphIntrinsicsKt {
    public static final /* synthetic */ List access$getLocalPlaceholders(List $receiver, int start, int end) {
        return getLocalPlaceholders($receiver, start, end);
    }

    private static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> r18, int start, int end) {
        List<AnnotatedString.Range<Placeholder>> r2 = r18;
        ArrayList target$iv = new ArrayList(r2.size());
        int index$iv$iv = 0;
        int r8 = r2.size();
    L3:
        if (index$iv$iv >= r8) goto L19;
        Object item$iv$iv = r2.get(index$iv$iv);
        AnnotatedString.Range<Placeholder> r12 = (AnnotatedString.Range) item$iv$iv;
        if (AnnotatedStringKt.intersect(start, end, r12.getStart(), r12.getEnd()) == false) goto L17;
        ArrayList r13 = target$iv;
        AnnotatedString.Range<Placeholder> r14 = (AnnotatedString.Range) item$iv$iv;
        if (start <= r14.getStart()) goto L9;
    L11:
        boolean value$iv = false;
    L13:
        if (value$iv == true) goto L15;
        InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
    L15:
        r13.add(new AnnotatedString.Range(r14.getItem(), r14.getStart() - start, r14.getEnd() - start));
        goto L17
    L9:
        if (r14.getEnd() > end) goto L11;
        value$iv = true;
    L17:
        index$iv$iv = index$iv$iv + 1;
        r2 = r2;
        goto L3
    L19:
        return target$iv;
    }
}
