package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.time.Duration;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SharingStartedKt {
    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m8958WhileSubscribed5qebJ5I$default(SharingStarted.Companion r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Duration.Companion.m8855getZEROUwyO8pc();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = Duration.Companion.m8853getINFINITEUwyO8pc();
    L9:
        return m8957WhileSubscribed5qebJ5I(r0, r1, r3);
    }

    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m8957WhileSubscribed5qebJ5I(SharingStarted.Companion $this$WhileSubscribed_u2d5qebJ5I, long stopTimeout, long replayExpiration) {
        return new StartedWhileSubscribed(Duration.m8775getInWholeMillisecondsimpl(stopTimeout), Duration.m8775getInWholeMillisecondsimpl(replayExpiration));
    }
}
