package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Use FocusRequesterModifierNode instead")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusRequesterModifier extends Modifier.Element {

    /* JADX INFO: compiled from: FocusRequesterModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusRequesterModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return FocusRequesterModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) FocusRequesterModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) FocusRequesterModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier $this, Modifier other) {
            return FocusRequesterModifier.access$then$jd($this, other);
        }
    }

    FocusRequester getFocusRequester();

    static /* synthetic */ boolean access$all$jd(FocusRequesterModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(FocusRequesterModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(FocusRequesterModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(FocusRequesterModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(FocusRequesterModifier $this, Modifier other) {
        return super.then(other);
    }
}
