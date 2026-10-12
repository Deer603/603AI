package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModifierLocalProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProvider;", "T", "Landroidx/compose/ui/Modifier$Element;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* JADX INFO: compiled from: ModifierLocalProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> r1, Function1<? super Modifier.Element, Boolean> r2) {
            return ModifierLocalProvider.access$all$jd(r1, r2);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> r1, Function1<? super Modifier.Element, Boolean> r2) {
            return ModifierLocalProvider.access$any$jd(r1, r2);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> r1, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> r3) {
            return (R) ModifierLocalProvider.access$foldIn$jd(r1, r2, r3);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> r1, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> r3) {
            return (R) ModifierLocalProvider.access$foldOut$jd(r1, r2, r3);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> r1, Modifier other) {
            return ModifierLocalProvider.access$then$jd(r1, other);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();

    static /* synthetic */ boolean access$all$jd(ModifierLocalProvider $this, Function1 predicate) {
        return super.all(predicate);
    }

    static /* synthetic */ boolean access$any$jd(ModifierLocalProvider $this, Function1 predicate) {
        return super.any(predicate);
    }

    static /* synthetic */ Object access$foldIn$jd(ModifierLocalProvider $this, Object initial, Function2 operation) {
        return super.foldIn(initial, operation);
    }

    static /* synthetic */ Object access$foldOut$jd(ModifierLocalProvider $this, Object initial, Function2 operation) {
        return super.foldOut(initial, operation);
    }

    static /* synthetic */ Modifier access$then$jd(ModifierLocalProvider $this, Modifier other) {
        return super.then(other);
    }
}
