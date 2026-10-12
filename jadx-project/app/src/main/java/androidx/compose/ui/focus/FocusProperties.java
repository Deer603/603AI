package androidx.compose.ui.focus;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eRB\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00138W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bRB\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00138W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eRF\u0010)\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0013¢\u0006\u0002\b(2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0013¢\u0006\u0002\b(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bRF\u0010,\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0013¢\u0006\u0002\b(2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0013¢\u0006\u0002\b(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR$\u0010/\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR$\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", "down", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "value", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", "left", "getLeft", "setLeft", "next", "getNext", "setNext", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Lkotlin/ExtensionFunctionType;", "onEnter", "getOnEnter", "setOnEnter", "onExit", "getOnExit", "setOnExit", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusProperties {
    static /* synthetic */ void getEnter$annotations() {
    }

    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    void setCanFocus(boolean r1);

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default void setNext(FocusRequester r1) {
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default void setPrevious(FocusRequester r1) {
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    default void setUp(FocusRequester r1) {
    }

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default void setDown(FocusRequester r1) {
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default void setLeft(FocusRequester r1) {
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default void setRight(FocusRequester r1) {
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default void setStart(FocusRequester r1) {
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    default void setEnd(FocusRequester r1) {
    }

    default Function1<FocusDirection, FocusRequester> getEnter() {
        return FocusProperties$enter$1.INSTANCE;
    }

    @Deprecated(message = "Use onEnter instead", replaceWith = @ReplaceWith(expression = "onEnter", imports = {}))
    default void setEnter(Function1<? super FocusDirection, FocusRequester> r2) {
        setOnEnter(FocusPropertiesKt.access$toUsingEnterExitScope(r2));
    }

    default Function1<FocusEnterExitScope, Unit> getOnEnter() {
        return FocusProperties$onEnter$1.INSTANCE;
    }

    default void setOnEnter(Function1<? super FocusEnterExitScope, Unit> r1) {
    }

    default Function1<FocusDirection, FocusRequester> getExit() {
        return FocusProperties$exit$1.INSTANCE;
    }

    @Deprecated(message = "Use onExit instead", replaceWith = @ReplaceWith(expression = "onExit", imports = {}))
    default void setExit(Function1<? super FocusDirection, FocusRequester> r2) {
        setOnExit(FocusPropertiesKt.access$toUsingEnterExitScope(r2));
    }

    default Function1<FocusEnterExitScope, Unit> getOnExit() {
        return FocusProperties$onExit$1.INSTANCE;
    }

    default void setOnExit(Function1<? super FocusEnterExitScope, Unit> r1) {
    }
}
