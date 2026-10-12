package androidx.compose.material;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "initialValue", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;)V", "dismissDirection", "Landroidx/compose/material/DismissDirection;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismiss", "", "direction", "(Landroidx/compose/material/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDismissed", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<DismissState, DismissValue> Saver(final Function1<? super DismissValue, Boolean> r3) {
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(r3));
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ DismissState(DismissValue r1, AnonymousClass1 r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = AnonymousClass1.INSTANCE;
    L5:
        this(r1, r2);
    }

    public DismissState(DismissValue initialValue, Function1<? super DismissValue, Boolean> r8) {
        super(initialValue, null, r8, 2, null);
    }

    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return null;
    L9:
        if (getOffset().getValue().floatValue() <= 0.0f) goto L12;
        return DismissDirection.StartToEnd;
    L12:
        return DismissDirection.EndToStart;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean isDismissed(DismissDirection direction) {
        DismissValue r0 = getCurrentValue();
        if (direction != DismissDirection.StartToEnd) goto L5;
        DismissValue r1 = DismissValue.DismissedToEnd;
    L6:
        if (r0 != r1) goto L8;
        return true;
    L8:
        return false;
    L5:
        r1 = DismissValue.DismissedToStart;
        goto L6
    }

    public final Object reset(Continuation<? super Unit> r7) {
        Object r8 = SwipeableState.animateTo$default(this, DismissValue.Default, null, r7, 2, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public final Object dismiss(DismissDirection direction, Continuation<? super Unit> r9) {
        if (direction != DismissDirection.StartToEnd) goto L5;
        DismissValue r0 = DismissValue.DismissedToEnd;
    L6:
        DismissValue targetValue = r0;
        Object r10 = SwipeableState.animateTo$default(this, targetValue, null, r9, 2, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r10;
    L10:
        return Unit.INSTANCE;
    L5:
        r0 = DismissValue.DismissedToStart;
        goto L6
    }
}
