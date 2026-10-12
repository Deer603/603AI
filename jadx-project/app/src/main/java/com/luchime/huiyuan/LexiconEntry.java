package com.luchime.huiyuan;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/luchime/huiyuan/LexiconEntry;", "", "category", "", "keys", "", "text", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getKeys", "()Ljava/util/List;", "getText", "searchIndex", "getSearchIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LexiconEntry {
    public static final int $stable = 8;
    private final String category;
    private final List<String> keys;
    private final String searchIndex;
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LexiconEntry copy$default(LexiconEntry lexiconEntry, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lexiconEntry.category;
        }
        if ((i & 2) != 0) {
            list = lexiconEntry.keys;
        }
        if ((i & 4) != 0) {
            str2 = lexiconEntry.text;
        }
        return lexiconEntry.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final List<String> component2() {
        return this.keys;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LexiconEntry copy(String category, List<String> keys, String text) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(text, "text");
        return new LexiconEntry(category, keys, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexiconEntry)) {
            return false;
        }
        LexiconEntry lexiconEntry = (LexiconEntry) other;
        return Intrinsics.areEqual(this.category, lexiconEntry.category) && Intrinsics.areEqual(this.keys, lexiconEntry.keys) && Intrinsics.areEqual(this.text, lexiconEntry.text);
    }

    public int hashCode() {
        return (((this.category.hashCode() * 31) + this.keys.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "LexiconEntry(category=" + this.category + ", keys=" + this.keys + ", text=" + this.text + ")";
    }

    public LexiconEntry(String category, List<String> keys, String text) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(text, "text");
        this.category = category;
        this.keys = keys;
        this.text = text;
        StringBuilder sb = new StringBuilder();
        String lowerCase = this.category.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        sb.append(' ');
        String lowerCase2 = CollectionsKt.joinToString$default(this.keys, " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        sb.append(lowerCase2);
        sb.append(' ');
        String lowerCase3 = this.text.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        sb.append(lowerCase3);
        this.searchIndex = sb.toString();
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
