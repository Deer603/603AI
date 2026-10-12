package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/luchime/huiyuan/FavoriteRecord;", "", "text", "", "category", "savedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getText", "()Ljava/lang/String;", "getCategory", "getSavedAt", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FavoriteRecord {
    public static final int $stable = 0;
    private final String category;
    private final long savedAt;
    private final String text;

    static {
    }

    public static /* synthetic */ FavoriteRecord copy$default(FavoriteRecord r0, String r1, String r2, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.category;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.savedAt;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.category;
    }

    public final long component3() {
        return this.savedAt;
    }

    public final FavoriteRecord copy(String r2, String r3, long r4) {
        Intrinsics.checkNotNullParameter(r2, "text");
        Intrinsics.checkNotNullParameter(r3, "category");
        return new FavoriteRecord(r2, r3, r4);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FavoriteRecord) == true) goto L8;
        return false;
    L8:
        FavoriteRecord r1 = (FavoriteRecord) r8;
        if (Intrinsics.areEqual(this.text, r1.text) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.category, r1.category) == true) goto L15;
        return false;
    L15:
        if (this.savedAt == r1.savedAt) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.category.hashCode()) * 31) + Long.hashCode(this.savedAt);
    }

    public String toString() {
        return "FavoriteRecord(text=" + this.text + ", category=" + this.category + ", savedAt=" + this.savedAt + ")";
    }

    public FavoriteRecord(String text, String category, long savedAt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(category, "category");
        this.text = text;
        this.category = category;
        this.savedAt = savedAt;
    }

    public final String getText() {
        return this.text;
    }

    public final String getCategory() {
        return this.category;
    }

    public final long getSavedAt() {
        return this.savedAt;
    }
}
