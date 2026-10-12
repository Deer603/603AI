package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TextFieldKeyEventHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JX\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J:\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\f2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b+H\u0082\bJP\u0010,\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\f\u0010/\u001a\u000200*\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "()V", "currentlyConsumedDownKeys", "Landroidx/collection/MutableLongSet;", "deadKeyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "preparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "onKeyEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "clipboardKeyCommandsHandler", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "editable", "singleLine", "onSubmit", "Lkotlin/Function0;", "", "onKeyEvent-CJ9ybgU", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z", "onPreKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "preparedSelectionContext", "state", "isFromSoftKeyboard", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "processKeyDownEvent", "processKeyDownEvent-ZcWbMB8", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z", "getVisibleTextLayoutHeight", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 0;
    private MutableLongSet currentlyConsumedDownKeys;
    private final DeadKeyCombiner deadKeyCombiner;
    private final KeyMapping keyMapping;
    private final TextFieldPreparedSelectionState preparedSelectionState;

    /* JADX INFO: compiled from: TextFieldKeyEventHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[KeyCommand.values().length];
            r0[KeyCommand.COPY.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L173:
            r0[KeyCommand.PASTE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L193:
            r0[KeyCommand.CUT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L215:
            r0[KeyCommand.LEFT_CHAR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L223:
            r0[KeyCommand.RIGHT_CHAR.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L155:
            r0[KeyCommand.LEFT_WORD.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L171:
            r0[KeyCommand.RIGHT_WORD.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L179:
            r0[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L207:
            r0[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L213:
            r0[KeyCommand.UP.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L243:
            r0[KeyCommand.DOWN.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L153:
            r0[KeyCommand.PAGE_UP.ordinal()] = 12;     // Catch: NoSuchFieldError -> L38
        L185:
            r0[KeyCommand.PAGE_DOWN.ordinal()] = 13;     // Catch: NoSuchFieldError -> L41
        L191:
            r0[KeyCommand.LINE_START.ordinal()] = 14;     // Catch: NoSuchFieldError -> L44
        L221:
            r0[KeyCommand.LINE_END.ordinal()] = 15;     // Catch: NoSuchFieldError -> L47
        L229:
            r0[KeyCommand.LINE_LEFT.ordinal()] = 16;     // Catch: NoSuchFieldError -> L50
        L159:
            r0[KeyCommand.LINE_RIGHT.ordinal()] = 17;     // Catch: NoSuchFieldError -> L53
        L163:
            r0[KeyCommand.HOME.ordinal()] = 18;     // Catch: NoSuchFieldError -> L56
        L197:
            r0[KeyCommand.END.ordinal()] = 19;     // Catch: NoSuchFieldError -> L59
        L201:
            r0[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;     // Catch: NoSuchFieldError -> L62
        L233:
            r0[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;     // Catch: NoSuchFieldError -> L65
        L237:
            r0[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;     // Catch: NoSuchFieldError -> L68
        L169:
            r0[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;     // Catch: NoSuchFieldError -> L71
        L177:
            r0[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;     // Catch: NoSuchFieldError -> L74
        L205:
            r0[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;     // Catch: NoSuchFieldError -> L77
        L211:
            r0[KeyCommand.NEW_LINE.ordinal()] = 26;     // Catch: NoSuchFieldError -> L80
        L241:
            r0[KeyCommand.TAB.ordinal()] = 27;     // Catch: NoSuchFieldError -> L83
        L151:
            r0[KeyCommand.SELECT_ALL.ordinal()] = 28;     // Catch: NoSuchFieldError -> L86
        L183:
            r0[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;     // Catch: NoSuchFieldError -> L89
        L189:
            r0[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;     // Catch: NoSuchFieldError -> L92
        L219:
            r0[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;     // Catch: NoSuchFieldError -> L95
        L227:
            r0[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;     // Catch: NoSuchFieldError -> L98
        L157:
            r0[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;     // Catch: NoSuchFieldError -> L101
        L161:
            r0[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;     // Catch: NoSuchFieldError -> L104
        L195:
            r0[KeyCommand.SELECT_LINE_START.ordinal()] = 35;     // Catch: NoSuchFieldError -> L107
        L199:
            r0[KeyCommand.SELECT_LINE_END.ordinal()] = 36;     // Catch: NoSuchFieldError -> L110
        L231:
            r0[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;     // Catch: NoSuchFieldError -> L113
        L235:
            r0[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;     // Catch: NoSuchFieldError -> L116
        L167:
            r0[KeyCommand.SELECT_UP.ordinal()] = 39;     // Catch: NoSuchFieldError -> L119
        L175:
            r0[KeyCommand.SELECT_DOWN.ordinal()] = 40;     // Catch: NoSuchFieldError -> L122
        L203:
            r0[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;     // Catch: NoSuchFieldError -> L125
        L209:
            r0[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;     // Catch: NoSuchFieldError -> L128
        L239:
            r0[KeyCommand.SELECT_HOME.ordinal()] = 43;     // Catch: NoSuchFieldError -> L131
        L149:
            r0[KeyCommand.SELECT_END.ordinal()] = 44;     // Catch: NoSuchFieldError -> L134
        L181:
            r0[KeyCommand.DESELECT.ordinal()] = 45;     // Catch: NoSuchFieldError -> L137
        L187:
            r0[KeyCommand.UNDO.ordinal()] = 46;     // Catch: NoSuchFieldError -> L140
        L217:
            r0[KeyCommand.REDO.ordinal()] = 47;     // Catch: NoSuchFieldError -> L143
        L225:
            r0[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;     // Catch: NoSuchFieldError -> L146
        L147:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public TextFieldKeyEventHandler() {
        this.preparedSelectionState = new TextFieldPreparedSelectionState();
        this.deadKeyCombiner = new DeadKeyCombiner();
        this.keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();
    }

    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1215onPreKeyEventMyFupTE(KeyEvent event, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController keyboardController) {
        long selection = textFieldState.getVisualText().m1188getSelectiond9O1mEE();
        if (TextRange.m6411getCollapsedimpl(selection) == false) goto L5;
    L7:
        return false;
    L5:
        if (KeyEventHelpers_androidKt.m1050cancelsTextSelectionZmokQxo(event) == false) goto L7;
        textFieldSelectionState.deselect();
        return true;
    }

    /* JADX INFO: renamed from: onKeyEvent-CJ9ybgU */
    public boolean mo1214onKeyEventCJ9ybgU(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1<? super KeyCommand, ? extends Unit> r16, boolean editable, boolean singleLine, Function0<Unit> r19) {
        long keyCode = KeyEvent_androidKt.m5445getKeyZmokQxo(event);
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5443getKeyUpCS__XNY()) == false) goto L17;
        MutableLongSet r1 = this.currentlyConsumedDownKeys;
        if (r1 != null) goto L7;
    L9:
        boolean r2 = false;
    L10:
        if (r2 == false) goto L15;
        MutableLongSet r3 = this.currentlyConsumedDownKeys;
        if (r3 == null) goto L14;
        r3.remove(keyCode);
    L14:
        return true;
    L15:
        return false;
    L7:
        if (r1.contains(keyCode) != true) goto L9;
        r2 = true;
        goto L10
    L17:
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo(event), KeyEventType.Companion.m5444getUnknownCS__XNY()) == true) goto L19;
    L21:
        boolean consumed = m1286processKeyDownEventZcWbMB8(event, textFieldState, textLayoutState, r16, editable, singleLine, r19);
        if (consumed == false) goto L27;
        MutableLongSet it = this.currentlyConsumedDownKeys;
        if (it != null) goto L26;
        it = new MutableLongSet(3);
        this.currentlyConsumedDownKeys = it;
    L26:
        it.plusAssign(keyCode);
    L27:
        return consumed;
    L19:
        if (TextFieldKeyInput_androidKt.m1152isTypedEventZmokQxo(event) == true) goto L21;
        return false;
    }

    /* JADX INFO: renamed from: processKeyDownEvent-ZcWbMB8, reason: not valid java name */
    private final boolean m1286processKeyDownEventZcWbMB8(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, Function1<? super KeyCommand, ? extends Unit> r25, boolean editable, boolean singleLine, Function0<Unit> r28) {
        if (TextFieldKeyInput_androidKt.m1152isTypedEventZmokQxo(event) == false) goto L11;
        Integer codePoint = this.deadKeyCombiner.m1049consumeZmokQxo(event);
        if (codePoint == null) goto L11;
        String text = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), codePoint.intValue()).toString();
        if (editable == false) goto L87;
        TransformedTextFieldState.replaceSelectedText$default(textFieldState, text, true, null, !TextFieldKeyEventHandler_androidKt.m1288isFromSoftKeyboardZmokQxo(event), 4, null);
        this.preparedSelectionState.resetCachedX();
        return true;
    L87:
        return false;
    L11:
        KeyCommand command = this.keyMapping.mo1051mapZmokQxo(event);
        if (command == null) goto L86;
        if (command.getEditsText() == false) goto L17;
        if (editable == false) goto L86;
    L17:
        boolean consumed = true;
        boolean isFromSoftKeyboard$iv = TextFieldKeyEventHandler_androidKt.m1288isFromSoftKeyboardZmokQxo(event);
        TextLayoutResult layoutResult$iv = textLayoutState.getLayoutResult();
        float visibleTextLayoutHeight$iv = getVisibleTextLayoutHeight(textLayoutState);
        TextFieldPreparedSelection $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241 = new TextFieldPreparedSelection(textFieldState, layoutResult$iv, isFromSoftKeyboard$iv, visibleTextLayoutHeight$iv, this.preparedSelectionState);
        switch(WhenMappings.$EnumSwitchMapping$0[command.ordinal()]) {
            case 1: goto L70;
            case 2: goto L70;
            case 3: goto L70;
            case 4: goto L69;
            case 5: goto L68;
            case 6: goto L67;
            case 7: goto L66;
            case 8: goto L65;
            case 9: goto L64;
            case 10: goto L63;
            case 11: goto L62;
            case 12: goto L61;
            case 13: goto L60;
            case 14: goto L59;
            case 15: goto L58;
            case 16: goto L57;
            case 17: goto L56;
            case 18: goto L55;
            case 19: goto L54;
            case 20: goto L53;
            case 21: goto L52;
            case 22: goto L51;
            case 23: goto L50;
            case 24: goto L49;
            case 25: goto L48;
            case 26: goto L45;
            case 27: goto L41;
            case 28: goto L40;
            case 29: goto L39;
            case 30: goto L38;
            case 31: goto L37;
            case 32: goto L36;
            case 33: goto L35;
            case 34: goto L34;
            case 35: goto L33;
            case 36: goto L32;
            case 37: goto L31;
            case 38: goto L30;
            case 39: goto L29;
            case 40: goto L28;
            case 41: goto L27;
            case 42: goto L26;
            case 43: goto L25;
            case 44: goto L24;
            case 45: goto L23;
            case 46: goto L22;
            case 47: goto L21;
            case 48: goto L20;
            default: goto L19;
        };
    L19:
        TransformedTextFieldState r2 = textFieldState;
    L72:
        if (TextRange.m6410equalsimpl0($this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.m1350getSelectiond9O1mEE(), $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.getInitialValue().m1188getSelectiond9O1mEE()) == true) goto L75;
        r2.m1316selectCharsIn5zctL8($this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.m1350getSelectiond9O1mEE());
    L75:
        if ($this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.getWedgeAffinity() == null) goto L84;
        WedgeAffinity wedgeAffinity$iv = $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.getWedgeAffinity();
        if (wedgeAffinity$iv == null) goto L84;
        if (TextRange.m6411getCollapsedimpl(r2.getUntransformedText().m1188getSelectiond9O1mEE()) == false) goto L81;
        r2.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity$iv));
        goto L84
    L81:
        r2.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default($this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.getInitialWedgeAffinity(), null, wedgeAffinity$iv, 1, null));
    L84:
        return consumed;
    L20:
        KeyEventHelpers_androidKt.showCharacterPalette();
        r2 = textFieldState;
        goto L72
    L21:
        textFieldState.redo();
        r2 = textFieldState;
        goto L72
    L22:
        textFieldState.undo();
        r2 = textFieldState;
        goto L72
    L23:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.deselect();
        r2 = textFieldState;
        goto L72
    L24:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToEnd().selectMovement();
        r2 = textFieldState;
        goto L72
    L25:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToHome().selectMovement();
        r2 = textFieldState;
        goto L72
    L26:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorDownByPage().selectMovement();
        r2 = textFieldState;
        goto L72
    L27:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorUpByPage().selectMovement();
        r2 = textFieldState;
        goto L72
    L28:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorDownByLine().selectMovement();
        r2 = textFieldState;
        goto L72
    L29:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorUpByLine().selectMovement();
        r2 = textFieldState;
        goto L72
    L30:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineRightSide().selectMovement();
        r2 = textFieldState;
        goto L72
    L31:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineLeftSide().selectMovement();
        r2 = textFieldState;
        goto L72
    L32:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineEnd().selectMovement();
        r2 = textFieldState;
        goto L72
    L33:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineStart().selectMovement();
        r2 = textFieldState;
        goto L72
    L34:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorNextByParagraph().selectMovement();
        r2 = textFieldState;
        goto L72
    L35:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorPrevByParagraph().selectMovement();
        r2 = textFieldState;
        goto L72
    L36:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorRightByWord().selectMovement();
        r2 = textFieldState;
        goto L72
    L37:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorLeftByWord().selectMovement();
        r2 = textFieldState;
        goto L72
    L38:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorRightByChar().selectMovement();
        r2 = textFieldState;
        goto L72
    L39:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorLeftByChar().selectMovement();
        r2 = textFieldState;
        goto L72
    L40:
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.selectAll();
        r2 = textFieldState;
        goto L72
    L41:
        if (singleLine == true) goto L43;
        r2 = textFieldState;
        TransformedTextFieldState.replaceSelectedText$default(r2, "\t", true, null, !TextFieldKeyEventHandler_androidKt.m1288isFromSoftKeyboardZmokQxo(event), 4, null);
        goto L72
    L43:
        consumed = false;
        r2 = textFieldState;
        goto L72
    L48:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineEnd().deleteMovement();
        goto L72
    L49:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineStart().deleteMovement();
        goto L72
    L50:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorNextByWord().deleteMovement();
        goto L72
    L51:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorPrevByWord().deleteMovement();
        goto L72
    L52:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorNextByChar().deleteMovement();
        goto L72
    L53:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorPrevByChar().deleteMovement();
        goto L72
    L54:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToEnd();
        goto L72
    L55:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToHome();
        goto L72
    L56:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineRightSide();
        goto L72
    L57:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineLeftSide();
        goto L72
    L58:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineEnd();
        goto L72
    L59:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorToLineStart();
        goto L72
    L60:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorDownByPage();
        goto L72
    L61:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorUpByPage();
        goto L72
    L62:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorDownByLine();
        goto L72
    L63:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorUpByLine();
        goto L72
    L64:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorNextByParagraph();
        goto L72
    L65:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorPrevByParagraph();
        goto L72
    L66:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorRightByWord();
        goto L72
    L67:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.moveCursorLeftByWord();
        goto L72
    L68:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.collapseRightOr(TextFieldKeyEventHandler$processKeyDownEvent$1$2.INSTANCE);
        goto L72
    L69:
        r2 = textFieldState;
        $this$processKeyDownEvent_ZcWbMB8_u24lambda_u241.collapseLeftOr(TextFieldKeyEventHandler$processKeyDownEvent$1$1.INSTANCE);
        goto L72
    L70:
        r2 = textFieldState;
        r25.invoke(command);
        goto L72
    L45:
        if (singleLine == true) goto L47;
        r2 = textFieldState;
        TransformedTextFieldState.replaceSelectedText$default(r2, "\n", true, null, !TextFieldKeyEventHandler_androidKt.m1288isFromSoftKeyboardZmokQxo(event), 4, null);
        goto L72
    L47:
        r2 = textFieldState;
        r28.invoke();
    L86:
        return false;
    }

    private final void preparedSelectionContext(TransformedTextFieldState state, TextLayoutState textLayoutState, boolean isFromSoftKeyboard, Function1<? super TextFieldPreparedSelection, Unit> r14) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        float visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState);
        TextFieldPreparedSelection preparedSelection = new TextFieldPreparedSelection(state, layoutResult, isFromSoftKeyboard, visibleTextLayoutHeight, this.preparedSelectionState);
        r14.invoke(preparedSelection);
        if (TextRange.m6410equalsimpl0(preparedSelection.m1350getSelectiond9O1mEE(), preparedSelection.getInitialValue().m1188getSelectiond9O1mEE()) == true) goto L6;
        state.m1316selectCharsIn5zctL8(preparedSelection.m1350getSelectiond9O1mEE());
    L6:
        if (preparedSelection.getWedgeAffinity() == null) goto L14;
        WedgeAffinity wedgeAffinity = preparedSelection.getWedgeAffinity();
        if (wedgeAffinity != null) goto L10;
        return;
    L10:
        if (TextRange.m6411getCollapsedimpl(state.getUntransformedText().m1188getSelectiond9O1mEE()) == false) goto L12;
        state.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
        return;
    L12:
        state.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(preparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
        return;
    }

    private final float getVisibleTextLayoutHeight(TextLayoutState $this$getVisibleTextLayoutHeight) {
        LayoutCoordinates textLayoutCoordinates = $this$getVisibleTextLayoutHeight.getTextLayoutNodeCoordinates();
        if (textLayoutCoordinates == null) goto L21;
        Rect r2 = null;
        if (textLayoutCoordinates.isAttached() == true) goto L8;
        textLayoutCoordinates = null;
    L8:
        if (textLayoutCoordinates == null) goto L21;
        LayoutCoordinates it = $this$getVisibleTextLayoutHeight.getDecoratorNodeCoordinates();
        if (it != null) goto L12;
    L19:
        if (r2 == null) goto L21;
        long value$iv$iv = r2.m4158getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (4294967295L & value$iv$iv);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L12:
        if (it.isAttached() == true) goto L15;
        it = null;
    L15:
        if (it == null) goto L19;
        r2 = LayoutCoordinates.localBoundingBoxOf$default(it, textLayoutCoordinates, false, 2, null);
    L21:
        return Float.NaN;
    }
}
