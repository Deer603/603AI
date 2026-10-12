package androidx.compose.foundation.text.input;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0018\u00010\bH\u0002ø\u0001\u0000¢\u0006\u0002\b\t\u001a&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000b\u001a\u0012\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r\u001a\u0012\u0010\u0015\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"finalizeComposingAnnotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composition", "Landroidx/compose/ui/text/TextRange;", "annotationList", "Landroidx/compose/runtime/collection/MutableVector;", "finalizeComposingAnnotations-itr0ztk", "rememberTextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "initialText", "", "initialSelection", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;", "clearText", "", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "toTextFieldBuffer", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldStateKt {
    /* JADX INFO: renamed from: access$finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final /* synthetic */ List m1191access$finalizeComposingAnnotationsitr0ztk(TextRange composition, MutableVector annotationList) {
        return m1192finalizeComposingAnnotationsitr0ztk(composition, annotationList);
    }

    /* JADX INFO: renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m1193rememberTextFieldStateLepunE(final String initialText, final long initialSelection, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, 1125389485, "C(rememberTextFieldState)P(1,0:c#ui.text.TextRange)644@28644L49,644@28597L96:TextFieldState.kt#hp9ohv");
        if ((r13 & 1) == 0) goto L6;
        initialText = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        initialSelection = TextRangeKt.TextRange(initialText.length());
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1125389485, $changed, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:644)");
    L11:
        boolean r14 = false;
        Object[] r0 = new Object[0];
        TextFieldState.Saver r1 = TextFieldState.Saver.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 975867757, "CC(remember):TextFieldState.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialText) == false) goto L16;
    L17:
        boolean r2 = true;
    L20:
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(initialSelection) == false) goto L24;
    L25:
        r14 = true;
    L26:
        boolean invalid$iv = r14 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new TextFieldStateKt$rememberTextFieldState$1$1(initialText, initialSelection);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        TextFieldState r11 = (TextFieldState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 48, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 48) != 32) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r2 = false;
        goto L20
    }

    public static final void setTextAndPlaceCursorAtEnd(TextFieldState $this$setTextAndPlaceCursorAtEnd, String text) {
        TextFieldBuffer mutableValue$iv = $this$setTextAndPlaceCursorAtEnd.startEdit();
        mutableValue$iv.replace(0, mutableValue$iv.getLength(), text);     // Catch: Throwable -> L6
        TextFieldBufferKt.placeCursorAtEnd(mutableValue$iv);     // Catch: Throwable -> L6
        $this$setTextAndPlaceCursorAtEnd.commitEdit(mutableValue$iv);     // Catch: Throwable -> L6
        $this$setTextAndPlaceCursorAtEnd.finishEditing();
        return;
    L6:
        th = move-exception;
        $this$setTextAndPlaceCursorAtEnd.finishEditing();
        throw th;
    }

    public static final void setTextAndSelectAll(TextFieldState $this$setTextAndSelectAll, String text) {
        TextFieldBuffer mutableValue$iv = $this$setTextAndSelectAll.startEdit();
        mutableValue$iv.replace(0, mutableValue$iv.getLength(), text);     // Catch: Throwable -> L6
        TextFieldBufferKt.selectAll(mutableValue$iv);     // Catch: Throwable -> L6
        $this$setTextAndSelectAll.commitEdit(mutableValue$iv);     // Catch: Throwable -> L6
        $this$setTextAndSelectAll.finishEditing();
        return;
    L6:
        th = move-exception;
        $this$setTextAndSelectAll.finishEditing();
        throw th;
    }

    public static final void clearText(TextFieldState $this$clearText) {
        TextFieldBuffer mutableValue$iv = $this$clearText.startEdit();
        TextFieldBufferKt.delete(mutableValue$iv, 0, mutableValue$iv.getLength());     // Catch: Throwable -> L6
        TextFieldBufferKt.placeCursorAtEnd(mutableValue$iv);     // Catch: Throwable -> L6
        $this$clearText.commitEdit(mutableValue$iv);     // Catch: Throwable -> L6
        $this$clearText.finishEditing();
        return;
    L6:
        th = move-exception;
        $this$clearText.finishEditing();
        throw th;
    }

    /* JADX INFO: renamed from: finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    private static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m1192finalizeComposingAnnotationsitr0ztk(TextRange composition, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r25) {
        if (r25 != null) goto L4;
    L9:
        if (composition == null) goto L14;
        if (TextRange.m6411getCollapsedimpl(composition.m6421unboximpl()) == true) goto L14;
        return CollectionsKt.listOf(new AnnotatedString.Range(new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, TextDecoration.Companion.getUnderline(), null, null, null, 61439, null), TextRange.m6415getMinimpl(composition.m6421unboximpl()), TextRange.m6414getMaximpl(composition.m6421unboximpl())));
    L14:
        return CollectionsKt.emptyList();
    L4:
        if (r25.getSize() == 0) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L9;
        return CollectionsKt.toList(r25.asMutableList());
    L6:
        r2 = false;
        goto L7
    }

    public static final TextFieldBuffer toTextFieldBuffer(TextFieldState $this$toTextFieldBuffer) {
        return new TextFieldBuffer($this$toTextFieldBuffer.getValue$foundation_release(), null, null, null, 14, null);
    }
}
