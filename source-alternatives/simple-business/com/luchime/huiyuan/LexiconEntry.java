package com.luchime.huiyuan;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/luchime/huiyuan/LexiconEntry;", "", "category", "", "keys", "", "text", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getKeys", "()Ljava/util/List;", "getText", "searchIndex", "getSearchIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LexiconEntry {
    public static final int $stable = 0;
    private final String category;
    private final List<String> keys;
    private final String searchIndex;
    private final String text;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LexiconEntry copy$default(LexiconEntry r0, String r1, List r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.category;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.keys;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.text;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final String component1() {
        return this.category;
    }

    public final List<String> component2() {
        return this.keys;
    }

    public final String component3() {
        return this.text;
    }

    public final LexiconEntry copy(String r2, List<String> r3, String r4) {
        Intrinsics.checkNotNullParameter(r2, "category");
        Intrinsics.checkNotNullParameter(r3, "keys");
        Intrinsics.checkNotNullParameter(r4, "text");
        return new LexiconEntry(r2, r3, r4);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof LexiconEntry) == true) goto L8;
        return false;
    L8:
        LexiconEntry r1 = (LexiconEntry) r6;
        if (Intrinsics.areEqual(this.category, r1.category) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.keys, r1.keys) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.text, r1.text) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.category.hashCode() * 31) + this.keys.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "LexiconEntry(category=" + this.category + ", keys=" + this.keys + ", text=" + this.text + ")";
    }

    public LexiconEntry(String category, List<String> r21, String text) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(r21, "keys");
        Intrinsics.checkNotNullParameter(text, "text");
        this.category = category;
        this.keys = r21;
        this.text = text;
        StringBuilder r4 = new StringBuilder();
        String r7 = this.category.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r7, "toLowerCase(...)");
        r4.append(r7);
        r4.append(' ');
        String r9 = CollectionsKt.joinToString$default(this.keys, " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r9, "toLowerCase(...)");
        r4.append(r9);
        r4.append(' ');
        String r8 = this.text.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r8, "toLowerCase(...)");
        r4.append(r8);
        this.searchIndex = r4.toString();
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public final String getText() {
        return this.text;
    }

    public final String getSearchIndex() {
        return this.searchIndex;
    }
}
