package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H¥\u00010¤\u0001\"\u0005\b\u0000\u0010¥\u00012\u0007\u0010¦\u0001\u001a\u00020\u0019H\u0000\u001aD\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H¥\u00010¤\u0001\"\u0005\b\u0000\u0010¥\u00012\u0007\u0010¦\u0001\u001a\u00020\u00192!\u0010§\u0001\u001a\u001c\u0012\u0007\u0012\u0005\u0018\u0001H¥\u0001\u0012\u0005\u0012\u0003H¥\u0001\u0012\u0007\u0012\u0005\u0018\u0001H¥\u00010¨\u0001H\u0000\u001a4\u0010©\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u0003H¥\u00010ª\u00010¤\u0001\"\u0010\b\u0000\u0010¥\u0001*\t\u0012\u0004\u0012\u0002050«\u00012\u0007\u0010¦\u0001\u001a\u00020\u0019H\u0082\b\u001a\u0017\u0010¬\u0001\u001a\u0003H¥\u0001\"\u0005\b\u0000\u0010¥\u0001H\u0002¢\u0006\u0003\u0010\u00ad\u0001\u001a+\u0010®\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010³\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010´\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010µ\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a\f\u0010¶\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a\f\u0010·\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a+\u0010¸\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a\u0015\u0010¹\u0001\u001a\u00030¯\u0001*\u00020\u00032\u0007\u0010º\u0001\u001a\u00020\u0019\u001a+\u0010»\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a,\u0010¼\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0011\u0010±\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0098\u00010²\u0001\u001a9\u0010½\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u001e\u0010±\u0001\u001a\u0019\u0012\f\u0012\n\u0012\u0005\u0012\u00030À\u00010¿\u0001\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001a\f\u0010Á\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a\f\u0010Â\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a#\u0010Ã\u0001\u001a\u00030¯\u0001*\u00020\u00032\u0015\u0010Ä\u0001\u001a\u0010\u0012\u0005\u0012\u00030Å\u0001\u0012\u0004\u0012\u00020b0¾\u0001\u001a1\u0010Æ\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0016\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001a\u000e\u0010Ç\u0001\u001a\u00030¯\u0001*\u00020\u0003H\u0007\u001a1\u0010È\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0016\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001a+\u0010É\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a@\u0010Ê\u0001\u001a\u00030¯\u0001*\u00020\u00032\u0007\u0010Ë\u0001\u001a\u00020C2\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001ø\u0001\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001\u001a+\u0010Î\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010Ï\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010Ð\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010Ñ\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a+\u0010Ò\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a\f\u0010Ó\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a+\u0010Ô\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a-\u0010Õ\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001H\u0007\u001a\f\u0010Ö\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a+\u0010×\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0010\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u000205\u0018\u00010²\u0001\u001a]\u0010Ø\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192B\u0010±\u0001\u001a=\u0012\u0017\u0012\u00150\u0098\u0001¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(Ú\u0001\u0012\u0017\u0012\u00150\u0098\u0001¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(Û\u0001\u0012\u0004\u0012\u000205\u0018\u00010¨\u0001\u001aN\u0010Ü\u0001\u001a\u00030¯\u0001*\u00020\u00032:\u0010±\u0001\u001a5\b\u0001\u0012\u0017\u0012\u00150Ý\u0001¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(Þ\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ý\u00010ß\u0001\u0012\u0007\u0012\u0005\u0018\u00010Å\u00010¨\u0001¢\u0006\u0003\u0010à\u0001\u001a/\u0010á\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0014\u0010±\u0001\u001a\u000f\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u0002050¾\u0001\u001a\f\u0010â\u0001\u001a\u00030¯\u0001*\u00020\u0003\u001a2\u0010ã\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0017\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001as\u0010ä\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192X\u0010±\u0001\u001aS\u0012\u0016\u0012\u00140b¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(æ\u0001\u0012\u0016\u0012\u00140b¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(ç\u0001\u0012\u0016\u0012\u001405¢\u0006\u000f\bÙ\u0001\u0012\n\b¦\u0001\u0012\u0005\b\b(è\u0001\u0012\u0004\u0012\u000205\u0018\u00010å\u0001\u001a1\u0010\u0085\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0016\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001a1\u0010\u0090\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0016\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\u001a1\u0010é\u0001\u001a\u00030¯\u0001*\u00020\u00032\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u00010\u00192\u0016\u0010±\u0001\u001a\u0011\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0018\u00010¾\u0001\"/\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t*\u0004\b\u0004\u0010\u0005\"/\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010*\u0004\b\f\u0010\u0005\"/\u0010\u0012\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017*\u0004\b\u0013\u0010\u0005\"(\u0010\u001a\u001a\u00020\u0019*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\"/\u0010 \u001a\u00020\u001f*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%*\u0004\b!\u0010\u0005\";\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020'0&8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-*\u0004\b)\u0010\u0005\"/\u0010/\u001a\u00020.*\u00020\u00032\u0006\u0010\u0000\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b1\u00102\"\u0004\b3\u00104*\u0004\b0\u0010\u0005\"/\u00106\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b8\u00109\"\u0004\b:\u0010;*\u0004\b7\u0010\u0005\"/\u0010=\u001a\u00020<*\u00020\u00032\u0006\u0010\u0000\u001a\u00020<8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B*\u0004\b>\u0010\u0005\"5\u0010D\u001a\u00020C*\u00020\u00032\u0006\u0010\u0000\u001a\u00020C8G@GX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bE\u0010F\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K*\u0004\bG\u0010\u0005\"/\u0010L\u001a\u00020.*\u00020\u00032\u0006\u0010\u0000\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bN\u00102\"\u0004\bO\u00104*\u0004\bM\u0010\u0005\"5\u0010P\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bQ\u0010F\u001a\u0004\bP\u00109\"\u0004\bS\u0010;*\u0004\bR\u0010\u0005\"/\u0010T\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bT\u00109\"\u0004\bV\u0010;*\u0004\bU\u0010\u0005\"/\u0010W\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bW\u00109\"\u0004\bY\u0010;*\u0004\bX\u0010\u0005\"/\u0010Z\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bZ\u00109\"\u0004\b\\\u0010;*\u0004\b[\u0010\u0005\"/\u0010^\u001a\u00020]*\u00020\u00032\u0006\u0010\u0000\u001a\u00020]8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b`\u0010I\"\u0004\ba\u0010K*\u0004\b_\u0010\u0005\"/\u0010c\u001a\u00020b*\u00020\u00032\u0006\u0010\u0000\u001a\u00020b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\be\u0010I\"\u0004\bf\u0010K*\u0004\bd\u0010\u0005\"/\u0010g\u001a\u00020\u0019*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bi\u0010\u001c\"\u0004\bj\u0010\u001e*\u0004\bh\u0010\u0005\"/\u0010l\u001a\u00020k*\u00020\u00032\u0006\u0010\u0000\u001a\u00020k8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q*\u0004\bm\u0010\u0005\"/\u0010s\u001a\u00020r*\u00020\u00032\u0006\u0010\u0000\u001a\u00020r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010I\"\u0004\bv\u0010K*\u0004\bt\u0010\u0005\"/\u0010w\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\by\u00109\"\u0004\bz\u0010;*\u0004\bx\u0010\u0005\"/\u0010{\u001a\u00020\u0019*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b}\u0010\u001c\"\u0004\b~\u0010\u001e*\u0004\b|\u0010\u0005\"2\u0010\u007f\u001a\u00020\u0019*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0081\u0001\u0010\u001c\"\u0005\b\u0082\u0001\u0010\u001e*\u0005\b\u0080\u0001\u0010\u0005\"+\u0010\u0083\u0001\u001a\u00020.*\u00020\u00032\u0006\u0010\u0018\u001a\u00020.8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u00102\"\u0005\b\u0085\u0001\u00104\"7\u0010\u0087\u0001\u001a\u00030\u0086\u0001*\u00020\u00032\u0007\u0010\u0000\u001a\u00030\u0086\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001*\u0005\b\u0088\u0001\u0010\u0005\"3\u0010\u008d\u0001\u001a\u00020.*\u00020\u00032\u0006\u0010\u0000\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008f\u0001\u00102\"\u0005\b\u0090\u0001\u00104*\u0005\b\u008e\u0001\u0010\u0005\"7\u0010\u0092\u0001\u001a\u00030\u0091\u0001*\u00020\u00032\u0007\u0010\u0000\u001a\u00030\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001*\u0005\b\u0093\u0001\u0010\u0005\"7\u0010\u0099\u0001\u001a\u00030\u0098\u0001*\u00020\u00032\u0007\u0010\u0000\u001a\u00030\u0098\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001*\u0005\b\u009a\u0001\u0010\u0005\"3\u0010\u009f\u0001\u001a\u00020<*\u00020\u00032\u0006\u0010\u0000\u001a\u00020<8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¡\u0001\u0010@\"\u0005\b¢\u0001\u0010B*\u0005\b \u0001\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006ê\u0001"}, d2 = {"<set-?>", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getCollectionInfo$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "collectionItemInfo", "getCollectionItemInfo$delegate", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "Landroidx/compose/ui/autofill/ContentDataType;", "contentDataType", "getContentDataType$delegate", "getContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", "setContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentDataType;)V", "value", "", "contentDescription", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Landroidx/compose/ui/autofill/ContentType;", "contentType", "getContentType$delegate", "getContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", "setContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentType;)V", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customActions", "getCustomActions$delegate", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "Landroidx/compose/ui/text/AnnotatedString;", "editableText", "getEditableText$delegate", "getEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "setEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "", "focused", "getFocused$delegate", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "getHorizontalScrollAxisRange$delegate", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "getImeAction$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getImeAction$delegate", "getImeAction", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setImeAction-4L7nppU", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "inputText", "getInputText$delegate", "getInputText", "setInputText", "isContainer", "isContainer$annotations", "isContainer$delegate", "setContainer", "isEditable", "isEditable$delegate", "setEditable", "isShowingTextSubstitution", "isShowingTextSubstitution$delegate", "setShowingTextSubstitution", "isTraversalGroup", "isTraversalGroup$delegate", "setTraversalGroup", "Landroidx/compose/ui/semantics/LiveRegionMode;", "liveRegion", "getLiveRegion$delegate", "getLiveRegion", "setLiveRegion-hR3wRGc", "", "maxTextLength", "getMaxTextLength$delegate", "getMaxTextLength", "setMaxTextLength", "paneTitle", "getPaneTitle$delegate", "getPaneTitle", "setPaneTitle", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "progressBarRangeInfo", "getProgressBarRangeInfo$delegate", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "Landroidx/compose/ui/semantics/Role;", "role", "getRole$delegate", "getRole", "setRole-kuIjeqM", "selected", "getSelected$delegate", "getSelected", "setSelected", "stateDescription", "getStateDescription$delegate", "getStateDescription", "setStateDescription", "testTag", "getTestTag$delegate", "getTestTag", "setTestTag", "text", "getText", "setText", "Landroidx/compose/ui/text/TextRange;", "textSelectionRange", "getTextSelectionRange$delegate", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSubstitution", "getTextSubstitution$delegate", "getTextSubstitution", "setTextSubstitution", "Landroidx/compose/ui/state/ToggleableState;", "toggleableState", "getToggleableState$delegate", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "", "traversalIndex", "getTraversalIndex$delegate", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "verticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "AccessibilityKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", HintConstants.AUTOFILL_HINT_NAME, "mergePolicy", "Lkotlin/Function2;", "ActionPropertyKey", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "clearTextSubstitution", "", "label", "action", "Lkotlin/Function0;", "collapse", "copyText", "cutText", "dialog", "disabled", "dismiss", "error", "description", "expand", "getScrollViewportLength", "getTextLayoutResult", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "heading", "hideFromAccessibility", "indexForKey", "mapping", "", "insertTextAtCursor", "invisibleToUser", "onAutofillText", "onClick", "onImeAction", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "pageDown", "pageLeft", "pageRight", "pageUp", HintConstants.AUTOFILL_HINT_PASSWORD, "pasteText", "performImeAction", "popup", "requestFocus", "scrollBy", "Lkotlin/ParameterName;", "x", "y", "scrollByOffset", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function2;)V", "scrollToIndex", "selectableGroup", "setProgress", "setSelection", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "showTextSubstitution", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsPropertiesKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1, reason: invalid class name */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends Lambda implements Function2<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
            return invoke((AccessibilityAction) p1, (AccessibilityAction) p2);
        }

        public final AccessibilityAction<T> invoke(AccessibilityAction<T> r4, AccessibilityAction<T> r5) {
            if (r4 == null) goto L6;
            String r1 = r4.getLabel();
            if (r1 == null) goto L6;
        L7:
            if (r4 == null) goto L10;
            Function r2 = r4.getAction();
            if (r2 == null) goto L10;
        L12:
            return new AccessibilityAction(r1, r2);
        L10:
            r2 = r5.getAction();
        L6:
            r1 = r5.getLabel();
            goto L7
        }
    }

    public static final /* synthetic */ Object access$throwSemanticsGetNotSupported() {
        return throwSemanticsGetNotSupported();
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver r0) {
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver r0) {
    }

    private static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String name) {
        return new SemanticsPropertyKey(name, true);
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String name, Function2<? super T, ? super T, ? extends T> r3) {
        return new SemanticsPropertyKey(name, true, r3);
    }

    private static final <T extends Function<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String name) {
        return AccessibilityKey(name, AnonymousClass1.INSTANCE);
    }

    public static final String getContentDescription(SemanticsPropertyReceiver $this$contentDescription) {
        return (String) throwSemanticsGetNotSupported();
    }

    public static final void setContentDescription(SemanticsPropertyReceiver $this$contentDescription, String value) {
        $this$contentDescription.set(SemanticsProperties.INSTANCE.getContentDescription(), CollectionsKt.listOf(value));
    }

    static {
        $$delegatedProperties = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        SemanticsProperties.INSTANCE.getStateDescription();
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
        SemanticsProperties.INSTANCE.getPaneTitle();
        SemanticsProperties.INSTANCE.getLiveRegion();
        SemanticsProperties.INSTANCE.getFocused();
        SemanticsProperties.INSTANCE.getIsContainer();
        SemanticsProperties.INSTANCE.getIsTraversalGroup();
        SemanticsProperties.INSTANCE.getContentType();
        SemanticsProperties.INSTANCE.getContentDataType();
        SemanticsProperties.INSTANCE.getTraversalIndex();
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        SemanticsProperties.INSTANCE.getRole();
        SemanticsProperties.INSTANCE.getTestTag();
        SemanticsProperties.INSTANCE.getTextSubstitution();
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution();
        SemanticsProperties.INSTANCE.getInputText();
        SemanticsProperties.INSTANCE.getEditableText();
        SemanticsProperties.INSTANCE.getTextSelectionRange();
        SemanticsProperties.INSTANCE.getImeAction();
        SemanticsProperties.INSTANCE.getSelected();
        SemanticsProperties.INSTANCE.getCollectionInfo();
        SemanticsProperties.INSTANCE.getCollectionItemInfo();
        SemanticsProperties.INSTANCE.getToggleableState();
        SemanticsProperties.INSTANCE.getIsEditable();
        SemanticsProperties.INSTANCE.getMaxTextLength();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final String getStateDescription(SemanticsPropertyReceiver $this$stateDescription) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue($this$stateDescription, $$delegatedProperties[0]);
    }

    private static Object getStateDescription$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getStateDescription();
    }

    public static final void setStateDescription(SemanticsPropertyReceiver $this$stateDescription, String r4) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue($this$stateDescription, $$delegatedProperties[0], r4);
    }

    public static final ProgressBarRangeInfo getProgressBarRangeInfo(SemanticsPropertyReceiver $this$progressBarRangeInfo) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue($this$progressBarRangeInfo, $$delegatedProperties[1]);
    }

    private static Object getProgressBarRangeInfo$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver $this$progressBarRangeInfo, ProgressBarRangeInfo r4) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue($this$progressBarRangeInfo, $$delegatedProperties[1], r4);
    }

    public static final void heading(SemanticsPropertyReceiver $this$heading) {
        $this$heading.set(SemanticsProperties.INSTANCE.getHeading(), Unit.INSTANCE);
    }

    public static final String getPaneTitle(SemanticsPropertyReceiver $this$paneTitle) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue($this$paneTitle, $$delegatedProperties[2]);
    }

    private static Object getPaneTitle$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getPaneTitle();
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver $this$paneTitle, String r4) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue($this$paneTitle, $$delegatedProperties[2], r4);
    }

    public static final void disabled(SemanticsPropertyReceiver $this$disabled) {
        $this$disabled.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    public static final int getLiveRegion(SemanticsPropertyReceiver $this$liveRegion) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue($this$liveRegion, $$delegatedProperties[3]).m6171unboximpl();
    }

    private static Object getLiveRegion$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getLiveRegion();
    }

    /* JADX INFO: renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m6199setLiveRegionhR3wRGc(SemanticsPropertyReceiver $this$liveRegion, int r4) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue($this$liveRegion, $$delegatedProperties[3], LiveRegionMode.m6165boximpl(r4));
    }

    public static final boolean getFocused(SemanticsPropertyReceiver $this$focused) {
        return SemanticsProperties.INSTANCE.getFocused().getValue($this$focused, $$delegatedProperties[4]).booleanValue();
    }

    private static Object getFocused$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getFocused();
    }

    public static final void setFocused(SemanticsPropertyReceiver $this$focused, boolean r4) {
        SemanticsProperties.INSTANCE.getFocused().setValue($this$focused, $$delegatedProperties[4], Boolean.valueOf(r4));
    }

    public static final boolean isContainer(SemanticsPropertyReceiver $this$isContainer) {
        return SemanticsProperties.INSTANCE.getIsContainer().getValue($this$isContainer, $$delegatedProperties[5]).booleanValue();
    }

    private static Object isContainer$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getIsContainer();
    }

    public static final void setContainer(SemanticsPropertyReceiver $this$isContainer, boolean r4) {
        SemanticsProperties.INSTANCE.getIsContainer().setValue($this$isContainer, $$delegatedProperties[5], Boolean.valueOf(r4));
    }

    public static final boolean isTraversalGroup(SemanticsPropertyReceiver $this$isTraversalGroup) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue($this$isTraversalGroup, $$delegatedProperties[6]).booleanValue();
    }

    private static Object isTraversalGroup$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup();
    }

    public static final void setTraversalGroup(SemanticsPropertyReceiver $this$isTraversalGroup, boolean r4) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue($this$isTraversalGroup, $$delegatedProperties[6], Boolean.valueOf(r4));
    }

    @Deprecated(message = "Use `hideFromAccessibility()` instead.", replaceWith = @ReplaceWith(expression = "hideFromAccessibility()", imports = {}))
    public static final void invisibleToUser(SemanticsPropertyReceiver $this$invisibleToUser) {
        $this$invisibleToUser.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.INSTANCE);
    }

    public static final void hideFromAccessibility(SemanticsPropertyReceiver $this$hideFromAccessibility) {
        $this$hideFromAccessibility.set(SemanticsProperties.INSTANCE.getHideFromAccessibility(), Unit.INSTANCE);
    }

    public static final ContentType getContentType(SemanticsPropertyReceiver $this$contentType) {
        return SemanticsProperties.INSTANCE.getContentType().getValue($this$contentType, $$delegatedProperties[7]);
    }

    private static Object getContentType$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getContentType();
    }

    public static final void setContentType(SemanticsPropertyReceiver $this$contentType, ContentType r4) {
        SemanticsProperties.INSTANCE.getContentType().setValue($this$contentType, $$delegatedProperties[7], r4);
    }

    public static final ContentDataType getContentDataType(SemanticsPropertyReceiver $this$contentDataType) {
        return SemanticsProperties.INSTANCE.getContentDataType().getValue($this$contentDataType, $$delegatedProperties[8]);
    }

    private static Object getContentDataType$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getContentDataType();
    }

    public static final void setContentDataType(SemanticsPropertyReceiver $this$contentDataType, ContentDataType r4) {
        SemanticsProperties.INSTANCE.getContentDataType().setValue($this$contentDataType, $$delegatedProperties[8], r4);
    }

    public static final float getTraversalIndex(SemanticsPropertyReceiver $this$traversalIndex) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue($this$traversalIndex, $$delegatedProperties[9]).floatValue();
    }

    private static Object getTraversalIndex$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getTraversalIndex();
    }

    public static final void setTraversalIndex(SemanticsPropertyReceiver $this$traversalIndex, float r4) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue($this$traversalIndex, $$delegatedProperties[9], Float.valueOf(r4));
    }

    public static final ScrollAxisRange getHorizontalScrollAxisRange(SemanticsPropertyReceiver $this$horizontalScrollAxisRange) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue($this$horizontalScrollAxisRange, $$delegatedProperties[10]);
    }

    private static Object getHorizontalScrollAxisRange$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
    }

    public static final void setHorizontalScrollAxisRange(SemanticsPropertyReceiver $this$horizontalScrollAxisRange, ScrollAxisRange r4) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue($this$horizontalScrollAxisRange, $$delegatedProperties[10], r4);
    }

    public static final ScrollAxisRange getVerticalScrollAxisRange(SemanticsPropertyReceiver $this$verticalScrollAxisRange) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue($this$verticalScrollAxisRange, $$delegatedProperties[11]);
    }

    private static Object getVerticalScrollAxisRange$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
    }

    public static final void setVerticalScrollAxisRange(SemanticsPropertyReceiver $this$verticalScrollAxisRange, ScrollAxisRange r4) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue($this$verticalScrollAxisRange, $$delegatedProperties[11], r4);
    }

    public static final void popup(SemanticsPropertyReceiver $this$popup) {
        $this$popup.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void dialog(SemanticsPropertyReceiver $this$dialog) {
        $this$dialog.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    public static final int getRole(SemanticsPropertyReceiver $this$role) {
        return SemanticsProperties.INSTANCE.getRole().getValue($this$role, $$delegatedProperties[12]).m6180unboximpl();
    }

    private static Object getRole$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getRole();
    }

    /* JADX INFO: renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m6200setRolekuIjeqM(SemanticsPropertyReceiver $this$role, int r4) {
        SemanticsProperties.INSTANCE.getRole().setValue($this$role, $$delegatedProperties[12], Role.m6174boximpl(r4));
    }

    public static final String getTestTag(SemanticsPropertyReceiver $this$testTag) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue($this$testTag, $$delegatedProperties[13]);
    }

    private static Object getTestTag$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getTestTag();
    }

    public static final void setTestTag(SemanticsPropertyReceiver $this$testTag, String r4) {
        SemanticsProperties.INSTANCE.getTestTag().setValue($this$testTag, $$delegatedProperties[13], r4);
    }

    public static final AnnotatedString getText(SemanticsPropertyReceiver $this$text) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void setText(SemanticsPropertyReceiver $this$text, AnnotatedString value) {
        $this$text.set(SemanticsProperties.INSTANCE.getText(), CollectionsKt.listOf(value));
    }

    public static final AnnotatedString getTextSubstitution(SemanticsPropertyReceiver $this$textSubstitution) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue($this$textSubstitution, $$delegatedProperties[14]);
    }

    private static Object getTextSubstitution$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getTextSubstitution();
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver $this$textSubstitution, AnnotatedString r4) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue($this$textSubstitution, $$delegatedProperties[14], r4);
    }

    public static final boolean isShowingTextSubstitution(SemanticsPropertyReceiver $this$isShowingTextSubstitution) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue($this$isShowingTextSubstitution, $$delegatedProperties[15]).booleanValue();
    }

    private static Object isShowingTextSubstitution$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution();
    }

    public static final void setShowingTextSubstitution(SemanticsPropertyReceiver $this$isShowingTextSubstitution, boolean r4) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue($this$isShowingTextSubstitution, $$delegatedProperties[15], Boolean.valueOf(r4));
    }

    public static final AnnotatedString getInputText(SemanticsPropertyReceiver $this$inputText) {
        return SemanticsProperties.INSTANCE.getInputText().getValue($this$inputText, $$delegatedProperties[16]);
    }

    private static Object getInputText$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getInputText();
    }

    public static final void setInputText(SemanticsPropertyReceiver $this$inputText, AnnotatedString r4) {
        SemanticsProperties.INSTANCE.getInputText().setValue($this$inputText, $$delegatedProperties[16], r4);
    }

    public static final AnnotatedString getEditableText(SemanticsPropertyReceiver $this$editableText) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue($this$editableText, $$delegatedProperties[17]);
    }

    private static Object getEditableText$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getEditableText();
    }

    public static final void setEditableText(SemanticsPropertyReceiver $this$editableText, AnnotatedString r4) {
        SemanticsProperties.INSTANCE.getEditableText().setValue($this$editableText, $$delegatedProperties[17], r4);
    }

    public static final long getTextSelectionRange(SemanticsPropertyReceiver $this$textSelectionRange) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue($this$textSelectionRange, $$delegatedProperties[18]).m6421unboximpl();
    }

    private static Object getTextSelectionRange$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange();
    }

    /* JADX INFO: renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m6201setTextSelectionRangeFDrldGo(SemanticsPropertyReceiver $this$textSelectionRange, long r4) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue($this$textSelectionRange, $$delegatedProperties[18], TextRange.m6405boximpl(r4));
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(SemanticsPropertyReceiver $this$imeAction) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue($this$imeAction, $$delegatedProperties[19]).m6586unboximpl();
    }

    private static Object getImeAction$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getImeAction();
    }

    @Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    /* JADX INFO: renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m6198setImeAction4L7nppU(SemanticsPropertyReceiver $this$imeAction, int r4) {
        SemanticsProperties.INSTANCE.getImeAction().setValue($this$imeAction, $$delegatedProperties[19], ImeAction.m6580boximpl(r4));
    }

    public static final boolean getSelected(SemanticsPropertyReceiver $this$selected) {
        return SemanticsProperties.INSTANCE.getSelected().getValue($this$selected, $$delegatedProperties[20]).booleanValue();
    }

    private static Object getSelected$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getSelected();
    }

    public static final void setSelected(SemanticsPropertyReceiver $this$selected, boolean r4) {
        SemanticsProperties.INSTANCE.getSelected().setValue($this$selected, $$delegatedProperties[20], Boolean.valueOf(r4));
    }

    public static final CollectionInfo getCollectionInfo(SemanticsPropertyReceiver $this$collectionInfo) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue($this$collectionInfo, $$delegatedProperties[21]);
    }

    private static Object getCollectionInfo$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getCollectionInfo();
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver $this$collectionInfo, CollectionInfo r4) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue($this$collectionInfo, $$delegatedProperties[21], r4);
    }

    public static final CollectionItemInfo getCollectionItemInfo(SemanticsPropertyReceiver $this$collectionItemInfo) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue($this$collectionItemInfo, $$delegatedProperties[22]);
    }

    private static Object getCollectionItemInfo$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo();
    }

    public static final void setCollectionItemInfo(SemanticsPropertyReceiver $this$collectionItemInfo, CollectionItemInfo r4) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue($this$collectionItemInfo, $$delegatedProperties[22], r4);
    }

    public static final ToggleableState getToggleableState(SemanticsPropertyReceiver $this$toggleableState) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue($this$toggleableState, $$delegatedProperties[23]);
    }

    private static Object getToggleableState$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getToggleableState();
    }

    public static final void setToggleableState(SemanticsPropertyReceiver $this$toggleableState, ToggleableState r4) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue($this$toggleableState, $$delegatedProperties[23], r4);
    }

    public static final boolean isEditable(SemanticsPropertyReceiver $this$isEditable) {
        return SemanticsProperties.INSTANCE.getIsEditable().getValue($this$isEditable, $$delegatedProperties[24]).booleanValue();
    }

    private static Object isEditable$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getIsEditable();
    }

    public static final void setEditable(SemanticsPropertyReceiver $this$isEditable, boolean r4) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue($this$isEditable, $$delegatedProperties[24], Boolean.valueOf(r4));
    }

    public static final void password(SemanticsPropertyReceiver $this$password) {
        $this$password.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void error(SemanticsPropertyReceiver $this$error, String description) {
        $this$error.set(SemanticsProperties.INSTANCE.getError(), description);
    }

    public static final void indexForKey(SemanticsPropertyReceiver $this$indexForKey, Function1<Object, Integer> r2) {
        $this$indexForKey.set(SemanticsProperties.INSTANCE.getIndexForKey(), r2);
    }

    public static final int getMaxTextLength(SemanticsPropertyReceiver $this$maxTextLength) {
        return SemanticsProperties.INSTANCE.getMaxTextLength().getValue($this$maxTextLength, $$delegatedProperties[25]).intValue();
    }

    private static Object getMaxTextLength$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsProperties.INSTANCE.getMaxTextLength();
    }

    public static final void setMaxTextLength(SemanticsPropertyReceiver $this$maxTextLength, int r4) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue($this$maxTextLength, $$delegatedProperties[25], Integer.valueOf(r4));
    }

    public static final void selectableGroup(SemanticsPropertyReceiver $this$selectableGroup) {
        $this$selectableGroup.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static final List<CustomAccessibilityAction> getCustomActions(SemanticsPropertyReceiver $this$customActions) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue($this$customActions, $$delegatedProperties[26]);
    }

    private static Object getCustomActions$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final void setCustomActions(SemanticsPropertyReceiver $this$customActions, List<CustomAccessibilityAction> r4) {
        SemanticsActions.INSTANCE.getCustomActions().setValue($this$customActions, $$delegatedProperties[26], r4);
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        getTextLayoutResult(r0, r1, r2);
    }

    public static final void getTextLayoutResult(SemanticsPropertyReceiver $this$getTextLayoutResult, String label, Function1<? super List<TextLayoutResult>, Boolean> r5) {
        $this$getTextLayoutResult.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        onClick(r0, r1, r2);
    }

    public static final void onClick(SemanticsPropertyReceiver $this$onClick, String label, Function0<Boolean> r5) {
        $this$onClick.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        onLongClick(r0, r1, r2);
    }

    public static final void onLongClick(SemanticsPropertyReceiver $this$onLongClick, String label, Function0<Boolean> r5) {
        $this$onLongClick.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver r0, String r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        scrollBy(r0, r1, r2);
    }

    public static final void scrollBy(SemanticsPropertyReceiver $this$scrollBy, String label, Function2<? super Float, ? super Float, Boolean> r5) {
        $this$scrollBy.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(label, r5));
    }

    public static final void scrollByOffset(SemanticsPropertyReceiver $this$scrollByOffset, Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> r2) {
        $this$scrollByOffset.set(SemanticsActions.INSTANCE.getScrollByOffset(), r2);
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        scrollToIndex(r0, r1, r2);
    }

    public static final void scrollToIndex(SemanticsPropertyReceiver $this$scrollToIndex, String label, Function1<? super Integer, Boolean> r5) {
        $this$scrollToIndex.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void onAutofillText$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        onAutofillText(r0, r1, r2);
    }

    public static final void onAutofillText(SemanticsPropertyReceiver $this$onAutofillText, String label, Function1<? super AnnotatedString, Boolean> r5) {
        $this$onAutofillText.set(SemanticsActions.INSTANCE.getOnAutofillText(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        setProgress(r0, r1, r2);
    }

    public static final void setProgress(SemanticsPropertyReceiver $this$setProgress, String label, Function1<? super Float, Boolean> r5) {
        $this$setProgress.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        setText(r0, r1, r2);
    }

    public static final void setText(SemanticsPropertyReceiver $this$setText, String label, Function1<? super AnnotatedString, Boolean> r5) {
        $this$setText.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        setTextSubstitution(r0, r1, r2);
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver $this$setTextSubstitution, String label, Function1<? super AnnotatedString, Boolean> r5) {
        $this$setTextSubstitution.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        showTextSubstitution(r0, r1, r2);
    }

    public static final void showTextSubstitution(SemanticsPropertyReceiver $this$showTextSubstitution, String label, Function1<? super Boolean, Boolean> r5) {
        $this$showTextSubstitution.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        clearTextSubstitution(r0, r1, r2);
    }

    public static final void clearTextSubstitution(SemanticsPropertyReceiver $this$clearTextSubstitution, String label, Function0<Boolean> r5) {
        $this$clearTextSubstitution.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        insertTextAtCursor(r0, r1, r2);
    }

    public static final void insertTextAtCursor(SemanticsPropertyReceiver $this$insertTextAtCursor, String label, Function1<? super AnnotatedString, Boolean> r5) {
        $this$insertTextAtCursor.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(label, r5));
    }

    /* JADX INFO: renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m6197onImeAction9UiTYpY$default(SemanticsPropertyReceiver r0, int r1, String r2, Function0 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        m6196onImeAction9UiTYpY(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m6196onImeAction9UiTYpY(SemanticsPropertyReceiver $this$onImeAction_u2d9UiTYpY, int imeActionType, String label, Function0<Boolean> r6) {
        $this$onImeAction_u2d9UiTYpY.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m6580boximpl(imeActionType));
        $this$onImeAction_u2d9UiTYpY.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(label, r6));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        performImeAction(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(SemanticsPropertyReceiver $this$performImeAction, String label, Function0<Boolean> r5) {
        $this$performImeAction.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver r0, String r1, Function3 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        setSelection(r0, r1, r2);
    }

    public static final void setSelection(SemanticsPropertyReceiver $this$setSelection, String label, Function3<? super Integer, ? super Integer, ? super Boolean, Boolean> r5) {
        $this$setSelection.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        copyText(r0, r1, r2);
    }

    public static final void copyText(SemanticsPropertyReceiver $this$copyText, String label, Function0<Boolean> r5) {
        $this$copyText.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        cutText(r0, r1, r2);
    }

    public static final void cutText(SemanticsPropertyReceiver $this$cutText, String label, Function0<Boolean> r5) {
        $this$cutText.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        pasteText(r0, r1, r2);
    }

    public static final void pasteText(SemanticsPropertyReceiver $this$pasteText, String label, Function0<Boolean> r5) {
        $this$pasteText.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        expand(r0, r1, r2);
    }

    public static final void expand(SemanticsPropertyReceiver $this$expand, String label, Function0<Boolean> r5) {
        $this$expand.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        collapse(r0, r1, r2);
    }

    public static final void collapse(SemanticsPropertyReceiver $this$collapse, String label, Function0<Boolean> r5) {
        $this$collapse.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        dismiss(r0, r1, r2);
    }

    public static final void dismiss(SemanticsPropertyReceiver $this$dismiss, String label, Function0<Boolean> r5) {
        $this$dismiss.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        requestFocus(r0, r1, r2);
    }

    public static final void requestFocus(SemanticsPropertyReceiver $this$requestFocus, String label, Function0<Boolean> r5) {
        $this$requestFocus.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        pageUp(r0, r1, r2);
    }

    public static final void pageUp(SemanticsPropertyReceiver $this$pageUp, String label, Function0<Boolean> r5) {
        $this$pageUp.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        pageDown(r0, r1, r2);
    }

    public static final void pageDown(SemanticsPropertyReceiver $this$pageDown, String label, Function0<Boolean> r5) {
        $this$pageDown.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        pageLeft(r0, r1, r2);
    }

    public static final void pageLeft(SemanticsPropertyReceiver $this$pageLeft, String label, Function0<Boolean> r5) {
        $this$pageLeft.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        pageRight(r0, r1, r2);
    }

    public static final void pageRight(SemanticsPropertyReceiver $this$pageRight, String label, Function0<Boolean> r5) {
        $this$pageRight.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(label, r5));
    }

    public static /* synthetic */ void getScrollViewportLength$default(SemanticsPropertyReceiver r0, String r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        getScrollViewportLength(r0, r1, r2);
    }

    public static final void getScrollViewportLength(SemanticsPropertyReceiver $this$getScrollViewportLength, String label, final Function0<Float> r5) {
        $this$getScrollViewportLength.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), new AccessibilityAction(label, new C06561(r5)));
    }
}
