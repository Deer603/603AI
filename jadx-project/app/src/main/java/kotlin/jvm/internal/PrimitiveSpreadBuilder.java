package kotlin.jvm.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\bJ\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eX\u0082\u0004¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    private static /* synthetic */ void getSpreads$annotations() {
    }

    protected abstract int getSize(T r1);

    public PrimitiveSpreadBuilder(int r2) {
        this.size = r2;
        this.spreads = (T[]) new Object[this.size];
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int r1) {
        this.position = r1;
    }

    public final void addSpread(T r4) {
        Intrinsics.checkNotNullParameter(r4, "spreadArgument");
        T[] r0 = this.spreads;
        int r1 = this.position;
        this.position = r1 + 1;
        r0[r1] = r4;
    }

    protected final int size() {
        int totalLength = 0;
        int i = 0;
        int r2 = this.size - 1;
        if (0 > r2) goto L11;
    L4:
        T r4 = this.spreads[i];
        if (r4 == null) goto L7;
        int r5 = getSize(r4);
    L8:
        totalLength = totalLength + r5;
        if (i == r2) goto L11;
        i = i + 1;
        goto L4
    L7:
        r5 = 1;
    L11:
        return totalLength;
    }

    protected final T toArray(T r8, T r9) {
        Intrinsics.checkNotNullParameter(r8, "values");
        Intrinsics.checkNotNullParameter(r9, "result");
        int dstIndex = 0;
        int copyValuesFrom = 0;
        int i = 0;
        int r3 = this.size - 1;
        if (0 > r3) goto L11;
    L4:
        T r4 = this.spreads[i];
        if (r4 == null) goto L9;
        if (copyValuesFrom >= i) goto L8;
        System.arraycopy(r8, copyValuesFrom, r9, dstIndex, i - copyValuesFrom);
        dstIndex = dstIndex + (i - copyValuesFrom);
    L8:
        int spreadSize = getSize(r4);
        System.arraycopy(r4, 0, r9, dstIndex, spreadSize);
        dstIndex = dstIndex + spreadSize;
        copyValuesFrom = i + 1;
    L9:
        if (i == r3) goto L11;
        i = i + 1;
    L11:
        int i2 = this.size;
        if (copyValuesFrom >= i2) goto L14;
        System.arraycopy(r8, copyValuesFrom, r9, dstIndex, this.size - copyValuesFrom);
    L14:
        return r9;
    }
}
