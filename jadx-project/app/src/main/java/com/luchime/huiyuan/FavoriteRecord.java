package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/luchime/huiyuan/FavoriteRecord;", "", "text", "", "category", "savedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getText", "()Ljava/lang/String;", "getCategory", "getSavedAt", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FavoriteRecord {
    public static final int $stable = 0;
    private final String category;
    private final long savedAt;
    private final String text;

    public static /* synthetic */ FavoriteRecord copy$default(FavoriteRecord favoriteRecord, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoriteRecord.text;
        }
        if ((i & 2) != 0) {
            str2 = favoriteRecord.category;
        }
        if ((i & 4) != 0) {
            j = favoriteRecord.savedAt;
        }
        return favoriteRecord.copy(str, str2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSavedAt() {
        return this.savedAt;
    }

    public final FavoriteRecord copy(String text, String category, long savedAt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(category, "category");
        return new FavoriteRecord(text, category, savedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteRecord)) {
            return false;
        }
        FavoriteRecord favoriteRecord = (FavoriteRecord) other;
        return Intrinsics.areEqual(this.text, favoriteRecord.text) && Intrinsics.areEqual(this.category, favoriteRecord.category) && this.savedAt == favoriteRecord.savedAt;
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
