package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\b\u0010\b\u001a\u00020\tH\u0002\u001a\u000e\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"MAGIC", "", "MARKED_NULL", "Lkotlinx/coroutines/debug/internal/Marked;", "MARKED_TRUE", "MIN_CAPACITY", "REHASH", "Lkotlinx/coroutines/internal/Symbol;", "noImpl", "", "mark", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentWeakMapKt {
    private static final int MAGIC = -1640531527;
    private static final Marked MARKED_NULL = null;
    private static final Marked MARKED_TRUE = null;
    private static final int MIN_CAPACITY = 16;
    private static final Symbol REHASH = null;

    public static final /* synthetic */ Symbol access$getREHASH$p() {
        return REHASH;
    }

    public static final /* synthetic */ Marked access$mark(Object $receiver) {
        return mark($receiver);
    }

    public static final /* synthetic */ Void access$noImpl() {
        return noImpl();
    }

    static {
        REHASH = new Symbol("REHASH");
        MARKED_NULL = new Marked(null);
        MARKED_TRUE = new Marked(true);
    }

    private static final Marked mark(Object $this$mark) {
        if ($this$mark != null) goto L5;
        return MARKED_NULL;
    L5:
        if (Intrinsics.areEqual($this$mark, true) == false) goto L8;
        return MARKED_TRUE;
    L8:
        return new Marked($this$mark);
    }

    private static final Void noImpl() {
        throw new UnsupportedOperationException("not implemented");
    }
}
