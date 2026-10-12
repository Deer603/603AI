package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J8\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;", "", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "composeImm", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "monitorScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/CoroutineScope;)V", "androidMatrix", "Landroid/graphics/Matrix;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "hasPendingImmediateRequest", "", "includeCharacterBounds", "includeEditorBounds", "includeInsertionMarker", "includeLineBounds", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "monitorEnabled", "monitorJob", "Lkotlinx/coroutines/Job;", "calculateCursorAnchorInfo", "Landroid/view/inputmethod/CursorAnchorInfo;", "requestUpdates", "", "immediate", "monitor", "cursorUpdateMode", "", "startOrStopMonitoring", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CursorAnchorInfoController {
    public static final int $stable = 0;
    private final Matrix androidMatrix;
    private final CursorAnchorInfo.Builder builder;
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private final float[] matrix;
    private boolean monitorEnabled;
    private Job monitorJob;
    private final CoroutineScope monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1, reason: invalid class name */
    /* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CursorAnchorInfoController this$0;

        AnonymousClass1(CursorAnchorInfoController r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final CursorAnchorInfoController r2 = this.this$0;
            Flow r1 = FlowKt.filterNotNull(FlowKt.drop(SnapshotStateKt.snapshotFlow(new C00461(r2)), 1));
            final CursorAnchorInfoController r4 = this.this$0;
            this.label = 1;
            if (r1.collect(new AnonymousClass2(r4), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public CursorAnchorInfoController(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeImm, CoroutineScope monitorScope) {
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeImm;
        this.monitorScope = monitorScope;
        this.builder = new CursorAnchorInfo.Builder();
        this.matrix = androidx.compose.ui.graphics.Matrix.m4596constructorimpl$default(null, 1, null);
        this.androidMatrix = new Matrix();
    }

    public static final /* synthetic */ CursorAnchorInfo access$calculateCursorAnchorInfo(CursorAnchorInfoController $this) {
        return $this.calculateCursorAnchorInfo();
    }

    public static final /* synthetic */ ComposeInputMethodManager access$getComposeImm$p(CursorAnchorInfoController $this) {
        return $this.composeImm;
    }

    public final void requestUpdates(int cursorUpdateMode) {
        boolean r1 = false;
        if ((cursorUpdateMode & 1) == 0) goto L5;
        boolean r0 = true;
    L6:
        boolean immediate = r0;
        if ((cursorUpdateMode & 2) == 0) goto L9;
        boolean monitor = true;
    L10:
        boolean includeLineBounds = false;
        if (Build.VERSION.SDK_INT >= 33) goto L13;
        boolean includeEditorBounds = false;
        boolean includeLineBounds2 = false;
        boolean includeEditorBounds2 = true;
        boolean includeLineBounds3 = true;
    L41:
        requestUpdates(immediate, monitor, includeEditorBounds2, includeLineBounds3, includeEditorBounds, includeLineBounds2);
        return;
    L13:
        if ((cursorUpdateMode & 16) == 0) goto L15;
        boolean r8 = true;
    L16:
        boolean includeInsertionMarker = r8;
        if ((cursorUpdateMode & 8) == 0) goto L19;
        boolean r9 = true;
    L20:
        boolean includeCharacterBounds = r9;
        if ((cursorUpdateMode & 4) == 0) goto L23;
        boolean r10 = true;
    L24:
        boolean includeEditorBounds3 = r10;
        if (Build.VERSION.SDK_INT >= 34) goto L27;
    L31:
        if (includeInsertionMarker == true) goto L39;
        if (includeCharacterBounds == true) goto L39;
        if (includeEditorBounds3 == true) goto L39;
        if (includeLineBounds == true) goto L39;
        if (Build.VERSION.SDK_INT < 34) goto L38;
        includeEditorBounds = true;
        includeLineBounds2 = true;
        includeEditorBounds2 = true;
        includeLineBounds3 = true;
        goto L41
    L38:
        includeEditorBounds = true;
        includeLineBounds2 = includeLineBounds;
        includeEditorBounds2 = true;
        includeLineBounds3 = true;
    L39:
        includeEditorBounds = includeEditorBounds3;
        includeLineBounds2 = includeLineBounds;
        includeEditorBounds2 = includeInsertionMarker;
        includeLineBounds3 = includeCharacterBounds;
        goto L41
    L27:
        if ((cursorUpdateMode & 32) == 0) goto L29;
        r1 = true;
    L29:
        includeLineBounds = r1;
        goto L31
    L23:
        r10 = false;
        goto L24
    L19:
        r9 = false;
        goto L20
    L15:
        r8 = false;
        goto L16
    L9:
        monitor = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    private final void requestUpdates(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        this.includeInsertionMarker = includeInsertionMarker;
        this.includeCharacterBounds = includeCharacterBounds;
        this.includeEditorBounds = includeEditorBounds;
        this.includeLineBounds = includeLineBounds;
        if (immediate == false) goto L7;
        this.hasPendingImmediateRequest = true;
        CursorAnchorInfo p0 = calculateCursorAnchorInfo();
        if (p0 == null) goto L7;
        this.composeImm.updateCursorAnchorInfo(p0);
    L7:
        this.monitorEnabled = monitor;
        startOrStopMonitoring();
    }

    private final void startOrStopMonitoring() {
        boolean r0 = this.monitorEnabled;
        Job r1 = this.monitorJob;
        boolean r2 = true;
        if (r0 == true) goto L5;
        if (r1 == null) goto L14;
        Job.DefaultImpls.cancel$default(r1, null, 1, null);
    L14:
        this.monitorJob = null;
        return;
    L5:
        if (r1 != null) goto L7;
    L9:
        r2 = false;
    L10:
        if (r2 == true) goto L16;
        this.monitorJob = BuildersKt.launch$default(this.monitorScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
        return;
    L16:
        return;
    L7:
        if (r1.isActive() != true) goto L9;
        goto L9
    }

    private final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates textLayoutCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutCoordinates != null) goto L5;
    L35:
        return null;
    L5:
        if (textLayoutCoordinates.isAttached() == true) goto L8;
        textLayoutCoordinates = null;
    L8:
        if (textLayoutCoordinates == null) goto L35;
        LayoutCoordinates coreCoordinates = this.textLayoutState.getCoreNodeCoordinates();
        if (coreCoordinates == null) goto L34;
        if (coreCoordinates.isAttached() == true) goto L16;
        coreCoordinates = null;
    L16:
        if (coreCoordinates == null) goto L34;
        LayoutCoordinates decorationBoxCoordinates = this.textLayoutState.getDecoratorNodeCoordinates();
        if (decorationBoxCoordinates == null) goto L32;
        if (decorationBoxCoordinates.isAttached() == true) goto L24;
        decorationBoxCoordinates = null;
    L24:
        if (decorationBoxCoordinates == null) goto L32;
        TextLayoutResult textLayoutResult = this.textLayoutState.getLayoutResult();
        if (textLayoutResult != null) goto L29;
        return null;
    L29:
        TextFieldCharSequence text = this.textFieldState.getVisualText();
        androidx.compose.ui.graphics.Matrix.m4605resetimpl(this.matrix);
        textLayoutCoordinates.mo5730transformToScreen58bKbWc(this.matrix);
        AndroidMatrixConversions_androidKt.m4236setFromEL8BTi8(this.androidMatrix, this.matrix);
        Rect innerTextFieldBounds = SelectionManagerKt.visibleBounds(coreCoordinates).m4162translatek4lQ0M(textLayoutCoordinates.mo5723localPositionOfR5De75A(coreCoordinates, Offset.Companion.m4141getZeroF1C5BW0()));
        Rect decorationBoxBounds = SelectionManagerKt.visibleBounds(decorationBoxCoordinates).m4162translatek4lQ0M(textLayoutCoordinates.mo5723localPositionOfR5De75A(decorationBoxCoordinates, Offset.Companion.m4141getZeroF1C5BW0()));
        return CursorAnchorInfoBuilder_androidKt.m1226buildvxqZcH0(this.builder, text, text.m1188getSelectiond9O1mEE(), text.m1187getCompositionMzsxiRA(), textLayoutResult, this.androidMatrix, innerTextFieldBounds, decorationBoxBounds, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
    L32:
        return null;
    L34:
        return null;
    }
}
