package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a6\u0010\b\u001a\u00020\t2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u000b\u001a&\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u000b\u001aN\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0019\u001aD\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001a\u001a/\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u001c\"\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0002\u0010\u001d\u001aR\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u001c\"\u0004\u0018\u00010\u00112'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001e\u001a:\u0010\u0014\u001a\u00020\u0015*\u00020\u00152'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"EmptyPointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "PointerInputModifierNoParamError", "", "getPointerInputModifierNoParamError$annotations", "()V", "WITH_TIMEOUT_MICRO_DELAY_MILLIS", "", "SuspendingPointerInputModifierNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputEventHandler", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputHandler", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInput", "Landroidx/compose/ui/Modifier;", "key1", "block", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "keys", "", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = null;
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    public static final /* synthetic */ PointerEvent access$getEmptyPointerEvent$p() {
        return EmptyPointerEvent;
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = PointerInputModifierNoParamError)
    public static final Modifier pointerInput(Modifier $this$pointerInput, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> r3) {
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use the PointerInputEventHandler block variation instead", replaceWith = @ReplaceWith(expression = "pointerInput(key1 = key1, pointerInputEventHandler = block)", imports = {"androidx.compose.ui.input.pointer.Modifier.pointerInput"}))
    public static final /* synthetic */ Modifier pointerInput(Modifier $this$pointerInput, Object key1, Function2 block) {
        Object r2 = null;
        Object[] r3 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(key1, r2, r3, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(block), 6, null));
    }

    public static final Modifier pointerInput(Modifier $this$pointerInput, Object key1, PointerInputEventHandler block) {
        Object r2 = null;
        Object[] r3 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(key1, r2, r3, block, 6, null));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use the PointerInputEventHandler block variation instead", replaceWith = @ReplaceWith(expression = "pointerInput(key1 = key1, key2 = key2, pointerInputEventHandler = block)", imports = {"androidx.compose.ui.input.pointer.Modifier.pointerInput"}))
    public static final /* synthetic */ Modifier pointerInput(Modifier $this$pointerInput, Object key1, Object key2, Function2 block) {
        Object[] r3 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(key1, key2, r3, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(block), 4, null));
    }

    public static final Modifier pointerInput(Modifier $this$pointerInput, Object key1, Object key2, PointerInputEventHandler block) {
        Object[] r3 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(key1, key2, r3, block, 4, null));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use the PointerInputEventHandler block variation instead", replaceWith = @ReplaceWith(expression = "pointerInput(keys = keys, pointerInputEventHandler = block)", imports = {"androidx.compose.ui.input.pointer.Modifier.pointerInput"}))
    public static final /* synthetic */ Modifier pointerInput(Modifier $this$pointerInput, Object[] keys, Function2 block) {
        Object r1 = null;
        Object r2 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(r1, r2, keys, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(block), 3, null));
    }

    public static final Modifier pointerInput(Modifier $this$pointerInput, Object[] keys, PointerInputEventHandler block) {
        Object r1 = null;
        Object r2 = null;
        return $this$pointerInput.then(new SuspendPointerInputElement(r1, r2, keys, block, 3, null));
    }

    static {
        EmptyPointerEvent = new PointerEvent(CollectionsKt.emptyList());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use 'SuspendingPointerInputModifierNode' with thePointerInputEventHandler instead.", replaceWith = @ReplaceWith(expression = "SuspendingPointerInputModifierNode { pointerInputEventHandler }", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode"}))
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(Function2 pointerInputHandler) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputHandler);
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
    }
}
