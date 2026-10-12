package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use Modifier.focusProperties() instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/Modifier$Element;", "populateFocusOrder", "", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusOrderModifier extends Modifier.Element {

    /* JADX INFO: compiled from: FocusOrderModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusOrderModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusOrderModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) FocusOrderModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) FocusOrderModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier $this, Modifier other) {
            return FocusOrderModifier.access$then$jd($this, other);
        }
    }

    void populateFocusOrder(FocusOrder r1);

    static /* synthetic */ boolean access$all$jd(FocusOrderModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(FocusOrderModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(FocusOrderModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(FocusOrderModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(FocusOrderModifier $this, Modifier other) {
        return super.then(other);
    }
}
