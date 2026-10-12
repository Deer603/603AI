package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: TextFieldSelectionState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0006\u00ad\u0001®\u0001¯\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0006\u0010[\u001a\u00020CJ\u0006\u0010\\\u001a\u00020\tJ\u0006\u0010]\u001a\u00020\tJ\u0006\u0010^\u001a\u00020\tJ\u000e\u0010_\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010`J\u0006\u0010a\u001a\u00020\tJ\u0006\u0010b\u001a\u00020CJ\u0018\u0010c\u001a\u00020C2\b\b\u0002\u0010d\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010eJ\u000e\u0010f\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J\u0006\u0010g\u001a\u00020CJ\u0006\u0010h\u001a\u00020CJ\b\u0010i\u001a\u00020jH\u0002J\u0015\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\tH\u0000¢\u0006\u0002\bnJ\u0006\u0010o\u001a\u00020jJ\u001d\u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020l2\u0006\u0010q\u001a\u00020\t2\u0006\u0010m\u001a\u00020\tH\u0000¢\u0006\u0002\buJ<\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u0002032\u0006\u0010y\u001a\u0002032\b\u0010z\u001a\u0004\u0018\u00010w2\u0006\u0010q\u001a\u00020\t2\u0006\u0010{\u001a\u00020|H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\b\u0010\u007f\u001a\u00020CH\u0002J\t\u0010\u0080\u0001\u001a\u00020\tH\u0002J\t\u0010\u0081\u0001\u001a\u00020CH\u0002J\u000f\u0010\u0082\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u000f\u0010\u0083\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u000f\u0010\u0084\u0001\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J\u000f\u0010\u0085\u0001\u001a\u00020CH\u0082@¢\u0006\u0002\u0010`J\u001e\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0007\u0010\u008a\u0001\u001a\u00020CJ\u000f\u0010\u008b\u0001\u001a\u00020CH\u0086@¢\u0006\u0002\u0010`J@\u0010\u008c\u0001\u001a\u00020C2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u008d\u0001\u001a\u00020S2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ%\u0010\u008e\u0001\u001a\u00020C2\u0007\u0010\u008f\u0001\u001a\u00020\u001d2\u0007\u0010\u0090\u0001\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JZ\u0010\u0093\u0001\u001a\u00020w2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u0002032\u0007\u0010\u0097\u0001\u001a\u0002032\u0006\u0010q\u001a\u00020\t2\u0006\u0010{\u001a\u00020|2\t\b\u0002\u0010\u0098\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020C2\u0006\u0010U\u001a\u00020TJ\u0015\u0010\u009d\u0001\u001a\u00020C*\u00030\u009e\u0001H\u0086@¢\u0006\u0003\u0010\u009f\u0001J\u0015\u0010 \u0001\u001a\u00020C*\u00030\u009e\u0001H\u0082@¢\u0006\u0003\u0010\u009f\u0001J\u001d\u0010¡\u0001\u001a\u00020C*\u00030\u009e\u00012\u0006\u0010q\u001a\u00020\tH\u0082@¢\u0006\u0003\u0010¢\u0001J?\u0010£\u0001\u001a\u00020C*\u00030\u009e\u00012\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00012\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020C0<2\r\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020C0<H\u0086@¢\u0006\u0003\u0010¨\u0001J\u0015\u0010©\u0001\u001a\u00020C*\u00030\u009e\u0001H\u0086@¢\u0006\u0003\u0010\u009f\u0001J\u001d\u0010ª\u0001\u001a\u00020C*\u00030\u009e\u00012\u0006\u0010q\u001a\u00020\tH\u0086@¢\u0006\u0003\u0010¢\u0001J$\u0010«\u0001\u001a\u00020C*\u00030\u009e\u00012\r\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020C0<H\u0086@¢\u0006\u0003\u0010¬\u0001R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010&\"\u0004\b+\u0010,R+\u0010-\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010&\"\u0004\b.\u0010,R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R1\u00106\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010\u001c\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u00109R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR+\u0010F\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001c\u001a\u0004\bG\u0010&\"\u0004\bH\u0010,R1\u0010J\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010U\u001a\u00020T2\u0006\u0010\u0014\u001a\u00020T8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010\u001c\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "density", "Landroidx/compose/ui/unit/Density;", "enabled", "", "readOnly", "isFocused", "isPassword", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "currentTextLayoutPositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "getCurrentTextLayoutPositionInWindow-F1C5BW0", "()J", "<set-?>", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "directDragGestureInitiator", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "editable", "getEditable", "()Z", "handleDragPosition", "getHandleDragPosition-F1C5BW0", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setFocused", "(Z)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "previousRawDragOffset", "", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rawHandleDragPosition", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "(J)V", "rawHandleDragPosition$delegate", "receiveContentConfiguration", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getReceiveContentConfiguration", "()Lkotlin/jvm/functions/Function0;", "setReceiveContentConfiguration", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "", "getRequestAutofillAction", "setRequestAutofillAction", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "startTextLayoutPositionInWindow", "getStartTextLayoutPositionInWindow-F1C5BW0", "setStartTextLayoutPositionInWindow-k-4lQ0M", "startTextLayoutPositionInWindow$delegate", "textLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textToolbarHandler", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "getTextToolbarState", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "textToolbarState$delegate", "autofill", "canAutofill", "canCopy", "canCut", "canPaste", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canSelectAll", "clearHandleDragging", "copy", "cancelSelection", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cut", "deselect", "dispose", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "includePosition", "getCursorHandleState$foundation_release", "getCursorRect", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ", "(Z)J", "getSelectionHandleState", "getSelectionHandleState$foundation_release", "getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "rawStartOffset", "rawEndOffset", "previousSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "hideTextToolbar", "isCursorHandleInVisibleBounds", "markStartContentVisibleOffset", "observeTextChanges", "observeTextToolbarVisibility", "paste", "pasteAsPlainText", "placeCursorAtNearestOffset", "offset", "placeCursorAtNearestOffset-k-4lQ0M", "(J)Z", "selectAll", "startToolbarAndHandlesVisibilityObserver", "update", "showTextToolbar", "updateHandleDragging", "handle", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateSelection", "textFieldCharSequence", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "startOffset", "endOffset", "allowPreviousSelectionCollapsed", "isStartOfSelection", "updateSelection-SsL-Rf8", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "updateTextToolbarState", "cursorHandleGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldTapGestures", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "requestFocus", "showKeyboard", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchMode", "selectionHandleGestures", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSelectionState {
    public static final int $stable = 0;
    private Clipboard clipboard;
    private Density density;
    private final MutableState directDragGestureInitiator$delegate;
    private final MutableState draggingHandle$delegate;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private final MutableState isInTouchMode$delegate;
    private boolean isPassword;
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private final MutableState rawHandleDragPosition$delegate;
    private boolean readOnly;
    private Function0<? extends ReceiveContentConfiguration> receiveContentConfiguration;
    private Function0<Unit> requestAutofillAction;
    private final MutableState showCursorHandle$delegate;
    private final MutableState startTextLayoutPositionInWindow$delegate;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbarHandler textToolbarHandler;
    private final MutableState textToolbarState$delegate;

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "(Ljava/lang/String;I)V", "None", "Touch", "Mouse", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum InputType extends Enum<InputType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ InputType[] $VALUES = null;
        public static final InputType Mouse = null;
        public static final InputType None = null;
        public static final InputType Touch = null;

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{None, Touch, Mouse};
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String r1) {
            return (InputType) Enum.valueOf(InputType.class, r1);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }

        private InputType(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            None = new InputType("None", 0);
            Touch = new InputType("Touch", 1);
            Mouse = new InputType("Mouse", 2);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "onDrag", "", "dragPosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDragDone", "onExtend", "downPosition", "onExtend-k-4lQ0M", "(J)Z", "onExtendDrag", "onExtendDrag-k-4lQ0M", "onStart", "onStart-3MmeM6k", "updateSelection", "Landroidx/compose/ui/text/TextRange;", "isStartOfSelection", "updateSelection-r1Wruf4", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText;
        private long dragBeginPosition;
        private final Function0<Unit> requestFocus;
        final /* synthetic */ TextFieldSelectionState this$0;

        public TextFieldMouseSelectionObserver(TextFieldSelectionState this$0, Function0<Unit> r4) {
            this.this$0 = this$0;
            this.requestFocus = r4;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo1371onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
            if (TextFieldSelectionState.access$getEnabled$p(this.this$0) == true) goto L5;
        L12:
            return false;
        L5:
            if (TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText().length() != 0) goto L7;
            boolean r0 = true;
        L8:
            if (r0 == true) goto L12;
            TextFieldSelectionStateKt.access$logDebug(TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1.INSTANCE);
            this.this$0.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.access$setPreviousRawDragOffset$p(this.this$0, -1);
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = downPosition;
            long newSelection = m1367updateSelectionr1Wruf4(downPosition, adjustment, true);
            this.dragBeginOffsetInText = TextRange.m6417getStartimpl(newSelection);
            return true;
        L7:
            r0 = false;
            goto L8
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo1368onDrag3MmeM6k(final long dragPosition, SelectionAdjustment adjustment) {
            if (TextFieldSelectionState.access$getEnabled$p(this.this$0) == true) goto L5;
        L12:
            return false;
        L5:
            if (TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText().length() != 0) goto L7;
            boolean r0 = true;
        L8:
            if (r0 == true) goto L12;
            TextFieldSelectionStateKt.access$logDebug(new TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1(dragPosition));
            m1367updateSelectionr1Wruf4(dragPosition, adjustment, false);
            return true;
        L7:
            r0 = false;
            goto L8
        }

        /* JADX INFO: renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m1367updateSelectionr1Wruf4(long dragPosition, SelectionAdjustment adjustment, boolean isStartOfSelection) {
            Integer r0 = Integer.valueOf(this.dragBeginOffsetInText);
            int it = r0.intValue();
            if (it < 0) goto L5;
            boolean r4 = true;
        L6:
            if (r4 == true) goto L9;
            r0 = null;
        L9:
            if (r0 == null) goto L11;
            int r1 = r0.intValue();
        L12:
            int startOffset = r1;
            int endOffset = TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1299getOffsetForPosition3MmeM6k(dragPosition, false);
            long newSelection = TextFieldSelectionState.m1354access$updateSelectionSsLRf8(this.this$0, TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText(), startOffset, endOffset, false, adjustment, false, isStartOfSelection);
            if (this.dragBeginOffsetInText != (-1)) goto L18;
            if (TextRange.m6411getCollapsedimpl(newSelection) == true) goto L18;
            this.dragBeginOffsetInText = TextRange.m6417getStartimpl(newSelection);
        L18:
            if (TextRange.m6416getReversedimpl(newSelection) == false) goto L20;
            newSelection = TextFieldSelectionStateKt.m1379access$reverse5zctL8(newSelection);
        L20:
            TextFieldSelectionState.access$getTextFieldState$p(this.this$0).m1316selectCharsIn5zctL8(newSelection);
            this.this$0.updateTextToolbarState(TextToolbarState.Selection);
            return newSelection;
        L11:
            r1 = TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1299getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            goto L12
        L5:
            r4 = false;
            goto L6
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.access$logDebug(TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1.INSTANCE);
            this.this$0.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo1369onExtendk4lQ0M(long downPosition) {
            TextFieldSelectionStateKt.access$logDebug(TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1.INSTANCE);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo1370onExtendDragk4lQ0M(long dragPosition) {
            TextFieldSelectionStateKt.access$logDebug(TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1.INSTANCE);
            return true;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "actingHandle", "Landroidx/compose/foundation/text/Handle;", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "dragTotalDistance", "onCancel", "onDown", "point", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onDragStop", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class TextFieldTextDragObserver implements TextDragObserver {
        private Handle actingHandle;
        private int dragBeginOffsetInText;
        private long dragBeginPosition;
        private long dragTotalDistance;
        private final Function0<Unit> requestFocus;
        final /* synthetic */ TextFieldSelectionState this$0;

        public TextFieldTextDragObserver(TextFieldSelectionState this$0, Function0<Unit> r4) {
            this.this$0 = this$0;
            this.requestFocus = r4;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
            this.dragTotalDistance = Offset.Companion.m4141getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
        }

        private final void onDragStop() {
            long $this$isSpecified$iv = this.dragBeginPosition;
            if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
            boolean r3 = true;
        L6:
            if (r3 == false) goto L9;
            TextFieldSelectionStateKt.access$logDebug(TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1.INSTANCE);
            this.this$0.clearHandleDragging();
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
            this.dragTotalDistance = Offset.Companion.m4141getZeroF1C5BW0();
            TextFieldSelectionState.access$setPreviousRawDragOffset$p(this.this$0, -1);
            this.this$0.setDirectDragGestureInitiator(InputType.None);
            this.requestFocus.invoke();
            return;
        L9:
            return;
        L5:
            r3 = false;
            goto L6
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDown-k-4lQ0M */
        public void mo1131onDownk4lQ0M(long point) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onStart-k-4lQ0M */
        public void mo1133onStartk4lQ0M(final long startPoint) {
            if (TextFieldSelectionState.access$getEnabled$p(this.this$0) == true) goto L5;
            return;
        L5:
            TextFieldSelectionStateKt.access$logDebug(new TextFieldSelectionState$TextFieldTextDragObserver$onStart$1(startPoint));
            this.this$0.m1366updateHandleDraggingUv8p0NA(this.actingHandle, startPoint);
            boolean r4 = false;
            TextFieldSelectionState.access$setShowCursorHandle(this.this$0, false);
            this.this$0.setDirectDragGestureInitiator(InputType.Touch);
            this.dragBeginPosition = startPoint;
            this.dragTotalDistance = Offset.Companion.m4141getZeroF1C5BW0();
            TextFieldSelectionState.access$setPreviousRawDragOffset$p(this.this$0, -1);
            if (TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).getLayoutResult() != null) goto L8;
            return;
        L8:
            boolean r1 = TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1300isPositionOnTextk4lQ0M(startPoint);
            TextFieldSelectionState r5 = this.this$0;
            if (r1 == true) goto L15;
            int offset = TextLayoutState.m1296getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.access$getTextLayoutState$p(r5), startPoint, false, 2, null);
            HapticFeedback r2 = TextFieldSelectionState.access$getHapticFeedBack$p(this.this$0);
            if (r2 == null) goto L13;
            r2.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
        L13:
            TextFieldSelectionState.access$getTextFieldState$p(this.this$0).placeCursorBeforeCharAt(offset);
            TextFieldSelectionState.access$setShowCursorHandle(this.this$0, true);
            this.this$0.updateTextToolbarState(TextToolbarState.Cursor);
            return;
        L15:
            if (TextFieldSelectionState.access$getTextFieldState$p(r5).getVisualText().length() != 0) goto L17;
            r4 = true;
        L17:
            if (r4 == false) goto L19;
            return;
        L19:
            int offset2 = TextLayoutState.m1296getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.access$getTextLayoutState$p(this.this$0), startPoint, false, 2, null);
            long newSelection = TextFieldSelectionState.m1364updateSelectionSsLRf8$default(this.this$0, new TextFieldCharSequence(TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText(), TextRange.Companion.m6422getZerod9O1mEE(), null, null, null, 28, null), offset2, offset2, false, SelectionAdjustment.Companion.getWord(), false, false, 96, null);
            TextFieldSelectionState.access$getTextFieldState$p(this.this$0).m1316selectCharsIn5zctL8(newSelection);
            this.this$0.updateTextToolbarState(TextToolbarState.Selection);
            this.dragBeginOffsetInText = TextRange.m6417getStartimpl(newSelection);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDrag-k-4lQ0M */
        public void mo1132onDragk4lQ0M(long delta) {
            if (TextFieldSelectionState.access$getEnabled$p(this.this$0) == false) goto L70;
            if (TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).getLayoutResult() == null) goto L72;
            boolean r2 = true;
            if (TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText().length() != 0) goto L9;
            boolean r1 = true;
        L10:
            if (r1 == true) goto L71;
            this.dragTotalDistance = Offset.m4130plusMKHz9U(this.dragTotalDistance, delta);
            final long currentDragPosition = Offset.m4130plusMKHz9U(this.dragBeginPosition, this.dragTotalDistance);
            TextFieldSelectionStateKt.access$logDebug(new TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1(currentDragPosition));
            if (this.dragBeginOffsetInText < 0) goto L15;
        L21:
            Integer r8 = Integer.valueOf(this.dragBeginOffsetInText);
            int it = r8.intValue();
            if (it >= 0) goto L25;
            r2 = false;
        L25:
            if (r2 == true) goto L28;
            r8 = null;
        L28:
            if (r8 == null) goto L30;
            int r3 = r8.intValue();
        L31:
            int startOffset = r3;
            int endOffset = TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1299getOffsetForPosition3MmeM6k(currentDragPosition, false);
            if (this.dragBeginOffsetInText >= 0) goto L35;
            if (startOffset != endOffset) goto L35;
            return;
        L35:
            SelectionAdjustment adjustment = SelectionAdjustment.Companion.getWord();
            this.this$0.updateTextToolbarState(TextToolbarState.Selection);
            int startOffset2 = startOffset;
            int endOffset2 = endOffset;
            SelectionAdjustment adjustment2 = adjustment;
        L36:
            long prevSelection = TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText().m1188getSelectiond9O1mEE();
            long newSelection = TextFieldSelectionState.m1364updateSelectionSsLRf8$default(this.this$0, TextFieldSelectionState.access$getTextFieldState$p(this.this$0).getVisualText(), startOffset2, endOffset2, false, adjustment2, false, false, 64, null);
            if (this.dragBeginOffsetInText != (-1)) goto L42;
            if (TextRange.m6411getCollapsedimpl(newSelection) == true) goto L42;
            this.dragBeginOffsetInText = TextRange.m6417getStartimpl(newSelection);
        L42:
            if (TextRange.m6416getReversedimpl(newSelection) == false) goto L45;
            newSelection = TextFieldSelectionStateKt.m1379access$reverse5zctL8(newSelection);
        L45:
            if (TextRange.m6410equalsimpl0(newSelection, prevSelection) == true) goto L62;
            if (TextRange.m6417getStartimpl(newSelection) == TextRange.m6417getStartimpl(prevSelection)) goto L52;
            if (TextRange.m6412getEndimpl(newSelection) != TextRange.m6412getEndimpl(prevSelection)) goto L52;
            Handle r5 = Handle.SelectionStart;
        L60:
            this.actingHandle = r5;
        L52:
            if (TextRange.m6417getStartimpl(newSelection) == TextRange.m6417getStartimpl(prevSelection)) goto L54;
        L56:
            float newMiddle = (TextRange.m6417getStartimpl(newSelection) + TextRange.m6412getEndimpl(newSelection)) / 2.0f;
            float prevMiddle = (TextRange.m6417getStartimpl(prevSelection) + TextRange.m6412getEndimpl(prevSelection)) / 2.0f;
            if (newMiddle <= prevMiddle) goto L59;
            r5 = Handle.SelectionEnd;
            goto L60
        L59:
            r5 = Handle.SelectionStart;
            goto L60
        L54:
            if (TextRange.m6412getEndimpl(newSelection) == TextRange.m6412getEndimpl(prevSelection)) goto L56;
            r5 = Handle.SelectionEnd;
        L62:
            if (TextRange.m6411getCollapsedimpl(prevSelection) == false) goto L64;
        L65:
            TextFieldSelectionState.access$getTextFieldState$p(this.this$0).m1316selectCharsIn5zctL8(newSelection);
        L66:
            this.this$0.m1366updateHandleDraggingUv8p0NA(this.actingHandle, currentDragPosition);
            return;
        L64:
            if (TextRange.m6411getCollapsedimpl(newSelection) == true) goto L66;
        L30:
            r3 = TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1299getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            goto L31
        L15:
            if (TextFieldSelectionState.access$getTextLayoutState$p(this.this$0).m1300isPositionOnTextk4lQ0M(currentDragPosition) == true) goto L21;
            int startOffset3 = TextLayoutState.m1296getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.access$getTextLayoutState$p(this.this$0), this.dragBeginPosition, false, 2, null);
            int endOffset3 = TextLayoutState.m1296getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.access$getTextLayoutState$p(this.this$0), currentDragPosition, false, 2, null);
            if (startOffset3 != endOffset3) goto L19;
            SelectionAdjustment r4 = SelectionAdjustment.Companion.getNone();
        L20:
            startOffset2 = startOffset3;
            endOffset2 = endOffset3;
            adjustment2 = r4;
            goto L36
        L19:
            r4 = SelectionAdjustment.Companion.getWord();
            goto L20
        L71:
            return;
        L9:
            r1 = false;
            goto L10
        L72:
            return;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[IndexTransformationType.values().length];
            r0[IndexTransformationType.Untransformed.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[IndexTransformationType.Deletion.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[IndexTransformationType.Insertion.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[IndexTransformationType.Replacement.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1325, 1327}, m = "canPaste", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        AnonymousClass1(TextFieldSelectionState r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.canPaste(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0}, l = {1311}, m = "copy", n = {"this", "cancelSelection"}, s = {"L$0", "Z$0"})
    static final class C03751 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03751(TextFieldSelectionState r1, Continuation<? super C03751> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.copy(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2, reason: invalid class name */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            AnonymousClass1(TextFieldSelectionState r2, PointerInputScope r3, Continuation<? super AnonymousClass1> r4) {
                this.this$0 = r2;
                this.$this_cursorHandleGestures = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, r5);
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
                this.label = 1;
                if (this.this$0.detectTouchMode(this.$this_cursorHandleGestures, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
        static final class C00532 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            C00532(TextFieldSelectionState r2, PointerInputScope r3, Continuation<? super C00532> r4) {
                this.this$0 = r2;
                this.$this_cursorHandleGestures = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new C00532(this.this$0, this.$this_cursorHandleGestures, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C00532) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (TextFieldSelectionState.access$detectCursorHandleDragGestures(this.this$0, this.$this_cursorHandleGestures, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            AnonymousClass3(PointerInputScope r2, TextFieldSelectionState r3, Continuation<? super AnonymousClass3> r4) {
                this.$this_cursorHandleGestures = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                PointerInputScope r1 = this.$this_cursorHandleGestures;
                final TextFieldSelectionState r3 = this.this$0;
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(r1, null, null, null, new AnonymousClass1(r3), this, 7, null) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass2(TextFieldSelectionState r2, PointerInputScope r3, Continuation<? super AnonymousClass2> r4) {
            this.this$0 = r2;
            this.$this_cursorHandleGestures = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Job> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Job> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r9);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00532(this.this$0, this.$this_cursorHandleGestures, null), 1, null);
            return BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, null), 1, null);
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1287}, m = "cut", n = {"this"}, s = {"L$0"})
    static final class C03761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03761(TextFieldSelectionState r1, Continuation<? super C03761> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.cut(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0}, l = {611}, m = "detectCursorHandleDragGestures", n = {"this", "cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1", "L$2"})
    static final class C03771 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03771(TextFieldSelectionState r1, Continuation<? super C03771> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.access$detectCursorHandleDragGestures(this.this$0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0, 0}, l = {984}, m = "detectSelectionHandleDragGestures", n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C03791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03791(TextFieldSelectionState r1, Continuation<? super C03791> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            this.result = r5;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.access$detectSelectionHandleDragGestures(this.this$0, null, false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
    static final class C03842 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03842(MutableInteractionSource r2, TextFieldSelectionState r3, Continuation<? super C03842> r4) {
            this.$interactionSource = r2;
            this.this$0 = r3;
            super(3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope r5, Offset r6, Continuation<? super Unit> r7) {
            return m1377invoked4ec7I(r5, r6.m4135unboximpl(), r7);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1377invoked4ec7I(PressGestureScope r4, long r5, Continuation<? super Unit> r7) {
            C03842 r0 = new C03842(this.$interactionSource, this.this$0, r7);
            r0.L$0 = r4;
            r0.J$0 = r5;
            return r0.invokeSuspend(Unit.INSTANCE);
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
        L15:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PressGestureScope $this$detectTapAndPress = (PressGestureScope) this.L$0;
            long offset = this.J$0;
            MutableInteractionSource interactionSource = this.$interactionSource;
            if (interactionSource == null) goto L15;
            TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 r2 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1($this$detectTapAndPress, this.this$0, offset, interactionSource, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(r2, this) != r0) goto L15;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {453}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    static final class C03862 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03862(TextFieldSelectionState r2, Continuation<? super C03862> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C03862 r0 = new C03862(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C03862) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            AwaitPointerEventScope $this$awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure($result);
            C03862 r4 = this;
            AwaitPointerEventScope $this$awaitPointerEventScope2 = $this$awaitPointerEventScope;
            Object r1 = $result2;
            Object $result3 = $result;
        L12:
            PointerEvent event = (PointerEvent) $result;
            TextFieldSelectionState r5 = r4.this$0;
            if (SelectionGesturesKt.isPrecisePointer(event) == true) goto L15;
            boolean r9 = true;
        L16:
            r5.setInTouchMode(r9);
            $result = $result3;
            $result2 = r1;
            AwaitPointerEventScope $this$awaitPointerEventScope3 = $this$awaitPointerEventScope2;
            C03862 r3 = r4;
        L8:
            r3.L$0 = $this$awaitPointerEventScope3;
            r3.label = 1;
            Object r6 = $this$awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, r3);
            if (r6 != $result2) goto L11;
            return $result2;
        L11:
            Object r7 = $result2;
            $result3 = $result;
            $result = r6;
            r4 = r3;
            $this$awaitPointerEventScope2 = $this$awaitPointerEventScope3;
            r1 = r7;
            goto L12
        L15:
            r9 = false;
            goto L16
        L7:
            ResultKt.throwOnFailure($result);
            $this$awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            r3 = this;
            goto L8
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C03883 extends FunctionReferenceImpl implements Function2<TextFieldCharSequence, CharSequence, Boolean> {
        public static final C03883 INSTANCE = null;

        static {
            INSTANCE = new C03883();
        }

        C03883() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(TextFieldCharSequence p0, CharSequence p1) {
            return Boolean.valueOf(p0.contentEquals(p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(TextFieldCharSequence r3, CharSequence r4) {
            return invoke2(r3, r4);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {1, 1}, l = {1332, 1334, 1334}, m = "paste", n = {"this", "receiveContentConfiguration"}, s = {"L$0", "L$1"})
    static final class C03921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03921(TextFieldSelectionState r1, Continuation<? super C03921> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.paste(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1365}, m = "pasteAsPlainText", n = {"this"}, s = {"L$0"})
    static final class C03931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03931(TextFieldSelectionState r1, Continuation<? super C03931> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.access$pasteAsPlainText(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C03942 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            AnonymousClass1(TextFieldSelectionState r2, PointerInputScope r3, Continuation<? super AnonymousClass1> r4) {
                this.this$0 = r2;
                this.$this_selectionHandleGestures = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, r5);
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
                this.label = 1;
                if (this.this$0.detectTouchMode(this.$this_selectionHandleGestures, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
        static final class C00542 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            C00542(PointerInputScope r2, TextFieldSelectionState r3, boolean r4, Continuation<? super C00542> r5) {
                this.$this_selectionHandleGestures = r2;
                this.this$0 = r3;
                this.$isStartHandle = r4;
                super(2, r5);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                return new C00542(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, r6);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C00542) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                PointerInputScope r1 = this.$this_selectionHandleGestures;
                final TextFieldSelectionState r3 = this.this$0;
                final boolean r4 = this.$isStartHandle;
                TapOnPosition r2 = new AnonymousClass1(r3, r4);
                final TextFieldSelectionState r5 = this.this$0;
                this.label = 1;
                if (PressDownGestureKt.detectPressDownGesture(r1, r2, new C00552(r5), this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isStartHandle;
            final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            AnonymousClass3(TextFieldSelectionState r2, PointerInputScope r3, boolean r4, Continuation<? super AnonymousClass3> r5) {
                this.this$0 = r2;
                this.$this_selectionHandleGestures = r3;
                this.$isStartHandle = r4;
                super(2, r5);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, r6);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (TextFieldSelectionState.access$detectSelectionHandleDragGestures(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C03942(TextFieldSelectionState r2, PointerInputScope r3, boolean r4, Continuation<? super C03942> r5) {
            this.this$0 = r2;
            this.$this_selectionHandleGestures = r3;
            this.$isStartHandle = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C03942 r0 = new C03942(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Job> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Job> r4) {
            return ((C03942) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r9);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, null), 1, null);
            BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00542(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, null), 1, null);
            return BuildersKt.launch$default($this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {422}, m = "startToolbarAndHandlesVisibilityObserver", n = {"this"}, s = {"L$0"})
    static final class C03951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TextFieldSelectionState this$0;

        C03951(TextFieldSelectionState r1, Continuation<? super C03951> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.startToolbarAndHandlesVisibilityObserver(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C03962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            AnonymousClass1(TextFieldSelectionState r2, Continuation<? super AnonymousClass1> r3) {
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
                this.label = 1;
                if (TextFieldSelectionState.access$observeTextChanges(this.this$0, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
        static final class C00562 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TextFieldSelectionState this$0;

            C00562(TextFieldSelectionState r2, Continuation<? super C00562> r3) {
                this.this$0 = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                return new C00562(this.this$0, r4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C00562) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (TextFieldSelectionState.access$observeTextToolbarVisibility(this.this$0, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C03962(TextFieldSelectionState r2, Continuation<? super C03962> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C03962 r0 = new C03962(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Job> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Job> r4) {
            return ((C03962) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r9);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default($this$coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            return BuildersKt.launch$default($this$coroutineScope, null, null, new C00562(this.this$0, null), 3, null);
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public TextFieldSelectionState(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, Density density, boolean enabled, boolean readOnly, boolean isFocused, boolean isPassword) {
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.isFocused = isFocused;
        this.isPassword = isPassword;
        this.isInTouchMode$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.startTextLayoutPositionInWindow$delegate = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4140getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition$delegate = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4140getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator$delegate = SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.textToolbarState$delegate = SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    public static final /* synthetic */ Object access$detectCursorHandleDragGestures(TextFieldSelectionState $this, PointerInputScope $receiver, Continuation $completion) {
        return $this.detectCursorHandleDragGestures($receiver, $completion);
    }

    public static final /* synthetic */ void access$detectCursorHandleDragGestures$onDragStop(Ref.LongRef cursorDragStart, Ref.LongRef cursorDragDelta, TextFieldSelectionState this$0) {
        detectCursorHandleDragGestures$onDragStop(cursorDragStart, cursorDragDelta, this$0);
    }

    public static final /* synthetic */ Object access$detectSelectionHandleDragGestures(TextFieldSelectionState $this, PointerInputScope $receiver, boolean isStartHandle, Continuation $completion) {
        return $this.detectSelectionHandleDragGestures($receiver, isStartHandle, $completion);
    }

    public static final /* synthetic */ void access$detectSelectionHandleDragGestures$onDragStop$6(Ref.LongRef dragBeginPosition, TextFieldSelectionState this$0, Ref.LongRef dragTotalDistance) {
        detectSelectionHandleDragGestures$onDragStop$6(dragBeginPosition, this$0, dragTotalDistance);
    }

    public static final /* synthetic */ Rect access$getContentRect(TextFieldSelectionState $this) {
        return $this.getContentRect();
    }

    public static final /* synthetic */ boolean access$getEnabled$p(TextFieldSelectionState $this) {
        return $this.enabled;
    }

    /* JADX INFO: renamed from: access$getHandlePosition-tuRUvjQ, reason: not valid java name */
    public static final /* synthetic */ long m1352access$getHandlePositiontuRUvjQ(TextFieldSelectionState $this, boolean isStartHandle) {
        return $this.m1356getHandlePositiontuRUvjQ(isStartHandle);
    }

    public static final /* synthetic */ HapticFeedback access$getHapticFeedBack$p(TextFieldSelectionState $this) {
        return $this.hapticFeedBack;
    }

    public static final /* synthetic */ PressInteraction.Press access$getPressInteraction$p(TextFieldSelectionState $this) {
        return $this.pressInteraction;
    }

    public static final /* synthetic */ boolean access$getReadOnly$p(TextFieldSelectionState $this) {
        return $this.readOnly;
    }

    public static final /* synthetic */ TransformedTextFieldState access$getTextFieldState$p(TextFieldSelectionState $this) {
        return $this.textFieldState;
    }

    public static final /* synthetic */ LayoutCoordinates access$getTextLayoutCoordinates(TextFieldSelectionState $this) {
        return $this.getTextLayoutCoordinates();
    }

    public static final /* synthetic */ TextLayoutState access$getTextLayoutState$p(TextFieldSelectionState $this) {
        return $this.textLayoutState;
    }

    public static final /* synthetic */ TextToolbarHandler access$getTextToolbarHandler$p(TextFieldSelectionState $this) {
        return $this.textToolbarHandler;
    }

    public static final /* synthetic */ TextToolbarState access$getTextToolbarState(TextFieldSelectionState $this) {
        return $this.getTextToolbarState();
    }

    public static final /* synthetic */ void access$hideTextToolbar(TextFieldSelectionState $this) {
        $this.hideTextToolbar();
    }

    public static final /* synthetic */ void access$markStartContentVisibleOffset(TextFieldSelectionState $this) {
        $this.markStartContentVisibleOffset();
    }

    public static final /* synthetic */ Object access$observeTextChanges(TextFieldSelectionState $this, Continuation $completion) {
        return $this.observeTextChanges($completion);
    }

    public static final /* synthetic */ Object access$observeTextToolbarVisibility(TextFieldSelectionState $this, Continuation $completion) {
        return $this.observeTextToolbarVisibility($completion);
    }

    public static final /* synthetic */ Object access$pasteAsPlainText(TextFieldSelectionState $this, Continuation $completion) {
        return $this.pasteAsPlainText($completion);
    }

    /* JADX INFO: renamed from: access$placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ boolean m1353access$placeCursorAtNearestOffsetk4lQ0M(TextFieldSelectionState $this, long offset) {
        return $this.m1360placeCursorAtNearestOffsetk4lQ0M(offset);
    }

    public static final /* synthetic */ void access$setPressInteraction$p(TextFieldSelectionState $this, PressInteraction.Press r1) {
        $this.pressInteraction = r1;
    }

    public static final /* synthetic */ void access$setPreviousRawDragOffset$p(TextFieldSelectionState $this, int r1) {
        $this.previousRawDragOffset = r1;
    }

    public static final /* synthetic */ void access$setShowCursorHandle(TextFieldSelectionState $this, boolean r1) {
        $this.setShowCursorHandle(r1);
    }

    public static final /* synthetic */ void access$setTextToolbarState(TextFieldSelectionState $this, TextToolbarState r1) {
        $this.setTextToolbarState(r1);
    }

    /* JADX INFO: renamed from: access$updateSelection-SsL-Rf8, reason: not valid java name */
    public static final /* synthetic */ long m1354access$updateSelectionSsLRf8(TextFieldSelectionState $this, TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        return $this.m1363updateSelectionSsLRf8(textFieldCharSequence, startOffset, endOffset, isStartHandle, adjustment, allowPreviousSelectionCollapsed, isStartOfSelection);
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean r1) {
        this.isFocused = r1;
    }

    public final boolean isInTouchMode() {
        State $this$getValue$iv = this.isInTouchMode$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean r5) {
        MutableState $this$setValue$iv = this.isInTouchMode$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final Function0<Unit> getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    public final void setRequestAutofillAction(Function0<Unit> r1) {
        this.requestAutofillAction = r1;
    }

    public final Function0<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final void setReceiveContentConfiguration(Function0<? extends ReceiveContentConfiguration> r1) {
        this.receiveContentConfiguration = r1;
    }

    /* JADX INFO: renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1358getStartTextLayoutPositionInWindowF1C5BW0() {
        State $this$getValue$iv = this.startTextLayoutPositionInWindow$delegate;
        return ((Offset) $this$getValue$iv.getValue()).m4135unboximpl();
    }

    /* JADX INFO: renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m1362setStartTextLayoutPositionInWindowk4lQ0M(long r5) {
        MutableState $this$setValue$iv = this.startTextLayoutPositionInWindow$delegate;
        $this$setValue$iv.setValue(Offset.m4114boximpl(r5));
    }

    /* JADX INFO: renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1355getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates r0 = getTextLayoutCoordinates();
        if (r0 == null) goto L6;
        return LayoutCoordinatesKt.positionInWindow(r0);
    L6:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1357getRawHandleDragPositionF1C5BW0() {
        State $this$getValue$iv = this.rawHandleDragPosition$delegate;
        return ((Offset) $this$getValue$iv.getValue()).m4135unboximpl();
    }

    /* JADX INFO: renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1361setRawHandleDragPositionk4lQ0M(long r5) {
        MutableState $this$setValue$iv = this.rawHandleDragPosition$delegate;
        $this$setValue$iv.setValue(Offset.m4114boximpl(r5));
    }

    /* JADX INFO: renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1365getHandleDragPositionF1C5BW0() {
        long $this$isUnspecified$iv = m1357getRawHandleDragPositionF1C5BW0();
        boolean r6 = true;
        if (($this$isUnspecified$iv & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L16;
        long $this$isUnspecified$iv2 = m1358getStartTextLayoutPositionInWindowF1C5BW0();
        if ((9223372034707292159L & $this$isUnspecified$iv2) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L12;
        r6 = false;
    L12:
        if (r6 == false) goto L15;
        return TextLayoutStateKt.m1304fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1357getRawHandleDragPositionF1C5BW0());
    L15:
        return Offset.m4130plusMKHz9U(m1357getRawHandleDragPositionF1C5BW0(), Offset.m4129minusMKHz9U(m1358getStartTextLayoutPositionInWindowF1C5BW0(), m1355getCurrentTextLayoutPositionInWindowF1C5BW0()));
    L16:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L5:
        r0 = false;
        goto L6
    }

    public final Handle getDraggingHandle() {
        State $this$getValue$iv = this.draggingHandle$delegate;
        return (Handle) $this$getValue$iv.getValue();
    }

    public final void setDraggingHandle(Handle r4) {
        MutableState $this$setValue$iv = this.draggingHandle$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final InputType getDirectDragGestureInitiator() {
        State $this$getValue$iv = this.directDragGestureInitiator$delegate;
        return (InputType) $this$getValue$iv.getValue();
    }

    public final void setDirectDragGestureInitiator(InputType r4) {
        MutableState $this$setValue$iv = this.directDragGestureInitiator$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final boolean getShowCursorHandle() {
        State $this$getValue$iv = this.showCursorHandle$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setShowCursorHandle(boolean r5) {
        MutableState $this$setValue$iv = this.showCursorHandle$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final TextToolbarState getTextToolbarState() {
        State $this$getValue$iv = this.textToolbarState$delegate;
        return (TextToolbarState) $this$getValue$iv.getValue();
    }

    private final void setTextToolbarState(TextToolbarState r4) {
        MutableState $this$setValue$iv = this.textToolbarState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates it = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (it == null) goto L8;
        if (it.isAttached() == false) goto L8;
        return it;
    L8:
        return null;
    }

    private final boolean getEditable() {
        if (this.enabled == true) goto L5;
    L7:
        return false;
    L5:
        if (this.readOnly == true) goto L7;
        return true;
    }

    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean includePosition) {
        TextFieldCharSequence text = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean visible = true;
        if (getDirectDragGestureInitiator() != InputType.None) goto L5;
        boolean notBeingDragged = true;
    L6:
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle == false) goto L23;
        if (notBeingDragged == false) goto L23;
        if (TextRange.m6411getCollapsedimpl(text.m1188getSelectiond9O1mEE()) == false) goto L23;
        if (text.shouldShowSelection() == false) goto L23;
        if (text.length() <= 0) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == false) goto L23;
        if (draggingHandle != Handle.Cursor) goto L21;
    L25:
        if (visible == true) goto L29;
        return TextFieldHandleState.Companion.getHidden();
    L29:
        if (includePosition == false) goto L31;
        long r7 = getCursorRect().m4152getBottomCenterF1C5BW0();
    L33:
        return new TextFieldHandleState(true, r7, 0.0f, ResolvedTextDirection.Ltr, false, null);
    L31:
        r7 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        goto L33
    L21:
        if (isCursorHandleInVisibleBounds() == false) goto L23;
    L16:
        r6 = false;
    L23:
        visible = false;
        goto L25
    L5:
        notBeingDragged = false;
        goto L6
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r3 = previousSnapshot$iv.getReadObserver();
    L6:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        long position = getCursorRect().m4152getBottomCenterF1C5BW0();     // Catch: Throwable -> L15
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        LayoutCoordinates r0 = getTextLayoutCoordinates();
        if (r0 == null) goto L13;
        Rect r1 = SelectionManagerKt.visibleBounds(r0);
        if (r1 == null) goto L13;
        return SelectionManagerKt.m1483containsInclusiveUv8p0NA(r1, position);
    L13:
        return false;
    L15:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r3);
        throw th;
    L5:
        r3 = null;
        goto L6
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) goto L5;
        TextFieldCharSequence value = this.textFieldState.getVisualText();
        if (TextRange.m6411getCollapsedimpl(value.m1188getSelectiond9O1mEE()) == false) goto L9;
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m6417getStartimpl(value.m1188getSelectiond9O1mEE()));
        Density $this$getCursorRect_u24lambda_u242 = this.density;
        float cursorWidth = RangesKt.coerceAtLeast((float) Math.floor($this$getCursorRect_u24lambda_u242.mo376toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
        if (layoutResult.getLayoutInput().getLayoutDirection() != LayoutDirection.Ltr) goto L13;
        float cursorCenterX = cursorRect.getLeft() + (cursorWidth / 2.0f);
    L14:
        long arg0$iv = layoutResult.m6388getSizeYbymL2g();
        float it = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(cursorCenterX, ((int) (arg0$iv >> 32)) - (cursorWidth / 2.0f)), cursorWidth / 2.0f);
        if ((((int) cursorWidth) % 2) != 1) goto L17;
        float coercedCursorCenterX = ((float) Math.floor(it)) + 0.5f;
    L19:
        return new Rect(coercedCursorCenterX - (cursorWidth / 2.0f), cursorRect.getTop(), (cursorWidth / 2.0f) + coercedCursorCenterX, cursorRect.getBottom());
    L17:
        coercedCursorCenterX = (float) Math.rint(it);
        goto L19
    L13:
        cursorCenterX = cursorRect.getRight() - (cursorWidth / 2.0f);
        goto L14
    L9:
        return Rect.Companion.getZero();
    L5:
        return Rect.Companion.getZero();
    }

    public final void update(HapticFeedback hapticFeedBack, Clipboard clipboard, TextToolbarHandler showTextToolbar, Density density, boolean enabled, boolean readOnly, boolean isPassword) {
        if (enabled == true) goto L4;
        hideTextToolbar();
    L4:
        this.hapticFeedBack = hapticFeedBack;
        this.clipboard = clipboard;
        this.textToolbarHandler = showTextToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.isPassword = isPassword;
    }

    public final Object cursorHandleGestures(PointerInputScope $this$cursorHandleGestures, Continuation<? super Unit> r4) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, $this$cursorHandleGestures, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object selectionHandleGestures(PointerInputScope $this$selectionHandleGestures, boolean isStartHandle, Continuation<? super Unit> r5) {
        Object r0 = CoroutineScopeKt.coroutineScope(new C03942(this, $this$selectionHandleGestures, isStartHandle, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object startToolbarAndHandlesVisibilityObserver(Continuation<? super Unit> r9) {
        if ((r9 instanceof C03951) == false) goto L7;
        C03951 r0 = (C03951) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        TextFieldSelectionState r3 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L22:
        r3.setShowCursorHandle(false);
        if (r3.getTextToolbarState() == TextToolbarState.None) goto L26;
        r3.hideTextToolbar();
    L26:
        return Unit.INSTANCE;
    L15:
        Throwable th = th;
    L29:
        r3.setShowCursorHandle(false);
        if (r3.getTextToolbarState() == TextToolbarState.None) goto L32;
        r3.hideTextToolbar();
    L32:
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        C03962 r5 = new C03962(this, null);     // Catch: Throwable -> L27
        r0.L$0 = this;     // Catch: Throwable -> L27
        r0.label = 1;     // Catch: Throwable -> L27
        if (CoroutineScopeKt.coroutineScope(r5, r0) != r2) goto L21;
        return r2;
    L21:
        r3 = this;
    L27:
        th = move-exception;
        th = th;
        r3 = this;
        goto L29
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03951(this, r9);
        goto L8
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    public final void dispose() {
        hideTextToolbar();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    public final Object detectTouchMode(PointerInputScope $this$detectTouchMode, Continuation<? super Unit> r4) {
        Object r0 = $this$detectTouchMode.awaitPointerEventScope(new C03862(this, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object detectTextFieldTapGestures(PointerInputScope $this$detectTextFieldTapGestures, MutableInteractionSource interactionSource, final Function0<Unit> r5, final Function0<Unit> r6, Continuation<? super Unit> r7) {
        Object r0 = TapGestureDetectorKt.detectTapAndPress($this$detectTextFieldTapGestures, new C03842(interactionSource, this, null), new C03853(r5, this, r6), r7);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    private final boolean m1360placeCursorAtNearestOffsetk4lQ0M(long offset) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult != null) goto L5;
        return false;
    L5:
        int index = layoutResult.m6387getOffsetForPositionk4lQ0M(offset);
        if (index != (-1)) goto L8;
        return false;
    L8:
        SelectionWedgeAffinity r6 = null;
        TransformedTextFieldState $this$getIndexTransformationType$iv = this.textFieldState;
        long untransformed$iv = $this$getIndexTransformationType$iv.m1311mapFromTransformedjx7JFs(index);
        long retransformed$iv = $this$getIndexTransformationType$iv.m1314mapToTransformedGEjPoXI(untransformed$iv);
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == false) goto L14;
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == false) goto L14;
        IndexTransformationType type$iv = IndexTransformationType.Untransformed;
    L24:
        IndexTransformationType type = type$iv;
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L38;
            case 2: goto L37;
            case 3: goto L32;
            case 4: goto L28;
            default: goto L27;
        };
    L28:
        boolean r20 = false;
        Rect wedgeStartCursorRect = layoutResult.getCursorRect(TextRange.m6417getStartimpl(retransformed$iv));
        Rect wedgeEndCursorRect = layoutResult.getCursorRect(TextRange.m6412getEndimpl(retransformed$iv));
        if (MathUtilsKt.m1258findClosestRect9KIMszo(offset, wedgeStartCursorRect, wedgeEndCursorRect) >= 0) goto L31;
        int untransformedCursor = TextRange.m6417getStartimpl(untransformed$iv);
    L39:
        long untransformedCursorRange = TextRangeKt.TextRange(untransformedCursor);
        if (TextRange.m6410equalsimpl0(untransformedCursorRange, this.textFieldState.getUntransformedText().m1188getSelectiond9O1mEE()) == false) goto L45;
        if (r6 != null) goto L43;
    L44:
        return r20;
    L43:
        if (Intrinsics.areEqual(r6, this.textFieldState.getSelectionWedgeAffinity()) == true) goto L44;
    L45:
        this.textFieldState.m1317selectUntransformedCharsIn5zctL8(untransformedCursorRange);
        if (r6 == null) goto L50;
        SelectionWedgeAffinity it = r6;
        this.textFieldState.setSelectionWedgeAffinity(it);
        return true;
    L50:
        return true;
    L31:
        untransformedCursor = TextRange.m6412getEndimpl(untransformed$iv);
        goto L39
    L32:
        r20 = false;
        Rect wedgeStartCursorRect2 = layoutResult.getCursorRect(TextRange.m6417getStartimpl(retransformed$iv));
        Rect wedgeEndCursorRect2 = layoutResult.getCursorRect(TextRange.m6412getEndimpl(retransformed$iv));
        if (MathUtilsKt.m1258findClosestRect9KIMszo(offset, wedgeStartCursorRect2, wedgeEndCursorRect2) >= 0) goto L35;
        SelectionWedgeAffinity r1 = new SelectionWedgeAffinity(WedgeAffinity.Start);
    L36:
        r6 = r1;
        untransformedCursor = TextRange.m6417getStartimpl(untransformed$iv);
        goto L39
    L35:
        r1 = new SelectionWedgeAffinity(WedgeAffinity.End);
        goto L36
    L37:
        r20 = false;
        untransformedCursor = TextRange.m6417getStartimpl(untransformed$iv);
        goto L39
    L38:
        r20 = false;
        untransformedCursor = TextRange.m6417getStartimpl(untransformed$iv);
        goto L39
    L27:
        throw new NoWhenBranchMatchedException();
    L14:
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == true) goto L19;
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == true) goto L19;
        type$iv = IndexTransformationType.Replacement;
    L19:
        if (TextRange.m6411getCollapsedimpl(untransformed$iv) == true) goto L21;
    L23:
        type$iv = IndexTransformationType.Deletion;
        goto L24
    L21:
        if (TextRange.m6411getCollapsedimpl(retransformed$iv) == true) goto L23;
        type$iv = IndexTransformationType.Insertion;
        goto L24
    }

    private final Object detectCursorHandleDragGestures(PointerInputScope $this$detectCursorHandleDragGestures, Continuation<? super Unit> r13) {
        if ((r13 instanceof C03771) == false) goto L7;
        C03771 r0 = (C03771) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        C03771 r6 = r0;
        Object $result = r6.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.LongRef cursorDragStart = (Ref.LongRef) r6.L$2;
        Ref.LongRef cursorDragStart2 = (Ref.LongRef) r6.L$1;
        TextFieldSelectionState r2 = (TextFieldSelectionState) r6.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L22:
        detectCursorHandleDragGestures$onDragStop(cursorDragStart2, cursorDragStart, r2);
        return Unit.INSTANCE;
    L15:
        th = th;
    L26:
        detectCursorHandleDragGestures$onDragStop(cursorDragStart2, cursorDragStart, r2);
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        final Ref.LongRef cursorDragStart3 = new Ref.LongRef();
        cursorDragStart3.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        final Ref.LongRef cursorDragDelta = new Ref.LongRef();
        cursorDragDelta.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        Function1<Offset, Unit> r3 = new C03782(cursorDragStart3, this, cursorDragDelta);     // Catch: Throwable -> L24
        Function0<Unit> r4 = new AnonymousClass3(cursorDragStart3, cursorDragDelta, this);     // Catch: Throwable -> L24
        Function0<Unit> r5 = new AnonymousClass4(cursorDragStart3, cursorDragDelta, this);     // Catch: Throwable -> L24
        Function2<PointerInputChange, Offset, Unit> r7 = new AnonymousClass5(cursorDragDelta, this, cursorDragStart3);     // Catch: Throwable -> L24
        r6.L$0 = this;     // Catch: Throwable -> L24
        r6.L$1 = cursorDragStart3;     // Catch: Throwable -> L24
        r6.L$2 = cursorDragDelta;     // Catch: Throwable -> L24
        r6.label = 1;     // Catch: Throwable -> L24
        if (DragGestureDetectorKt.detectDragGestures($this$detectCursorHandleDragGestures, r3, r4, r5, r7, r6) != r1) goto L21;
        return r1;
    L21:
        cursorDragStart2 = cursorDragStart3;
        r2 = this;
        cursorDragStart = cursorDragDelta;
    L24:
        th = th;
        cursorDragStart2 = cursorDragStart3;
        r2 = this;
        cursorDragStart = cursorDragDelta;
        goto L26
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03771(this, r13);
        goto L8
    }

    private static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef cursorDragStart, Ref.LongRef cursorDragDelta, TextFieldSelectionState this$0) {
        long $this$isSpecified$iv = cursorDragStart.element;
        if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        cursorDragStart.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        cursorDragDelta.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        this$0.clearHandleDragging();
        return;
    L9:
        return;
    L5:
        r3 = false;
        goto L6
    }

    public final Object textFieldSelectionGestures(PointerInputScope $this$textFieldSelectionGestures, Function0<Unit> r4, Continuation<? super Unit> r5) {
        Object r0 = SelectionGesturesKt.selectionGesturePointerInputBtf2($this$textFieldSelectionGestures, new TextFieldMouseSelectionObserver(this, r4), new TextFieldTextDragObserver(this, r4), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private final Object detectSelectionHandleDragGestures(PointerInputScope $this$detectSelectionHandleDragGestures, boolean isStartHandle, Continuation<? super Unit> r21) {
        if ((r21 instanceof C03791) == false) goto L7;
        C03791 r0 = (C03791) r21;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        C03791 r8 = r0;
        Object $result = r8.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r8.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        final Handle handle = (Handle) r8.L$3;
        Ref.LongRef dragTotalDistance = (Ref.LongRef) r8.L$2;
        Ref.LongRef dragBeginPosition = (Ref.LongRef) r8.L$1;
        final TextFieldSelectionState r6 = (TextFieldSelectionState) r8.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L37:
        TextFieldSelectionStateKt.access$logDebug(new AnonymousClass6(r6, handle));
        if (r6.getDraggingHandle() != handle) goto L41;
        detectSelectionHandleDragGestures$onDragStop$6(dragBeginPosition, r6, dragTotalDistance);
    L41:
        return Unit.INSTANCE;
    L15:
        th = th;
    L48:
        TextFieldSelectionStateKt.access$logDebug(new AnonymousClass6(r6, handle));
        if (r6.getDraggingHandle() != handle) goto L51;
        detectSelectionHandleDragGestures$onDragStop$6(dragBeginPosition, r6, dragTotalDistance);
    L51:
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        final Ref.LongRef dragTotalDistance2 = new Ref.LongRef();
        dragTotalDistance2.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        final Ref.LongRef dragTotalDistance3 = new Ref.LongRef();
        dragTotalDistance3.element = Offset.Companion.m4141getZeroF1C5BW0();
        if (isStartHandle == false) goto L20;
        Handle r5 = Handle.SelectionStart;
    L21:
        final Handle handle2 = r5;
        boolean r7 = false;
        if (isStartHandle == false) goto L26;
        final boolean r13 = true;
    L58:
        Function1<Offset, Unit> r9 = new C03802(dragTotalDistance2, this, r13, handle2, dragTotalDistance3);     // Catch: Throwable -> L44
        Function0<Unit> r16 = new C03813(dragTotalDistance2, this, dragTotalDistance3);     // Catch: Throwable -> L44
        Function0<Unit> r17 = new C03824(dragTotalDistance2, this, dragTotalDistance3);     // Catch: Throwable -> L44
        if (isStartHandle == false) goto L30;
        r7 = true;
    L30:
        final boolean r15 = r7;
        Function2<PointerInputChange, Offset, Unit> r10 = new C03835(dragTotalDistance3, this, handle2, dragTotalDistance2, r15);     // Catch: Throwable -> L42
        dragTotalDistance3 = dragTotalDistance3;
        dragTotalDistance2 = dragTotalDistance2;
        handle2 = handle2;
        r8.L$0 = this;     // Catch: Throwable -> L44
        r8.L$1 = dragTotalDistance2;     // Catch: Throwable -> L44
        r8.L$2 = dragTotalDistance3;     // Catch: Throwable -> L44
        r8.L$3 = handle2;     // Catch: Throwable -> L44
        r8.label = 1;     // Catch: Throwable -> L44
        if (DragGestureDetectorKt.detectDragGestures($this$detectSelectionHandleDragGestures, r9, r16, r17, r10, r8) != r1) goto L36;
        return r1;
    L36:
        dragBeginPosition = dragTotalDistance2;
        r6 = this;
        handle = handle2;
        dragTotalDistance = dragTotalDistance3;
    L42:
        th = th;
        dragBeginPosition = dragTotalDistance2;
        r6 = this;
        handle = handle2;
        dragTotalDistance = dragTotalDistance3;
    L44:
        th = th;
        dragBeginPosition = dragTotalDistance2;
        r6 = this;
        handle = handle2;
        dragTotalDistance = dragTotalDistance3;
        goto L48
    L26:
        r13 = false;
    L46:
        th = th;
        dragBeginPosition = dragTotalDistance2;
        r6 = this;
        handle = handle2;
        dragTotalDistance = dragTotalDistance3;
        goto L48
    L20:
        r5 = Handle.SelectionEnd;
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03791(this, r21);
        goto L8
    }

    private static final void detectSelectionHandleDragGestures$onDragStop$6(Ref.LongRef dragBeginPosition, TextFieldSelectionState this$0, Ref.LongRef dragTotalDistance) {
        long $this$isSpecified$iv = dragBeginPosition.element;
        if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L9;
        this$0.clearHandleDragging();
        dragBeginPosition.element = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        dragTotalDistance.element = Offset.Companion.m4141getZeroF1C5BW0();
        this$0.previousRawDragOffset = -1;
        return;
    L9:
        return;
    L5:
        r3 = false;
        goto L6
    }

    private final Object observeTextChanges(Continuation<? super Unit> r3) {
        Object r0 = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new C03872(this)), C03883.INSTANCE), 1).collect(new C03894(this), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private final Object observeTextToolbarVisibility(Continuation<? super Unit> r3) {
        Object r0 = SnapshotStateKt.snapshotFlow(new C03902(this)).collect(new C03913(this), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private final Rect getContentRect() {
        TextFieldCharSequence text = this.textFieldState.getVisualText();
        if (TextRange.m6411getCollapsedimpl(text.m1188getSelectiond9O1mEE()) == false) goto L10;
        Rect cursorRect = getCursorRect();
        LayoutCoordinates r3 = getTextLayoutCoordinates();
        if (r3 == null) goto L7;
        long topLeft = r3.mo5725localToRootMKHz9U(cursorRect.m4160getTopLeftF1C5BW0());
    L9:
        return RectKt.m4165Recttz77jQw(topLeft, cursorRect.m4158getSizeNHjbRc());
    L7:
        topLeft = Offset.Companion.m4141getZeroF1C5BW0();
        goto L9
    L10:
        LayoutCoordinates r2 = getTextLayoutCoordinates();
        if (r2 == null) goto L13;
        long startOffset = r2.mo5725localToRootMKHz9U(m1356getHandlePositiontuRUvjQ(true));
    L14:
        LayoutCoordinates r4 = getTextLayoutCoordinates();
        if (r4 == null) goto L17;
        long endOffset = r4.mo5725localToRootMKHz9U(m1356getHandlePositiontuRUvjQ(false));
    L18:
        LayoutCoordinates r6 = getTextLayoutCoordinates();
        float startTop = 0.0f;
        if (r6 == null) goto L27;
        TextLayoutResult r11 = this.textLayoutState.getLayoutResult();
        if (r11 == null) goto L25;
        Rect r12 = r11.getCursorRect(TextRange.m6417getStartimpl(text.m1188getSelectiond9O1mEE()));
        if (r12 == null) goto L25;
        float y$iv = r12.getTop();
    L26:
        long r16 = 4294967295L;
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        char r18 = ' ';
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long value$iv$iv = r6.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        int bits$iv$iv$iv = (int) (value$iv$iv & 4294967295L);
        startTop = Float.intBitsToFloat(bits$iv$iv$iv);
    L28:
        LayoutCoordinates r7 = getTextLayoutCoordinates();
        if (r7 == null) goto L38;
        TextLayoutResult r8 = this.textLayoutState.getLayoutResult();
        if (r8 == null) goto L35;
        Rect r9 = r8.getCursorRect(TextRange.m6412getEndimpl(text.m1188getSelectiond9O1mEE()));
        if (r9 == null) goto L35;
        float y$iv2 = r9.getTop();
    L36:
        long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long value$iv$iv2 = r7.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv2 << r18) | (v2$iv$iv2 & r16)));
        int bits$iv$iv$iv2 = (int) (value$iv$iv2 & r16);
        startTop = Float.intBitsToFloat(bits$iv$iv$iv2);
    L35:
        y$iv2 = startTop;
    L38:
        float endTop = startTop;
        long value$iv$iv3 = startOffset;
        int bits$iv$iv$iv3 = (int) (value$iv$iv3 >> r18);
        long value$iv$iv4 = endOffset;
        int bits$iv$iv$iv4 = (int) (value$iv$iv4 >> r18);
        float r10 = Math.min(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
        long value$iv$iv5 = startOffset;
        int bits$iv$iv$iv5 = (int) (value$iv$iv5 >> r18);
        long value$iv$iv6 = endOffset;
        int bits$iv$iv$iv6 = (int) (value$iv$iv6 >> r18);
        long value$iv$iv7 = startOffset;
        int bits$iv$iv$iv7 = (int) (value$iv$iv7 & r16);
        long value$iv$iv8 = endOffset;
        int bits$iv$iv$iv8 = (int) (value$iv$iv8 & r16);
        return new Rect(r10, Math.min(startTop, endTop), Math.max(Float.intBitsToFloat(bits$iv$iv$iv5), Float.intBitsToFloat(bits$iv$iv$iv6)), Math.max(Float.intBitsToFloat(bits$iv$iv$iv7), Float.intBitsToFloat(bits$iv$iv$iv8)));
    L25:
        y$iv = 0.0f;
        goto L26
    L27:
        r16 = 4294967295L;
        r18 = ' ';
        goto L28
    L17:
        endOffset = Offset.Companion.m4141getZeroF1C5BW0();
        goto L18
    L13:
        startOffset = Offset.Companion.m4141getZeroF1C5BW0();
        goto L14
    }

    public final TextFieldHandleState getSelectionHandleState$foundation_release(boolean isStartHandle, boolean includePosition) {
        if (isStartHandle == false) goto L5;
        Handle handle = Handle.SelectionStart;
    L6:
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) goto L9;
        long selection = this.textFieldState.getVisualText().m1188getSelectiond9O1mEE();
        if (TextRange.m6411getCollapsedimpl(selection) == true) goto L13;
        long position = m1356getHandlePositiontuRUvjQ(isStartHandle);
        if (getDirectDragGestureInitiator() == InputType.None) goto L17;
    L26:
        boolean visible = false;
    L28:
        if (visible == true) goto L32;
        return TextFieldHandleState.Companion.getHidden();
    L32:
        if (this.textFieldState.getVisualText().shouldShowSelection() == false) goto L34;
        if (isStartHandle == false) goto L37;
        int directionOffset = TextRange.m6417getStartimpl(selection);
    L38:
        ResolvedTextDirection direction = layoutResult.getBidiRunDirection(directionOffset);
        boolean handlesCrossed = TextRange.m6416getReversedimpl(selection);
        if (includePosition == false) goto L46;
        LayoutCoordinates r9 = getTextLayoutCoordinates();
        if (r9 == null) goto L45;
        Rect it = SelectionManagerKt.visibleBounds(r9);
        if (it == null) goto L45;
        long coercedPosition = TextLayoutStateKt.m1303coerceIn3MmeM6k(position, it);
    L48:
        if (isStartHandle == false) goto L50;
        int handleOffset = TextRange.m6417getStartimpl(selection);
    L52:
        return new TextFieldHandleState(true, coercedPosition, TextLayoutHelperKt.getLineHeight(layoutResult, handleOffset), direction, handlesCrossed, null);
    L50:
        handleOffset = TextRange.m6412getEndimpl(selection);
    L45:
        coercedPosition = position;
        goto L48
    L46:
        coercedPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        goto L48
    L37:
        directionOffset = Math.max(TextRange.m6412getEndimpl(selection) - 1, 0);
        goto L38
    L34:
        return TextFieldHandleState.Companion.getHidden();
    L17:
        if (getDraggingHandle() == handle) goto L25;
        LayoutCoordinates r7 = getTextLayoutCoordinates();
        if (r7 == null) goto L23;
        Rect r8 = SelectionManagerKt.visibleBounds(r7);
        if (r8 == null) goto L23;
        boolean r10 = SelectionManagerKt.m1483containsInclusiveUv8p0NA(r8, position);
    L24:
        if (r10 == false) goto L26;
    L23:
        r10 = false;
    L25:
        visible = true;
        goto L28
    L13:
        return TextFieldHandleState.Companion.getHidden();
    L9:
        return TextFieldHandleState.Companion.getHidden();
    L5:
        handle = Handle.SelectionEnd;
        goto L6
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    private final long m1356getHandlePositiontuRUvjQ(boolean isStartHandle) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) goto L5;
        long selection = this.textFieldState.getVisualText().m1188getSelectiond9O1mEE();
        if (isStartHandle == false) goto L9;
        int offset = TextRange.m6417getStartimpl(selection);
    L11:
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, offset, isStartHandle, TextRange.m6416getReversedimpl(selection));
    L9:
        offset = TextRange.m6412getEndimpl(selection);
        goto L11
    L5:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1366updateHandleDraggingUv8p0NA(Handle handle, long position) {
        setDraggingHandle(handle);
        m1361setRawHandleDragPositionk4lQ0M(position);
    }

    private final void markStartContentVisibleOffset() {
        m1362setStartTextLayoutPositionInWindowk4lQ0M(m1355getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        m1361setRawHandleDragPositionk4lQ0M(Offset.Companion.m4140getUnspecifiedF1C5BW0());
        m1362setStartTextLayoutPositionInWindowk4lQ0M(Offset.Companion.m4140getUnspecifiedF1C5BW0());
    }

    public final boolean canCut() {
        if (TextRange.m6411getCollapsedimpl(this.textFieldState.getVisualText().m1188getSelectiond9O1mEE()) == false) goto L5;
    L9:
        return false;
    L5:
        if (getEditable() == false) goto L9;
        if (this.isPassword == true) goto L9;
        return true;
    }

    public final Object cut(Continuation<? super Unit> r10) {
        if ((r10 instanceof C03761) == false) goto L7;
        C03761 r0 = (C03761) r10;
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
        TextFieldSelectionState r3 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L23:
        TextFieldSelectionState r4 = r3;
    L24:
        r4.textFieldState.deleteSelectedText();
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r4 = this;
        TextFieldCharSequence text = r4.textFieldState.getVisualText();
        if (TextRange.m6411getCollapsedimpl(text.m1188getSelectiond9O1mEE()) == true) goto L16;
        AnnotatedString textToCut = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, 2, null);
        Clipboard r5 = r4.clipboard;
        if (r5 == null) goto L24;
        ClipEntry r6 = ClipboardUtils_androidKt.toClipEntry(textToCut);
        r0.L$0 = r4;
        r0.label = 1;
        if (r5.setClipEntry(r6, r0) != r2) goto L22;
        return r2;
    L22:
        r3 = r4;
        goto L23
    L16:
        return Unit.INSTANCE;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03761(this, r10);
        goto L8
    }

    public final boolean canCopy() {
        if (TextRange.m6411getCollapsedimpl(this.textFieldState.getVisualText().m1188getSelectiond9O1mEE()) == false) goto L5;
    L7:
        return false;
    L5:
        if (this.isPassword == true) goto L7;
        return true;
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState r0, boolean r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return r0.copy(r1, r2);
    }

    public final Object copy(boolean cancelSelection, Continuation<? super Unit> r11) {
        if ((r11 instanceof C03751) == false) goto L7;
        C03751 r0 = (C03751) r11;
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
        cancelSelection = r0.Z$0;
        TextFieldSelectionState r3 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L23:
        TextFieldSelectionState r4 = r3;
    L24:
        if (cancelSelection == false) goto L26;
        r4.textFieldState.collapseSelectionToMax();
        return Unit.INSTANCE;
    L26:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r4 = this;
        TextFieldCharSequence text = r4.textFieldState.getVisualText();
        if (TextRange.m6411getCollapsedimpl(text.m1188getSelectiond9O1mEE()) == true) goto L16;
        AnnotatedString textToCopy = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, 2, null);
        Clipboard r5 = r4.clipboard;
        if (r5 == null) goto L24;
        ClipEntry r6 = ClipboardUtils_androidKt.toClipEntry(textToCopy);
        r0.L$0 = r4;
        r0.Z$0 = cancelSelection;
        r0.label = 1;
        if (r5.setClipEntry(r6, r0) != r2) goto L22;
        return r2;
    L22:
        r3 = r4;
        goto L23
    L16:
        return Unit.INSTANCE;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03751(this, r11);
        goto L8
    }

    public final Object canPaste(Continuation<? super Boolean> r9) {
        if ((r9 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r4 = false;
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r3 = $result;
    L42:
        ClipEntry r7 = (ClipEntry) r3;
    L43:
        if (r7 == null) goto L46;
        r4 = true;
    L46:
        return Boxing.boxBoolean(r4);
    L13:
        TextFieldSelectionState r5 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r6 = $result;
    L23:
        ClipEntry r8 = (ClipEntry) r6;
        if (r8 != null) goto L26;
    L28:
        boolean r10 = false;
    L29:
        if (r10 == true) goto L31;
        Function0<? extends ReceiveContentConfiguration> r11 = r5.receiveContentConfiguration;
        r7 = null;
        if (r11 == null) goto L35;
        ReceiveContentConfiguration r12 = r11.invoke();
    L36:
        if (r12 == null) goto L46;
        Clipboard r13 = r5.clipboard;
        if (r13 == null) goto L43;
        r0.L$0 = null;
        r0.label = 2;
        r3 = r13.getClipEntry(r0);
        if (r3 != r2) goto L42;
        return r2;
    L35:
        r12 = null;
        goto L36
    L31:
        return Boxing.boxBoolean(true);
    L26:
        if (ClipboardUtils_androidKt.hasText(r8) != true) goto L28;
        r10 = true;
        goto L29
    L14:
        ResultKt.throwOnFailure($result);
        r5 = this;
        if (r5.getEditable() == false) goto L17;
        Clipboard r14 = r5.clipboard;
        if (r14 == null) goto L28;
        r0.L$0 = r5;
        r0.label = 1;
        r6 = r14.getClipEntry(r0);
        if (r6 != r2) goto L23;
        return r2;
    L17:
        return Boxing.boxBoolean(false);
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r9);
        goto L8
    }

    public final Object paste(Continuation<? super Unit> r14) {
        if ((r14 instanceof C03921) == false) goto L7;
        C03921 r0 = (C03921) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L41:
        return Unit.INSTANCE;
    L13:
        ReceiveContentConfiguration receiveContentConfiguration = (ReceiveContentConfiguration) r0.L$1;
        TextFieldSelectionState r4 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r5 = $result;
    L25:
        ClipEntry clipEntry = (ClipEntry) r5;
        if (clipEntry == null) goto L37;
        ClipMetadata clipMetadata = clipEntry.getClipMetadata();
        TransferableContent remaining = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m335getClipboardkB6V9T0(), null, 8, null));
        if (remaining == null) goto L36;
        ClipEntry r3 = remaining.getClipEntry();
        if (r3 == null) goto L36;
        String clipboardText = TransferableContent_androidKt.readPlainText(r3);
        if (clipboardText == null) goto L36;
        TransformedTextFieldState.replaceSelectedText$default(r4.textFieldState, clipboardText, false, TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
    L36:
        return Unit.INSTANCE;
    L37:
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 3;
        if (r4.pasteAsPlainText(r0) != r2) goto L41;
        return r2;
    L14:
        ResultKt.throwOnFailure($result);
    L46:
        return Unit.INSTANCE;
    L15:
        ResultKt.throwOnFailure($result);
        r4 = this;
        Function0<? extends ReceiveContentConfiguration> r6 = r4.receiveContentConfiguration;
        if (r6 == null) goto L42;
        receiveContentConfiguration = r6.invoke();
        if (receiveContentConfiguration == null) goto L42;
        Clipboard r7 = r4.clipboard;
        if (r7 == null) goto L37;
        r0.L$0 = r4;
        r0.L$1 = receiveContentConfiguration;
        r0.label = 2;
        r5 = r7.getClipEntry(r0);
        if (r5 != r2) goto L25;
        return r2;
    L42:
        r0.label = 1;
        if (r4.pasteAsPlainText(r0) != r2) goto L46;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03921(this, r14);
        goto L8
    }

    private final Object pasteAsPlainText(Continuation<? super Unit> r12) {
        if ((r12 instanceof C03931) == false) goto L7;
        C03931 r0 = (C03931) r12;
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
        TextFieldSelectionState r3 = (TextFieldSelectionState) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r4 = $result;
    L19:
        ClipEntry r5 = (ClipEntry) r4;
        if (r5 == null) goto L27;
        String clipboardText = ClipboardUtils_androidKt.readText(r5);
        if (clipboardText == null) goto L27;
        TransformedTextFieldState.replaceSelectedText$default(r3.textFieldState, clipboardText, false, TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
        return Unit.INSTANCE;
    L27:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        Clipboard r6 = this.clipboard;
        if (r6 == null) goto L27;
        r0.L$0 = this;
        r0.label = 1;
        r4 = r6.getClipEntry(r0);
        if (r4 != r2) goto L18;
        return r2;
    L18:
        r3 = this;
        goto L19
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03931(this, r12);
        goto L8
    }

    public final boolean canSelectAll() {
        if (TextRange.m6413getLengthimpl(this.textFieldState.getVisualText().m1188getSelectiond9O1mEE()) == this.textFieldState.getVisualText().length()) goto L5;
        return true;
    L5:
        return false;
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final boolean canAutofill() {
        if (getEditable() == true) goto L5;
    L7:
        return false;
    L5:
        if (TextRange.m6411getCollapsedimpl(this.textFieldState.getVisualText().m1188getSelectiond9O1mEE()) == false) goto L7;
        return true;
    }

    public final void autofill() {
        Function0<Unit> r0 = this.requestAutofillAction;
        if (r0 == null) goto L6;
        r0.invoke();
        return;
    }

    public final void deselect() {
        if (TextRange.m6411getCollapsedimpl(this.textFieldState.getVisualText().m1188getSelectiond9O1mEE()) == true) goto L5;
        this.textFieldState.collapseSelectionToEnd();
    L5:
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    private final void hideTextToolbar() {
        TextToolbarHandler r0 = this.textToolbarHandler;
        if (r0 == null) goto L6;
        r0.hideTextToolbar();
        return;
    }

    /* JADX INFO: renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    static /* synthetic */ long m1364updateSelectionSsLRf8$default(TextFieldSelectionState r1, TextFieldCharSequence r2, int r3, int r4, boolean r5, SelectionAdjustment r6, boolean r7, boolean r8, int r9, Object r10) {
        if ((r9 & 32) == 0) goto L6;
        r7 = false;
    L6:
        if ((r9 & 64) == 0) goto L9;
        r8 = false;
    L9:
        return r1.m1363updateSelectionSsLRf8(r2, r3, r4, r5, r6, r7, r8);
    }

    /* JADX INFO: renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    private final long m1363updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        TextRange r0 = TextRange.m6405boximpl(textFieldCharSequence.m1188getSelectiond9O1mEE());
        long it = r0.m6421unboximpl();
        boolean onlyChangeIsReversed = true;
        if (isStartOfSelection == true) goto L8;
        if (allowPreviousSelectionCollapsed == false) goto L6;
    L7:
        boolean r1 = true;
    L9:
        if (r1 == true) goto L12;
        r0 = null;
    L12:
        long newSelection = m1359getTextFieldSelectionqeG_v_k(startOffset, endOffset, r0, isStartHandle, adjustment);
        if (TextRange.m6410equalsimpl0(newSelection, textFieldCharSequence.m1188getSelectiond9O1mEE()) == false) goto L16;
        return newSelection;
    L16:
        if (TextRange.m6416getReversedimpl(newSelection) == TextRange.m6416getReversedimpl(textFieldCharSequence.m1188getSelectiond9O1mEE())) goto L20;
        long $this$updateSelection_SsL_Rf8_u24lambda_u2410 = TextRangeKt.TextRange(TextRange.m6412getEndimpl(newSelection), TextRange.m6417getStartimpl(newSelection));
        if (TextRange.m6410equalsimpl0($this$updateSelection_SsL_Rf8_u24lambda_u2410, textFieldCharSequence.m1188getSelectiond9O1mEE()) == false) goto L20;
    L22:
        if (isInTouchMode() == false) goto L27;
        if (onlyChangeIsReversed == true) goto L27;
        HapticFeedback r2 = this.hapticFeedBack;
        if (r2 == null) goto L27;
        r2.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
    L27:
        return newSelection;
    L20:
        onlyChangeIsReversed = false;
        goto L22
    L6:
        if (TextRange.m6411getCollapsedimpl(it) == false) goto L7;
    L8:
        r1 = false;
        goto L9
    }

    /* JADX INFO: renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1359getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult != null) goto L7;
        return TextRange.Companion.m6422getZerod9O1mEE();
    L7:
        if (previousSelection == null) goto L9;
    L12:
        int r5 = this.previousRawDragOffset;
        if (previousSelection == null) goto L15;
        long r0 = previousSelection.m6421unboximpl();
    L16:
        long r6 = r0;
        if (previousSelection != null) goto L19;
        boolean r1 = true;
    L20:
        SelectionLayout selectionLayout = SelectionLayoutKt.m1450getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, r5, r6, r1, isStartHandle);
        if (previousSelection != null) goto L23;
    L26:
        long result = adjustment.adjust(selectionLayout).m1439toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayout;
        if (isStartHandle == false) goto L29;
        int r12 = rawStartOffset;
    L30:
        this.previousRawDragOffset = r12;
        return result;
    L29:
        r12 = rawEndOffset;
        goto L30
    L23:
        if (selectionLayout.shouldRecomputeSelection(this.previousSelectionLayout) == true) goto L26;
        return previousSelection.m6421unboximpl();
    L19:
        r1 = false;
        goto L20
    L15:
        r0 = TextRange.Companion.m6422getZerod9O1mEE();
        goto L16
    L9:
        if (Intrinsics.areEqual(adjustment, SelectionAdjustment.Companion.getCharacter()) == false) goto L12;
        return TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
    }
}
