package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: CharSequenceCharacterIterator.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\t\u0010\u0013\u001a\u00020\rH\u0096\u0002J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "charSequence", "", "start", "", "end", "(Ljava/lang/CharSequence;II)V", "index", "clone", "", "current", "", "first", "getBeginIndex", "getEndIndex", "getIndex", "last", "next", "previous", "setIndex", "position", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 0;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    static {
        $stable = 8;
    }

    public CharSequenceCharacterIterator(CharSequence charSequence, int start, int end) {
        this.charSequence = charSequence;
        this.start = start;
        this.end = end;
        this.index = this.start;
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int r0 = this.start;
        int r1 = this.end;
        int r2 = this.end;
        if (r0 != r1) goto L5;
        this.index = r2;
        return CharCompanionObject.MAX_VALUE;
    L5:
        this.index = r2 - 1;
        return this.charSequence.charAt(this.index);
    }

    @Override // java.text.CharacterIterator
    public char current() {
        if (this.index != this.end) goto L6;
        return CharCompanionObject.MAX_VALUE;
    L6:
        return this.charSequence.charAt(this.index);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        this.index++;
        if (this.index < this.end) goto L6;
        this.index = this.end;
        return CharCompanionObject.MAX_VALUE;
    L6:
        return this.charSequence.charAt(this.index);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        if (this.index > this.start) goto L5;
        return CharCompanionObject.MAX_VALUE;
    L5:
        this.index--;
        return this.charSequence.charAt(this.index);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int position) {
        int r0 = this.start;
        boolean r2 = false;
        if (position > this.end) goto L6;
        if (r0 > position) goto L6;
        r2 = true;
    L6:
        if (r2 == false) goto L10;
        this.index = position;
        return current();
    L10:
        throw new IllegalArgumentException("invalid position");
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        return super.clone();
    L6:
        throw new InternalError();
    }
}
