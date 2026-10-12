package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020OH\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u0004\u0018\u00010\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0000¢\u0006\u0003\b\u0082\u0001J\f\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0003\b\u0086\u0001J2\u0010\u0087\u0001\u001a\u0004\u0018\u00010Z2\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0007J\u000f\u0010\u008f\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0090\u0001J\u000f\u0010\u0091\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020OJ\u000f\u0010\u0096\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0003\b\u0097\u0001J\u000f\u0010\u0098\u0001\u001a\u00020OH\u0000¢\u0006\u0003\b\u0099\u0001J:\u0010\u009a\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\t0\u009c\u00010\u009b\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0003\b \u0001J\u001b\u0010¡\u0001\u001a\u00020O2\u0007\u0010\u0088\u0001\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0005\b¢\u0001\u0010\u001eJ\u001b\u0010£\u0001\u001a\u00020O2\u0007\u0010¤\u0001\u001a\u00020Z2\u0007\u0010¥\u0001\u001a\u00020\tH\u0002J\u000f\u0010¦\u0001\u001a\u00020\u0007H\u0001¢\u0006\u0003\b§\u0001J1\u0010¨\u0001\u001a\u00020O2\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J\t\u0010\u00ad\u0001\u001a\u00020OH\u0002J\t\u0010®\u0001\u001a\u00020OH\u0002J:\u0010¯\u0001\u001a\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\b\u0010©\u0001\u001a\u00030ª\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001J;\u0010¯\u0001\u001a\u00020\u00072\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00122\u0006\u0010X\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00072\b\u0010©\u0001\u001a\u00030ª\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\t\u0010µ\u0001\u001a\u00020OH\u0002J\u001d\u0010¶\u0001\u001a\u00020I*\u00020I2\u000e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020O0¸\u0001H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R5\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R1\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR1\u0010 \u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR/\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0011\u001a\u0004\u0018\u00010$8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R5\u0010/\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b2\u0010\u0019\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010?\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0019\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR$\u0010F\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\u0011\u0010H\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR@\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0M2\u0014\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0M@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\u0016\u0010X\u001a\u0004\u0018\u00010\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R&\u0010Y\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010AR$\u0010h\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010A\"\u0004\bj\u0010CR\u0011\u0010k\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bl\u0010.R5\u0010m\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bp\u0010\u0019\u001a\u0004\bn\u0010\u0015\"\u0004\bo\u0010\u0017R\u001c\u0010q\u001a\u0004\u0018\u00010rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_isInTouchMode", "Landroidx/compose/runtime/MutableState;", "", "_selection", "Landroidx/compose/foundation/text/selection/Selection;", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "endHandleLineHeight", "", "getEndHandleLineHeight", "()F", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "isDraggingInProgress", "isInTouchMode", "setInTouchMode", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "onCopyHandler", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getOnCopyHandler", "()Lkotlin/jvm/functions/Function1;", "setOnCopyHandler", "(Lkotlin/jvm/functions/Function1;)V", "newOnSelectionChange", "onSelectionChange", "getOnSelectionChange", "setOnSelectionChange", "previousPosition", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release$annotations", "()V", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "shouldShowMagnifier", "getShouldShowMagnifier", "showToolbar", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "startHandleLineHeight", "getStartHandleLineHeight", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "convertToContainerCoordinates", "layoutCoordinates", "offset", "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "copy", "copy$foundation_release", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "getSelectedText$foundation_release", "getSelectionLayout", "position", "previousHandlePosition", "isStartHandle", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isEntireContainerSelected", "isEntireContainerSelected$foundation_release", "isNonEmptySelection", "isNonEmptySelection$foundation_release", "isTriviallyCollapsedSelection", "isTriviallyCollapsedSelection$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "selectAll$foundation_release", "selectAllInSelectable", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectableId", "", "previousSelection", "selectAllInSelectable$foundation_release", "selectWordAtPositionIfNotAlreadySelected", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "selectionChanged", "selectionLayout", "newSelection", "shouldPerformHaptics", "shouldPerformHaptics$foundation_release", "startSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "toolbarCopy", "updateHandleOffsets", "updateSelection", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelectionToolbar", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionManager {
    public static final int $stable = 0;
    private final MutableState<Boolean> _isInTouchMode;
    private final MutableState<Selection> _selection;
    private LayoutCoordinates containerLayoutCoordinates;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MutableState hasFocus$delegate;
    private Function1<? super AnnotatedString, Unit> onCopyHandler;
    private Function1<? super Selection, Unit> onSelectionChange;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C04091 extends FunctionReferenceImpl implements Function0<Unit> {
        C04091(Object r8) {
            super(0, r8, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SelectionManager.access$toolbarCopy((SelectionManager) this.receiver);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C04102 extends FunctionReferenceImpl implements Function0<Unit> {
        C04102(Object r8) {
            super(0, r8, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SelectionManager) this.receiver).selectAll$foundation_release();
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrar) {
        this.selectionRegistrar = selectionRegistrar;
        this._selection = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._isInTouchMode = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.onSelectionChange = new SelectionManager$onSelectionChange$1(this);
        this.focusRequester = new FocusRequester();
        this.hasFocus$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.dragBeginPosition$delegate = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4141getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4141getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.selectionRegistrar.setOnPositionChangeCallback$foundation_release(new AnonymousClass1(this));
        this.selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new AnonymousClass2(this));
        this.selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new AnonymousClass3(this));
        this.selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new AnonymousClass4(this));
        this.selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new AnonymousClass5(this));
        this.selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new AnonymousClass6(this));
        this.selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new AnonymousClass7(this));
    }

    /* JADX INFO: renamed from: access$convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public static final /* synthetic */ long m1456access$convertToContainerCoordinatesR5De75A(SelectionManager $this, LayoutCoordinates layoutCoordinates, long offset) {
        return $this.m1463convertToContainerCoordinatesR5De75A(layoutCoordinates, offset);
    }

    public static final /* synthetic */ SelectionRegistrarImpl access$getSelectionRegistrar$p(SelectionManager $this) {
        return $this.selectionRegistrar;
    }

    public static final /* synthetic */ boolean access$isDraggingInProgress(SelectionManager $this) {
        return $this.isDraggingInProgress();
    }

    /* JADX INFO: renamed from: access$setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public static final /* synthetic */ void m1457access$setCurrentDragPosition_kEHs6E(SelectionManager $this, Offset r1) {
        $this.m1465setCurrentDragPosition_kEHs6E(r1);
    }

    /* JADX INFO: renamed from: access$setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ void m1458access$setDragBeginPositionk4lQ0M(SelectionManager $this, long r1) {
        $this.m1466setDragBeginPositionk4lQ0M(r1);
    }

    /* JADX INFO: renamed from: access$setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ void m1459access$setDragTotalDistancek4lQ0M(SelectionManager $this, long r1) {
        $this.m1467setDragTotalDistancek4lQ0M(r1);
    }

    public static final /* synthetic */ void access$setDraggingHandle(SelectionManager $this, Handle r1) {
        $this.setDraggingHandle(r1);
    }

    /* JADX INFO: renamed from: access$setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public static final /* synthetic */ void m1460access$setEndHandlePosition_kEHs6E(SelectionManager $this, Offset r1) {
        $this.m1468setEndHandlePosition_kEHs6E(r1);
    }

    /* JADX INFO: renamed from: access$setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public static final /* synthetic */ void m1461access$setStartHandlePosition_kEHs6E(SelectionManager $this, Offset r1) {
        $this.m1469setStartHandlePosition_kEHs6E(r1);
    }

    /* JADX INFO: renamed from: access$startSelection-9KIMszo, reason: not valid java name */
    public static final /* synthetic */ void m1462access$startSelection9KIMszo(SelectionManager $this, long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        $this.m1470startSelection9KIMszo(position, isStartHandle, adjustment);
    }

    public static final /* synthetic */ void access$toolbarCopy(SelectionManager $this) {
        $this.toolbarCopy();
    }

    public static final /* synthetic */ void access$updateHandleOffsets(SelectionManager $this) {
        $this.updateHandleOffsets();
    }

    public static final /* synthetic */ void access$updateSelectionToolbar(SelectionManager $this) {
        $this.updateSelectionToolbar();
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(Selection value) {
        this._selection.setValue(value);
        if (value == null) goto L6;
        updateHandleOffsets();
        return;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean value) {
        if (this._isInTouchMode.getValue().booleanValue() == value) goto L6;
        this._isInTouchMode.setValue(Boolean.valueOf(value));
        updateSelectionToolbar();
        return;
    }

    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final Function1<? super Selection, Unit> r2) {
        this.onSelectionChange = new SelectionManager$onSelectionChange$2(this, r2);
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback r1) {
        this.hapticFeedBack = r1;
    }

    public final Function1<AnnotatedString, Unit> getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final void setOnCopyHandler(Function1<? super AnnotatedString, Unit> r1) {
        this.onCopyHandler = r1;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar r1) {
        this.textToolbar = r1;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester r1) {
        this.focusRequester = r1;
    }

    public final boolean getHasFocus() {
        State $this$getValue$iv = this.hasFocus$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean r5) {
        MutableState $this$setValue$iv = this.hasFocus$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final boolean isDraggingInProgress() {
        if (getDraggingHandle() == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final Modifier getModifier() {
        Modifier r0 = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.Companion, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.focusRequester), new SelectionManager$modifier$3(this)), false, null, 3, null), new SelectionManager$modifier$4(this)), new SelectionManager$modifier$5(this));
        if (getShouldShowMagnifier() == false) goto L5;
        Modifier.Companion r1 = SelectionManager_androidKt.selectionMagnifier(Modifier.Companion, this);
    L7:
        return r0.then(r1);
    L5:
        r1 = Modifier.Companion;
        goto L7
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates value) {
        this.containerLayoutCoordinates = value;
        if (getHasFocus() == true) goto L5;
        return;
    L5:
        if (getSelection() == null) goto L14;
        if (value == null) goto L8;
        Offset positionInWindow = Offset.m4114boximpl(LayoutCoordinatesKt.positionInWindow(value));
    L10:
        if (Intrinsics.areEqual(this.previousPosition, positionInWindow) == true) goto L15;
        this.previousPosition = positionInWindow;
        updateHandleOffsets();
        updateSelectionToolbar();
        return;
    L15:
        return;
    L8:
        positionInWindow = null;
        goto L10
    }

    /* JADX INFO: renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    private final void m1466setDragBeginPositionk4lQ0M(long r5) {
        MutableState $this$setValue$iv = this.dragBeginPosition$delegate;
        $this$setValue$iv.setValue(Offset.m4114boximpl(r5));
    }

    /* JADX INFO: renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1472getDragBeginPositionF1C5BW0$foundation_release() {
        State $this$getValue$iv = this.dragBeginPosition$delegate;
        return ((Offset) $this$getValue$iv.getValue()).m4135unboximpl();
    }

    /* JADX INFO: renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    private final void m1467setDragTotalDistancek4lQ0M(long r5) {
        MutableState $this$setValue$iv = this.dragTotalDistance$delegate;
        $this$setValue$iv.setValue(Offset.m4114boximpl(r5));
    }

    /* JADX INFO: renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1473getDragTotalDistanceF1C5BW0$foundation_release() {
        State $this$getValue$iv = this.dragTotalDistance$delegate;
        return ((Offset) $this$getValue$iv.getValue()).m4135unboximpl();
    }

    /* JADX INFO: renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m1469setStartHandlePosition_kEHs6E(Offset r4) {
        MutableState $this$setValue$iv = this.startHandlePosition$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1475getStartHandlePosition_m7T9E() {
        State $this$getValue$iv = this.startHandlePosition$delegate;
        return (Offset) $this$getValue$iv.getValue();
    }

    /* JADX INFO: renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m1468setEndHandlePosition_kEHs6E(Offset r4) {
        MutableState $this$setValue$iv = this.endHandlePosition$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1474getEndHandlePosition_m7T9E() {
        State $this$getValue$iv = this.endHandlePosition$delegate;
        return (Offset) $this$getValue$iv.getValue();
    }

    private final void setDraggingHandle(Handle r4) {
        MutableState $this$setValue$iv = this.draggingHandle$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Handle getDraggingHandle() {
        State $this$getValue$iv = this.draggingHandle$delegate;
        return (Handle) $this$getValue$iv.getValue();
    }

    public final float getStartHandleLineHeight() {
        Selection selection = getSelection();
        if (selection != null) goto L5;
        return 0.0f;
    L5:
        Selection.AnchorInfo p0 = selection.getStart();
        Selectable selectable = getAnchorSelectable$foundation_release(p0);
        if (selectable != null) goto L9;
        return 0.0f;
    L9:
        return selectable.getLineHeight(selection.getStart().getOffset());
    }

    public final float getEndHandleLineHeight() {
        Selection selection = getSelection();
        if (selection != null) goto L5;
        return 0.0f;
    L5:
        Selection.AnchorInfo p0 = selection.getEnd();
        Selectable selectable = getAnchorSelectable$foundation_release(p0);
        if (selectable != null) goto L9;
        return 0.0f;
    L9:
        return selectable.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    private final void m1465setCurrentDragPosition_kEHs6E(Offset r4) {
        MutableState $this$setValue$iv = this.currentDragPosition$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1471getCurrentDragPosition_m7T9E() {
        State $this$getValue$iv = this.currentDragPosition$delegate;
        return (Offset) $this$getValue$iv.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        if (isDraggingInProgress() == true) goto L5;
    L9:
        return false;
    L5:
        if (isInTouchMode() == false) goto L9;
        if (isTriviallyCollapsedSelection$foundation_release() == true) goto L9;
        return true;
    }

    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation_release(SelectionLayout r1) {
        this.previousSelectionLayout = r1;
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchor.getSelectableId());
    }

    private final void updateHandleOffsets() {
        Selection selection = getSelection();
        LayoutCoordinates containerCoordinates = this.containerLayoutCoordinates;
        if (selection == null) goto L7;
        Selection.AnchorInfo p0 = selection.getStart();
        if (p0 == null) goto L7;
        Selectable startSelectable = getAnchorSelectable$foundation_release(p0);
    L8:
        if (selection == null) goto L12;
        Selection.AnchorInfo p1 = selection.getEnd();
        if (p1 == null) goto L12;
        Selectable endSelectable = getAnchorSelectable$foundation_release(p1);
    L13:
        if (startSelectable == null) goto L15;
        LayoutCoordinates startLayoutCoordinates = startSelectable.getLayoutCoordinates();
    L16:
        if (endSelectable == null) goto L18;
        LayoutCoordinates endLayoutCoordinates = endSelectable.getLayoutCoordinates();
    L20:
        if (selection == null) goto L74;
        if (containerCoordinates == null) goto L74;
        if (containerCoordinates.isAttached() == false) goto L74;
        if (startLayoutCoordinates != null) goto L27;
        if (endLayoutCoordinates == null) goto L74;
    L27:
        Rect visibleBounds = SelectionManagerKt.visibleBounds(containerCoordinates);
        if (startLayoutCoordinates == null) goto L47;
        LayoutCoordinates handleCoordinates = startLayoutCoordinates;
        long $this$isUnspecified$iv = startSelectable.mo1433getHandlePositiondBAh8RU(selection, true);
        if (($this$isUnspecified$iv & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L32;
        boolean r17 = true;
    L33:
        if (r17 == false) goto L35;
        long r18 = 9205357640488583168L;
        long r22 = 9223372034707292159L;
        Offset r21 = null;
    L46:
        Offset r3 = r21;
    L48:
        m1469setStartHandlePosition_kEHs6E(r3);
        if (endLayoutCoordinates == null) goto L68;
        LayoutCoordinates handleCoordinates2 = endLayoutCoordinates;
        long handlePosition = endSelectable.mo1433getHandlePositiondBAh8RU(selection, false);
        if ((handlePosition & r22) != r18) goto L53;
        int r12 = 1;
    L54:
        if (r12 == 0) goto L56;
        Offset r4 = null;
    L69:
        m1468setEndHandlePosition_kEHs6E(r4);
        return;
    L56:
        long position = containerCoordinates.mo5723localPositionOfR5De75A(handleCoordinates2, handlePosition);
        Offset r13 = Offset.m4114boximpl(position);
        long it = r13.m4135unboximpl();
        if (getDraggingHandle() != Handle.SelectionEnd) goto L59;
    L62:
        boolean r14 = true;
    L63:
        if (r14 == false) goto L65;
        Offset r25 = r13;
    L66:
        r4 = r25;
        goto L69
    L65:
        r25 = null;
        goto L66
    L59:
        if (SelectionManagerKt.m1483containsInclusiveUv8p0NA(visibleBounds, it) == true) goto L62;
        r14 = false;
        goto L63
    L53:
        r12 = 0;
        goto L54
    L68:
        r4 = null;
        goto L69
    L35:
        r18 = 9205357640488583168L;
        long position2 = containerCoordinates.mo5723localPositionOfR5De75A(handleCoordinates, $this$isUnspecified$iv);
        r21 = Offset.m4114boximpl(position2);
        r22 = 9223372034707292159L;
        long it2 = r21.m4135unboximpl();
        if (getDraggingHandle() != Handle.SelectionStart) goto L38;
    L41:
        boolean r5 = true;
    L42:
        if (r5 == true) goto L46;
        r21 = null;
        goto L46
    L38:
        if (SelectionManagerKt.m1483containsInclusiveUv8p0NA(visibleBounds, it2) == true) goto L41;
        r5 = false;
        goto L42
    L32:
        r17 = false;
        goto L33
    L47:
        r18 = 9205357640488583168L;
        r22 = 9223372034707292159L;
        r3 = null;
    L74:
        m1469setStartHandlePosition_kEHs6E(null);
        m1468setEndHandlePosition_kEHs6E(null);
        return;
    L18:
        endLayoutCoordinates = null;
        goto L20
    L15:
        startLayoutCoordinates = null;
    L12:
        endSelectable = null;
    L7:
        startSelectable = null;
        goto L8
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates coordinates = this.containerLayoutCoordinates;
        if (coordinates == null) goto L9;
        boolean value$iv = coordinates.isAttached();
        if (value$iv == true) goto L8;
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
    L8:
        return coordinates;
    L9:
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
        throw new KotlinNothingValueException();
    }

    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long selectableId, Selection previousSelection) {
        MutableLongObjectMap subselections = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> r2 = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Object initial$iv = null;
        int $i$f$fastFold = 0;
        Selection newSelection = null;
        int index$iv$iv = 0;
        int r9 = r2.size();
    L3:
        if (index$iv$iv >= r9) goto L14;
        Object item$iv$iv = r2.get(index$iv$iv);
        Selectable selectable = (Selectable) item$iv$iv;
        Selection mergedSelection = newSelection;
        if (selectable.getSelectableId() != selectableId) goto L7;
        Selection r16 = selectable.getSelectAllSelection();
    L8:
        Selection selection = r16;
        if (selection == null) goto L12;
        subselections.set(selectable.getSelectableId(), selection);
    L12:
        newSelection = SelectionManagerKt.merge(mergedSelection, selection);
        index$iv$iv = index$iv$iv + 1;
        r2 = r2;
        initial$iv = initial$iv;
        $i$f$fastFold = $i$f$fastFold;
        goto L3
    L7:
        r16 = null;
        goto L8
    L14:
        if (isInTouchMode() == false) goto L22;
        if (Intrinsics.areEqual(newSelection, previousSelection) == true) goto L22;
        HapticFeedback r3 = this.hapticFeedBack;
        if (r3 == null) goto L22;
        r3.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
    L22:
        return new Pair(newSelection, subselections);
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        SelectionManager r0 = this;
        List<Selectable> r1 = r0.selectionRegistrar.sort(r0.requireContainerCoordinates$foundation_release());
        boolean r3 = true;
        if (r1.isEmpty() == false) goto L5;
        return true;
    L5:
        int $i$f$fastAll = 0;
        int index$iv$iv = 0;
        int r8 = r1.size();
    L6:
        if (index$iv$iv >= r8) goto L24;
        Object item$iv$iv = r1.get(index$iv$iv);
        Selectable it = (Selectable) item$iv$iv;
        AnnotatedString text = it.getText();
        if (text.length() != 0) goto L10;
        boolean r15 = r3;
    L11:
        if (r15 == false) goto L13;
        List<Selectable> r18 = r1;
        int $i$f$fastAll2 = $i$f$fastAll;
    L20:
        if (r3 == false) goto L27;
        index$iv$iv = index$iv$iv + 1;
        r3 = true;
        r0 = this;
        $i$f$fastAll = $i$f$fastAll2;
        r1 = r18;
        goto L6
    L27:
        return false;
    L13:
        $i$f$fastAll2 = $i$f$fastAll;
        Selection subSelection = r0.selectionRegistrar.getSubselections().get(it.getSelectableId());
        if (subSelection != null) goto L16;
        r18 = r1;
        r3 = false;
        goto L20
    L16:
        int selectionStart = subSelection.getStart().getOffset();
        int selectionEnd = subSelection.getEnd().getOffset();
        r18 = r1;
        if (Math.abs(selectionStart - selectionEnd) != text.length()) goto L19;
        r3 = true;
        goto L20
    L19:
        r3 = false;
        goto L20
    L10:
        r15 = false;
        goto L11
    L24:
        return true;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> r1 = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (r1.isEmpty() == false) goto L5;
        return;
    L5:
        Selection r2 = null;
        Selection r3 = null;
        MutableLongObjectMap newSubSelections = LongObjectMapKt.mutableLongObjectMapOf();
        int index$iv = 0;
        int r10 = r1.size();
    L6:
        if (index$iv >= r10) goto L15;
        Object item$iv = r1.get(index$iv);
        Selectable selectable = (Selectable) item$iv;
        Selection subSelection = selectable.getSelectAllSelection();
        if (subSelection == null) goto L13;
        if (r2 != null) goto L12;
        r2 = subSelection;
    L12:
        r3 = subSelection;
        newSubSelections.put(selectable.getSelectableId(), subSelection);
        r2 = r2;
    L13:
        index$iv = index$iv + 1;
        r1 = r1;
        goto L6
    L15:
        if (newSubSelections.isEmpty() == false) goto L17;
        return;
    L17:
        if (r2 != r3) goto L19;
        Selection newSelection = r2;
    L20:
        this.selectionRegistrar.setSubselections(newSubSelections);
        this.onSelectionChange.invoke(newSelection);
        this.previousSelectionLayout = null;
        return;
    L19:
        Intrinsics.checkNotNull(r2);
        Selection.AnchorInfo r5 = r2.getStart();
        Intrinsics.checkNotNull(r3);
        newSelection = new Selection(r5, r3.getEnd(), false);
        goto L20
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection != null) goto L7;
        return true;
    L7:
        return Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection != null) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(selection.getStart(), selection.getEnd()) == false) goto L9;
        return false;
    L9:
        if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) goto L11;
        return true;
    L11:
        List<Selectable> r3 = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int index$iv$iv = 0;
        int r9 = r3.size();
    L12:
        if (index$iv$iv >= r9) goto L25;
        Object item$iv$iv = r3.get(index$iv$iv);
        Selectable selectable = (Selectable) item$iv$iv;
        List<Selectable> r16 = r3;
        Selection $this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414 = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
        if ($this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414 != null) goto L16;
        boolean r2 = false;
    L21:
        if (r2 == true) goto L22;
        index$iv$iv = index$iv$iv + 1;
        r3 = r16;
        goto L12
    L22:
        return true;
    L16:
        if ($this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414.getStart().getOffset() == $this$isNonEmptySelection_u24lambda_u2415_u24lambda_u2414.getEnd().getOffset()) goto L18;
        r2 = true;
        goto L21
    L18:
        r2 = false;
        goto L21
    L25:
        return false;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        SelectionManager r0 = this;
        if (r0.getSelection() != null) goto L5;
    L19:
        return null;
    L5:
        if (r0.selectionRegistrar.getSubselections().isEmpty() == true) goto L19;
        AnnotatedString.Builder $this$getSelectedText_u24lambda_u2418 = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> r5 = r0.selectionRegistrar.sort(r0.requireContainerCoordinates$foundation_release());
        int index$iv = 0;
        int r8 = r5.size();
    L8:
        if (index$iv >= r8) goto L18;
        Object item$iv = r5.get(index$iv);
        Selectable selectable = (Selectable) item$iv;
        Selection subSelection = r0.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
        if (subSelection == null) goto L16;
        AnnotatedString currentText = selectable.getText();
        if (subSelection.getHandlesCrossed() == false) goto L14;
        AnnotatedString currentSelectedText = currentText.subSequence(subSelection.getEnd().getOffset(), subSelection.getStart().getOffset());
    L15:
        $this$getSelectedText_u24lambda_u2418.append(currentSelectedText);
        goto L16
    L14:
        currentSelectedText = currentText.subSequence(subSelection.getStart().getOffset(), subSelection.getEnd().getOffset());
    L16:
        index$iv = index$iv + 1;
        r0 = this;
        goto L8
    L18:
        return $this$getSelectedText_u24lambda_u2418.toAnnotatedString();
    }

    public final void copy$foundation_release() {
        AnnotatedString textToCopy = getSelectedText$foundation_release();
        if (textToCopy != null) goto L5;
        return;
    L5:
        if (textToCopy.length() <= 0) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == true) goto L11;
        textToCopy = null;
    L11:
        if (textToCopy == null) goto L19;
        Function1<? super AnnotatedString, Unit> r2 = this.onCopyHandler;
        if (r2 == null) goto L16;
        r2.invoke(textToCopy);
        return;
    L16:
        return;
    L19:
        return;
    L7:
        r3 = false;
        goto L8
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation_release(boolean value) {
        this.showToolbar = value;
        updateSelectionToolbar();
    }

    private final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    private final void updateSelectionToolbar() {
        if (getHasFocus() == true) goto L5;
        return;
    L5:
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) goto L9;
        return;
    L9:
        if (this.showToolbar == false) goto L25;
        if (isInTouchMode() == false) goto L25;
        Rect rect = getContentRect();
        if (rect != null) goto L15;
        return;
    L15:
        C04102 r3 = null;
        if (isNonEmptySelection$foundation_release() == false) goto L18;
        C04091 r0 = new C04091(this);
    L19:
        C04091 r1 = r0;
        if (isEntireContainerSelected$foundation_release() == true) goto L23;
        r3 = new C04102(this);
    L23:
        TextToolbar.showMenu$default(textToolbar, rect, r1, null, null, r3, null, 12, null);
        return;
    L18:
        r0 = null;
    L25:
        if (textToolbar.getStatus() != TextToolbarStatus.Shown) goto L29;
        textToolbar.hide();
        return;
    }

    private final Rect getContentRect() {
        Rect r2 = null;
        if (getSelection() != null) goto L5;
        return null;
    L5:
        LayoutCoordinates containerCoordinates = this.containerLayoutCoordinates;
        if (containerCoordinates != null) goto L9;
        return null;
    L9:
        if (containerCoordinates.isAttached() == true) goto L11;
        return null;
    L11:
        List<Selectable> r3 = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList target$iv = new ArrayList(r3.size());
        int index$iv$iv = 0;
        int r9 = r3.size();
    L12:
        if (index$iv$iv >= r9) goto L21;
        Object item$iv$iv = r3.get(index$iv$iv);
        Selectable selectable = (Selectable) item$iv$iv;
        Rect r16 = r2;
        List<Selectable> r17 = r3;
        Selection it = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
        if (it == null) goto L16;
        Object it$iv = TuplesKt.to(selectable, it);
    L18:
        if (it$iv == null) goto L20;
        target$iv.add(it$iv);
    L20:
        index$iv$iv = index$iv$iv + 1;
        r2 = r16;
        r3 = r17;
        goto L12
    L16:
        it$iv = r16;
        goto L18
    L21:
        Rect r18 = r2;
        List selectableSubSelections = SelectionManagerKt.access$firstAndLast(target$iv);
        if (selectableSubSelections.isEmpty() == false) goto L24;
        return r18;
    L24:
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(selectableSubSelections, containerCoordinates);
        if (Intrinsics.areEqual(selectedRegionRect, SelectionManagerKt.access$getInvertedInfiniteRect$p()) == false) goto L27;
        return r18;
    L27:
        Rect visibleRect = SelectionManagerKt.visibleBounds(containerCoordinates).intersect(selectedRegionRect);
        if ((visibleRect.getRight() - visibleRect.getLeft()) >= 0.0f) goto L30;
    L34:
        return r18;
    L30:
        if ((visibleRect.getBottom() - visibleRect.getTop()) < 0.0f) goto L34;
        Rect rootRect = visibleRect.m4162translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(containerCoordinates));
        return Rect.copy$default(rootRect, 0.0f, 0.0f, 0.0f, rootRect.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4.0f), 7, null);
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() == null) goto L10;
        this.onSelectionChange.invoke(null);
        if (isInTouchMode() == false) goto L11;
        HapticFeedback r0 = this.hapticFeedBack;
        if (r0 == null) goto L12;
        r0.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
        return;
    L12:
        return;
    L11:
        return;
    }

    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new C04071(isStartHandle, this);
    }

    private final Modifier onClearSelectionRequested(Modifier $this$onClearSelectionRequested, final Function0<Unit> r4) {
        return SuspendingPointerInputFilterKt.pointerInput($this$onClearSelectionRequested, Unit.INSTANCE, new C04081(this, r4));
    }

    /* JADX INFO: renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    private final long m1463convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates coordinates = this.containerLayoutCoordinates;
        if (coordinates == null) goto L10;
        if (coordinates.isAttached() == false) goto L10;
        return requireContainerCoordinates$foundation_release().mo5723localPositionOfR5De75A(layoutCoordinates, offset);
    L10:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: startSelection-9KIMszo, reason: not valid java name */
    private final void m1470startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        m1477updateSelectionjyLRC_s$foundation_release(position, Offset.Companion.m4140getUnspecifiedF1C5BW0(), isStartHandle, adjustment);
    }

    /* JADX INFO: renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m1478updateSelectionqNKwrvQ$foundation_release(Offset newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        if (newPosition != null) goto L6;
        return false;
    L6:
        return m1477updateSelectionjyLRC_s$foundation_release(newPosition.m4135unboximpl(), previousPosition, isStartHandle, adjustment);
    }

    /* JADX INFO: renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m1477updateSelectionjyLRC_s$foundation_release(long position, long previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        if (isStartHandle == false) goto L4;
        Handle r0 = Handle.SelectionStart;
    L5:
        setDraggingHandle(r0);
        m1465setCurrentDragPosition_kEHs6E(Offset.m4114boximpl(position));
        SelectionLayout selectionLayout = m1464getSelectionLayoutWko1d7g(position, previousHandlePosition, isStartHandle);
        if (selectionLayout != null) goto L9;
        return false;
    L9:
        if (selectionLayout.shouldRecomputeSelection(this.previousSelectionLayout) == true) goto L11;
        return false;
    L11:
        Selection newSelection = adjustment.adjust(selectionLayout);
        if (Intrinsics.areEqual(newSelection, getSelection()) == true) goto L14;
        selectionChanged(selectionLayout, newSelection);
    L14:
        this.previousSelectionLayout = selectionLayout;
        return true;
    L4:
        r0 = Handle.SelectionEnd;
        goto L5
    }

    /* JADX INFO: renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m1464getSelectionLayoutWko1d7g(long position, long previousHandlePosition, boolean isStartHandle) {
        LayoutCoordinates containerCoordinates = requireContainerCoordinates$foundation_release();
        List<Selectable> r10 = this.selectionRegistrar.sort(containerCoordinates);
        final MutableLongIntMap idToIndexMap = LongIntMapKt.mutableLongIntMapOf();
        int index$iv = 0;
        int r3 = r10.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = r10.get(index$iv);
        Selectable selectable = (Selectable) item$iv;
        int index = index$iv;
        idToIndexMap.set(selectable.getSelectableId(), index);
        index$iv = index$iv + 1;
        goto L3
    L5:
        Comparator selectableIdOrderingComparator = new SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1(idToIndexMap);
        if ((9223372034707292159L & previousHandlePosition) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L8;
        boolean r4 = true;
    L9:
        if (r4 == false) goto L11;
        Selection r0 = null;
    L12:
        Selection previousSelection = r0;
        SelectionLayoutBuilder builder = new SelectionLayoutBuilder(position, previousHandlePosition, containerCoordinates, isStartHandle, previousSelection, selectableIdOrderingComparator, null);
        int index$iv2 = 0;
        int r5 = r10.size();
    L13:
        if (index$iv2 >= r5) goto L16;
        Object item$iv2 = r10.get(index$iv2);
        Selectable it = (Selectable) item$iv2;
        it.appendSelectableInfoToBuilder(builder);
        index$iv2 = index$iv2 + 1;
        goto L13
    L16:
        return builder.build();
    L11:
        r0 = getSelection();
        goto L12
    L8:
        r4 = false;
        goto L9
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection newSelection) {
        if (shouldPerformHaptics$foundation_release() == false) goto L7;
        HapticFeedback r0 = this.hapticFeedBack;
        if (r0 == null) goto L7;
        r0.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
    L7:
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    public final boolean shouldPerformHaptics$foundation_release() {
        if (isInTouchMode() == false) goto L20;
        List<Selectable> r0 = this.selectionRegistrar.getSelectables$foundation_release();
        int index$iv$iv = 0;
        int r6 = r0.size();
    L6:
        if (index$iv$iv >= r6) goto L14;
        Object item$iv$iv = r0.get(index$iv$iv);
        Selectable it = (Selectable) item$iv$iv;
        if (it.getText().length() <= 0) goto L10;
        boolean r13 = true;
    L11:
        if (r13 == true) goto L12;
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L12:
        boolean r1 = true;
    L15:
        if (r1 == true) goto L17;
        return false;
    L17:
        return true;
    L10:
        r13 = false;
        goto L11
    L14:
        r1 = false;
        goto L15
    L20:
        return false;
    }

    /* JADX INFO: renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m1476selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        LayoutCoordinates containerCoordinates = this.containerLayoutCoordinates;
        if (containerCoordinates != null) goto L6;
        return;
    L6:
        if (containerCoordinates.isAttached() == true) goto L8;
        return;
    L8:
        List<Selectable> r4 = this.selectionRegistrar.getSelectables$foundation_release();
        int $i$f$fastAny = 0;
        int index$iv$iv = 0;
        int r9 = r4.size();
    L9:
        if (index$iv$iv >= r9) goto L23;
        Object item$iv$iv = r4.get(index$iv$iv);
        Selectable selectable = (Selectable) item$iv$iv;
        List<Selectable> r17 = r4;
        int $i$f$fastAny2 = $i$f$fastAny;
        Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
        if (selection != null) goto L13;
        boolean r11 = false;
    L20:
        if (r11 == true) goto L21;
        index$iv$iv = index$iv$iv + 1;
        r4 = r17;
        $i$f$fastAny = $i$f$fastAny2;
        containerCoordinates = containerCoordinates;
        goto L9
    L21:
        boolean isClickedPositionInsideSelection = true;
    L25:
        if (isClickedPositionInsideSelection == true) goto L30;
        m1470startSelection9KIMszo(position, true, SelectionAdjustment.Companion.getWord());
        return;
    L30:
        return;
    L13:
        LayoutCoordinates selectableLayoutCoords = selectable.getLayoutCoordinates();
        if (selectableLayoutCoords != null) goto L16;
        r11 = false;
        goto L20
    L16:
        long positionInSelectable = selectableLayoutCoords.mo5723localPositionOfR5De75A(containerCoordinates, position);
        TextLayoutResult textLayoutResult = selectable.textLayoutResult();
        if (textLayoutResult != null) goto L19;
        r11 = false;
        goto L20
    L19:
        r11 = TextLayoutHelperKt.m1162isPositionInsideSelectionuaM50fQ(textLayoutResult, positionInSelectable, TextRange.m6405boximpl(selection.m1439toTextRanged9O1mEE()));
        goto L20
    L23:
        isClickedPositionInsideSelection = false;
        goto L25
    }
}
