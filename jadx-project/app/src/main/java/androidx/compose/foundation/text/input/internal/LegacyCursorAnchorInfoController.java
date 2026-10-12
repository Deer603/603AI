package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LegacyCursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020\u0005J6\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010$\u001a\u00020\u0005H\u0002J.\u0010%\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "", "localToScreen", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "inputMethodManager", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "androidMatrix", "Landroid/graphics/Matrix;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "decorationBoxBounds", "Landroidx/compose/ui/geometry/Rect;", "hasPendingImmediateRequest", "", "includeCharacterBounds", "includeEditorBounds", "includeInsertionMarker", "includeLineBounds", "innerTextFieldBounds", "lock", "matrix", "[F", "monitorEnabled", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invalidate", "requestUpdate", "immediate", "monitor", "updateCursorAnchorInfo", "updateTextLayoutResult", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 0;
    private final Matrix androidMatrix;
    private final CursorAnchorInfo.Builder builder;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private final Function1<androidx.compose.ui.graphics.Matrix, Unit> localToScreen;
    private final Object lock;
    private final float[] matrix;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyCursorAnchorInfoController(Function1<? super androidx.compose.ui.graphics.Matrix, Unit> r3, InputMethodManager inputMethodManager) {
        this.localToScreen = r3;
        this.inputMethodManager = inputMethodManager;
        this.lock = new Object();
        this.builder = new CursorAnchorInfo.Builder();
        this.matrix = androidx.compose.ui.graphics.Matrix.m4596constructorimpl$default(null, 1, null);
        this.androidMatrix = new Matrix();
    }

    public final void requestUpdate(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        Object r0 = this.lock;
        monitor-enter(r0);
        this.includeInsertionMarker = includeInsertionMarker;     // Catch: Throwable -> L13
        this.includeCharacterBounds = includeCharacterBounds;     // Catch: Throwable -> L13
        this.includeEditorBounds = includeEditorBounds;     // Catch: Throwable -> L13
        this.includeLineBounds = includeLineBounds;     // Catch: Throwable -> L13
        if (immediate == false) goto L10;
        this.hasPendingImmediateRequest = true;     // Catch: Throwable -> L13
        if (this.textFieldValue == null) goto L10;
        updateCursorAnchorInfo();     // Catch: Throwable -> L13
    L10:
        this.monitorEnabled = monitor;     // Catch: Throwable -> L13
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L13
        monitor-exit(r0);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        Object r0 = this.lock;
        monitor-enter(r0);
        this.textFieldValue = textFieldValue;     // Catch: Throwable -> L13
        this.offsetMapping = offsetMapping;     // Catch: Throwable -> L13
        this.textLayoutResult = textLayoutResult;     // Catch: Throwable -> L13
        this.innerTextFieldBounds = innerTextFieldBounds;     // Catch: Throwable -> L13
        this.decorationBoxBounds = decorationBoxBounds;     // Catch: Throwable -> L13
        if (this.hasPendingImmediateRequest == false) goto L8;
    L9:
        updateCursorAnchorInfo();     // Catch: Throwable -> L13
    L10:
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L13
        monitor-exit(r0);
        return;
    L8:
        if (this.monitorEnabled == false) goto L10;
    L13:
        th = move-exception;
        throw th;
    }

    public final void invalidate() {
        Object r0 = this.lock;
        monitor-enter(r0);
        this.textFieldValue = null;     // Catch: Throwable -> L8
        this.offsetMapping = null;     // Catch: Throwable -> L8
        this.textLayoutResult = null;     // Catch: Throwable -> L8
        this.innerTextFieldBounds = null;     // Catch: Throwable -> L8
        this.decorationBoxBounds = null;     // Catch: Throwable -> L8
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive() == true) goto L5;
        return;
    L5:
        if (this.textFieldValue != null) goto L7;
        return;
    L7:
        if (this.offsetMapping != null) goto L9;
        return;
    L9:
        if (this.textLayoutResult != null) goto L11;
        return;
    L11:
        if (this.innerTextFieldBounds != null) goto L13;
        return;
    L13:
        if (this.decorationBoxBounds == null) goto L22;
        androidx.compose.ui.graphics.Matrix.m4605resetimpl(this.matrix);
        this.localToScreen.invoke(androidx.compose.ui.graphics.Matrix.m4594boximpl(this.matrix));
        float[] r0 = this.matrix;
        Rect r1 = this.decorationBoxBounds;
        Intrinsics.checkNotNull(r1);
        float r2 = -r1.getLeft();
        Rect r3 = this.decorationBoxBounds;
        Intrinsics.checkNotNull(r3);
        androidx.compose.ui.graphics.Matrix.m4617translateimpl(r0, r2, -r3.getTop(), 0.0f);
        AndroidMatrixConversions_androidKt.m4236setFromEL8BTi8(this.androidMatrix, this.matrix);
        InputMethodManager r4 = this.inputMethodManager;
        CursorAnchorInfo.Builder r5 = this.builder;
        TextFieldValue r6 = this.textFieldValue;
        Intrinsics.checkNotNull(r6);
        OffsetMapping r7 = this.offsetMapping;
        Intrinsics.checkNotNull(r7);
        TextLayoutResult r8 = this.textLayoutResult;
        Intrinsics.checkNotNull(r8);
        Matrix r9 = this.androidMatrix;
        Rect r10 = this.innerTextFieldBounds;
        Intrinsics.checkNotNull(r10);
        Rect r11 = this.decorationBoxBounds;
        Intrinsics.checkNotNull(r11);
        r4.updateCursorAnchorInfo(LegacyCursorAnchorInfoBuilder_androidKt.build(r5, r6, r7, r8, r9, r10, r11, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
        return;
    }
}
