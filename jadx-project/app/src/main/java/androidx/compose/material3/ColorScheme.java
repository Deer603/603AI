package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bï\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 B¥\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0002\u0010(J·\u0002\u0010\u008f\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002Jû\u0002\u0010\u008f\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J\n\u0010\u0094\u0002\u001a\u00030\u0095\u0002H\u0016R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u0004\u0018\u00010MX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010A\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\u001c\u0010V\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00105\"\u0004\bX\u00107R\u001c\u0010Y\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010;\"\u0004\b[\u0010=R\u001c\u0010\\\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001c\u0010b\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010/\"\u0004\bd\u00101R\u001c\u0010e\u001a\u0004\u0018\u00010fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010k\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010q\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001c\u0010w\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00105\"\u0004\by\u00107R\u001c\u0010z\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010n\"\u0004\b|\u0010pR\u001c\u0010}\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010t\"\u0004\b\u007f\u0010vR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010_\"\u0005\b\u0082\u0001\u0010aR\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010n\"\u0005\b\u0085\u0001\u0010pR\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010t\"\u0005\b\u0088\u0001\u0010vR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010]X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010_\"\u0005\b\u008b\u0001\u0010aR&\u0010\u008c\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008d\u0001\u0010A\u001a\u0005\b\u008e\u0001\u0010C\"\u0005\b\u008f\u0001\u0010ER&\u0010\u0090\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0091\u0001\u0010A\u001a\u0005\b\u0092\u0001\u0010C\"\u0005\b\u0093\u0001\u0010ER\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\"\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001f\u0010¦\u0001\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u00105\"\u0005\b¨\u0001\u00107R\u001f\u0010©\u0001\u001a\u0004\u0018\u000109X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010;\"\u0005\b«\u0001\u0010=R\u001f\u0010¬\u0001\u001a\u0004\u0018\u00010lX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010n\"\u0005\b®\u0001\u0010pR\u001f\u0010¯\u0001\u001a\u0004\u0018\u00010rX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010t\"\u0005\b±\u0001\u0010vR\"\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R\"\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R)\u0010¾\u0001\u001a\u0005\u0018\u00010¿\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bÀ\u0001\u0010A\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R)\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bÇ\u0001\u0010A\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\"\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u001f\u0010Ò\u0001\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u0010/\"\u0005\bÔ\u0001\u00101R\"\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R\u001f\u0010Û\u0001\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u00105\"\u0005\bÝ\u0001\u00107R\"\u0010Þ\u0001\u001a\u0005\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bß\u0001\u0010µ\u0001\"\u0006\bà\u0001\u0010·\u0001R)\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001X\u0080\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bã\u0001\u0010A\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R&\u0010è\u0001\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u0017\n\u0000\u0012\u0005\bé\u0001\u0010A\u001a\u0005\bê\u0001\u0010C\"\u0005\bë\u0001\u0010ER\u001a\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bì\u0001\u0010*R\u001a\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bí\u0001\u0010*R\u001a\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bî\u0001\u0010*R\u001a\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bï\u0001\u0010*R\u001a\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bð\u0001\u0010*R\u001a\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bñ\u0001\u0010*R\u001a\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bò\u0001\u0010*R\u001a\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bó\u0001\u0010*R\u001a\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bô\u0001\u0010*R\u001a\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bõ\u0001\u0010*R\u001a\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bö\u0001\u0010*R\u001a\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b÷\u0001\u0010*R\u001a\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bø\u0001\u0010*R\u001a\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bù\u0001\u0010*R\u001a\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bú\u0001\u0010*R\u001a\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bû\u0001\u0010*R\u001a\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bü\u0001\u0010*R\u001a\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bý\u0001\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bþ\u0001\u0010*R\u001a\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\bÿ\u0001\u0010*R\u001a\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0080\u0002\u0010*R\u001a\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0081\u0002\u0010*R\u001a\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0082\u0002\u0010*R\u001a\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0083\u0002\u0010*R\u001a\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0084\u0002\u0010*R\u001a\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0085\u0002\u0010*R\u001a\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0086\u0002\u0010*R\u001a\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0087\u0002\u0010*R\u001a\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0088\u0002\u0010*R\u001a\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u0089\u0002\u0010*R\u001a\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008a\u0002\u0010*R\u001a\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008b\u0002\u0010*R\u001a\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008c\u0002\u0010*R\u001a\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008d\u0002\u0010*R\u001a\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u000b\n\u0002\u0010+\u001a\u0005\b\u008e\u0002\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0096\u0002"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "defaultAssistChipColorsCached", "Landroidx/compose/material3/ChipColors;", "getDefaultAssistChipColorsCached$material3_release", "()Landroidx/compose/material3/ChipColors;", "setDefaultAssistChipColorsCached$material3_release", "(Landroidx/compose/material3/ChipColors;)V", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultCenterAlignedTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "()V", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release$annotations", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "defaultElevatedAssistChipColorsCached", "getDefaultElevatedAssistChipColorsCached$material3_release", "setDefaultElevatedAssistChipColorsCached$material3_release", "defaultElevatedButtonColorsCached", "getDefaultElevatedButtonColorsCached$material3_release", "setDefaultElevatedButtonColorsCached$material3_release", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultElevatedFilterChipColorsCached", "Landroidx/compose/material3/SelectableChipColors;", "getDefaultElevatedFilterChipColorsCached$material3_release", "()Landroidx/compose/material3/SelectableChipColors;", "setDefaultElevatedFilterChipColorsCached$material3_release", "(Landroidx/compose/material3/SelectableChipColors;)V", "defaultElevatedSuggestionChipColorsCached", "getDefaultElevatedSuggestionChipColorsCached$material3_release", "setDefaultElevatedSuggestionChipColorsCached$material3_release", "defaultExpressiveNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationItemColors;", "getDefaultExpressiveNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationItemColors;", "setDefaultExpressiveNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationItemColors;)V", "defaultFilledIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultFilledIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultFilledIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "defaultFilledIconToggleButtonColorsCached", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultFilledIconToggleButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconToggleButtonColors;", "setDefaultFilledIconToggleButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconToggleButtonColors;)V", "defaultFilledTonalButtonColorsCached", "getDefaultFilledTonalButtonColorsCached$material3_release", "setDefaultFilledTonalButtonColorsCached$material3_release", "defaultFilledTonalIconButtonColorsCached", "getDefaultFilledTonalIconButtonColorsCached$material3_release", "setDefaultFilledTonalIconButtonColorsCached$material3_release", "defaultFilledTonalIconToggleButtonColorsCached", "getDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "setDefaultFilledTonalIconToggleButtonColorsCached$material3_release", "defaultFilterChipColorsCached", "getDefaultFilterChipColorsCached$material3_release", "setDefaultFilterChipColorsCached$material3_release", "defaultIconButtonColorsCached", "getDefaultIconButtonColorsCached$material3_release", "setDefaultIconButtonColorsCached$material3_release", "defaultIconToggleButtonColorsCached", "getDefaultIconToggleButtonColorsCached$material3_release", "setDefaultIconToggleButtonColorsCached$material3_release", "defaultInputChipColorsCached", "getDefaultInputChipColorsCached$material3_release", "setDefaultInputChipColorsCached$material3_release", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/NavigationRailItemColors;", "getDefaultNavigationRailItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationRailItemColors;", "setDefaultNavigationRailItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationRailItemColors;)V", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "defaultOutlinedIconButtonColorsCached", "getDefaultOutlinedIconButtonColorsCached$material3_release", "setDefaultOutlinedIconButtonColorsCached$material3_release", "defaultOutlinedIconToggleButtonColorsCached", "getDefaultOutlinedIconToggleButtonColorsCached$material3_release", "setDefaultOutlinedIconToggleButtonColorsCached$material3_release", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "defaultRichTooltipColorsCached", "Landroidx/compose/material3/RichTooltipColors;", "getDefaultRichTooltipColorsCached$material3_release$annotations", "getDefaultRichTooltipColorsCached$material3_release", "()Landroidx/compose/material3/RichTooltipColors;", "setDefaultRichTooltipColorsCached$material3_release", "(Landroidx/compose/material3/RichTooltipColors;)V", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/SegmentedButtonColors;", "getDefaultSegmentedButtonColorsCached$material3_release$annotations", "getDefaultSegmentedButtonColorsCached$material3_release", "()Landroidx/compose/material3/SegmentedButtonColors;", "setDefaultSegmentedButtonColorsCached$material3_release", "(Landroidx/compose/material3/SegmentedButtonColors;)V", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "defaultSuggestionChipColorsCached", "getDefaultSuggestionChipColorsCached$material3_release", "setDefaultSuggestionChipColorsCached$material3_release", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "defaultTimePickerColorsCached", "Landroidx/compose/material3/TimePickerColors;", "getDefaultTimePickerColorsCached$material3_release$annotations", "getDefaultTimePickerColorsCached$material3_release", "()Landroidx/compose/material3/TimePickerColors;", "setDefaultTimePickerColorsCached$material3_release", "(Landroidx/compose/material3/TimePickerColors;)V", "defaultTopAppBarColorsCached", "getDefaultTopAppBarColorsCached$material3_release$annotations", "getDefaultTopAppBarColorsCached$material3_release", "setDefaultTopAppBarColorsCached$material3_release", "getError-0d7_KjU", "getErrorContainer-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getInversePrimary-0d7_KjU", "getInverseSurface-0d7_KjU", "getOnBackground-0d7_KjU", "getOnError-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOnPrimary-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getOnSecondary-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getOnSurface-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getOnTertiary-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getScrim-0d7_KjU", "getSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getSurface-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceTint-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private NavigationItemColors defaultExpressiveNavigationBarItemColorsCached;
    private IconButtonColors defaultFilledIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private TopAppBarColors defaultLargeTopAppBarColorsCached;
    private TopAppBarColors defaultMediumTopAppBarColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private IconButtonColors defaultOutlinedIconButtonColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    static {
    }

    public /* synthetic */ ColorScheme(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, long r47, long r49, long r51, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, long r69, long r71, DefaultConstructorMarker r73) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use constructor with additional 'surfaceContainer' roles.", replaceWith = @ReplaceWith(expression = "ColorScheme(primary,\nonPrimary,\nprimaryContainer,\nonPrimaryContainer,\ninversePrimary,\nsecondary,\nonSecondary,\nsecondaryContainer,\nonSecondaryContainer,\ntertiary,\nonTertiary,\ntertiaryContainer,\nonTertiaryContainer,\nbackground,\nonBackground,\nsurface,\nonSurface,\nsurfaceVariant,\nonSurfaceVariant,\nsurfaceTint,\ninverseSurface,\ninverseOnSurface,\nerror,\nonError,\nerrorContainer,\nonErrorContainer,\noutline,\noutlineVariant,\nscrim,\nsurfaceBright,\nsurfaceDim,\nsurfaceContainer,\nsurfaceContainerHigh,\nsurfaceContainerHighest,\nsurfaceContainerLow,\nsurfaceContainerLowest,)", imports = {}))
    public /* synthetic */ ColorScheme(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, long r47, long r49, long r51, long r53, long r55, long r57, DefaultConstructorMarker r59) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57);
    }

    public static /* synthetic */ void getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultLargeTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultMediumTopAppBarColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultSegmentedButtonColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3_release$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3_release$annotations() {
    }

    private ColorScheme(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest) {
        this.primary = primary;
        this.onPrimary = onPrimary;
        this.primaryContainer = primaryContainer;
        this.onPrimaryContainer = onPrimaryContainer;
        this.inversePrimary = inversePrimary;
        this.secondary = secondary;
        this.onSecondary = onSecondary;
        this.secondaryContainer = secondaryContainer;
        this.onSecondaryContainer = onSecondaryContainer;
        this.tertiary = tertiary;
        this.onTertiary = onTertiary;
        this.tertiaryContainer = tertiaryContainer;
        this.onTertiaryContainer = onTertiaryContainer;
        this.background = background;
        this.onBackground = onBackground;
        this.surface = surface;
        this.onSurface = onSurface;
        this.surfaceVariant = surfaceVariant;
        this.onSurfaceVariant = onSurfaceVariant;
        this.surfaceTint = surfaceTint;
        this.inverseSurface = inverseSurface;
        this.inverseOnSurface = inverseOnSurface;
        this.error = error;
        this.onError = onError;
        this.errorContainer = errorContainer;
        this.onErrorContainer = onErrorContainer;
        this.outline = outline;
        this.outlineVariant = outlineVariant;
        this.scrim = scrim;
        this.surfaceBright = surfaceBright;
        this.surfaceDim = surfaceDim;
        this.surfaceContainer = surfaceContainer;
        this.surfaceContainerHigh = surfaceContainerHigh;
        this.surfaceContainerHighest = surfaceContainerHighest;
        this.surfaceContainerLow = surfaceContainerLow;
        this.surfaceContainerLowest = surfaceContainerLowest;
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m2038getPrimary0d7_KjU() {
        return this.primary;
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m2028getOnPrimary0d7_KjU() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2039getPrimaryContainer0d7_KjU() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2029getOnPrimaryContainer0d7_KjU() {
        return this.onPrimaryContainer;
    }

    /* JADX INFO: renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m2023getInversePrimary0d7_KjU() {
        return this.inversePrimary;
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m2041getSecondary0d7_KjU() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m2030getOnSecondary0d7_KjU() {
        return this.onSecondary;
    }

    /* JADX INFO: renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2042getSecondaryContainer0d7_KjU() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2031getOnSecondaryContainer0d7_KjU() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m2053getTertiary0d7_KjU() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m2034getOnTertiary0d7_KjU() {
        return this.onTertiary;
    }

    /* JADX INFO: renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2054getTertiaryContainer0d7_KjU() {
        return this.tertiaryContainer;
    }

    /* JADX INFO: renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m2035getOnTertiaryContainer0d7_KjU() {
        return this.onTertiaryContainer;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m2019getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m2025getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m2043getSurface0d7_KjU() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m2032getOnSurface0d7_KjU() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m2052getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m2033getOnSurfaceVariant0d7_KjU() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m2051getSurfaceTint0d7_KjU() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m2024getInverseSurface0d7_KjU() {
        return this.inverseSurface;
    }

    /* JADX INFO: renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m2022getInverseOnSurface0d7_KjU() {
        return this.inverseOnSurface;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m2020getError0d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m2026getOnError0d7_KjU() {
        return this.onError;
    }

    /* JADX INFO: renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m2021getErrorContainer0d7_KjU() {
        return this.errorContainer;
    }

    /* JADX INFO: renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m2027getOnErrorContainer0d7_KjU() {
        return this.onErrorContainer;
    }

    /* JADX INFO: renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m2036getOutline0d7_KjU() {
        return this.outline;
    }

    /* JADX INFO: renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m2037getOutlineVariant0d7_KjU() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m2040getScrim0d7_KjU() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name */
    public final long m2044getSurfaceBright0d7_KjU() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name */
    public final long m2050getSurfaceDim0d7_KjU() {
        return this.surfaceDim;
    }

    /* JADX INFO: renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name */
    public final long m2045getSurfaceContainer0d7_KjU() {
        return this.surfaceContainer;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name */
    public final long m2046getSurfaceContainerHigh0d7_KjU() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name */
    public final long m2047getSurfaceContainerHighest0d7_KjU() {
        return this.surfaceContainerHighest;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name */
    public final long m2048getSurfaceContainerLow0d7_KjU() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name */
    public final long m2049getSurfaceContainerLowest0d7_KjU() {
        return this.surfaceContainerLowest;
    }

    private ColorScheme(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        this(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU(), null);
    }

    /* JADX INFO: renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2015copyCXl9yA$default(ColorScheme r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, long r50, long r52, long r54, long r56, long r58, long r60, long r62, long r64, long r66, long r68, long r70, long r72, long r74, long r76, long r78, long r80, long r82, long r84, long r86, long r88, long r90, int r92, int r93, Object r94) {
        if ((r92 & 1) == 0) goto L5;
        long r2 = r19.primary;
    L7:
        if ((r92 & 2) == 0) goto L9;
        long r4 = r19.onPrimary;
    L11:
        if ((r92 & 4) == 0) goto L13;
        long r6 = r19.primaryContainer;
    L15:
        if ((r92 & 8) == 0) goto L17;
        long r8 = r19.onPrimaryContainer;
    L19:
        if ((r92 & 16) == 0) goto L21;
        long r10 = r19.inversePrimary;
    L23:
        if ((r92 & 32) == 0) goto L25;
        long r12 = r19.secondary;
    L27:
        if ((r92 & 64) == 0) goto L29;
        long r14 = r19.onSecondary;
    L30:
        long r16 = r2;
        if ((r92 & 128) == 0) goto L33;
        long r3 = r19.secondaryContainer;
    L34:
        long r21 = r3;
        if ((r92 & 256) == 0) goto L37;
        long r5 = r19.onSecondaryContainer;
    L38:
        long r23 = r5;
        if ((r92 & 512) == 0) goto L41;
        long r7 = r19.tertiary;
    L42:
        long r25 = r7;
        if ((r92 & 1024) == 0) goto L45;
        long r9 = r19.onTertiary;
    L46:
        long r27 = r9;
        if ((r92 & 2048) == 0) goto L49;
        long r11 = r19.tertiaryContainer;
    L50:
        long r29 = r11;
        if ((r92 & 4096) == 0) goto L53;
        long r13 = r19.onTertiaryContainer;
    L54:
        long r31 = r13;
        if ((r92 & 8192) == 0) goto L57;
        long r15 = r19.background;
    L58:
        long r33 = r15;
        if ((r92 & 16384) == 0) goto L61;
        long r17 = r19.onBackground;
    L63:
        if ((r92 & 32768) == 0) goto L65;
        long r1 = r19.surface;
    L67:
        if ((r92 & 65536) == 0) goto L69;
        long r18 = r19.onSurface;
    L71:
        if ((r92 & 131072) == 0) goto L73;
        long r35 = r19.surfaceVariant;
    L75:
        if ((r92 & 262144) == 0) goto L77;
        long r37 = r19.onSurfaceVariant;
    L79:
        if ((r92 & 524288) == 0) goto L81;
        long r39 = r19.surfaceTint;
    L83:
        if ((r92 & 1048576) == 0) goto L85;
        long r41 = r19.inverseSurface;
    L87:
        if ((r92 & 2097152) == 0) goto L89;
        long r43 = r19.inverseOnSurface;
    L91:
        if ((r92 & 4194304) == 0) goto L93;
        long r45 = r19.error;
    L95:
        if ((r92 & 8388608) == 0) goto L97;
        long r47 = r19.onError;
    L99:
        if ((r92 & 16777216) == 0) goto L101;
        long r49 = r19.errorContainer;
    L103:
        if ((r92 & 33554432) == 0) goto L105;
        long r51 = r19.onErrorContainer;
    L107:
        if ((r92 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r53 = r19.outline;
    L111:
        if ((r92 & 134217728) == 0) goto L113;
        long r55 = r19.outlineVariant;
    L115:
        if ((r92 & 268435456) == 0) goto L117;
        long r57 = r19.scrim;
    L119:
        if ((r92 & 536870912) == 0) goto L121;
        long r59 = r19.surfaceBright;
    L123:
        if ((r92 & 1073741824) == 0) goto L125;
        long r61 = r19.surfaceDim;
    L127:
        if ((r92 & Integer.MIN_VALUE) == 0) goto L129;
        long r63 = r19.surfaceContainer;
    L131:
        if ((r93 & 1) == 0) goto L133;
        long r65 = r19.surfaceContainerHigh;
    L135:
        if ((r93 & 2) == 0) goto L137;
        long r67 = r19.surfaceContainerHighest;
    L139:
        if ((r93 & 4) == 0) goto L141;
        long r69 = r19.surfaceContainerLow;
    L143:
        if ((r93 & 8) == 0) goto L145;
        long r71 = r19.surfaceContainerLowest;
    L146:
        long r610 = r43;
        long r611 = r45;
        long r612 = r47;
        long r613 = r49;
        long r73 = r51;
        long r75 = r53;
        long r77 = r55;
        long r410 = r17;
        long r510 = r1;
        long r511 = r18;
        long r512 = r35;
        long r513 = r37;
        long r514 = r39;
        long r614 = r41;
        long r210 = r4;
        long r211 = r6;
        long r212 = r8;
        long r213 = r10;
        long r310 = r12;
        long r311 = r14;
        return r19.m2017copyCXl9yA(r16, r210, r211, r212, r213, r310, r311, r21, r23, r25, r27, r29, r31, r33, r410, r510, r511, r512, r513, r514, r614, r610, r611, r612, r613, r73, r75, r77, r57, r59, r61, r63, r65, r67, r69, r71);
    L145:
        r71 = r90;
        goto L146
    L141:
        r69 = r88;
        goto L143
    L137:
        r67 = r86;
        goto L139
    L133:
        r65 = r84;
        goto L135
    L129:
        r63 = r82;
        goto L131
    L125:
        r61 = r80;
        goto L127
    L121:
        r59 = r78;
        goto L123
    L117:
        r57 = r76;
        goto L119
    L113:
        r55 = r74;
        goto L115
    L109:
        r53 = r72;
        goto L111
    L105:
        r51 = r70;
        goto L107
    L101:
        r49 = r68;
        goto L103
    L97:
        r47 = r66;
        goto L99
    L93:
        r45 = r64;
        goto L95
    L89:
        r43 = r62;
        goto L91
    L85:
        r41 = r60;
        goto L87
    L81:
        r39 = r58;
        goto L83
    L77:
        r37 = r56;
        goto L79
    L73:
        r35 = r54;
        goto L75
    L69:
        r18 = r52;
        goto L71
    L65:
        r1 = r50;
        goto L67
    L61:
        r17 = r48;
        goto L63
    L57:
        r15 = r46;
        goto L58
    L53:
        r13 = r44;
        goto L54
    L49:
        r11 = r42;
        goto L50
    L45:
        r9 = r40;
        goto L46
    L41:
        r7 = r38;
        goto L42
    L37:
        r5 = r36;
        goto L38
    L33:
        r3 = r34;
        goto L34
    L29:
        r14 = r32;
        goto L30
    L25:
        r12 = r30;
        goto L27
    L21:
        r10 = r28;
        goto L23
    L17:
        r8 = r26;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final ColorScheme m2017copyCXl9yA(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, null);
    }

    /* JADX INFO: renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2016copyG1PFcw$default(ColorScheme r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, long r50, long r52, long r54, long r56, long r58, long r60, long r62, long r64, long r66, long r68, long r70, long r72, long r74, long r76, int r78, Object r79) {
        if ((r78 & 1) == 0) goto L5;
        long r2 = r19.primary;
    L7:
        if ((r78 & 2) == 0) goto L9;
        long r4 = r19.onPrimary;
    L11:
        if ((r78 & 4) == 0) goto L13;
        long r6 = r19.primaryContainer;
    L15:
        if ((r78 & 8) == 0) goto L17;
        long r8 = r19.onPrimaryContainer;
    L19:
        if ((r78 & 16) == 0) goto L21;
        long r10 = r19.inversePrimary;
    L23:
        if ((r78 & 32) == 0) goto L25;
        long r12 = r19.secondary;
    L27:
        if ((r78 & 64) == 0) goto L29;
        long r14 = r19.onSecondary;
    L30:
        long r16 = r2;
        if ((r78 & 128) == 0) goto L33;
        long r3 = r19.secondaryContainer;
    L34:
        long r21 = r3;
        if ((r78 & 256) == 0) goto L37;
        long r5 = r19.onSecondaryContainer;
    L38:
        long r23 = r5;
        if ((r78 & 512) == 0) goto L41;
        long r7 = r19.tertiary;
    L42:
        long r25 = r7;
        if ((r78 & 1024) == 0) goto L45;
        long r9 = r19.onTertiary;
    L46:
        long r27 = r9;
        if ((r78 & 2048) == 0) goto L49;
        long r11 = r19.tertiaryContainer;
    L50:
        long r29 = r11;
        if ((r78 & 4096) == 0) goto L53;
        long r13 = r19.onTertiaryContainer;
    L54:
        long r31 = r13;
        if ((r78 & 8192) == 0) goto L57;
        long r15 = r19.background;
    L58:
        long r33 = r15;
        if ((r78 & 16384) == 0) goto L61;
        long r17 = r19.onBackground;
    L63:
        if ((r78 & 32768) == 0) goto L65;
        long r1 = r19.surface;
    L67:
        if ((r78 & 65536) == 0) goto L69;
        long r18 = r19.onSurface;
    L71:
        if ((r78 & 131072) == 0) goto L73;
        long r35 = r19.surfaceVariant;
    L75:
        if ((r78 & 262144) == 0) goto L77;
        long r37 = r19.onSurfaceVariant;
    L79:
        if ((r78 & 524288) == 0) goto L81;
        long r39 = r19.surfaceTint;
    L83:
        if ((r78 & 1048576) == 0) goto L85;
        long r41 = r19.inverseSurface;
    L87:
        if ((r78 & 2097152) == 0) goto L89;
        long r43 = r19.inverseOnSurface;
    L91:
        if ((r78 & 4194304) == 0) goto L93;
        long r45 = r19.error;
    L95:
        if ((r78 & 8388608) == 0) goto L97;
        long r47 = r19.onError;
    L99:
        if ((r78 & 16777216) == 0) goto L101;
        long r49 = r19.errorContainer;
    L103:
        if ((r78 & 33554432) == 0) goto L105;
        long r51 = r19.onErrorContainer;
    L107:
        if ((r78 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r53 = r19.outline;
    L111:
        if ((r78 & 134217728) == 0) goto L113;
        long r55 = r19.outlineVariant;
    L115:
        if ((r78 & 268435456) == 0) goto L117;
        long r57 = r19.scrim;
    L118:
        long r410 = r17;
        long r59 = r1;
        long r510 = r18;
        long r511 = r35;
        long r512 = r37;
        long r513 = r39;
        long r61 = r41;
        long r210 = r4;
        long r211 = r6;
        long r212 = r8;
        long r213 = r10;
        long r310 = r12;
        long r311 = r14;
        return r19.m2018copyG1PFcw(r16, r210, r211, r212, r213, r310, r311, r21, r23, r25, r27, r29, r31, r33, r410, r59, r510, r511, r512, r513, r61, r43, r45, r47, r49, r51, r53, r55, r57);
    L117:
        r57 = r76;
        goto L118
    L113:
        r55 = r74;
        goto L115
    L109:
        r53 = r72;
        goto L111
    L105:
        r51 = r70;
        goto L107
    L101:
        r49 = r68;
        goto L103
    L97:
        r47 = r66;
        goto L99
    L93:
        r45 = r64;
        goto L95
    L89:
        r43 = r62;
        goto L91
    L85:
        r41 = r60;
        goto L87
    L81:
        r39 = r58;
        goto L83
    L77:
        r37 = r56;
        goto L79
    L73:
        r35 = r54;
        goto L75
    L69:
        r18 = r52;
        goto L71
    L65:
        r1 = r50;
        goto L67
    L61:
        r17 = r48;
        goto L63
    L57:
        r15 = r46;
        goto L58
    L53:
        r13 = r44;
        goto L54
    L49:
        r11 = r42;
        goto L50
    L45:
        r9 = r40;
        goto L46
    L41:
        r7 = r38;
        goto L42
    L37:
        r5 = r36;
        goto L38
    L33:
        r3 = r34;
        goto L34
    L29:
        r14 = r32;
        goto L30
    L25:
        r12 = r30;
        goto L27
    L21:
        r10 = r28;
        goto L23
    L17:
        r8 = r26;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* JADX INFO: renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m2018copyG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return m2015copyCXl9yA$default(this, primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0, 0, 0, 0, 0, 0, 0, -536870912, 15, null);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("ColorScheme(primary=").append(Color.m4374toStringimpl(this.primary)).append("onPrimary=").append(Color.m4374toStringimpl(this.onPrimary)).append("primaryContainer=").append(Color.m4374toStringimpl(this.primaryContainer)).append("onPrimaryContainer=").append(Color.m4374toStringimpl(this.onPrimaryContainer)).append("inversePrimary=").append(Color.m4374toStringimpl(this.inversePrimary)).append("secondary=").append(Color.m4374toStringimpl(this.secondary)).append("onSecondary=").append(Color.m4374toStringimpl(this.onSecondary)).append("secondaryContainer=").append(Color.m4374toStringimpl(this.secondaryContainer)).append("onSecondaryContainer=").append(Color.m4374toStringimpl(this.onSecondaryContainer)).append("tertiary=").append(Color.m4374toStringimpl(this.tertiary)).append("onTertiary=").append(Color.m4374toStringimpl(this.onTertiary)).append("tertiaryContainer=");
        r0.append(Color.m4374toStringimpl(this.tertiaryContainer)).append("onTertiaryContainer=").append(Color.m4374toStringimpl(this.onTertiaryContainer)).append("background=").append(Color.m4374toStringimpl(this.background)).append("onBackground=").append(Color.m4374toStringimpl(this.onBackground)).append("surface=").append(Color.m4374toStringimpl(this.surface)).append("onSurface=").append(Color.m4374toStringimpl(this.onSurface)).append("surfaceVariant=").append(Color.m4374toStringimpl(this.surfaceVariant)).append("onSurfaceVariant=").append(Color.m4374toStringimpl(this.onSurfaceVariant)).append("surfaceTint=").append(Color.m4374toStringimpl(this.surfaceTint)).append("inverseSurface=").append(Color.m4374toStringimpl(this.inverseSurface)).append("inverseOnSurface=").append(Color.m4374toStringimpl(this.inverseOnSurface)).append("error=").append(Color.m4374toStringimpl(this.error));
        r0.append("onError=").append(Color.m4374toStringimpl(this.onError)).append("errorContainer=").append(Color.m4374toStringimpl(this.errorContainer)).append("onErrorContainer=").append(Color.m4374toStringimpl(this.onErrorContainer)).append("outline=").append(Color.m4374toStringimpl(this.outline)).append("outlineVariant=").append(Color.m4374toStringimpl(this.outlineVariant)).append("scrim=").append(Color.m4374toStringimpl(this.scrim)).append("surfaceBright=").append(Color.m4374toStringimpl(this.surfaceBright)).append("surfaceDim=").append(Color.m4374toStringimpl(this.surfaceDim)).append("surfaceContainer=").append(Color.m4374toStringimpl(this.surfaceContainer)).append("surfaceContainerHigh=").append(Color.m4374toStringimpl(this.surfaceContainerHigh)).append("surfaceContainerHighest=").append(Color.m4374toStringimpl(this.surfaceContainerHighest)).append("surfaceContainerLow=");
        r0.append(Color.m4374toStringimpl(this.surfaceContainerLow)).append("surfaceContainerLowest=").append(Color.m4374toStringimpl(this.surfaceContainerLowest)).append(')');
        return r0.toString();
    }

    public final ButtonColors getDefaultButtonColorsCached$material3_release() {
        return this.defaultButtonColorsCached;
    }

    public final void setDefaultButtonColorsCached$material3_release(ButtonColors r1) {
        this.defaultButtonColorsCached = r1;
    }

    public final ButtonColors getDefaultElevatedButtonColorsCached$material3_release() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final void setDefaultElevatedButtonColorsCached$material3_release(ButtonColors r1) {
        this.defaultElevatedButtonColorsCached = r1;
    }

    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3_release() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3_release(ButtonColors r1) {
        this.defaultFilledTonalButtonColorsCached = r1;
    }

    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3_release() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(ButtonColors r1) {
        this.defaultOutlinedButtonColorsCached = r1;
    }

    public final ButtonColors getDefaultTextButtonColorsCached$material3_release() {
        return this.defaultTextButtonColorsCached;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(ButtonColors r1) {
        this.defaultTextButtonColorsCached = r1;
    }

    public final CardColors getDefaultCardColorsCached$material3_release() {
        return this.defaultCardColorsCached;
    }

    public final void setDefaultCardColorsCached$material3_release(CardColors r1) {
        this.defaultCardColorsCached = r1;
    }

    public final CardColors getDefaultElevatedCardColorsCached$material3_release() {
        return this.defaultElevatedCardColorsCached;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(CardColors r1) {
        this.defaultElevatedCardColorsCached = r1;
    }

    public final CardColors getDefaultOutlinedCardColorsCached$material3_release() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(CardColors r1) {
        this.defaultOutlinedCardColorsCached = r1;
    }

    public final ChipColors getDefaultAssistChipColorsCached$material3_release() {
        return this.defaultAssistChipColorsCached;
    }

    public final void setDefaultAssistChipColorsCached$material3_release(ChipColors r1) {
        this.defaultAssistChipColorsCached = r1;
    }

    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3_release() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3_release(ChipColors r1) {
        this.defaultElevatedAssistChipColorsCached = r1;
    }

    public final ChipColors getDefaultSuggestionChipColorsCached$material3_release() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final void setDefaultSuggestionChipColorsCached$material3_release(ChipColors r1) {
        this.defaultSuggestionChipColorsCached = r1;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3_release() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3_release(ChipColors r1) {
        this.defaultElevatedSuggestionChipColorsCached = r1;
    }

    public final SelectableChipColors getDefaultFilterChipColorsCached$material3_release() {
        return this.defaultFilterChipColorsCached;
    }

    public final void setDefaultFilterChipColorsCached$material3_release(SelectableChipColors r1) {
        this.defaultFilterChipColorsCached = r1;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3_release() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3_release(SelectableChipColors r1) {
        this.defaultElevatedFilterChipColorsCached = r1;
    }

    public final SelectableChipColors getDefaultInputChipColorsCached$material3_release() {
        return this.defaultInputChipColorsCached;
    }

    public final void setDefaultInputChipColorsCached$material3_release(SelectableChipColors r1) {
        this.defaultInputChipColorsCached = r1;
    }

    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3_release() {
        return this.defaultTopAppBarColorsCached;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(TopAppBarColors r1) {
        this.defaultTopAppBarColorsCached = r1;
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached$material3_release() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(TopAppBarColors r1) {
        this.defaultCenterAlignedTopAppBarColorsCached = r1;
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached$material3_release() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(TopAppBarColors r1) {
        this.defaultMediumTopAppBarColorsCached = r1;
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached$material3_release() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(TopAppBarColors r1) {
        this.defaultLargeTopAppBarColorsCached = r1;
    }

    public final CheckboxColors getDefaultCheckboxColorsCached$material3_release() {
        return this.defaultCheckboxColorsCached;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(CheckboxColors r1) {
        this.defaultCheckboxColorsCached = r1;
    }

    public final DatePickerColors getDefaultDatePickerColorsCached$material3_release() {
        return this.defaultDatePickerColorsCached;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(DatePickerColors r1) {
        this.defaultDatePickerColorsCached = r1;
    }

    public final IconButtonColors getDefaultIconButtonColorsCached$material3_release() {
        return this.defaultIconButtonColorsCached;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(IconButtonColors r1) {
        this.defaultIconButtonColorsCached = r1;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached$material3_release() {
        return this.defaultIconToggleButtonColorsCached;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3_release(IconToggleButtonColors r1) {
        this.defaultIconToggleButtonColorsCached = r1;
    }

    public final IconButtonColors getDefaultFilledIconButtonColorsCached$material3_release() {
        return this.defaultFilledIconButtonColorsCached;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3_release(IconButtonColors r1) {
        this.defaultFilledIconButtonColorsCached = r1;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached$material3_release() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3_release(IconToggleButtonColors r1) {
        this.defaultFilledIconToggleButtonColorsCached = r1;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached$material3_release() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3_release(IconButtonColors r1) {
        this.defaultFilledTonalIconButtonColorsCached = r1;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached$material3_release() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    public final void setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(IconToggleButtonColors r1) {
        this.defaultFilledTonalIconToggleButtonColorsCached = r1;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached$material3_release() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3_release(IconButtonColors r1) {
        this.defaultOutlinedIconButtonColorsCached = r1;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached$material3_release() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3_release(IconToggleButtonColors r1) {
        this.defaultOutlinedIconToggleButtonColorsCached = r1;
    }

    public final MenuItemColors getDefaultMenuItemColorsCached$material3_release() {
        return this.defaultMenuItemColorsCached;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(MenuItemColors r1) {
        this.defaultMenuItemColorsCached = r1;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3_release() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(NavigationBarItemColors r1) {
        this.defaultNavigationBarItemColorsCached = r1;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3_release() {
        return this.defaultNavigationRailItemColorsCached;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3_release(NavigationRailItemColors r1) {
        this.defaultNavigationRailItemColorsCached = r1;
    }

    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColorsCached$material3_release() {
        return this.defaultExpressiveNavigationBarItemColorsCached;
    }

    public final void setDefaultExpressiveNavigationBarItemColorsCached$material3_release(NavigationItemColors r1) {
        this.defaultExpressiveNavigationBarItemColorsCached = r1;
    }

    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3_release() {
        return this.defaultRadioButtonColorsCached;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(RadioButtonColors r1) {
        this.defaultRadioButtonColorsCached = r1;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3_release() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3_release(SegmentedButtonColors r1) {
        this.defaultSegmentedButtonColorsCached = r1;
    }

    public final SliderColors getDefaultSliderColorsCached$material3_release() {
        return this.defaultSliderColorsCached;
    }

    public final void setDefaultSliderColorsCached$material3_release(SliderColors r1) {
        this.defaultSliderColorsCached = r1;
    }

    public final SwitchColors getDefaultSwitchColorsCached$material3_release() {
        return this.defaultSwitchColorsCached;
    }

    public final void setDefaultSwitchColorsCached$material3_release(SwitchColors r1) {
        this.defaultSwitchColorsCached = r1;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3_release() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(TextFieldColors r1) {
        this.defaultOutlinedTextFieldColorsCached = r1;
    }

    public final TextFieldColors getDefaultTextFieldColorsCached$material3_release() {
        return this.defaultTextFieldColorsCached;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(TextFieldColors r1) {
        this.defaultTextFieldColorsCached = r1;
    }

    public final TimePickerColors getDefaultTimePickerColorsCached$material3_release() {
        return this.defaultTimePickerColorsCached;
    }

    public final void setDefaultTimePickerColorsCached$material3_release(TimePickerColors r1) {
        this.defaultTimePickerColorsCached = r1;
    }

    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3_release() {
        return this.defaultRichTooltipColorsCached;
    }

    public final void setDefaultRichTooltipColorsCached$material3_release(RichTooltipColors r1) {
        this.defaultRichTooltipColorsCached = r1;
    }
}
