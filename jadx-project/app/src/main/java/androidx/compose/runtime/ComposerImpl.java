package androidx.compose.runtime;

import androidx.collection.IntIntMap;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000û\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b-*\u0001B\b\u0000\u0018\u00002\u00020\u0001:\u0004ç\u0002è\u0002BG\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\n\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002JM\u0010\u0095\u0001\u001a\u00030\u0093\u0001\"\u0005\b\u0000\u0010\u0096\u0001\"\u0005\b\u0001\u0010\u0097\u00012\b\u0010\u0098\u0001\u001a\u0003H\u0096\u00012#\u0010\u0099\u0001\u001a\u001e\u0012\u0005\u0012\u0003H\u0097\u0001\u0012\u0005\u0012\u0003H\u0096\u0001\u0012\u0005\u0012\u00030\u0093\u00010\u009a\u0001¢\u0006\u0003\b\u009b\u0001H\u0016¢\u0006\u0003\u0010\u009c\u0001J\t\u0010\u009d\u0001\u001a\u00020\u0005H\u0016J2\u0010\u009e\u0001\u001a\u0003H\u0097\u0001\"\u0005\b\u0000\u0010\u0097\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u001a2\u000f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0097\u00010 \u0001H\u0087\b¢\u0006\u0003\u0010¡\u0001J\u0015\u0010¢\u0001\u001a\u00020\u001a2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0017J\u0012\u0010¢\u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001aH\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030£\u0001H\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030¤\u0001H\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030¥\u0001H\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030¦\u0001H\u0017J\u0012\u0010¢\u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001eH\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030§\u0001H\u0017J\u0013\u0010¢\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030¨\u0001H\u0017J\u0015\u0010©\u0001\u001a\u00020\u001a2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0017J\u0010\u0010ª\u0001\u001a\u00030\u0093\u0001H\u0000¢\u0006\u0003\b«\u0001J\n\u0010¬\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010\u00ad\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010®\u0001\u001a\u00030\u0093\u0001H\u0016JP\u0010¯\u0001\u001a\u00030\u0093\u00012\u0015\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030\u0081\u00010±\u00012\u0015\u0010²\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0093\u00010 \u0001¢\u0006\u0003\b³\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\bµ\u0001\u0010¶\u0001J$\u0010·\u0001\u001a\u00020\u001e2\u0007\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010¹\u0001\u001a\u00020\u001e2\u0007\u0010º\u0001\u001a\u00020\u001eH\u0002J(\u0010»\u0001\u001a\u0003H\u0097\u0001\"\u0005\b\u0000\u0010\u0097\u00012\u000f\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0097\u00010½\u0001H\u0017¢\u0006\u0003\u0010¾\u0001J\n\u0010¿\u0001\u001a\u00030\u0093\u0001H\u0002J\"\u0010À\u0001\u001a\u00030\u0093\u0001\"\u0005\b\u0000\u0010\u0097\u00012\u000f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0097\u00010 \u0001H\u0016J\t\u0010Â\u0001\u001a\u00020jH\u0002J\u0012\u0010Â\u0001\u001a\u00020j2\u0007\u0010¸\u0001\u001a\u00020\u001eH\u0002J\u0010\u0010Ã\u0001\u001a\u00030\u0093\u0001H\u0000¢\u0006\u0003\bÄ\u0001J\u0013\u0010Å\u0001\u001a\u00030\u0093\u00012\u0007\u0010¢\u0001\u001a\u00020\u001aH\u0017J\n\u0010Æ\u0001\u001a\u00030\u0093\u0001H\u0016J\n\u0010Ç\u0001\u001a\u00030\u0093\u0001H\u0016J\u0010\u0010È\u0001\u001a\u00030\u0093\u0001H\u0000¢\u0006\u0003\bÉ\u0001JF\u0010Ê\u0001\u001a\u00030\u0093\u00012\u0015\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030\u0081\u00010±\u00012\u0017\u0010²\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u00010 \u0001¢\u0006\u0003\b³\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Í\u0001\u001a\u00030\u0093\u00012\u0007\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010Î\u0001\u001a\u00020\u001eH\u0002J\n\u0010Ï\u0001\u001a\u00030\u0093\u0001H\u0016J\u0013\u0010Ð\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ñ\u0001\u001a\u00020\u001aH\u0002J\n\u0010Ò\u0001\u001a\u00030\u0093\u0001H\u0017J\n\u0010Ó\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010Ô\u0001\u001a\u00030\u0093\u0001H\u0017J\n\u0010Õ\u0001\u001a\u00030\u0093\u0001H\u0016J\n\u0010Ö\u0001\u001a\u00030\u0093\u0001H\u0017J\n\u0010×\u0001\u001a\u00030\u0093\u0001H\u0017J\n\u0010Ø\u0001\u001a\u00030\u0093\u0001H\u0017J\n\u0010Ù\u0001\u001a\u00030\u0093\u0001H\u0017J\f\u0010Ú\u0001\u001a\u0005\u0018\u00010Û\u0001H\u0017J\n\u0010Ü\u0001\u001a\u00030\u0093\u0001H\u0016J\b\u0010Ý\u0001\u001a\u00030\u0093\u0001J\n\u0010Þ\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010ß\u0001\u001a\u00030\u0093\u00012\u0007\u0010à\u0001\u001a\u00020\u001eH\u0016J\n\u0010á\u0001\u001a\u00030\u0093\u0001H\u0002J\u001e\u0010â\u0001\u001a\u00030\u0093\u00012\u0007\u0010Ñ\u0001\u001a\u00020\u001a2\t\u0010ã\u0001\u001a\u0004\u0018\u00010nH\u0002J\u001b\u0010ä\u0001\u001a\u00030\u0093\u00012\u0007\u0010å\u0001\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020\u001aH\u0002J\n\u0010æ\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010ç\u0001\u001a\u00030\u0093\u0001H\u0002J\u000e\u0010F\u001a\u00020\u001aH\u0000¢\u0006\u0003\bè\u0001J$\u0010é\u0001\u001a\u00030\u0093\u00012\f\u0010\u0098\u0001\u001a\u0007\u0012\u0002\b\u00030ê\u00012\n\u0010ë\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0017J+\u0010ì\u0001\u001a\u00030\u0093\u00012\u001f\u0010í\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ð\u0001\u0012\u0007\u0012\u0005\u0018\u00010ð\u00010ï\u00010î\u0001H\u0002J+\u0010ñ\u0001\u001a\u00030\u0093\u00012\u001f\u0010í\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ð\u0001\u0012\u0007\u0012\u0005\u0018\u00010ð\u00010ï\u00010î\u0001H\u0017J\u0012\u0010ò\u0001\u001a\u00020\u001e2\u0007\u0010ó\u0001\u001a\u00020\u001eH\u0002J;\u0010ô\u0001\u001a\u00030\u0093\u00012\u0011\u0010²\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010ê\u00012\u0007\u0010õ\u0001\u001a\u00020j2\n\u0010ë\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010ö\u0001\u001a\u00020\u001aH\u0002J\"\u0010÷\u0001\u001a\u00030\u0081\u00012\n\u0010ø\u0001\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010ù\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0017J\f\u0010ú\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0001J\f\u0010û\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0001J-\u0010ü\u0001\u001a\u00020\u001e2\u0007\u0010ý\u0001\u001a\u00020\u001e2\u0007\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010¹\u0001\u001a\u00020\u001e2\u0007\u0010þ\u0001\u001a\u00020\u001eH\u0002J\u000f\u0010ÿ\u0001\u001a\u00020\u001eH\u0001¢\u0006\u0003\b\u0080\u0002J!\u0010\u0081\u0002\u001a\u00030\u0093\u00012\u000f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010 \u0001H\u0000¢\u0006\u0003\b\u0082\u0002J\u0012\u0010\u0083\u0002\u001a\u00020\u001e2\u0007\u0010¸\u0001\u001a\u00020\u001eH\u0002J8\u0010\u0084\u0002\u001a\u00020\u001a2\u0015\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030\u0081\u00010±\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002Jp\u0010\u0087\u0002\u001a\u0003H\u0088\u0002\"\u0005\b\u0000\u0010\u0088\u00022\u000b\b\u0002\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u000f2\u000b\b\u0002\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000f2\u000b\b\u0002\u0010ó\u0001\u001a\u0004\u0018\u00010\u001e2\u001f\b\u0002\u0010\\\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u000206\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010ï\u00010î\u00012\u000f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00020 \u0001H\u0002¢\u0006\u0003\u0010\u008b\u0002J\n\u0010\u008c\u0002\u001a\u00030\u0093\u0001H\u0002J\n\u0010\u008d\u0002\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u008e\u0002\u001a\u00030\u0093\u00012\u0007\u0010\u008f\u0002\u001a\u00020NH\u0002J\u0013\u0010\u0090\u0002\u001a\u00030\u0093\u00012\u0007\u0010\u0091\u0002\u001a\u00020jH\u0002J\u001b\u0010\u0092\u0002\u001a\u00030\u0093\u00012\u000f\u0010\u0093\u0002\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010 \u0001H\u0016J%\u0010\u0094\u0002\u001a\u00030\u0093\u00012\u0007\u0010\u0095\u0002\u001a\u00020\u001e2\u0007\u0010\u0096\u0002\u001a\u00020\u001e2\u0007\u0010\u0097\u0002\u001a\u00020\u001eH\u0002J\u0013\u0010\u0098\u0002\u001a\u00030\u0093\u00012\u0007\u0010\u0099\u0002\u001a\u00020}H\u0016J\u000b\u0010\u009a\u0002\u001a\u0004\u0018\u00010NH\u0002J\f\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\n\u0010\u009c\u0002\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u009d\u0002\u001a\u00030\u0093\u00012\u0007\u0010\u009e\u0002\u001a\u00020\u001eH\u0002J\u001b\u0010\u009f\u0002\u001a\u00020\u001a2\u0007\u0010 \u0002\u001a\u00020\u001a2\u0007\u0010¡\u0002\u001a\u00020\u001eH\u0017J\n\u0010¢\u0002\u001a\u00030\u0093\u0001H\u0017J\n\u0010£\u0002\u001a\u00030\u0093\u0001H\u0002J\n\u0010¤\u0002\u001a\u00030\u0093\u0001H\u0002J\n\u0010¥\u0002\u001a\u00030\u0093\u0001H\u0017J\u0014\u0010¦\u0002\u001a\u00030\u0093\u00012\b\u0010¦\u0002\u001a\u00030§\u0002H\u0017J\n\u0010¨\u0002\u001a\u00030\u0093\u0001H\u0017J\u001d\u0010©\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001e2\b\u0010¦\u0002\u001a\u00030§\u0002H\u0017J\u000f\u0010ª\u0002\u001a\u00020\u001eH\u0000¢\u0006\u0003\b«\u0002JA\u0010¬\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001e2\n\u0010\u00ad\u0002\u001a\u0005\u0018\u00010\u0081\u00012\b\u0010®\u0002\u001a\u00030¯\u00022\n\u0010°\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b±\u0002\u0010²\u0002J\n\u0010³\u0002\u001a\u00030\u0093\u0001H\u0017J\u0013\u0010´\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001eH\u0002J\u001f\u0010´\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001e2\n\u0010µ\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\u001f\u0010¶\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001e2\n\u0010µ\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0017J\n\u0010·\u0002\u001a\u00030\u0093\u0001H\u0016J\u0018\u0010¸\u0002\u001a\u00030\u0093\u00012\f\u0010\u0098\u0001\u001a\u0007\u0012\u0002\b\u00030¹\u0002H\u0017J'\u0010º\u0002\u001a\u00030\u0093\u00012\u0015\u0010»\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030¹\u00020¼\u0002H\u0017¢\u0006\u0003\u0010½\u0002J\u001f\u0010¾\u0002\u001a\u00030\u0093\u00012\u0007\u0010Ñ\u0001\u001a\u00020\u001a2\n\u0010°\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\u0013\u0010¿\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001eH\u0017J\u0013\u0010À\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001eH\u0017J\u0012\u0010Á\u0002\u001a\u00020\u00012\u0007\u0010¼\u0001\u001a\u00020\u001eH\u0017J\u001f\u0010Â\u0002\u001a\u00030\u0093\u00012\u0007\u0010¼\u0001\u001a\u00020\u001e2\n\u0010µ\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\n\u0010Ã\u0002\u001a\u00030\u0093\u0001H\u0016J\b\u0010Ä\u0002\u001a\u00030\u0093\u0001J\n\u0010Å\u0002\u001a\u00030\u0093\u0001H\u0002J$\u0010Æ\u0002\u001a\u00020\u001a2\u0007\u0010\u0099\u0002\u001a\u0002062\n\u0010Ç\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0003\bÈ\u0002J\u0016\u0010É\u0002\u001a\u00030\u0093\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0001J+\u0010Ê\u0002\u001a\u00030\u0093\u00012\u0015\u0010°\u0001\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030\u0081\u00010±\u0001ø\u0001\u0000¢\u0006\u0006\bË\u0002\u0010Ì\u0002J4\u0010Í\u0002\u001a\u00030\u0093\u00012\u0007\u0010Î\u0002\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001e2\n\u0010µ\u0002\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010°\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0082\bJ\u001c\u0010Ï\u0002\u001a\u00030\u0093\u00012\u0007\u0010Ð\u0002\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001eH\u0082\bJ4\u0010Ñ\u0002\u001a\u00030\u0093\u00012\u0007\u0010Î\u0002\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001e2\n\u0010µ\u0002\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010°\u0002\u001a\u0005\u0018\u00010\u0081\u0001H\u0082\bJ\u001c\u0010Ò\u0002\u001a\u00030\u0093\u00012\u0007\u0010Î\u0002\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001eH\u0082\bJ\u001c\u0010Ó\u0002\u001a\u00030\u0093\u00012\u0007\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010Ô\u0002\u001a\u00020\u001eH\u0002J\u001c\u0010Õ\u0002\u001a\u00030\u0093\u00012\u0007\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010Ö\u0002\u001a\u00020\u001eH\u0002J\u001b\u0010×\u0002\u001a\u00020j2\u0007\u0010Ø\u0002\u001a\u00020j2\u0007\u0010Ù\u0002\u001a\u00020jH\u0002J\u0016\u0010Ú\u0002\u001a\u00030\u0093\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\u0016\u0010Û\u0002\u001a\u00030\u0093\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\u0016\u0010Ü\u0002\u001a\u00030\u0093\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0001J\u0012\u0010Ý\u0002\u001a\u00020\u001e2\u0007\u0010¸\u0001\u001a\u00020\u001eH\u0002J\n\u0010Þ\u0002\u001a\u00030\u0093\u0001H\u0016J\n\u0010ß\u0002\u001a\u00030\u0093\u0001H\u0002J\n\u0010à\u0002\u001a\u00030\u0093\u0001H\u0002J\u0010\u0010á\u0002\u001a\u00030\u0093\u0001H\u0000¢\u0006\u0003\bâ\u0002J1\u0010ã\u0002\u001a\u0003H\u0088\u0002\"\u0005\b\u0000\u0010\u0088\u00022\u0006\u0010v\u001a\u00020w2\u000f\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00020 \u0001H\u0082\b¢\u0006\u0003\u0010ä\u0002J\u0016\u0010å\u0002\u001a\u00020\u001e*\u00020w2\u0007\u0010¸\u0001\u001a\u00020\u001eH\u0002J\u0019\u0010æ\u0002\u001a\u0005\u0018\u00010\u0081\u0001*\u00020w2\u0007\u0010ó\u0001\u001a\u00020\u001eH\u0002R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010+\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010 R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0016\u00105\u001a\u0004\u0018\u0001068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\f\u0012\u0004\b:\u0010-\u001a\u0004\b;\u0010\u001cR\u001c\u0010<\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0010\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0004\n\u0002\u0010CR\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010I\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001cR\u0014\u0010K\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001cR\u000e\u0010M\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR&\u0010V\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010-\u001a\u0004\bX\u0010\u001cR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u0002060ZX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010[R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010_\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u001cR\u001e\u0010a\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u001cR\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020jX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u0004\u0018\u00010nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010n0ZX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010[R\u0010\u0010p\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010q\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u00020wX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0016\u0010|\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001a\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u000f\u0010\u0084\u0001\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0088\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010-\u001a\u0005\b\u008a\u0001\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008c\u0001\u001a\u00030\u008d\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0081\u0001*\u00020w8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006é\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/ControlledComposition;)V", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "deferredChanges", "getDeferredChanges$runtime_release", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "derivedStateObserver", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "invalidations", "", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "nodeExpected", "nodeIndex", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentStateStack", "pausable", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "providerCache", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "rGroupIndex", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime_release", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime_release", "(Landroidx/compose/runtime/SlotReader;)V", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "skipping", "getSkipping$annotations", "getSkipping", "sourceMarkersEnabled", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "", "addRecomposeScope", "apply", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changedInstance", "changesApplied", "changesApplied$runtime_release", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/ScopeMap;", "content", "Landroidx/compose/runtime/Composable;", "shouldPause", "composeContent--ZbOJvo$runtime_release", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "deactivate", "deactivate$runtime_release", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "dispose", "dispose$runtime_release", "doCompose", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProvider", "endProviders", "endReplaceGroup", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endReuseFromRoot", "endRoot", "endToMarker", "marker", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceFreshInsertTable", "forceRecomposeScopes$runtime_release", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentGuarded", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "insertedGroupVirtualIndex", "index", "invokeMovableContentLambda", "locals", "force", "joinKey", "left", "right", "nextSlot", "nextSlotForCache", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime_release", "prepareCompose", "prepareCompose$runtime_release", "rGroupIndexOf", "recompose", "recompose-aFTiNEg$runtime_release", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "recomposeMovableContent", "R", "from", "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "recordDelete", "recordInsert", "anchor", "recordProviderUpdate", "providers", "recordSideEffect", "effect", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "rememberObserverAnchor", "rememberedValue", "reportAllMovableContent", "reportFreeMovableContent", "groupBeingRemoved", "shouldExecute", "parametersChanged", "flags", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "stacksSize", "stacksSize$runtime_release", "start", "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "data", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startReuseFromRoot", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateComposerInvalidations", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "count", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateSlot", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "verifyConsistent", "verifyConsistent$runtime_release", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposerImpl implements Composer {
    public static final int $stable = 0;
    private CompositionData _compositionData;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private ChangeList deferredChanges;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final ArrayList<T> invalidateStack;
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionContext parentContext;
    private PersistentCompositionLocalMap parentProvider;
    private final IntStack parentStateStack;
    private boolean pausable;
    private Pending pending;
    private final ArrayList<T> pendingStack;
    private PersistentCompositionLocalMap providerCache;
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        public static final int $stable = 0;
        private final CompositionContextImpl ref;

        static {
            $stable = 8;
        }

        public CompositionContextHolder(CompositionContextImpl ref) {
            this.ref = ref;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ*\u00102\u001a\u0002032\u0006\u0010\u0014\u001a\u0002042\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020306¢\u0006\u0002\b7H\u0010¢\u0006\u0004\b8\u00109J8\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0014\u001a\u0002042\u0006\u0010=\u001a\u00020>2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020306¢\u0006\u0002\b7H\u0010¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0010¢\u0006\u0002\bDJ\u0006\u0010E\u001a\u000203J\r\u0010F\u001a\u000203H\u0010¢\u0006\u0002\bGJ\r\u0010\u001b\u001a\u00020\u0019H\u0010¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0010¢\u0006\u0002\bJJ\u0015\u0010K\u001a\u0002032\u0006\u0010\u0014\u001a\u000204H\u0010¢\u0006\u0002\bLJ\u0015\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020<H\u0010¢\u0006\u0002\bOJ)\u0010P\u001a\u0002032\u0006\u0010B\u001a\u00020C2\u0006\u0010Q\u001a\u00020R2\n\u0010S\u001a\u0006\u0012\u0002\b\u00030TH\u0010¢\u0006\u0002\bUJ\u0017\u0010V\u001a\u0004\u0018\u00010R2\u0006\u0010B\u001a\u00020CH\u0010¢\u0006\u0002\bWJ1\u0010X\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0014\u001a\u0002042\u0006\u0010=\u001a\u00020>2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020<0;H\u0010¢\u0006\u0002\bZJ\u001b\u0010[\u001a\u0002032\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020(0\u0010H\u0010¢\u0006\u0002\b]J\u0015\u0010^\u001a\u0002032\u0006\u0010_\u001a\u00020`H\u0010¢\u0006\u0002\baJ\u0015\u0010b\u001a\u0002032\u0006\u0010\u0014\u001a\u000204H\u0010¢\u0006\u0002\bcJ\u0015\u0010d\u001a\u0002032\u0006\u0010N\u001a\u00020<H\u0010¢\u0006\u0002\beJ\u0015\u0010f\u001a\u0002032\u0006\u0010\u0014\u001a\u000204H\u0010¢\u0006\u0002\bgJ\r\u0010h\u001a\u000203H\u0010¢\u0006\u0002\biJ\u0015\u0010j\u001a\u0002032\u0006\u0010_\u001a\u00020`H\u0010¢\u0006\u0002\bkJ\u0015\u0010l\u001a\u0002032\u0006\u0010\u0014\u001a\u000204H\u0010¢\u0006\u0002\bmJ\u000e\u0010n\u001a\u0002032\u0006\u0010N\u001a\u00020\u0019R\u0014\u0010\n\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R(\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0010\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010+R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020$8PX\u0090\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b1\u0010&¨\u0006o"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "collectingSourceInformation", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "collectingCallByInformation", "getCollectingCallByInformation$runtime_release", "()Z", "getCollectingParameterInformation$runtime_release", "getCollectingSourceInformation$runtime_release", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "composition", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "<set-?>", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitialPaused", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "applier", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recomposePaused", "invalidScopes", "recomposePaused$runtime_release", "recordInspectionTable", "table", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "reportPausedScope", "reportPausedScope$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final Set<ComposerImpl> composers;
        private final MutableState compositionLocalScope$delegate;
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;
        final /* synthetic */ ComposerImpl this$0;

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        public CompositionContextImpl(ComposerImpl this$0, int compoundHashKey, boolean collectingParameterInformation, boolean collectingSourceInformation, CompositionObserverHolder observerHolder) {
            this.this$0 = this$0;
            this.compoundHashKey = compoundHashKey;
            this.collectingParameterInformation = collectingParameterInformation;
            this.collectingSourceInformation = collectingSourceInformation;
            this.observerHolder = observerHolder;
            this.composers = new LinkedHashSet();
            this.compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(Set<Set<CompositionData>> r1) {
            this.inspectionTables = r1;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime_release() {
            return ComposerImpl.access$getParentContext$p(this.this$0).getCollectingCallByInformation$runtime_release();
        }

        public final void dispose() {
            if (this.composers.isEmpty() == true) goto L18;
            Set<Set<CompositionData>> r0 = this.inspectionTables;
            if (r0 == null) goto L14;
            Iterator<ComposerImpl> r2 = this.composers.iterator();
        L8:
            if (r2.hasNext() == false) goto L14;
            ComposerImpl composer = r2.next();
            Iterator<Set<CompositionData>> r4 = r0.iterator();
        L11:
            if (r4.hasNext() == false) goto L8;
            r4.next().remove(ComposerImpl.access$getSlotTable$p(composer));
        L14:
            this.composers.clear();
            return;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Iterable r0 = this.inspectionTables;
            if (r0 == null) goto L9;
            Iterable $this$forEach$iv = r0;
            Iterator r2 = $this$forEach$iv.iterator();
        L6:
            if (r2.hasNext() == false) goto L9;
            Object element$iv = r2.next();
            Set it = (Set) element$iv;
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            it.remove(ComposerImpl.access$getSlotTable$p((ComposerImpl) composer));
        L9:
            Iterable $this$forEach$iv2 = this.composers;
            TypeIntrinsics.asMutableCollection((Collection) $this$forEach$iv2).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            ComposerImpl.access$getParentContext$p(this.this$0).registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            ComposerImpl.access$getParentContext$p(this.this$0).unregisterComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime_release(RecomposeScopeImpl scope) {
            ComposerImpl.access$getParentContext$p(this.this$0).reportPausedScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.access$getParentContext$p(this.this$0).getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(this.this$0.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> r3) {
            ComposerImpl.access$getParentContext$p(this.this$0).composeInitial$runtime_release(composition, r3);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(ControlledComposition composition, ShouldPauseCallback shouldPause, Function2<? super Composer, ? super Integer, Unit> r4) {
            return ComposerImpl.access$getParentContext$p(this.this$0).composeInitialPaused$runtime_release(composition, shouldPause, r4);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(ControlledComposition composition, ShouldPauseCallback shouldPause, ScatterSet<RecomposeScopeImpl> r4) {
            return ComposerImpl.access$getParentContext$p(this.this$0).recomposePaused$runtime_release(composition, shouldPause, r4);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            ComposerImpl.access$getParentContext$p(this.this$0).invalidate$runtime_release(this.this$0.getComposition());
            ComposerImpl.access$getParentContext$p(this.this$0).invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            ComposerImpl.access$getParentContext$p(this.this$0).invalidateScope$runtime_release(scope);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            State $this$getValue$iv = this.compositionLocalScope$delegate;
            return (PersistentCompositionLocalMap) $this$getValue$iv.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap r4) {
            MutableState $this$setValue$iv = this.compositionLocalScope$delegate;
            $this$setValue$iv.setValue(r4);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap scope) {
            setCompositionLocalScope(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> r5) {
            HashSet r0 = this.inspectionTables;
            if (r0 != null) goto L5;
            HashSet it = new HashSet();
            this.inspectionTables = it;
            r0 = it;
        L5:
            r0.add(r5);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl r0 = this.this$0;
            ComposerImpl.access$setChildrenComposing$p(r0, ComposerImpl.access$getChildrenComposing$p(r0) + 1);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl r0 = this.this$0;
            ComposerImpl.access$setChildrenComposing$p(r0, ComposerImpl.access$getChildrenComposing$p(r0) - 1);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            ComposerImpl.access$getParentContext$p(this.this$0).insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            ComposerImpl.access$getParentContext$p(this.this$0).deletedMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            return ComposerImpl.access$getParentContext$p(this.this$0).movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data, Applier<?> r4) {
            ComposerImpl.access$getParentContext$p(this.this$0).movableContentStateReleased$runtime_release(reference, data, r4);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
            ComposerImpl.access$getParentContext$p(this.this$0).reportRemovedComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public Composition getComposition$runtime_release() {
            return this.this$0.getComposition();
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> r8, CompositionContext parentContext, SlotTable slotTable, Set<RememberObserver> r11, ChangeList changes, ChangeList lateChanges, ControlledComposition composition) {
        this.applier = r8;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = r11;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = Stack.m3793constructorimpl$default(null, 1, null);
        this.parentStateStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        if (this.parentContext.getCollectingSourceInformation$runtime_release() == false) goto L5;
    L8:
        boolean r2 = true;
    L9:
        this.sourceMarkersEnabled = r2;
        this.derivedStateObserver = new ComposerImpl$derivedStateObserver$1(this);
        this.invalidateStack = Stack.m3793constructorimpl$default(null, 1, null);
        SlotReader it = this.slotTable.openReader();
        it.close();
        this.reader = it;
        SlotTable $this$insertTable_u24lambda_u241 = new SlotTable();
        if (this.parentContext.getCollectingSourceInformation$runtime_release() == false) goto L13;
        $this$insertTable_u24lambda_u241.collectSourceInformation();
    L13:
        if (this.parentContext.getCollectingCallByInformation$runtime_release() == false) goto L15;
        $this$insertTable_u24lambda_u241.collectCalledByInformation();
    L15:
        this.insertTable = $this$insertTable_u24lambda_u241;
        SlotWriter it2 = this.insertTable.openWriter();
        it2.close(true);
        this.writer = it2;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotTable this_$iv = this.insertTable;
        SlotReader reader$iv = this_$iv.openReader();
        Anchor r3 = reader$iv.anchor(0);     // Catch: Throwable -> L19
        reader$iv.close();
        this.insertAnchor = r3;
        this.insertFixups = new FixupList();
        return;
    L19:
        th = move-exception;
        reader$iv.close();
        throw th;
    L5:
        if (this.parentContext.getCollectingCallByInformation$runtime_release() == true) goto L8;
        r2 = false;
        goto L9
    }

    public static final /* synthetic */ ComposerChangeListWriter access$getChangeListWriter$p(ComposerImpl $this) {
        return $this.changeListWriter;
    }

    public static final /* synthetic */ int access$getChildrenComposing$p(ComposerImpl $this) {
        return $this.childrenComposing;
    }

    public static final /* synthetic */ int[] access$getNodeCountOverrides$p(ComposerImpl $this) {
        return $this.nodeCountOverrides;
    }

    public static final /* synthetic */ CompositionContext access$getParentContext$p(ComposerImpl $this) {
        return $this.parentContext;
    }

    public static final /* synthetic */ MutableIntObjectMap access$getProviderUpdates$p(ComposerImpl $this) {
        return $this.providerUpdates;
    }

    public static final /* synthetic */ SlotTable access$getSlotTable$p(ComposerImpl $this) {
        return $this.slotTable;
    }

    public static final /* synthetic */ void access$invokeMovableContentLambda(ComposerImpl $this, MovableContent content, PersistentCompositionLocalMap locals, Object parameter, boolean force) {
        $this.invokeMovableContentLambda(content, locals, parameter, force);
    }

    public static final /* synthetic */ void access$setChildrenComposing$p(ComposerImpl $this, int r1) {
        $this.childrenComposing = r1;
    }

    public static final /* synthetic */ void access$setNodeCountOverrides$p(ComposerImpl $this, int[] r1) {
        $this.nodeCountOverrides = r1;
    }

    public static final /* synthetic */ void access$setProviderUpdates$p(ComposerImpl $this, MutableIntObjectMap r1) {
        $this.providerUpdates = r1;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        if (this.childrenComposing <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    public final void setReader$runtime_release(SlotReader r1) {
        this.reader = r1;
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime_release(SlotTable r1) {
        this.insertTable = r1;
    }

    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime_release(ChangeList r1) {
        this.deferredChanges = r1;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        m3748startBaiHCIY(key, null, GroupKind.Companion.m3762getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int key) {
        Pending pending = this.pending;
        if (pending == null) goto L6;
        m3748startBaiHCIY(key, null, GroupKind.Companion.m3762getGroupULZAiWs(), null);
        return;
    L6:
        validateNodeNotExpected();
        int rGroupIndex$iv = this.rGroupIndex;
        int $this$rol$iv$iv$iv = getCompoundKeyHash();
        int $this$rol$iv$iv$iv2 = Integer.rotateLeft($this$rol$iv$iv$iv, 3) ^ key;
        int $this$rol$iv$iv$iv3 = Integer.rotateLeft($this$rol$iv$iv$iv2, 3) ^ rGroupIndex$iv;
        this.compoundKeyHash = $this$rol$iv$iv$iv3;
        int rGroupIndex$iv2 = this.rGroupIndex;
        this.rGroupIndex = rGroupIndex$iv2 + 1;
        SlotReader reader = this.reader;
        if (getInserting() == false) goto L10;
        reader.beginEmpty();
        this.writer.startGroup(key, Composer.Companion.getEmpty());
        enterGroup(false, null);
        return;
    L10:
        int slotKey = reader.getGroupKey();
        if (slotKey != key) goto L17;
        if (reader.getHasObjectKey() == true) goto L17;
        reader.startGroup();
        enterGroup(false, null);
        return;
    L17:
        if (reader.isGroupEnd() == true) goto L19;
        int removeIndex = this.nodeIndex;
        int startSlot = reader.getCurrentGroup();
        recordDelete();
        int nodesToRemove = reader.skipGroup();
        this.changeListWriter.removeNode(removeIndex, nodesToRemove);
        ComposerKt.access$removeRange(this.invalidations, startSlot, reader.getCurrentGroup());
    L19:
        reader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter writer = this.writer;
        writer.beginInsert();
        int startIndex = writer.getCurrentGroup();
        writer.startGroup(key, Composer.Companion.getEmpty());
        this.insertAnchor = writer.anchor(startIndex);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m3748startBaiHCIY(-127, null, GroupKind.Companion.m3762getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl scope = getCurrentRecomposeScope$runtime_release();
        if (scope != null) goto L5;
        return;
    L5:
        if (scope.getUsed() == false) goto L9;
        scope.setDefaultsInScope(true);
        return;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (getSkipping() == true) goto L5;
        return true;
    L5:
        if (this.providersInvalid == true) goto L17;
        RecomposeScopeImpl r0 = getCurrentRecomposeScope$runtime_release();
        if (r0 != null) goto L9;
    L11:
        boolean r1 = false;
    L12:
        if (r1 == false) goto L15;
        return true;
    L15:
        return false;
    L9:
        if (r0.getDefaultsInvalid() != true) goto L11;
        r1 = true;
        goto L12
    L17:
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, Object dataKey) {
        m3748startBaiHCIY(key, dataKey, GroupKind.Companion.m3762getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (this.forceRecomposeScopes == true) goto L6;
        this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
    L6:
        if (this.sourceMarkersEnabled == true) goto L8;
        this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
    L8:
        Set<CompositionData> r0 = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (r0 == null) goto L11;
        r0.add(getCompositionData());
        this.parentContext.recordInspectionTable$runtime_release(r0);
    L11:
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop());
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m3791clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (this.reader.getClosed() == true) goto L6;
        this.reader.close();
    L6:
        if (this.writer.getClosed() == true) goto L9;
        forceFreshInsertTable();
        return;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (getInserting() == false) goto L5;
        return false;
    L5:
        if (this.reusing == false) goto L7;
        return false;
    L7:
        if (this.providersInvalid == true) goto L22;
        RecomposeScopeImpl r0 = getCurrentRecomposeScope$runtime_release();
        if (r0 != null) goto L11;
    L13:
        boolean r1 = false;
    L14:
        if (r1 == true) goto L16;
        return false;
    L16:
        if (this.forciblyRecompose == false) goto L19;
        return false;
    L19:
        return true;
    L11:
        if (r0.getRequiresRecompose() == true) goto L13;
        r1 = true;
        goto L14
    L22:
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    public final void dispose$runtime_release() {
        Object token$iv = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        this.parentContext.unregisterComposer$runtime_release(this);     // Catch: Throwable -> L6
        deactivate$runtime_release();     // Catch: Throwable -> L6
        getApplier().clear();     // Catch: Throwable -> L6
        this.isDisposed = true;     // Catch: Throwable -> L6
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L6
        Trace.INSTANCE.endSection(token$iv);
        return;
    L6:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv);
        throw th;
    }

    public final void deactivate$runtime_release() {
        Stack.m3791clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes == true) goto L5;
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    L5:
        return false;
    }

    private final void startGroup(int key) {
        m3748startBaiHCIY(key, null, GroupKind.Companion.m3762getGroupULZAiWs(), null);
    }

    private final void startGroup(int key, Object dataKey) {
        m3748startBaiHCIY(key, dataKey, GroupKind.Companion.m3762getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m3748startBaiHCIY(125, null, GroupKind.Companion.m3763getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m3748startBaiHCIY(125, null, GroupKind.Companion.m3764getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(Function0<? extends T> r4) {
        validateNodeExpected();
        boolean value$iv = getInserting();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
    L5:
        int insertIndex = this.parentStateStack.peek();
        Anchor groupAnchor = this.writer.anchor(this.writer.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(r4, insertIndex, groupAnchor);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        boolean value$iv = !getInserting();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
    L5:
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing == true) goto L8;
        return;
    L8:
        if ((node instanceof ComposeNodeLifecycleCallback) == false) goto L12;
        this.changeListWriter.useNode(node);
        return;
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (getInserting() == false) goto L5;
    L11:
        m3748startBaiHCIY(key, null, GroupKind.Companion.m3762getGroupULZAiWs(), dataKey);
        return;
    L5:
        if (this.reader.getGroupKey() != key) goto L11;
        if (Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) == true) goto L11;
        if (this.reusingGroup >= 0) goto L11;
        this.reusingGroup = this.reader.getCurrentGroup();
        this.reusing = true;
        goto L11
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing == true) goto L5;
    L7:
        end(false);
        return;
    L5:
        if (this.reader.getParent() != this.reusingGroup) goto L7;
        this.reusingGroup = -1;
        this.reusing = false;
        goto L7
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        if (this.reusingGroup < 0) goto L5;
        boolean r0 = true;
    L6:
        this.reusing = r0;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void endReuseFromRoot() {
        if (this.isComposing == false) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
    L11:
        this.reusingGroup = -1;
        this.reusing = false;
        return;
    L5:
        if (this.reusingGroup != 100) goto L7;
        value$iv = true;
        goto L9
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        if (getInserting() == false) goto L6;
        return -this.writer.getParent();
    L6:
        return this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker >= 0) goto L8;
        int writerLocation = -marker;
        SlotWriter writer = this.writer;
    L4:
        int parent = writer.getParent();
        if (parent <= writerLocation) goto L17;
        end(writer.isNode(parent));
        goto L4
    L17:
        return;
    L8:
        if (getInserting() == false) goto L13;
        SlotWriter writer2 = this.writer;
    L11:
        if (getInserting() == false) goto L13;
        end(writer2.isNode(writer2.getParent()));
    L13:
        SlotReader reader = this.reader;
    L14:
        int parent2 = reader.getParent();
        if (parent2 <= marker) goto L21;
        end(reader.isNode(parent2));
        goto L14
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V r2, Function2<? super T, ? super V, Unit> r3) {
        if (getInserting() == false) goto L5;
        this.insertFixups.updateNode(r2, r3);
        return;
    L5:
        this.changeListWriter.updateNode(r2, r3);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object left, Object right) {
        Object r0 = ComposerKt.access$getKey(this.reader.getGroupObjectKey(), left, right);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new JoinedKey(left, right);
    }

    public final Object nextSlot() {
        if (getInserting() == false) goto L5;
        validateNodeNotExpected();
        return Composer.Companion.getEmpty();
    L5:
        Object it = this.reader.next();
        if (this.reusing == true) goto L8;
        return it;
    L8:
        if ((it instanceof ReusableRememberObserver) == false) goto L12;
        return it;
    L12:
        return Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting() == false) goto L5;
        validateNodeNotExpected();
        return Composer.Companion.getEmpty();
    L5:
        Object it = this.reader.next();
        if (this.reusing == false) goto L11;
        if ((it instanceof ReusableRememberObserver) == true) goto L11;
        return Composer.Companion.getEmpty();
    L11:
        if ((it instanceof RememberObserverHolder) == true) goto L15;
        return it;
    L15:
        return ((RememberObserverHolder) it).getWrapped();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object value) {
        if (Intrinsics.areEqual(nextSlot(), value) == true) goto L5;
        updateValue(value);
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object value) {
        if (nextSlot() == value) goto L5;
        updateValue(value);
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object next = nextSlot();
        if ((next instanceof Character) == false) goto L8;
        char nextPrimitive = ((Character) next).charValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object next = nextSlot();
        if ((next instanceof Byte) == false) goto L8;
        byte nextPrimitive = ((Number) next).byteValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object next = nextSlot();
        if ((next instanceof Short) == false) goto L8;
        short nextPrimitive = ((Number) next).shortValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object next = nextSlot();
        if ((next instanceof Boolean) == false) goto L8;
        boolean nextPrimitive = ((Boolean) next).booleanValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object next = nextSlot();
        if ((next instanceof Float) == false) goto L10;
        float nextPrimitive = ((Number) next).floatValue();
        if (value != nextPrimitive) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L10;
        return false;
    L7:
        r3 = false;
    L10:
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object next = nextSlot();
        if ((next instanceof Long) == false) goto L8;
        long nextPrimitive = ((Number) next).longValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object next = nextSlot();
        if ((next instanceof Double) == false) goto L10;
        double nextPrimitive = ((Number) next).doubleValue();
        if (value != nextPrimitive) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L10;
        return false;
    L7:
        r1 = false;
    L10:
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object next = nextSlot();
        if ((next instanceof Integer) == false) goto L8;
        int nextPrimitive = ((Number) next).intValue();
        if (value != nextPrimitive) goto L8;
        return false;
    L8:
        updateValue(Integer.valueOf(value));
        return true;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean r4, Function0<? extends T> r5) {
        T r1 = (T) nextSlotForCache();
        if (r1 == Composer.Companion.getEmpty()) goto L5;
        if (r4 == true) goto L5;
        return r1;
    L5:
        T r2 = r5.invoke();
        updateCachedValue(r2);
        return r2;
    }

    private final void updateSlot(Object value) {
        nextSlot();
        updateValue(value);
    }

    public final void updateValue(Object value) {
        if (getInserting() == false) goto L6;
        this.writer.update(value);
        return;
    L6:
        if (this.reader.getHadNext() == false) goto L11;
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        boolean r1 = this.changeListWriter.getPastParent();
        ComposerChangeListWriter r2 = this.changeListWriter;
        if (r1 == false) goto L10;
        r2.updateAnchoredValue(value, this.reader.anchor(this.reader.getParent()), groupSlotIndex);
        return;
    L10:
        r2.updateValue(value, groupSlotIndex);
        return;
    L11:
        this.changeListWriter.appendValue(this.reader.anchor(this.reader.getParent()), value);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void updateCachedValue(Object r4) {
        if ((r4 instanceof RememberObserver) == false) goto L8;
        RememberObserverHolder r0 = new RememberObserverHolder((RememberObserver) r4, rememberObserverAnchor());
        if (getInserting() == false) goto L7;
        this.changeListWriter.remember(r0);
    L7:
        this.abandonSet.add(r4);
        Object r1 = r0;
    L9:
        updateValue(r1);
        return;
    L8:
        r1 = r4;
        goto L9
    }

    private final Anchor rememberObserverAnchor() {
        if (getInserting() == false) goto L14;
        if (ComposerKt.isAfterFirstChild(this.writer) == false) goto L28;
        int group = this.writer.getCurrentGroup() - 1;
        int parent = this.writer.parent(group);
    L8:
        if (parent == this.writer.getParent()) goto L22;
        if (parent < 0) goto L22;
        group = parent;
        parent = this.writer.parent(group);
    L22:
        return this.writer.anchor(group);
    L28:
        return null;
    L14:
        if (ComposerKt.isAfterFirstChild(this.reader) == false) goto L29;
        int group2 = this.reader.getCurrentGroup() - 1;
        int parent2 = this.reader.parent(group2);
    L17:
        if (parent2 == this.reader.getParent()) goto L27;
        if (parent2 < 0) goto L27;
        group2 = parent2;
        parent2 = this.reader.parent(group2);
    L27:
        return this.reader.anchor(group2);
    L29:
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        CompositionData data = this._compositionData;
        if (data != null) goto L6;
        CompositionDataImpl newData = new CompositionDataImpl(getComposition());
        this._compositionData = newData;
        return newData;
    L6:
        return data;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0<Unit> r2) {
        this.changeListWriter.sideEffect(r2);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap it = this.providerCache;
        if (it == null) goto L7;
        return it;
    L7:
        return currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int group) {
        if (getInserting() == false) goto L16;
        if (this.writerHasAProvider == false) goto L16;
        int current = this.writer.getParent();
    L7:
        if (current <= 0) goto L16;
        if (this.writer.groupKey(current) != 202) goto L14;
        if (Intrinsics.areEqual(this.writer.groupObjectKey(current), ComposerKt.getCompositionLocalMap()) == false) goto L14;
        Object r2 = this.writer.groupAux(current);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
        PersistentCompositionLocalMap providers = (PersistentCompositionLocalMap) r2;
        this.providerCache = providers;
        return providers;
    L14:
        current = this.writer.parent(current);
    L16:
        if (this.reader.getSize() <= 0) goto L31;
        int current2 = group;
    L18:
        if (current2 <= 0) goto L31;
        if (this.reader.groupKey(current2) != 202) goto L30;
        if (Intrinsics.areEqual(this.reader.groupObjectKey(current2), ComposerKt.getCompositionLocalMap()) == false) goto L30;
        MutableIntObjectMap<PersistentCompositionLocalMap> r3 = this.providerUpdates;
        if (r3 == null) goto L27;
        PersistentCompositionLocalMap providers2 = r3.get(current2);
        if (providers2 == null) goto L27;
    L28:
        this.providerCache = providers2;
        return providers2;
    L27:
        Object r4 = this.reader.groupAux(current2);
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
        providers2 = (PersistentCompositionLocalMap) r4;
    L30:
        current2 = this.reader.parent(current2);
    L31:
        this.providerCache = this.parentProvider;
        return this.parentProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> r2 = parentScope.builder();
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> it = r2;
        it.putAll(currentProviders);
        ?? r0 = r2.build();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        updateSlot(r0);
        updateSlot(currentProviders);
        endGroup();
        return r0;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(ProvidedValue<?> r11) {
        PersistentCompositionLocalMap parentScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        Object it = rememberedValue();
        if (Intrinsics.areEqual(it, Composer.Companion.getEmpty()) == false) goto L5;
        ValueHolder<?> r3 = null;
    L6:
        CompositionLocal<?> r1 = r11.getCompositionLocal();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder<?> r2 = r1.updatedStateOf$runtime_release(r11, r3);
        boolean r5 = true;
        boolean change = !Intrinsics.areEqual(r2, r3);
        if (change == false) goto L10;
        updateRememberedValue(r2);
    L10:
        if (getInserting() == true) goto L12;
        Object r8 = this.reader.groupAux(this.reader.getCurrentGroup());
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
        PersistentCompositionLocalMap oldScope = (PersistentCompositionLocalMap) r8;
        if (getSkipping() == false) goto L23;
        if (change == true) goto L23;
    L27:
        if (change == true) goto L32;
        if (this.providersInvalid == true) goto L32;
    L35:
        PersistentCompositionLocalMap providers = oldScope;
    L38:
        if (this.reusing == true) goto L42;
        if (oldScope != providers) goto L42;
        r5 = false;
    L42:
        boolean invalid = r5;
        PersistentCompositionLocalMap oldScope2 = providers;
    L43:
        if (invalid == true) goto L45;
    L47:
        this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid));
        this.providersInvalid = invalid;
        this.providerCache = oldScope2;
        m3748startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3762getGroupULZAiWs(), oldScope2);
        return;
    L45:
        if (getInserting() == true) goto L47;
        recordProviderUpdate(oldScope2);
    L32:
        if (this.providersInvalid == false) goto L35;
        providers = parentScope;
    L23:
        if (r11.getCanOverride() == false) goto L25;
    L36:
        providers = parentScope.putValue(r1, r2);
        goto L38
    L25:
        if (CompositionLocalMapKt.contains(parentScope, r1) == true) goto L27;
    L12:
        if (r11.getCanOverride() == false) goto L14;
    L17:
        oldScope2 = parentScope.putValue(r1, r2);
    L18:
        invalid = false;
        this.writerHasAProvider = true;
        goto L43
    L14:
        if (CompositionLocalMapKt.contains(parentScope, r1) == false) goto L17;
        oldScope2 = parentScope;
        goto L18
    L5:
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
        r3 = (ValueHolder) it;
        goto L6
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap providers) {
        MutableIntObjectMap<PersistentCompositionLocalMap> r0 = this.providerUpdates;
        if (r0 != null) goto L5;
        ComposerImpl $this$recordProviderUpdate_u24lambda_u2414 = this;
        MutableIntObjectMap<PersistentCompositionLocalMap> r2 = new MutableIntObjectMap(0, 1, null);
        $this$recordProviderUpdate_u24lambda_u2414.providerUpdates = r2;
        r0 = r2;
    L5:
        r0.set(this.reader.getCurrentGroup(), providers);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue<?>[] r10) {
        PersistentCompositionLocalMap parentScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        boolean r4 = true;
        if (getInserting() == false) goto L5;
        PersistentCompositionLocalMap providers = updateProviderMapGroup(parentScope, CompositionLocalMapKt.updateCompositionMap$default(r10, parentScope, null, 4, null));
        boolean invalid = false;
        this.writerHasAProvider = true;
    L20:
        if (invalid == true) goto L22;
    L24:
        this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid));
        this.providersInvalid = invalid;
        this.providerCache = providers;
        m3748startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3762getGroupULZAiWs(), providers);
        return;
    L22:
        if (getInserting() == true) goto L24;
        recordProviderUpdate(providers);
        goto L24
    L5:
        Object r3 = this.reader.groupGet(0);
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
        PersistentCompositionLocalMap oldScope = (PersistentCompositionLocalMap) r3;
        Object r7 = this.reader.groupGet(1);
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
        PersistentCompositionLocalMap oldValues = (PersistentCompositionLocalMap) r7;
        PersistentCompositionLocalMap currentProviders = CompositionLocalMapKt.updateCompositionMap(r10, parentScope, oldValues);
        if (getSkipping() == true) goto L8;
    L13:
        providers = updateProviderMapGroup(parentScope, currentProviders);
        if (this.reusing == false) goto L16;
    L19:
        invalid = r4;
        goto L20
    L16:
        if (Intrinsics.areEqual(providers, oldScope) == false) goto L19;
        r4 = false;
        goto L19
    L8:
        if (this.reusing == true) goto L13;
        if (Intrinsics.areEqual(oldValues, currentProviders) == false) goto L13;
        skipGroup();
        providers = oldScope;
        invalid = false;
        goto L20
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.access$asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> r2) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), r2);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        CompositionObserverHolder r1 = null;
        if (getInserting() == false) goto L5;
        SlotWriter.markGroup$default(this.writer, 0, 1, null);
    L5:
        Object r0 = nextSlot();
        if ((r0 instanceof CompositionContextHolder) == false) goto L8;
        CompositionContextHolder holder = (CompositionContextHolder) r0;
    L9:
        if (holder != null) goto L17;
        int r5 = getCompoundKeyHash();
        boolean r6 = this.forceRecomposeScopes;
        boolean r7 = this.sourceMarkersEnabled;
        ControlledComposition r4 = getComposition();
        if ((r4 instanceof CompositionImpl) == false) goto L13;
        CompositionImpl r8 = (CompositionImpl) r4;
    L14:
        if (r8 == null) goto L16;
        r1 = r8.getObserverHolder$runtime_release();
    L16:
        holder = new CompositionContextHolder(new CompositionContextImpl(this, r5, r6, r7, r1));
        updateValue(holder);
        goto L17
    L13:
        r8 = null;
    L17:
        holder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return holder.getRef();
    L8:
        holder = null;
        goto L9
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        ArrayList it = this.invalidateStack;
        if (this.childrenComposing == 0) goto L5;
    L7:
        return null;
    L5:
        if (Stack.m3799isNotEmptyimpl(it) == false) goto L7;
        return (RecomposeScopeImpl) Stack.m3800peekimpl(it);
    }

    private final void ensureWriter() {
        if (this.writer.getClosed() == false) goto L6;
        this.writer = this.insertTable.openWriter();
        this.writer.skipToGroupEnd();
        this.writerHasAProvider = false;
        this.providerCache = null;
        return;
    }

    private final void createFreshInsertTable() {
        boolean value$iv = this.writer.getClosed();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L5:
        forceFreshInsertTable();
    }

    private final void forceFreshInsertTable() {
        SlotTable $this$forceFreshInsertTable_u24lambda_u2416 = new SlotTable();
        if (this.sourceMarkersEnabled == false) goto L6;
        $this$forceFreshInsertTable_u24lambda_u2416.collectSourceInformation();
    L6:
        if (this.parentContext.getCollectingCallByInformation$runtime_release() == false) goto L8;
        $this$forceFreshInsertTable_u24lambda_u2416.collectCalledByInformation();
    L8:
        this.insertTable = $this$forceFreshInsertTable_u24lambda_u2416;
        SlotWriter it = this.insertTable.openWriter();
        it.close(true);
        this.writer = it;
    }

    private final void startReaderGroup(boolean isNode, Object data) {
        if (isNode == false) goto L4;
        this.reader.startNode();
        return;
    L4:
        if (data != null) goto L6;
    L8:
        this.reader.startGroup();
        return;
    L6:
        if (this.reader.getGroupAux() == data) goto L8;
        this.changeListWriter.updateAuxData(data);
        goto L8
    }

    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m3748startBaiHCIY(int key, Object objectKey, int kind, Object data) {
        validateNodeNotExpected();
        int rGroupIndex$iv = this.rGroupIndex;
        if (objectKey != null) goto L12;
        if (data != null) goto L6;
    L10:
        int $this$rol$iv$iv$iv = getCompoundKeyHash();
        this.compoundKeyHash = Integer.rotateLeft(Integer.rotateLeft($this$rol$iv$iv$iv, 3) ^ key, 3) ^ rGroupIndex$iv;
    L16:
        if (objectKey != null) goto L18;
        this.rGroupIndex++;
    L18:
        int r10 = 0;
        if (kind == GroupKind.Companion.m3762getGroupULZAiWs()) goto L21;
        boolean r3 = true;
    L22:
        boolean isNode = r3;
        if (getInserting() == false) goto L43;
        this.reader.beginEmpty();
        int startIndex = this.writer.getCurrentGroup();
        if (isNode == false) goto L27;
        this.writer.startNode(key, Composer.Companion.getEmpty());
    L37:
        Pending pending = this.pending;
        if (pending == null) goto L40;
        KeyInfo insertKeyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(startIndex), -1, 0);
        pending.registerInsert(insertKeyInfo, this.nodeIndex - pending.getStartIndex());
        pending.recordUsed(insertKeyInfo);
    L40:
        enterGroup(isNode, null);
        return;
    L27:
        SlotWriter r1 = this.writer;
        if (data == null) goto L33;
        if (objectKey != null) goto L31;
        Object r4 = Composer.Companion.getEmpty();
    L32:
        r1.startData(key, r4, data);
        goto L37
    L31:
        r4 = objectKey;
        goto L32
    L33:
        if (objectKey != null) goto L35;
        Object r5 = Composer.Companion.getEmpty();
    L36:
        r1.startGroup(key, r5);
        goto L37
    L35:
        r5 = objectKey;
        goto L36
    L43:
        if (kind == GroupKind.Companion.m3763getNodeULZAiWs()) goto L45;
        int r6 = 1;
    L46:
        if (r6 == 0) goto L48;
    L50:
        boolean r7 = false;
    L51:
        boolean forceReplace = r7;
        if (this.pending != null) goto L60;
        int slotKey = this.reader.getGroupKey();
        if (forceReplace == true) goto L59;
        if (slotKey != key) goto L59;
        if (Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey()) == false) goto L59;
        startReaderGroup(isNode, data);
    L59:
        this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
    L60:
        Pending pending2 = this.pending;
        Pending newPending = null;
        if (pending2 == null) goto L87;
        KeyInfo keyInfo = pending2.getNext(key, objectKey);
        if (forceReplace == true) goto L69;
        if (keyInfo == null) goto L69;
        pending2.recordUsed(keyInfo);
        int location = keyInfo.getLocation();
        this.nodeIndex = pending2.nodePositionOf(keyInfo) + pending2.getStartIndex();
        int relativePosition = pending2.slotPositionOf(keyInfo);
        int currentRelativePosition = relativePosition - pending2.getGroupIndex();
        pending2.registerMoveSlot(relativePosition, pending2.getGroupIndex());
        this.changeListWriter.moveReaderRelativeTo(location);
        this.reader.reposition(location);
        if (currentRelativePosition <= 0) goto L68;
        this.changeListWriter.moveCurrentGroup(currentRelativePosition);
    L68:
        startReaderGroup(isNode, data);
    L69:
        this.reader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        this.writer.beginInsert();
        int startIndex2 = this.writer.getCurrentGroup();
        if (isNode == false) goto L72;
        this.writer.startNode(key, Composer.Companion.getEmpty());
    L82:
        this.insertAnchor = this.writer.anchor(startIndex2);
        KeyInfo insertKeyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(startIndex2), -1, 0);
        pending2.registerInsert(insertKeyInfo2, this.nodeIndex - pending2.getStartIndex());
        pending2.recordUsed(insertKeyInfo2);
        ArrayList r8 = new ArrayList();
        if (isNode == true) goto L86;
        r10 = this.nodeIndex;
    L86:
        newPending = new Pending(r8, r10);
        goto L87
    L72:
        SlotWriter r2 = this.writer;
        if (data == null) goto L78;
        if (objectKey != null) goto L76;
        Object r9 = Composer.Companion.getEmpty();
    L77:
        r2.startData(key, r9, data);
        goto L82
    L76:
        r9 = objectKey;
        goto L77
    L78:
        if (objectKey != null) goto L80;
        Object r11 = Composer.Companion.getEmpty();
    L81:
        r2.startGroup(key, r11);
        goto L82
    L80:
        r11 = objectKey;
    L87:
        enterGroup(isNode, newPending);
        return;
    L48:
        if (this.reusing == false) goto L50;
        r7 = true;
        goto L51
    L45:
        r6 = 0;
        goto L46
    L21:
        r3 = false;
        goto L22
    L6:
        if (key != 207) goto L10;
        if (Intrinsics.areEqual(data, Composer.Companion.getEmpty()) == true) goto L10;
        int keyHash$iv$iv = data.hashCode();
        int $this$rol$iv$iv$iv2 = getCompoundKeyHash();
        this.compoundKeyHash = Integer.rotateLeft(Integer.rotateLeft($this$rol$iv$iv$iv2, 3) ^ keyHash$iv$iv, 3) ^ rGroupIndex$iv;
        goto L16
    L12:
        if ((objectKey instanceof Enum) == false) goto L14;
        int keyHash$iv$iv2 = ((Enum) objectKey).ordinal();
        int $this$rol$iv$iv$iv3 = getCompoundKeyHash();
        this.compoundKeyHash = Integer.rotateLeft(Integer.rotateLeft($this$rol$iv$iv$iv3, 3) ^ keyHash$iv$iv2, 3) ^ 0;
        goto L16
    L14:
        int keyHash$iv$iv3 = objectKey.hashCode();
        int $this$rol$iv$iv$iv4 = getCompoundKeyHash();
        this.compoundKeyHash = Integer.rotateLeft(Integer.rotateLeft($this$rol$iv$iv$iv4, 3) ^ keyHash$iv$iv3, 3) ^ 0;
        goto L16
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        Stack.m3803pushimpl(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (isNode == false) goto L5;
        this.nodeIndex = 0;
    L5:
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending previousPending = (Pending) Stack.m3802popimpl(this.pendingStack);
        if (previousPending == null) goto L6;
        if (inserting == true) goto L6;
        previousPending.setGroupIndex(previousPending.getGroupIndex() + 1);
    L6:
        this.pending = previousPending;
        this.nodeIndex = this.parentStateStack.pop() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + expectedNodeCount;
    }

    private final void end(boolean isNode) {
        int rGroupIndex = this.parentStateStack.peek2() - 1;
        if (getInserting() == false) goto L17;
        int parent = this.writer.getParent();
        int groupKey$iv = this.writer.groupKey(parent);
        Object dataKey$iv = this.writer.groupObjectKey(parent);
        Object data$iv = this.writer.groupAux(parent);
        if (dataKey$iv != null) goto L13;
        if (data$iv == null) goto L11;
        if (groupKey$iv != 207) goto L11;
        if (Intrinsics.areEqual(data$iv, Composer.Companion.getEmpty()) == true) goto L11;
        int groupKey$iv$iv = data$iv.hashCode();
        int $this$ror$iv$iv$iv = getCompoundKeyHash() ^ rGroupIndex;
        int r15 = Integer.rotateRight($this$ror$iv$iv$iv, 3);
        int $this$ror$iv$iv$iv2 = Integer.hashCode(groupKey$iv$iv);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv2 ^ r15, 3);
    L30:
        int expectedNodeCount = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending == null) goto L56;
        if (pending.getKeyInfos().size() <= 0) goto L56;
        List<KeyInfo> r5 = pending.getKeyInfos();
        List<KeyInfo> r6 = pending.getUsed();
        Set usedKeys = ListUtilsKt.fastToSet(r6);
        Set placedKeys = new LinkedHashSet();
        int currentIndex = 0;
        int currentEnd = r6.size();
        int previousIndex = 0;
        int previousEnd = r5.size();
        int nodeOffset = 0;
    L35:
        if (previousIndex >= previousEnd) goto L52;
        KeyInfo previousInfo = r5.get(previousIndex);
        if (usedKeys.contains(previousInfo) == false) goto L38;
        int rGroupIndex2 = rGroupIndex;
        List<KeyInfo> r17 = r5;
        Set usedKeys2 = usedKeys;
        if (placedKeys.contains(previousInfo) == true) goto L41;
        if (currentIndex < currentEnd) goto L43;
        r5 = r17;
        rGroupIndex = rGroupIndex2;
        usedKeys = usedKeys2;
        goto L35
    L43:
        KeyInfo currentInfo = r6.get(currentIndex);
        if (currentInfo == previousInfo) goto L49;
        int nodePosition = pending.nodePositionOf(currentInfo);
        placedKeys.add(currentInfo);
        if (nodePosition == nodeOffset) goto L50;
        int updatedCount = pending.updatedNodeCountOf(currentInfo);
        this.changeListWriter.moveNode(pending.getStartIndex() + nodePosition, nodeOffset + pending.getStartIndex(), updatedCount);
        pending.registerMoveNode(nodePosition, nodeOffset, updatedCount);
    L50:
        currentIndex = currentIndex + 1;
        nodeOffset = nodeOffset + pending.updatedNodeCountOf(currentInfo);
        r5 = r17;
        rGroupIndex = rGroupIndex2;
        usedKeys = usedKeys2;
        r6 = r6;
        goto L35
    L49:
        previousIndex = previousIndex + 1;
        goto L50
    L41:
        previousIndex = previousIndex + 1;
        r5 = r17;
        rGroupIndex = rGroupIndex2;
        usedKeys = usedKeys2;
        goto L35
    L38:
        int deleteOffset = pending.nodePositionOf(previousInfo);
        ComposerChangeListWriter r4 = this.changeListWriter;
        int rGroupIndex3 = rGroupIndex;
        int rGroupIndex4 = deleteOffset + pending.getStartIndex();
        List<KeyInfo> r18 = r5;
        r4.removeNode(rGroupIndex4, previousInfo.getNodes());
        pending.updateNodeCount(previousInfo.getLocation(), 0);
        this.changeListWriter.moveReaderRelativeTo(previousInfo.getLocation());
        this.reader.reposition(previousInfo.getLocation());
        recordDelete();
        this.reader.skipGroup();
        Set usedKeys3 = usedKeys;
        ComposerKt.access$removeRange(this.invalidations, previousInfo.getLocation(), previousInfo.getLocation() + this.reader.groupSize(previousInfo.getLocation()));
        previousIndex = previousIndex + 1;
        r5 = r18;
        rGroupIndex = rGroupIndex3;
        usedKeys = usedKeys3;
        goto L35
    L52:
        this.changeListWriter.endNodeMovement();
        if (r5.size() <= 0) goto L56;
        this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
        this.reader.skipToGroupEnd();
    L56:
        boolean inserting = getInserting();
        if (inserting == true) goto L61;
        int remainingSlots = this.reader.getRemainingSlots();
        if (remainingSlots <= 0) goto L61;
        this.changeListWriter.trimValues(remainingSlots);
    L61:
        int remainingSlots2 = this.nodeIndex;
    L63:
        if (this.reader.isGroupEnd() == true) goto L65;
        int startSlot = this.reader.getCurrentGroup();
        recordDelete();
        int nodesToRemove = this.reader.skipGroup();
        this.changeListWriter.removeNode(remainingSlots2, nodesToRemove);
        ComposerKt.access$removeRange(this.invalidations, startSlot, this.reader.getCurrentGroup());
        goto L63
    L65:
        if (inserting == false) goto L73;
        if (isNode == false) goto L68;
        this.insertFixups.endNodeInsert();
        expectedNodeCount = 1;
    L68:
        this.reader.endEmpty();
        int parentGroup = this.writer.getParent();
        this.writer.endGroup();
        if (this.reader.getInEmpty() == true) goto L81;
        int virtualIndex = insertedGroupVirtualIndex(parentGroup);
        this.writer.endInsert();
        this.writer.close(true);
        recordInsert(this.insertAnchor);
        this.inserting = false;
        if (this.slotTable.isEmpty() == true) goto L81;
        updateNodeCount(virtualIndex, 0);
        updateNodeCountOverrides(virtualIndex, expectedNodeCount);
    L81:
        exitGroup(expectedNodeCount, inserting);
        return;
    L73:
        if (isNode == false) goto L75;
        this.changeListWriter.moveUp();
    L75:
        this.changeListWriter.endCurrentGroup();
        int parentGroup2 = this.reader.getParent();
        int parentNodeCount = updatedNodeCount(parentGroup2);
        if (expectedNodeCount == parentNodeCount) goto L78;
        updateNodeCountOverrides(parentGroup2, expectedNodeCount);
    L78:
        if (isNode == false) goto L80;
        expectedNodeCount = 1;
    L80:
        this.reader.endGroup();
        this.changeListWriter.endNodeMovement();
    L11:
        int $this$ror$iv$iv$iv3 = getCompoundKeyHash() ^ rGroupIndex;
        int r14 = Integer.rotateRight($this$ror$iv$iv$iv3, 3);
        int $this$ror$iv$iv$iv4 = Integer.hashCode(groupKey$iv);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv4 ^ r14, 3);
        goto L30
    L13:
        if ((dataKey$iv instanceof Enum) == false) goto L15;
        int groupKey$iv$iv2 = ((Enum) dataKey$iv).ordinal();
        int $this$ror$iv$iv$iv5 = getCompoundKeyHash() ^ 0;
        int r16 = Integer.rotateRight($this$ror$iv$iv$iv5, 3);
        int $this$ror$iv$iv$iv6 = Integer.hashCode(groupKey$iv$iv2);
        this.compoundKeyHash = Integer.rotateRight(r16 ^ $this$ror$iv$iv$iv6, 3);
        goto L30
    L15:
        int groupKey$iv$iv3 = dataKey$iv.hashCode();
        int $this$ror$iv$iv$iv7 = getCompoundKeyHash() ^ 0;
        int r19 = Integer.rotateRight($this$ror$iv$iv$iv7, 3);
        int $this$ror$iv$iv$iv8 = Integer.hashCode(groupKey$iv$iv3);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv8 ^ r19, 3);
        goto L30
    L17:
        int parent2 = this.reader.getParent();
        int groupKey$iv2 = this.reader.groupKey(parent2);
        Object dataKey$iv2 = this.reader.groupObjectKey(parent2);
        Object data$iv2 = this.reader.groupAux(parent2);
        if (dataKey$iv2 != null) goto L26;
        if (data$iv2 == null) goto L24;
        if (groupKey$iv2 != 207) goto L24;
        if (Intrinsics.areEqual(data$iv2, Composer.Companion.getEmpty()) == true) goto L24;
        int groupKey$iv$iv4 = data$iv2.hashCode();
        int $this$ror$iv$iv$iv9 = getCompoundKeyHash() ^ rGroupIndex;
        int r110 = Integer.rotateRight($this$ror$iv$iv$iv9, 3);
        int $this$ror$iv$iv$iv10 = Integer.hashCode(groupKey$iv$iv4);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv10 ^ r110, 3);
    L24:
        int $this$ror$iv$iv$iv11 = getCompoundKeyHash() ^ rGroupIndex;
        int r13 = Integer.rotateRight($this$ror$iv$iv$iv11, 3);
        int $this$ror$iv$iv$iv12 = Integer.hashCode(groupKey$iv2);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv12 ^ r13, 3);
        goto L30
    L26:
        if ((dataKey$iv2 instanceof Enum) == false) goto L28;
        int groupKey$iv$iv5 = ((Enum) dataKey$iv2).ordinal();
        int $this$ror$iv$iv$iv13 = getCompoundKeyHash() ^ 0;
        int r111 = Integer.rotateRight($this$ror$iv$iv$iv13, 3);
        int $this$ror$iv$iv$iv14 = Integer.hashCode(groupKey$iv$iv5);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv14 ^ r111, 3);
        goto L30
    L28:
        int groupKey$iv$iv6 = dataKey$iv2.hashCode();
        int $this$ror$iv$iv$iv15 = getCompoundKeyHash() ^ 0;
        int r112 = Integer.rotateRight($this$ror$iv$iv$iv15, 3);
        int $this$ror$iv$iv$iv16 = Integer.hashCode(groupKey$iv$iv6);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv16 ^ r112, 3);
        goto L30
    }

    private final void recomposeToGroupEnd() {
        boolean wasComposing = this.isComposing;
        this.isComposing = true;
        boolean recomposed = false;
        int parent = this.reader.getParent();
        int end = this.reader.groupSize(parent) + parent;
        int recomposeIndex = this.nodeIndex;
        int recomposeCompoundKey = getCompoundKeyHash();
        int oldGroupNodeCount = this.groupNodeCount;
        int oldRGroupIndex = this.rGroupIndex;
        int oldGroup = parent;
        Invalidation firstInRange = ComposerKt.access$firstInRange(this.invalidations, this.reader.getCurrentGroup(), end);
    L3:
        if (firstInRange == null) goto L21;
        int location = firstInRange.getLocation();
        ComposerKt.access$removeLocation(this.invalidations, location);
        if (firstInRange.isInvalid() == false) goto L19;
        this.reader.reposition(location);
        int newGroup = this.reader.getCurrentGroup();
        recordUpsAndDowns(oldGroup, newGroup, parent);
        oldGroup = newGroup;
        this.nodeIndex = nodeIndexOf(location, newGroup, parent, recomposeIndex);
        this.rGroupIndex = rGroupIndexOf(newGroup);
        int newParent = this.reader.parent(newGroup);
        this.compoundKeyHash = compoundKeyOf(newParent, parent, recomposeCompoundKey);
        this.providerCache = null;
        if (this.reusing == false) goto L9;
    L11:
        boolean shouldRestartReusing = false;
    L12:
        if (shouldRestartReusing == false) goto L15;
        this.reusing = true;
    L15:
        firstInRange.getScope().compose(this);
        if (shouldRestartReusing == false) goto L18;
        this.reusing = false;
    L18:
        this.providerCache = null;
        this.reader.restoreParent(parent);
        recomposed = true;
    L20:
        firstInRange = ComposerKt.access$firstInRange(this.invalidations, this.reader.getCurrentGroup(), end);
        goto L3
    L9:
        if (firstInRange.getScope().getReusing() == false) goto L11;
        shouldRestartReusing = true;
        goto L12
    L19:
        Stack.m3803pushimpl(this.invalidateStack, firstInRange.getScope());
        firstInRange.getScope().rereadTrackedInstances();
        Stack.m3802popimpl(this.invalidateStack);
        goto L20
    L21:
        if (recomposed == false) goto L23;
        recordUpsAndDowns(oldGroup, parent, parent);
        this.reader.skipToGroupEnd();
        int parentGroupNodes = updatedNodeCount(parent);
        this.nodeIndex = recomposeIndex + parentGroupNodes;
        this.groupNodeCount = oldGroupNodeCount + parentGroupNodes;
        this.rGroupIndex = oldRGroupIndex;
    L24:
        this.compoundKeyHash = recomposeCompoundKey;
        this.isComposing = wasComposing;
        return;
    L23:
        skipReaderToGroupEnd();
        goto L24
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int currentCount = updatedNodeCount(group);
        if (currentCount == newCount) goto L21;
        int delta = newCount - currentCount;
        int current = group;
        int minPending = Stack.m3796getSizeimpl(this.pendingStack) - 1;
    L6:
        if (current == (-1)) goto L33;
        int newCurrentNodes = updatedNodeCount(current) + delta;
        updateNodeCount(current, newCurrentNodes);
        int pendingIndex = minPending;
    L8:
        if ((-1) >= pendingIndex) goto L15;
        Pending pending = (Pending) Stack.m3801peekimpl(this.pendingStack, pendingIndex);
        if (pending == null) goto L14;
        if (pending.updateNodeCount(current, newCurrentNodes) == false) goto L14;
        minPending = pendingIndex - 1;
    L14:
        pendingIndex = pendingIndex - 1;
    L15:
        SlotReader r4 = this.reader;
        if (current < 0) goto L17;
        if (r4.isNode(current) == true) goto L34;
        current = this.reader.parent(current);
        goto L6
    L34:
        return;
    L17:
        current = r4.getParent();
        goto L6
    L33:
        return;
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int anchorGroup = this.reader.parent(group);
    L3:
        if (anchorGroup == recomposeGroup) goto L8;
        if (this.reader.isNode(anchorGroup) == true) goto L8;
        anchorGroup = this.reader.parent(anchorGroup);
    L8:
        if (this.reader.isNode(anchorGroup) == false) goto L10;
        int index = 0;
    L11:
        if (anchorGroup != group) goto L13;
        return index;
    L13:
        int current = anchorGroup;
        int nodeIndexLimit = (updatedNodeCount(anchorGroup) - this.reader.nodeCount(group)) + index;
    L14:
        if (index >= nodeIndexLimit) goto L26;
        if (current == groupLocation) goto L26;
        current = current + 1;
    L17:
        if (current >= groupLocation) goto L26;
        int end = this.reader.groupSize(current) + current;
        if (groupLocation < end) goto L14;
        if (this.reader.isNode(current) == false) goto L23;
        int r5 = 1;
    L24:
        index = index + r5;
        current = end;
        goto L17
    L23:
        r5 = updatedNodeCount(current);
    L26:
        return index;
    L10:
        index = recomposeIndex;
        goto L11
    }

    private final int rGroupIndexOf(int group) {
        int result = 0;
        int parent = this.reader.parent(group);
        int child = parent + 1;
    L3:
        if (child >= group) goto L8;
        if (this.reader.hasObjectKey(child) == true) goto L7;
        result = result + 1;
    L7:
        child = child + this.reader.groupSize(child);
        goto L3
    L8:
        return result;
    }

    private final int updatedNodeCount(int group) {
        if (group >= 0) goto L9;
        IntIntMap it = this.nodeCountVirtualOverrides;
        if (it == null) goto L16;
        IntIntMap this_$iv = it;
        if (this_$iv.containsKey(group) == true) goto L8;
        return 0;
    L8:
        return it.get(group);
    L16:
        return 0;
    L9:
        int[] nodeCounts = this.nodeCountOverrides;
        if (nodeCounts == null) goto L15;
        int override = nodeCounts[group];
        if (override < 0) goto L15;
        return override;
    L15:
        return this.reader.nodeCount(group);
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) == count) goto L14;
        if (group >= 0) goto L9;
        MutableIntIntMap virtualCounts = this.nodeCountVirtualOverrides;
        if (virtualCounts != null) goto L8;
        ComposerImpl $this$updateNodeCount_u24lambda_u2420 = this;
        MutableIntIntMap newCounts = new MutableIntIntMap(0, 1, null);
        $this$updateNodeCount_u24lambda_u2420.nodeCountVirtualOverrides = newCounts;
        virtualCounts = newCounts;
    L8:
        virtualCounts.set(group, count);
        return;
    L9:
        int[] nodeCounts = this.nodeCountOverrides;
        if (nodeCounts != null) goto L12;
        ComposerImpl $this$updateNodeCount_u24lambda_u2421 = this;
        int[] newCounts2 = new int[$this$updateNodeCount_u24lambda_u2421.reader.getSize()];
        ArraysKt.fill$default(newCounts2, -1, 0, 0, 6, null);
        $this$updateNodeCount_u24lambda_u2421.nodeCountOverrides = newCounts2;
        nodeCounts = newCounts2;
    L12:
        nodeCounts[group] = count;
        return;
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader reader = this.reader;
        int nearestCommonRoot = ComposerKt.access$nearestCommonRootOf(reader, oldGroup, newGroup, commonRoot);
        int current = oldGroup;
    L3:
        if (current <= 0) goto L9;
        if (current == nearestCommonRoot) goto L9;
        if (reader.isNode(current) == false) goto L8;
        this.changeListWriter.moveUp();
    L8:
        current = reader.parent(current);
    L9:
        doRecordDownsFor(newGroup, nearestCommonRoot);
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0) goto L8;
        if (group == nearestCommonRoot) goto L9;
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group) == false) goto L10;
        this.changeListWriter.moveDown(nodeAt(this.reader, group));
        return;
    L10:
        return;
    L9:
        return;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        int keyRot = 3;
        int rgiRot = 0;
        int result = 0;
        int parent = group;
    L3:
        if (parent < 0) goto L16;
        if (parent == recomposeGroup) goto L6;
        int groupKey = groupCompoundKeyPart(this.reader, parent);
        if (groupKey == 126665345) goto L10;
        if (this.reader.hasObjectKey(parent) == false) goto L14;
        int effectiveRGroupIndex = 0;
    L15:
        int $this$rol$iv = result ^ Integer.rotateLeft(groupKey, keyRot);
        int $this$rol$iv2 = effectiveRGroupIndex;
        result = $this$rol$iv ^ Integer.rotateLeft($this$rol$iv2, rgiRot);
        keyRot = (keyRot + 6) % 32;
        rgiRot = (rgiRot + 6) % 32;
        parent = this.reader.parent(parent);
        goto L3
    L14:
        effectiveRGroupIndex = rGroupIndexOf(parent);
        goto L15
    L10:
        return result ^ Integer.rotateLeft(groupKey, rgiRot);
    L6:
        return result ^ Integer.rotateLeft(recomposeKey, rgiRot);
    L16:
        return result;
    }

    private final int groupCompoundKeyPart(SlotReader $this$groupCompoundKeyPart, int group) {
        if ($this$groupCompoundKeyPart.hasObjectKey(group) == false) goto L15;
        Object it = $this$groupCompoundKeyPart.groupObjectKey(group);
        if (it != null) goto L7;
        return 0;
    L7:
        if ((it instanceof Enum) == false) goto L10;
        return ((Enum) it).ordinal();
    L10:
        if ((it instanceof MovableContent) == false) goto L29;
        return MovableContentKt.movableContentKey;
    L29:
        return it.hashCode();
    L15:
        int it2 = $this$groupCompoundKeyPart.groupKey(group);
        if (it2 != 207) goto L32;
        Object aux = $this$groupCompoundKeyPart.groupAux(group);
        if (aux == null) goto L32;
        if (Intrinsics.areEqual(aux, Composer.Companion.getEmpty()) == false) goto L22;
        int r4 = it2;
    L33:
        return r4;
    L22:
        r4 = aux.hashCode();
    L32:
        return it2;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl scope, Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor != null) goto L5;
        return false;
    L5:
        SlotTable slotTable = this.reader.getTable$runtime_release();
        int location = anchor.toIndexFor(slotTable);
        if (this.isComposing == true) goto L8;
    L11:
        return false;
    L8:
        if (location < this.reader.getCurrentGroup()) goto L11;
        ComposerKt.access$insertIfMissing(this.invalidations, location, scope, instance);
        return true;
    }

    public final int parentKey$runtime_release() {
        if (getInserting() == false) goto L6;
        return this.writer.groupKey(this.writer.getParent());
    L6:
        return this.reader.groupKey(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty() == false) goto L5;
        skipGroup();
        return;
    L5:
        SlotReader reader = this.reader;
        int key = reader.getGroupKey();
        Object dataKey = reader.getGroupObjectKey();
        Object aux = reader.getGroupAux();
        int rGroupIndex = this.rGroupIndex;
        if (dataKey != null) goto L14;
        if (aux == null) goto L12;
        if (key != 207) goto L12;
        if (Intrinsics.areEqual(aux, Composer.Companion.getEmpty()) == true) goto L12;
        int keyHash$iv$iv = aux.hashCode();
        int $this$rol$iv$iv$iv = getCompoundKeyHash();
        int $this$rol$iv$iv$iv2 = Integer.rotateLeft($this$rol$iv$iv$iv, 3) ^ keyHash$iv$iv;
        int $this$rol$iv$iv$iv3 = Integer.rotateLeft($this$rol$iv$iv$iv2, 3) ^ rGroupIndex;
        this.compoundKeyHash = $this$rol$iv$iv$iv3;
    L17:
        startReaderGroup(reader.isNode(), null);
        recomposeToGroupEnd();
        reader.endGroup();
        if (dataKey != null) goto L26;
        if (aux == null) goto L24;
        if (key != 207) goto L24;
        if (Intrinsics.areEqual(aux, Composer.Companion.getEmpty()) == true) goto L24;
        int groupKey$iv$iv = aux.hashCode();
        int $this$ror$iv$iv$iv = getCompoundKeyHash() ^ rGroupIndex;
        int r14 = Integer.rotateRight($this$ror$iv$iv$iv, 3);
        int $this$ror$iv$iv$iv2 = Integer.hashCode(groupKey$iv$iv);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv2 ^ r14, 3);
        return;
    L24:
        int $this$ror$iv$iv$iv3 = getCompoundKeyHash() ^ rGroupIndex;
        int r13 = Integer.rotateRight($this$ror$iv$iv$iv3, 3);
        int $this$ror$iv$iv$iv4 = Integer.hashCode(key);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv4 ^ r13, 3);
        return;
    L26:
        if ((dataKey instanceof Enum) == false) goto L28;
        int groupKey$iv$iv2 = ((Enum) dataKey).ordinal();
        int $this$ror$iv$iv$iv5 = getCompoundKeyHash() ^ 0;
        int r15 = Integer.rotateRight($this$ror$iv$iv$iv5, 3);
        int $this$ror$iv$iv$iv6 = Integer.hashCode(groupKey$iv$iv2);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv6 ^ r15, 3);
        return;
    L28:
        int groupKey$iv$iv3 = dataKey.hashCode();
        int $this$ror$iv$iv$iv7 = getCompoundKeyHash() ^ 0;
        int r16 = Integer.rotateRight($this$ror$iv$iv$iv7, 3);
        int $this$ror$iv$iv$iv8 = Integer.hashCode(groupKey$iv$iv3);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv$iv8 ^ r16, 3);
        return;
    L12:
        int $this$rol$iv$iv$iv4 = getCompoundKeyHash();
        int $this$rol$iv$iv$iv5 = Integer.rotateLeft($this$rol$iv$iv$iv4, 3) ^ key;
        int $this$rol$iv$iv$iv6 = Integer.rotateLeft($this$rol$iv$iv$iv5, 3) ^ rGroupIndex;
        this.compoundKeyHash = $this$rol$iv$iv$iv6;
        goto L17
    L14:
        if ((dataKey instanceof Enum) == false) goto L16;
        int keyHash$iv$iv2 = ((Enum) dataKey).ordinal();
        int $this$rol$iv$iv$iv7 = getCompoundKeyHash();
        int $this$rol$iv$iv$iv8 = Integer.rotateLeft($this$rol$iv$iv$iv7, 3) ^ keyHash$iv$iv2;
        int $this$rol$iv$iv$iv9 = Integer.rotateLeft($this$rol$iv$iv$iv8, 3) ^ 0;
        this.compoundKeyHash = $this$rol$iv$iv$iv9;
        goto L17
    L16:
        int keyHash$iv$iv3 = dataKey.hashCode();
        int $this$rol$iv$iv$iv10 = getCompoundKeyHash();
        int $this$rol$iv$iv$iv11 = Integer.rotateLeft($this$rol$iv$iv$iv10, 3) ^ keyHash$iv$iv3;
        int $this$rol$iv$iv$iv12 = Integer.rotateLeft($this$rol$iv$iv$iv11, 3) ^ 0;
        this.compoundKeyHash = $this$rol$iv$iv$iv12;
        goto L17
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean shouldExecute(boolean parametersChanged, int flags) {
        if ((flags & 1) == 0) goto L5;
    L19:
        if (parametersChanged == true) goto L23;
        if (getSkipping() == false) goto L23;
        return false;
    L23:
        return true;
    L5:
        if (getInserting() == false) goto L7;
    L8:
        ShouldPauseCallback callback = this.shouldPauseCallback;
        if (callback != null) goto L11;
        return true;
    L11:
        RecomposeScopeImpl scope = getCurrentRecomposeScope$runtime_release();
        if (scope != null) goto L14;
        return true;
    L14:
        boolean pausing = callback.shouldPause();
        if (pausing == false) goto L18;
        scope.setUsed(true);
        scope.setReusing(this.reusing);
        scope.setPaused(true);
        this.changeListWriter.rememberPausingScope(scope);
        this.parentContext.reportPausedScope$runtime_release(scope);
        return false;
    L18:
        return true;
    L7:
        if (this.reusing == false) goto L19;
        goto L8
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.groupNodeCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
    L9:
        boolean value$iv2 = getInserting();
        if (value$iv2 == true) goto L19;
        RecomposeScopeImpl r0 = getCurrentRecomposeScope$runtime_release();
        if (r0 == null) goto L15;
        r0.scopeSkipped();
    L15:
        if (this.invalidations.isEmpty() == false) goto L17;
        skipReaderToGroupEnd();
        return;
    L17:
        recomposeToGroupEnd();
        return;
    L19:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (this.groupNodeCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
    L9:
        boolean value$iv2 = getInserting();
        if (value$iv2 == true) goto L16;
        if (changed == true) goto L14;
        skipReaderToGroupEnd();
        return;
    L14:
        int start = this.reader.getCurrentGroup();
        int end = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.access$removeRange(this.invalidations, start, end);
        this.reader.skipToGroupEnd();
        return;
    L16:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        addRecomposeScope();
        return this;
    }

    private final void addRecomposeScope() {
        if (getInserting() == false) goto L5;
        ControlledComposition r2 = getComposition();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        RecomposeScopeImpl scope = new RecomposeScopeImpl((CompositionImpl) r2);
        Stack.m3803pushimpl(this.invalidateStack, scope);
        updateValue(scope);
        scope.start(this.compositionToken);
        return;
    L5:
        Invalidation invalidation = ComposerKt.access$removeLocation(this.invalidations, this.reader.getParent());
        Object slot = this.reader.next();
        if (Intrinsics.areEqual(slot, Composer.Companion.getEmpty()) == false) goto L8;
        ControlledComposition r4 = getComposition();
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        RecomposeScopeImpl newScope = new RecomposeScopeImpl((CompositionImpl) r4);
        updateValue(newScope);
    L10:
        if (invalidation != null) goto L18;
        boolean forced = newScope.getForcedRecompose();
        if (forced == false) goto L15;
        newScope.setForcedRecompose(false);
    L15:
        if (forced == true) goto L18;
        boolean r5 = false;
    L19:
        newScope.setRequiresRecompose(r5);
        Stack.m3803pushimpl(this.invalidateStack, newScope);
        newScope.start(this.compositionToken);
        if (newScope.getPaused() == false) goto L24;
        newScope.setPaused(false);
        newScope.setResuming(true);
        this.changeListWriter.startResumingScope(newScope);
        return;
    L24:
        return;
    L18:
        r5 = true;
        goto L19
    L8:
        Intrinsics.checkNotNull(slot, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        newScope = (RecomposeScopeImpl) slot;
        goto L10
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl result = null;
        if (Stack.m3799isNotEmptyimpl(this.invalidateStack) == false) goto L5;
        RecomposeScopeImpl scope = (RecomposeScopeImpl) Stack.m3802popimpl(this.invalidateStack);
    L7:
        if (scope == null) goto L14;
        scope.setRequiresRecompose(false);
        Function1<Composition, Unit> r3 = scope.end(this.compositionToken);
        if (r3 == null) goto L12;
        this.changeListWriter.endCompositionScope(r3, getComposition());
    L12:
        if (scope.getResuming() == false) goto L14;
        scope.setResuming(false);
        this.changeListWriter.endResumingScope(scope);
    L14:
        if (scope != null) goto L16;
    L30:
        end(false);
        return result;
    L16:
        if (scope.getSkipped$runtime_release() == true) goto L30;
        if (scope.getUsed() == true) goto L22;
        if (this.forceRecomposeScopes == false) goto L30;
    L22:
        if (scope.getAnchor() == null) goto L24;
    L28:
        scope.setDefaultsInvalid(false);
        result = scope;
        goto L30
    L24:
        if (getInserting() == false) goto L26;
        Anchor r1 = this.writer.anchor(this.writer.getParent());
    L27:
        scope.setAnchor(r1);
        goto L28
    L26:
        r1 = this.reader.anchor(this.reader.getParent());
        goto L27
    L5:
        scope = null;
        goto L7
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> r3, Object parameter) {
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(r3, currentCompositionLocalScope(), parameter, false);
    }

    private final void invokeMovableContentLambda(final MovableContent<Object> r13, PersistentCompositionLocalMap locals, final Object parameter, boolean force) {
        startMovableGroup(MovableContentKt.movableContentKey, r13);
        updateSlot(parameter);
        int savedCompoundKeyHash = getCompoundKeyHash();
        this.compoundKeyHash = MovableContentKt.movableContentKey;     // Catch: Throwable -> L22
        boolean r1 = false;
        if (getInserting() == false) goto L7;
        SlotWriter.markGroup$default(this.writer, 0, 1, null);     // Catch: Throwable -> L22
    L7:
        if (getInserting() == false) goto L10;
    L12:
        boolean providersChanged = r1;
        if (providersChanged == false) goto L15;
        recordProviderUpdate(locals);     // Catch: Throwable -> L22
    L15:
        m3748startBaiHCIY(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3762getGroupULZAiWs(), locals);     // Catch: Throwable -> L22
        this.providerCache = null;     // Catch: Throwable -> L22
        if (getInserting() == false) goto L19;
        if (force == true) goto L19;
        this.writerHasAProvider = true;     // Catch: Throwable -> L22
        Anchor anchor = this.writer.anchor(this.writer.parent(this.writer.getParent()));     // Catch: Throwable -> L22
        MovableContentStateReference reference = new MovableContentStateReference(r13, parameter, getComposition(), this.insertTable, anchor, CollectionsKt.emptyList(), currentCompositionLocalScope(), null);     // Catch: Throwable -> L22
        this.parentContext.insertMovableContent$runtime_release(reference);     // Catch: Throwable -> L22
    L20:
        endGroup();
        this.providerCache = null;
        this.compoundKeyHash = savedCompoundKeyHash;
        endMovableGroup();
        return;
    L19:
        boolean savedProvidersInvalid = this.providersInvalid;     // Catch: Throwable -> L22
        this.providersInvalid = providersChanged;     // Catch: Throwable -> L22
        Utils_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new AnonymousClass1(r13, parameter)));     // Catch: Throwable -> L22
        this.providersInvalid = savedProvidersInvalid;     // Catch: Throwable -> L22
        goto L20
    L10:
        if (Intrinsics.areEqual(this.reader.getGroupAux(), locals) == true) goto L12;
        r1 = true;
    L22:
        th = move-exception;
        endGroup();
        this.providerCache = null;
        this.compoundKeyHash = savedCompoundKeyHash;
        endMovableGroup();
        throw th;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> r3) {
        insertMovableContentGuarded(r3);     // Catch: Throwable -> L6
        cleanUpCompose();
        return;
    L6:
        th = move-exception;
        abortRoot();
        throw th;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> r51) {
        ComposerChangeListWriter this_$iv = this.changeListWriter;
        ChangeList newChangeList$iv = this.lateChanges;
        int $i$f$withChangeList = 0;
        ChangeList previousChangeList$iv = this_$iv.getChangeList();
        this_$iv.setChangeList(newChangeList$iv);     // Catch: Throwable -> L111
        int r13 = 0;
        this.changeListWriter.resetSlots();     // Catch: Throwable -> L111
        int r2 = r51.size();     // Catch: Throwable -> L111
        int index$iv = 0;
    L5:
        if (index$iv >= r2) goto L106;
        Object item$iv = r51.get(index$iv);     // Catch: Throwable -> L111
        Pair<MovableContentStateReference, MovableContentStateReference> r4 = (Pair) item$iv;     // Catch: Throwable -> L111
        final MovableContentStateReference to = r4.component1();     // Catch: Throwable -> L111
        MovableContentStateReference from = r4.component2();     // Catch: Throwable -> L111
        Anchor anchor = to.getAnchor$runtime_release();     // Catch: Throwable -> L111
        int location = to.getSlotTable$runtime_release().anchorIndex(anchor);     // Catch: Throwable -> L111
        int r18 = r2;
        int index$iv2 = index$iv;
        IntRef effectiveNodeIndex = new IntRef(0, 1, null);     // Catch: Throwable -> L111
        this.changeListWriter.determineMovableContentNodeIndex(effectiveNodeIndex, anchor);     // Catch: Throwable -> L111
        if (from != null) goto L30;
        SlotTable toSlotTable = to.getSlotTable$runtime_release();     // Catch: Throwable -> L111
        if (Intrinsics.areEqual(toSlotTable, this.insertTable) == true) goto L132;
    L14:
        final SlotReader reader$iv = to.getSlotTable$runtime_release().openReader();     // Catch: Throwable -> L111
        reader$iv.reposition(location);     // Catch: Throwable -> L26
        this.changeListWriter.moveReaderToAbsolute(location);     // Catch: Throwable -> L26
        final ChangeList offsetChanges = new ChangeList();     // Catch: Throwable -> L26
        recomposeMovableContent$default(this, null, null, null, null, new ComposerImpl$insertMovableContentGuarded$1$1$1$1(this, offsetChanges, reader$iv, to), 15, null);     // Catch: Throwable -> L22
        this.changeListWriter.includeOperationsIn(offsetChanges, effectiveNodeIndex);     // Catch: Throwable -> L22
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L22
        reader$iv.close();     // Catch: Throwable -> L109
    L70:
        this.changeListWriter.skipToEndOfCurrentGroup();     // Catch: Throwable -> L109
        index$iv = index$iv2 + 1;
        r2 = r18;
        newChangeList$iv = newChangeList$iv;
        $i$f$withChangeList = $i$f$withChangeList;
        r13 = r13;
    L109:
        th = th;
    L113:
        this_$iv.setChangeList(previousChangeList$iv);
        throw th;
    L22:
        th = th;
    L28:
        reader$iv.close();     // Catch: Throwable -> L109
        throw th;     // Catch: Throwable -> L109
    L24:
        th = th;
    L26:
        th = th;
        goto L28
    L132:
        createFreshInsertTable();     // Catch: Throwable -> L12
    L12:
        th = th;
        goto L113
    L30:
        MovableContentState resolvedState = this.parentContext.movableContentStateResolve$runtime_release(from);     // Catch: Throwable -> L109
        if (resolvedState == null) goto L34;
        SlotTable r3 = resolvedState.getSlotTable$runtime_release();     // Catch: Throwable -> L109
        if (r3 == null) goto L34;
    L35:
        SlotTable fromTable = r3;
        if (resolvedState == null) goto L41;
        SlotTable r5 = resolvedState.getSlotTable$runtime_release();     // Catch: Throwable -> L109
        if (r5 == null) goto L41;
        Anchor fromAnchor = r5.anchor(0);     // Catch: Throwable -> L109
        if (fromAnchor == null) goto L41;
    L42:
        List<? extends Object> r6 = ComposerKt.access$collectNodesFrom(fromTable, fromAnchor);     // Catch: Throwable -> L109
        if (r6.isEmpty() == true) goto L47;
        this.changeListWriter.copyNodesToNewAnchorLocation(r6, effectiveNodeIndex);     // Catch: Throwable -> L109
        if (Intrinsics.areEqual(to.getSlotTable$runtime_release(), this.slotTable) == false) goto L47;
        int group = this.slotTable.anchorIndex(anchor);     // Catch: Throwable -> L109
        updateNodeCount(group, updatedNodeCount(group) + r6.size());     // Catch: Throwable -> L109
    L47:
        this.changeListWriter.copySlotTableToAnchorLocation(resolvedState, this.parentContext, from, to);     // Catch: Throwable -> L109
        SlotReader reader$iv2 = fromTable.openReader();     // Catch: Throwable -> L109
        SlotReader savedReader$iv = getReader$runtime_release();     // Catch: Throwable -> L102
        int[] savedCountOverrides$iv = access$getNodeCountOverrides$p(this);     // Catch: Throwable -> L102
        MutableIntObjectMap savedProviderUpdates$iv = access$getProviderUpdates$p(this);     // Catch: Throwable -> L102
        access$setNodeCountOverrides$p(this, null);     // Catch: Throwable -> L102
        access$setProviderUpdates$p(this, null);     // Catch: Throwable -> L102
        setReader$runtime_release(reader$iv2);     // Catch: Throwable -> L96
        int newLocation = fromTable.anchorIndex(fromAnchor);     // Catch: Throwable -> L96
        reader$iv2.reposition(newLocation);     // Catch: Throwable -> L94
        this.changeListWriter.moveReaderToAbsolute(newLocation);     // Catch: Throwable -> L94
        ChangeList offsetChanges2 = new ChangeList();     // Catch: Throwable -> L94
        ComposerChangeListWriter this_$iv2 = this.changeListWriter;     // Catch: Throwable -> L94
        ChangeList previousChangeList$iv2 = this_$iv2.getChangeList();     // Catch: Throwable -> L94
        this_$iv2.setChangeList(offsetChanges2);     // Catch: Throwable -> L88
        ComposerChangeListWriter this_$iv3 = this.changeListWriter;     // Catch: Throwable -> L88
        boolean previousImplicitRootStart$iv = this_$iv3.getImplicitRootStart();     // Catch: Throwable -> L88
        this_$iv3.setImplicitRootStart(false);     // Catch: Throwable -> L82
        ComposerImpl this_$iv4 = this;
        recomposeMovableContent(from.getComposition$runtime_release(), to.getComposition$runtime_release(), Integer.valueOf(reader$iv2.getCurrentGroup()), from.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(this, to));     // Catch: Throwable -> L76
        this_$iv3.setImplicitRootStart(previousImplicitRootStart$iv);     // Catch: Throwable -> L74
        this_$iv2.setChangeList(previousChangeList$iv2);     // Catch: Throwable -> L72
        this.changeListWriter.includeOperationsIn(offsetChanges2, effectiveNodeIndex);     // Catch: Throwable -> L72
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L72
        this_$iv4.setReader$runtime_release(savedReader$iv);     // Catch: Throwable -> L100
        access$setNodeCountOverrides$p(this_$iv4, savedCountOverrides$iv);     // Catch: Throwable -> L100
        access$setProviderUpdates$p(this_$iv4, savedProviderUpdates$iv);     // Catch: Throwable -> L100
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L100
        reader$iv2.close();     // Catch: Throwable -> L109
    L100:
        th = th;
    L104:
        reader$iv2.close();     // Catch: Throwable -> L109
        throw th;     // Catch: Throwable -> L109
    L72:
        th = th;
        savedReader$iv = savedReader$iv;
        savedCountOverrides$iv = savedCountOverrides$iv;
        savedProviderUpdates$iv = savedProviderUpdates$iv;
    L98:
        this_$iv4.setReader$runtime_release(savedReader$iv);     // Catch: Throwable -> L100
        access$setNodeCountOverrides$p(this_$iv4, savedCountOverrides$iv);     // Catch: Throwable -> L100
        access$setProviderUpdates$p(this_$iv4, savedProviderUpdates$iv);     // Catch: Throwable -> L100
        throw th;     // Catch: Throwable -> L100
    L74:
        th = th;
        savedReader$iv = savedReader$iv;
        savedCountOverrides$iv = savedCountOverrides$iv;
        savedProviderUpdates$iv = savedProviderUpdates$iv;
        previousChangeList$iv2 = previousChangeList$iv2;
    L146:
        this_$iv2.setChangeList(previousChangeList$iv2);     // Catch: Throwable -> L92
        throw th;     // Catch: Throwable -> L92
    L92:
        th = th;
    L76:
        th = th;
    L150:
        this_$iv3.setImplicitRootStart(previousImplicitRootStart$iv);     // Catch: Throwable -> L86
        throw th;     // Catch: Throwable -> L86
    L86:
        th = th;
    L78:
        th = th;
        this_$iv4 = this;
    L80:
        th = th;
        this_$iv4 = this;
    L82:
        th = th;
        this_$iv4 = this;
    L88:
        th = th;
        savedReader$iv = savedReader$iv;
        savedCountOverrides$iv = savedCountOverrides$iv;
        previousChangeList$iv2 = previousChangeList$iv2;
        this_$iv4 = this;
        savedProviderUpdates$iv = savedProviderUpdates$iv;
    L94:
        th = th;
        savedReader$iv = savedReader$iv;
        savedCountOverrides$iv = savedCountOverrides$iv;
        this_$iv4 = this;
        savedProviderUpdates$iv = savedProviderUpdates$iv;
    L96:
        th = th;
        savedReader$iv = savedReader$iv;
        savedCountOverrides$iv = savedCountOverrides$iv;
        this_$iv4 = this;
        savedProviderUpdates$iv = savedProviderUpdates$iv;
    L102:
        th = th;
    L41:
        fromAnchor = from.getAnchor$runtime_release();     // Catch: Throwable -> L109
    L34:
        r3 = from.getSlotTable$runtime_release();     // Catch: Throwable -> L109
        goto L35
    L106:
        this.changeListWriter.endMovableContentPlacement();     // Catch: Throwable -> L109
        this.changeListWriter.moveReaderToAbsolute(0);     // Catch: Throwable -> L109
        this_$iv.setChangeList(previousChangeList$iv);
        return;
    L111:
        th = th;
        goto L113
    }

    private final <R> R withReader(SlotReader reader, Function0<? extends R> r7) {
        SlotReader savedReader = getReader$runtime_release();
        int[] savedCountOverrides = access$getNodeCountOverrides$p(this);
        MutableIntObjectMap savedProviderUpdates = access$getProviderUpdates$p(this);
        access$setNodeCountOverrides$p(this, null);
        access$setProviderUpdates$p(this, null);
        setReader$runtime_release(reader);     // Catch: Throwable -> L6
        R r4 = r7.invoke();     // Catch: Throwable -> L6
        setReader$runtime_release(savedReader);
        access$setNodeCountOverrides$p(this, savedCountOverrides);
        access$setProviderUpdates$p(this, savedProviderUpdates);
        return r4;
    L6:
        th = move-exception;
        setReader$runtime_release(savedReader);
        access$setNodeCountOverrides$p(this, savedCountOverrides);
        access$setProviderUpdates$p(this, savedProviderUpdates);
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl r1, ControlledComposition r2, ControlledComposition r3, Integer r4, List r5, Function0 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = CollectionsKt.emptyList();
    L15:
        return r1.recomposeMovableContent(r2, r3, r4, r5, r6);
    }

    private final <R> R recomposeMovableContent(ControlledComposition r12, ControlledComposition r13, Integer r14, List<? extends Pair<RecomposeScopeImpl, ? extends Object>> r15, Function0<? extends R> r16) {
        boolean r1 = this.isComposing;
        int r2 = this.nodeIndex;
        this.isComposing = true;     // Catch: Throwable -> L26
        this.nodeIndex = 0;     // Catch: Throwable -> L26
        int r4 = 0;
        int r5 = r15.size();     // Catch: Throwable -> L26
    L4:
        if (r4 >= r5) goto L11;
        Pair<RecomposeScopeImpl, ? extends Object> r7 = r15.get(r4);     // Catch: Throwable -> L26
        RecomposeScopeImpl r9 = r7.component1();     // Catch: Throwable -> L26
        Object r8 = r7.component2();     // Catch: Throwable -> L26
        if (r8 == null) goto L8;
        tryImminentInvalidation$runtime_release(r9, r8);     // Catch: Throwable -> L26
    L9:
        r4 = r4 + 1;     // Catch: Throwable -> L26
        goto L4
    L8:
        tryImminentInvalidation$runtime_release(r9, null);     // Catch: Throwable -> L26
        goto L9
    L11:
        if (r12 == null) goto L20;
        if (r14 == null) goto L15;
        int r0 = r14.intValue();     // Catch: Throwable -> L26
    L16:
        Function0<? extends R> r3 = r16;
        R r6 = (R) r12.delegateInvalidations(r13, r0, r3);
        if (r6 == null) goto L21;
    L22:
        this.isComposing = r1;
        this.nodeIndex = r2;
        return r6;
    L21:
        r6 = r3.invoke();     // Catch: Throwable -> L24
    L24:
        th = th;
    L28:
        this.isComposing = r1;
        this.nodeIndex = r2;
        throw th;
    L15:
        r0 = -1;
        goto L16
    L20:
        r3 = r16;
    L26:
        th = th;
        goto L28
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String sourceInformation) {
        if (getInserting() == true) goto L5;
        return;
    L5:
        if (this.sourceMarkersEnabled == false) goto L9;
        this.writer.recordGroupSourceInformation(sourceInformation);
        return;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, String sourceInformation) {
        if (getInserting() == true) goto L5;
        return;
    L5:
        if (this.sourceMarkersEnabled == false) goto L9;
        this.writer.recordGrouplessCallSourceInformationStart(key, sourceInformation);
        return;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() == true) goto L5;
        return;
    L5:
        if (this.sourceMarkersEnabled == false) goto L9;
        this.writer.recordGrouplessCallSourceInformationEnd();
        return;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceMarkersEnabled = false;
    }

    /* JADX INFO: renamed from: composeContent--ZbOJvo$runtime_release, reason: not valid java name */
    public final void m3749composeContentZbOJvo$runtime_release(MutableScatterMap<Object, Object> r4, Function2<? super Composer, ? super Integer, Unit> r5, ShouldPauseCallback shouldPause) {
        boolean value$iv = this.changes.isEmpty();
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
    L5:
        this.shouldPauseCallback = shouldPause;
        m3747doComposeaFTiNEg(r4, r5);     // Catch: Throwable -> L9
        this.shouldPauseCallback = null;
        return;
    L9:
        th = move-exception;
        this.shouldPauseCallback = null;
        throw th;
    }

    public final void prepareCompose$runtime_release(Function0<Unit> r5) {
        boolean value$iv = !this.isComposing;
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
    L5:
        this.isComposing = true;
        r5.invoke();     // Catch: Throwable -> L9
        this.isComposing = false;
        return;
    L9:
        th = move-exception;
        this.isComposing = false;
        throw th;
    }

    /* JADX INFO: renamed from: recompose-aFTiNEg$runtime_release, reason: not valid java name */
    public final boolean m3750recomposeaFTiNEg$runtime_release(MutableScatterMap<Object, Object> r4, ShouldPauseCallback shouldPause) {
        boolean value$iv = this.changes.isEmpty();
        if (value$iv == true) goto L6;
        ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
    L6:
        if (ScopeMap.m3913getSizeimpl(r4) <= 0) goto L8;
    L14:
        this.shouldPauseCallback = shouldPause;
        m3747doComposeaFTiNEg(r4, null);     // Catch: Throwable -> L18
        this.shouldPauseCallback = null;
        return this.changes.isNotEmpty();
    L18:
        th = move-exception;
        this.shouldPauseCallback = null;
        throw th;
    L8:
        if (this.invalidations.isEmpty() == false) goto L14;
        if (this.forciblyRecompose == true) goto L14;
        return false;
    }

    /* JADX INFO: renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    public final void m3751updateComposerInvalidationsRY85e9Y(MutableScatterMap<Object, Object> r31) {
        MutableScatterMap<Object, Object> this_$iv = r31;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        ScatterMap this_$iv$iv = this_$iv;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L34;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L26;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        boolean r19 = false;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L24;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r18 = r2;
        Object scope = k$iv[index$iv$iv];
        Object instances = v$iv[index$iv$iv];
        Object[] k$iv2 = k$iv;
        Intrinsics.checkNotNull(scope, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        RecomposeScopeImpl r3 = (RecomposeScopeImpl) scope;
        Anchor r4 = ((RecomposeScopeImpl) scope).getAnchor();
        if (r4 == null) goto L25;
        int location = r4.getLocation$runtime_release();
        List<Invalidation> r5 = this.invalidations;
        RecomposeScopeImpl r6 = (RecomposeScopeImpl) scope;
        if (instances != ScopeInvalidated.INSTANCE) goto L18;
        r19 = true;
    L18:
        if (r19 == true) goto L20;
        Object r7 = instances;
    L21:
        r5.add(new Invalidation(r6, location, r7));
        goto L25
    L20:
        r7 = null;
    L25:
        slot$iv$iv = slot$iv$iv >> r18;
        j$iv$iv = j$iv$iv + 1;
        r2 = r18;
        k$iv = k$iv2;
        v$iv = v$iv;
        this_$iv$iv = this_$iv$iv;
        $i$f$forEachIndexed = $i$f$forEachIndexed;
        goto L7
    L24:
        r18 = r2;
        k$iv2 = k$iv;
        goto L25
    L11:
        r13 = false;
        goto L12
    L26:
        Object[] k$iv3 = k$iv;
        Object[] v$iv2 = v$iv;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        if (bitCount$iv$iv != r2) goto L34;
    L30:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv3;
        v$iv = v$iv2;
        this_$iv$iv = this_$iv$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        goto L4
    L29:
        k$iv3 = k$iv;
        v$iv2 = v$iv;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
    L34:
        CollectionsKt.sortWith(this.invalidations, ComposerKt.access$getInvalidationLocationAscending$p());
    }

    /* JADX INFO: renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m3747doComposeaFTiNEg(MutableScatterMap<Object, Object> r18, Function2<? super Composer, ? super Integer, Unit> r19) {
        boolean value$iv = !this.isComposing;
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
    L5:
        Object token$iv = Trace.INSTANCE.beginSection("Compose:recompose");
        this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());     // Catch: Throwable -> L38
        this.providerUpdates = null;     // Catch: Throwable -> L38
        m3751updateComposerInvalidationsRY85e9Y(r18);     // Catch: Throwable -> L38
        this.nodeIndex = 0;     // Catch: Throwable -> L38
        this.isComposing = true;     // Catch: Throwable -> L38
        startRoot();     // Catch: Throwable -> L35
        Object savedContent = nextSlot();     // Catch: Throwable -> L35
        if (savedContent == r19) goto L11;
        if (r19 == null) goto L11;
        updateValue(r19);     // Catch: Throwable -> L35
    L11:
        DerivedStateObserver observer$iv = this.derivedStateObserver;     // Catch: Throwable -> L35
        MutableVector<DerivedStateObserver> r0 = SnapshotStateKt.derivedStateObservers();     // Catch: Throwable -> L35
        r0.add(observer$iv);     // Catch: Throwable -> L31
        if (r19 == null) goto L17;
        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());     // Catch: Throwable -> L31
        Utils_jvmKt.invokeComposable(this, r19);     // Catch: Throwable -> L31
        endGroup();     // Catch: Throwable -> L31
    L26:
        r0.removeAt(r0.getSize() - 1);     // Catch: Throwable -> L35
        endRoot();     // Catch: Throwable -> L35
        this.isComposing = false;     // Catch: Throwable -> L38
        this.invalidations.clear();     // Catch: Throwable -> L38
        createFreshInsertTable();     // Catch: Throwable -> L38
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L38
        Trace.INSTANCE.endSection(token$iv);
        return;
    L17:
        if (this.forciblyRecompose == false) goto L19;
    L20:
        if (savedContent != null) goto L22;
    L24:
        skipCurrentGroup();     // Catch: Throwable -> L31
        goto L26
    L22:
        if (Intrinsics.areEqual(savedContent, Composer.Companion.getEmpty()) == true) goto L24;
        startGroup(ComposerKt.invocationKey, ComposerKt.getInvocation());     // Catch: Throwable -> L31
        Utils_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(savedContent, 2));     // Catch: Throwable -> L31
        endGroup();     // Catch: Throwable -> L31
        goto L26
    L19:
        if (this.providersInvalid == false) goto L24;
    L31:
        th = move-exception;
        r0.removeAt(r0.getSize() - 1);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        this.isComposing = false;     // Catch: Throwable -> L38
        this.invalidations.clear();     // Catch: Throwable -> L38
        abortRoot();     // Catch: Throwable -> L38
        createFreshInsertTable();     // Catch: Throwable -> L38
        throw th;     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv);
        throw th;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final Object getNode(SlotReader $this$node) {
        return $this$node.node($this$node.getParent());
    }

    private final Object nodeAt(SlotReader $this$nodeAt, int index) {
        return $this$nodeAt.node(index);
    }

    private final void validateNodeExpected() {
        boolean value$iv = this.nodeExpected;
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
    L5:
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        boolean value$iv = !this.nodeExpected;
        if (value$iv == true) goto L7;
        ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        return;
    }

    private final void recordInsert(Anchor anchor) {
        boolean r0 = this.insertFixups.isEmpty();
        ComposerChangeListWriter r1 = this.changeListWriter;
        if (r0 == false) goto L5;
        r1.insertSlots(anchor, this.insertTable);
        return;
    L5:
        r1.insertSlots(anchor, this.insertTable, this.insertFixups);
        this.insertFixups = new FixupList();
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(ComposerImpl this$0, int group, List<MovableContentStateReference> r22) {
        Object r2 = this$0.reader.groupObjectKey(group);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) r2;
        Object parameter = this$0.reader.groupGet(group, 0);
        Anchor anchor = this$0.reader.anchor(group);
        int end = this$0.reader.groupSize(group) + group;
        List $this$fastMap$iv = ComposerKt.access$filterToRange(this$0.invalidations, group, end);
        List target$iv = new ArrayList($this$fastMap$iv.size());
        int index$iv$iv = 0;
        int r12 = $this$fastMap$iv.size();
    L3:
        if (index$iv$iv >= r12) goto L5;
        Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
        Invalidation it = (Invalidation) item$iv$iv;
        int end2 = end;
        List $this$fastMap$iv2 = $this$fastMap$iv;
        target$iv.add(TuplesKt.to(it.getScope(), it.getInstances()));
        index$iv$iv = index$iv$iv + 1;
        end = end2;
        $this$fastMap$iv = $this$fastMap$iv2;
        goto L3
    L5:
        List invalidations = target$iv;
        MovableContentStateReference reference = new MovableContentStateReference(movableContent, parameter, this$0.getComposition(), this$0.slotTable, anchor, invalidations, this$0.currentCompositionLocalScope(group), r22);
        return reference;
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(ComposerImpl this$0, int group) {
        int key = this$0.reader.groupKey(group);
        Object objectKey = this$0.reader.groupObjectKey(group);
        List nestedStates = null;
        if (key == 126665345) goto L5;
        return null;
    L5:
        if ((objectKey instanceof MovableContent) == true) goto L7;
        return null;
    L7:
        if (this$0.reader.containsMark(group) == false) goto L15;
        List nestedStates2 = new ArrayList();
        reportFreeMovableContent$movableContentReferenceFor$traverseGroups(this$0, nestedStates2, group);
        if (nestedStates2.isEmpty() == true) goto L15;
        nestedStates = nestedStates2;
    L15:
        return reportFreeMovableContent$createMovableContentReferenceForGroup(this$0, group, nestedStates);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(ComposerImpl this$0, List<MovableContentStateReference> r6, int group) {
        int size = this$0.reader.groupSize(group);
        int end = group + size;
        int current = group + 1;
    L3:
        if (current >= end) goto L13;
        if (this$0.reader.hasMark(current) == false) goto L10;
        MovableContentStateReference it = reportFreeMovableContent$movableContentReferenceFor(this$0, current);
        if (it == null) goto L12;
        r6.add(it);
    L12:
        current = current + this$0.reader.groupSize(current);
        goto L3
    L10:
        if (this$0.reader.containsMark(current) == false) goto L12;
        reportFreeMovableContent$movableContentReferenceFor$traverseGroups(this$0, r6, current);
        goto L12
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl this$0, int $groupBeingRemoved, int group, boolean needsNodeDelete, int nodeIndex) {
        SlotReader reader = this$0.reader;
        if (reader.hasMark(group) == false) goto L35;
        int key = reader.groupKey(group);
        Object objectKey = reader.groupObjectKey(group);
        if (key != 126665345) goto L16;
        if ((objectKey instanceof MovableContent) == false) goto L16;
        MovableContentStateReference reference = reportFreeMovableContent$movableContentReferenceFor(this$0, group);
        if (reference == null) goto L11;
        this$0.parentContext.deletedMovableContent$runtime_release(reference);
        this$0.changeListWriter.recordSlotEditing();
        this$0.changeListWriter.releaseMovableGroupAtCurrent(this$0.getComposition(), this$0.parentContext, reference);
    L11:
        if (needsNodeDelete == false) goto L68;
        if (group == $groupBeingRemoved) goto L68;
        this$0.changeListWriter.endNodeMovementAndDeleteNode(nodeIndex, group);
        return 0;
    L68:
        return reader.nodeCount(group);
    L16:
        if (key != 206) goto L31;
        if (Intrinsics.areEqual(objectKey, ComposerKt.getReference()) == false) goto L31;
        Object r6 = reader.groupGet(group, 0);
        if ((r6 instanceof CompositionContextHolder) == false) goto L22;
        CompositionContextHolder contextHolder = (CompositionContextHolder) r6;
    L23:
        if (contextHolder == null) goto L69;
        CompositionContextImpl compositionContext = contextHolder.getRef();
        Iterable $this$forEach$iv = compositionContext.getComposers();
        Iterator r11 = $this$forEach$iv.iterator();
    L26:
        if (r11.hasNext() == false) goto L69;
        Object element$iv = r11.next();
        ComposerImpl composer = (ComposerImpl) element$iv;
        composer.reportAllMovableContent();
        this$0.parentContext.reportRemovedComposition$runtime_release(composer.getComposition());
    L69:
        return reader.nodeCount(group);
    L22:
        contextHolder = null;
    L31:
        if (reader.isNode(group) == false) goto L71;
        return 1;
    L71:
        return reader.nodeCount(group);
    L35:
        if (reader.containsMark(group) == false) goto L59;
        int size = reader.groupSize(group);
        int end = group + size;
        int current = group + 1;
        int runningNodeCount = 0;
    L37:
        if (current >= end) goto L55;
        boolean isNode = reader.isNode(current);
        if (isNode == false) goto L42;
        this$0.changeListWriter.endNodeMovement();
        this$0.changeListWriter.moveDown(reader.node(current));
    L42:
        if (isNode == true) goto L46;
        if (needsNodeDelete == true) goto L46;
        boolean r12 = false;
    L47:
        if (isNode == false) goto L49;
        int r13 = 0;
    L50:
        runningNodeCount = runningNodeCount + reportFreeMovableContent$reportGroup(this$0, $groupBeingRemoved, current, r12, r13);
        if (isNode == false) goto L53;
        this$0.changeListWriter.endNodeMovement();
        this$0.changeListWriter.moveUp();
    L53:
        current = current + reader.groupSize(current);
        goto L37
    L49:
        r13 = nodeIndex + runningNodeCount;
    L46:
        r12 = true;
        goto L47
    L55:
        if (reader.isNode(group) == false) goto L73;
        return 1;
    L73:
        return runningNodeCount;
    L59:
        if (reader.isNode(group) == false) goto L62;
        return 1;
    L62:
        return reader.nodeCount(group);
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        boolean rootIsNode = this.reader.isNode(groupBeingRemoved);
        if (rootIsNode == false) goto L5;
        this.changeListWriter.endNodeMovement();
        this.changeListWriter.moveDown(this.reader.node(groupBeingRemoved));
    L5:
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, groupBeingRemoved, rootIsNode, 0);
        this.changeListWriter.endNodeMovement();
        if (rootIsNode == false) goto L9;
        this.changeListWriter.moveUp();
        return;
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark() == false) goto L15;
        ControlledComposition r0 = getComposition();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        ((CompositionImpl) r0).updateMovingInvalidations$runtime_release();
        ChangeList changes = new ChangeList();
        this.deferredChanges = changes;
        SlotReader reader$iv = this.slotTable.openReader();
        this.reader = reader$iv;     // Catch: Throwable -> L12
        ComposerChangeListWriter this_$iv = this.changeListWriter;     // Catch: Throwable -> L12
        ChangeList previousChangeList$iv = this_$iv.getChangeList();     // Catch: Throwable -> L12
        this_$iv.setChangeList(changes);     // Catch: Throwable -> L9
        reportFreeMovableContent(0);     // Catch: Throwable -> L9
        this.changeListWriter.releaseMovableContent();     // Catch: Throwable -> L9
        this_$iv.setChangeList(previousChangeList$iv);     // Catch: Throwable -> L12
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L12
        reader$iv.close();
        return;
    L9:
        th = move-exception;
        this_$iv.setChangeList(previousChangeList$iv);     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        reader$iv.close();
        throw th;
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        boolean value$iv = Stack.m3798isEmptyimpl(this.pendingStack);
        if (value$iv == true) goto L5;
        ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
    L5:
        cleanUpCompose();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m3791clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) {
        if (dataKey != null) goto L12;
        if (data != null) goto L6;
    L10:
        int $this$rol$iv$iv = getCompoundKeyHash();
        int $this$rol$iv$iv2 = Integer.rotateLeft($this$rol$iv$iv, 3) ^ groupKey;
        int $this$rol$iv$iv3 = Integer.rotateLeft($this$rol$iv$iv2, 3) ^ rGroupIndex;
        this.compoundKeyHash = $this$rol$iv$iv3;
        return;
    L6:
        if (groupKey != 207) goto L10;
        if (Intrinsics.areEqual(data, Composer.Companion.getEmpty()) == true) goto L10;
        int keyHash$iv = data.hashCode();
        int $this$rol$iv$iv4 = getCompoundKeyHash();
        int $this$rol$iv$iv5 = Integer.rotateLeft($this$rol$iv$iv4, 3) ^ keyHash$iv;
        int $this$rol$iv$iv6 = Integer.rotateLeft($this$rol$iv$iv5, 3) ^ rGroupIndex;
        this.compoundKeyHash = $this$rol$iv$iv6;
        return;
    L12:
        if ((dataKey instanceof Enum) == false) goto L14;
        int keyHash$iv2 = ((Enum) dataKey).ordinal();
        int $this$rol$iv$iv7 = getCompoundKeyHash();
        int $this$rol$iv$iv8 = Integer.rotateLeft($this$rol$iv$iv7, 3) ^ keyHash$iv2;
        int $this$rol$iv$iv9 = Integer.rotateLeft($this$rol$iv$iv8, 3) ^ 0;
        this.compoundKeyHash = $this$rol$iv$iv9;
        return;
    L14:
        int keyHash$iv3 = dataKey.hashCode();
        int $this$rol$iv$iv10 = getCompoundKeyHash();
        int $this$rol$iv$iv11 = Integer.rotateLeft($this$rol$iv$iv10, 3) ^ keyHash$iv3;
        int $this$rol$iv$iv12 = Integer.rotateLeft($this$rol$iv$iv11, 3) ^ 0;
        this.compoundKeyHash = $this$rol$iv$iv12;
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash, int rGroupIndex) {
        int $this$rol$iv = getCompoundKeyHash();
        int $this$rol$iv2 = Integer.rotateLeft($this$rol$iv, 3) ^ keyHash;
        int $this$rol$iv3 = Integer.rotateLeft($this$rol$iv2, 3) ^ rGroupIndex;
        this.compoundKeyHash = $this$rol$iv3;
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, int rGroupIndex, Object dataKey, Object data) {
        if (dataKey != null) goto L12;
        if (data != null) goto L6;
    L10:
        int $this$ror$iv$iv = getCompoundKeyHash() ^ rGroupIndex;
        int r6 = Integer.rotateRight($this$ror$iv$iv, 3);
        int $this$ror$iv$iv2 = Integer.hashCode(groupKey);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv2 ^ r6, 3);
        return;
    L6:
        if (groupKey != 207) goto L10;
        if (Intrinsics.areEqual(data, Composer.Companion.getEmpty()) == true) goto L10;
        int groupKey$iv = data.hashCode();
        int $this$ror$iv$iv3 = getCompoundKeyHash() ^ rGroupIndex;
        int r7 = Integer.rotateRight($this$ror$iv$iv3, 3);
        int $this$ror$iv$iv4 = Integer.hashCode(groupKey$iv);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv4 ^ r7, 3);
        return;
    L12:
        if ((dataKey instanceof Enum) == false) goto L14;
        int groupKey$iv2 = ((Enum) dataKey).ordinal();
        int $this$ror$iv$iv5 = getCompoundKeyHash() ^ 0;
        int r8 = Integer.rotateRight($this$ror$iv$iv5, 3);
        int $this$ror$iv$iv6 = Integer.hashCode(groupKey$iv2);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv6 ^ r8, 3);
        return;
    L14:
        int groupKey$iv3 = dataKey.hashCode();
        int $this$ror$iv$iv7 = getCompoundKeyHash() ^ 0;
        int r9 = Integer.rotateRight($this$ror$iv$iv7, 3);
        int $this$ror$iv$iv8 = Integer.hashCode(groupKey$iv3);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv$iv8 ^ r9, 3);
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey, int rGroupIndex) {
        int $this$ror$iv = getCompoundKeyHash() ^ rGroupIndex;
        int r4 = Integer.rotateRight($this$ror$iv, 3);
        int $this$ror$iv2 = Integer.hashCode(groupKey);
        this.compoundKeyHash = Integer.rotateRight($this$ror$iv2 ^ r4, 3);
    }

    public final int stacksSize$runtime_release() {
        IntStack this_$iv = this.entersStack;
        int r0 = this_$iv.tos + Stack.m3796getSizeimpl(this.invalidateStack);
        IntStack this_$iv2 = this.providersInvalidStack;
        int r1 = (r0 + this_$iv2.tos) + Stack.m3796getSizeimpl(this.pendingStack);
        IntStack this_$iv3 = this.parentStateStack;
        return r1 + this_$iv3.tos;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl r0 = getCurrentRecomposeScope$runtime_release();
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getAnchor();
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object value) {
        updateCachedValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope scope) {
        if ((scope instanceof RecomposeScopeImpl) == false) goto L5;
        RecomposeScopeImpl r0 = (RecomposeScopeImpl) scope;
    L6:
        if (r0 == null) goto L10;
        r0.setUsed(true);
        return;
    L10:
        return;
    L5:
        r0 = null;
        goto L6
    }
}
