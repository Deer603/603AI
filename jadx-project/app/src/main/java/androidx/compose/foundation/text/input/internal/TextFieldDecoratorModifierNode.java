package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.core.app.NotificationCompat;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008d\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001H\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rBq\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0002\u0010$J\b\u0010n\u001a\u00020#H\u0002J\b\u0010o\u001a\u00020#H\u0002J\u000e\u0010p\u001a\u00020#H\u0082@¢\u0006\u0002\u0010qJ\b\u0010r\u001a\u00020#H\u0016J\b\u0010s\u001a\u00020#H\u0016J\b\u0010t\u001a\u00020#H\u0016J\b\u0010u\u001a\u00020#H\u0002J\u0010\u0010v\u001a\u00020#2\u0006\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020#2\u0006\u0010z\u001a\u00020{H\u0016J\u001b\u0010|\u001a\u00020#2\u0006\u0010}\u001a\u00020~H\u0002ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020\u00172\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\t\u0010\u0086\u0001\u001a\u00020#H\u0016J\u0011\u0010\u0087\u0001\u001a\u00020#2\u0006\u0010z\u001a\u00020{H\u0016J3\u0010\u0088\u0001\u001a\u00020#2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001f\u0010\u0091\u0001\u001a\u00020\u00172\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0085\u0001J\u001f\u0010\u0093\u0001\u001a\u00020#2\b\u0010\u0094\u0001\u001a\u00030\u008e\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\n\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0002J\u0012\u0010\u0099\u0001\u001a\u00020#2\u0007\u0010\u009a\u0001\u001a\u00020\u0017H\u0002Js\u0010\u009b\u0001\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u000e\u0010\u009c\u0001\u001a\u00020#*\u00030\u009d\u0001H\u0016J\u000e\u0010\u009e\u0001\u001a\u00020#*\u00030\u009f\u0001H\u0016R+\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020.X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010(R\u001a\u0010 \u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010(\"\u0004\bB\u0010*R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0004\n\u0002\u0010IR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u0016\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0SX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010(R\u001a\u0010\u001d\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0010\u0010k\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010mX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActionHandler", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "singleLine", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isPassword", "stylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V", "<set-?>", "autofillHighlightOn", "getAutofillHighlightOn", "()Z", "setAutofillHighlightOn", "(Z)V", "autofillHighlightOn$delegate", "Landroidx/compose/runtime/MutableState;", "clipboardKeyCommandsHandler", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "Lkotlin/jvm/functions/Function1;", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "dragEnterEvent", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEnabled", "setEnabled", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "inputSessionJob", "Lkotlinx/coroutines/Job;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isElementFocused", "isFocused", "setPassword", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "keyboardActionScope", "androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "setKeyboardOptions", "(Landroidx/compose/foundation/text/KeyboardOptions;)V", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReadOnly", "setReadOnly", "receiveContentConfigurationProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getSingleLine", "setSingleLine", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setStylusHandwritingTrigger", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "toolbarAndHandlesVisibilityObserverJob", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "disposeInputSession", "emitDragExitEvent", "observeUntransformedTextChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttach", "onCancelPointerInput", "onDetach", "onFocusChange", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onImeActionPerformed", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed-KlQnJC8", "(I)V", "onKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPlaced", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "requireKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "fromTap", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 0;
    private final MutableState autofillHighlightOn$delegate;
    private final Function1<? super KeyCommand, ? extends Unit> clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private Job inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final Function0<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private MutableSharedFlow<Unit> stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private Job toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {674}, m = "invokeSuspend", n = {}, s = {})
    static final class C03701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        C03701(TextFieldDecoratorModifierNode r2, Continuation<? super C03701> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C03701(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C03701) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            if (this.this$0.getTextFieldSelectionState().startToolbarAndHandlesVisibilityObserver(this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {759}, m = "invokeSuspend", n = {}, s = {})
    static final class C03721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {760}, m = "invokeSuspend", n = {}, s = {})
        static final class C00491 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C00501 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
                C00501(Object r8) {
                    super(1, r8, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ImeAction r2) {
                    m1285invokeKlQnJC8(r2.m6586unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m1285invokeKlQnJC8(int p0) {
                    TextFieldDecoratorModifierNode.m1282access$onImeActionPerformedKlQnJC8((TextFieldDecoratorModifierNode) this.receiver, p0);
                }
            }

            C00491(TextFieldDecoratorModifierNode r2, ReceiveContentConfiguration r3, Continuation<? super C00491> r4) {
                this.this$0 = r2;
                this.$receiveContentConfiguration = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C00491 r0 = new C00491(this.this$0, this.$receiveContentConfiguration, r5);
                r0.L$0 = r4;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(PlatformTextInputSessionScope r3, Continuation<?> r4) {
                return ((C00491) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(PlatformTextInputSessionScope r2, Continuation<?> r3) {
                return invoke2(r2, r3);
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
                throw new KotlinNothingValueException();
            L7:
                ResultKt.throwOnFailure($result);
                PlatformTextInputSessionScope $this$establishTextInputSession = (PlatformTextInputSessionScope) this.L$0;
                PlatformTextInputSessionScope r2 = $this$establishTextInputSession;
                TransformedTextFieldState r3 = this.this$0.getTextFieldState();
                TextLayoutState r4 = this.this$0.getTextLayoutState();
                ImeOptions r5 = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                ReceiveContentConfiguration r6 = this.$receiveContentConfiguration;
                C00501 r7 = new C00501(this.this$0);
                final TextFieldDecoratorModifierNode r8 = this.this$0;
                this.label = 1;
                if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(r2, r3, r4, r5, r6, r7, new AnonymousClass2(r8), this.this$0.getStylusHandwritingTrigger(), (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration()), this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C03721(TextFieldDecoratorModifierNode r2, ReceiveContentConfiguration r3, Continuation<? super C03721> r4) {
            this.this$0 = r2;
            this.$receiveContentConfiguration = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new C03721(this.this$0, this.$receiveContentConfiguration, r5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C03721) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            throw new KotlinNothingValueException();
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (PlatformTextInputModifierNodeKt.establishTextInputSession(this.this$0, new C00491(this.this$0, this.$receiveContentConfiguration, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {499}, m = "invokeSuspend", n = {}, s = {})
    static final class C03731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        C03731(TextFieldSelectionState r2, Continuation<? super C03731> r3) {
            this.$textFieldSelectionState = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C03731(this.$textFieldSelectionState, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C03731) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            if (this.$textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ void access$emitDragExitEvent(TextFieldDecoratorModifierNode $this) {
        $this.emitDragExitEvent();
    }

    public static final /* synthetic */ Job access$getInputSessionJob$p(TextFieldDecoratorModifierNode $this) {
        return $this.inputSessionJob;
    }

    public static final /* synthetic */ TextFieldDecoratorModifierNode$keyboardActionScope$1 access$getKeyboardActionScope$p(TextFieldDecoratorModifierNode $this) {
        return $this.keyboardActionScope;
    }

    public static final /* synthetic */ boolean access$isFocused(TextFieldDecoratorModifierNode $this) {
        return $this.isFocused();
    }

    public static final /* synthetic */ Object access$observeUntransformedTextChanges(TextFieldDecoratorModifierNode $this, Continuation $completion) {
        return $this.observeUntransformedTextChanges($completion);
    }

    public static final /* synthetic */ void access$onFocusChange(TextFieldDecoratorModifierNode $this) {
        $this.onFocusChange();
    }

    /* JADX INFO: renamed from: access$onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public static final /* synthetic */ void m1282access$onImeActionPerformedKlQnJC8(TextFieldDecoratorModifierNode $this, int imeAction) {
        $this.m1283onImeActionPerformedKlQnJC8(imeAction);
    }

    public static final /* synthetic */ SoftwareKeyboardController access$requireKeyboardController(TextFieldDecoratorModifierNode $this) {
        return $this.requireKeyboardController();
    }

    public static final /* synthetic */ void access$setAutofillHighlightOn(TextFieldDecoratorModifierNode $this, boolean r1) {
        $this.setAutofillHighlightOn(r1);
    }

    public static final /* synthetic */ void access$setDragEnterEvent$p(TextFieldDecoratorModifierNode $this, HoverInteraction.Enter r1) {
        $this.dragEnterEvent = r1;
    }

    public static final /* synthetic */ void access$setWindowInfo$p(TextFieldDecoratorModifierNode $this, WindowInfo r1) {
        $this.windowInfo = r1;
    }

    public static final /* synthetic */ void access$startInputSession(TextFieldDecoratorModifierNode $this, boolean fromTap) {
        $this.startInputSession(fromTap);
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(TransformedTextFieldState r1) {
        this.textFieldState = r1;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(TextLayoutState r1) {
        this.textLayoutState = r1;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState r1) {
        this.textFieldSelectionState = r1;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(InputTransformation r1) {
        this.filter = r1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean r1) {
        this.enabled = r1;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean r1) {
        this.readOnly = r1;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final void setKeyboardOptions(KeyboardOptions r1) {
        this.keyboardOptions = r1;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler r1) {
        this.keyboardActionHandler = r1;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean r1) {
        this.singleLine = r1;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(MutableInteractionSource r1) {
        this.interactionSource = r1;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setPassword(boolean r1) {
        this.isPassword = r1;
    }

    public final MutableSharedFlow<Unit> getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final void setStylusHandwritingTrigger(MutableSharedFlow<Unit> r1) {
        this.stylusHandwritingTrigger = r1;
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource, boolean isPassword, MutableSharedFlow<Unit> r37) {
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = r37;
        this.textFieldSelectionState.setRequestAutofillAction(new AnonymousClass1(this));
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this)));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new TextFieldDecoratorModifierNode$dragAndDropNode$1(this), new TextFieldDecoratorModifierNode$dragAndDropNode$2(this), new TextFieldDecoratorModifierNode$dragAndDropNode$3(this), null, new TextFieldDecoratorModifierNode$dragAndDropNode$4(this), new TextFieldDecoratorModifierNode$dragAndDropNode$5(this), null, new TextFieldDecoratorModifierNode$dragAndDropNode$6(this), new TextFieldDecoratorModifierNode$dragAndDropNode$7(this), 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m1220constructorimpl(new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1(this));
        this.receiveContentConfigurationProvider = new TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1(this);
        this.autofillHighlightOn$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private final boolean isFocused() {
        WindowInfo r0 = this.windowInfo;
        if (r0 != null) goto L5;
    L7:
        boolean isWindowFocused = false;
    L9:
        if (this.isElementFocused == false) goto L13;
        if (isWindowFocused == false) goto L13;
        return true;
    L13:
        return false;
    L5:
        if (r0.isWindowFocused() != true) goto L7;
        isWindowFocused = true;
        goto L9
    }

    private final boolean getAutofillHighlightOn() {
        State $this$getValue$iv = this.autofillHighlightOn$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setAutofillHighlightOn(boolean r5) {
        MutableState $this$setValue$iv = this.autofillHighlightOn$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        $this$draw.drawContent();
        if (getAutofillHighlightOn() == false) goto L6;
        DrawScope.m4911drawRectnJ9OG0$default($this$draw, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m4376unboximpl(), 0, 0, 0.0f, null, null, 0, 126, null);
        return;
    }

    private final Object observeUntransformedTextChanges(Continuation<? super Unit> r3) {
        Object r0 = FlowKt.take(FlowKt.drop(SnapshotStateKt.snapshotFlow(new C03682(this)), 1), 1).collect(new C03693(this), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final void updateNode(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource, boolean isPassword, MutableSharedFlow<Unit> r37) {
        if (this.enabled == true) goto L5;
    L7:
        boolean previousEditable = false;
    L8:
        boolean previousEnabled = this.enabled;
        TransformedTextFieldState previousTextFieldState = this.textFieldState;
        KeyboardOptions previousKeyboardOptions = this.keyboardOptions;
        TextFieldSelectionState previousTextFieldSelectionState = this.textFieldSelectionState;
        MutableInteractionSource previousInteractionSource = this.interactionSource;
        boolean previousIsPassword = this.isPassword;
        MutableSharedFlow<Unit> r10 = this.stylusHandwritingTrigger;
        if (enabled == false) goto L12;
        if (readOnly == true) goto L12;
        boolean r18 = true;
    L13:
        boolean editable = r18;
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = r37;
        if (editable == previousEditable) goto L16;
    L21:
        if (editable == true) goto L23;
    L25:
        if (editable == true) goto L28;
        disposeInputSession();
    L28:
        if (enabled != previousEnabled) goto L33;
        if (editable != previousEditable) goto L33;
        if (ImeAction.m6583equalsimpl0(keyboardOptions.m1066getImeActionOrDefaulteUduSuo$foundation_release(), previousKeyboardOptions.m1066getImeActionOrDefaulteUduSuo$foundation_release()) == false) goto L33;
        if (isPassword != previousIsPassword) goto L33;
    L35:
        if (Intrinsics.areEqual(textFieldSelectionState, previousTextFieldSelectionState) == true) goto L52;
        this.pointerInputNode.resetPointerInputHandler();
        if (isAttached() == false) goto L49;
        textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
        if (isFocused() == false) goto L49;
        if (this.toolbarAndHandlesVisibilityObserverJob == null) goto L49;
        Job r3 = this.toolbarAndHandlesVisibilityObserverJob;
        if (r3 == null) goto L46;
        Job.DefaultImpls.cancel$default(r3, null, 1, null);
    L46:
        this.toolbarAndHandlesVisibilityObserverJob = BuildersKt.launch$default(getCoroutineScope(), null, null, new C03731(textFieldSelectionState, null), 3, null);
    L49:
        textFieldSelectionState.setRequestAutofillAction(new C03742(this));
    L52:
        if (Intrinsics.areEqual(interactionSource, previousInteractionSource) == true) goto L55;
        this.pointerInputNode.resetPointerInputHandler();
        return;
    L55:
        return;
    L33:
        SemanticsModifierNodeKt.invalidateSemantics(this);
        goto L35
    L23:
        if (isFocused() == false) goto L25;
        startInputSession(false);
        goto L28
    L16:
        if (Intrinsics.areEqual(textFieldState, previousTextFieldState) == false) goto L21;
        if (Intrinsics.areEqual(keyboardOptions, previousKeyboardOptions) == false) goto L21;
        if (Intrinsics.areEqual(r37, r10) == true) goto L28;
    L12:
        r18 = false;
        goto L13
    L5:
        if (this.readOnly == true) goto L7;
        previousEditable = true;
        goto L8
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        TextFieldCharSequence text = this.textFieldState.getOutputText();
        long selection = text.m1188getSelectiond9O1mEE();
        SemanticsPropertiesKt.setInputText($this$applySemantics, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText($this$applySemantics, new AnnotatedString(text.toString(), null, 2, null));
        SemanticsPropertiesKt.m6201setTextSelectionRangeFDrldGo($this$applySemantics, selection);
        if (this.enabled == true) goto L6;
        SemanticsPropertiesKt.disabled($this$applySemantics);
    L6:
        if (this.isPassword == false) goto L9;
        SemanticsPropertiesKt.password($this$applySemantics);
    L9:
        if (this.enabled == true) goto L11;
    L13:
        final boolean editable = false;
    L14:
        SemanticsPropertiesKt.setEditable($this$applySemantics, editable);
        SemanticsPropertiesKt.setContentDataType($this$applySemantics, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default($this$applySemantics, null, new C03671(editable, this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default($this$applySemantics, null, new AnonymousClass2(this), 1, null);
        if (editable == false) goto L17;
        SemanticsPropertiesKt.setText$default($this$applySemantics, null, new AnonymousClass3(editable, this), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default($this$applySemantics, null, new AnonymousClass4(editable, this), 1, null);
    L17:
        SemanticsPropertiesKt.setSelection$default($this$applySemantics, null, new AnonymousClass5(this), 1, null);
        final int effectiveImeAction = this.keyboardOptions.m1066getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m6197onImeAction9UiTYpY$default($this$applySemantics, effectiveImeAction, null, new AnonymousClass6(this, effectiveImeAction), 2, null);
        SemanticsPropertiesKt.onClick$default($this$applySemantics, null, new AnonymousClass7(this), 1, null);
        SemanticsPropertiesKt.onLongClick$default($this$applySemantics, null, new AnonymousClass8(this), 1, null);
        if (TextRange.m6411getCollapsedimpl(selection) == false) goto L20;
    L26:
        if (editable == false) goto L28;
        SemanticsPropertiesKt.pasteText$default($this$applySemantics, null, new AnonymousClass11(this), 1, null);
    L28:
        InputTransformation it = this.filter;
        if (it == null) goto L32;
        it.applySemantics($this$applySemantics);
        return;
    L32:
        return;
    L20:
        if (this.isPassword == true) goto L26;
        SemanticsPropertiesKt.copyText$default($this$applySemantics, null, new AnonymousClass9(this), 1, null);
        if (this.enabled == false) goto L26;
        if (this.readOnly == true) goto L26;
        SemanticsPropertiesKt.cutText$default($this$applySemantics, null, new AnonymousClass10(this), 1, null);
        goto L26
    L11:
        if (this.readOnly == true) goto L13;
        editable = true;
        goto L14
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (this.isElementFocused != focusState.isFocused()) goto L5;
        return;
    L5:
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        if (this.enabled == true) goto L8;
    L10:
        boolean editable = false;
    L12:
        if (focusState.isFocused() == false) goto L15;
        if (editable == false) goto L17;
        startInputSession(false);
        return;
    L17:
        return;
    L15:
        disposeInputSession();
        TransformedTextFieldState $this$iv = this.textFieldState;
        TextFieldState $this$iv$iv = TransformedTextFieldState.access$getTextFieldState$p($this$iv);
        InputTransformation inputTransformation$iv$iv = TransformedTextFieldState.access$getInputTransformation$p($this$iv);
        TextFieldEditUndoBehavior undoBehavior$iv$iv = TextFieldEditUndoBehavior.MergeIfPossible;
        $this$iv$iv.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$editUntransformedTextAsUser_u24lambda_u2411$iv = $this$iv$iv.getMainBuffer$foundation_release();
        $this$editUntransformedTextAsUser_u24lambda_u2411$iv.commitComposition$foundation_release();
        TransformedTextFieldState.access$updateWedgeAffinity($this$iv, $this$editUntransformedTextAsUser_u24lambda_u2411$iv);
        TextFieldState.access$commitEditAsUser($this$iv$iv, inputTransformation$iv$iv, true, undoBehavior$iv$iv);
        this.textFieldState.collapseSelectionToMax();
        return;
    L8:
        if (this.readOnly == true) goto L10;
        editable = true;
        goto L12
    }

    private final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() == false) goto L8;
        if (this.toolbarAndHandlesVisibilityObserverJob != null) goto L8;
        this.toolbarAndHandlesVisibilityObserverJob = BuildersKt.launch$default(getCoroutineScope(), null, null, new C03701(this, null), 3, null);
        return;
    L8:
        if (isFocused() == true) goto L15;
        Job r0 = this.toolbarAndHandlesVisibilityObserverJob;
        if (r0 == null) goto L12;
        Job.DefaultImpls.cancel$default(r0, null, 1, null);
    L12:
        this.toolbarAndHandlesVisibilityObserverJob = null;
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo205onPreKeyEventZmokQxo(KeyEvent event) {
        return this.textFieldKeyEventHandler.mo1215onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public boolean mo203onKeyEventZmokQxo(KeyEvent event) {
        TextFieldKeyEventHandler r0 = this.textFieldKeyEventHandler;
        TransformedTextFieldState r2 = this.textFieldState;
        TextLayoutState r3 = this.textLayoutState;
        TextFieldSelectionState r4 = this.textFieldSelectionState;
        Function1<? super KeyCommand, ? extends Unit> r5 = this.clipboardKeyCommandsHandler;
        if (this.enabled == true) goto L5;
    L7:
        boolean r1 = false;
    L9:
        return r0.mo1214onKeyEventCJ9ybgU(event, r2, r3, r4, r5, r1, this.singleLine, new TextFieldDecoratorModifierNode$onKeyEvent$1(this));
    L5:
        if (this.readOnly == true) goto L7;
        r1 = true;
        goto L9
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new C03711(this));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        this.dragAndDropNode.onPlaced(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo364onRemeasuredozmzZPI(long size) {
        this.dragAndDropNode.mo364onRemeasuredozmzZPI(size);
    }

    private final void startInputSession(boolean fromTap) {
        if (fromTap == false) goto L4;
    L6:
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this);
        this.inputSessionJob = BuildersKt.launch$default(getCoroutineScope(), null, null, new C03721(this, receiveContentConfiguration, null), 3, null);
        return;
    L4:
        if (this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release() == true) goto L6;
    }

    private final void disposeInputSession() {
        Job r0 = this.inputSessionJob;
        if (r0 == null) goto L5;
        Job.DefaultImpls.cancel$default(r0, null, 1, null);
    L5:
        this.inputSessionJob = null;
        MutableSharedFlow<Unit> r1 = this.stylusHandwritingTrigger;
        if (r1 == null) goto L9;
        r1.resetReplayCache();
        return;
    }

    private final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController r0 = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    private final void emitDragExitEvent() {
        HoverInteraction.Enter it = this.dragEnterEvent;
        if (it == null) goto L6;
        this.interactionSource.tryEmit(new HoverInteraction.Exit(it));
        this.dragEnterEvent = null;
        return;
    }

    /* JADX INFO: renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    private final void m1283onImeActionPerformedKlQnJC8(final int imeAction) {
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6600getNoneeUduSuo()) == false) goto L5;
    L13:
        this.keyboardActionScope.mo1052defaultKeyboardActionKlQnJC8(imeAction);
        return;
    L5:
        if (ImeAction.m6583equalsimpl0(imeAction, ImeAction.Companion.m6596getDefaulteUduSuo()) == true) goto L13;
        if (this.keyboardActionHandler == null) goto L13;
        KeyboardActionHandler r0 = this.keyboardActionHandler;
        if (r0 == null) goto L15;
        r0.onKeyboardAction(new TextFieldDecoratorModifierNode$onImeActionPerformed$1(this, imeAction));
        return;
    }
}
