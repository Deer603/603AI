package com.luchime.huiyuan.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/luchime/huiyuan/ui/TimelineItem;", "", "id", "", "getId", "()J", "Message", "ThinkLog", "Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TimelineItem {
    long getId();

    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "Lcom/luchime/huiyuan/ui/TimelineItem;", "id", "", "isUser", "", "text", "", "tag", "sourceQuote", "timestamp", "isStreaming", "model", "Lcom/luchime/huiyuan/ui/AIModel;", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V", "getId", "()J", "()Z", "getText", "()Ljava/lang/String;", "getTag", "getSourceQuote", "getTimestamp", "getModel", "()Lcom/luchime/huiyuan/ui/AIModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Message implements TimelineItem {
        public static final int $stable = 0;
        private final long id;
        private final boolean isStreaming;
        private final boolean isUser;
        private final AIModel model;
        private final String sourceQuote;
        private final String tag;
        private final String text;
        private final long timestamp;

        public static /* synthetic */ Message copy$default(Message message, long j, boolean z, String str, String str2, String str3, long j2, boolean z2, AIModel aIModel, int i, Object obj) {
            if ((i & 1) != 0) {
                j = message.id;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                z = message.isUser;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                str = message.text;
            }
            return message.copy(j3, z3, str, (i & 8) != 0 ? message.tag : str2, (i & 16) != 0 ? message.sourceQuote : str3, (i & 32) != 0 ? message.timestamp : j2, (i & 64) != 0 ? message.isStreaming : z2, (i & 128) != 0 ? message.model : aIModel);
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
        public final boolean getIsStreaming() {
            return this.isStreaming;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final AIModel getModel() {
            return this.model;
        }

        public final Message copy(long id, boolean isUser, String text, String tag, String sourceQuote, long timestamp, boolean isStreaming, AIModel model) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(model, "model");
            return new Message(id, isUser, text, tag, sourceQuote, timestamp, isStreaming, model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return this.id == message.id && this.isUser == message.isUser && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.tag, message.tag) && Intrinsics.areEqual(this.sourceQuote, message.sourceQuote) && this.timestamp == message.timestamp && this.isStreaming == message.isStreaming && this.model == message.model;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.id) * 31) + Boolean.hashCode(this.isUser)) * 31) + this.text.hashCode()) * 31) + (this.tag == null ? 0 : this.tag.hashCode())) * 31) + (this.sourceQuote != null ? this.sourceQuote.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isStreaming)) * 31) + this.model.hashCode();
        }

        public String toString() {
            return "Message(id=" + this.id + ", isUser=" + this.isUser + ", text=" + this.text + ", tag=" + this.tag + ", sourceQuote=" + this.sourceQuote + ", timestamp=" + this.timestamp + ", isStreaming=" + this.isStreaming + ", model=" + this.model + ")";
        }

        public Message(long id, boolean isUser, String text, String tag, String sourceQuote, long timestamp, boolean isStreaming, AIModel model) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(model, "model");
            this.id = id;
            this.isUser = isUser;
            this.text = text;
            this.tag = tag;
            this.sourceQuote = sourceQuote;
            this.timestamp = timestamp;
            this.isStreaming = isStreaming;
            this.model = model;
        }

        @Override // com.luchime.huiyuan.ui.TimelineItem
        public long getId() {
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

        public final boolean isStreaming() {
            return this.isStreaming;
        }

        public final AIModel getModel() {
            return this.model;
        }
    }

    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;", "Lcom/luchime/huiyuan/ui/TimelineItem;", "id", "", "lines", "", "", "model", "Lcom/luchime/huiyuan/ui/AIModel;", "<init>", "(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)V", "getId", "()J", "getLines", "()Ljava/util/List;", "getModel", "()Lcom/luchime/huiyuan/ui/AIModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThinkLog implements TimelineItem {
        public static final int $stable = 8;
        private final long id;
        private final List<String> lines;
        private final AIModel model;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ThinkLog copy$default(ThinkLog thinkLog, long j, List list, AIModel aIModel, int i, Object obj) {
            if ((i & 1) != 0) {
                j = thinkLog.id;
            }
            if ((i & 2) != 0) {
                list = thinkLog.lines;
            }
            if ((i & 4) != 0) {
                aIModel = thinkLog.model;
            }
            return thinkLog.copy(j, list, aIModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        public final List<String> component2() {
            return this.lines;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AIModel getModel() {
            return this.model;
        }

        public final ThinkLog copy(long id, List<String> lines, AIModel model) {
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(model, "model");
            return new ThinkLog(id, lines, model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThinkLog)) {
                return false;
            }
            ThinkLog thinkLog = (ThinkLog) other;
            return this.id == thinkLog.id && Intrinsics.areEqual(this.lines, thinkLog.lines) && this.model == thinkLog.model;
        }

        public int hashCode() {
            return (((Long.hashCode(this.id) * 31) + this.lines.hashCode()) * 31) + this.model.hashCode();
        }

        public String toString() {
            return "ThinkLog(id=" + this.id + ", lines=" + this.lines + ", model=" + this.model + ")";
        }

        public ThinkLog(long id, List<String> lines, AIModel model) {
            Intrinsics.checkNotNullParameter(lines, "lines");
            Intrinsics.checkNotNullParameter(model, "model");
            this.id = id;
            this.lines = lines;
            this.model = model;
        }

        @Override // com.luchime.huiyuan.ui.TimelineItem
        public long getId() {
            return this.id;
        }

        public final List<String> getLines() {
            return this.lines;
        }

        public final AIModel getModel() {
            return this.model;
        }
    }
}
