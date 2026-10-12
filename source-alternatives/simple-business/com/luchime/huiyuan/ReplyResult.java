package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/luchime/huiyuan/ReplyResult;", "", "kind", "", "text", "tag", "entry", "Lcom/luchime/huiyuan/LexiconEntry;", "dimension", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getText", "getTag", "getEntry", "()Lcom/luchime/huiyuan/LexiconEntry;", "getDimension", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReplyResult {
    public static final int $stable = 0;
    private final String dimension;
    private final LexiconEntry entry;
    private final String kind;
    private final String tag;
    private final String text;

    static {
        $stable = 8;
    }

    public static /* synthetic */ ReplyResult copy$default(ReplyResult r0, String r1, String r2, String r3, LexiconEntry r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.kind;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.text;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.tag;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.entry;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.dimension;
    L17:
        LexiconEntry r8 = r4;
        String r9 = r5;
        String r10 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.tag;
    }

    public final LexiconEntry component4() {
        return this.entry;
    }

    public final String component5() {
        return this.dimension;
    }

    public final ReplyResult copy(String r8, String r9, String r10, LexiconEntry r11, String r12) {
        Intrinsics.checkNotNullParameter(r8, "kind");
        Intrinsics.checkNotNullParameter(r9, "text");
        Intrinsics.checkNotNullParameter(r10, "tag");
        Intrinsics.checkNotNullParameter(r12, "dimension");
        return new ReplyResult(r8, r9, r10, r11, r12);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ReplyResult) == true) goto L8;
        return false;
    L8:
        ReplyResult r1 = (ReplyResult) r6;
        if (Intrinsics.areEqual(this.kind, r1.kind) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.text, r1.text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.tag, r1.tag) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.entry, r1.entry) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.dimension, r1.dimension) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r1 = ((((this.kind.hashCode() * 31) + this.text.hashCode()) * 31) + this.tag.hashCode()) * 31;
        if (this.entry != null) goto L5;
        int r2 = 0;
    L7:
        return ((r1 + r2) * 31) + this.dimension.hashCode();
    L5:
        r2 = this.entry.hashCode();
        goto L7
    }

    public String toString() {
        return "ReplyResult(kind=" + this.kind + ", text=" + this.text + ", tag=" + this.tag + ", entry=" + this.entry + ", dimension=" + this.dimension + ")";
    }

    public ReplyResult(String kind, String text, String tag, LexiconEntry entry, String dimension) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        this.kind = kind;
        this.text = text;
        this.tag = tag;
        this.entry = entry;
        this.dimension = dimension;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTag() {
        return this.tag;
    }

    public final LexiconEntry getEntry() {
        return this.entry;
    }

    public final String getDimension() {
        return this.dimension;
    }
}
