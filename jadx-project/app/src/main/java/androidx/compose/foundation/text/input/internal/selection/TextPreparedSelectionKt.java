package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"calculateNextCursorPositionAndWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "proposedCursor", "", "cursor", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextPreparedSelectionKt {

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[IndexTransformationType.values().length];
            r0[IndexTransformationType.Untransformed.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[IndexTransformationType.Deletion.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[IndexTransformationType.Replacement.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[IndexTransformationType.Insertion.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final long calculateNextCursorPositionAndWedgeAffinity(int proposedCursor, int cursor, TransformedTextFieldState transformedTextFieldState) {
        if (proposedCursor != (-1)) goto L7;
        return CursorAndWedgeAffinity.m1326constructorimpl(cursor);
    L7:
        if (proposedCursor <= cursor) goto L9;
        boolean forward = true;
    L10:
        long untransformed$iv = transformedTextFieldState.m1311mapFromTransformedjx7JFs(proposedCursor);
        long retransformed$iv = transformedTextFieldState.m1314mapToTransformedGEjPoXI(untransformed$iv);
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == false) goto L16;
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == false) goto L16;
        IndexTransformationType type$iv = IndexTransformationType.Untransformed;
    L26:
        IndexTransformationType type = type$iv;
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L44;
            case 2: goto L56;
            case 3: goto L39;
            case 4: goto L30;
            default: goto L29;
        };
    L30:
        if (forward == false) goto L36;
        if (proposedCursor != TextRange.m6417getStartimpl(retransformed$iv)) goto L51;
        return CursorAndWedgeAffinity.m1327constructorimpl(proposedCursor, WedgeAffinity.Start);
    L51:
        return CursorAndWedgeAffinity.m1327constructorimpl(TextRange.m6412getEndimpl(retransformed$iv), WedgeAffinity.End);
    L36:
        if (proposedCursor != TextRange.m6412getEndimpl(retransformed$iv)) goto L53;
        return CursorAndWedgeAffinity.m1327constructorimpl(proposedCursor, WedgeAffinity.End);
    L53:
        return CursorAndWedgeAffinity.m1327constructorimpl(TextRange.m6417getStartimpl(retransformed$iv), WedgeAffinity.Start);
    L39:
        if (forward == false) goto L55;
        return CursorAndWedgeAffinity.m1327constructorimpl(TextRange.m6412getEndimpl(retransformed$iv), WedgeAffinity.Start);
    L55:
        return CursorAndWedgeAffinity.m1327constructorimpl(TextRange.m6417getStartimpl(retransformed$iv), WedgeAffinity.End);
    L44:
        if (forward == false) goto L46;
        WedgeAffinity r14 = WedgeAffinity.Start;
    L49:
        return CursorAndWedgeAffinity.m1327constructorimpl(proposedCursor, r14);
    L46:
        r14 = WedgeAffinity.End;
        goto L49
    L29:
        throw new NoWhenBranchMatchedException();
    L56:
        return CursorAndWedgeAffinity.m1326constructorimpl(proposedCursor);
    L16:
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == true) goto L21;
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == true) goto L21;
        type$iv = IndexTransformationType.Replacement;
    L21:
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == true) goto L23;
    L25:
        type$iv = IndexTransformationType.Deletion;
        goto L26
    L23:
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == true) goto L25;
        type$iv = IndexTransformationType.Insertion;
        goto L26
    L9:
        forward = false;
        goto L10
    }
}
