package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SelectionAdjustment {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "()V", "Character", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getCharacter", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "None", "getNone", "Paragraph", "getParagraph", "Word", "getWord", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final SelectionAdjustment Character = null;
        private static final SelectionAdjustment CharacterWithWordAccelerate = null;
        private static final SelectionAdjustment None = null;
        private static final SelectionAdjustment Paragraph = null;
        private static final SelectionAdjustment Word = null;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            None = new SelectionAdjustment$Companion$$ExternalSyntheticLambda0();
            Character = new SelectionAdjustment$Companion$$ExternalSyntheticLambda1();
            Word = new SelectionAdjustment$Companion$$ExternalSyntheticLambda2();
            Paragraph = new SelectionAdjustment$Companion$$ExternalSyntheticLambda3();
            CharacterWithWordAccelerate = new SelectionAdjustment$Companion$$ExternalSyntheticLambda4();
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        static final Selection None$lambda$0(SelectionLayout layout) {
            Selection.AnchorInfo r1 = layout.getStartInfo().anchorForOffset(layout.getStartInfo().getRawStartHandleOffset());
            Selection.AnchorInfo r2 = layout.getEndInfo().anchorForOffset(layout.getEndInfo().getRawEndHandleOffset());
            if (layout.getCrossStatus() != CrossStatus.CROSSED) goto L5;
            boolean r3 = true;
        L7:
            return new Selection(r1, r2, r3);
        L5:
            r3 = false;
            goto L7
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        static final Selection Character$lambda$1(SelectionLayout layout) {
            return SelectionAdjustmentKt.ensureAtLeastOneChar(None.adjust(layout), layout);
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }

        static final Selection Word$lambda$2(SelectionLayout layout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(layout, SelectionAdjustment$Companion$Word$1$1.INSTANCE);
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        static final Selection Paragraph$lambda$3(SelectionLayout layout) {
            return SelectionAdjustmentKt.access$adjustToBoundaries(layout, SelectionAdjustment$Companion$Paragraph$1$1.INSTANCE);
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        static final Selection CharacterWithWordAccelerate$lambda$4(SelectionLayout layout) {
            Selection previousSelection = layout.getPreviousSelection();
            if (previousSelection != null) goto L7;
            return Word.adjust(layout);
        L7:
            if (layout.isStartHandle() == false) goto L9;
            Selection.AnchorInfo previousAnchor = previousSelection.getStart();
            Selection.AnchorInfo newAnchor = SelectionAdjustmentKt.access$updateSelectionBoundary(layout, layout.getStartInfo(), previousAnchor);
            Selection.AnchorInfo startAnchor = newAnchor;
            Selection.AnchorInfo endAnchor = previousSelection.getEnd();
        L11:
            if (Intrinsics.areEqual(newAnchor, previousAnchor) == false) goto L14;
            return previousSelection;
        L14:
            if (layout.getCrossStatus() != CrossStatus.CROSSED) goto L16;
        L21:
            boolean crossed = true;
        L23:
            return SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(startAnchor, endAnchor, crossed), layout);
        L16:
            if (layout.getCrossStatus() == CrossStatus.COLLAPSED) goto L18;
        L20:
            crossed = false;
            goto L23
        L18:
            if (startAnchor.getOffset() <= endAnchor.getOffset()) goto L20;
        L9:
            previousAnchor = previousSelection.getEnd();
            newAnchor = SelectionAdjustmentKt.access$updateSelectionBoundary(layout, layout.getEndInfo(), previousAnchor);
            startAnchor = previousSelection.getStart();
            endAnchor = newAnchor;
            goto L11
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    Selection adjust(SelectionLayout r1);
}
