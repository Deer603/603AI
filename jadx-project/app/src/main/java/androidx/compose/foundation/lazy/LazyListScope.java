package androidx.compose.foundation.lazy;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0002\u0010\nJC\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0002\u0010\fJ\u0096\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000621\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0002\u0010\u0015Jo\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000621\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0002\u0010\u0016JC\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0002\u0010\fJI\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0002\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "item", "", "key", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "contentType", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyListScope {

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope $this, Object key, Object contentType, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> r3) {
            LazyListScope.access$item$jd($this, key, contentType, r3);
        }

        public static /* synthetic */ void item$default(LazyListScope r0, Object r1, Object r2, Function3 r3, int r4, Object r5) {
            LazyListScope.item$default(r0, r1, r2, r3, r4, r5);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void item(LazyListScope $this, Object key, Function3 content) {
            LazyListScope.access$item$jd($this, key, content);
        }

        public static /* synthetic */ void item$default(LazyListScope r0, Object r1, Function3 r2, int r3, Object r4) {
            LazyListScope.item$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static void items(LazyListScope $this, int count, Function1<? super Integer, ? extends Object> r2, Function1<? super Integer, ? extends Object> r3, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r4) {
            LazyListScope.access$items$jd($this, count, r2, r3, r4);
        }

        public static /* synthetic */ void items$default(LazyListScope r0, int r1, Function1 r2, Function1 r3, Function4 r4, int r5, Object r6) {
            LazyListScope.items$default(r0, r1, r2, r3, r4, r5, r6);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void items(LazyListScope $this, int count, Function1 key, Function4 itemContent) {
            LazyListScope.access$items$jd($this, count, key, itemContent);
        }

        public static /* synthetic */ void items$default(LazyListScope r0, int r1, Function1 r2, Function4 r3, int r4, Object r5) {
            LazyListScope.items$default(r0, r1, r2, r3, r4, r5);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the overload with indexing capabilities.", replaceWith = @ReplaceWith(expression = "stickyHeader(key, contentType, { _ -> content() })", imports = {}))
        @Deprecated
        public static /* synthetic */ void stickyHeader(LazyListScope $this, Object key, Object contentType, Function3 content) {
            LazyListScope.access$stickyHeader$jd($this, key, contentType, content);
        }

        public static /* synthetic */ void stickyHeader$default(LazyListScope r0, Object r1, Object r2, Function3 r3, int r4, Object r5) {
            LazyListScope.stickyHeader$default(r0, r1, r2, r3, r4, r5);
        }

        @Deprecated
        public static void stickyHeader(LazyListScope $this, Object key, Object contentType, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r3) {
            LazyListScope.access$stickyHeader$jd($this, key, contentType, r3);
        }

        public static /* synthetic */ void stickyHeader$default(LazyListScope r0, Object r1, Object r2, Function4 r3, int r4, Object r5) {
            LazyListScope.stickyHeader$default(r0, r1, r2, r3, r4, r5);
        }
    }

    static /* synthetic */ void access$item$jd(LazyListScope $this, Object key, Object contentType, Function3 content) {
        super.item(key, contentType, content);
    }

    static /* synthetic */ void access$item$jd(LazyListScope $this, Object key, Function3 content) {
        super.item(key, content);
    }

    static /* synthetic */ void access$items$jd(LazyListScope $this, int count, Function1 key, Function1 contentType, Function4 itemContent) {
        super.items(count, key, contentType, itemContent);
    }

    static /* synthetic */ void access$items$jd(LazyListScope $this, int count, Function1 key, Function4 itemContent) {
        super.items(count, key, itemContent);
    }

    static /* synthetic */ void access$stickyHeader$jd(LazyListScope $this, Object key, Object contentType, Function3 content) {
        super.stickyHeader(key, contentType, content);
    }

    static /* synthetic */ void access$stickyHeader$jd(LazyListScope $this, Object key, Object contentType, Function4 content) {
        super.stickyHeader(key, contentType, content);
    }

    static /* synthetic */ void item$default(LazyListScope r1, Object r2, Object r3, Function3 r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.item(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    default void item(Object key, Object contentType, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> r5) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void item$default(LazyListScope r0, Object r1, Function3 r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        r0.item(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object key, Function3 content) {
        item(key, null, content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope r0, int r1, Function1 r2, AnonymousClass1 r3, Function4 r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 4) == 0) goto L9;
        r3 = AnonymousClass1.INSTANCE;
    L9:
        r0.items(r1, r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    default void items(int count, Function1<? super Integer, ? extends Object> r4, Function1<? super Integer, ? extends Object> r5, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r6) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void items$default(LazyListScope r0, int r1, Function1 r2, Function4 r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r0.items(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int count, Function1 key, Function4 itemContent) {
        items(count, key, AnonymousClass2.INSTANCE, itemContent);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope r1, Object r2, Object r3, Function3 r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.stickyHeader(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the overload with indexing capabilities.", replaceWith = @ReplaceWith(expression = "stickyHeader(key, contentType, { _ -> content() })", imports = {}))
    /* synthetic */ default void stickyHeader(Object key, Object contentType, final Function3 content) {
        stickyHeader(key, contentType, ComposableLambdaKt.composableLambdaInstance(-447767093, true, new C03091(content)));
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope r1, Object r2, Object r3, Function4 r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.stickyHeader(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
    }

    default void stickyHeader(Object key, Object contentType, final Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r6) {
        item(key, contentType, ComposableLambdaKt.composableLambdaInstance(628101784, true, new C03102(r6)));
    }
}
