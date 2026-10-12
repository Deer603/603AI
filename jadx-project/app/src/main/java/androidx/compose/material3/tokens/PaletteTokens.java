package androidx.compose.material3.tokens;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: PaletteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¸\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u0019\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u0019\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u0019\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u0019\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u0019\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u0019\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u0019\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u0019\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006R\u0019\u00108\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b9\u0010\u0006R\u0019\u0010:\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b;\u0010\u0006R\u0019\u0010<\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b=\u0010\u0006R\u0019\u0010>\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b?\u0010\u0006R\u0019\u0010@\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bA\u0010\u0006R\u0019\u0010B\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bC\u0010\u0006R\u0019\u0010D\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bE\u0010\u0006R\u0019\u0010F\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bG\u0010\u0006R\u0019\u0010H\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bI\u0010\u0006R\u0019\u0010J\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bK\u0010\u0006R\u0019\u0010L\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bM\u0010\u0006R\u0019\u0010N\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bO\u0010\u0006R\u0019\u0010P\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bQ\u0010\u0006R\u0019\u0010R\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bS\u0010\u0006R\u0019\u0010T\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bU\u0010\u0006R\u0019\u0010V\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bW\u0010\u0006R\u0019\u0010X\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bY\u0010\u0006R\u0019\u0010Z\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b[\u0010\u0006R\u0019\u0010\\\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b]\u0010\u0006R\u0019\u0010^\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b_\u0010\u0006R\u0019\u0010`\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\ba\u0010\u0006R\u0019\u0010b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bc\u0010\u0006R\u0019\u0010d\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\be\u0010\u0006R\u0019\u0010f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bg\u0010\u0006R\u0019\u0010h\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bi\u0010\u0006R\u0019\u0010j\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bk\u0010\u0006R\u0019\u0010l\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bm\u0010\u0006R\u0019\u0010n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bo\u0010\u0006R\u0019\u0010p\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bq\u0010\u0006R\u0019\u0010r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bs\u0010\u0006R\u0019\u0010t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bu\u0010\u0006R\u0019\u0010v\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\bw\u0010\u0006R\u0019\u0010x\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\by\u0010\u0006R\u0019\u0010z\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b{\u0010\u0006R\u0019\u0010|\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b}\u0010\u0006R\u0019\u0010~\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u007f\u0010\u0006R\u001b\u0010\u0080\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0081\u0001\u0010\u0006R\u001b\u0010\u0082\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0083\u0001\u0010\u0006R\u001b\u0010\u0084\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0085\u0001\u0010\u0006R\u001b\u0010\u0086\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0087\u0001\u0010\u0006R\u001b\u0010\u0088\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0089\u0001\u0010\u0006R\u001b\u0010\u008a\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u008b\u0001\u0010\u0006R\u001b\u0010\u008c\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u008d\u0001\u0010\u0006R\u001b\u0010\u008e\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u008f\u0001\u0010\u0006R\u001b\u0010\u0090\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0091\u0001\u0010\u0006R\u001b\u0010\u0092\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0093\u0001\u0010\u0006R\u001b\u0010\u0094\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0095\u0001\u0010\u0006R\u001b\u0010\u0096\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0097\u0001\u0010\u0006R\u001b\u0010\u0098\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u0099\u0001\u0010\u0006R\u001b\u0010\u009a\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u009b\u0001\u0010\u0006R\u001b\u0010\u009c\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u009d\u0001\u0010\u0006R\u001b\u0010\u009e\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u009f\u0001\u0010\u0006R\u001b\u0010 \u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b¡\u0001\u0010\u0006R\u001b\u0010¢\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b£\u0001\u0010\u0006R\u001b\u0010¤\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b¥\u0001\u0010\u0006R\u001b\u0010¦\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b§\u0001\u0010\u0006R\u001b\u0010¨\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b©\u0001\u0010\u0006R\u001b\u0010ª\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b«\u0001\u0010\u0006R\u001b\u0010¬\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b\u00ad\u0001\u0010\u0006R\u001b\u0010®\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b¯\u0001\u0010\u0006R\u001b\u0010°\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b±\u0001\u0010\u0006R\u001b\u0010²\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b³\u0001\u0010\u0006R\u001b\u0010´\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\bµ\u0001\u0010\u0006R\u001b\u0010¶\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b·\u0001\u0010\u0006R\u001b\u0010¸\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b¹\u0001\u0010\u0006R\u001b\u0010º\u0001\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010\u0007\u001a\u0005\b»\u0001\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¼\u0001"}, d2 = {"Landroidx/compose/material3/tokens/PaletteTokens;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU", "()J", "J", "Error0", "getError0-0d7_KjU", "Error10", "getError10-0d7_KjU", "Error100", "getError100-0d7_KjU", "Error20", "getError20-0d7_KjU", "Error30", "getError30-0d7_KjU", "Error40", "getError40-0d7_KjU", "Error50", "getError50-0d7_KjU", "Error60", "getError60-0d7_KjU", "Error70", "getError70-0d7_KjU", "Error80", "getError80-0d7_KjU", "Error90", "getError90-0d7_KjU", "Error95", "getError95-0d7_KjU", "Error99", "getError99-0d7_KjU", "Neutral0", "getNeutral0-0d7_KjU", "Neutral10", "getNeutral10-0d7_KjU", "Neutral100", "getNeutral100-0d7_KjU", "Neutral12", "getNeutral12-0d7_KjU", "Neutral17", "getNeutral17-0d7_KjU", "Neutral20", "getNeutral20-0d7_KjU", "Neutral22", "getNeutral22-0d7_KjU", "Neutral24", "getNeutral24-0d7_KjU", "Neutral30", "getNeutral30-0d7_KjU", "Neutral4", "getNeutral4-0d7_KjU", "Neutral40", "getNeutral40-0d7_KjU", "Neutral50", "getNeutral50-0d7_KjU", "Neutral6", "getNeutral6-0d7_KjU", "Neutral60", "getNeutral60-0d7_KjU", "Neutral70", "getNeutral70-0d7_KjU", "Neutral80", "getNeutral80-0d7_KjU", "Neutral87", "getNeutral87-0d7_KjU", "Neutral90", "getNeutral90-0d7_KjU", "Neutral92", "getNeutral92-0d7_KjU", "Neutral94", "getNeutral94-0d7_KjU", "Neutral95", "getNeutral95-0d7_KjU", "Neutral96", "getNeutral96-0d7_KjU", "Neutral98", "getNeutral98-0d7_KjU", "Neutral99", "getNeutral99-0d7_KjU", "NeutralVariant0", "getNeutralVariant0-0d7_KjU", "NeutralVariant10", "getNeutralVariant10-0d7_KjU", "NeutralVariant100", "getNeutralVariant100-0d7_KjU", "NeutralVariant20", "getNeutralVariant20-0d7_KjU", "NeutralVariant30", "getNeutralVariant30-0d7_KjU", "NeutralVariant40", "getNeutralVariant40-0d7_KjU", "NeutralVariant50", "getNeutralVariant50-0d7_KjU", "NeutralVariant60", "getNeutralVariant60-0d7_KjU", "NeutralVariant70", "getNeutralVariant70-0d7_KjU", "NeutralVariant80", "getNeutralVariant80-0d7_KjU", "NeutralVariant90", "getNeutralVariant90-0d7_KjU", "NeutralVariant95", "getNeutralVariant95-0d7_KjU", "NeutralVariant99", "getNeutralVariant99-0d7_KjU", "Primary0", "getPrimary0-0d7_KjU", "Primary10", "getPrimary10-0d7_KjU", "Primary100", "getPrimary100-0d7_KjU", "Primary20", "getPrimary20-0d7_KjU", "Primary30", "getPrimary30-0d7_KjU", "Primary40", "getPrimary40-0d7_KjU", "Primary50", "getPrimary50-0d7_KjU", "Primary60", "getPrimary60-0d7_KjU", "Primary70", "getPrimary70-0d7_KjU", "Primary80", "getPrimary80-0d7_KjU", "Primary90", "getPrimary90-0d7_KjU", "Primary95", "getPrimary95-0d7_KjU", "Primary99", "getPrimary99-0d7_KjU", "Secondary0", "getSecondary0-0d7_KjU", "Secondary10", "getSecondary10-0d7_KjU", "Secondary100", "getSecondary100-0d7_KjU", "Secondary20", "getSecondary20-0d7_KjU", "Secondary30", "getSecondary30-0d7_KjU", "Secondary40", "getSecondary40-0d7_KjU", "Secondary50", "getSecondary50-0d7_KjU", "Secondary60", "getSecondary60-0d7_KjU", "Secondary70", "getSecondary70-0d7_KjU", "Secondary80", "getSecondary80-0d7_KjU", "Secondary90", "getSecondary90-0d7_KjU", "Secondary95", "getSecondary95-0d7_KjU", "Secondary99", "getSecondary99-0d7_KjU", "Tertiary0", "getTertiary0-0d7_KjU", "Tertiary10", "getTertiary10-0d7_KjU", "Tertiary100", "getTertiary100-0d7_KjU", "Tertiary20", "getTertiary20-0d7_KjU", "Tertiary30", "getTertiary30-0d7_KjU", "Tertiary40", "getTertiary40-0d7_KjU", "Tertiary50", "getTertiary50-0d7_KjU", "Tertiary60", "getTertiary60-0d7_KjU", "Tertiary70", "getTertiary70-0d7_KjU", "Tertiary80", "getTertiary80-0d7_KjU", "Tertiary90", "getTertiary90-0d7_KjU", "Tertiary95", "getTertiary95-0d7_KjU", "Tertiary99", "getTertiary99-0d7_KjU", "White", "getWhite-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaletteTokens {
    public static final int $stable = 0;
    private static final long Black = 0;
    private static final long Error0 = 0;
    private static final long Error10 = 0;
    private static final long Error100 = 0;
    private static final long Error20 = 0;
    private static final long Error30 = 0;
    private static final long Error40 = 0;
    private static final long Error50 = 0;
    private static final long Error60 = 0;
    private static final long Error70 = 0;
    private static final long Error80 = 0;
    private static final long Error90 = 0;
    private static final long Error95 = 0;
    private static final long Error99 = 0;
    public static final PaletteTokens INSTANCE = null;
    private static final long Neutral0 = 0;
    private static final long Neutral10 = 0;
    private static final long Neutral100 = 0;
    private static final long Neutral12 = 0;
    private static final long Neutral17 = 0;
    private static final long Neutral20 = 0;
    private static final long Neutral22 = 0;
    private static final long Neutral24 = 0;
    private static final long Neutral30 = 0;
    private static final long Neutral4 = 0;
    private static final long Neutral40 = 0;
    private static final long Neutral50 = 0;
    private static final long Neutral6 = 0;
    private static final long Neutral60 = 0;
    private static final long Neutral70 = 0;
    private static final long Neutral80 = 0;
    private static final long Neutral87 = 0;
    private static final long Neutral90 = 0;
    private static final long Neutral92 = 0;
    private static final long Neutral94 = 0;
    private static final long Neutral95 = 0;
    private static final long Neutral96 = 0;
    private static final long Neutral98 = 0;
    private static final long Neutral99 = 0;
    private static final long NeutralVariant0 = 0;
    private static final long NeutralVariant10 = 0;
    private static final long NeutralVariant100 = 0;
    private static final long NeutralVariant20 = 0;
    private static final long NeutralVariant30 = 0;
    private static final long NeutralVariant40 = 0;
    private static final long NeutralVariant50 = 0;
    private static final long NeutralVariant60 = 0;
    private static final long NeutralVariant70 = 0;
    private static final long NeutralVariant80 = 0;
    private static final long NeutralVariant90 = 0;
    private static final long NeutralVariant95 = 0;
    private static final long NeutralVariant99 = 0;
    private static final long Primary0 = 0;
    private static final long Primary10 = 0;
    private static final long Primary100 = 0;
    private static final long Primary20 = 0;
    private static final long Primary30 = 0;
    private static final long Primary40 = 0;
    private static final long Primary50 = 0;
    private static final long Primary60 = 0;
    private static final long Primary70 = 0;
    private static final long Primary80 = 0;
    private static final long Primary90 = 0;
    private static final long Primary95 = 0;
    private static final long Primary99 = 0;
    private static final long Secondary0 = 0;
    private static final long Secondary10 = 0;
    private static final long Secondary100 = 0;
    private static final long Secondary20 = 0;
    private static final long Secondary30 = 0;
    private static final long Secondary40 = 0;
    private static final long Secondary50 = 0;
    private static final long Secondary60 = 0;
    private static final long Secondary70 = 0;
    private static final long Secondary80 = 0;
    private static final long Secondary90 = 0;
    private static final long Secondary95 = 0;
    private static final long Secondary99 = 0;
    private static final long Tertiary0 = 0;
    private static final long Tertiary10 = 0;
    private static final long Tertiary100 = 0;
    private static final long Tertiary20 = 0;
    private static final long Tertiary30 = 0;
    private static final long Tertiary40 = 0;
    private static final long Tertiary50 = 0;
    private static final long Tertiary60 = 0;
    private static final long Tertiary70 = 0;
    private static final long Tertiary80 = 0;
    private static final long Tertiary90 = 0;
    private static final long Tertiary95 = 0;
    private static final long Tertiary99 = 0;
    private static final long White = 0;

    private PaletteTokens() {
    }

    static {
        INSTANCE = new PaletteTokens();
        Black = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Error0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Error10 = ColorKt.Color$default(65, 14, 11, 0, 8, null);
        Error100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        Error20 = ColorKt.Color$default(96, 20, 16, 0, 8, null);
        Error30 = ColorKt.Color$default(140, 29, 24, 0, 8, null);
        Error40 = ColorKt.Color$default(179, 38, 30, 0, 8, null);
        Error50 = ColorKt.Color$default(220, 54, 46, 0, 8, null);
        Error60 = ColorKt.Color$default(228, 105, 98, 0, 8, null);
        Error70 = ColorKt.Color$default(236, 146, 142, 0, 8, null);
        Error80 = ColorKt.Color$default(242, 184, 181, 0, 8, null);
        Error90 = ColorKt.Color$default(249, 222, 220, 0, 8, null);
        Error95 = ColorKt.Color$default(252, 238, 238, 0, 8, null);
        Error99 = ColorKt.Color$default(255, 251, 249, 0, 8, null);
        Neutral0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Neutral10 = ColorKt.Color$default(29, 27, 32, 0, 8, null);
        Neutral100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        Neutral12 = ColorKt.Color$default(33, 31, 38, 0, 8, null);
        Neutral17 = ColorKt.Color$default(43, 41, 48, 0, 8, null);
        Neutral20 = ColorKt.Color$default(50, 47, 53, 0, 8, null);
        Neutral22 = ColorKt.Color$default(54, 52, 59, 0, 8, null);
        Neutral24 = ColorKt.Color$default(59, 56, 62, 0, 8, null);
        Neutral30 = ColorKt.Color$default(72, 70, 76, 0, 8, null);
        Neutral4 = ColorKt.Color$default(15, 13, 19, 0, 8, null);
        Neutral40 = ColorKt.Color$default(96, 93, 100, 0, 8, null);
        Neutral50 = ColorKt.Color$default(121, 118, 125, 0, 8, null);
        Neutral6 = ColorKt.Color$default(20, 18, 24, 0, 8, null);
        Neutral60 = ColorKt.Color$default(147, 143, 150, 0, 8, null);
        Neutral70 = ColorKt.Color$default(174, 169, 177, 0, 8, null);
        Neutral80 = ColorKt.Color$default(ComposerKt.compositionLocalMapKey, 197, 205, 0, 8, null);
        Neutral87 = ColorKt.Color$default(222, 216, 225, 0, 8, null);
        Neutral90 = ColorKt.Color$default(230, 224, 233, 0, 8, null);
        Neutral92 = ColorKt.Color$default(236, 230, 240, 0, 8, null);
        Neutral94 = ColorKt.Color$default(243, 237, 247, 0, 8, null);
        Neutral95 = ColorKt.Color$default(245, 239, 247, 0, 8, null);
        Neutral96 = ColorKt.Color$default(247, 242, 250, 0, 8, null);
        Neutral98 = ColorKt.Color$default(254, 247, 255, 0, 8, null);
        Neutral99 = ColorKt.Color$default(255, 251, 255, 0, 8, null);
        NeutralVariant0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        NeutralVariant10 = ColorKt.Color$default(29, 26, 34, 0, 8, null);
        NeutralVariant100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        NeutralVariant20 = ColorKt.Color$default(50, 47, 55, 0, 8, null);
        NeutralVariant30 = ColorKt.Color$default(73, 69, 79, 0, 8, null);
        NeutralVariant40 = ColorKt.Color$default(96, 93, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 0, 8, null);
        NeutralVariant50 = ColorKt.Color$default(121, 116, 126, 0, 8, null);
        NeutralVariant60 = ColorKt.Color$default(147, 143, 153, 0, 8, null);
        NeutralVariant70 = ColorKt.Color$default(174, 169, 180, 0, 8, null);
        NeutralVariant80 = ColorKt.Color$default(ComposerKt.compositionLocalMapKey, 196, 208, 0, 8, null);
        NeutralVariant90 = ColorKt.Color$default(231, 224, 236, 0, 8, null);
        NeutralVariant95 = ColorKt.Color$default(245, 238, 250, 0, 8, null);
        NeutralVariant99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
        Primary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Primary10 = ColorKt.Color$default(33, 0, 93, 0, 8, null);
        Primary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        Primary20 = ColorKt.Color$default(56, 30, 114, 0, 8, null);
        Primary30 = ColorKt.Color$default(79, 55, 139, 0, 8, null);
        Primary40 = ColorKt.Color$default(103, 80, 164, 0, 8, null);
        Primary50 = ColorKt.Color$default(WorkQueueKt.MASK, 103, 190, 0, 8, null);
        Primary60 = ColorKt.Color$default(154, 130, 219, 0, 8, null);
        Primary70 = ColorKt.Color$default(182, 157, 248, 0, 8, null);
        Primary80 = ColorKt.Color$default(208, 188, 255, 0, 8, null);
        Primary90 = ColorKt.Color$default(234, 221, 255, 0, 8, null);
        Primary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
        Primary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
        Secondary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Secondary10 = ColorKt.Color$default(29, 25, 43, 0, 8, null);
        Secondary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        Secondary20 = ColorKt.Color$default(51, 45, 65, 0, 8, null);
        Secondary30 = ColorKt.Color$default(74, 68, 88, 0, 8, null);
        Secondary40 = ColorKt.Color$default(98, 91, 113, 0, 8, null);
        Secondary50 = ColorKt.Color$default(122, 114, 137, 0, 8, null);
        Secondary60 = ColorKt.Color$default(149, 141, 165, 0, 8, null);
        Secondary70 = ColorKt.Color$default(176, 167, 192, 0, 8, null);
        Secondary80 = ColorKt.Color$default(ComposerKt.providerMapsKey, 194, 220, 0, 8, null);
        Secondary90 = ColorKt.Color$default(232, 222, 248, 0, 8, null);
        Secondary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
        Secondary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
        Tertiary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
        Tertiary10 = ColorKt.Color$default(49, 17, 29, 0, 8, null);
        Tertiary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
        Tertiary20 = ColorKt.Color$default(73, 37, 50, 0, 8, null);
        Tertiary30 = ColorKt.Color$default(99, 59, 72, 0, 8, null);
        Tertiary40 = ColorKt.Color$default(125, 82, 96, 0, 8, null);
        Tertiary50 = ColorKt.Color$default(152, 105, 119, 0, 8, null);
        Tertiary60 = ColorKt.Color$default(181, 131, 146, 0, 8, null);
        Tertiary70 = ColorKt.Color$default(210, 157, 172, 0, 8, null);
        Tertiary80 = ColorKt.Color$default(239, 184, ComposerKt.invocationKey, 0, 8, null);
        Tertiary90 = ColorKt.Color$default(255, 216, 228, 0, 8, null);
        Tertiary95 = ColorKt.Color$default(255, 236, 241, 0, 8, null);
        Tertiary99 = ColorKt.Color$default(255, 251, 250, 0, 8, null);
        White = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    }

    /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m3493getBlack0d7_KjU() {
        return Black;
    }

    /* JADX INFO: renamed from: getError0-0d7_KjU, reason: not valid java name */
    public final long m3494getError00d7_KjU() {
        return Error0;
    }

    /* JADX INFO: renamed from: getError10-0d7_KjU, reason: not valid java name */
    public final long m3495getError100d7_KjU() {
        return Error10;
    }

    /* JADX INFO: renamed from: getError100-0d7_KjU, reason: not valid java name */
    public final long m3496getError1000d7_KjU() {
        return Error100;
    }

    /* JADX INFO: renamed from: getError20-0d7_KjU, reason: not valid java name */
    public final long m3497getError200d7_KjU() {
        return Error20;
    }

    /* JADX INFO: renamed from: getError30-0d7_KjU, reason: not valid java name */
    public final long m3498getError300d7_KjU() {
        return Error30;
    }

    /* JADX INFO: renamed from: getError40-0d7_KjU, reason: not valid java name */
    public final long m3499getError400d7_KjU() {
        return Error40;
    }

    /* JADX INFO: renamed from: getError50-0d7_KjU, reason: not valid java name */
    public final long m3500getError500d7_KjU() {
        return Error50;
    }

    /* JADX INFO: renamed from: getError60-0d7_KjU, reason: not valid java name */
    public final long m3501getError600d7_KjU() {
        return Error60;
    }

    /* JADX INFO: renamed from: getError70-0d7_KjU, reason: not valid java name */
    public final long m3502getError700d7_KjU() {
        return Error70;
    }

    /* JADX INFO: renamed from: getError80-0d7_KjU, reason: not valid java name */
    public final long m3503getError800d7_KjU() {
        return Error80;
    }

    /* JADX INFO: renamed from: getError90-0d7_KjU, reason: not valid java name */
    public final long m3504getError900d7_KjU() {
        return Error90;
    }

    /* JADX INFO: renamed from: getError95-0d7_KjU, reason: not valid java name */
    public final long m3505getError950d7_KjU() {
        return Error95;
    }

    /* JADX INFO: renamed from: getError99-0d7_KjU, reason: not valid java name */
    public final long m3506getError990d7_KjU() {
        return Error99;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m3507getNeutral00d7_KjU() {
        return Neutral0;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m3508getNeutral100d7_KjU() {
        return Neutral10;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m3509getNeutral1000d7_KjU() {
        return Neutral100;
    }

    /* JADX INFO: renamed from: getNeutral12-0d7_KjU, reason: not valid java name */
    public final long m3510getNeutral120d7_KjU() {
        return Neutral12;
    }

    /* JADX INFO: renamed from: getNeutral17-0d7_KjU, reason: not valid java name */
    public final long m3511getNeutral170d7_KjU() {
        return Neutral17;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m3512getNeutral200d7_KjU() {
        return Neutral20;
    }

    /* JADX INFO: renamed from: getNeutral22-0d7_KjU, reason: not valid java name */
    public final long m3513getNeutral220d7_KjU() {
        return Neutral22;
    }

    /* JADX INFO: renamed from: getNeutral24-0d7_KjU, reason: not valid java name */
    public final long m3514getNeutral240d7_KjU() {
        return Neutral24;
    }

    /* JADX INFO: renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m3515getNeutral300d7_KjU() {
        return Neutral30;
    }

    /* JADX INFO: renamed from: getNeutral4-0d7_KjU, reason: not valid java name */
    public final long m3516getNeutral40d7_KjU() {
        return Neutral4;
    }

    /* JADX INFO: renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m3517getNeutral400d7_KjU() {
        return Neutral40;
    }

    /* JADX INFO: renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m3518getNeutral500d7_KjU() {
        return Neutral50;
    }

    /* JADX INFO: renamed from: getNeutral6-0d7_KjU, reason: not valid java name */
    public final long m3519getNeutral60d7_KjU() {
        return Neutral6;
    }

    /* JADX INFO: renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m3520getNeutral600d7_KjU() {
        return Neutral60;
    }

    /* JADX INFO: renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m3521getNeutral700d7_KjU() {
        return Neutral70;
    }

    /* JADX INFO: renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m3522getNeutral800d7_KjU() {
        return Neutral80;
    }

    /* JADX INFO: renamed from: getNeutral87-0d7_KjU, reason: not valid java name */
    public final long m3523getNeutral870d7_KjU() {
        return Neutral87;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m3524getNeutral900d7_KjU() {
        return Neutral90;
    }

    /* JADX INFO: renamed from: getNeutral92-0d7_KjU, reason: not valid java name */
    public final long m3525getNeutral920d7_KjU() {
        return Neutral92;
    }

    /* JADX INFO: renamed from: getNeutral94-0d7_KjU, reason: not valid java name */
    public final long m3526getNeutral940d7_KjU() {
        return Neutral94;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m3527getNeutral950d7_KjU() {
        return Neutral95;
    }

    /* JADX INFO: renamed from: getNeutral96-0d7_KjU, reason: not valid java name */
    public final long m3528getNeutral960d7_KjU() {
        return Neutral96;
    }

    /* JADX INFO: renamed from: getNeutral98-0d7_KjU, reason: not valid java name */
    public final long m3529getNeutral980d7_KjU() {
        return Neutral98;
    }

    /* JADX INFO: renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m3530getNeutral990d7_KjU() {
        return Neutral99;
    }

    /* JADX INFO: renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m3531getNeutralVariant00d7_KjU() {
        return NeutralVariant0;
    }

    /* JADX INFO: renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m3532getNeutralVariant100d7_KjU() {
        return NeutralVariant10;
    }

    /* JADX INFO: renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m3533getNeutralVariant1000d7_KjU() {
        return NeutralVariant100;
    }

    /* JADX INFO: renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m3534getNeutralVariant200d7_KjU() {
        return NeutralVariant20;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m3535getNeutralVariant300d7_KjU() {
        return NeutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m3536getNeutralVariant400d7_KjU() {
        return NeutralVariant40;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m3537getNeutralVariant500d7_KjU() {
        return NeutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m3538getNeutralVariant600d7_KjU() {
        return NeutralVariant60;
    }

    /* JADX INFO: renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m3539getNeutralVariant700d7_KjU() {
        return NeutralVariant70;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m3540getNeutralVariant800d7_KjU() {
        return NeutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m3541getNeutralVariant900d7_KjU() {
        return NeutralVariant90;
    }

    /* JADX INFO: renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m3542getNeutralVariant950d7_KjU() {
        return NeutralVariant95;
    }

    /* JADX INFO: renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m3543getNeutralVariant990d7_KjU() {
        return NeutralVariant99;
    }

    /* JADX INFO: renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m3544getPrimary00d7_KjU() {
        return Primary0;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m3545getPrimary100d7_KjU() {
        return Primary10;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m3546getPrimary1000d7_KjU() {
        return Primary100;
    }

    /* JADX INFO: renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m3547getPrimary200d7_KjU() {
        return Primary20;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m3548getPrimary300d7_KjU() {
        return Primary30;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m3549getPrimary400d7_KjU() {
        return Primary40;
    }

    /* JADX INFO: renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m3550getPrimary500d7_KjU() {
        return Primary50;
    }

    /* JADX INFO: renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m3551getPrimary600d7_KjU() {
        return Primary60;
    }

    /* JADX INFO: renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m3552getPrimary700d7_KjU() {
        return Primary70;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m3553getPrimary800d7_KjU() {
        return Primary80;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m3554getPrimary900d7_KjU() {
        return Primary90;
    }

    /* JADX INFO: renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m3555getPrimary950d7_KjU() {
        return Primary95;
    }

    /* JADX INFO: renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m3556getPrimary990d7_KjU() {
        return Primary99;
    }

    /* JADX INFO: renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m3557getSecondary00d7_KjU() {
        return Secondary0;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m3558getSecondary100d7_KjU() {
        return Secondary10;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m3559getSecondary1000d7_KjU() {
        return Secondary100;
    }

    /* JADX INFO: renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m3560getSecondary200d7_KjU() {
        return Secondary20;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m3561getSecondary300d7_KjU() {
        return Secondary30;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m3562getSecondary400d7_KjU() {
        return Secondary40;
    }

    /* JADX INFO: renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m3563getSecondary500d7_KjU() {
        return Secondary50;
    }

    /* JADX INFO: renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m3564getSecondary600d7_KjU() {
        return Secondary60;
    }

    /* JADX INFO: renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m3565getSecondary700d7_KjU() {
        return Secondary70;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m3566getSecondary800d7_KjU() {
        return Secondary80;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m3567getSecondary900d7_KjU() {
        return Secondary90;
    }

    /* JADX INFO: renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m3568getSecondary950d7_KjU() {
        return Secondary95;
    }

    /* JADX INFO: renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m3569getSecondary990d7_KjU() {
        return Secondary99;
    }

    /* JADX INFO: renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m3570getTertiary00d7_KjU() {
        return Tertiary0;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m3571getTertiary100d7_KjU() {
        return Tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m3572getTertiary1000d7_KjU() {
        return Tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m3573getTertiary200d7_KjU() {
        return Tertiary20;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m3574getTertiary300d7_KjU() {
        return Tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m3575getTertiary400d7_KjU() {
        return Tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m3576getTertiary500d7_KjU() {
        return Tertiary50;
    }

    /* JADX INFO: renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m3577getTertiary600d7_KjU() {
        return Tertiary60;
    }

    /* JADX INFO: renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m3578getTertiary700d7_KjU() {
        return Tertiary70;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m3579getTertiary800d7_KjU() {
        return Tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m3580getTertiary900d7_KjU() {
        return Tertiary90;
    }

    /* JADX INFO: renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m3581getTertiary950d7_KjU() {
        return Tertiary95;
    }

    /* JADX INFO: renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m3582getTertiary990d7_KjU() {
        return Tertiary99;
    }

    /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m3583getWhite0d7_KjU() {
        return White;
    }
}
