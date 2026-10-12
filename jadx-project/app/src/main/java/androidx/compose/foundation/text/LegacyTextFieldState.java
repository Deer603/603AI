package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0007\u0010\u0084\u0001\u001a\u00020\fJ{\u0010\u0085\u0001\u001a\u00020T2\u0006\u0010~\u001a\u00020\u007f2\u0007\u0010\u0086\u0001\u001a\u00020\u007f2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\f2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020T0R2\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0006\u0010a\u001a\u00020bø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00100\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0013\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u001e\u00103\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u000fR+\u00104\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0013\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R(\u0010=\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010<\u001a\u0004\u0018\u00010B8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0IX\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010K\u001a\u00020J2\u0006\u0010\u000b\u001a\u00020J8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010\u0013\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001d\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020T0R¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001d\u0010W\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020T0R¢\u0006\b\n\u0000\u001a\u0004\bY\u0010VR\u001a\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020T0RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010[\u001a\u00020\\¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\"\u0010a\u001a\u00020bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010e\u001a\u0004\bc\u0010\u0017\"\u0004\bd\u0010\u0019R1\u0010f\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bi\u0010\u0013\u001a\u0004\bg\u0010\u0017\"\u0004\bh\u0010\u0019R+\u0010j\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010\u0013\u001a\u0004\bk\u0010\u000f\"\u0004\bl\u0010\u0011R+\u0010n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010\u0013\u001a\u0004\bo\u0010\u000f\"\u0004\bp\u0010\u0011R+\u0010r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\u0013\u001a\u0004\bs\u0010\u000f\"\u0004\bt\u0010\u0011R+\u0010v\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\u0013\u001a\u0004\bw\u0010\u000f\"\u0004\bx\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R \u0010~\u001a\u0004\u0018\u00010\u007fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/foundation/text/LegacyTextFieldState;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "_layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "", "autofillHighlightOn", "getAutofillHighlightOn", "()Z", "setAutofillHighlightOn", "(Z)V", "autofillHighlightOn$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/text/TextRange;", "deletionPreviewHighlightRange", "getDeletionPreviewHighlightRange-d9O1mEE", "()J", "setDeletionPreviewHighlightRange-5zc-tL8", "(J)V", "deletionPreviewHighlightRange$delegate", "Landroidx/compose/foundation/text/HandleState;", "handleState", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState$delegate", "hasFocus", "getHasFocus", "setHasFocus", "hasFocus$delegate", "highlightPaint", "Landroidx/compose/ui/graphics/Paint;", "getHighlightPaint", "()Landroidx/compose/ui/graphics/Paint;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "isLayoutResultStale", "justAutofilled", "getJustAutofilled", "setJustAutofilled", "justAutofilled$delegate", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "value", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResult", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResultState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField$delegate", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "getOnImeActionPerformed", "()Lkotlin/jvm/functions/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "getOnValueChange", "onValueChangeOriginal", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "selectionBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getSelectionBackgroundColor-0d7_KjU", "setSelectionBackgroundColor-8_81llA", "J", "selectionPreviewHighlightRange", "getSelectionPreviewHighlightRange-d9O1mEE", "setSelectionPreviewHighlightRange-5zc-tL8", "selectionPreviewHighlightRange$delegate", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "showFloatingToolbar", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar$delegate", "showSelectionHandleEnd", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd$delegate", "showSelectionHandleStart", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart$delegate", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "untransformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "hasHighlight", "update", "visualText", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LegacyTextFieldState {
    public static final int $stable = 0;
    private LayoutCoordinates _layoutCoordinates;
    private final MutableState autofillHighlightOn$delegate;
    private final MutableState deletionPreviewHighlightRange$delegate;
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private final Paint highlightPaint;
    private TextInputSession inputSession;
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;
    private final MutableState justAutofilled$delegate;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final Function1<ImeAction, Unit> onImeActionPerformed;
    private final Function1<TextFieldValue, Unit> onValueChange;
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;
    private final EditProcessor processor;
    private final RecomposeScope recomposeScope;
    private long selectionBackgroundColor;
    private final MutableState selectionPreviewHighlightRange$delegate;
    private final MutableState showCursorHandle$delegate;
    private final MutableState showFloatingToolbar$delegate;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    static {
        $stable = 8;
    }

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController keyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = keyboardController;
        this.processor = new EditProcessor();
        this.hasFocus$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.minHeightForSingleLineField$delegate = SnapshotStateKt.mutableStateOf$default(Dp.m6971boximpl(Dp.m6973constructorimpl(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState$delegate = SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showFloatingToolbar$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showSelectionHandleStart$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showSelectionHandleEnd$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(this.keyboardController);
        this.autofillHighlightOn$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.justAutofilled$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.onValueChangeOriginal = LegacyTextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new LegacyTextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new LegacyTextFieldState$onImeActionPerformed$1(this);
        this.highlightPaint = AndroidPaint_androidKt.Paint();
        this.selectionBackgroundColor = Color.Companion.m4402getUnspecified0d7_KjU();
        this.selectionPreviewHighlightRange$delegate = SnapshotStateKt.mutableStateOf$default(TextRange.m6405boximpl(TextRange.Companion.m6422getZerod9O1mEE()), null, 2, null);
        this.deletionPreviewHighlightRange$delegate = SnapshotStateKt.mutableStateOf$default(TextRange.m6405boximpl(TextRange.Companion.m6422getZerod9O1mEE()), null, 2, null);
    }

    public static final /* synthetic */ KeyboardActionRunner access$getKeyboardActionRunner$p(LegacyTextFieldState $this) {
        return $this.keyboardActionRunner;
    }

    public static final /* synthetic */ Function1 access$getOnValueChangeOriginal$p(LegacyTextFieldState $this) {
        return $this.onValueChangeOriginal;
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(TextDelegate r1) {
        this.textDelegate = r1;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(TextInputSession r1) {
        this.inputSession = r1;
    }

    public final boolean getHasFocus() {
        State $this$getValue$iv = this.hasFocus$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean r5) {
        MutableState $this$setValue$iv = this.hasFocus$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1069getMinHeightForSingleLineFieldD9Ej5fM() {
        State $this$getValue$iv = this.minHeightForSingleLineField$delegate;
        return ((Dp) $this$getValue$iv.getValue()).m6987unboximpl();
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1073setMinHeightForSingleLineField0680j_4(float r5) {
        MutableState $this$setValue$iv = this.minHeightForSingleLineField$delegate;
        $this$setValue$iv.setValue(Dp.m6971boximpl(r5));
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates it = this._layoutCoordinates;
        if (it == null) goto L8;
        if (it.isAttached() == false) goto L8;
        return it;
    L8:
        return null;
    }

    public final void setLayoutCoordinates(LayoutCoordinates value) {
        this._layoutCoordinates = value;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(TextLayoutResultProxy value) {
        this.layoutResultState.setValue(value);
        this.isLayoutResultStale = false;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(AnnotatedString r1) {
        this.untransformedText = r1;
    }

    public final HandleState getHandleState() {
        State $this$getValue$iv = this.handleState$delegate;
        return (HandleState) $this$getValue$iv.getValue();
    }

    public final void setHandleState(HandleState r4) {
        MutableState $this$setValue$iv = this.handleState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final boolean getShowFloatingToolbar() {
        State $this$getValue$iv = this.showFloatingToolbar$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean r5) {
        MutableState $this$setValue$iv = this.showFloatingToolbar$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getShowSelectionHandleStart() {
        State $this$getValue$iv = this.showSelectionHandleStart$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean r5) {
        MutableState $this$setValue$iv = this.showSelectionHandleStart$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getShowSelectionHandleEnd() {
        State $this$getValue$iv = this.showSelectionHandleEnd$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean r5) {
        MutableState $this$setValue$iv = this.showSelectionHandleEnd$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getShowCursorHandle() {
        State $this$getValue$iv = this.showCursorHandle$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean r5) {
        MutableState $this$setValue$iv = this.showCursorHandle$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final boolean isInTouchMode() {
        State $this$getValue$iv = this.isInTouchMode$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean r5) {
        MutableState $this$setValue$iv = this.isInTouchMode$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getAutofillHighlightOn() {
        State $this$getValue$iv = this.autofillHighlightOn$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setAutofillHighlightOn(boolean r5) {
        MutableState $this$setValue$iv = this.autofillHighlightOn$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getJustAutofilled() {
        State $this$getValue$iv = this.justAutofilled$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setJustAutofilled(boolean r5) {
        MutableState $this$setValue$iv = this.justAutofilled$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1070getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX INFO: renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m1074setSelectionBackgroundColor8_81llA(long r1) {
        this.selectionBackgroundColor = r1;
    }

    /* JADX INFO: renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1071getSelectionPreviewHighlightRanged9O1mEE() {
        State $this$getValue$iv = this.selectionPreviewHighlightRange$delegate;
        return ((TextRange) $this$getValue$iv.getValue()).m6421unboximpl();
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1075setSelectionPreviewHighlightRange5zctL8(long r5) {
        MutableState $this$setValue$iv = this.selectionPreviewHighlightRange$delegate;
        $this$setValue$iv.setValue(TextRange.m6405boximpl(r5));
    }

    /* JADX INFO: renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1068getDeletionPreviewHighlightRanged9O1mEE() {
        State $this$getValue$iv = this.deletionPreviewHighlightRange$delegate;
        return ((TextRange) $this$getValue$iv.getValue()).m6421unboximpl();
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1072setDeletionPreviewHighlightRange5zctL8(long r5) {
        MutableState $this$setValue$iv = this.deletionPreviewHighlightRange$delegate;
        $this$setValue$iv.setValue(TextRange.m6405boximpl(r5));
    }

    public final boolean hasHighlight() {
        if (TextRange.m6411getCollapsedimpl(m1071getSelectionPreviewHighlightRanged9O1mEE()) == true) goto L5;
    L8:
        return true;
    L5:
        if (TextRange.m6411getCollapsedimpl(m1068getDeletionPreviewHighlightRanged9O1mEE()) == false) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m1076updatefnh65Uc(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean softWrap, Density density, FontFamily.Resolver fontFamilyResolver, Function1<? super TextFieldValue, Unit> r27, KeyboardActions keyboardActions, FocusManager focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = r27;
        this.selectionBackgroundColor = selectionBackgroundColor;
        KeyboardActionRunner $this$update_fnh65Uc_u24lambda_u241 = this.keyboardActionRunner;
        $this$update_fnh65Uc_u24lambda_u241.setKeyboardActions(keyboardActions);
        $this$update_fnh65Uc_u24lambda_u241.setFocusManager(focusManager);
        this.untransformedText = untransformedText;
        TextDelegate newTextDelegate = TextDelegateKt.m1130updateTextDelegaterm0N8CA$default(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, CollectionsKt.emptyList(), 448, null);
        if (this.textDelegate == newTextDelegate) goto L5;
        this.isLayoutResultStale = true;
    L5:
        this.textDelegate = newTextDelegate;
    }
}
