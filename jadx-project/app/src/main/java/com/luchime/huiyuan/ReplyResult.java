package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/luchime/huiyuan/ReplyResult;", "", "kind", "", "text", "tag", "entry", "Lcom/luchime/huiyuan/LexiconEntry;", "dimension", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V", "getKind", "()Ljava/lang/String;", "getText", "getTag", "getEntry", "()Lcom/luchime/huiyuan/LexiconEntry;", "getDimension", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReplyResult {
    public static final int $stable = 8;
    private final String dimension;
    private final LexiconEntry entry;
    private final String kind;
    private final String tag;
    private final String text;

    public static /* synthetic */ ReplyResult copy$default(ReplyResult replyResult, String str, String str2, String str3, LexiconEntry lexiconEntry, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyResult.kind;
        }
        if ((i & 2) != 0) {
            str2 = replyResult.text;
        }
        if ((i & 4) != 0) {
            str3 = replyResult.tag;
        }
        if ((i & 8) != 0) {
            lexiconEntry = replyResult.entry;
        }
        if ((i & 16) != 0) {
            str4 = replyResult.dimension;
        }
        String str5 = str4;
        String str6 = str3;
        return replyResult.copy(str, str2, str6, lexiconEntry, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LexiconEntry getEntry() {
        return this.entry;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDimension() {
        return this.dimension;
    }

    public final ReplyResult copy(String kind, String text, String tag, LexiconEntry entry, String dimension) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        return new ReplyResult(kind, text, tag, entry, dimension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyResult)) {
            return false;
        }
        ReplyResult replyResult = (ReplyResult) other;
        return Intrinsics.areEqual(this.kind, replyResult.kind) && Intrinsics.areEqual(this.text, replyResult.text) && Intrinsics.areEqual(this.tag, replyResult.tag) && Intrinsics.areEqual(this.entry, replyResult.entry) && Intrinsics.areEqual(this.dimension, replyResult.dimension);
    }

    public int hashCode() {
        return (((((((this.kind.hashCode() * 31) + this.text.hashCode()) * 31) + this.tag.hashCode()) * 31) + (this.entry == null ? 0 : this.entry.hashCode())) * 31) + this.dimension.hashCode();
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
