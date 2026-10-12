package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0003\b±\u0001\b\u0000\u0018\u00002\u00020\u0001B½\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\u0003\u0012\u0006\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u00020\u0003\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\u0006\u0010P\u001a\u00020\u0003\u0012\u0006\u0010Q\u001a\u00020\u0003\u0012\u0006\u0010R\u001a\u00020\u0003\u0012\u0006\u0010S\u001a\u00020\u0003\u0012\u0006\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010W\u001a\u00020\u0003\u0012\u0006\u0010X\u001a\u00020\u0003\u0012\u0006\u0010Y\u001a\u00020\u0003¢\u0006\u0002\u0010ZR\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b^\u0010\\R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b_\u0010\\R\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b`\u0010\\R\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\ba\u0010\\R\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bb\u0010\\R\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bc\u0010\\R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bd\u0010\\R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\be\u0010\\R\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bf\u0010\\R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bg\u0010\\R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bh\u0010\\R\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bi\u0010\\R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bj\u0010\\R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bk\u0010\\R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bl\u0010\\R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bm\u0010\\R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bn\u0010\\R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bo\u0010\\R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bp\u0010\\R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bq\u0010\\R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\br\u0010\\R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bs\u0010\\R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bt\u0010\\R\u0019\u00102\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bu\u0010\\R\u0019\u0010/\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bv\u0010\\R\u0019\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bw\u0010\\R\u0019\u0010.\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bx\u0010\\R\u0019\u0010-\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\by\u0010\\R\u0019\u0010,\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\bz\u0010\\R\u0019\u0010+\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b{\u0010\\R\u0019\u0010*\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b|\u0010\\R\u0019\u0010)\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b}\u0010\\R\u0019\u00101\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b~\u0010\\R\u0019\u0010(\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010]\u001a\u0004\b\u007f\u0010\\R\u001a\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0080\u0001\u0010\\R\u001a\u00100\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0081\u0001\u0010\\R\u001a\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0082\u0001\u0010\\R\u001a\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0083\u0001\u0010\\R\u001a\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0084\u0001\u0010\\R\u001a\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0085\u0001\u0010\\R\u001a\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0086\u0001\u0010\\R\u001a\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0087\u0001\u0010\\R\u001a\u0010 \u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0088\u0001\u0010\\R\u001a\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0089\u0001\u0010\\R\u001a\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008a\u0001\u0010\\R\u001a\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008b\u0001\u0010\\R\u001a\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008c\u0001\u0010\\R\u001a\u0010?\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008d\u0001\u0010\\R\u001a\u0010>\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008e\u0001\u0010\\R\u001a\u00103\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u008f\u0001\u0010\\R\u001a\u0010=\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0090\u0001\u0010\\R\u001a\u0010<\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0091\u0001\u0010\\R\u001a\u0010;\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0092\u0001\u0010\\R\u001a\u0010:\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0093\u0001\u0010\\R\u001a\u00109\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0094\u0001\u0010\\R\u001a\u00108\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0095\u0001\u0010\\R\u001a\u00107\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0096\u0001\u0010\\R\u001a\u00106\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0097\u0001\u0010\\R\u001a\u00105\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0098\u0001\u0010\\R\u001a\u00104\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u0099\u0001\u0010\\R\u001a\u0010L\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009a\u0001\u0010\\R\u001a\u0010K\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009b\u0001\u0010\\R\u001a\u0010@\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009c\u0001\u0010\\R\u001a\u0010J\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009d\u0001\u0010\\R\u001a\u0010I\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009e\u0001\u0010\\R\u001a\u0010H\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u009f\u0001\u0010\\R\u001a\u0010G\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b \u0001\u0010\\R\u001a\u0010F\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¡\u0001\u0010\\R\u001a\u0010E\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¢\u0001\u0010\\R\u001a\u0010D\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b£\u0001\u0010\\R\u001a\u0010C\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¤\u0001\u0010\\R\u001a\u0010B\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¥\u0001\u0010\\R\u001a\u0010A\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¦\u0001\u0010\\R\u001a\u0010Y\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b§\u0001\u0010\\R\u001a\u0010X\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¨\u0001\u0010\\R\u001a\u0010M\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b©\u0001\u0010\\R\u001a\u0010W\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\bª\u0001\u0010\\R\u001a\u0010V\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b«\u0001\u0010\\R\u001a\u0010U\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¬\u0001\u0010\\R\u001a\u0010T\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b\u00ad\u0001\u0010\\R\u001a\u0010S\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b®\u0001\u0010\\R\u001a\u0010R\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b¯\u0001\u0010\\R\u001a\u0010Q\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b°\u0001\u0010\\R\u001a\u0010P\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b±\u0001\u0010\\R\u001a\u0010O\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b²\u0001\u0010\\R\u001a\u0010N\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010]\u001a\u0005\b³\u0001\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006´\u0001"}, d2 = {"Landroidx/compose/material3/TonalPalette;", "", "neutral100", "Landroidx/compose/ui/graphics/Color;", "neutral99", "neutral98", "neutral96", "neutral95", "neutral94", "neutral92", "neutral90", "neutral87", "neutral80", "neutral70", "neutral60", "neutral50", "neutral40", "neutral30", "neutral24", "neutral22", "neutral20", "neutral17", "neutral12", "neutral10", "neutral6", "neutral4", "neutral0", "neutralVariant100", "neutralVariant99", "neutralVariant98", "neutralVariant96", "neutralVariant95", "neutralVariant94", "neutralVariant92", "neutralVariant90", "neutralVariant87", "neutralVariant80", "neutralVariant70", "neutralVariant60", "neutralVariant50", "neutralVariant40", "neutralVariant30", "neutralVariant24", "neutralVariant22", "neutralVariant20", "neutralVariant17", "neutralVariant12", "neutralVariant10", "neutralVariant6", "neutralVariant4", "neutralVariant0", "primary100", "primary99", "primary95", "primary90", "primary80", "primary70", "primary60", "primary50", "primary40", "primary30", "primary20", "primary10", "primary0", "secondary100", "secondary99", "secondary95", "secondary90", "secondary80", "secondary70", "secondary60", "secondary50", "secondary40", "secondary30", "secondary20", "secondary10", "secondary0", "tertiary100", "tertiary99", "tertiary95", "tertiary90", "tertiary80", "tertiary70", "tertiary60", "tertiary50", "tertiary40", "tertiary30", "tertiary20", "tertiary10", "tertiary0", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNeutral0-0d7_KjU", "()J", "J", "getNeutral10-0d7_KjU", "getNeutral100-0d7_KjU", "getNeutral12-0d7_KjU", "getNeutral17-0d7_KjU", "getNeutral20-0d7_KjU", "getNeutral22-0d7_KjU", "getNeutral24-0d7_KjU", "getNeutral30-0d7_KjU", "getNeutral4-0d7_KjU", "getNeutral40-0d7_KjU", "getNeutral50-0d7_KjU", "getNeutral6-0d7_KjU", "getNeutral60-0d7_KjU", "getNeutral70-0d7_KjU", "getNeutral80-0d7_KjU", "getNeutral87-0d7_KjU", "getNeutral90-0d7_KjU", "getNeutral92-0d7_KjU", "getNeutral94-0d7_KjU", "getNeutral95-0d7_KjU", "getNeutral96-0d7_KjU", "getNeutral98-0d7_KjU", "getNeutral99-0d7_KjU", "getNeutralVariant0-0d7_KjU", "getNeutralVariant10-0d7_KjU", "getNeutralVariant100-0d7_KjU", "getNeutralVariant12-0d7_KjU", "getNeutralVariant17-0d7_KjU", "getNeutralVariant20-0d7_KjU", "getNeutralVariant22-0d7_KjU", "getNeutralVariant24-0d7_KjU", "getNeutralVariant30-0d7_KjU", "getNeutralVariant4-0d7_KjU", "getNeutralVariant40-0d7_KjU", "getNeutralVariant50-0d7_KjU", "getNeutralVariant6-0d7_KjU", "getNeutralVariant60-0d7_KjU", "getNeutralVariant70-0d7_KjU", "getNeutralVariant80-0d7_KjU", "getNeutralVariant87-0d7_KjU", "getNeutralVariant90-0d7_KjU", "getNeutralVariant92-0d7_KjU", "getNeutralVariant94-0d7_KjU", "getNeutralVariant95-0d7_KjU", "getNeutralVariant96-0d7_KjU", "getNeutralVariant98-0d7_KjU", "getNeutralVariant99-0d7_KjU", "getPrimary0-0d7_KjU", "getPrimary10-0d7_KjU", "getPrimary100-0d7_KjU", "getPrimary20-0d7_KjU", "getPrimary30-0d7_KjU", "getPrimary40-0d7_KjU", "getPrimary50-0d7_KjU", "getPrimary60-0d7_KjU", "getPrimary70-0d7_KjU", "getPrimary80-0d7_KjU", "getPrimary90-0d7_KjU", "getPrimary95-0d7_KjU", "getPrimary99-0d7_KjU", "getSecondary0-0d7_KjU", "getSecondary10-0d7_KjU", "getSecondary100-0d7_KjU", "getSecondary20-0d7_KjU", "getSecondary30-0d7_KjU", "getSecondary40-0d7_KjU", "getSecondary50-0d7_KjU", "getSecondary60-0d7_KjU", "getSecondary70-0d7_KjU", "getSecondary80-0d7_KjU", "getSecondary90-0d7_KjU", "getSecondary95-0d7_KjU", "getSecondary99-0d7_KjU", "getTertiary0-0d7_KjU", "getTertiary10-0d7_KjU", "getTertiary100-0d7_KjU", "getTertiary20-0d7_KjU", "getTertiary30-0d7_KjU", "getTertiary40-0d7_KjU", "getTertiary50-0d7_KjU", "getTertiary60-0d7_KjU", "getTertiary70-0d7_KjU", "getTertiary80-0d7_KjU", "getTertiary90-0d7_KjU", "getTertiary95-0d7_KjU", "getTertiary99-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TonalPalette {
    public static final int $stable = 0;
    private final long neutral0;
    private final long neutral10;
    private final long neutral100;
    private final long neutral12;
    private final long neutral17;
    private final long neutral20;
    private final long neutral22;
    private final long neutral24;
    private final long neutral30;
    private final long neutral4;
    private final long neutral40;
    private final long neutral50;
    private final long neutral6;
    private final long neutral60;
    private final long neutral70;
    private final long neutral80;
    private final long neutral87;
    private final long neutral90;
    private final long neutral92;
    private final long neutral94;
    private final long neutral95;
    private final long neutral96;
    private final long neutral98;
    private final long neutral99;
    private final long neutralVariant0;
    private final long neutralVariant10;
    private final long neutralVariant100;
    private final long neutralVariant12;
    private final long neutralVariant17;
    private final long neutralVariant20;
    private final long neutralVariant22;
    private final long neutralVariant24;
    private final long neutralVariant30;
    private final long neutralVariant4;
    private final long neutralVariant40;
    private final long neutralVariant50;
    private final long neutralVariant6;
    private final long neutralVariant60;
    private final long neutralVariant70;
    private final long neutralVariant80;
    private final long neutralVariant87;
    private final long neutralVariant90;
    private final long neutralVariant92;
    private final long neutralVariant94;
    private final long neutralVariant95;
    private final long neutralVariant96;
    private final long neutralVariant98;
    private final long neutralVariant99;
    private final long primary0;
    private final long primary10;
    private final long primary100;
    private final long primary20;
    private final long primary30;
    private final long primary40;
    private final long primary50;
    private final long primary60;
    private final long primary70;
    private final long primary80;
    private final long primary90;
    private final long primary95;
    private final long primary99;
    private final long secondary0;
    private final long secondary10;
    private final long secondary100;
    private final long secondary20;
    private final long secondary30;
    private final long secondary40;
    private final long secondary50;
    private final long secondary60;
    private final long secondary70;
    private final long secondary80;
    private final long secondary90;
    private final long secondary95;
    private final long secondary99;
    private final long tertiary0;
    private final long tertiary10;
    private final long tertiary100;
    private final long tertiary20;
    private final long tertiary30;
    private final long tertiary40;
    private final long tertiary50;
    private final long tertiary60;
    private final long tertiary70;
    private final long tertiary80;
    private final long tertiary90;
    private final long tertiary95;
    private final long tertiary99;

    static {
    }

    public /* synthetic */ TonalPalette(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, long r47, long r49, long r51, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, long r69, long r71, long r73, long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, long r103, long r105, long r107, long r109, long r111, long r113, long r115, long r117, long r119, long r121, long r123, long r125, long r127, long r129, long r131, long r133, long r135, long r137, long r139, long r141, long r143, long r145, long r147, long r149, long r151, long r153, long r155, long r157, long r159, long r161, long r163, long r165, long r167, long r169, long r171, long r173, DefaultConstructorMarker r175) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r111, r113, r115, r117, r119, r121, r123, r125, r127, r129, r131, r133, r135, r137, r139, r141, r143, r145, r147, r149, r151, r153, r155, r157, r159, r161, r163, r165, r167, r169, r171, r173);
    }

    private TonalPalette(long neutral100, long neutral99, long neutral98, long neutral96, long neutral95, long neutral94, long neutral92, long neutral90, long neutral87, long neutral80, long neutral70, long neutral60, long neutral50, long neutral40, long neutral30, long neutral24, long neutral22, long neutral20, long neutral17, long neutral12, long neutral10, long neutral6, long neutral4, long neutral0, long neutralVariant100, long neutralVariant99, long neutralVariant98, long neutralVariant96, long neutralVariant95, long neutralVariant94, long neutralVariant92, long neutralVariant90, long neutralVariant87, long neutralVariant80, long neutralVariant70, long neutralVariant60, long neutralVariant50, long neutralVariant40, long neutralVariant30, long neutralVariant24, long neutralVariant22, long neutralVariant20, long neutralVariant17, long neutralVariant12, long neutralVariant10, long neutralVariant6, long neutralVariant4, long neutralVariant0, long primary100, long primary99, long primary95, long primary90, long primary80, long primary70, long primary60, long primary50, long primary40, long primary30, long primary20, long primary10, long primary0, long secondary100, long secondary99, long secondary95, long secondary90, long secondary80, long secondary70, long secondary60, long secondary50, long secondary40, long secondary30, long secondary20, long secondary10, long secondary0, long tertiary100, long tertiary99, long tertiary95, long tertiary90, long tertiary80, long tertiary70, long tertiary60, long tertiary50, long tertiary40, long tertiary30, long tertiary20, long tertiary10, long tertiary0) {
        this.neutral100 = neutral100;
        this.neutral99 = neutral99;
        this.neutral98 = neutral98;
        this.neutral96 = neutral96;
        this.neutral95 = neutral95;
        this.neutral94 = neutral94;
        this.neutral92 = neutral92;
        this.neutral90 = neutral90;
        this.neutral87 = neutral87;
        this.neutral80 = neutral80;
        this.neutral70 = neutral70;
        this.neutral60 = neutral60;
        this.neutral50 = neutral50;
        this.neutral40 = neutral40;
        this.neutral30 = neutral30;
        this.neutral24 = neutral24;
        this.neutral22 = neutral22;
        this.neutral20 = neutral20;
        this.neutral17 = neutral17;
        this.neutral12 = neutral12;
        this.neutral10 = neutral10;
        this.neutral6 = neutral6;
        this.neutral4 = neutral4;
        this.neutral0 = neutral0;
        this.neutralVariant100 = neutralVariant100;
        this.neutralVariant99 = neutralVariant99;
        this.neutralVariant98 = neutralVariant98;
        this.neutralVariant96 = neutralVariant96;
        this.neutralVariant95 = neutralVariant95;
        this.neutralVariant94 = neutralVariant94;
        this.neutralVariant92 = neutralVariant92;
        this.neutralVariant90 = neutralVariant90;
        this.neutralVariant87 = neutralVariant87;
        this.neutralVariant80 = neutralVariant80;
        this.neutralVariant70 = neutralVariant70;
        this.neutralVariant60 = neutralVariant60;
        this.neutralVariant50 = neutralVariant50;
        this.neutralVariant40 = neutralVariant40;
        this.neutralVariant30 = neutralVariant30;
        this.neutralVariant24 = neutralVariant24;
        this.neutralVariant22 = neutralVariant22;
        this.neutralVariant20 = neutralVariant20;
        this.neutralVariant17 = neutralVariant17;
        this.neutralVariant12 = neutralVariant12;
        this.neutralVariant10 = neutralVariant10;
        this.neutralVariant6 = neutralVariant6;
        this.neutralVariant4 = neutralVariant4;
        this.neutralVariant0 = neutralVariant0;
        this.primary100 = primary100;
        this.primary99 = primary99;
        this.primary95 = primary95;
        this.primary90 = primary90;
        this.primary80 = primary80;
        this.primary70 = primary70;
        this.primary60 = primary60;
        this.primary50 = primary50;
        this.primary40 = primary40;
        this.primary30 = primary30;
        this.primary20 = primary20;
        this.primary10 = primary10;
        this.primary0 = primary0;
        this.secondary100 = secondary100;
        this.secondary99 = secondary99;
        this.secondary95 = secondary95;
        this.secondary90 = secondary90;
        this.secondary80 = secondary80;
        this.secondary70 = secondary70;
        this.secondary60 = secondary60;
        this.secondary50 = secondary50;
        this.secondary40 = secondary40;
        this.secondary30 = secondary30;
        this.secondary20 = secondary20;
        this.secondary10 = secondary10;
        this.secondary0 = secondary0;
        this.tertiary100 = tertiary100;
        this.tertiary99 = tertiary99;
        this.tertiary95 = tertiary95;
        this.tertiary90 = tertiary90;
        this.tertiary80 = tertiary80;
        this.tertiary70 = tertiary70;
        this.tertiary60 = tertiary60;
        this.tertiary50 = tertiary50;
        this.tertiary40 = tertiary40;
        this.tertiary30 = tertiary30;
        this.tertiary20 = tertiary20;
        this.tertiary10 = tertiary10;
        this.tertiary0 = tertiary0;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m2882getNeutral1000d7_KjU() {
        return this.neutral100;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m2903getNeutral990d7_KjU() {
        return this.neutral99;
    }

    /* JADX INFO: renamed from: getNeutral98-0d7_KjU, reason: not valid java name */
    public final long m2902getNeutral980d7_KjU() {
        return this.neutral98;
    }

    /* JADX INFO: renamed from: getNeutral96-0d7_KjU, reason: not valid java name */
    public final long m2901getNeutral960d7_KjU() {
        return this.neutral96;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m2900getNeutral950d7_KjU() {
        return this.neutral95;
    }

    /* JADX INFO: renamed from: getNeutral94-0d7_KjU, reason: not valid java name */
    public final long m2899getNeutral940d7_KjU() {
        return this.neutral94;
    }

    /* JADX INFO: renamed from: getNeutral92-0d7_KjU, reason: not valid java name */
    public final long m2898getNeutral920d7_KjU() {
        return this.neutral92;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m2897getNeutral900d7_KjU() {
        return this.neutral90;
    }

    /* JADX INFO: renamed from: getNeutral87-0d7_KjU, reason: not valid java name */
    public final long m2896getNeutral870d7_KjU() {
        return this.neutral87;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m2895getNeutral800d7_KjU() {
        return this.neutral80;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m2894getNeutral700d7_KjU() {
        return this.neutral70;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m2893getNeutral600d7_KjU() {
        return this.neutral60;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m2891getNeutral500d7_KjU() {
        return this.neutral50;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m2890getNeutral400d7_KjU() {
        return this.neutral40;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m2888getNeutral300d7_KjU() {
        return this.neutral30;
    }

    /* JADX INFO: renamed from: getNeutral24-0d7_KjU, reason: not valid java name */
    public final long m2887getNeutral240d7_KjU() {
        return this.neutral24;
    }

    /* JADX INFO: renamed from: getNeutral22-0d7_KjU, reason: not valid java name */
    public final long m2886getNeutral220d7_KjU() {
        return this.neutral22;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m2885getNeutral200d7_KjU() {
        return this.neutral20;
    }

    /* JADX INFO: renamed from: getNeutral17-0d7_KjU, reason: not valid java name */
    public final long m2884getNeutral170d7_KjU() {
        return this.neutral17;
    }

    /* JADX INFO: renamed from: getNeutral12-0d7_KjU, reason: not valid java name */
    public final long m2883getNeutral120d7_KjU() {
        return this.neutral12;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m2881getNeutral100d7_KjU() {
        return this.neutral10;
    }

    /* JADX INFO: renamed from: getNeutral6-0d7_KjU, reason: not valid java name */
    public final long m2892getNeutral60d7_KjU() {
        return this.neutral6;
    }

    /* JADX INFO: renamed from: getNeutral4-0d7_KjU, reason: not valid java name */
    public final long m2889getNeutral40d7_KjU() {
        return this.neutral4;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m2880getNeutral00d7_KjU() {
        return this.neutral0;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m2906getNeutralVariant1000d7_KjU() {
        return this.neutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m2927getNeutralVariant990d7_KjU() {
        return this.neutralVariant99;
    }

    /* JADX INFO: renamed from: getNeutralVariant98-0d7_KjU, reason: not valid java name */
    public final long m2926getNeutralVariant980d7_KjU() {
        return this.neutralVariant98;
    }

    /* JADX INFO: renamed from: getNeutralVariant96-0d7_KjU, reason: not valid java name */
    public final long m2925getNeutralVariant960d7_KjU() {
        return this.neutralVariant96;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m2924getNeutralVariant950d7_KjU() {
        return this.neutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant94-0d7_KjU, reason: not valid java name */
    public final long m2923getNeutralVariant940d7_KjU() {
        return this.neutralVariant94;
    }

    /* JADX INFO: renamed from: getNeutralVariant92-0d7_KjU, reason: not valid java name */
    public final long m2922getNeutralVariant920d7_KjU() {
        return this.neutralVariant92;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m2921getNeutralVariant900d7_KjU() {
        return this.neutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant87-0d7_KjU, reason: not valid java name */
    public final long m2920getNeutralVariant870d7_KjU() {
        return this.neutralVariant87;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m2919getNeutralVariant800d7_KjU() {
        return this.neutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m2918getNeutralVariant700d7_KjU() {
        return this.neutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m2917getNeutralVariant600d7_KjU() {
        return this.neutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m2915getNeutralVariant500d7_KjU() {
        return this.neutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m2914getNeutralVariant400d7_KjU() {
        return this.neutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m2912getNeutralVariant300d7_KjU() {
        return this.neutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant24-0d7_KjU, reason: not valid java name */
    public final long m2911getNeutralVariant240d7_KjU() {
        return this.neutralVariant24;
    }

    /* JADX INFO: renamed from: getNeutralVariant22-0d7_KjU, reason: not valid java name */
    public final long m2910getNeutralVariant220d7_KjU() {
        return this.neutralVariant22;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m2909getNeutralVariant200d7_KjU() {
        return this.neutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant17-0d7_KjU, reason: not valid java name */
    public final long m2908getNeutralVariant170d7_KjU() {
        return this.neutralVariant17;
    }

    /* JADX INFO: renamed from: getNeutralVariant12-0d7_KjU, reason: not valid java name */
    public final long m2907getNeutralVariant120d7_KjU() {
        return this.neutralVariant12;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m2905getNeutralVariant100d7_KjU() {
        return this.neutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant6-0d7_KjU, reason: not valid java name */
    public final long m2916getNeutralVariant60d7_KjU() {
        return this.neutralVariant6;
    }

    /* JADX INFO: renamed from: getNeutralVariant4-0d7_KjU, reason: not valid java name */
    public final long m2913getNeutralVariant40d7_KjU() {
        return this.neutralVariant4;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m2904getNeutralVariant00d7_KjU() {
        return this.neutralVariant0;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m2930getPrimary1000d7_KjU() {
        return this.primary100;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m2940getPrimary990d7_KjU() {
        return this.primary99;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m2939getPrimary950d7_KjU() {
        return this.primary95;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m2938getPrimary900d7_KjU() {
        return this.primary90;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m2937getPrimary800d7_KjU() {
        return this.primary80;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m2936getPrimary700d7_KjU() {
        return this.primary70;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m2935getPrimary600d7_KjU() {
        return this.primary60;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m2934getPrimary500d7_KjU() {
        return this.primary50;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m2933getPrimary400d7_KjU() {
        return this.primary40;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m2932getPrimary300d7_KjU() {
        return this.primary30;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m2931getPrimary200d7_KjU() {
        return this.primary20;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m2929getPrimary100d7_KjU() {
        return this.primary10;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m2928getPrimary00d7_KjU() {
        return this.primary0;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m2943getSecondary1000d7_KjU() {
        return this.secondary100;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m2953getSecondary990d7_KjU() {
        return this.secondary99;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m2952getSecondary950d7_KjU() {
        return this.secondary95;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m2951getSecondary900d7_KjU() {
        return this.secondary90;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m2950getSecondary800d7_KjU() {
        return this.secondary80;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m2949getSecondary700d7_KjU() {
        return this.secondary70;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m2948getSecondary600d7_KjU() {
        return this.secondary60;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m2947getSecondary500d7_KjU() {
        return this.secondary50;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m2946getSecondary400d7_KjU() {
        return this.secondary40;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m2945getSecondary300d7_KjU() {
        return this.secondary30;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m2944getSecondary200d7_KjU() {
        return this.secondary20;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m2942getSecondary100d7_KjU() {
        return this.secondary10;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m2941getSecondary00d7_KjU() {
        return this.secondary0;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m2956getTertiary1000d7_KjU() {
        return this.tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m2966getTertiary990d7_KjU() {
        return this.tertiary99;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m2965getTertiary950d7_KjU() {
        return this.tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m2964getTertiary900d7_KjU() {
        return this.tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m2963getTertiary800d7_KjU() {
        return this.tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m2962getTertiary700d7_KjU() {
        return this.tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m2961getTertiary600d7_KjU() {
        return this.tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m2960getTertiary500d7_KjU() {
        return this.tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m2959getTertiary400d7_KjU() {
        return this.tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m2958getTertiary300d7_KjU() {
        return this.tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m2957getTertiary200d7_KjU() {
        return this.tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m2955getTertiary100d7_KjU() {
        return this.tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m2954getTertiary00d7_KjU() {
        return this.tertiary0;
    }
}
