package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "id", "", "getId$annotations", "()V", "getId", "()I", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SemanticsModifier extends Modifier.Element {

    /* JADX INFO: compiled from: SemanticsModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static boolean all(SemanticsModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return SemanticsModifier.access$all$jd($this, r2);
        }

        @Deprecated
        public static boolean any(SemanticsModifier $this, Function1<? super Modifier.Element, Boolean> r2) {
            return SemanticsModifier.access$any$jd($this, r2);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) SemanticsModifier.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) SemanticsModifier.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static Modifier then(SemanticsModifier $this, Modifier other) {
            return SemanticsModifier.access$then$jd($this, other);
        }

        @Deprecated
        public static int getId(SemanticsModifier $this) {
            return SemanticsModifier.access$getId$jd($this);
        }
    }

    SemanticsConfiguration getSemanticsConfiguration();

    static /* synthetic */ boolean access$all$jd(SemanticsModifier $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(SemanticsModifier $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(SemanticsModifier $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(SemanticsModifier $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ int access$getId$jd(SemanticsModifier $this) {
        return super.getId();
    }

    static /* synthetic */ Modifier access$then$jd(SemanticsModifier $this, Modifier other) {
        return super.then(other);
    }

    default int getId() {
        return -1;
    }
}
