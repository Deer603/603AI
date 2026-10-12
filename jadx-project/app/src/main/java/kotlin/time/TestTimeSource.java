package kotlin.time;

import kotlin.Metadata;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "reading", "", "read", "plusAssign", "", "duration", "Lkotlin/time/Duration;", "plusAssign-LRDsOJo", "(J)V", "overflow", "overflow-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
        return this.reading;
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m8873plusAssignLRDsOJo(long duration) {
        long longDelta = Duration.m8803toLongimpl(duration, getUnit());
        boolean r11 = true;
        if (((longDelta - 1) | 1) != Long.MAX_VALUE) goto L5;
        int $i$f$isSaturated = 1;
    L6:
        if ($i$f$isSaturated != 0) goto L13;
        long newReading = this.reading + longDelta;
        if ((this.reading ^ longDelta) >= 0) goto L10;
    L12:
        this.reading = newReading;
        return;
    L10:
        if ((this.reading ^ newReading) >= 0) goto L12;
        m8872overflowLRDsOJo(duration);
        goto L12
    L13:
        long half = Duration.m8767divUwyO8pc(duration, 2);
        long $this$isSaturated$iv = Duration.m8803toLongimpl(half, getUnit());
        if ((($this$isSaturated$iv - 1) | 1) == Long.MAX_VALUE) goto L17;
        r11 = false;
    L17:
        if (r11 == true) goto L24;
        long readingBefore = this.reading;
        m8873plusAssignLRDsOJo(half);     // Catch: IllegalStateException -> L21
        m8873plusAssignLRDsOJo(Duration.m8792minusLRDsOJo(duration, half));     // Catch: IllegalStateException -> L21
        return;
    L21:
        e = move-exception;
        this.reading = readingBefore;
        throw e;
    L24:
        m8872overflowLRDsOJo(duration);
        return;
    L5:
        $i$f$isSaturated = 0;
        goto L6
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m8872overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(getUnit()) + " is advanced by " + Duration.m8804toStringimpl(duration) + '.');
    }
}
