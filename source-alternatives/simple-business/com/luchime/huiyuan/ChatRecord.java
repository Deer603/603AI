package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/luchime/huiyuan/ChatRecord;", "", "id", "", "isUser", "", "text", "", "tag", "sourceQuote", "timestamp", "modelId", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()J", "()Z", "getText", "()Ljava/lang/String;", "getTag", "getSourceQuote", "getTimestamp", "getModelId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatRecord {
    public static final int $stable = 0;
    private final long id;
    private final boolean isUser;
    private final String modelId;
    private final String sourceQuote;
    private final String tag;
    private final String text;
    private final long timestamp;

    static {
    }

    public static /* synthetic */ ChatRecord copy$default(ChatRecord r10, long r11, boolean r13, String r14, String r15, String r16, long r17, String r19, int r20, Object r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = r10.id;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        r13 = r10.isUser;
    L8:
        boolean r3 = r13;
        if ((r20 & 4) == 0) goto L11;
        r14 = r10.text;
    L11:
        String r4 = r14;
        if ((r20 & 8) == 0) goto L14;
        r15 = r10.tag;
    L14:
        String r5 = r15;
        if ((r20 & 16) == 0) goto L17;
        String r6 = r10.sourceQuote;
    L19:
        if ((r20 & 32) == 0) goto L21;
        long r7 = r10.timestamp;
    L23:
        if ((r20 & 64) == 0) goto L25;
        String r9 = r10.modelId;
    L27:
        return r10.copy(r1, r3, r4, r5, r6, r7, r9);
    L25:
        r9 = r19;
        goto L27
    L21:
        r7 = r17;
        goto L23
    L17:
        r6 = r16;
        goto L19
    }

    public final long component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isUser;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.tag;
    }

    public final String component5() {
        return this.sourceQuote;
    }

    public final long component6() {
        return this.timestamp;
    }

    public final String component7() {
        return this.modelId;
    }

    public final ChatRecord copy(long r12, boolean r14, String r15, String r16, String r17, long r18, String r20) {
        Intrinsics.checkNotNullParameter(r15, "text");
        Intrinsics.checkNotNullParameter(r20, "modelId");
        return new ChatRecord(r12, r14, r15, r16, r17, r18, r20);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ChatRecord) == true) goto L8;
        return false;
    L8:
        ChatRecord r1 = (ChatRecord) r8;
        if (this.id == r1.id) goto L12;
        return false;
    L12:
        if (this.isUser == r1.isUser) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.text, r1.text) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.tag, r1.tag) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.sourceQuote, r1.sourceQuote) == true) goto L24;
        return false;
    L24:
        if (this.timestamp == r1.timestamp) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.modelId, r1.modelId) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r1 = ((((Long.hashCode(this.id) * 31) + Boolean.hashCode(this.isUser)) * 31) + this.text.hashCode()) * 31;
        int r3 = 0;
        if (this.tag != null) goto L5;
        int r2 = 0;
    L6:
        int r0 = (r1 + r2) * 31;
        if (this.sourceQuote == null) goto L11;
        r3 = this.sourceQuote.hashCode();
    L11:
        return ((((r0 + r3) * 31) + Long.hashCode(this.timestamp)) * 31) + this.modelId.hashCode();
    L5:
        r2 = this.tag.hashCode();
        goto L6
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

    public /* synthetic */ ChatRecord(long r12, boolean r14, String r15, String r16, String r17, long r18, String r20, int r21, DefaultConstructorMarker r22) {
        if ((r21 & 64) == 0) goto L5;
        String r10 = "HUIYUAN";
    L6:
        this(r12, r14, r15, r16, r17, r18, r10);
        return;
    L5:
        r10 = r20;
        goto L6
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
