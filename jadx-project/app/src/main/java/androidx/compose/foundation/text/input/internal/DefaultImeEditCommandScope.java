package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ImeEditCommand.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J!\u0010\u000f\u001a\u00020\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010\u0007\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "batchDepth", "", "editCommands", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Lkotlin/ExtensionFunctionType;", "beginBatchEdit", "", "edit", "block", "endBatchEdit", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {
    public static final int $stable = 0;
    private int batchDepth;
    private final MutableVector<Function1<TextFieldBuffer, Unit>> editCommands;
    private final TransformedTextFieldState transformedTextFieldState;

    static {
        $stable = 8;
    }

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.transformedTextFieldState = transformedTextFieldState;
        this.editCommands = new MutableVector(new Function1[16], 0);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* JADX INFO: renamed from: mapFromTransformed-GEjPoXI */
    public long mo1216mapFromTransformedGEjPoXI(long range) {
        return this.transformedTextFieldState.m1312mapFromTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* JADX INFO: renamed from: mapToTransformed-GEjPoXI */
    public long mo1217mapToTransformedGEjPoXI(long range) {
        return this.transformedTextFieldState.m1314mapToTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        this.batchDepth++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(Function1<? super TextFieldBuffer, Unit> r2) {
        beginBatchEdit();
        this.editCommands.add(r2);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        this.batchDepth--;
        if (this.batchDepth != 0) goto L14;
        if (this.editCommands.getSize() == 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L14;
        TransformedTextFieldState this_$iv = this.transformedTextFieldState;
        TextFieldState $this$iv$iv = TransformedTextFieldState.access$getTextFieldState$p(this_$iv);
        InputTransformation inputTransformation$iv$iv = TransformedTextFieldState.access$getInputTransformation$p(this_$iv);
        TextFieldEditUndoBehavior undoBehavior$iv$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411$iv = $this$iv$iv.getMainBuffer$foundation_release();
        MutableVector<Function1<TextFieldBuffer, Unit>> r14 = this.editCommands;
        Object[] content$iv = r14.content;
        int size$iv = r14.getSize();
        int i$iv = 0;
    L10:
        if (i$iv >= size$iv) goto L12;
        ((Function1) content$iv[i$iv]).invoke($this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        i$iv = i$iv + 1;
        goto L10
    L12:
        TransformedTextFieldState.access$updateWedgeAffinity(this_$iv, $this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        TextFieldState.access$commitEditAsUser($this$iv$iv, inputTransformation$iv$iv, false, undoBehavior$iv$iv);
        this.editCommands.clear();
        goto L14
    L7:
        r1 = false;
    L14:
        if (this.batchDepth <= 0) goto L16;
        return true;
    L16:
        return false;
    }
}
