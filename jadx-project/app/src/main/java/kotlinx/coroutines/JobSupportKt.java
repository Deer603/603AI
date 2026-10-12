package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_RETRY", "COMPLETING_WAITING_CHILDREN", "EMPTY_ACTIVE", "Lkotlinx/coroutines/Empty;", "EMPTY_NEW", "FALSE", "", "RETRY", "SEALED", "TOO_LATE_TO_CANCEL", "TRUE", "boxIncomplete", "", "unboxState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JobSupportKt {
    private static final Symbol COMPLETING_ALREADY = null;
    private static final Symbol COMPLETING_RETRY = null;
    public static final Symbol COMPLETING_WAITING_CHILDREN = null;
    private static final Empty EMPTY_ACTIVE = null;
    private static final Empty EMPTY_NEW = null;
    private static final int FALSE = 0;
    private static final int RETRY = -1;
    private static final Symbol SEALED = null;
    private static final Symbol TOO_LATE_TO_CANCEL = null;
    private static final int TRUE = 1;

    public static final /* synthetic */ Symbol access$getCOMPLETING_ALREADY$p() {
        return COMPLETING_ALREADY;
    }

    public static final /* synthetic */ Symbol access$getCOMPLETING_RETRY$p() {
        return COMPLETING_RETRY;
    }

    public static final /* synthetic */ Empty access$getEMPTY_ACTIVE$p() {
        return EMPTY_ACTIVE;
    }

    public static final /* synthetic */ Empty access$getEMPTY_NEW$p() {
        return EMPTY_NEW;
    }

    public static final /* synthetic */ Symbol access$getSEALED$p() {
        return SEALED;
    }

    public static final /* synthetic */ Symbol access$getTOO_LATE_TO_CANCEL$p() {
        return TOO_LATE_TO_CANCEL;
    }

    public static final Object boxIncomplete(Object $this$boxIncomplete) {
        if (($this$boxIncomplete instanceof Incomplete) == false) goto L6;
        return new IncompleteStateBox((Incomplete) $this$boxIncomplete);
    L6:
        return $this$boxIncomplete;
    }

    public static final Object unboxState(Object $this$unboxState) {
        if (($this$unboxState instanceof IncompleteStateBox) == false) goto L5;
        IncompleteStateBox r0 = (IncompleteStateBox) $this$unboxState;
    L6:
        if (r0 == null) goto L10;
        Incomplete r1 = r0.state;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return $this$unboxState;
    L5:
        r0 = null;
        goto L6
    }

    static {
        COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");
        COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
        COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");
        TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");
        SEALED = new Symbol("SEALED");
        EMPTY_NEW = new Empty(false);
        EMPTY_ACTIVE = new Empty(true);
    }
}
