package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OnRemeasuredModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/Modifier$Element;", "onRemeasured", "", "size", "Landroidx/compose/ui/unit/IntSize;", "onRemeasured-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OnRemeasuredModifier extends Modifier.Element {

    /* JADX INFO: compiled from: OnRemeasuredModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return OnRemeasuredModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return OnRemeasuredModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) OnRemeasuredModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) OnRemeasuredModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier $this, Modifier other) {
            return OnRemeasuredModifier.access$then$jd($this, other);
        }
    }

    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m5768onRemeasuredozmzZPI(long r1);

    static /* synthetic */ boolean access$all$jd(OnRemeasuredModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(OnRemeasuredModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(OnRemeasuredModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(OnRemeasuredModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(OnRemeasuredModifier $this, Modifier other) {
        return super.then(other);
    }
}
