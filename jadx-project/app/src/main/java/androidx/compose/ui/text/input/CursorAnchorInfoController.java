package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020\u001dJ6\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010&\u001a\u00020\u001dH\u0002JB\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "rootPositionCalculator", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "(Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;)V", "androidMatrix", "Landroid/graphics/Matrix;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "decorationBoxBounds", "Landroidx/compose/ui/geometry/Rect;", "hasPendingImmediateRequest", "", "includeCharacterBounds", "includeEditorBounds", "includeInsertionMarker", "includeLineBounds", "innerTextFieldBounds", "lock", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "monitorEnabled", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textFieldToRootTransform", "Lkotlin/Function1;", "", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invalidate", "requestUpdate", "immediate", "monitor", "updateCursorAnchorInfo", "updateTextLayoutResult", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CursorAnchorInfoController {
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
    private final Object lock;
    private final float[] matrix;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final MatrixPositionCalculator rootPositionCalculator;
    private Function1<? super androidx.compose.ui.graphics.Matrix, Unit> textFieldToRootTransform;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;

    static {
        $stable = 8;
    }

    public CursorAnchorInfoController(MatrixPositionCalculator rootPositionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = rootPositionCalculator;
        this.inputMethodManager = inputMethodManager;
        this.lock = new Object();
        this.textFieldToRootTransform = CursorAnchorInfoController$textFieldToRootTransform$1.INSTANCE;
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

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1<? super androidx.compose.ui.graphics.Matrix, Unit> r7, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        Object r0 = this.lock;
        monitor-enter(r0);
        this.textFieldValue = textFieldValue;     // Catch: Throwable -> L13
        this.offsetMapping = offsetMapping;     // Catch: Throwable -> L13
        this.textLayoutResult = textLayoutResult;     // Catch: Throwable -> L13
        this.textFieldToRootTransform = r7;     // Catch: Throwable -> L13
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
        this.textFieldToRootTransform = CursorAnchorInfoController$invalidate$1$1.INSTANCE;     // Catch: Throwable -> L8
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
        this.textFieldToRootTransform.invoke(androidx.compose.ui.graphics.Matrix.m4594boximpl(this.matrix));
        this.rootPositionCalculator.mo5518localToScreen58bKbWc(this.matrix);
        AndroidMatrixConversions_androidKt.m4236setFromEL8BTi8(this.androidMatrix, this.matrix);
        InputMethodManager r0 = this.inputMethodManager;
        CursorAnchorInfo.Builder r1 = this.builder;
        TextFieldValue r2 = this.textFieldValue;
        Intrinsics.checkNotNull(r2);
        OffsetMapping r3 = this.offsetMapping;
        Intrinsics.checkNotNull(r3);
        TextLayoutResult r4 = this.textLayoutResult;
        Intrinsics.checkNotNull(r4);
        Matrix r5 = this.androidMatrix;
        Rect r6 = this.innerTextFieldBounds;
        Intrinsics.checkNotNull(r6);
        Rect r7 = this.decorationBoxBounds;
        Intrinsics.checkNotNull(r7);
        r0.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(r1, r2, r3, r4, r5, r6, r7, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }
}
