package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.ui.spatial.RectListKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Î\u00012\u00020\u0001:\u0002Î\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\rJ\u0010\u0010G\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\rJ\u000e\u0010I\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u0007J\u0018\u0010J\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0006\u0010L\u001a\u00020EJ\u0006\u0010M\u001a\u00020EJ\u0010\u0010N\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010Q\u001a\u00020\rJ\b\u0010R\u001a\u00020EH\u0002J\u000e\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020\u0011J\u0010\u0010U\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010V\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\rH\u0002J \u0010W\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010Y\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u0010\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J(\u0010[\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010]\u001a\u00020\rJ\u0006\u0010^\u001a\u00020EJ\u000e\u0010_\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010_\u001a\u00020E2\u0006\u0010H\u001a\u00020\rJ \u0010`\u001a\u00020E2\u0006\u0010.\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010a\u001a\u00020\rH\u0002JK\u0010b\u001a\u00020E2\u0006\u0010O\u001a\u00020\r28\u0010c\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(H\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\be\u0012\b\bf\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020E0dH\u0086\bJ5\u0010h\u001a\u00020E2\u0006\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020\r2\u001a\u0010c\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020E0dH\u0086\bJ\u0010\u0010k\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u0010\u0010l\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u000e\u0010m\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0010\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u000e\u0010o\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010qJ\u001c\u0010r\u001a\u0004\u0018\u00010?2\u0006\u0010.\u001a\u00020\r2\b\u0010s\u001a\u0004\u0018\u00010tH\u0002J\u000e\u0010u\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u0016\u0010v\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rJ\u000e\u0010w\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u0010\u0010x\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0010\u0010y\u001a\u00020E2\u0006\u00103\u001a\u00020\rH\u0002J\u0018\u0010z\u001a\u00020E2\u0006\u00103\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\rJ\u000e\u0010{\u001a\b\u0012\u0004\u0012\u00020\r0|H\u0002J\u0010\u0010}\u001a\u00020E2\b\b\u0002\u0010O\u001a\u00020\rJ!\u0010~\u001a\u00020E2\u0006\u0010\u007f\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0002J(\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\r2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0011J\u0010\u0010\u0083\u0001\u001a\u00020E2\u0007\u0010\u0084\u0001\u001a\u00020\rJ\u0011\u0010\u0085\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\rH\u0002J&\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0007\u0010\u0084\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\rJ\u0019\u0010\u0087\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J'\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070|2\u0006\u0010G\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u00020\r2\u0007\u0010\u0089\u0001\u001a\u00020\u0000J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\u0007J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0011\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0002J\u0019\u0010\u008c\u0001\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\rH\u0002J\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u008e\u0001\u001a\u00020EH\u0002J\u000f\u0010\u008f\u0001\u001a\u00020E2\u0006\u0010s\u001a\u00020tJ\u0007\u0010\u0090\u0001\u001a\u00020EJ\u0018\u0010\u0091\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\u0006\u0010K\u001a\u00020tJA\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2&\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u00010>j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u0001`@H\u0002J\u0007\u0010\u0094\u0001\u001a\u00020\u0011J\u001b\u0010\u0095\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020\r2\u0007\u0010\u0097\u0001\u001a\u00020\rH\u0002J#\u0010\u0098\u0001\u001a\u00020E2\u0007\u0010\u0096\u0001\u001a\u00020\r2\u0007\u0010\u0097\u0001\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J\u0007\u0010\u0099\u0001\u001a\u00020EJ\t\u0010\u009a\u0001\u001a\u00020\rH\u0002J\t\u0010\u009b\u0001\u001a\u00020EH\u0002J\u000f\u0010\u009c\u0001\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007J\u0011\u0010\u009d\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001e\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0086\bJ#\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u009f\u0001\u001a\u00020\rJ\u0007\u0010 \u0001\u001a\u00020EJ\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\rJ\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010i\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0017\u0010¢\u0001\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rJ\u0017\u0010£\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¦\u0001J\u0017\u0010§\u0001\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0000¢\u0006\u0003\b¨\u0001J\u0013\u0010©\u0001\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020\rH\u0002J\u001b\u0010ª\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010ª\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u00ad\u0001\u001a\u00020EJ\u0010\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\rJ\u001b\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010®\u0001\u001a\u0004\u0018\u00010\u0001J0\u0010\u00ad\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u00112\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001b\u0010¯\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010¯\u0001\u001a\u00020E2\u0007\u0010\u0092\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010°\u0001\u001a\u00020tJ\t\u0010±\u0001\u001a\u00020tH\u0016J\u000f\u0010²\u0001\u001a\u00020E2\u0006\u0010j\u001a\u00020\rJ\u0019\u0010³\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010O\u001a\u00020\rH\u0000¢\u0006\u0003\b´\u0001J\u0013\u0010µ\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001b\u0010¶\u0001\u001a\u00020E2\u0007\u0010·\u0001\u001a\u00020\r2\u0007\u0010¸\u0001\u001a\u00020\rH\u0002J\u0011\u0010¹\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0011\u0010º\u0001\u001a\u00020E2\u0006\u0010O\u001a\u00020\rH\u0002J&\u0010»\u0001\u001a\u00020E2\u0006\u0010O\u001a\u00020\r2\u0007\u0010\u009d\u0001\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0019\u0010¾\u0001\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0011\u0010¾\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u001b\u0010¿\u0001\u001a\u00020E2\u0006\u0010H\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010À\u0001\u001a\u00020E2\b\u0010K\u001a\u0004\u0018\u00010\u0001J\u0007\u0010Á\u0001\u001a\u00020EJ\u000f\u0010Â\u0001\u001a\u00020EH\u0000¢\u0006\u0003\bÃ\u0001J\u000f\u0010Ä\u0001\u001a\u00020EH\u0000¢\u0006\u0003\bÅ\u0001J\u0016\u0010Æ\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0015\u0010Y\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0013\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020\r0|*\u00020(H\u0002J\u001b\u0010É\u0001\u001a\u00020E*\b0Ê\u0001j\u0003`Ë\u00012\u0006\u0010H\u001a\u00020\rH\u0002J\u0016\u0010Ì\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u0014\u0010.\u001a\u00020\r*\u00020(2\u0006\u0010H\u001a\u00020\rH\u0002J\u0015\u0010Q\u001a\u00020\r*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\rH\u0002J\u001e\u0010Í\u0001\u001a\u00020E*\u00020(2\u0007\u0010Ç\u0001\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0011\u0010+\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R\u000e\u0010,\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u0018\u00100\u001a\u0004\u0018\u000101X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00102R\u0014\u00103\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000fR\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u000e¢\u0006\u0004\n\u0002\u00107R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010;\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b<\u0010\u000fR.\u0010=\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u00010>j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?\u0018\u0001`@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "collectingCalledInformation", "getCollectingCalledInformation", "collectingSourceInformation", "getCollectingSourceInformation", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentGroupSlotIndex", "getCurrentGroupSlotIndex", "currentSlot", "currentSlotEnd", "deferredSlotWrites", "Landroidx/collection/MutableObjectList;", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "Landroidx/collection/MutableIntList;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", "index", "anchorIndex", "appendSlot", "value", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clear", "slotIndex", "clearSlotGap", "close", "normalClose", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forAllData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", "forEachTailSlot", "groupIndex", "count", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "insertGroups", "insertSlots", "keys", "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", "offset", "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "rawUpdate", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", "key", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "slotIndexOfGroupSlotIndex", "slotsEndAllIndex", "slotsEndAllIndex$runtime_release", "slotsEndIndex", "slotsEndIndex$runtime_release", "slotsStartIndex", "slotsStartIndex$runtime_release", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toDebugString", "toString", "trimTailSlots", "tryAnchor", "tryAnchor$runtime_release", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateNode", "updateNodeOfGroup", "updateParentNode", "updateToTableMaps", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "updateDataIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotWriter {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private final IntStack nodeCountStack;
    private int parent;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final IntStack startStack;
    private final SlotTable table;

    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ List access$moveGroup(Companion $this, SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            return $this.moveGroup(fromWriter, fromIndex, toWriter, updateFromCursor, updateToCursor, removeSourceGroup);
        }

        static /* synthetic */ List moveGroup$default(Companion r7, SlotWriter r8, int r9, SlotWriter r10, boolean r11, boolean r12, boolean r13, int r14, Object r15) {
            if ((r14 & 32) == 0) goto L5;
            boolean r6 = true;
        L7:
            return r7.moveGroup(r8, r9, r10, r11, r12, r6);
        L5:
            r6 = r13;
            goto L7
        }

        private final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            int groupsToMove = fromWriter.groupSize(fromIndex);
            int sourceGroupsEnd = fromIndex + groupsToMove;
            int sourceSlotsStart = SlotWriter.access$dataIndex(fromWriter, fromIndex);
            int sourceSlotsEnd = SlotWriter.access$dataIndex(fromWriter, sourceGroupsEnd);
            int slotsToMove = sourceSlotsEnd - sourceSlotsStart;
            boolean hasMarks = SlotWriter.access$containsAnyGroupMarks(fromWriter, fromIndex);
            SlotWriter.access$insertGroups(toWriter, groupsToMove);
            SlotWriter.access$insertSlots(toWriter, slotsToMove, toWriter.getCurrentGroup());
            if (SlotWriter.access$getGroupGapStart$p(fromWriter) >= sourceGroupsEnd) goto L6;
            SlotWriter.access$moveGroupGapTo(fromWriter, sourceGroupsEnd);
        L6:
            if (SlotWriter.access$getSlotsGapStart$p(fromWriter) >= sourceSlotsEnd) goto L8;
            SlotWriter.access$moveSlotGapTo(fromWriter, sourceSlotsEnd, sourceGroupsEnd);
        L8:
            int[] groups = SlotWriter.access$getGroups$p(toWriter);
            int currentGroup = toWriter.getCurrentGroup();
            ArraysKt.copyInto(SlotWriter.access$getGroups$p(fromWriter), groups, currentGroup * 5, fromIndex * 5, sourceGroupsEnd * 5);
            Object[] slots = SlotWriter.access$getSlots$p(toWriter);
            int currentSlot = SlotWriter.access$getCurrentSlot$p(toWriter);
            Object[] $this$fastCopyInto$iv = SlotWriter.access$getSlots$p(fromWriter);
            System.arraycopy($this$fastCopyInto$iv, sourceSlotsStart, slots, currentSlot, sourceSlotsEnd - sourceSlotsStart);
            int parent = toWriter.getParent();
            groups[(currentGroup * 5) + 2] = parent;
            int parentDelta = currentGroup - fromIndex;
            int moveEnd = currentGroup + groupsToMove;
            int dataIndexDelta = currentSlot - SlotWriter.access$dataIndex(toWriter, groups, currentGroup);
            int slotsGapOwner = SlotWriter.access$getSlotsGapOwner$p(toWriter);
            int slotsGapLen = SlotWriter.access$getSlotsGapLen$p(toWriter);
            int slotsCapacity = slots.length;
            int slotsGapOwner2 = slotsGapOwner;
            int currentSlot2 = currentGroup;
        L9:
            int r20 = 0;
            if (currentSlot2 >= moveEnd) goto L21;
            if (currentSlot2 == currentGroup) goto L13;
            int[] $this$parentAnchor$iv = groups;
            int previousParent = $this$parentAnchor$iv[(currentSlot2 * 5) + 2];
            int value$iv = previousParent + parentDelta;
            int[] $this$updateParentAnchor$iv = groups;
            $this$updateParentAnchor$iv[(currentSlot2 * 5) + 2] = value$iv;
        L13:
            int currentGroup2 = currentGroup;
            int newDataIndex = SlotWriter.access$dataIndex(toWriter, groups, currentSlot2) + dataIndexDelta;
            if (slotsGapOwner2 < currentSlot2) goto L17;
            r20 = SlotWriter.access$getSlotsGapStart$p(toWriter);
        L17:
            int[] groups2 = groups;
            int parentDelta2 = parentDelta;
            int newDataAnchor = SlotWriter.access$dataIndexToDataAnchor(toWriter, newDataIndex, r20, slotsGapLen, slotsCapacity);
            groups2[(currentSlot2 * 5) + 4] = newDataAnchor;
            if (currentSlot2 != slotsGapOwner2) goto L20;
            slotsGapOwner2 = slotsGapOwner2 + 1;
        L20:
            currentSlot2 = currentSlot2 + 1;
            currentGroup = currentGroup2;
            groups = groups2;
            parentDelta = parentDelta2;
            goto L9
        L21:
            int[] groups3 = groups;
            int currentGroup3 = currentGroup;
            SlotWriter.access$setSlotsGapOwner$p(toWriter, slotsGapOwner2);
            int startAnchors = SlotTableKt.access$locationOf(SlotWriter.access$getAnchors$p(fromWriter), fromIndex, fromWriter.getSize$runtime_release());
            int endAnchors = SlotTableKt.access$locationOf(SlotWriter.access$getAnchors$p(fromWriter), sourceGroupsEnd, fromWriter.getSize$runtime_release());
            if (startAnchors >= endAnchors) goto L27;
            ArrayList sourceAnchors = SlotWriter.access$getAnchors$p(fromWriter);
            ArrayList anchors = new ArrayList(endAnchors - startAnchors);
            int anchorDelta = currentGroup3 - fromIndex;
            int anchorDelta2 = startAnchors;
        L24:
            if (anchorDelta2 >= endAnchors) goto L26;
            int anchorIndex = anchorDelta2;
            Anchor sourceAnchor = (Anchor) sourceAnchors.get(anchorDelta2);
            sourceAnchor.setLocation$runtime_release(sourceAnchor.getLocation$runtime_release() + anchorDelta);
            anchors.add(sourceAnchor);
            anchorDelta2 = anchorIndex + 1;
            slotsGapLen = slotsGapLen;
            goto L24
        L26:
            ArrayList r4 = SlotWriter.access$getAnchors$p(toWriter);
            int r6 = toWriter.getCurrentGroup();
            int slotsCapacity2 = toWriter.getSize$runtime_release();
            int insertLocation = SlotTableKt.access$locationOf(r4, r6, slotsCapacity2);
            SlotWriter.access$getAnchors$p(toWriter).addAll(insertLocation, anchors);
            sourceAnchors.subList(startAnchors, endAnchors).clear();
            ArrayList anchors2 = anchors;
        L29:
            if (anchors2.isEmpty() == true) goto L43;
            HashMap sourceSourceInformationMap = SlotWriter.access$getSourceInformationMap$p(fromWriter);
            HashMap destinationSourceInformation = SlotWriter.access$getSourceInformationMap$p(toWriter);
            if (sourceSourceInformationMap == null) goto L43;
            if (destinationSourceInformation == null) goto L43;
            List $this$fastForEach$iv = anchors2;
            int r5 = $this$fastForEach$iv.size();
            int index$iv = 0;
        L34:
            if (index$iv >= r5) goto L43;
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            int r31 = r5;
            Anchor anchor = (Anchor) item$iv;
            int index$iv2 = index$iv;
            GroupSourceInformation information = (GroupSourceInformation) sourceSourceInformationMap.get(anchor);
            if (information == null) goto L39;
            sourceSourceInformationMap.remove(anchor);
            destinationSourceInformation.put(anchor, information);
        L39:
            index$iv = index$iv2 + 1;
            r5 = r31;
            sourceSourceInformationMap = sourceSourceInformationMap;
        L43:
            int toWriterParent = toWriter.getParent();
            GroupSourceInformation it = SlotWriter.access$sourceInformationOf(toWriter, parent);
            if (it == null) goto L50;
            int r8 = 0;
            int predecessor = -1;
            int child = toWriterParent + 1;
            int endGroup = toWriter.getCurrentGroup();
        L46:
            if (child >= endGroup) goto L48;
            predecessor = child;
            child = child + SlotTableKt.access$groupSize(SlotWriter.access$getGroups$p(toWriter), child);
            r8 = r8;
            goto L46
        L48:
            it.addGroupAfter(toWriter, predecessor, endGroup);
        L50:
            int parentGroup = fromWriter.parent(fromIndex);
            int r7 = 1;
            if (removeSourceGroup == true) goto L53;
            boolean anchorsRemoved = false;
        L65:
            if (anchorsRemoved == true) goto L67;
            boolean value$iv2 = true;
        L69:
            if (value$iv2 == true) goto L71;
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        L71:
            int r9 = SlotWriter.access$getNodeCount$p(toWriter);
            if ((groups3[(currentGroup3 * 5) + 1] & 1073741824) == 0) goto L74;
            r20 = 1;
        L74:
            if (r20 != 0) goto L77;
            r7 = groups3[(currentGroup3 * 5) + 1] & RectListKt.Lower26Bits;
        L77:
            SlotWriter.access$setNodeCount$p(toWriter, r9 + r7);
            if (updateToCursor == false) goto L80;
            SlotWriter.access$setCurrentGroup$p(toWriter, currentGroup3 + groupsToMove);
            SlotWriter.access$setCurrentSlot$p(toWriter, currentSlot + slotsToMove);
        L80:
            if (hasMarks == false) goto L82;
            SlotWriter.access$updateContainsMark(toWriter, parent);
        L82:
            return anchors2;
        L67:
            value$iv2 = false;
            goto L69
        L53:
            if (updateFromCursor == false) goto L63;
            if (parentGroup < 0) goto L56;
            boolean needsStartGroups = true;
        L57:
            if (needsStartGroups == false) goto L59;
            fromWriter.startGroup();
            fromWriter.advanceBy(parentGroup - fromWriter.getCurrentGroup());
            fromWriter.startGroup();
        L59:
            fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
            anchorsRemoved = fromWriter.removeGroup();
            if (needsStartGroups == false) goto L65;
            fromWriter.skipToGroupEnd();
            fromWriter.endGroup();
            fromWriter.skipToGroupEnd();
            fromWriter.endGroup();
            goto L65
        L56:
            needsStartGroups = false;
            goto L57
        L63:
            anchorsRemoved = SlotWriter.access$removeGroups(fromWriter, fromIndex, groupsToMove);
            SlotWriter.access$removeSlots(fromWriter, sourceSlotsStart, slotsToMove, fromIndex - 1);
            goto L65
        L27:
            anchors2 = CollectionsKt.emptyList();
            goto L29
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(int $start, int $end, SlotWriter $receiver) {
            this.$end = $end;
            this.this$0 = $receiver;
            this.current = $start;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int r1) {
            this.current = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.current >= this.$end) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() == false) goto L5;
            Object[] r0 = SlotWriter.access$getSlots$p(this.this$0);
            SlotWriter r1 = this.this$0;
            int r2 = this.current;
            this.current = r2 + 1;
            return r0[SlotWriter.access$dataIndexToDataAddress(r1, r2)];
        L5:
            return null;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public SlotWriter(SlotTable table) {
        this.table = table;
        this.groups = this.table.getGroups();
        this.slots = this.table.getSlots();
        this.anchors = this.table.getAnchors$runtime_release();
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
        this.groupGapStart = this.table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - this.table.getGroupsSize();
        this.slotsGapStart = this.table.getSlotsSize();
        this.slotsGapLen = this.slots.length - this.table.getSlotsSize();
        this.slotsGapOwner = this.table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.currentGroupEnd = this.table.getGroupsSize();
        this.parent = -1;
    }

    public static final /* synthetic */ boolean access$containsAnyGroupMarks(SlotWriter $this, int group) {
        return $this.containsAnyGroupMarks(group);
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter $this, int index) {
        return $this.dataIndex(index);
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter $this, int[] $receiver, int address) {
        return $this.dataIndex($receiver, address);
    }

    public static final /* synthetic */ int access$dataIndexToDataAddress(SlotWriter $this, int dataIndex) {
        return $this.dataIndexToDataAddress(dataIndex);
    }

    public static final /* synthetic */ int access$dataIndexToDataAnchor(SlotWriter $this, int index, int gapStart, int gapLen, int capacity) {
        return $this.dataIndexToDataAnchor(index, gapStart, gapLen, capacity);
    }

    public static final /* synthetic */ ArrayList access$getAnchors$p(SlotWriter $this) {
        return $this.anchors;
    }

    public static final /* synthetic */ int access$getCurrentSlot$p(SlotWriter $this) {
        return $this.currentSlot;
    }

    public static final /* synthetic */ int access$getGroupGapStart$p(SlotWriter $this) {
        return $this.groupGapStart;
    }

    public static final /* synthetic */ int[] access$getGroups$p(SlotWriter $this) {
        return $this.groups;
    }

    public static final /* synthetic */ int access$getNodeCount$p(SlotWriter $this) {
        return $this.nodeCount;
    }

    public static final /* synthetic */ Object[] access$getSlots$p(SlotWriter $this) {
        return $this.slots;
    }

    public static final /* synthetic */ int access$getSlotsGapLen$p(SlotWriter $this) {
        return $this.slotsGapLen;
    }

    public static final /* synthetic */ int access$getSlotsGapOwner$p(SlotWriter $this) {
        return $this.slotsGapOwner;
    }

    public static final /* synthetic */ int access$getSlotsGapStart$p(SlotWriter $this) {
        return $this.slotsGapStart;
    }

    public static final /* synthetic */ HashMap access$getSourceInformationMap$p(SlotWriter $this) {
        return $this.sourceInformationMap;
    }

    public static final /* synthetic */ int access$groupIndexToAddress(SlotWriter $this, int index) {
        return $this.groupIndexToAddress(index);
    }

    public static final /* synthetic */ void access$insertGroups(SlotWriter $this, int size) {
        $this.insertGroups(size);
    }

    public static final /* synthetic */ void access$insertSlots(SlotWriter $this, int size, int group) {
        $this.insertSlots(size, group);
    }

    public static final /* synthetic */ void access$moveGroupGapTo(SlotWriter $this, int index) {
        $this.moveGroupGapTo(index);
    }

    public static final /* synthetic */ void access$moveSlotGapTo(SlotWriter $this, int index, int group) {
        $this.moveSlotGapTo(index, group);
    }

    public static final /* synthetic */ boolean access$removeGroups(SlotWriter $this, int start, int len) {
        return $this.removeGroups(start, len);
    }

    public static final /* synthetic */ void access$removeSlots(SlotWriter $this, int start, int len, int group) {
        $this.removeSlots(start, len, group);
    }

    public static final /* synthetic */ void access$setCurrentGroup$p(SlotWriter $this, int r1) {
        $this.currentGroup = r1;
    }

    public static final /* synthetic */ void access$setCurrentSlot$p(SlotWriter $this, int r1) {
        $this.currentSlot = r1;
    }

    public static final /* synthetic */ void access$setNodeCount$p(SlotWriter $this, int r1) {
        $this.nodeCount = r1;
    }

    public static final /* synthetic */ void access$setSlotsGapOwner$p(SlotWriter $this, int r1) {
        $this.slotsGapOwner = r1;
    }

    public static final /* synthetic */ GroupSourceInformation access$sourceInformationOf(SlotWriter $this, int group) {
        return $this.sourceInformationOf(group);
    }

    public static final /* synthetic */ void access$updateContainsMark(SlotWriter $this, int group) {
        $this.updateContainsMark(group);
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        if (this.currentGroup != this.currentGroupEnd) goto L5;
        return true;
    L5:
        return false;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final boolean isNode() {
        if (this.currentGroup >= this.currentGroupEnd) goto L11;
        int[] $this$isNode$iv = this.groups;
        int address$iv = groupIndexToAddress(this.currentGroup);
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) == 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r0 = false;
        goto L8
    L11:
        return false;
    }

    public final boolean getCollectingSourceInformation() {
        if (this.sourceInformationMap == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean getCollectingCalledInformation() {
        if (this.calledByMap == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNode(int index) {
        int[] $this$isNode$iv = this.groups;
        int address$iv = groupIndexToAddress(index);
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final int nodeCount(int index) {
        int[] $this$nodeCount$iv = this.groups;
        int address$iv = groupIndexToAddress(index);
        return $this$nodeCount$iv[(address$iv * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int groupKey(int index) {
        int[] $this$key$iv = this.groups;
        int address$iv = groupIndexToAddress(index);
        return $this$key$iv[address$iv * 5];
    }

    public final Object groupObjectKey(int index) {
        int address = groupIndexToAddress(index);
        int[] $this$hasObjectKey$iv = this.groups;
        boolean r4 = true;
        if (($this$hasObjectKey$iv[(address * 5) + 1] & 536870912) != 0) goto L6;
        r4 = false;
    L6:
        if (r4 == true) goto L10;
        return null;
    L10:
        return this.slots[SlotTableKt.access$objectKeyIndex(this.groups, address)];
    }

    public final int groupSize(int index) {
        return SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(index));
    }

    public final Object groupAux(int index) {
        int address = groupIndexToAddress(index);
        int[] $this$hasAux$iv = this.groups;
        boolean r4 = true;
        if (($this$hasAux$iv[(address * 5) + 1] & 268435456) != 0) goto L6;
        r4 = false;
    L6:
        if (r4 == false) goto L9;
        return this.slots[auxIndex(this.groups, address)];
    L9:
        return Composer.Companion.getEmpty();
    }

    public final boolean indexInParent(int index) {
        if (index <= this.parent) goto L7;
        if (index >= this.currentGroupEnd) goto L7;
    L9:
        return true;
    L7:
        if (this.parent != 0) goto L10;
        if (index == 0) goto L9;
    L10:
        return false;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        if (group != this.parent) goto L6;
        int end = this.currentGroupEnd;
    L13:
        if (index <= group) goto L17;
        if (index >= end) goto L18;
        return true;
    L18:
        return false;
    L17:
        return false;
    L6:
        if (group <= this.startStack.peekOr(0)) goto L8;
        end = groupSize(group) + group;
        goto L13
    L8:
        int openIndex = this.startStack.indexOf(group);
        if (openIndex >= 0) goto L11;
        end = groupSize(group) + group;
        goto L13
    L11:
        end = (getCapacity() - this.groupGapLen) - this.endStack.peek(openIndex);
        goto L13
    }

    public final Object node(int index) {
        int address = groupIndexToAddress(index);
        int[] $this$isNode$iv = this.groups;
        boolean r4 = true;
        if (($this$isNode$iv[(address * 5) + 1] & 1073741824) != 0) goto L6;
        r4 = false;
    L6:
        if (r4 == true) goto L10;
        return null;
    L10:
        return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, address))];
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid() == true) goto L7;
        return -1;
    L7:
        return parent(this.groups, anchorIndex(anchor));
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean normalClose) {
        boolean r0 = true;
        this.closed = true;
        if (normalClose == false) goto L10;
        IntStack this_$iv = this.startStack;
        if (this_$iv.tos == 0) goto L8;
        r0 = false;
    L8:
        if (r0 == false) goto L10;
        moveGroupGapTo(getSize$runtime_release());
        moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
        clearSlotGap();
        recalculateMarks();
    L10:
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void reset() {
        if (this.insertCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
    L9:
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final Object update(Object value) {
        if (this.insertCount <= 0) goto L15;
        if (this.currentSlot == this.slotsGapStart) goto L15;
        MutableIntObjectMap<MutableObjectList<Object>> r0 = this.deferredSlotWrites;
        DefaultConstructorMarker r1 = null;
        int r2 = 1;
        int r3 = 0;
        if (r0 != null) goto L9;
        r0 = new MutableIntObjectMap(r3, r2, r1);
    L9:
        this.deferredSlotWrites = r0;
        int key$iv = this.parent;
        MutableObjectList<Object> r6 = r0.get(key$iv);
        if (r6 != null) goto L12;
        MutableObjectList<Object> r7 = new MutableObjectList(r3, r2, r1);
        r0.set(key$iv, r7);
        r6 = r7;
    L12:
        r6.add(value);
        return Composer.Companion.getEmpty();
    L15:
        return rawUpdate(value);
    }

    private final Object rawUpdate(Object value) {
        Object result = skip();
        set(value);
        return result;
    }

    public final void appendSlot(Anchor anchor, Object value) {
        if (this.insertCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
    L9:
        int previousCurrentSlot = this.currentSlot;
        int previousCurrentSlotEnd = this.currentSlotEnd;
        int anchorIndex = anchorIndex(anchor);
        int slotIndex = dataIndex(this.groups, groupIndexToAddress(anchorIndex + 1));
        this.currentSlot = slotIndex;
        this.currentSlotEnd = slotIndex;
        insertSlots(1, anchorIndex);
        if (previousCurrentSlot < slotIndex) goto L12;
        previousCurrentSlot = previousCurrentSlot + 1;
        previousCurrentSlotEnd = previousCurrentSlotEnd + 1;
    L12:
        this.slots[slotIndex] = value;
        this.currentSlot = previousCurrentSlot;
        this.currentSlotEnd = previousCurrentSlotEnd;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void trimTailSlots(int count) {
        boolean value$iv = false;
        if (count <= 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L9:
        int parent = this.parent;
        int groupSlotStart = slotIndex(this.groups, groupIndexToAddress(parent));
        int groupSlotEnd = dataIndex(this.groups, groupIndexToAddress(parent + 1));
        int removeStart = groupSlotEnd - count;
        if (removeStart < groupSlotStart) goto L13;
        value$iv = true;
    L13:
        if (value$iv == true) goto L15;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L15:
        removeSlots(removeStart, count, parent);
        int currentSlot = this.currentSlot;
        if (currentSlot < groupSlotStart) goto L19;
        this.currentSlot = currentSlot - count;
        return;
    L19:
        return;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void updateAux(Object value) {
        int address = groupIndexToAddress(this.currentGroup);
        int[] $this$hasAux$iv = this.groups;
        boolean value$iv = true;
        if (($this$hasAux$iv[(address * 5) + 1] & 268435456) != 0) goto L7;
        value$iv = false;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
    L9:
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, address))] = value;
    }

    public final void insertAux(Object value) {
        boolean value$iv = false;
        if (this.insertCount < 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
    L9:
        int parent = this.parent;
        int parentGroupAddress = groupIndexToAddress(parent);
        int[] $this$hasAux$iv = this.groups;
        if (($this$hasAux$iv[(parentGroupAddress * 5) + 1] & 268435456) == 0) goto L12;
        boolean r4 = true;
    L13:
        boolean value$iv3 = !r4;
        if (value$iv3 == true) goto L16;
        ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
    L16:
        insertSlots(1, parent);
        int auxIndex = auxIndex(this.groups, parentGroupAddress);
        int auxAddress = dataIndexToDataAddress(auxIndex);
        if (this.currentSlot <= auxIndex) goto L28;
        int slotsToMove = this.currentSlot - auxIndex;
        if (slotsToMove >= 3) goto L22;
        value$iv = true;
    L22:
        if (value$iv == true) goto L25;
        PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
    L25:
        if (slotsToMove <= 1) goto L27;
        this.slots[auxAddress + 2] = this.slots[auxAddress + 1];
    L27:
        this.slots[auxAddress + 1] = this.slots[auxAddress];
    L28:
        SlotTableKt.access$addAux(this.groups, parentGroupAddress);
        this.slots[auxAddress] = value;
        this.currentSlot++;
        return;
    L12:
        r4 = false;
        goto L13
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void recordGroupSourceInformation(String sourceInformation) {
        if (this.insertCount <= 0) goto L6;
        groupSourceInformationFor(this.parent, sourceInformation);
        return;
    }

    public final void recordGrouplessCallSourceInformationStart(int key, String value) {
        if (this.insertCount <= 0) goto L11;
        MutableIntObjectMap<MutableIntSet> r0 = this.calledByMap;
        if (r0 == null) goto L7;
        SlotTableKt.access$add(r0, key, groupKey(this.parent));
    L7:
        GroupSourceInformation r1 = groupSourceInformationFor(this.parent, null);
        if (r1 == null) goto L12;
        r1.startGrouplessCall(key, value, getCurrentGroupSlotIndex());
        return;
    L12:
        return;
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.insertCount <= 0) goto L8;
        GroupSourceInformation r0 = groupSourceInformationFor(this.parent, null);
        if (r0 == null) goto L9;
        r0.endGrouplessCall(getCurrentGroupSlotIndex());
        return;
    L9:
        return;
    }

    private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
        Map r0 = this.sourceInformationMap;
        if (r0 == null) goto L14;
        Map $this$getOrPut$iv = r0;
        Anchor r1 = anchor(parent);
        GroupSourceInformation r3 = $this$getOrPut$iv.get(r1);
        if (r3 != null) goto L12;
        GroupSourceInformation result = new GroupSourceInformation(0, sourceInformation, 0);
        if (sourceInformation != null) goto L11;
        int child = parent + 1;
        int end = this.currentGroup;
    L9:
        if (child >= end) goto L11;
        result.reportGroup(this, child);
        child = child + SlotTableKt.access$groupSize(this.groups, child);
    L11:
        $this$getOrPut$iv.put(r1, result);
    L17:
        return result;
    L12:
        result = r3;
        goto L17
    L14:
        return null;
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateNode(Anchor anchor, Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final void updateParentNode(Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void set(Object value) {
        if (this.currentSlot > this.currentSlotEnd) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
    L9:
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final Object set(int index, Object value) {
        return set(getCurrentGroup(), index, value);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int address = groupIndexToAddress(group);
        int slotsStart = slotIndex(this.groups, address);
        int slotsEnd = dataIndex(this.groups, groupIndexToAddress(group + 1));
        int slotsIndex = slotsStart + index;
        if (slotsIndex < slotsStart) goto L6;
        if (slotsIndex >= slotsEnd) goto L6;
        boolean value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
    L11:
        return slotsIndex;
    L6:
        value$iv = false;
        goto L8
    }

    public final Object set(int group, int index, Object value) {
        int slotsIndex = slotIndexOfGroupSlotIndex(group, index);
        int slotAddress = dataIndexToDataAddress(slotsIndex);
        Object result = this.slots[slotAddress];
        this.slots[slotAddress] = value;
        return result;
    }

    public final Object clear(int slotIndex) {
        int address = dataIndexToDataAddress(slotIndex);
        Object result = this.slots[address];
        this.slots[address] = Composer.Companion.getEmpty();
        return result;
    }

    public final Object skip() {
        if (this.insertCount <= 0) goto L5;
        insertSlots(1, this.parent);
    L5:
        Object[] r0 = this.slots;
        int r1 = this.currentSlot;
        this.currentSlot = r1 + 1;
        return r0[dataIndexToDataAddress(r1)];
    }

    public final Object slot(Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final Object slot(int groupIndex, int index) {
        int address = groupIndexToAddress(groupIndex);
        int slotsStart = slotIndex(this.groups, address);
        int slotsEnd = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int slotsIndex = slotsStart + index;
        boolean r4 = false;
        if (slotsStart > slotsIndex) goto L6;
        if (slotsIndex >= slotsEnd) goto L6;
        r4 = true;
    L6:
        if (r4 == false) goto L8;
        int slotAddress = dataIndexToDataAddress(slotsIndex);
        return this.slots[slotAddress];
    L8:
        return Composer.Companion.getEmpty();
    }

    public final void forEachTailSlot(int groupIndex, int count, Function2<? super Integer, Object, Unit> r10) {
        int slotsStart = slotsStartIndex$runtime_release(groupIndex);
        int slotsEnd = slotsEndIndex$runtime_release(groupIndex);
        int slotIndex = Math.max(slotsStart, slotsEnd - count);
    L3:
        if (slotIndex >= slotsEnd) goto L5;
        r10.invoke(Integer.valueOf(slotIndex), access$getSlots$p(this)[access$dataIndexToDataAddress(this, slotIndex)]);
        slotIndex = slotIndex + 1;
        goto L3
    }

    public final int slotsStartIndex$runtime_release(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final int slotsEndIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int slotsEndAllIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupSize(groupIndex) + groupIndex));
    }

    private final int getCurrentGroupSlotIndex() {
        int r0 = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> r1 = this.deferredSlotWrites;
        if (r1 == null) goto L7;
        MutableObjectList<Object> r2 = r1.get(this.parent);
        if (r2 == null) goto L7;
        int r3 = r2.getSize();
    L9:
        return r0 + r3;
    L7:
        r3 = 0;
        goto L9
    }

    public final void advanceBy(int amount) {
        boolean value$iv = true;
        if (amount < 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
    L10:
        if (this.insertCount > 0) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L17;
        PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
    L17:
        if (amount != 0) goto L19;
        return;
    L19:
        int index = this.currentGroup + amount;
        if (index >= this.parent) goto L22;
    L24:
        value$iv = false;
    L26:
        if (value$iv == true) goto L28;
        ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
    L28:
        this.currentGroup = index;
        int newSlot = dataIndex(this.groups, groupIndexToAddress(index));
        this.currentSlot = newSlot;
        this.currentSlotEnd = newSlot;
        return;
    L22:
        if (index > this.currentGroupEnd) goto L24;
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int newGroup = this.currentGroupEnd;
        this.currentGroup = newGroup;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(newGroup));
    }

    public final void beginInsert() {
        int r0 = this.insertCount;
        this.insertCount = r0 + 1;
        if (r0 != 0) goto L6;
        saveCurrentGroupEnd();
        return;
    }

    public final void endInsert() {
        boolean value$iv = true;
        if (this.insertCount <= 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
    L9:
        this.insertCount--;
        if (this.insertCount != 0) goto L20;
        IntStack this_$iv = this.nodeCountStack;
        int r0 = this_$iv.tos;
        IntStack this_$iv2 = this.startStack;
        if (r0 == this_$iv2.tos) goto L16;
        value$iv = false;
    L16:
        if (value$iv == true) goto L18;
        ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
    L18:
        restoreCurrentGroupEnd();
        return;
    L20:
        return;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void startGroup() {
        if (this.insertCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
    L9:
        startGroup(0, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void startGroup(int key) {
        startGroup(key, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.Companion.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.Companion.getEmpty());
    }

    public final void startNode(int key, Object objectKey, Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startData(int key, Object aux) {
        startGroup(key, Composer.Companion.getEmpty(), false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int r18, Object r19, boolean r20, Object r21) {
        int r3 = this.parent;
        int r6 = 1;
        if (this.insertCount <= 0) goto L5;
        Object[] r4 = true;
    L6:
        this.nodeCountStack.push(this.nodeCount);
        if (r4 == false) goto L47;
        int r7 = this.currentGroup;
        int r8 = dataIndex(this.groups, groupIndexToAddress(r7));
        insertGroups(1);
        this.currentSlot = r8;
        this.currentSlotEnd = r8;
        int r10 = groupIndexToAddress(r7);
        if (r19 == Composer.Companion.getEmpty()) goto L11;
        boolean r13 = true;
    L12:
        if (r20 == false) goto L14;
    L16:
        boolean r14 = false;
    L17:
        int r9 = dataIndexToDataAnchor(r8, this.slotsGapStart, this.slotsGapLen, this.slots.length);
        if (r9 >= 0) goto L20;
    L22:
        int r16 = r9;
    L23:
        SlotTableKt.access$initGroup(this.groups, r10, r18, r20, r13, r14, this.parent, r16);
        if (r13 == false) goto L26;
        int r11 = 1;
    L27:
        int r12 = (r20 ? 1 : 0) + r11;
        if (r14 == true) goto L31;
        r6 = 0;
    L31:
        int r15 = r12 + r6;
        if (r15 <= 0) goto L41;
        insertSlots(r15, r7);
        Object[] r17 = this.slots;
        int r110 = this.currentSlot;
        if (r20 == false) goto L36;
        r17[r110] = r21;
        r110 = r110 + 1;
    L36:
        if (r13 == false) goto L38;
        r17[r110] = r19;
        r110 = r110 + 1;
    L38:
        if (r14 == false) goto L40;
        r17[r110] = r21;
        r110 = r110 + 1;
    L40:
        this.currentSlot = r110;
    L41:
        this.nodeCount = 0;
        int r5 = r7 + 1;
        this.parent = r7;
        this.currentGroup = r5;
        if (r3 < 0) goto L53;
        GroupSourceInformation r22 = sourceInformationOf(r3);
        if (r22 == null) goto L53;
        r22.reportGroup(this, r7);
    L53:
        this.currentGroupEnd = r5;
        return;
    L26:
        r11 = 0;
        goto L27
    L20:
        if (this.slotsGapOwner >= r7) goto L22;
        r16 = -(((this.slots.length - this.slotsGapLen) - r9) + 1);
        goto L23
    L14:
        if (r21 == Composer.Companion.getEmpty()) goto L16;
        r14 = true;
        goto L17
    L11:
        r13 = false;
        goto L12
    L47:
        this.startStack.push(r3);
        saveCurrentGroupEnd();
        int r23 = this.currentGroup;
        int r24 = groupIndexToAddress(r23);
        if (Intrinsics.areEqual(r21, Composer.Companion.getEmpty()) == true) goto L52;
        if (r20 == false) goto L51;
        updateNode(r21);
        goto L52
    L51:
        updateAux(r21);
    L52:
        this.currentSlot = slotIndex(this.groups, r24);
        this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
        this.nodeCount = this.groups[(r24 * 5) + 1] & RectListKt.Lower26Bits;
        this.parent = r23;
        this.currentGroup = r23 + 1;
        r5 = SlotTableKt.access$groupSize(this.groups, r24) + r23;
        goto L53
    L5:
        r4 = false;
        goto L6
    }

    public final int endGroup() {
        if (this.insertCount <= 0) goto L5;
        boolean inserting = true;
    L6:
        int currentGroup = this.currentGroup;
        int currentGroupEnd = this.currentGroupEnd;
        int groupIndex = this.parent;
        int groupAddress = groupIndexToAddress(groupIndex);
        int newNodes = this.nodeCount;
        int newGroupSize = currentGroup - groupIndex;
        int[] $this$isNode$iv = this.groups;
        int currentAddress = 1073741824;
        if (($this$isNode$iv[(groupAddress * 5) + 1] & 1073741824) == 0) goto L9;
        boolean isNode = true;
    L11:
        if (inserting == false) goto L34;
        MutableIntObjectMap<MutableObjectList<Object>> r11 = this.deferredSlotWrites;
        if (r11 == null) goto L21;
        ObjectList r12 = (MutableObjectList) r11.get(groupIndex);
        if (r12 == null) goto L21;
        ObjectList this_$iv = r12;
        Object[] content$iv = this_$iv.content;
        int r3 = this_$iv._size;
        int i$iv = 0;
    L17:
        if (i$iv >= r3) goto L19;
        int i$iv2 = i$iv;
        Object value = content$iv[i$iv2];
        rawUpdate(value);
        i$iv = i$iv2 + 1;
        goto L17
    L19:
        MutableObjectList<Object> r1 = r11.remove(groupIndex);
    L21:
        SlotTableKt.access$updateGroupSize(this.groups, groupAddress, newGroupSize);
        SlotTableKt.access$updateNodeCount(this.groups, groupAddress, newNodes);
        int r2 = this.nodeCountStack.pop();
        if (isNode == false) goto L24;
        int r4 = 1;
    L25:
        this.nodeCount = r2 + r4;
        this.parent = parent(this.groups, groupIndex);
        if (this.parent >= 0) goto L28;
        int nextAddress = getSize$runtime_release();
    L29:
        if (nextAddress >= 0) goto L31;
        int newCurrentSlot = 0;
    L32:
        this.currentSlot = newCurrentSlot;
        this.currentSlotEnd = newCurrentSlot;
    L78:
        return newNodes;
    L31:
        newCurrentSlot = dataIndex(this.groups, nextAddress);
        goto L32
    L28:
        nextAddress = groupIndexToAddress(this.parent + 1);
        goto L29
    L24:
        r4 = newNodes;
        goto L25
    L34:
        if (currentGroup != currentGroupEnd) goto L36;
        boolean value$iv = true;
    L38:
        if (value$iv == true) goto L40;
        ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
    L40:
        int oldGroupSize = SlotTableKt.access$groupSize(this.groups, groupAddress);
        int[] $this$nodeCount$iv = this.groups;
        int oldNodes = $this$nodeCount$iv[(groupAddress * 5) + 1] & RectListKt.Lower26Bits;
        SlotTableKt.access$updateGroupSize(this.groups, groupAddress, newGroupSize);
        SlotTableKt.access$updateNodeCount(this.groups, groupAddress, newNodes);
        int newParent = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = newParent;
        int groupParent = parent(this.groups, groupIndex);
        this.nodeCount = this.nodeCountStack.pop();
        if (groupParent != newParent) goto L47;
        int r13 = this.nodeCount;
        if (isNode == false) goto L45;
        int r16 = 0;
    L46:
        this.nodeCount = r13 + r16;
        goto L78
    L45:
        r16 = newNodes - oldNodes;
        goto L46
    L47:
        int groupSizeDelta = newGroupSize - oldGroupSize;
        if (isNode == false) goto L50;
        int nodesDelta = 0;
    L51:
        if (groupSizeDelta != 0) goto L55;
        if (nodesDelta != 0) goto L55;
    L77:
        this.nodeCount += nodesDelta;
    L55:
        int current = groupParent;
    L56:
        if (current == 0) goto L77;
        if (current == newParent) goto L77;
        if (nodesDelta != 0) goto L62;
        if (groupSizeDelta == 0) goto L77;
    L62:
        int r20 = currentAddress;
        int currentAddress2 = groupIndexToAddress(current);
        if (groupSizeDelta == 0) goto L66;
        int newSize = SlotTableKt.access$groupSize(this.groups, currentAddress2) + groupSizeDelta;
        SlotTableKt.access$updateGroupSize(this.groups, currentAddress2, newSize);
    L66:
        if (nodesDelta == 0) goto L68;
        int[] r5 = this.groups;
        int[] $this$nodeCount$iv2 = this.groups;
        SlotTableKt.access$updateNodeCount(r5, currentAddress2, ($this$nodeCount$iv2[(currentAddress2 * 5) + 1] & RectListKt.Lower26Bits) + nodesDelta);
    L68:
        int[] $this$isNode$iv2 = this.groups;
        if (($this$isNode$iv2[(currentAddress2 * 5) + 1] & r20) == 0) goto L71;
        boolean r6 = true;
    L72:
        if (r6 == false) goto L74;
        nodesDelta = 0;
    L74:
        current = parent(this.groups, current);
        currentAddress = r20;
        oldGroupSize = oldGroupSize;
        oldNodes = oldNodes;
        goto L56
    L71:
        r6 = false;
        goto L72
    L50:
        nodesDelta = newNodes - oldNodes;
        goto L51
    L36:
        value$iv = false;
        goto L38
    L9:
        isNode = false;
        goto L11
    L5:
        inserting = false;
        goto L6
    }

    public final void ensureStarted(int index) {
        boolean value$iv = true;
        if (this.insertCount > 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
    L9:
        int parent = this.parent;
        if (parent == index) goto L21;
        if (index >= parent) goto L13;
    L15:
        value$iv = false;
    L17:
        if (value$iv == true) goto L19;
        ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + parent);
    L19:
        int oldCurrent = this.currentGroup;
        int oldCurrentSlot = this.currentSlot;
        int oldCurrentSlotEnd = this.currentSlotEnd;
        this.currentGroup = index;
        startGroup();
        this.currentGroup = oldCurrent;
        this.currentSlot = oldCurrentSlot;
        this.currentSlotEnd = oldCurrentSlotEnd;
        return;
    L13:
        if (index >= this.currentGroupEnd) goto L15;
    L21:
        return;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupAddress = groupIndexToAddress(this.currentGroup);
        int newGroup = this.currentGroup + SlotTableKt.access$groupSize(this.groups, groupAddress);
        this.currentGroup = newGroup;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(newGroup));
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(groupAddress * 5) + 1] & 1073741824) == 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == true) goto L10;
        int[] $this$nodeCount$iv = this.groups;
        return 67108863 & $this$nodeCount$iv[(groupAddress * 5) + 1];
    L10:
        return 1;
    L5:
        r4 = false;
        goto L6
    }

    public final boolean removeGroup() {
        if (this.insertCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
    L9:
        int oldGroup = this.currentGroup;
        int oldSlot = this.currentSlot;
        int dataStart = dataIndex(this.groups, groupIndexToAddress(oldGroup));
        int count = skipGroup();
        GroupSourceInformation sourceInformation = sourceInformationOf(this.parent);
        if (sourceInformation == null) goto L14;
        Anchor anchor = tryAnchor$runtime_release(oldGroup);
        if (anchor == null) goto L14;
        sourceInformation.removeAnchor(anchor);
    L14:
        MutableIntList it = this.pendingRecalculateMarks;
        if (it != null) goto L18;
    L23:
        boolean anchorsRemoved = removeGroups(oldGroup, this.currentGroup - oldGroup);
        removeSlots(dataStart, this.currentSlot - dataStart, oldGroup - 1);
        this.currentGroup = oldGroup;
        this.currentSlot = oldSlot;
        this.nodeCount -= count;
        return anchorsRemoved;
    L18:
        if (PrioritySet.m3775isNotEmptyimpl(it) == false) goto L23;
        if (PrioritySet.m3776peekimpl(it) < oldGroup) goto L23;
        PrioritySet.m3777takeMaximpl(it);
        goto L18
    L5:
        value$iv = false;
        goto L7
    }

    public final Iterator<Object> groupSlots() {
        int start = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int end = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + groupSize(this.currentGroup)));
        return new AnonymousClass1(start, end, this);
    }

    public final void forAllData(int group, Function2<? super Integer, Object, Unit> r10) {
        int address = access$groupIndexToAddress(this, group);
        int start = access$dataIndex(this, access$getGroups$p(this), address);
        int end = access$dataIndex(this, access$getGroups$p(this), access$groupIndexToAddress(this, getCurrentGroup() + groupSize(getCurrentGroup())));
        int slot = start;
    L3:
        if (slot >= end) goto L5;
        r10.invoke(Integer.valueOf(slot), access$getSlots$p(this)[access$dataIndexToDataAddress(this, slot)]);
        slot = slot + 1;
        goto L3
    }

    public final void moveGroup(int offset) {
        if (this.insertCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
    L10:
        if (offset < 0) goto L12;
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L17;
        ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
    L17:
        if (offset != 0) goto L19;
        return;
    L19:
        int current = this.currentGroup;
        int parent = this.parent;
        int parentEnd = this.currentGroupEnd;
        int count = offset;
        int groupToMove = current;
    L20:
        int[] r9 = this.groups;
        if (count <= 0) goto L30;
        groupToMove = groupToMove + SlotTableKt.access$groupSize(r9, groupIndexToAddress(groupToMove));
        if (groupToMove > parentEnd) goto L25;
        boolean value$iv3 = true;
    L27:
        if (value$iv3 == true) goto L29;
        ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
    L29:
        count = count - 1;
        goto L20
    L25:
        value$iv3 = false;
        goto L27
    L30:
        int moveLen = SlotTableKt.access$groupSize(r9, groupIndexToAddress(groupToMove));
        int destinationSlot = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int dataStart = dataIndex(this.groups, groupIndexToAddress(groupToMove));
        int dataEnd = dataIndex(this.groups, groupIndexToAddress(groupToMove + moveLen));
        int moveDataLen = dataEnd - dataStart;
        insertSlots(moveDataLen, Math.max(this.currentGroup - 1, 0));
        insertGroups(moveLen);
        int[] groups = this.groups;
        int moveLocationAddress = groupIndexToAddress(groupToMove + moveLen);
        int moveLocationOffset = moveLocationAddress * 5;
        int currentAddress = groupIndexToAddress(current);
        ArraysKt.copyInto(groups, groups, currentAddress * 5, moveLocationOffset, moveLocationOffset + (moveLen * 5));
        if (moveDataLen <= 0) goto L34;
        Object[] slots = this.slots;
        int startIndex$iv = dataIndexToDataAddress(dataStart + moveDataLen);
        int endIndex$iv = dataIndexToDataAddress(dataEnd + moveDataLen);
        System.arraycopy(slots, startIndex$iv, slots, destinationSlot, endIndex$iv - startIndex$iv);
    L34:
        int dataMoveDistance = (dataStart + moveDataLen) - destinationSlot;
        int slotsGapStart = this.slotsGapStart;
        int slotsGapLen = this.slotsGapLen;
        int slotsCapacity = this.slots.length;
        int slotsGapOwner = this.slotsGapOwner;
        int slotsGapStart2 = current + moveLen;
        int groupToMove2 = groupToMove;
        int newIndex = current;
    L35:
        if (newIndex >= slotsGapStart2) goto L41;
        int r21 = slotsGapStart2;
        int groupAddress = groupIndexToAddress(newIndex);
        int oldIndex = dataIndex(groups, groupAddress);
        int group = newIndex;
        int group2 = oldIndex - dataMoveDistance;
        int slotsGapOwner2 = slotsGapOwner;
        if (slotsGapOwner >= groupAddress) goto L39;
        int slotsGapOwner3 = 0;
    L40:
        int newAnchor = dataIndexToDataAnchor(group2, slotsGapOwner3, slotsGapLen, slotsCapacity);
        updateDataIndex(groups, groupAddress, newAnchor);
        newIndex = group + 1;
        slotsGapStart2 = r21;
        slotsGapOwner = slotsGapOwner2;
        goto L35
    L39:
        slotsGapOwner3 = slotsGapStart;
        goto L40
    L41:
        int group3 = groupToMove2 + moveLen;
        moveAnchors(group3, current, moveLen);
        boolean anchorsRemoved = removeGroups(groupToMove2 + moveLen, moveLen);
        boolean value$iv4 = !anchorsRemoved;
        if (value$iv4 == true) goto L44;
        ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
    L44:
        fixParentAnchorsFor(parent, this.currentGroupEnd, current);
        if (moveDataLen <= 0) goto L54;
        removeSlots(dataStart + moveDataLen, moveDataLen, (groupToMove2 + moveLen) - 1);
        return;
    L54:
        return;
    L12:
        value$iv2 = false;
        goto L14
    L5:
        value$iv = false;
        goto L7
    }

    public final List<Anchor> moveTo(Anchor anchor, int offset, SlotWriter writer) {
        boolean value$iv = false;
        if (writer.insertCount <= 0) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L10:
        if (this.insertCount != 0) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L16;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L16:
        boolean value$iv4 = anchor.getValid();
        if (value$iv4 == true) goto L19;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L19:
        int location = anchorIndex(anchor) + offset;
        int currentGroup = this.currentGroup;
        if (currentGroup <= location) goto L22;
    L24:
        boolean value$iv5 = false;
    L26:
        if (value$iv5 == true) goto L28;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L28:
        int parent = parent(location);
        int size = groupSize(location);
        if (isNode(location) == false) goto L31;
        int r0 = 1;
    L32:
        int nodes = r0;
        List<Anchor> r1 = Companion.moveGroup$default(Companion, this, location, writer, false, false, false, 32, null);
        updateContainsMark(parent);
        int current = parent;
        if (nodes <= 0) goto L35;
        boolean updatingNodes = true;
    L36:
        if (current < currentGroup) goto L47;
        int currentAddress = groupIndexToAddress(current);
        SlotTableKt.access$updateGroupSize(this.groups, currentAddress, SlotTableKt.access$groupSize(this.groups, currentAddress) - size);
        if (updatingNodes == false) goto L46;
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(currentAddress * 5) + 1] & 1073741824) == 0) goto L42;
        boolean r6 = true;
    L43:
        if (r6 == false) goto L45;
        updatingNodes = false;
        goto L46
    L45:
        int[] r7 = this.groups;
        int[] $this$nodeCount$iv = this.groups;
        SlotTableKt.access$updateNodeCount(r7, currentAddress, ($this$nodeCount$iv[(currentAddress * 5) + 1] & RectListKt.Lower26Bits) - nodes);
        goto L46
    L42:
        r6 = false;
    L46:
        current = parent(current);
        goto L36
    L47:
        if (updatingNodes == true) goto L49;
    L55:
        return r1;
    L49:
        if (this.nodeCount < nodes) goto L52;
        value$iv = true;
    L52:
        if (value$iv == true) goto L54;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L54:
        int $i$f$runtimeCheck = this.nodeCount;
        this.nodeCount = $i$f$runtimeCheck - nodes;
        goto L55
    L35:
        updatingNodes = false;
        goto L36
    L31:
        r0 = nodeCount(location);
        goto L32
    L22:
        if (location >= this.currentGroupEnd) goto L24;
        value$iv5 = true;
        goto L26
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter r0, SlotTable r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = true;
    L6:
        return r0.moveFrom(r1, r2, r3);
    }

    public final List<Anchor> moveFrom(SlotTable table, int index, boolean removeSourceGroup) {
        if (this.insertCount <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L10:
        if (index == 0) goto L12;
    L19:
        SlotWriter writer$iv = table.openWriter();
        List<Anchor> r0 = Companion.access$moveGroup(Companion, writer$iv, index, this, true, true, removeSourceGroup);     // Catch: Throwable -> L23
        writer$iv.close(true);
        return r0;
    L23:
        th = move-exception;
        writer$iv.close(false);
        throw th;
    L12:
        if (this.currentGroup != 0) goto L19;
        if (this.table.getGroupsSize() != 0) goto L19;
        if (SlotTableKt.access$groupSize(table.getGroups(), index) != table.getGroupsSize()) goto L19;
        int[] myGroups = this.groups;
        Object[] mySlots = this.slots;
        ArrayList<Anchor> r9 = this.anchors;
        HashMap<Anchor, GroupSourceInformation> r10 = this.sourceInformationMap;
        MutableIntObjectMap<MutableIntSet> r11 = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> r14 = table.getSourceInformationMap$runtime_release();
        MutableIntObjectMap<MutableIntSet> r15 = table.getCalledByMap$runtime_release();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = r14;
        this.calledByMap = r15;
        table.setTo$runtime_release(myGroups, 0, mySlots, 0, r9, r10, r11);
        return this.anchors;
    L5:
        value$iv = false;
        goto L7
    }

    public final void bashCurrentGroup() {
        SlotTableKt.access$updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final List<Anchor> moveIntoGroupFrom(int offset, SlotTable table, int index) {
        if (this.insertCount > 0) goto L7;
        boolean value$iv = true;
        if (groupSize(this.currentGroup + offset) != 1) goto L7;
    L9:
        if (value$iv == true) goto L11;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L11:
        int previousCurrentGroup = this.currentGroup;
        int previousCurrentSlot = this.currentSlot;
        int previousCurrentSlotEnd = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter writer$iv = table.openWriter();
        List<Anchor> r0 = Companion.moveGroup$default(Companion, writer$iv, index, this, false, true, false, 32, null);     // Catch: Throwable -> L17
        writer$iv.close(true);
        endInsert();
        endGroup();
        this.currentGroup = previousCurrentGroup;
        this.currentSlot = previousCurrentSlot;
        this.currentSlotEnd = previousCurrentSlotEnd;
        return r0;
    L17:
        th = th;
    L21:
        writer$iv.close(false);
        throw th;
    L19:
        th = th;
    L7:
        value$iv = false;
        goto L9
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.currentGroup;
    L6:
        return r0.anchor(r1);
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> r0 = this.anchors;
        int effectiveSize$iv = getSize$runtime_release();
        int location$iv = SlotTableKt.access$search(r0, index, effectiveSize$iv);
        if (location$iv >= 0) goto L11;
        if (index > this.groupGapStart) goto L7;
        int r6 = index;
    L8:
        Anchor anchor$iv = new Anchor(r6);
        r0.add(-(location$iv + 1), anchor$iv);
        return anchor$iv;
    L7:
        r6 = -(getSize$runtime_release() - index);
        goto L8
    L11:
        return r0.get(location$iv);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = r0.parent;
    L5:
        r0.markGroup(r1);
    }

    public final void markGroup(int group) {
        int groupAddress = groupIndexToAddress(group);
        int[] $this$hasMark$iv = this.groups;
        boolean r4 = true;
        if (($this$hasMark$iv[(groupAddress * 5) + 1] & 134217728) == 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L14;
        SlotTableKt.access$updateMark(this.groups, groupAddress, true);
        int[] $this$containsMark$iv = this.groups;
        if (($this$containsMark$iv[(groupAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) goto L11;
        r4 = false;
    L11:
        if (r4 == true) goto L15;
        updateContainsMark(parent(group));
        return;
    L15:
        return;
    L14:
        return;
    L5:
        r1 = false;
        goto L6
    }

    private final boolean containsGroupMark(int group) {
        if (group < 0) goto L11;
        int[] $this$containsMark$iv = this.groups;
        int address$iv = groupIndexToAddress(group);
        if (($this$containsMark$iv[(address$iv * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r1 = false;
        goto L8
    L11:
        return false;
    }

    private final boolean containsAnyGroupMarks(int group) {
        if (group < 0) goto L11;
        int[] $this$containsAnyMark$iv = this.groups;
        int address$iv = groupIndexToAddress(group);
        if (($this$containsAnyMark$iv[(address$iv * 5) + 1] & 201326592) == 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r1 = false;
        goto L8
    L11:
        return false;
    }

    private final void recalculateMarks() {
        MutableIntList set = this.pendingRecalculateMarks;
        if (set != null) goto L6;
        return;
    L6:
        if (PrioritySet.m3775isNotEmptyimpl(set) == false) goto L11;
        m3789updateContainsMarkNowXpTMRCE(PrioritySet.m3777takeMaximpl(set), set);
        goto L6
    }

    private final void updateContainsMark(int group) {
        if (group < 0) goto L8;
        MutableIntList it = this.pendingRecalculateMarks;
        if (it != null) goto L6;
        it = PrioritySet.m3770constructorimpl$default(null, 1, null);
        this.pendingRecalculateMarks = it;
    L6:
        PrioritySet.m3767addimpl(it, group);
        return;
    }

    /* JADX INFO: renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m3789updateContainsMarkNowXpTMRCE(int group, MutableIntList set) {
        int groupAddress = groupIndexToAddress(group);
        boolean containsAnyMarks = childContainsAnyMarks(group);
        int[] $this$containsMark$iv = this.groups;
        boolean markChanges = true;
        if (($this$containsMark$iv[(groupAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 != containsAnyMarks) goto L9;
        markChanges = false;
    L9:
        if (markChanges == false) goto L14;
        SlotTableKt.access$updateContainsMark(this.groups, groupAddress, containsAnyMarks);
        int parent = parent(group);
        if (parent < 0) goto L15;
        PrioritySet.m3767addimpl(set, parent);
        return;
    L15:
        return;
    L14:
        return;
    L5:
        r2 = false;
        goto L6
    }

    private final boolean childContainsAnyMarks(int group) {
        int child = group + 1;
        int end = groupSize(group) + group;
    L3:
        boolean r2 = false;
        if (child >= end) goto L11;
        int[] $this$containsAnyMark$iv = this.groups;
        int address$iv = groupIndexToAddress(child);
        if (($this$containsAnyMark$iv[(address$iv * 5) + 1] & 201326592) == 0) goto L8;
        r2 = true;
    L8:
        if (r2 == true) goto L9;
        child = child + groupSize(child);
        goto L3
    L9:
        return true;
    L11:
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        int it = anchor.getLocation$runtime_release();
        if (it < 0) goto L5;
        return it;
    L5:
        return getSize$runtime_release() + it;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int newGroupEnd = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = newGroupEnd;
        return newGroupEnd;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int parentAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        int child = firstChild;
    L3:
        if (child >= endGroup) goto L5;
        int[] $this$updateParentAnchor$iv = this.groups;
        int address$iv = groupIndexToAddress(child);
        $this$updateParentAnchor$iv[(address$iv * 5) + 2] = parentAnchor;
        int[] $this$updateParentAnchor$iv2 = this.groups;
        int childEnd = SlotTableKt.access$groupSize($this$updateParentAnchor$iv2, groupIndexToAddress(child)) + child;
        fixParentAnchorsFor(child, childEnd, child + 1);
        child = childEnd;
        goto L3
    }

    private final void moveGroupGapTo(int index) {
        int gapLen = this.groupGapLen;
        int gapStart = this.groupGapStart;
        if (gapStart != index) goto L5;
    L30:
        this.groupGapStart = index;
        return;
    L5:
        if (this.anchors.isEmpty() == true) goto L7;
        updateAnchors(gapStart, index);
    L7:
        if (gapLen <= 0) goto L12;
        int[] groups = this.groups;
        int groupPhysicalAddress = index * 5;
        int groupPhysicalGapLen = gapLen * 5;
        int groupPhysicalGapStart = gapStart * 5;
        if (index >= gapStart) goto L11;
        ArraysKt.copyInto(groups, groups, groupPhysicalAddress + groupPhysicalGapLen, groupPhysicalAddress, groupPhysicalGapStart);
        goto L12
    L11:
        ArraysKt.copyInto(groups, groups, groupPhysicalGapStart, groupPhysicalGapStart + groupPhysicalGapLen, groupPhysicalAddress + groupPhysicalGapLen);
    L12:
        if (index >= gapStart) goto L14;
        int groupAddress = index + gapLen;
    L15:
        int capacity = getCapacity();
        if (groupAddress >= capacity) goto L18;
        boolean value$iv = true;
    L20:
        if (value$iv == true) goto L23;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L23:
        if (groupAddress >= capacity) goto L30;
        int[] $this$parentAnchor$iv = this.groups;
        int oldAnchor = $this$parentAnchor$iv[(groupAddress * 5) + 2];
        int oldIndex = parentAnchorToIndex(oldAnchor);
        int newAnchor = parentIndexToAnchor(oldIndex, index);
        if (newAnchor == oldAnchor) goto L27;
        int[] $this$updateParentAnchor$iv = this.groups;
        $this$updateParentAnchor$iv[(groupAddress * 5) + 2] = newAnchor;
    L27:
        groupAddress = groupAddress + 1;
        if (groupAddress != index) goto L23;
        groupAddress = groupAddress + gapLen;
        goto L23
    L18:
        value$iv = false;
        goto L20
    L14:
        groupAddress = gapStart;
        goto L15
    }

    private final void moveSlotGapTo(int index, int group) {
        int gapLen = this.slotsGapLen;
        int gapStart = this.slotsGapStart;
        int slotsGapOwner = this.slotsGapOwner;
        if (gapStart == index) goto L8;
        Object[] slots = this.slots;
        if (index >= gapStart) goto L7;
        int destinationOffset$iv = index + gapLen;
        System.arraycopy(slots, index, slots, destinationOffset$iv, gapStart - index);
        goto L8
    L7:
        int startIndex$iv = gapStart + gapLen;
        int endIndex$iv = index + gapLen;
        System.arraycopy(slots, startIndex$iv, slots, gapStart, endIndex$iv - startIndex$iv);
    L8:
        int newSlotsGapOwner = Math.min(group + 1, getSize$runtime_release());
        if (slotsGapOwner == newSlotsGapOwner) goto L37;
        int slotsSize = this.slots.length - gapLen;
        if (newSlotsGapOwner >= slotsGapOwner) goto L24;
        int updateAddress = groupIndexToAddress(newSlotsGapOwner);
        int stopUpdateAddress = groupIndexToAddress(slotsGapOwner);
        int groupGapStart = this.groupGapStart;
    L13:
        if (updateAddress >= stopUpdateAddress) goto L36;
        int[] $this$dataAnchor$iv = this.groups;
        int anchor = $this$dataAnchor$iv[(updateAddress * 5) + 4];
        if (anchor < 0) goto L17;
        boolean value$iv = true;
    L19:
        if (value$iv == true) goto L21;
        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
    L21:
        int[] $this$updateDataAnchor$iv = this.groups;
        int anchor$iv = -((slotsSize - anchor) + 1);
        $this$updateDataAnchor$iv[(updateAddress * 5) + 4] = anchor$iv;
        updateAddress = updateAddress + 1;
        if (updateAddress != groupGapStart) goto L13;
        updateAddress = updateAddress + this.groupGapLen;
        goto L13
    L17:
        value$iv = false;
    L36:
        this.slotsGapOwner = newSlotsGapOwner;
        goto L37
    L24:
        int updateAddress2 = groupIndexToAddress(slotsGapOwner);
        int stopUpdateAddress2 = groupIndexToAddress(newSlotsGapOwner);
    L25:
        if (updateAddress2 >= stopUpdateAddress2) goto L36;
        int[] $this$dataAnchor$iv2 = this.groups;
        int anchor2 = $this$dataAnchor$iv2[(updateAddress2 * 5) + 4];
        if (anchor2 >= 0) goto L29;
        boolean value$iv2 = true;
    L31:
        if (value$iv2 == true) goto L33;
        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
    L33:
        int[] $this$updateDataAnchor$iv2 = this.groups;
        int anchor$iv2 = (slotsSize + anchor2) + 1;
        $this$updateDataAnchor$iv2[(updateAddress2 * 5) + 4] = anchor$iv2;
        updateAddress2 = updateAddress2 + 1;
        if (updateAddress2 != this.groupGapStart) goto L25;
        updateAddress2 = updateAddress2 + this.groupGapLen;
        goto L25
    L29:
        value$iv2 = false;
    L37:
        this.slotsGapStart = index;
    }

    private final void clearSlotGap() {
        int slotsGapStart = this.slotsGapStart;
        int slotsGapEnd = this.slotsGapLen + slotsGapStart;
        ArraysKt.fill(this.slots, null, slotsGapStart, slotsGapEnd);
    }

    private final void insertGroups(int size) {
        if (size <= 0) goto L26;
        int currentGroup = this.currentGroup;
        moveGroupGapTo(currentGroup);
        int gapStart = this.groupGapStart;
        int gapLen = this.groupGapLen;
        int oldCapacity = this.groups.length / 5;
        int oldSize = oldCapacity - gapLen;
        if (gapLen >= size) goto L7;
        int[] groups = this.groups;
        int newCapacity = Math.max(Math.max(oldCapacity * 2, oldSize + size), 32);
        int[] newGroups = new int[newCapacity * 5];
        int newGapLen = newCapacity - oldSize;
        int oldGapEndAddress = gapStart + gapLen;
        int newGapEndAddress = gapStart + newGapLen;
        ArraysKt.copyInto(groups, newGroups, 0, 0, gapStart * 5);
        ArraysKt.copyInto(groups, newGroups, newGapEndAddress * 5, oldGapEndAddress * 5, oldCapacity * 5);
        this.groups = newGroups;
        gapLen = newGapLen;
    L7:
        int currentEnd = this.currentGroupEnd;
        if (currentEnd < gapStart) goto L10;
        this.currentGroupEnd = currentEnd + size;
    L10:
        this.groupGapStart = gapStart + size;
        this.groupGapLen = gapLen - size;
        if (oldSize <= 0) goto L13;
        int index = dataIndex(currentGroup + size);
    L15:
        if (this.slotsGapOwner >= gapStart) goto L17;
        int r9 = 0;
    L18:
        int anchor = dataIndexToDataAnchor(index, r9, this.slotsGapLen, this.slots.length);
        int groupAddress = gapStart;
        int r11 = gapStart + size;
    L19:
        if (groupAddress >= r11) goto L21;
        int[] $this$updateDataAnchor$iv = this.groups;
        $this$updateDataAnchor$iv[(groupAddress * 5) + 4] = anchor;
        groupAddress = groupAddress + 1;
        goto L19
    L21:
        int groupAddress2 = this.slotsGapOwner;
        if (groupAddress2 < gapStart) goto L27;
        this.slotsGapOwner = groupAddress2 + size;
        return;
    L27:
        return;
    L17:
        r9 = this.slotsGapStart;
        goto L18
    L13:
        index = 0;
        goto L15
    }

    private final void insertSlots(int size, int group) {
        if (size <= 0) goto L15;
        moveSlotGapTo(this.currentSlot, group);
        int gapStart = this.slotsGapStart;
        int gapLen = this.slotsGapLen;
        if (gapLen >= size) goto L10;
        Object[] slots = this.slots;
        int oldCapacity = slots.length;
        int oldSize = oldCapacity - gapLen;
        int newCapacity = Math.max(Math.max(oldCapacity * 2, oldSize + size), 32);
        Object[] newData = new Object[newCapacity];
        int r11 = 0;
    L7:
        if (r11 >= newCapacity) goto L9;
        newData[r11] = null;
        r11 = r11 + 1;
        goto L7
    L9:
        int newGapLen = newCapacity - oldSize;
        int oldGapEndAddress = gapStart + gapLen;
        int newGapEndAddress = gapStart + newGapLen;
        System.arraycopy(slots, 0, newData, 0, gapStart - 0);
        System.arraycopy(slots, oldGapEndAddress, newData, newGapEndAddress, oldCapacity - oldGapEndAddress);
        this.slots = newData;
        gapLen = newGapLen;
    L10:
        int currentDataEnd = this.currentSlotEnd;
        if (currentDataEnd < gapStart) goto L13;
        this.currentSlotEnd = currentDataEnd + size;
    L13:
        this.slotsGapStart = gapStart + size;
        this.slotsGapLen = gapLen - size;
        return;
    }

    private final boolean removeGroups(int start, int len) {
        if (len <= 0) goto L16;
        boolean anchorsRemoved = false;
        ArrayList<Anchor> r1 = this.anchors;
        moveGroupGapTo(start);
        if (r1.isEmpty() == true) goto L6;
        anchorsRemoved = removeAnchors(start, len, this.sourceInformationMap);
    L6:
        this.groupGapStart = start;
        int previousGapLen = this.groupGapLen;
        int newGapLen = previousGapLen + len;
        this.groupGapLen = newGapLen;
        int slotsGapOwner = this.slotsGapOwner;
        if (slotsGapOwner <= start) goto L10;
        this.slotsGapOwner = Math.max(start, slotsGapOwner - len);
    L10:
        if (this.currentGroupEnd < this.groupGapStart) goto L12;
        this.currentGroupEnd -= len;
    L12:
        int parent = this.parent;
        if (containsGroupMark(parent) == false) goto L19;
        updateContainsMark(parent);
        return anchorsRemoved;
    L19:
        return anchorsRemoved;
    L16:
        return false;
    }

    private final GroupSourceInformation sourceInformationOf(int group) {
        HashMap<Anchor, GroupSourceInformation> r0 = this.sourceInformationMap;
        if (r0 == null) goto L8;
        Anchor anchor = tryAnchor$runtime_release(group);
        if (anchor != null) goto L7;
        return null;
    L7:
        return r0.get(anchor);
    L8:
        return null;
    }

    public final Anchor tryAnchor$runtime_release(int group) {
        boolean r0 = false;
        if (group >= 0) goto L5;
    L7:
        if (r0 == true) goto L11;
        return null;
    L11:
        return SlotTableKt.access$find(this.anchors, group, getSize$runtime_release());
    L5:
        if (group >= getSize$runtime_release()) goto L7;
        r0 = true;
        goto L7
    }

    private final void removeSlots(int start, int len, int group) {
        if (len <= 0) goto L7;
        int gapLen = this.slotsGapLen;
        int removeEnd = start + len;
        moveSlotGapTo(removeEnd, group);
        this.slotsGapStart = start;
        this.slotsGapLen = gapLen + len;
        ArraysKt.fill(this.slots, null, start, start + len);
        int currentDataEnd = this.currentSlotEnd;
        if (currentDataEnd < start) goto L8;
        this.currentSlotEnd = currentDataEnd - len;
        return;
    L8:
        return;
    }

    private final void updateNodeOfGroup(int index, Object value) {
        int address = groupIndexToAddress(index);
        boolean value$iv = false;
        if (address >= this.groups.length) goto L11;
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(address * 5) + 1] & 1073741824) == 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L11;
        value$iv = true;
        goto L11
    L7:
        r1 = false;
    L11:
        if (value$iv == true) goto L13;
        ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + index + " that was not created with as a node group");
    L13:
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, address))] = value;
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        int gapLen = this.groupGapLen;
        int size = getCapacity() - gapLen;
        ArrayList<Anchor> r2 = this.anchors;
        if (previousGapStart >= newGapStart) goto L14;
        int index = SlotTableKt.access$locationOf(r2, previousGapStart, size);
    L6:
        if (index >= this.anchors.size()) goto L21;
        Anchor anchor = this.anchors.get(index);
        int location = anchor.getLocation$runtime_release();
        if (location >= 0) goto L27;
        int newLocation = size + location;
        if (newLocation >= newGapStart) goto L28;
        anchor.setLocation$runtime_release(size + location);
        index = index + 1;
        goto L6
    L28:
        return;
    L27:
        return;
    L21:
        return;
    L14:
        int index2 = SlotTableKt.access$locationOf(r2, newGapStart, size);
    L16:
        if (index2 >= this.anchors.size()) goto L29;
        Anchor anchor2 = this.anchors.get(index2);
        int location2 = anchor2.getLocation$runtime_release();
        if (location2 < 0) goto L30;
        anchor2.setLocation$runtime_release(-(size - location2));
        index2 = index2 + 1;
        goto L16
    L30:
        return;
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> r13) {
        int gapLen = this.groupGapLen;
        int removeEnd = gapStart + size;
        int groupsSize = getCapacity() - gapLen;
        int it = SlotTableKt.access$locationOf(this.anchors, gapStart + size, groupsSize);
        if (it < this.anchors.size()) goto L5;
        it = it - 1;
    L5:
        int removeAnchorEnd = 0;
        int removeAnchorStart = it + 1;
    L6:
        if (it < 0) goto L18;
        Anchor anchor = this.anchors.get(it);
        int location = anchorIndex(anchor);
        if (location < gapStart) goto L18;
        if (location >= removeEnd) goto L16;
        anchor.setLocation$runtime_release(Integer.MIN_VALUE);
        if (r13 == null) goto L13;
        GroupSourceInformation r8 = r13.remove(anchor);
    L13:
        removeAnchorStart = it;
        if (removeAnchorEnd != 0) goto L16;
        removeAnchorEnd = it + 1;
    L16:
        it = it - 1;
    L18:
        if (removeAnchorStart >= removeAnchorEnd) goto L20;
        boolean it2 = true;
    L22:
        if (it2 == false) goto L25;
        this.anchors.subList(removeAnchorStart, removeAnchorEnd).clear();
    L25:
        return it2;
    L20:
        it2 = false;
        goto L22
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        int end = originalLocation + size;
        int groupsSize = getSize$runtime_release();
        int index = SlotTableKt.access$locationOf(this.anchors, originalLocation, groupsSize);
        List removedAnchors = new ArrayList();
        if (index >= 0) goto L5;
    L11:
        int moveDelta = newLocation - originalLocation;
        int index$iv = 0;
        int r10 = removedAnchors.size();
    L12:
        if (index$iv >= r10) goto L19;
        Object item$iv = removedAnchors.get(index$iv);
        Anchor anchor = (Anchor) item$iv;
        int anchorIndex = anchorIndex(anchor);
        int newAnchorIndex = anchorIndex + moveDelta;
        if (newAnchorIndex < this.groupGapStart) goto L16;
        anchor.setLocation$runtime_release(-(groupsSize - newAnchorIndex));
    L17:
        int insertIndex = SlotTableKt.access$locationOf(this.anchors, newAnchorIndex, groupsSize);
        int end2 = end;
        this.anchors.add(insertIndex, anchor);
        index$iv = index$iv + 1;
        end = end2;
        goto L12
    L16:
        anchor.setLocation$runtime_release(newAnchorIndex);
        goto L17
    L19:
        return;
    L5:
        if (index >= this.anchors.size()) goto L11;
        Anchor anchor2 = this.anchors.get(index);
        int location = anchorIndex(anchor2);
        if (location < originalLocation) goto L11;
        if (location >= end) goto L11;
        removedAnchors.add(anchor2);
        this.anchors.remove(index);
        goto L5
    }

    public final String toDebugString() {
        StringBuilder $this$toDebugString_u24lambda_u2445 = new StringBuilder();
        StringBuilder r3 = $this$toDebugString_u24lambda_u2445.append(toString());
        Intrinsics.checkNotNullExpressionValue(r3, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r3.append('\n'), "append(...)");
        StringBuilder r4 = $this$toDebugString_u24lambda_u2445.append("  parent:    " + this.parent);
        Intrinsics.checkNotNullExpressionValue(r4, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r4.append('\n'), "append(...)");
        StringBuilder r5 = $this$toDebugString_u24lambda_u2445.append("  current:   " + this.currentGroup);
        Intrinsics.checkNotNullExpressionValue(r5, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r5.append('\n'), "append(...)");
        StringBuilder r6 = $this$toDebugString_u24lambda_u2445.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(r6, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r6.append('\n'), "append(...)");
        StringBuilder r7 = $this$toDebugString_u24lambda_u2445.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(r7, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r7.append('\n'), "append(...)");
        StringBuilder r8 = $this$toDebugString_u24lambda_u2445.append("  gap owner: " + this.slotsGapOwner);
        Intrinsics.checkNotNullExpressionValue(r8, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r8.append('\n'), "append(...)");
        int index = 0;
        int r9 = getSize$runtime_release();
    L3:
        if (index >= r9) goto L5;
        groupAsString($this$toDebugString_u24lambda_u2445, index);
        $this$toDebugString_u24lambda_u2445.append('\n');
        index = index + 1;
        goto L3
    L5:
        String r0 = $this$toDebugString_u24lambda_u2445.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    private final void groupAsString(StringBuilder $this$groupAsString, int index) {
        int address = groupIndexToAddress(index);
        $this$groupAsString.append("Group(");
        if (index >= 10) goto L6;
        $this$groupAsString.append(' ');
    L6:
        if (index >= 100) goto L9;
        $this$groupAsString.append(' ');
    L9:
        if (index >= 1000) goto L11;
        $this$groupAsString.append(' ');
    L11:
        $this$groupAsString.append(index);
        if (address == index) goto L14;
        $this$groupAsString.append("(");
        $this$groupAsString.append(address);
        $this$groupAsString.append(")");
    L14:
        $this$groupAsString.append('#');
        $this$groupAsString.append(SlotTableKt.access$groupSize(this.groups, address));
        $this$groupAsString.append('^');
        int[] $this$parentAnchor$iv = this.groups;
        $this$groupAsString.append(parentAnchorToIndex($this$parentAnchor$iv[(address * 5) + 2]));
        $this$groupAsString.append(": key=");
        int[] $this$key$iv = this.groups;
        $this$groupAsString.append($this$key$iv[address * 5]);
        $this$groupAsString.append(", nodes=");
        int[] $this$nodeCount$iv = this.groups;
        boolean r6 = true;
        $this$groupAsString.append($this$nodeCount$iv[(address * 5) + 1] & RectListKt.Lower26Bits);
        $this$groupAsString.append(", dataAnchor=");
        int[] $this$dataAnchor$iv = this.groups;
        $this$groupAsString.append($this$dataAnchor$iv[(address * 5) + 4]);
        $this$groupAsString.append(", parentAnchor=");
        int[] $this$parentAnchor$iv2 = this.groups;
        $this$groupAsString.append($this$parentAnchor$iv2[(address * 5) + 2]);
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(address * 5) + 1] & 1073741824) != 0) goto L18;
        r6 = false;
    L18:
        if (r6 == false) goto L20;
        $this$groupAsString.append(", node=" + SlotTableKt.access$summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, address))]), 10));
    L20:
        int startData = slotIndex(this.groups, address);
        int successorAddress = groupIndexToAddress(index + 1);
        int endData = dataIndex(this.groups, successorAddress);
        if (endData <= startData) goto L28;
        $this$groupAsString.append(", [");
        int dataIndex = startData;
    L23:
        if (dataIndex >= endData) goto L27;
        if (dataIndex == startData) goto L26;
        $this$groupAsString.append(", ");
    L26:
        int dataAddress = dataIndexToDataAddress(dataIndex);
        $this$groupAsString.append(SlotTableKt.access$summarize(String.valueOf(this.slots[dataAddress]), 10));
        dataIndex = dataIndex + 1;
        goto L23
    L27:
        $this$groupAsString.append(']');
    L28:
        $this$groupAsString.append(")");
    }

    public final void verifyDataAnchors$runtime_release() {
        int previousDataIndex = 0;
        int owner = this.slotsGapOwner;
        boolean ownerFound = false;
        int slotsSize = this.slots.length - this.slotsGapLen;
        int index = 0;
        int r6 = getSize$runtime_release();
    L3:
        if (index >= r6) goto L29;
        int address = groupIndexToAddress(index);
        int[] $this$dataAnchor$iv = this.groups;
        int dataAnchor = $this$dataAnchor$iv[(address * 5) + 4];
        int dataIndex = dataIndex(this.groups, address);
        if (dataIndex < previousDataIndex) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L12;
        PreconditionsKt.throwIllegalStateException("Data index out of order at " + index + ", previous = " + previousDataIndex + ", current = " + dataIndex);
    L12:
        if (dataIndex > slotsSize) goto L14;
        boolean value$iv2 = true;
    L16:
        if (value$iv2 == true) goto L19;
        PreconditionsKt.throwIllegalStateException("Data index, " + dataIndex + ", out of bound at " + index);
    L19:
        if (dataAnchor >= 0) goto L28;
        if (ownerFound == true) goto L28;
        if (owner != index) goto L23;
        boolean value$iv3 = true;
    L25:
        if (value$iv3 == true) goto L27;
        PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + owner + " found gap at " + index);
    L27:
        ownerFound = true;
        goto L28
    L23:
        value$iv3 = false;
    L28:
        previousDataIndex = dataIndex;
        index = index + 1;
        goto L3
    L14:
        value$iv2 = false;
        goto L16
    L7:
        value$iv = false;
        goto L9
    }

    public final void verifyParentAnchors$runtime_release() {
        int gapStart = this.groupGapStart;
        int gapLen = this.groupGapLen;
        int capacity = getCapacity();
        int groupAddress = 0;
    L3:
        boolean value$iv = false;
        if (groupAddress >= gapStart) goto L12;
        int[] $this$parentAnchor$iv = this.groups;
        if ($this$parentAnchor$iv[(groupAddress * 5) + 2] <= (-2)) goto L9;
        value$iv = true;
    L9:
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + groupAddress);
    L11:
        groupAddress = groupAddress + 1;
        goto L3
    L12:
        int groupAddress2 = gapStart + gapLen;
    L13:
        if (groupAddress2 >= capacity) goto L31;
        int[] $this$parentAnchor$iv2 = this.groups;
        int parentAnchor = $this$parentAnchor$iv2[(groupAddress2 * 5) + 2];
        int parentIndex = parentAnchorToIndex(parentAnchor);
        if (parentIndex >= gapStart) goto L23;
        if (parentAnchor <= (-2)) goto L18;
        boolean value$iv2 = true;
    L20:
        if (value$iv2 == true) goto L30;
        PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + groupAddress2);
    L30:
        groupAddress2 = groupAddress2 + 1;
        goto L13
    L18:
        value$iv2 = false;
        goto L20
    L23:
        if (parentAnchor > (-2)) goto L25;
        boolean value$iv3 = true;
    L27:
        if (value$iv3 == true) goto L30;
        PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + groupAddress2);
        goto L30
    L25:
        value$iv3 = false;
        goto L27
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int groupIndexToAddress(int index) {
        int r0 = this.groupGapLen;
        if (index >= this.groupGapStart) goto L5;
        int r1 = 0;
    L7:
        return (r0 * r1) + index;
    L5:
        r1 = 1;
        goto L7
    }

    private final int dataIndexToDataAddress(int dataIndex) {
        int r0 = this.slotsGapLen;
        if (dataIndex >= this.slotsGapStart) goto L5;
        int r1 = 0;
    L7:
        return (r0 * r1) + dataIndex;
    L5:
        r1 = 1;
        goto L7
    }

    private final int parent(int[] $this$parent, int index) {
        int address$iv = groupIndexToAddress(index);
        int address$iv2 = $this$parent[(address$iv * 5) + 2];
        return parentAnchorToIndex(address$iv2);
    }

    private final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    private final int dataIndex(int[] $this$dataIndex, int address) {
        if (address >= getCapacity()) goto L7;
        int r0 = $this$dataIndex[(address * 5) + 4];
        int $i$f$dataAnchor = this.slotsGapLen;
        return dataAnchorToDataIndex(r0, $i$f$dataAnchor, this.slots.length);
    L7:
        return this.slots.length - this.slotsGapLen;
    }

    private final int slotIndex(int[] $this$slotIndex, int address) {
        if (address < getCapacity()) goto L6;
        return this.slots.length - this.slotsGapLen;
    L6:
        return dataAnchorToDataIndex(SlotTableKt.access$slotAnchor($this$slotIndex, address), this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] $this$updateDataIndex, int address, int dataIndex) {
        int anchor$iv = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
        $this$updateDataIndex[(address * 5) + 4] = anchor$iv;
    }

    private final int nodeIndex(int[] $this$nodeIndex, int address) {
        return dataIndex($this$nodeIndex, address);
    }

    private final int auxIndex(int[] $this$auxIndex, int address) {
        int r0 = dataIndex($this$auxIndex, address);
        int value$iv = $this$auxIndex[(address * 5) + 1] >> 29;
        return r0 + Integer.bitCount(value$iv);
    }

    private final List<Integer> dataIndexes(int[] $this$dataIndexes) {
        List it = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List $this$fastMap$iv = CollectionsKt.plus(CollectionsKt.slice(it, RangesKt.until(0, this.groupGapStart)), CollectionsKt.slice(it, RangesKt.until(this.groupGapStart + this.groupGapLen, $this$dataIndexes.length / 5)));
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList($this$fastMap$iv.size());
        int index$iv$iv = 0;
        int r8 = $this$fastMap$iv.size();
    L3:
        if (index$iv$iv >= r8) goto L6;
        Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
        int anchor = ((Number) item$iv$iv).intValue();
        int $i$f$fastMap2 = $i$f$fastMap;
        target$iv.add(Integer.valueOf(dataAnchorToDataIndex(anchor, this.slotsGapLen, this.slots.length)));
        index$iv$iv = index$iv$iv + 1;
        $i$f$fastMap = $i$f$fastMap2;
        goto L3
    L6:
        return target$iv;
    }

    private final List<Integer> keys() {
        List $this$fastFilterIndexed$iv = SlotTableKt.keys$default(this.groups, 0, 1, null);
        List target$iv = new ArrayList($this$fastFilterIndexed$iv.size());
        int index$iv$iv = 0;
        int r9 = $this$fastFilterIndexed$iv.size();
    L3:
        if (index$iv$iv >= r9) goto L15;
        Object item$iv$iv = $this$fastFilterIndexed$iv.get(index$iv$iv);
        int index$iv = index$iv$iv;
        ((Number) item$iv$iv).intValue();
        if (index$iv >= this.groupGapStart) goto L7;
    L10:
        boolean r3 = true;
    L11:
        if (r3 == false) goto L13;
        target$iv.add(item$iv$iv);
    L13:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L7:
        if (index$iv >= (this.groupGapStart + this.groupGapLen)) goto L10;
        r3 = false;
        goto L11
    L15:
        return target$iv;
    }

    private final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        if (index <= gapStart) goto L5;
        return -(((capacity - gapLen) - index) + 1);
    L5:
        return index;
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        if (anchor >= 0) goto L5;
        return ((capacity - gapLen) + anchor) + 1;
    L5:
        return anchor;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        if (index >= gapStart) goto L5;
        return index;
    L5:
        return -((getSize$runtime_release() - index) + 2);
    }

    private final int parentAnchorToIndex(int index) {
        if (index <= (-2)) goto L6;
        return index;
    L6:
        return (getSize$runtime_release() + index) - (-2);
    }
}
