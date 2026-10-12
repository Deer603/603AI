package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/CancelledCoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "()V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Key", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CancelledCoroutineContext implements CoroutineContext.Element {
    public static final Key Key = null;

    /* JADX INFO: compiled from: Effects.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/CancelledCoroutineContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/CancelledCoroutineContext;", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<CancelledCoroutineContext> {
        public /* synthetic */ Key(DefaultConstructorMarker r1) {
            this();
        }

        private Key() {
        }
    }

    static {
        Key = new Key(null);
    }

    public CancelledCoroutineContext() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r2, r3);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> r2) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> r2) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return CoroutineContext.Element.DefaultImpls.plus(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return Key;
    }
}
