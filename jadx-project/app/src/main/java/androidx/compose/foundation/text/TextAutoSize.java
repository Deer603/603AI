package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextAutoSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H¦\u0002J\b\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextAutoSize;", "", "equals", "", "other", "hashCode", "", "getFontSize", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextAutoSize {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: TextAutoSize.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/TextAutoSize$Companion;", "", "()V", "StepBased", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "StepBased-vU-0ePk", "(JJJ)Landroidx/compose/foundation/text/TextAutoSize;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        static {
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m1121StepBasedvU0ePk$default(Companion r7, long r8, long r10, long r12, int r14, Object r15) {
            if ((r14 & 1) == 0) goto L5;
            long r1 = TextAutoSizeDefaults.INSTANCE.m1124getMinFontSizeXSAIIZE();
        L7:
            if ((r14 & 2) == 0) goto L9;
            long r3 = TextAutoSizeDefaults.INSTANCE.m1123getMaxFontSizeXSAIIZE();
        L11:
            if ((r14 & 4) == 0) goto L13;
            long r5 = TextUnitKt.getSp(0.25d);
        L15:
            return r7.m1122StepBasedvU0ePk(r1, r3, r5);
        L13:
            r5 = r12;
            goto L15
        L9:
            r3 = r10;
            goto L11
        L5:
            r1 = r8;
            goto L7
        }

        /* JADX INFO: renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m1122StepBasedvU0ePk(long minFontSize, long maxFontSize, long stepSize) {
            return new AutoSizeStepBased(minFontSize, maxFontSize, stepSize, null);
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    boolean equals(Object r1);

    /* JADX INFO: renamed from: getFontSize-Ci0_558 */
    long mo1022getFontSizeCi0_558(TextAutoSizeLayoutScope r1, long r2, AnnotatedString r4);

    int hashCode();
}
