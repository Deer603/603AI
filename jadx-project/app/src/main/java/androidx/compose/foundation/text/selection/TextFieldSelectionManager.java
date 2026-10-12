package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010|\u001a\u00020LH\u0000¢\u0006\u0002\b}J\r\u0010~\u001a\u00020LH\u0000¢\u0006\u0002\b\u007fJ\u001d\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\b\u0002\u0010\u0082\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u0083\u0001J(\u0010\u0084\u0001\u001a\u00020I2\u0007\u0010\u0085\u0001\u001a\u00020k2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020gH\u0000¢\u0006\u0003\b\u008b\u0001J\u0012\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\b\u008d\u0001J\u001f\u0010\u008e\u0001\u001a\u00020L2\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0012H\u0000ø\u0001\u0000¢\u0006\u0003\b\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020L2\t\b\u0002\u0010\u0092\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u0093\u0001J\u000f\u0010\u0094\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u0095\u0001J\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\"\u0010\u0098\u0001\u001a\u00020\u00122\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0019\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b \u0001J!\u0010¡\u0001\u001a\u00020\u00122\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0018\u0010¤\u0001\u001a\u00020g2\u0007\u0010\u009f\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b¥\u0001J\u000f\u0010¦\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b§\u0001J\u000f\u0010¨\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b©\u0001J\u0012\u0010ª\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u00ad\u0001J\u001c\u0010®\u0001\u001a\u00020L2\u0007\u0010\u008f\u0001\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010±\u0001\u001a\u00020L2\b\u0010²\u0001\u001a\u00030\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010°\u0001J\u0013\u0010´\u0001\u001a\u00020L2\b\u0010µ\u0001\u001a\u00030¶\u0001H\u0002J\u001f\u0010·\u0001\u001a\u00020L2\b\u0010²\u0001\u001a\u00030\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¸\u0001\u0010°\u0001J\u0012\u0010¹\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\bº\u0001J\u0012\u0010»\u0001\u001a\u00020L2\u0007\u0010¼\u0001\u001a\u00020'H\u0002JL\u0010½\u0001\u001a\u00030\u0087\u00012\u0006\u0010p\u001a\u00020I2\u0007\u0010¾\u0001\u001a\u00020\u00122\u0007\u0010¿\u0001\u001a\u00020'2\u0007\u0010\u009f\u0001\u001a\u00020'2\b\u0010À\u0001\u001a\u00030Á\u00012\u0007\u0010Â\u0001\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R5\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001eR/\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0011\u001a\u0004\u0018\u00010 8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010.\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0019\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020L0KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010T\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010UX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020gX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0016\u0010j\u001a\u0004\u0018\u00010k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR+\u0010p\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020I8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\u0019\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010v\u001a\u00020wX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard$foundation_release", "()Landroidx/compose/ui/platform/Clipboard;", "setClipboard$foundation_release", "(Landroidx/compose/ui/platform/Clipboard;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$foundation_release", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$foundation_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "enabled", "getEnabled", "setEnabled", "enabled$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "previousRawDragOffset", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "requestAutofillAction", "Lkotlin/Function0;", "getRequestAutofillAction$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setRequestAutofillAction$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "transformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "autofill", "autofill$foundation_release", "clearPreviewHighlight", "clearPreviewHighlight$foundation_release", "copy", "Lkotlinx/coroutines/Job;", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "position", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "showFloatingToolbar", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandleLineHeight", "", "isStartHandle", "getHandleLineHeight$foundation_release", "getHandlePosition", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "selectWordAtPositionIfNotAlreadySelected", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "(J)V", "setDeletionPreviewHighlight", "range", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "setSelectionPreviewHighlight", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateFloatingToolbar", "show", "updateSelection", "currentPosition", "isStartOfSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "isTouchBasedSelection", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSelectionManager {
    public static final int $stable = 0;
    private Clipboard clipboard;
    private CoroutineScope coroutineScope;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private final MutableState enabled$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private Function0<Unit> requestAutofillAction;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        this.value$delegate = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(null, 0, null, 7, null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        this.editable$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.enabled$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.dragBeginPosition = Offset.Companion.m4141getZeroF1C5BW0();
        this.dragTotalDistance = Offset.Companion.m4141getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue(null, 0, null, 7, null);
        this.touchSelectionObserver = new TextFieldSelectionManager$touchSelectionObserver$1(this);
        this.mouseSelectionObserver = new TextFieldSelectionManager$mouseSelectionObserver$1(this);
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    /* JADX INFO: renamed from: access$createTextFieldValue-FDrldGo, reason: not valid java name */
    public static final /* synthetic */ TextFieldValue m1494access$createTextFieldValueFDrldGo(TextFieldSelectionManager $this, AnnotatedString annotatedString, long selection) {
        return $this.m1497createTextFieldValueFDrldGo(annotatedString, selection);
    }

    public static final /* synthetic */ Rect access$getContentRect(TextFieldSelectionManager $this) {
        return $this.getContentRect();
    }

    public static final /* synthetic */ Integer access$getDragBeginOffsetInText$p(TextFieldSelectionManager $this) {
        return $this.dragBeginOffsetInText;
    }

    public static final /* synthetic */ long access$getDragBeginPosition$p(TextFieldSelectionManager $this) {
        return $this.dragBeginPosition;
    }

    public static final /* synthetic */ long access$getDragTotalDistance$p(TextFieldSelectionManager $this) {
        return $this.dragTotalDistance;
    }

    /* JADX INFO: renamed from: access$setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public static final /* synthetic */ void m1495access$setCurrentDragPosition_kEHs6E(TextFieldSelectionManager $this, Offset r1) {
        $this.m1499setCurrentDragPosition_kEHs6E(r1);
    }

    public static final /* synthetic */ void access$setDragBeginOffsetInText$p(TextFieldSelectionManager $this, Integer r1) {
        $this.dragBeginOffsetInText = r1;
    }

    public static final /* synthetic */ void access$setDragBeginPosition$p(TextFieldSelectionManager $this, long r1) {
        $this.dragBeginPosition = r1;
    }

    public static final /* synthetic */ void access$setDragTotalDistance$p(TextFieldSelectionManager $this, long r1) {
        $this.dragTotalDistance = r1;
    }

    public static final /* synthetic */ void access$setDraggingHandle(TextFieldSelectionManager $this, Handle r1) {
        $this.setDraggingHandle(r1);
    }

    public static final /* synthetic */ void access$setHandleState(TextFieldSelectionManager $this, HandleState handleState) {
        $this.setHandleState(handleState);
    }

    public static final /* synthetic */ void access$setPreviousRawDragOffset$p(TextFieldSelectionManager $this, int r1) {
        $this.previousRawDragOffset = r1;
    }

    public static final /* synthetic */ void access$updateFloatingToolbar(TextFieldSelectionManager $this, boolean show) {
        $this.updateFloatingToolbar(show);
    }

    /* JADX INFO: renamed from: access$updateSelection-8UEBfa8, reason: not valid java name */
    public static final /* synthetic */ long m1496access$updateSelection8UEBfa8(TextFieldSelectionManager $this, TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        return $this.m1500updateSelection8UEBfa8(value, currentPosition, isStartOfSelection, isStartHandle, adjustment, isTouchBasedSelection);
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping r1) {
        this.offsetMapping = r1;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> r1) {
        this.onValueChange = r1;
    }

    public final LegacyTextFieldState getState$foundation_release() {
        return this.state;
    }

    public final void setState$foundation_release(LegacyTextFieldState r1) {
        this.state = r1;
    }

    public final TextFieldValue getValue$foundation_release() {
        State $this$getValue$iv = this.value$delegate;
        return (TextFieldValue) $this$getValue$iv.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue r4) {
        MutableState $this$setValue$iv = this.value$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L7;
        TextDelegate r1 = r0.getTextDelegate();
        if (r1 == null) goto L7;
        return r1.getText();
    L7:
        return null;
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation r1) {
        this.visualTransformation = r1;
    }

    public final Function0<Unit> getRequestAutofillAction$foundation_release() {
        return this.requestAutofillAction;
    }

    public final void setRequestAutofillAction$foundation_release(Function0<Unit> r1) {
        this.requestAutofillAction = r1;
    }

    public final Clipboard getClipboard$foundation_release() {
        return this.clipboard;
    }

    public final void setClipboard$foundation_release(Clipboard r1) {
        this.clipboard = r1;
    }

    public final CoroutineScope getCoroutineScope$foundation_release() {
        return this.coroutineScope;
    }

    public final void setCoroutineScope$foundation_release(CoroutineScope r1) {
        this.coroutineScope = r1;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar r1) {
        this.textToolbar = r1;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback r1) {
        this.hapticFeedBack = r1;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester r1) {
        this.focusRequester = r1;
    }

    public final boolean getEditable() {
        State $this$getValue$iv = this.editable$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setEditable(boolean r5) {
        MutableState $this$setValue$iv = this.editable$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getEnabled() {
        State $this$getValue$iv = this.enabled$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setEnabled(boolean r5) {
        MutableState $this$setValue$iv = this.enabled$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final void setDraggingHandle(Handle r4) {
        MutableState $this$setValue$iv = this.draggingHandle$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Handle getDraggingHandle() {
        State $this$getValue$iv = this.draggingHandle$delegate;
        return (Handle) $this$getValue$iv.getValue();
    }

    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    private final void m1499setCurrentDragPosition_kEHs6E(Offset r4) {
        MutableState $this$setValue$iv = this.currentDragPosition$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1502getCurrentDragPosition_m7T9E() {
        State $this$getValue$iv = this.currentDragPosition$delegate;
        return (Offset) $this$getValue$iv.getValue();
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextFieldSelectionManager$handleDragObserver$1(this, isStartHandle);
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextFieldSelectionManager$cursorDragObserver$1(this);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.enterSelectionMode$foundation_release(r1);
    }

    public final void enterSelectionMode$foundation_release(boolean showFloatingToolbar) {
        LegacyTextFieldState r0 = this.state;
        if (r0 != null) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == false) goto L12;
        FocusRequester r2 = this.focusRequester;
        if (r2 == null) goto L12;
        FocusRequester.m4036requestFocus3ESFkO8$default(r2, 0, 1, null);
    L12:
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(showFloatingToolbar);
        setHandleState(HandleState.Selection);
        return;
    L5:
        if (r0.getHasFocus() == true) goto L7;
        r1 = true;
        goto L8
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1498deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager r0, Offset r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.m1501deselect_kEHs6E$foundation_release(r1);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1501deselect_kEHs6E$foundation_release(Offset position) {
        if (TextRange.m6411getCollapsedimpl(getValue$foundation_release().m6665getSelectiond9O1mEE()) == true) goto L15;
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L7;
        TextLayoutResultProxy r1 = r0.getLayoutResult();
    L8:
        TextLayoutResultProxy layoutResult = r1;
        if (position == null) goto L12;
        if (layoutResult == null) goto L12;
        int newCursorOffset = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1164getOffsetForPosition3MmeM6k$default(layoutResult, position.m4135unboximpl(), false, 2, null));
    L13:
        TextFieldValue newValue = TextFieldValue.m6660copy3r_uNRQ$default(getValue$foundation_release(), null, TextRangeKt.TextRange(newCursorOffset), null, 5, null);
        this.onValueChange.invoke(newValue);
    L12:
        newCursorOffset = TextRange.m6414getMaximpl(getValue$foundation_release().m6665getSelectiond9O1mEE());
        goto L13
    L7:
        r1 = null;
    L15:
        if (position != null) goto L17;
    L22:
        HandleState selectionMode = HandleState.None;
    L23:
        setHandleState(selectionMode);
        updateFloatingToolbar(false);
        return;
    L17:
        if (getValue$foundation_release().getText().length() <= 0) goto L19;
        boolean r2 = true;
    L20:
        if (r2 == false) goto L22;
        selectionMode = HandleState.Cursor;
        goto L23
    L19:
        r2 = false;
        goto L20
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1507setSelectionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L6;
        r0.m1075setSelectionPreviewHighlightRange5zctL8(range);
    L6:
        LegacyTextFieldState r1 = this.state;
        if (r1 == null) goto L11;
        r1.m1072setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m6422getZerod9O1mEE());
    L11:
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L14;
        exitSelectionMode$foundation_release();
        return;
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1506setDeletionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L6;
        r0.m1072setDeletionPreviewHighlightRange5zctL8(range);
    L6:
        LegacyTextFieldState r1 = this.state;
        if (r1 == null) goto L11;
        r1.m1075setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m6422getZerod9O1mEE());
    L11:
        if (TextRange.m6411getCollapsedimpl(range) == true) goto L14;
        exitSelectionMode$foundation_release();
        return;
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L6;
        r0.m1072setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m6422getZerod9O1mEE());
    L6:
        LegacyTextFieldState r1 = this.state;
        if (r1 == null) goto L11;
        r1.m1075setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m6422getZerod9O1mEE());
        return;
    }

    public static /* synthetic */ Job copy$foundation_release$default(TextFieldSelectionManager r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return r0.copy$foundation_release(r1);
    }

    public final Job copy$foundation_release(boolean cancelSelection) {
        CoroutineScope r0 = this.coroutineScope;
        if (r0 != null) goto L5;
        return null;
    L5:
        return BuildersKt.launch$default(r0, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1, null);
    }

    public final Job paste$foundation_release() {
        CoroutineScope r0 = this.coroutineScope;
        if (r0 != null) goto L5;
        return null;
    L5:
        return BuildersKt.launch$default(r0, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1, null);
    }

    public final Job cut$foundation_release() {
        CoroutineScope r0 = this.coroutineScope;
        if (r0 != null) goto L5;
        return null;
    L5:
        return BuildersKt.launch$default(r0, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1, null);
    }

    public final void selectAll$foundation_release() {
        TextFieldValue newValue = m1497createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(newValue);
        this.oldValue = TextFieldValue.m6660copy3r_uNRQ$default(this.oldValue, null, newValue.m6665getSelectiond9O1mEE(), null, 5, null);
        enterSelectionMode$foundation_release(true);
    }

    public final void autofill$foundation_release() {
        Function0<Unit> r0 = this.requestAutofillAction;
        if (r0 == null) goto L6;
        r0.invoke();
        return;
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1504getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L24;
        TextLayoutResultProxy r1 = r0.getLayoutResult();
        if (r1 == null) goto L24;
        TextLayoutResult textLayoutResult = r1.getValue();
        if (textLayoutResult == null) goto L24;
        AnnotatedString transformedText = getTransformedText$foundation_release();
        if (transformedText == null) goto L12;
        String layoutInputText = textLayoutResult.getLayoutInput().getText().getText();
        if (Intrinsics.areEqual(transformedText.getText(), layoutInputText) == false) goto L16;
        long r3 = getValue$foundation_release().m6665getSelectiond9O1mEE();
        if (isStartHandle == false) goto L20;
        int offset = TextRange.m6417getStartimpl(r3);
    L22:
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, this.offsetMapping.originalToTransformed(offset), isStartHandle, TextRange.m6416getReversedimpl(getValue$foundation_release().m6665getSelectiond9O1mEE()));
    L20:
        offset = TextRange.m6412getEndimpl(r3);
        goto L22
    L16:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L12:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L24:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    public final float getHandleLineHeight$foundation_release(boolean isStartHandle) {
        long r0 = getValue$foundation_release().m6665getSelectiond9O1mEE();
        if (isStartHandle == false) goto L5;
        int offset = TextRange.m6417getStartimpl(r0);
    L6:
        LegacyTextFieldState r1 = this.state;
        if (r1 == null) goto L14;
        TextLayoutResultProxy r2 = r1.getLayoutResult();
        if (r2 == null) goto L16;
        TextLayoutResult r3 = r2.getValue();
        if (r3 != null) goto L13;
        return 0.0f;
    L13:
        return TextLayoutHelperKt.getLineHeight(r3, offset);
    L16:
        return 0.0f;
    L14:
        return 0.0f;
    L5:
        offset = TextRange.m6412getEndimpl(r0);
        goto L6
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1503getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int offset = this.offsetMapping.originalToTransformed(TextRange.m6417getStartimpl(getValue$foundation_release().m6665getSelectiond9O1mEE()));
        LegacyTextFieldState r2 = this.state;
        if (r2 == null) goto L5;
        TextLayoutResultProxy r3 = r2.getLayoutResult();
    L6:
        Intrinsics.checkNotNull(r3);
        TextLayoutResult layoutResult = r3.getValue();
        Rect cursorRect = layoutResult.getCursorRect(RangesKt.coerceIn(offset, 0, layoutResult.getLayoutInput().getText().length()));
        float x = cursorRect.getLeft() + (density.mo376toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2.0f);
        float y$iv = cursorRect.getBottom();
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L5:
        r3 = null;
        goto L6
    }

    private final void updateFloatingToolbar(boolean show) {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L6;
        r0.setShowFloatingToolbar(show);
    L6:
        if (show == false) goto L8;
        showSelectionToolbar$foundation_release();
        return;
    L8:
        hideSelectionToolbar$foundation_release();
    }

    public final Job showSelectionToolbar$foundation_release() {
        CoroutineScope r0 = this.coroutineScope;
        if (r0 != null) goto L5;
        return null;
    L5:
        return BuildersKt.launch$default(r0, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1, null);
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar r0 = this.textToolbar;
        if (r0 == null) goto L5;
        TextToolbarStatus r1 = r0.getStatus();
    L7:
        if (r1 != TextToolbarStatus.Shown) goto L12;
        TextToolbar r2 = this.textToolbar;
        if (r2 == null) goto L13;
        r2.hide();
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L7
    }

    /* JADX INFO: renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m1505selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        LegacyTextFieldState r0 = this.state;
        if (r0 == null) goto L13;
        TextLayoutResultProxy layoutResult = r0.getLayoutResult();
        if (layoutResult == null) goto L15;
        boolean isClickedPositionInsideSelection = TextLayoutHelperKt.m1162isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m1167translateDecorationToInnerCoordinatesMKHz9U$foundation_release(position), TextRange.m6405boximpl(getValue$foundation_release().m6665getSelectiond9O1mEE()));
        if (isClickedPositionInsideSelection == true) goto L11;
        m1500updateSelection8UEBfa8(getValue$foundation_release(), position, true, false, SelectionAdjustment.Companion.getWord(), false);
        return;
    L11:
        return;
    L15:
        return;
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        LegacyTextFieldState it = this.state;
        if (it == null) goto L56;
        if (it.isLayoutResultStale() == false) goto L8;
        it = null;
    L8:
        if (it == null) goto L56;
        int transformedStart = this.offsetMapping.originalToTransformed(TextRange.m6417getStartimpl(getValue$foundation_release().m6665getSelectiond9O1mEE()));
        int transformedEnd = this.offsetMapping.originalToTransformed(TextRange.m6412getEndimpl(getValue$foundation_release().m6665getSelectiond9O1mEE()));
        LegacyTextFieldState r5 = this.state;
        if (r5 == null) goto L14;
        LayoutCoordinates r6 = r5.getLayoutCoordinates();
        if (r6 == null) goto L14;
        long startOffset = r6.mo5725localToRootMKHz9U(m1504getHandlePositiontuRUvjQ$foundation_release(true));
    L15:
        LegacyTextFieldState r7 = this.state;
        if (r7 == null) goto L20;
        LayoutCoordinates r8 = r7.getLayoutCoordinates();
        if (r8 == null) goto L20;
        long endOffset = r8.mo5725localToRootMKHz9U(m1504getHandlePositiontuRUvjQ$foundation_release(false));
    L21:
        LegacyTextFieldState r9 = this.state;
        float x$iv = 0.0f;
        if (r9 == null) goto L35;
        LayoutCoordinates r10 = r9.getLayoutCoordinates();
        if (r10 == null) goto L34;
        TextLayoutResultProxy r14 = it.getLayoutResult();
        if (r14 == null) goto L32;
        TextLayoutResult r15 = r14.getValue();
        if (r15 == null) goto L32;
        Rect r16 = r15.getCursorRect(transformedStart);
        if (r16 == null) goto L32;
        float y$iv = r16.getTop();
    L33:
        long r18 = 4294967295L;
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        char r20 = ' ';
        x$iv = 0.0f;
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long value$iv$iv = r10.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        int bits$iv$iv$iv = (int) (value$iv$iv & 4294967295L);
        float startTop = Float.intBitsToFloat(bits$iv$iv$iv);
    L37:
        LegacyTextFieldState r11 = this.state;
        if (r11 == null) goto L53;
        LayoutCoordinates r12 = r11.getLayoutCoordinates();
        if (r12 == null) goto L53;
        TextLayoutResultProxy r13 = it.getLayoutResult();
        if (r13 == null) goto L48;
        TextLayoutResult r17 = r13.getValue();
        if (r17 == null) goto L48;
        Rect r19 = r17.getCursorRect(transformedEnd);
        if (r19 == null) goto L48;
        float y$iv2 = r19.getTop();
    L49:
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long value$iv$iv2 = r12.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv2 << r20) | (v2$iv$iv2 & r18)));
        int bits$iv$iv$iv2 = (int) (value$iv$iv2 & r18);
        x$iv = Float.intBitsToFloat(bits$iv$iv$iv2);
    L48:
        y$iv2 = x$iv;
    L53:
        float endTop = x$iv;
        long value$iv$iv3 = startOffset;
        int bits$iv$iv$iv3 = (int) (value$iv$iv3 >> r20);
        long value$iv$iv4 = endOffset;
        int bits$iv$iv$iv4 = (int) (value$iv$iv4 >> r20);
        float left = Math.min(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
        long value$iv$iv5 = startOffset;
        int bits$iv$iv$iv5 = (int) (value$iv$iv5 >> r20);
        long value$iv$iv6 = endOffset;
        int bits$iv$iv$iv6 = (int) (value$iv$iv6 >> r20);
        float right = Math.max(Float.intBitsToFloat(bits$iv$iv$iv5), Float.intBitsToFloat(bits$iv$iv$iv6));
        float top = Math.min(startTop, endTop);
        long value$iv$iv7 = startOffset;
        int bits$iv$iv$iv7 = (int) (value$iv$iv7 & r18);
        long value$iv$iv8 = endOffset;
        int bits$iv$iv$iv8 = (int) (value$iv$iv8 & r18);
        float bottom = Math.max(Float.intBitsToFloat(bits$iv$iv$iv7), Float.intBitsToFloat(bits$iv$iv$iv8)) + (Dp.m6973constructorimpl(25) * it.getTextDelegate().getDensity().getDensity());
        return new Rect(left, top, right, bottom);
    L32:
        y$iv = 0.0f;
        goto L33
    L34:
        r18 = 4294967295L;
        r20 = ' ';
    L36:
        startTop = x$iv;
        goto L37
    L35:
        r18 = 4294967295L;
        r20 = ' ';
    L20:
        endOffset = Offset.Companion.m4141getZeroF1C5BW0();
    L14:
        startOffset = Offset.Companion.m4141getZeroF1C5BW0();
    L56:
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    private final long m1500updateSelection8UEBfa8(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        LegacyTextFieldState r2 = this.state;
        if (r2 == null) goto L100;
        TextLayoutResultProxy layoutResult = r2.getLayoutResult();
        if (layoutResult == null) goto L100;
        long previousTransformedSelection = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m6417getStartimpl(value.m6665getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m6412getEndimpl(value.m6665getSelectiond9O1mEE())));
        int currentOffset = layoutResult.m1165getOffsetForPosition3MmeM6k(currentPosition, false);
        if (isStartHandle == true) goto L12;
        if (isStartOfSelection == true) goto L12;
        int rawStartHandleOffset = TextRange.m6417getStartimpl(previousTransformedSelection);
    L14:
        if (isStartHandle == false) goto L18;
        if (isStartOfSelection == true) goto L18;
        int rawEndHandleOffset = TextRange.m6412getEndimpl(previousTransformedSelection);
    L19:
        SelectionLayout previousSelectionLayout = this.previousSelectionLayout;
        if (isStartOfSelection == true) goto L26;
        if (previousSelectionLayout == null) goto L26;
        if (this.previousRawDragOffset == (-1)) goto L26;
        int rawPreviousHandleOffset = this.previousRawDragOffset;
    L27:
        SelectionLayout selectionLayout = SelectionLayoutKt.m1450getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, previousTransformedSelection, isStartOfSelection, isStartHandle);
        if (selectionLayout.shouldRecomputeSelection(previousSelectionLayout) == false) goto L30;
        this.previousSelectionLayout = selectionLayout;
        this.previousRawDragOffset = currentOffset;
        Selection newTransformedSelection = adjustment.adjust(selectionLayout);
        long newSelection = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(newTransformedSelection.getStart().getOffset()), this.offsetMapping.transformedToOriginal(newTransformedSelection.getEnd().getOffset()));
        if (TextRange.m6410equalsimpl0(newSelection, value.m6665getSelectiond9O1mEE()) == false) goto L36;
        return value.m6665getSelectiond9O1mEE();
    L36:
        if (TextRange.m6416getReversedimpl(newSelection) == TextRange.m6416getReversedimpl(value.m6665getSelectiond9O1mEE())) goto L40;
        boolean r22 = true;
        if (TextRange.m6410equalsimpl0(TextRangeKt.TextRange(TextRange.m6412getEndimpl(newSelection), TextRange.m6417getStartimpl(newSelection)), value.m6665getSelectiond9O1mEE()) == false) goto L41;
        boolean onlyChangeIsReversed = true;
    L43:
        if (TextRange.m6411getCollapsedimpl(newSelection) == true) goto L45;
    L47:
        boolean bothSelectionsCollapsed = false;
    L49:
        if (isTouchBasedSelection == true) goto L51;
    L60:
        TextFieldValue newValue = m1497createTextFieldValueFDrldGo(value.getAnnotatedString(), newSelection);
        this.onValueChange.invoke(newValue);
        if (isTouchBasedSelection == true) goto L63;
        updateFloatingToolbar(!TextRange.m6411getCollapsedimpl(newSelection));
    L63:
        LegacyTextFieldState r7 = this.state;
        if (r7 == null) goto L67;
        r7.setInTouchMode(isTouchBasedSelection);
    L67:
        LegacyTextFieldState r8 = this.state;
        if (r8 != null) goto L71;
    L77:
        LegacyTextFieldState r1 = this.state;
        if (r1 != null) goto L81;
    L87:
        LegacyTextFieldState r3 = this.state;
        if (r3 != null) goto L91;
    L97:
        return newSelection;
    L91:
        if (TextRange.m6411getCollapsedimpl(newSelection) == false) goto L95;
        boolean r9 = true;
        if (TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true) == false) goto L95;
    L96:
        r3.setShowCursorHandle(r9);
    L95:
        r9 = false;
        goto L96
    L81:
        if (TextRange.m6411getCollapsedimpl(newSelection) == true) goto L85;
        boolean r10 = false;
        if (TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false) == false) goto L86;
        r10 = true;
    L86:
        r1.setShowSelectionHandleEnd(r10);
        goto L87
    L85:
        r10 = false;
        goto L86
    L71:
        if (TextRange.m6411getCollapsedimpl(newSelection) == false) goto L73;
    L75:
        boolean r4 = false;
    L76:
        r8.setShowSelectionHandleStart(r4);
        goto L77
    L73:
        if (TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, r22) == false) goto L75;
        r4 = true;
        goto L76
    L51:
        if (value.getText().length() <= 0) goto L53;
        boolean r6 = r22;
    L54:
        if (r6 == false) goto L60;
        if (onlyChangeIsReversed == true) goto L60;
        if (bothSelectionsCollapsed == true) goto L60;
        HapticFeedback r11 = this.hapticFeedBack;
        if (r11 == null) goto L60;
        r11.mo5088performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5104getTextHandleMove5zf0vsI());
        goto L60
    L53:
        r6 = false;
        goto L54
    L45:
        if (TextRange.m6411getCollapsedimpl(value.m6665getSelectiond9O1mEE()) == false) goto L47;
        bothSelectionsCollapsed = r22;
    L41:
        onlyChangeIsReversed = false;
        goto L43
    L40:
        r22 = true;
        goto L41
    L30:
        return value.m6665getSelectiond9O1mEE();
    L26:
        rawPreviousHandleOffset = -1;
    L18:
        rawEndHandleOffset = currentOffset;
    L12:
        rawStartHandleOffset = currentOffset;
    L100:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    private final void setHandleState(HandleState handleState) {
        LegacyTextFieldState it = this.state;
        if (it != null) goto L5;
        return;
    L5:
        if (it.getHandleState() != handleState) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L11;
        it = null;
    L11:
        if (it == null) goto L15;
        it.setHandleState(handleState);
        return;
    L15:
        return;
    L7:
        r3 = false;
        goto L8
    }

    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    private final TextFieldValue m1497createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, null, 4, null);
    }
}
