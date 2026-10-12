package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/luchime/huiyuan/ChatRecord;", "", "id", "", "isUser", "", "text", "", "tag", "sourceQuote", "timestamp", "modelId", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()J", "()Z", "getText", "()Ljava/lang/String;", "getTag", "getSourceQuote", "getTimestamp", "getModelId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatRecord {
    public static final int $stable = 0;
    private final long id;
    private final boolean isUser;
    private final String modelId;
    private final String sourceQuote;
    private final String tag;
    private final String text;
    private final long timestamp;

    public static /* synthetic */ ChatRecord copy$default(ChatRecord chatRecord, long j, boolean z, String str, String str2, String str3, long j2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chatRecord.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            z = chatRecord.isUser;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = chatRecord.text;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = chatRecord.tag;
        }
        return chatRecord.copy(j3, z2, str5, str2, (i & 16) != 0 ? chatRecord.sourceQuote : str3, (i & 32) != 0 ? chatRecord.timestamp : j2, (i & 64) != 0 ? chatRecord.modelId : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsUser() {
        return this.isUser;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSourceQuote() {
        return this.sourceQuote;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    public final ChatRecord copy(long id, boolean isUser, String text, String tag, String sourceQuote, long timestamp, String modelId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        return new ChatRecord(id, isUser, text, tag, sourceQuote, timestamp, modelId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRecord)) {
            return false;
        }
        ChatRecord chatRecord = (ChatRecord) other;
        return this.id == chatRecord.id && this.isUser == chatRecord.isUser && Intrinsics.areEqual(this.text, chatRecord.text) && Intrinsics.areEqual(this.tag, chatRecord.tag) && Intrinsics.areEqual(this.sourceQuote, chatRecord.sourceQuote) && this.timestamp == chatRecord.timestamp && Intrinsics.areEqual(this.modelId, chatRecord.modelId);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Boolean.hashCode(this.isUser)) * 31) + this.text.hashCode()) * 31) + (this.tag == null ? 0 : this.tag.hashCode())) * 31) + (this.sourceQuote != null ? this.sourceQuote.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.modelId.hashCode();
    }

    public String toString() {
        return "ChatRecord(id=" + this.id + ", isUser=" + this.isUser + ", text=" + this.text + ", tag=" + this.tag + ", sourceQuote=" + this.sourceQuote + ", timestamp=" + this.timestamp + ", modelId=" + this.modelId + ")";
    }

    public ChatRecord(long id, boolean isUser, String text, String tag, String sourceQuote, long timestamp, String modelId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        this.id = id;
        this.isUser = isUser;
        this.text = text;
        this.tag = tag;
        this.sourceQuote = sourceQuote;
        this.timestamp = timestamp;
        this.modelId = modelId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatRecord(long j, boolean z, String str, String str2, String str3, long j2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i & 64) == 0) {
            str5 = str4;
        } else {
            str5 = "HUIYUAN";
        }
        this(j, z, str, str2, str3, j2, str5);
    }

    public final long getId() {
        return this.id;
    }

    public final boolean isUser() {
        return this.isUser;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getSourceQuote() {
        return this.sourceQuote;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getModelId() {
        return this.modelId;
    }
}
