package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: TextFieldCoreModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BM\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\"\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020-H\u0002JN\u00102\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\f\u00103\u001a\u00020-*\u000204H\u0016J\f\u00105\u001a\u00020-*\u000206H\u0016J\f\u00107\u001a\u00020-*\u000208H\u0002J(\u00109\u001a\u00020-*\u0002082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u001f0;2\u0006\u0010=\u001a\u00020>H\u0002J&\u0010?\u001a\u00020-*\u0002082\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0014\u0010C\u001a\u00020-*\u0002082\u0006\u0010=\u001a\u00020>H\u0002J&\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ&\u0010M\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010LJ&\u0010O\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010LJ6\u0010Q\u001a\u00020-*\u00020R2\u0006\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020VH\u0002ø\u0001\u0000¢\u0006\u0004\bW\u0010XR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "isFocused", "", "isDragHovered", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "writeable", "scrollState", "Landroidx/compose/foundation/ScrollState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "changeObserverJob", "Lkotlinx/coroutines/Job;", "cursorAnimation", "Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "previousTextLayoutSize", "", "showCursor", "getShowCursor", "()Z", "textFieldMagnifierNode", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "calculateOffsetToFollow", "currSelection", "currTextLayoutSize", "calculateOffsetToFollow-72CqOWE", "(JI)I", "onAttach", "", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "startCursorJob", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawCursor", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawHighlight", "highlight", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawSelection", "selection", "drawSelection-Sb-Bc2M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/text/TextLayoutResult;)V", "drawText", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureHorizontalScroll", "measureHorizontalScroll-3p2s80s", "measureVerticalScroll", "measureVerticalScroll-3p2s80s", "updateScrollState", "Landroidx/compose/ui/unit/Density;", "containerSize", "textLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "updateScrollState-tIlFzwE", "(Landroidx/compose/ui/unit/Density;IIJLandroidx/compose/ui/unit/LayoutDirection;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 0;
    private Job changeObserverJob;
    private CursorAnimationState cursorAnimation;
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;
    private Orientation orientation;
    private Rect previousCursorRect;
    private TextRange previousSelection;
    private int previousTextLayoutSize;
    private ScrollState scrollState;
    private final TextFieldMagnifierNode textFieldMagnifierNode;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean writeable;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldCoreModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", i = {}, l = {558}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TextFieldCoreModifierNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldCoreModifier.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isWindowFocused", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", i = {}, l = {560}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ TextFieldCoreModifierNode this$0;

            AnonymousClass2(TextFieldCoreModifierNode r2, Continuation<? super AnonymousClass2> r3) {
                this.this$0 = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                AnonymousClass2 r0 = new AnonymousClass2(this.this$0, r4);
                r0.I$0 = ((Number) r3).intValue();
                return r0;
            }

            public final Object invoke(int r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass2) create(Integer.valueOf(r3), r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer r3, Continuation<? super Unit> r4) {
                return invoke(r3.intValue(), r4);
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
            L16:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                int isWindowFocused = this.I$0;
                if (Math.abs(isWindowFocused) != 1) goto L16;
                CursorAnimationState r1 = TextFieldCoreModifierNode.access$getCursorAnimation$p(this.this$0);
                if (r1 == null) goto L16;
                this.label = 1;
                if (r1.snapToVisibleAndAnimate(this) != r0) goto L16;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(TextFieldCoreModifierNode r2, Continuation<? super AnonymousClass1> r3) {
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
            final Ref.IntRef sign = new Ref.IntRef();
            sign.element = 1;
            final TextFieldCoreModifierNode r4 = this.this$0;
            this.label = 1;
            if (FlowKt.collectLatest(SnapshotStateKt.snapshotFlow(new C00471(r4, sign)), new AnonymousClass2(this.this$0, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ CursorAnimationState access$getCursorAnimation$p(TextFieldCoreModifierNode $this) {
        return $this.cursorAnimation;
    }

    public static final /* synthetic */ ScrollState access$getScrollState$p(TextFieldCoreModifierNode $this) {
        return $this.scrollState;
    }

    public static final /* synthetic */ TransformedTextFieldState access$getTextFieldState$p(TextFieldCoreModifierNode $this) {
        return $this.textFieldState;
    }

    public static final /* synthetic */ TextLayoutState access$getTextLayoutState$p(TextFieldCoreModifierNode $this) {
        return $this.textLayoutState;
    }

    /* JADX INFO: renamed from: access$updateScrollState-tIlFzwE, reason: not valid java name */
    public static final /* synthetic */ void m1276access$updateScrollStatetIlFzwE(TextFieldCoreModifierNode $this, Density $receiver, int containerSize, int textLayoutSize, long currSelection, LayoutDirection layoutDirection) {
        $this.m1281updateScrollStatetIlFzwE($receiver, containerSize, textLayoutSize, currSelection, layoutDirection);
    }

    public TextFieldCoreModifierNode(boolean isFocused, boolean isDragHovered, TextLayoutState textLayoutState, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, Brush cursorBrush, boolean writeable, ScrollState scrollState, Orientation orientation) {
        this.isFocused = isFocused;
        this.isDragHovered = isDragHovered;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
        TransformedTextFieldState r0 = this.textFieldState;
        TextFieldSelectionState r1 = this.textFieldSelectionState;
        TextLayoutState r2 = this.textLayoutState;
        if (this.isFocused == false) goto L5;
    L8:
        boolean r3 = true;
    L9:
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(r0, r1, r2, r3));
        return;
    L5:
        if (this.isDragHovered == true) goto L8;
        r3 = false;
        goto L9
    }

    private final boolean getShowCursor() {
        if (this.writeable == true) goto L5;
    L11:
        return false;
    L5:
        if (this.isFocused == true) goto L9;
        if (this.isDragHovered == false) goto L11;
    L9:
        if (TextFieldCoreModifierKt.access$isSpecified(this.cursorBrush) == false) goto L11;
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused == true) goto L5;
        return;
    L5:
        if (getShowCursor() == false) goto L9;
        startCursorJob();
        return;
    }

    public final void updateNode(boolean isFocused, boolean isDragHovered, TextLayoutState textLayoutState, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, Brush cursorBrush, boolean writeable, ScrollState scrollState, Orientation orientation) {
        boolean previousShowCursor = getShowCursor();
        boolean wasFocused = this.isFocused;
        TransformedTextFieldState previousTextFieldState = this.textFieldState;
        TextLayoutState previousTextLayoutState = this.textLayoutState;
        TextFieldSelectionState previousTextFieldSelectionState = this.textFieldSelectionState;
        ScrollState previousScrollState = this.scrollState;
        this.isFocused = isFocused;
        this.isDragHovered = isDragHovered;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        TextFieldMagnifierNode r1 = this.textFieldMagnifierNode;
        if (isFocused == true) goto L7;
        if (isDragHovered == true) goto L7;
        boolean r2 = false;
    L8:
        r1.update(textFieldState, textFieldSelectionState, textLayoutState, r2);
        if (getShowCursor() == true) goto L18;
        Job r3 = this.changeObserverJob;
        if (r3 == null) goto L14;
        Job.DefaultImpls.cancel$default(r3, null, 1, null);
    L14:
        this.changeObserverJob = null;
        CursorAnimationState r4 = this.cursorAnimation;
        if (r4 == null) goto L24;
        r4.cancelAndHide();
    L24:
        if (Intrinsics.areEqual(previousTextFieldState, textFieldState) == true) goto L26;
    L31:
        LayoutModifierNodeKt.invalidateMeasurement(this);
        return;
    L26:
        if (Intrinsics.areEqual(previousTextLayoutState, textLayoutState) == false) goto L31;
        if (Intrinsics.areEqual(previousTextFieldSelectionState, textFieldSelectionState) == false) goto L31;
        if (Intrinsics.areEqual(previousScrollState, scrollState) == false) goto L31;
        return;
    L18:
        if (wasFocused == true) goto L20;
    L22:
        startCursorJob();
        goto L24
    L20:
        if (Intrinsics.areEqual(previousTextFieldState, textFieldState) == false) goto L22;
        if (previousShowCursor == true) goto L24;
    L7:
        r2 = true;
        goto L8
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (this.orientation != Orientation.Vertical) goto L6;
        return m1280measureVerticalScroll3p2s80s($this$measure_u2d3p2s80s, measurable, constraints);
    L6:
        return m1279measureHorizontalScroll3p2s80s($this$measure_u2d3p2s80s, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        $this$draw.drawContent();
        TextFieldCharSequence value = this.textFieldState.getVisualText();
        TextLayoutResult textLayoutResult = this.textLayoutState.getLayoutResult();
        if (textLayoutResult != null) goto L5;
        return;
    L5:
        Pair<TextHighlightType, TextRange> r2 = value.getHighlight();
        if (r2 == null) goto L9;
        drawHighlight($this$draw, r2, textLayoutResult);
    L9:
        if (TextRange.m6411getCollapsedimpl(value.m1188getSelectiond9O1mEE()) == false) goto L14;
        drawText($this$draw, textLayoutResult);
        if (value.shouldShowSelection() == false) goto L17;
        drawCursor($this$draw);
    L17:
        TextFieldMagnifierNode $this$draw_u24lambda_u241 = this.textFieldMagnifierNode;
        $this$draw_u24lambda_u241.draw($this$draw);
        return;
    L14:
        if (value.shouldShowSelection() == false) goto L16;
        m1278drawSelectionSbBc2M($this$draw, value.m1188getSelectiond9O1mEE(), textLayoutResult);
    L16:
        drawText($this$draw, textLayoutResult);
        goto L17
    }

    /* JADX INFO: renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1280measureVerticalScroll3p2s80s(final MeasureScope $this$measureVerticalScroll_u2d3p2s80s, Measurable measurable, long constraints) {
        long childConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, Integer.MAX_VALUE, 7, null);
        final Placeable placeable = measurable.mo5714measureBRTryo0(childConstraints);
        final int height = Math.min(placeable.getHeight(), Constraints.m6925getMaxHeightimpl(constraints));
        return MeasureScope.layout$default($this$measureVerticalScroll_u2d3p2s80s, placeable.getWidth(), height, null, new TextFieldCoreModifierNode$measureVerticalScroll$1(this, $this$measureVerticalScroll_u2d3p2s80s, height, placeable), 4, null);
    }

    /* JADX INFO: renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1279measureHorizontalScroll3p2s80s(final MeasureScope $this$measureHorizontalScroll_u2d3p2s80s, Measurable measurable, long constraints) {
        final Placeable placeable = measurable.mo5714measureBRTryo0(Constraints.m6916copyZbe2FdA$default(constraints, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int width = Math.min(placeable.getWidth(), Constraints.m6926getMaxWidthimpl(constraints));
        return MeasureScope.layout$default($this$measureHorizontalScroll_u2d3p2s80s, width, placeable.getHeight(), null, new TextFieldCoreModifierNode$measureHorizontalScroll$1(this, $this$measureHorizontalScroll_u2d3p2s80s, width, placeable), 4, null);
    }

    /* JADX INFO: renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m1277calculateOffsetToFollow72CqOWE(long currSelection, int currTextLayoutSize) {
        TextRange r0 = this.previousSelection;
        boolean r1 = true;
        if (r0 != null) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L23;
        TextRange r3 = this.previousSelection;
        if (r3 != null) goto L13;
    L15:
        r1 = false;
    L16:
        if (r1 == true) goto L19;
        return TextRange.m6417getStartimpl(currSelection);
    L19:
        if (currTextLayoutSize != this.previousTextLayoutSize) goto L25;
        return -1;
    L25:
        return TextRange.m6417getStartimpl(currSelection);
    L13:
        if (TextRange.m6417getStartimpl(currSelection) != TextRange.m6417getStartimpl(r3.m6421unboximpl())) goto L15;
    L23:
        return TextRange.m6412getEndimpl(currSelection);
    L5:
        if (TextRange.m6412getEndimpl(currSelection) != TextRange.m6412getEndimpl(r0.m6421unboximpl())) goto L7;
        r2 = true;
        goto L8
    }

    /* JADX INFO: renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    private final void m1281updateScrollStatetIlFzwE(Density $this$updateScrollState_u2dtIlFzwE, int containerSize, int textLayoutSize, long currSelection, LayoutDirection layoutDirection) {
        this.scrollState.setMaxValue$foundation_release(textLayoutSize - containerSize);
        int offsetToFollow = m1277calculateOffsetToFollow72CqOWE(currSelection, textLayoutSize);
        if (offsetToFollow < 0) goto L54;
        if (getShowCursor() == false) goto L56;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult != null) goto L10;
        return;
    L10:
        boolean vertical = false;
        Rect rawCursorRect = layoutResult.getCursorRect(RangesKt.coerceIn(offsetToFollow, new IntRange(0, layoutResult.getLayoutInput().getText().length())));
        if (layoutDirection != LayoutDirection.Rtl) goto L13;
        boolean r9 = true;
    L14:
        Rect cursorRect = TextFieldCoreModifierKt.access$getCursorRectInScroller($this$updateScrollState_u2dtIlFzwE, rawCursorRect, r9, textLayoutSize);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft()) goto L17;
        boolean r14 = true;
    L18:
        if (r14 == false) goto L29;
        if (cursorRect.getTop() != this.previousCursorRect.getTop()) goto L22;
        boolean r15 = true;
    L23:
        if (r15 == false) goto L29;
        if (textLayoutSize != this.previousTextLayoutSize) goto L29;
        return;
    L22:
        r15 = false;
    L29:
        if (this.orientation != Orientation.Vertical) goto L31;
        vertical = true;
    L31:
        if (vertical == false) goto L33;
        float cursorStart = cursorRect.getTop();
    L34:
        if (vertical == false) goto L36;
        float cursorEnd = cursorRect.getBottom();
    L37:
        int startVisibleBound = this.scrollState.getValue();
        int difference = startVisibleBound + containerSize;
        if (cursorEnd <= difference) goto L41;
        float offsetDifference = cursorEnd - difference;
    L51:
        this.previousSelection = TextRange.m6405boximpl(currSelection);
        this.previousCursorRect = cursorRect;
        this.previousTextLayoutSize = textLayoutSize;
        BuildersKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, offsetDifference, rawCursorRect, null), 1, null);
        return;
    L41:
        if (cursorStart >= startVisibleBound) goto L46;
        if ((cursorEnd - cursorStart) <= containerSize) goto L46;
        offsetDifference = cursorEnd - difference;
    L46:
        if (cursorStart < startVisibleBound) goto L48;
    L50:
        offsetDifference = 0.0f;
        goto L51
    L48:
        if ((cursorEnd - cursorStart) > containerSize) goto L50;
        offsetDifference = cursorStart - startVisibleBound;
        goto L51
    L36:
        cursorEnd = cursorRect.getRight();
        goto L37
    L33:
        cursorStart = cursorRect.getLeft();
        goto L34
    L17:
        r14 = false;
        goto L18
    L13:
        r9 = false;
        goto L14
    L56:
        return;
    }

    /* JADX INFO: renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1278drawSelectionSbBc2M(DrawScope $this$drawSelection_u2dSb_u2dBc2M, long selection, TextLayoutResult textLayoutResult) {
        int start = TextRange.m6415getMinimpl(selection);
        int end = TextRange.m6414getMaximpl(selection);
        if (start == end) goto L6;
        long selectionBackgroundColor = ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1512getBackgroundColor0d7_KjU();
        Path selectionPath = textLayoutResult.getPathForRange(start, end);
        DrawScope.m4907drawPathLG529CI$default($this$drawSelection_u2dSb_u2dBc2M, selectionPath, selectionBackgroundColor, 0.0f, null, null, 0, 60, null);
        return;
    }

    private final void drawHighlight(DrawScope $this$drawHighlight, Pair<TextHighlightType, TextRange> r20, TextLayoutResult textLayoutResult) {
        int type = r20.component1().m1200unboximpl();
        long range = r20.component2().m6421unboximpl();
        if (TextRange.m6411getCollapsedimpl(range) == false) goto L5;
        return;
    L5:
        Path highlightPath = textLayoutResult.getPathForRange(TextRange.m6415getMinimpl(range), TextRange.m6414getMaximpl(range));
        if (TextHighlightType.m1197equalsimpl0(type, TextHighlightType.Companion.m1201getHandwritingDeletePreviewsxJuwY()) == false) goto L18;
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush == null) goto L10;
        DrawScope.m4906drawPathGBMwjPU$default($this$drawHighlight, highlightPath, brush, 0.2f, null, null, 0, 56, null);
        return;
    L10:
        long $this$takeOrElse_u2dDxMtmZc$iv = textLayoutResult.getLayoutInput().getStyle().m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L13;
        boolean r12 = true;
    L14:
        if (r12 == true) goto L17;
        $this$takeOrElse_u2dDxMtmZc$iv = Color.Companion.m4392getBlack0d7_KjU();
    L17:
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        long highlightBackgroundColor = Color.m4365copywmQWz5c$default(textColor, Color.m4368getAlphaimpl(textColor) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        DrawScope.m4907drawPathLG529CI$default($this$drawHighlight, highlightPath, highlightBackgroundColor, 0.0f, null, null, 0, 60, null);
        return;
    L13:
        r12 = false;
        goto L14
    L18:
        long highlightBackgroundColor2 = ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1512getBackgroundColor0d7_KjU();
        DrawScope.m4907drawPathLG529CI$default($this$drawHighlight, highlightPath, highlightBackgroundColor2, 0.0f, null, null, 0, 60, null);
    }

    private final void drawText(DrawScope $this$drawText, TextLayoutResult textLayoutResult) {
        Canvas canvas = $this$drawText.getDrawContext().getCanvas();
        TextPainter.INSTANCE.paint(canvas, textLayoutResult);
    }

    private final void drawCursor(DrawScope $this$drawCursor) {
        CursorAnimationState r1 = this.cursorAnimation;
        if (r1 == null) goto L5;
        float r2 = r1.getCursorAlpha();
    L6:
        float cursorAlphaValue = r2;
        if (cursorAlphaValue != 0.0f) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L12;
        return;
    L12:
        if (getShowCursor() == false) goto L17;
        Rect cursorRect = this.textFieldSelectionState.getCursorRect();
        DrawScope.m4902drawLine1RTmtNc$default($this$drawCursor, this.cursorBrush, cursorRect.m4159getTopCenterF1C5BW0(), cursorRect.m4152getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlphaValue, null, 0, 432, null);
        return;
    L17:
        return;
    L9:
        r3 = false;
        goto L10
    L5:
        r2 = 0.0f;
        goto L6
    }

    private final void startCursorJob() {
        if (this.cursorAnimation != null) goto L5;
        this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
        DrawModifierNodeKt.invalidateDraw(this);
    L5:
        this.changeObserverJob = BuildersKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setCoreNodeCoordinates(coordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        TextFieldMagnifierNode $this$applySemantics_u24lambda_u244 = this.textFieldMagnifierNode;
        $this$applySemantics_u24lambda_u244.applySemantics($this$applySemantics);
    }
}
