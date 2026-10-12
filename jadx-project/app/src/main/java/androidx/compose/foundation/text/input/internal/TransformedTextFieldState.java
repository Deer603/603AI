package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 ^2\u00020\u0001:\u0002^_B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020!J,\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020+2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020!0-¢\u0006\u0002\b/H\u0086\bJ\u0013\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00102\u001a\u000203H\u0016J \u00104\u001a\u00020!2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u0002082\u0006\u0010<\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010;\u001a\u0002082\u0006\u0010?\u001a\u000203ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u0002082\u0006\u0010<\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bC\u0010>J\u001b\u0010B\u001a\u0002082\u0006\u0010?\u001a\u000203ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010AJ\u000e\u0010E\u001a\u00020!2\u0006\u0010F\u001a\u000203J\u0006\u0010G\u001a\u00020!J\u000e\u0010H\u001a\u00020!2\u0006\u0010I\u001a\u00020JJ,\u0010K\u001a\u00020!2\u0006\u0010I\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020+2\b\b\u0002\u0010M\u001a\u00020N2\b\b\u0002\u0010*\u001a\u00020+J4\u0010O\u001a\u00020!2\u0006\u0010I\u001a\u00020J2\u0006\u0010<\u001a\u0002082\b\b\u0002\u0010M\u001a\u00020N2\b\b\u0002\u0010*\u001a\u00020+ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0006\u0010R\u001a\u00020!J\u0018\u0010S\u001a\u00020!2\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020!2\u0006\u0010W\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bX\u0010UJ\b\u0010Y\u001a\u00020ZH\u0016J\u0006\u0010[\u001a\u00020!J\u0010\u0010\\\u001a\u00020!2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\f\u0010]\u001a\u00020!*\u00020.H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "textFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "codepointTransformedText", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "outputText", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOutputText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "outputTransformedText", "<set-?>", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "selectionWedgeAffinity", "getSelectionWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "setSelectionWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity$delegate", "Landroidx/compose/runtime/MutableState;", "untransformedText", "getUntransformedText", "visualText", "getVisualText", "collapseSelectionToEnd", "", "collapseSelectionToMax", "collectImeNotifications", "", "notifyImeListener", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectedText", "editUntransformedTextAsUser", "restartImeIfContentChanges", "", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Lkotlin/ExtensionFunctionType;", "equals", "other", "hashCode", "", "highlightCharsIn", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/text/input/TextHighlightType;", "transformedRange", "Landroidx/compose/ui/text/TextRange;", "highlightCharsIn-7RAjNK8", "(IJ)V", "mapFromTransformed", "range", "mapFromTransformed-GEjPoXI", "(J)J", "offset", "mapFromTransformed--jx7JFs", "(I)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed--jx7JFs", "placeCursorBeforeCharAt", "transformedOffset", "redo", "replaceAll", "newText", "", "replaceSelectedText", "clearComposition", "undoBehavior", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "replaceText", "replaceText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "selectAll", "selectCharsIn", "selectCharsIn-5zc-tL8", "(J)V", "selectUntransformedCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "toString", "", "undo", "update", "updateWedgeAffinity", "Companion", "TransformedText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;
    private final MutableState selectionWedgeAffinity$delegate;
    private final TextFieldState textFieldState;

    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "untransformedValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)J", "mapToTransformed", "selectionWedgeAffinity", "mapToTransformed-XGyztTk", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {

        /* JADX INFO: compiled from: TransformedTextFieldState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[WedgeAffinity.values().length];
                r0[WedgeAffinity.Start.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            L11:
                r0[WedgeAffinity.End.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L9:
                $EnumSwitchMapping$0 = r0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ TransformedText access$calculateTransformedText(Companion $this, TextFieldCharSequence untransformedValue, OutputTransformation outputTransformation, SelectionWedgeAffinity wedgeAffinity) {
            return $this.calculateTransformedText(untransformedValue, outputTransformation, wedgeAffinity);
        }

        public static final /* synthetic */ TransformedText access$calculateTransformedText(Companion $this, TextFieldCharSequence untransformedValue, CodepointTransformation codepointTransformation, SelectionWedgeAffinity wedgeAffinity) {
            return $this.calculateTransformedText(untransformedValue, codepointTransformation, wedgeAffinity);
        }

        /* JADX INFO: renamed from: access$mapFromTransformed-xdX6-G0, reason: not valid java name */
        public static final /* synthetic */ long m1318access$mapFromTransformedxdX6G0(Companion $this, long range, OffsetMappingCalculator mapping) {
            return $this.m1320mapFromTransformedxdX6G0(range, mapping);
        }

        /* JADX INFO: renamed from: access$mapToTransformed-XGyztTk, reason: not valid java name */
        public static final /* synthetic */ long m1319access$mapToTransformedXGyztTk(Companion $this, long range, OffsetMappingCalculator mapping, SelectionWedgeAffinity selectionWedgeAffinity) {
            return $this.m1321mapToTransformedXGyztTk(range, mapping, selectionWedgeAffinity);
        }

        @JvmStatic
        private final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, OutputTransformation outputTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer buffer = new TextFieldBuffer(untransformedValue, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.transformOutput(buffer);
            int r1 = buffer.getChanges().getChangeCount();
            TextRange r2 = null;
            if (r1 != 0) goto L5;
            return null;
        L5:
            long r8 = m1321mapToTransformedXGyztTk(untransformedValue.m1188getSelectiond9O1mEE(), offsetMappingCalculator, wedgeAffinity);
            TextRange r3 = untransformedValue.m1187getCompositionMzsxiRA();
            if (r3 == null) goto L8;
            long it = r3.m6421unboximpl();
            r2 = TextRange.m6405boximpl(TransformedTextFieldState.access$getCompanion$p().m1321mapToTransformedXGyztTk(it, offsetMappingCalculator, wedgeAffinity));
        L8:
            TextFieldCharSequence transformedTextWithSelection = TextFieldBuffer.m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(buffer, r8, r2, null, 4, null);
            return new TransformedText(transformedTextWithSelection, offsetMappingCalculator);
        }

        @JvmStatic
        private final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, CodepointTransformation codepointTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence transformedText = CodepointTransformationKt.toVisualText(untransformedValue, codepointTransformation, offsetMappingCalculator);
            TextRange r1 = null;
            if (transformedText != untransformedValue) goto L5;
            return null;
        L5:
            long r4 = m1321mapToTransformedXGyztTk(untransformedValue.m1188getSelectiond9O1mEE(), offsetMappingCalculator, wedgeAffinity);
            TextRange r2 = untransformedValue.m1187getCompositionMzsxiRA();
            if (r2 == null) goto L8;
            long it = r2.m6421unboximpl();
            r1 = TextRange.m6405boximpl(TransformedTextFieldState.access$getCompanion$p().m1321mapToTransformedXGyztTk(it, offsetMappingCalculator, wedgeAffinity));
        L8:
            TextFieldCharSequence transformedTextWithSelection = new TextFieldCharSequence(transformedText, r4, r1, null, null, 24, null);
            return new TransformedText(transformedTextWithSelection, offsetMappingCalculator);
        }

        /* JADX INFO: renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        static /* synthetic */ long m1322mapToTransformedXGyztTk$default(Companion r0, long r1, OffsetMappingCalculator r3, SelectionWedgeAffinity r4, int r5, Object r6) {
            if ((r5 & 4) == 0) goto L6;
            r4 = null;
        L6:
            return r0.m1321mapToTransformedXGyztTk(r1, r3, r4);
        }

        @JvmStatic
        /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        private final long m1321mapToTransformedXGyztTk(long range, OffsetMappingCalculator mapping, SelectionWedgeAffinity selectionWedgeAffinity) {
            long transformedStart = mapping.m1262mapFromSourcejx7JFs(TextRange.m6417getStartimpl(range));
            if (TextRange.m6411getCollapsedimpl(range) == false) goto L5;
            long transformedEnd = transformedStart;
        L6:
            WedgeAffinity endAffinity = null;
            if (selectionWedgeAffinity == null) goto L9;
            WedgeAffinity startAffinity = selectionWedgeAffinity.getStartAffinity();
        L11:
            if (TextRange.m6411getCollapsedimpl(range) == false) goto L13;
            endAffinity = startAffinity;
        L16:
            if (startAffinity != null) goto L18;
        L26:
            if (endAffinity != null) goto L28;
        L36:
            int transformedMin = Math.min(TextRange.m6415getMinimpl(transformedStart), TextRange.m6415getMinimpl(transformedEnd));
            int transformedMax = Math.max(TextRange.m6414getMaximpl(transformedStart), TextRange.m6414getMaximpl(transformedEnd));
            if (TextRange.m6416getReversedimpl(range) == false) goto L39;
            long transformedRange = TextRangeKt.TextRange(transformedMax, transformedMin);
            return transformedRange;
        L39:
            long transformedRange2 = TextRangeKt.TextRange(transformedMin, transformedMax);
            return transformedRange2;
        L28:
            if (TextRange.m6411getCollapsedimpl(transformedEnd) == true) goto L36;
            switch(WhenMappings.$EnumSwitchMapping$0[endAffinity.ordinal()]) {
                case 1: goto L34;
                case 2: goto L33;
                default: goto L32;
            };
        L33:
            long r6 = TextRangeKt.TextRange(TextRange.m6412getEndimpl(transformedEnd));
        L35:
            transformedEnd = r6;
            goto L36
        L34:
            r6 = TextRangeKt.TextRange(TextRange.m6417getStartimpl(transformedEnd));
            goto L35
        L32:
            throw new NoWhenBranchMatchedException();
        L18:
            if (TextRange.m6411getCollapsedimpl(transformedStart) == true) goto L26;
            switch(WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()]) {
                case 1: goto L24;
                case 2: goto L23;
                default: goto L22;
            };
        L23:
            long r7 = TextRangeKt.TextRange(TextRange.m6412getEndimpl(transformedStart));
        L25:
            transformedStart = r7;
            goto L26
        L24:
            r7 = TextRangeKt.TextRange(TextRange.m6417getStartimpl(transformedStart));
            goto L25
        L22:
            throw new NoWhenBranchMatchedException();
        L13:
            if (selectionWedgeAffinity == null) goto L16;
            endAffinity = selectionWedgeAffinity.getEndAffinity();
            goto L16
        L9:
            startAffinity = null;
            goto L11
        L5:
            transformedEnd = mapping.m1262mapFromSourcejx7JFs(TextRange.m6412getEndimpl(range));
            goto L6
        }

        @JvmStatic
        /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        private final long m1320mapFromTransformedxdX6G0(long range, OffsetMappingCalculator mapping) {
            long untransformedStart = mapping.m1261mapFromDestjx7JFs(TextRange.m6417getStartimpl(range));
            if (TextRange.m6411getCollapsedimpl(range) == false) goto L5;
            long untransformedEnd = untransformedStart;
        L6:
            int untransformedMin = Math.min(TextRange.m6415getMinimpl(untransformedStart), TextRange.m6415getMinimpl(untransformedEnd));
            int untransformedMax = Math.max(TextRange.m6414getMaximpl(untransformedStart), TextRange.m6414getMaximpl(untransformedEnd));
            if (TextRange.m6416getReversedimpl(range) == false) goto L10;
            return TextRangeKt.TextRange(untransformedMax, untransformedMin);
        L10:
            return TextRangeKt.TextRange(untransformedMin, untransformedMax);
        L5:
            untransformedEnd = mapping.m1261mapFromDestjx7JFs(TextRange.m6412getEndimpl(range));
            goto L6
        }
    }

    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "text", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "offsetMapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "getOffsetMapping", "()Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public static /* synthetic */ TransformedText copy$default(TransformedText r0, TextFieldCharSequence r1, OffsetMappingCalculator r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.text;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.offsetMapping;
        L9:
            return r0.copy(r1, r2);
        }

        public final TextFieldCharSequence component1() {
            return this.text;
        }

        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence r2, OffsetMappingCalculator r3) {
            return new TransformedText(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof TransformedText) == true) goto L8;
            return false;
        L8:
            TransformedText r1 = (TransformedText) r6;
            if (Intrinsics.areEqual(this.text, r1.text) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.offsetMapping, r1.offsetMapping) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + this.text + ", offsetMapping=" + this.offsetMapping + ')';
        }

        public TransformedText(TextFieldCharSequence text, OffsetMappingCalculator offsetMapping) {
            this.text = text;
            this.offsetMapping = offsetMapping;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransformedTextFieldState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {747}, m = "collectImeNotifications", n = {"this", "transformedNotifyImeListener"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TransformedTextFieldState this$0;

        AnonymousClass1(TransformedTextFieldState r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collectImeNotifications(null, this);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        final OutputTransformation transformation = this.outputTransformation;
        if (transformation == null) goto L5;
        State<TransformedText> r3 = SnapshotStateKt.derivedStateOf(new TransformedTextFieldState$outputTransformedText$1$1(this, transformation));
    L6:
        this.outputTransformedText = r3;
        final CodepointTransformation transformation2 = this.codepointTransformation;
        if (transformation2 == null) goto L9;
        State<TransformedText> r4 = SnapshotStateKt.derivedStateOf(new TransformedTextFieldState$codepointTransformedText$1$1(this, transformation2));
    L10:
        this.codepointTransformedText = r4;
        this.selectionWedgeAffinity$delegate = SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
        return;
    L9:
        r4 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    public static final /* synthetic */ Companion access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ InputTransformation access$getInputTransformation$p(TransformedTextFieldState $this) {
        return $this.inputTransformation;
    }

    public static final /* synthetic */ State access$getOutputTransformedText$p(TransformedTextFieldState $this) {
        return $this.outputTransformedText;
    }

    public static final /* synthetic */ TextFieldState access$getTextFieldState$p(TransformedTextFieldState $this) {
        return $this.textFieldState;
    }

    public static final /* synthetic */ void access$updateWedgeAffinity(TransformedTextFieldState $this, TextFieldBuffer $receiver) {
        $this.updateWedgeAffinity($receiver);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState r2, InputTransformation r3, CodepointTransformation r4, OutputTransformation r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r3, r4, r5);
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

    public final TextFieldCharSequence getOutputText() {
        State<TransformedText> r0 = this.outputTransformedText;
        if (r0 == null) goto L9;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L9;
        TextFieldCharSequence r2 = r1.getText();
        if (r2 == null) goto L9;
        return r2;
    L9:
        return getUntransformedText();
    }

    public final TextFieldCharSequence getVisualText() {
        State<TransformedText> r0 = this.codepointTransformedText;
        if (r0 == null) goto L9;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L9;
        TextFieldCharSequence r2 = r1.getText();
        if (r2 == null) goto L9;
        return r2;
    L9:
        return getOutputText();
    }

    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        State $this$getValue$iv = this.selectionWedgeAffinity$delegate;
        return (SelectionWedgeAffinity) $this$getValue$iv.getValue();
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity r4) {
        MutableState $this$setValue$iv = this.selectionWedgeAffinity$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final void update(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    public final void placeCursorBeforeCharAt(int transformedOffset) {
        m1316selectCharsIn5zctL8(TextRangeKt.TextRange(transformedOffset));
    }

    /* JADX INFO: renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1316selectCharsIn5zctL8(long transformedRange) {
        long untransformedRange = m1312mapFromTransformedGEjPoXI(transformedRange);
        m1317selectUntransformedCharsIn5zctL8(untransformedRange);
    }

    /* JADX INFO: renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1317selectUntransformedCharsIn5zctL8(long untransformedRange) {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$selectUntransformedCharsIn_5zc_tL8_u24lambda_u242 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced($this$selectUntransformedCharsIn_5zc_tL8_u24lambda_u242, TextRange.m6417getStartimpl(untransformedRange), TextRange.m6412getEndimpl(untransformedRange));
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    /* JADX INFO: renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m1310highlightCharsIn7RAjNK8(int type, long transformedRange) {
        long untransformedRange = m1312mapFromTransformedGEjPoXI(transformedRange);
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$highlightCharsIn_7RAjNK8_u24lambda_u243 = $this$iv.getMainBuffer$foundation_release();
        $this$highlightCharsIn_7RAjNK8_u24lambda_u243.m1181setHighlightK7f2yys$foundation_release(type, TextRange.m6417getStartimpl(untransformedRange), TextRange.m6412getEndimpl(untransformedRange));
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    public final void replaceAll(CharSequence newText) {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$replaceAll_u24lambda_u244 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete($this$replaceAll_u24lambda_u244, 0, $this$replaceAll_u24lambda_u244.getLength());
        $this$replaceAll_u24lambda_u244.append(newText.toString());
        updateWedgeAffinity($this$replaceAll_u24lambda_u244);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    public final void selectAll() {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$selectAll_u24lambda_u245 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced($this$selectAll_u24lambda_u245, 0, $this$selectAll_u24lambda_u245.getLength());
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    public final void deleteSelectedText() {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.NeverMerge;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$deleteSelectedText_u24lambda_u246 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete($this$deleteSelectedText_u24lambda_u246, TextRange.m6415getMinimpl($this$deleteSelectedText_u24lambda_u246.m1180getSelectiond9O1mEE()), TextRange.m6414getMaximpl($this$deleteSelectedText_u24lambda_u246.m1180getSelectiond9O1mEE()));
        TextFieldBufferKt.setSelectionCoerced$default($this$deleteSelectedText_u24lambda_u246, TextRange.m6415getMinimpl($this$deleteSelectedText_u24lambda_u246.m1180getSelectiond9O1mEE()), 0, 2, null);
        updateWedgeAffinity($this$deleteSelectedText_u24lambda_u246);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m1309replaceTextM8tDOmk$default(TransformedTextFieldState r6, CharSequence r7, long r8, TextFieldEditUndoBehavior r10, boolean r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        TextFieldEditUndoBehavior r4 = TextFieldEditUndoBehavior.MergeIfPossible;
    L7:
        if ((r12 & 8) == 0) goto L9;
        boolean r5 = true;
    L10:
        r6.m1315replaceTextM8tDOmk(r7, r8, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m1315replaceTextM8tDOmk(CharSequence newText, long range, TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState this_$iv = this.textFieldState;
        InputTransformation r1 = this.inputTransformation;
        this_$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$replaceText_M8tDOmk_u24lambda_u247 = this_$iv.getMainBuffer$foundation_release();
        long selection = m1312mapFromTransformedGEjPoXI(range);
        $this$replaceText_M8tDOmk_u24lambda_u247.replace(TextRange.m6415getMinimpl(selection), TextRange.m6414getMaximpl(selection), newText);
        int cursor = TextRange.m6415getMinimpl(selection) + newText.length();
        TextFieldBufferKt.setSelectionCoerced$default($this$replaceText_M8tDOmk_u24lambda_u247, cursor, 0, 2, null);
        updateWedgeAffinity($this$replaceText_M8tDOmk_u24lambda_u247);
        TextFieldState.access$commitEditAsUser(this_$iv, r1, restartImeIfContentChanges, undoBehavior);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState r0, CharSequence r1, boolean r2, TextFieldEditUndoBehavior r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = TextFieldEditUndoBehavior.MergeIfPossible;
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = true;
    L11:
        r0.replaceSelectedText(r1, r2, r3, r4);
    }

    public final void replaceSelectedText(CharSequence newText, boolean clearComposition, TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState this_$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        this_$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$replaceSelectedText_u24lambda_u248 = this_$iv.getMainBuffer$foundation_release();
        if (clearComposition == false) goto L5;
        $this$replaceSelectedText_u24lambda_u248.commitComposition$foundation_release();
    L5:
        long selection = $this$replaceSelectedText_u24lambda_u248.m1180getSelectiond9O1mEE();
        $this$replaceSelectedText_u24lambda_u248.replace(TextRange.m6415getMinimpl(selection), TextRange.m6414getMaximpl(selection), newText);
        int cursor = TextRange.m6415getMinimpl(selection) + newText.length();
        TextFieldBufferKt.setSelectionCoerced$default($this$replaceSelectedText_u24lambda_u248, cursor, 0, 2, null);
        updateWedgeAffinity($this$replaceSelectedText_u24lambda_u248);
        TextFieldState.access$commitEditAsUser(this_$iv, inputTransformation$iv, restartImeIfContentChanges, undoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$collapseSelectionToMax_u24lambda_u249 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default($this$collapseSelectionToMax_u24lambda_u249, TextRange.m6414getMaximpl($this$collapseSelectionToMax_u24lambda_u249.m1180getSelectiond9O1mEE()), 0, 2, null);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    public final void collapseSelectionToEnd() {
        TextFieldState $this$iv = this.textFieldState;
        InputTransformation inputTransformation$iv = this.inputTransformation;
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$collapseSelectionToEnd_u24lambda_u2410 = $this$iv.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default($this$collapseSelectionToEnd_u24lambda_u2410, TextRange.m6412getEndimpl($this$collapseSelectionToEnd_u24lambda_u2410.m1180getSelectiond9O1mEE()), 0, 2, null);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, true, undoBehavior$iv);
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState $this, boolean restartImeIfContentChanges, Function1 block, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L5;
        restartImeIfContentChanges = true;
    L5:
        TextFieldState $this$iv = access$getTextFieldState$p($this);
        InputTransformation inputTransformation$iv = access$getInputTransformation$p($this);
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411 = $this$iv.getMainBuffer$foundation_release();
        block.invoke($this$editUntransformedTextAsUser_u24lambda_u2411);
        access$updateWedgeAffinity($this, $this$editUntransformedTextAsUser_u24lambda_u2411);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, restartImeIfContentChanges, undoBehavior$iv);
    }

    public final void editUntransformedTextAsUser(boolean restartImeIfContentChanges, Function1<? super TextFieldBuffer, Unit> r9) {
        TextFieldState $this$iv = access$getTextFieldState$p(this);
        InputTransformation inputTransformation$iv = access$getInputTransformation$p(this);
        TextFieldEditUndoBehavior undoBehavior$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411 = $this$iv.getMainBuffer$foundation_release();
        r9.invoke($this$editUntransformedTextAsUser_u24lambda_u2411);
        access$updateWedgeAffinity(this, $this$editUntransformedTextAsUser_u24lambda_u2411);
        TextFieldState.access$commitEditAsUser($this$iv, inputTransformation$iv, restartImeIfContentChanges, undoBehavior$iv);
    }

    private final void updateWedgeAffinity(TextFieldBuffer $this$updateWedgeAffinity) {
        if ($this$updateWedgeAffinity.getChangeTracker$foundation_release().getChangeCount() > 0) goto L5;
        return;
    L5:
        if (TextRange.m6411getCollapsedimpl($this$updateWedgeAffinity.m1180getSelectiond9O1mEE()) == false) goto L9;
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
        return;
    }

    /* JADX INFO: renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1313mapToTransformedjx7JFs(int offset) {
        State<TransformedText> r0 = this.outputTransformedText;
        OffsetMappingCalculator visualMapping = null;
        if (r0 == null) goto L7;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L7;
        OffsetMappingCalculator presentMapping = r1.getOffsetMapping();
    L8:
        State<TransformedText> r2 = this.codepointTransformedText;
        if (r2 == null) goto L13;
        TransformedText r3 = r2.getValue();
        if (r3 == null) goto L13;
        visualMapping = r3.getOffsetMapping();
    L13:
        if (presentMapping == null) goto L15;
        long intermediateRange = presentMapping.m1262mapFromSourcejx7JFs(offset);
    L16:
        if (visualMapping == null) goto L19;
        OffsetMappingCalculator it = visualMapping;
        return Companion.m1319access$mapToTransformedXGyztTk(Companion, intermediateRange, it, getSelectionWedgeAffinity());
    L19:
        return intermediateRange;
    L15:
        intermediateRange = TextRangeKt.TextRange(offset);
    L7:
        presentMapping = null;
        goto L8
    }

    /* JADX INFO: renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1314mapToTransformedGEjPoXI(long range) {
        State<TransformedText> r0 = this.outputTransformedText;
        OffsetMappingCalculator visualMapping = null;
        if (r0 == null) goto L7;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L7;
        OffsetMappingCalculator presentMapping = r1.getOffsetMapping();
    L8:
        State<TransformedText> r2 = this.codepointTransformedText;
        if (r2 == null) goto L13;
        TransformedText r3 = r2.getValue();
        if (r3 == null) goto L13;
        visualMapping = r3.getOffsetMapping();
    L13:
        if (presentMapping == null) goto L16;
        OffsetMappingCalculator it = presentMapping;
        range = Companion.m1322mapToTransformedXGyztTk$default(Companion, range, it, null, 4, null);
    L16:
        if (visualMapping == null) goto L19;
        OffsetMappingCalculator it2 = visualMapping;
        return Companion.m1319access$mapToTransformedXGyztTk(Companion, range, it2, getSelectionWedgeAffinity());
    L19:
        return range;
    L7:
        presentMapping = null;
        goto L8
    }

    /* JADX INFO: renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m1311mapFromTransformedjx7JFs(int offset) {
        State<TransformedText> r0 = this.outputTransformedText;
        OffsetMappingCalculator visualMapping = null;
        if (r0 == null) goto L7;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L7;
        OffsetMappingCalculator presentMapping = r1.getOffsetMapping();
    L8:
        State<TransformedText> r2 = this.codepointTransformedText;
        if (r2 == null) goto L13;
        TransformedText r3 = r2.getValue();
        if (r3 == null) goto L13;
        visualMapping = r3.getOffsetMapping();
    L13:
        if (visualMapping == null) goto L15;
        long intermediateOffset = visualMapping.m1261mapFromDestjx7JFs(offset);
    L16:
        if (presentMapping == null) goto L19;
        OffsetMappingCalculator it = presentMapping;
        return Companion.m1318access$mapFromTransformedxdX6G0(Companion, intermediateOffset, it);
    L19:
        return intermediateOffset;
    L15:
        intermediateOffset = TextRangeKt.TextRange(offset);
    L7:
        presentMapping = null;
        goto L8
    }

    /* JADX INFO: renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1312mapFromTransformedGEjPoXI(long range) {
        State<TransformedText> r0 = this.outputTransformedText;
        OffsetMappingCalculator visualMapping = null;
        if (r0 == null) goto L7;
        TransformedText r1 = r0.getValue();
        if (r1 == null) goto L7;
        OffsetMappingCalculator presentMapping = r1.getOffsetMapping();
    L8:
        State<TransformedText> r2 = this.codepointTransformedText;
        if (r2 == null) goto L13;
        TransformedText r3 = r2.getValue();
        if (r3 == null) goto L13;
        visualMapping = r3.getOffsetMapping();
    L13:
        if (visualMapping == null) goto L15;
        OffsetMappingCalculator it = visualMapping;
        long intermediateRange = Companion.m1318access$mapFromTransformedxdX6G0(Companion, range, it);
    L16:
        if (presentMapping == null) goto L19;
        OffsetMappingCalculator it2 = presentMapping;
        return Companion.m1318access$mapFromTransformedxdX6G0(Companion, intermediateRange, it2);
    L19:
        return intermediateRange;
    L15:
        intermediateRange = range;
    L7:
        presentMapping = null;
        goto L8
    }

    public final Object collectImeNotifications(final TextFieldState.NotifyImeListener notifyImeListener, Continuation<?> r13) {
        if ((r13 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        TextFieldState.NotifyImeListener r3 = (TextFieldState.NotifyImeListener) r0.L$1;
        TransformedTextFieldState r4 = (TransformedTextFieldState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L24:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        if (this.outputTransformation == null) goto L17;
        notifyImeListener = new TransformedTextFieldState$$ExternalSyntheticLambda0(notifyImeListener, this);
    L17:
        r0.L$0 = this;
        r0.L$1 = notifyImeListener;
        r0.label = 1;
        Continuation uCont$iv = r0;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        access$getTextFieldState$p(this).addNotifyImeListener$foundation_release(notifyImeListener);
        continuation.invokeOnCancellation(new TransformedTextFieldState$collectImeNotifications$2$1(this, notifyImeListener));
        Object r12 = cancellable$iv.getResult();
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L20;
        DebugProbesKt.probeCoroutineSuspended(r0);
    L20:
        if (r12 != r2) goto L24;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r13);
        goto L8
    }

    static final void collectImeNotifications$lambda$18(TextFieldState.NotifyImeListener $notifyImeListener, TransformedTextFieldState this$0, TextFieldCharSequence oldValue, TextFieldCharSequence r5, boolean restartIme) {
        TransformedText r6 = Companion.access$calculateTransformedText(Companion, oldValue, this$0.outputTransformation, this$0.getSelectionWedgeAffinity());
        if (r6 == null) goto L7;
        TextFieldCharSequence r7 = r6.getText();
        if (r7 == null) goto L7;
    L8:
        $notifyImeListener.onChange(r7, this$0.getVisualText(), restartIme);
        return;
    L7:
        r7 = oldValue;
        goto L8
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TransformedTextFieldState) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.textFieldState, ((TransformedTextFieldState) other).textFieldState) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.codepointTransformation, ((TransformedTextFieldState) other).codepointTransformation) == true) goto L15;
        return false;
    L15:
        return Intrinsics.areEqual(this.outputTransformation, ((TransformedTextFieldState) other).outputTransformation);
    }

    public int hashCode() {
        int result = this.textFieldState.hashCode();
        int r1 = result * 31;
        CodepointTransformation r2 = this.codepointTransformation;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = result2 * 31;
        OutputTransformation r5 = this.outputTransformation;
        if (r5 == null) goto L10;
        r3 = r5.hashCode();
    L10:
        return result3 + r3;
    L5:
        r4 = 0;
        goto L6
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + getOutputText() + "\", visualText=\"" + getVisualText() + "\")";
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, OutputTransformation outputTransformation, SelectionWedgeAffinity wedgeAffinity) {
        return Companion.access$calculateTransformedText(Companion, untransformedValue, outputTransformation, wedgeAffinity);
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence untransformedValue, CodepointTransformation codepointTransformation, SelectionWedgeAffinity wedgeAffinity) {
        return Companion.access$calculateTransformedText(Companion, untransformedValue, codepointTransformation, wedgeAffinity);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m1308mapToTransformedXGyztTk(long range, OffsetMappingCalculator mapping, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m1319access$mapToTransformedXGyztTk(Companion, range, mapping, selectionWedgeAffinity);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1307mapFromTransformedxdX6G0(long range, OffsetMappingCalculator mapping) {
        return Companion.m1318access$mapFromTransformedxdX6G0(Companion, range, mapping);
    }
}
