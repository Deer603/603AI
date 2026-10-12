package com.luchime.huiyuan.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/luchime/huiyuan/ui/TimelineItem;", "", "id", "", "getId", "()J", "Message", "ThinkLog", "Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TimelineItem {

    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "Lcom/luchime/huiyuan/ui/TimelineItem;", "id", "", "isUser", "", "text", "", "tag", "sourceQuote", "timestamp", "isStreaming", "model", "Lcom/luchime/huiyuan/ui/AIModel;", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V", "getId", "()J", "()Z", "getText", "()Ljava/lang/String;", "getTag", "getSourceQuote", "getTimestamp", "getModel", "()Lcom/luchime/huiyuan/ui/AIModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Message implements TimelineItem {
        public static final int $stable = 0;
        private final long id;
        private final boolean isStreaming;
        private final boolean isUser;
        private final AIModel model;
        private final String sourceQuote;
        private final String tag;
        private final String text;
        private final long timestamp;

        static {
        }

        public static /* synthetic */ Message copy$default(Message r11, long r12, boolean r14, String r15, String r16, String r17, long r18, boolean r20, AIModel r21, int r22, Object r23) {
            if ((r22 & 1) == 0) goto L5;
            r12 = r11.id;
        L5:
            long r1 = r12;
            if ((r22 & 2) == 0) goto L8;
            r14 = r11.isUser;
        L8:
            boolean r3 = r14;
            if ((r22 & 4) == 0) goto L11;
            r15 = r11.text;
        L11:
            String r4 = r15;
            if ((r22 & 8) == 0) goto L14;
            String r5 = r11.tag;
        L16:
            if ((r22 & 16) == 0) goto L18;
            String r6 = r11.sourceQuote;
        L20:
            if ((r22 & 32) == 0) goto L22;
            long r7 = r11.timestamp;
        L24:
            if ((r22 & 64) == 0) goto L26;
            boolean r9 = r11.isStreaming;
        L28:
            if ((r22 & 128) == 0) goto L30;
            AIModel r10 = r11.model;
        L32:
            return r11.copy(r1, r3, r4, r5, r6, r7, r9, r10);
        L30:
            r10 = r21;
            goto L32
        L26:
            r9 = r20;
            goto L28
        L22:
            r7 = r18;
            goto L24
        L18:
            r6 = r17;
            goto L20
        L14:
            r5 = r16;
            goto L16
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

        public final boolean component7() {
            return this.isStreaming;
        }

        public final AIModel component8() {
            return this.model;
        }

        public final Message copy(long r13, boolean r15, String r16, String r17, String r18, long r19, boolean r21, AIModel r22) {
            Intrinsics.checkNotNullParameter(r16, "text");
            Intrinsics.checkNotNullParameter(r22, "model");
            return new Message(r13, r15, r16, r17, r18, r19, r21, r22);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Message) == true) goto L8;
            return false;
        L8:
            Message r1 = (Message) r8;
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
            if (this.isStreaming == r1.isStreaming) goto L30;
            return false;
        L30:
            if (this.model == r1.model) goto L32;
            return false;
        L32:
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
            return ((((((r0 + r3) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isStreaming)) * 31) + this.model.hashCode();
        L5:
            r2 = this.tag.hashCode();
            goto L6
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

        public /* synthetic */ Message(long r2, boolean r4, String r5, String r6, String r7, long r8, boolean r10, AIModel r11, int r12, DefaultConstructorMarker r13) {
            if ((r12 & 8) == 0) goto L6;
            r6 = null;
        L6:
            if ((r12 & 16) == 0) goto L9;
            r7 = null;
        L9:
            if ((r12 & 32) == 0) goto L12;
            r8 = System.currentTimeMillis();
        L12:
            if ((r12 & 64) == 0) goto L15;
            r10 = false;
        L15:
            if ((r12 & 128) == 0) goto L17;
            AIModel r14 = AIModel.HUIYUAN;
        L18:
            long r9 = r8;
            String r15 = r7;
            this(r2, r4, r5, r6, r15, r9, r10, r14);
            return;
        L17:
            r14 = r11;
            goto L18
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
    public static final class ThinkLog implements TimelineItem {
        public static final int $stable = 0;
        private final long id;
        private final List<String> lines;
        private final AIModel model;

        static {
            $stable = 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ThinkLog copy$default(ThinkLog r0, long r1, List r3, AIModel r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.id;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = r0.lines;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r4 = r0.model;
        L12:
            return r0.copy(r1, r3, r4);
        }

        public final long component1() {
            return this.id;
        }

        public final List<String> component2() {
            return this.lines;
        }

        public final AIModel component3() {
            return this.model;
        }

        public final ThinkLog copy(long r2, List<String> r4, AIModel r5) {
            Intrinsics.checkNotNullParameter(r4, "lines");
            Intrinsics.checkNotNullParameter(r5, "model");
            return new ThinkLog(r2, r4, r5);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof ThinkLog) == true) goto L8;
            return false;
        L8:
            ThinkLog r1 = (ThinkLog) r8;
            if (this.id == r1.id) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.lines, r1.lines) == true) goto L15;
            return false;
        L15:
            if (this.model == r1.model) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.id) * 31) + this.lines.hashCode()) * 31) + this.model.hashCode();
        }

        public String toString() {
            return "ThinkLog(id=" + this.id + ", lines=" + this.lines + ", model=" + this.model + ")";
        }

        public ThinkLog(long id, List<String> r4, AIModel model) {
            Intrinsics.checkNotNullParameter(r4, "lines");
            Intrinsics.checkNotNullParameter(model, "model");
            this.id = id;
            this.lines = r4;
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

    long getId();
}
