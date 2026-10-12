package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PointerInputModifier extends Modifier.Element {

    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return PointerInputModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(PointerInputModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return PointerInputModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) PointerInputModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) PointerInputModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier $this, Modifier other) {
            return PointerInputModifier.access$then$jd($this, other);
        }
    }

    PointerInputFilter getPointerInputFilter();

    static /* synthetic */ boolean access$all$jd(PointerInputModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(PointerInputModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(PointerInputModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(PointerInputModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(PointerInputModifier $this, Modifier other) {
        return super.then(other);
    }
}
