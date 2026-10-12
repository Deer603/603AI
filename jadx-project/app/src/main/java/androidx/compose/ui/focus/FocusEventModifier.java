package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use FocusEventModifierNode instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/Modifier$Element;", "onFocusEvent", "", "focusState", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusEventModifier extends Modifier.Element {

    /* JADX INFO: compiled from: FocusEventModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusEventModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(FocusEventModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusEventModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) FocusEventModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) FocusEventModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier $this, Modifier other) {
            return FocusEventModifier.access$then$jd($this, other);
        }
    }

    void onFocusEvent(FocusState r1);

    static /* synthetic */ boolean access$all$jd(FocusEventModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(FocusEventModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(FocusEventModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(FocusEventModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(FocusEventModifier $this, Modifier other) {
        return super.then(other);
    }
}
