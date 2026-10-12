package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: LinkStateInteractionSourceObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "Focused", "", "Hovered", "Pressed", "interactionState", "Landroidx/compose/runtime/MutableIntState;", "isFocused", "", "()Z", "isHovered", "isPressed", "collectInteractionsForLinks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;
    private final int Focused;
    private final int Hovered;
    private final int Pressed;
    private final InteractionSource interactionSource;
    private final MutableIntState interactionState;

    static {
    }

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
        this.Focused = 1;
        this.Hovered = 2;
        this.Pressed = 4;
        this.interactionState = SnapshotIntStateKt.mutableIntStateOf(0);
    }

    public static final /* synthetic */ int access$getFocused$p(LinkStateInteractionSourceObserver $this) {
        return $this.Focused;
    }

    public static final /* synthetic */ int access$getHovered$p(LinkStateInteractionSourceObserver $this) {
        return $this.Hovered;
    }

    public static final /* synthetic */ MutableIntState access$getInteractionState$p(LinkStateInteractionSourceObserver $this) {
        return $this.interactionState;
    }

    public static final /* synthetic */ int access$getPressed$p(LinkStateInteractionSourceObserver $this) {
        return $this.Pressed;
    }

    public final Object collectInteractionsForLinks(Continuation<? super Unit> r6) {
        final MutableObjectList interactions = new MutableObjectList(0, 1, null);
        Object r0 = this.interactionSource.getInteractions().collect(new AnonymousClass2(interactions, this), r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final boolean isFocused() {
        if ((this.interactionState.getIntValue() & this.Focused) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isHovered() {
        if ((this.interactionState.getIntValue() & this.Hovered) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isPressed() {
        if ((this.interactionState.getIntValue() & this.Pressed) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
