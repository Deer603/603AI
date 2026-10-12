package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ParentDataModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ParentDataModifier extends Modifier.Element {

    /* JADX INFO: compiled from: ParentDataModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return ParentDataModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(ParentDataModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return ParentDataModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) ParentDataModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) ParentDataModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier $this, Modifier other) {
            return ParentDataModifier.access$then$jd($this, other);
        }
    }

    Object modifyParentData(Density r1, Object r2);

    static /* synthetic */ boolean access$all$jd(ParentDataModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(ParentDataModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(ParentDataModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(ParentDataModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(ParentDataModifier $this, Modifier other) {
        return super.then(other);
    }
}
