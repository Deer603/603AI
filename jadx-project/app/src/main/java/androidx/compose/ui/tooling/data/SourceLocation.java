package androidx.compose.ui.tooling.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "lineNumber", "", "offset", "length", "sourceFile", "", "packageHash", "(IIILjava/lang/String;I)V", "getLength", "()I", "getLineNumber", "getOffset", "getPackageHash", "getSourceFile", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SourceLocation {
    public static final int $stable = 0;
    private final int length;
    private final int lineNumber;
    private final int offset;
    private final int packageHash;
    private final String sourceFile;

    static {
    }

    public static /* synthetic */ SourceLocation copy$default(SourceLocation r0, int r1, int r2, int r3, String r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.lineNumber;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.offset;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.length;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.sourceFile;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.packageHash;
    L17:
        String r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.lineNumber;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.length;
    }

    public final String component4() {
        return this.sourceFile;
    }

    public final int component5() {
        return this.packageHash;
    }

    public final SourceLocation copy(int r7, int r8, int r9, String r10, int r11) {
        return new SourceLocation(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof SourceLocation) == true) goto L8;
        return false;
    L8:
        SourceLocation r1 = (SourceLocation) r6;
        if (this.lineNumber == r1.lineNumber) goto L12;
        return false;
    L12:
        if (this.offset == r1.offset) goto L15;
        return false;
    L15:
        if (this.length == r1.length) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.sourceFile, r1.sourceFile) == true) goto L21;
        return false;
    L21:
        if (this.packageHash == r1.packageHash) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r1 = ((((Integer.hashCode(this.lineNumber) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.length)) * 31;
        if (this.sourceFile != null) goto L5;
        int r2 = 0;
    L7:
        return ((r1 + r2) * 31) + Integer.hashCode(this.packageHash);
    L5:
        r2 = this.sourceFile.hashCode();
        goto L7
    }

    public String toString() {
        return "SourceLocation(lineNumber=" + this.lineNumber + ", offset=" + this.offset + ", length=" + this.length + ", sourceFile=" + this.sourceFile + ", packageHash=" + this.packageHash + ')';
    }

    public SourceLocation(int lineNumber, int offset, int length, String sourceFile, int packageHash) {
        this.lineNumber = lineNumber;
        this.offset = offset;
        this.length = length;
        this.sourceFile = sourceFile;
        this.packageHash = packageHash;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLength() {
        return this.length;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }
}
