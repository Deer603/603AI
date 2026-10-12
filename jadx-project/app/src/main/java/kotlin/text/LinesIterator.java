package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\t\u0010\u000e\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/text/LinesIterator;", "", "", "string", "", "<init>", "(Ljava/lang/CharSequence;)V", "state", "", "tokenStartIndex", "delimiterStartIndex", "delimiterLength", "hasNext", "", "next", "State", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class LinesIterator implements Iterator<String>, KMappedMarker {

    @Deprecated
    public static final int EXHAUSTED = 2;

    @Deprecated
    public static final int HAS_NEXT = 1;
    private static final State State = null;

    @Deprecated
    public static final int UNKNOWN = 0;
    private int delimiterLength;
    private int delimiterStartIndex;
    private int state;
    private final CharSequence string;
    private int tokenStartIndex;

    /* JADX INFO: compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/text/LinesIterator$State;", "", "<init>", "()V", "UNKNOWN", "", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class State {
        public /* synthetic */ State(DefaultConstructorMarker r1) {
            this();
        }

        private State() {
        }
    }

    static {
        State = new State(null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public LinesIterator(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.string = string;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
        return next2();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.state != 0) goto L5;
        int r3 = 2;
        if (this.delimiterLength >= 0) goto L12;
        this.state = 2;
        return false;
    L12:
        int _delimiterLength = -1;
        int _delimiterStartIndex = this.string.length();
        int idx = this.tokenStartIndex;
        int r5 = this.string.length();
    L13:
        if (idx >= r5) goto L26;
        char c = this.string.charAt(idx);
        switch(c) {
            case 10: goto L18;
            case 13: goto L18;
            default: goto L16;
        };
    L16:
        idx = idx + 1;
        goto L13
    L18:
        if (c == '\r') goto L20;
    L24:
        r3 = 1;
    L25:
        _delimiterLength = r3;
        _delimiterStartIndex = idx;
        goto L26
    L20:
        if ((idx + 1) >= this.string.length()) goto L24;
        if (this.string.charAt(idx + 1) != '\n') goto L24;
    L26:
        this.state = 1;
        this.delimiterLength = _delimiterLength;
        this.delimiterStartIndex = _delimiterStartIndex;
        return true;
    L5:
        if (this.state == 1) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
    public String next2() {
        if (hasNext() == false) goto L7;
        this.state = 0;
        int lastIndex = this.delimiterStartIndex;
        int firstIndex = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterStartIndex + this.delimiterLength;
        return this.string.subSequence(firstIndex, lastIndex).toString();
    L7:
        throw new NoSuchElementException();
    }
}
