package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSet;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterMap;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 å\u00012\u00020\u0001:\nã\u0001ä\u0001å\u0001æ\u0001ç\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010r\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020+2\u0006\u0010u\u001a\u00020\u00062\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J\u0010\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020&H\u0002J\u0010\u0010{\u001a\u00020\"H\u0080@¢\u0006\u0004\b|\u0010}J=\u0010~\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u007f\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J/\u0010~\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u00122\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\t\u0010\u0087\u0001\u001a\u00020\"H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u001a\u0010\u0089\u0001\u001a\u00020P2\u0006\u0010s\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0003J\u0013\u0010\u008b\u0001\u001a\u0004\u0018\u00010+2\u0006\u0010s\u001a\u00020\u0012H\u0002JC\u0010\u008c\u0001\u001a\u00020P2\u0006\u0010s\u001a\u00020\u00122\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0003\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00152\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0000¢\u0006\u0003\b\u0095\u0001J\u0014\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0012\u0010\u009a\u0001\u001a\u00020\u00122\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020\u00122\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0016\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010z\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J \u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010z\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010 \u0001\u001a\u00020\u0012H\u0002J#\u0010¡\u0001\u001a\u00020\u00122\b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030£\u0001H\u0001¢\u0006\u0003\b¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u0012\u0010§\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u0001H\u0002J\u0012\u0010¨\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0002J\u0018\u0010ª\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0000¢\u0006\u0003\b«\u0001J\u000f\u0010¬\u0001\u001a\u00020\"H\u0000¢\u0006\u0003\b\u00ad\u0001J$\u0010®\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u00122\u0007\u0010¯\u0001\u001a\u00020\u00122\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J#\u0010°\u0001\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020+2\b\u0010±\u0001\u001a\u00030\u009b\u0001H\u0002J!\u0010²\u0001\u001a\u00020\u00152\u0007\u0010³\u0001\u001a\u00020\u00122\r\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020d01H\u0002J\u0011\u0010µ\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u0012H\u0002J\u0012\u0010¶\u0001\u001a\u00020\"2\u0007\u0010·\u0001\u001a\u00020dH\u0002J\u0012\u0010¸\u0001\u001a\u00020\u00122\u0007\u0010³\u0001\u001a\u00020\u0012H\u0002J\u001c\u0010¹\u0001\u001a\u00020\"2\b\u0010º\u0001\u001a\u00030\u009b\u00012\u0007\u0010»\u0001\u001a\u00020_H\u0002J\u0012\u0010¼\u0001\u001a\u00020\u00152\u0007\u0010\u0093\u0001\u001a\u00020PH\u0002J@\u0010½\u0001\u001a\u00020\u00152\u0006\u0010s\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00122\u000b\b\u0002\u0010¾\u0001\u001a\u0004\u0018\u00010\u00122\u0011\b\u0002\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000101H\u0002¢\u0006\u0003\u0010À\u0001J&\u0010Á\u0001\u001a\u00020\"2\u0007\u0010Â\u0001\u001a\u00020\u00122\u0007\u0010¾\u0001\u001a\u00020\u00122\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010Ä\u0001\u001a\u00020\"2\u0007\u0010Â\u0001\u001a\u00020\u0012H\u0002J\u0018\u0010Å\u0001\u001a\u00020\"2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u001b\u0010Ç\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020k2\u0007\u0010È\u0001\u001a\u00020WH\u0002J\u0012\u0010É\u0001\u001a\u00020\"2\u0007\u0010©\u0001\u001a\u00020kH\u0002J-\u0010Ê\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u00012\u0007\u0010Ë\u0001\u001a\u00020\u00122\u0007\u0010Ì\u0001\u001a\u00020\u00122\u0007\u0010Í\u0001\u001a\u00020\u0015H\u0002J\u001a\u0010Î\u0001\u001a\u00020\"2\u0007\u0010z\u001a\u00030\u009b\u00012\u0006\u0010t\u001a\u00020+H\u0002J\u001a\u0010Ï\u0001\u001a\u00020\"2\u0007\u0010z\u001a\u00030\u009b\u00012\u0006\u0010t\u001a\u00020+H\u0002J\"\u0010Ð\u0001\u001a\u0005\u0018\u00010Ñ\u00012\n\u0010Ò\u0001\u001a\u0005\u0018\u00010\u009b\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0002J-\u0010Õ\u0001\u001a\u00020\u00152\u0007\u0010z\u001a\u00030\u009b\u00012\u0007\u0010 \u0001\u001a\u00020\u00122\u0007\u0010Ö\u0001\u001a\u00020\u00152\u0007\u0010×\u0001\u001a\u00020\u0015H\u0002J4\u0010Ø\u0001\u001a\u0005\u0018\u0001HÙ\u0001\"\t\b\u0000\u0010Ù\u0001*\u00020\u001f2\n\u0010\u0090\u0001\u001a\u0005\u0018\u0001HÙ\u00012\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0003\u0010Û\u0001J\u0011\u0010Ü\u0001\u001a\u00020\"2\u0006\u0010s\u001a\u00020\u0012H\u0002J\t\u0010Ý\u0001\u001a\u00020\"H\u0002J\u0011\u0010Þ\u0001\u001a\u0005\u0018\u00010ß\u0001*\u00030à\u0001H\u0002J\u0011\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001*\u00030ß\u0001H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010-\u001a&\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/ 0*\u0012\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/\u0018\u0001010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00107\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0014\u0010I\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0018R\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0K0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010L\u001a\u00060MR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010N\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00150O8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u00109\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010bR\u001a\u0010c\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\"0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020d0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020oX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006è\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ExtraDataTestTraversalAfterVal", "", "getExtraDataTestTraversalAfterVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "getExtraDataTestTraversalBeforeVal$ui_release", "SendRecurringAccessibilityEventsIntervalMillis", "", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "accessibilityCursorPosition", "", "accessibilityFocusedVirtualViewId", "value", "", "accessibilityForceEnabledForTesting", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "checkingForSemanticsChanges", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Landroidx/collection/IntObjectMap;", "currentSemanticsNodesInvalidated", "currentlyAccessibilityFocusedANI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "currentlyFocusedANI", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release$annotations", "()V", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Landroidx/collection/MutableIntIntMap;", "getIdToAfterMap$ui_release", "()Landroidx/collection/MutableIntIntMap;", "setIdToAfterMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToBeforeMap", "getIdToBeforeMap$ui_release", "setIdToBeforeMap$ui_release", "isEnabled", "isEnabled$ui_release", "isTouchExplorationEnabled", "labelToActionId", "Landroidx/collection/MutableObjectIntMap;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "onSendAccessibilityEvent", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "getOnSendAccessibilityEvent$ui_release$annotations", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "paneDisplayed", "Landroidx/collection/MutableIntSet;", "pendingHorizontalScrollEvents", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingVerticalScrollEvents", "previousSemanticsNodes", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scheduleScrollEventIfNeededLambda", "Landroidx/compose/ui/platform/ScrollObservationScope;", "scrollObservationScopes", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendingFocusAffectingEvent", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsInScreen", "Landroid/graphics/Rect;", "node", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScroll", "vertical", "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-moWRBKg", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "eventType", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "getAccessibilityNodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAccessibilitySelectionStart", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "scheduleScrollEventIfNeeded", "scrollObservationScope", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "sendTypeViewScrolledAccessibilityEvent", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setText", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", "T", "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "getTextForTextField", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "toSpannableString", "Landroid/text/SpannableString;", "Api24Impl", "Api29Impl", "Companion", "ComposeAccessibilityNodeProvider", "PendingTextTraversedEvent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int $stable = 0;
    private static final IntList AccessibilityActionsResourceIds = null;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final Companion Companion = null;
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private int hoveredVirtualViewId;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = null;

        static {
            INSTANCE = new Api24Impl();
        }

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L8;
            AccessibilityAction it = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
            if (it == null) goto L9;
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionSetProgress, it.getLabel()));
            return;
        L9:
            return;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = null;

        static {
            INSTANCE = new Api29Impl();
        }

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L22;
            int r1 = Role.Companion.m6182getCarouselo7Vup1c();
            if (role != null) goto L7;
            boolean r2 = false;
        L8:
            if (r2 == true) goto L23;
            AccessibilityAction it = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
            if (it == null) goto L12;
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, it.getLabel()));
        L12:
            AccessibilityAction it2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
            if (it2 == null) goto L15;
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, it2.getLabel()));
        L15:
            AccessibilityAction it3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
            if (it3 == null) goto L18;
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageLeft, it3.getLabel()));
        L18:
            AccessibilityAction it4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
            if (it4 == null) goto L24;
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageRight, it4.getLabel()));
            return;
        L24:
            return;
        L23:
            return;
        L7:
            r2 = Role.m6177equalsimpl0(role.m6180unboximpl(), r1);
            goto L8
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "Landroidx/collection/IntList;", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "findFocus", "focus", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

        public ComposeAccessibilityNodeProvider(AndroidComposeViewAccessibilityDelegateCompat this$0) {
            this.this$0 = this$0;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int virtualViewId) {
            AccessibilityNodeInfoCompat it = AndroidComposeViewAccessibilityDelegateCompat.access$createNodeInfo(this.this$0, virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat r1 = this.this$0;
            if (AndroidComposeViewAccessibilityDelegateCompat.access$getSendingFocusAffectingEvent$p(r1) == true) goto L5;
        L11:
            return it;
        L5:
            if (virtualViewId != AndroidComposeViewAccessibilityDelegateCompat.access$getAccessibilityFocusedVirtualViewId$p(r1)) goto L8;
            AndroidComposeViewAccessibilityDelegateCompat.access$setCurrentlyAccessibilityFocusedANI$p(r1, it);
        L8:
            if (virtualViewId != AndroidComposeViewAccessibilityDelegateCompat.access$getFocusedVirtualViewId$p(r1)) goto L11;
            AndroidComposeViewAccessibilityDelegateCompat.access$setCurrentlyFocusedANI$p(r1, it);
            goto L11
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.access$performActionHelper(this.this$0, virtualViewId, action, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.access$addExtraDataToAccessibilityNodeInfoHelper(this.this$0, virtualViewId, info, extraDataKey, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int focus) {
            switch(focus) {
                case 1: goto L7;
                case 2: goto L11;
                default: goto L4;
            };
        L4:
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        L11:
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.access$getAccessibilityFocusedVirtualViewId$p(this.this$0));
        L7:
            if (AndroidComposeViewAccessibilityDelegateCompat.access$getFocusedVirtualViewId$p(this.this$0) != Integer.MIN_VALUE) goto L10;
            return null;
        L10:
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.access$getFocusedVirtualViewId$p(this.this$0));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode node, int action, int granularity, int fromIndex, int toIndex, long traverseTime) {
            this.node = node;
            this.action = action;
            this.granularity = granularity;
            this.fromIndex = fromIndex;
            this.toIndex = toIndex;
            this.traverseTime = traverseTime;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    public static final /* synthetic */ void access$addExtraDataToAccessibilityNodeInfoHelper(AndroidComposeViewAccessibilityDelegateCompat $this, int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        $this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
    }

    public static final /* synthetic */ Rect access$boundsInScreen(AndroidComposeViewAccessibilityDelegateCompat $this, SemanticsNodeWithAdjustedBounds node) {
        return $this.boundsInScreen(node);
    }

    public static final /* synthetic */ AccessibilityNodeInfoCompat access$createNodeInfo(AndroidComposeViewAccessibilityDelegateCompat $this, int virtualViewId) {
        return $this.createNodeInfo(virtualViewId);
    }

    public static final /* synthetic */ int access$getAccessibilityFocusedVirtualViewId$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.accessibilityFocusedVirtualViewId;
    }

    public static final /* synthetic */ android.view.accessibility.AccessibilityManager access$getAccessibilityManager$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.accessibilityManager;
    }

    public static final /* synthetic */ IntObjectMap access$getCurrentSemanticsNodes(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.getCurrentSemanticsNodes();
    }

    public static final /* synthetic */ AccessibilityNodeInfoCompat access$getCurrentlyAccessibilityFocusedANI$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.currentlyAccessibilityFocusedANI;
    }

    public static final /* synthetic */ AccessibilityNodeInfoCompat access$getCurrentlyFocusedANI$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.currentlyFocusedANI;
    }

    public static final /* synthetic */ android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener access$getEnabledStateListener$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.enabledStateListener;
    }

    public static final /* synthetic */ int access$getFocusedVirtualViewId$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.focusedVirtualViewId;
    }

    public static final /* synthetic */ Handler access$getHandler$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.handler;
    }

    public static final /* synthetic */ MutableIntObjectMap access$getPendingHorizontalScrollEvents$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.pendingHorizontalScrollEvents;
    }

    public static final /* synthetic */ MutableIntObjectMap access$getPendingVerticalScrollEvents$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.pendingVerticalScrollEvents;
    }

    public static final /* synthetic */ Runnable access$getSemanticsChangeChecker$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.semanticsChangeChecker;
    }

    public static final /* synthetic */ boolean access$getSendingFocusAffectingEvent$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.sendingFocusAffectingEvent;
    }

    public static final /* synthetic */ android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener access$getTouchExplorationStateListener$p(AndroidComposeViewAccessibilityDelegateCompat $this) {
        return $this.touchExplorationStateListener;
    }

    public static final /* synthetic */ void access$notifySubtreeAccessibilityStateChangedIfNeeded(AndroidComposeViewAccessibilityDelegateCompat $this, LayoutNode layoutNode) {
        $this.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
    }

    public static final /* synthetic */ boolean access$performActionHelper(AndroidComposeViewAccessibilityDelegateCompat $this, int virtualViewId, int action, Bundle arguments) {
        return $this.performActionHelper(virtualViewId, action, arguments);
    }

    public static final /* synthetic */ void access$scheduleScrollEventIfNeeded(AndroidComposeViewAccessibilityDelegateCompat $this, ScrollObservationScope scrollObservationScope) {
        $this.scheduleScrollEventIfNeeded(scrollObservationScope);
    }

    public static final /* synthetic */ int access$semanticsNodeIdToAccessibilityVirtualNodeId(AndroidComposeViewAccessibilityDelegateCompat $this, int id) {
        return $this.semanticsNodeIdToAccessibilityVirtualNodeId(id);
    }

    public static final /* synthetic */ void access$setCurrentlyAccessibilityFocusedANI$p(AndroidComposeViewAccessibilityDelegateCompat $this, AccessibilityNodeInfoCompat r1) {
        $this.currentlyAccessibilityFocusedANI = r1;
    }

    public static final /* synthetic */ void access$setCurrentlyFocusedANI$p(AndroidComposeViewAccessibilityDelegateCompat $this, AccessibilityNodeInfoCompat r1) {
        $this.currentlyFocusedANI = r1;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView view) {
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        this.onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);
        Object r1 = this.view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) r1;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100;
        this.enabledStateListener = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0(this);
        this.touchExplorationStateListener = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1(this);
        this.enabledServices = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider(this);
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat(0, 1, null);
        this.labelToActionId = new SparseArrayCompat(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet(0, 1, null);
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.view.addOnAttachStateChangeListener(new AnonymousClass1(this));
        this.semanticsChangeChecker = new AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2(this);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        AccessibilityActionsResourceIds = IntListKt.intListOf(new int[]{androidx.compose.ui.R.id.accessibility_custom_action_0, androidx.compose.ui.R.id.accessibility_custom_action_1, androidx.compose.ui.R.id.accessibility_custom_action_2, androidx.compose.ui.R.id.accessibility_custom_action_3, androidx.compose.ui.R.id.accessibility_custom_action_4, androidx.compose.ui.R.id.accessibility_custom_action_5, androidx.compose.ui.R.id.accessibility_custom_action_6, androidx.compose.ui.R.id.accessibility_custom_action_7, androidx.compose.ui.R.id.accessibility_custom_action_8, androidx.compose.ui.R.id.accessibility_custom_action_9, androidx.compose.ui.R.id.accessibility_custom_action_10, androidx.compose.ui.R.id.accessibility_custom_action_11, androidx.compose.ui.R.id.accessibility_custom_action_12, androidx.compose.ui.R.id.accessibility_custom_action_13, androidx.compose.ui.R.id.accessibility_custom_action_14, androidx.compose.ui.R.id.accessibility_custom_action_15, androidx.compose.ui.R.id.accessibility_custom_action_16, androidx.compose.ui.R.id.accessibility_custom_action_17, androidx.compose.ui.R.id.accessibility_custom_action_18, androidx.compose.ui.R.id.accessibility_custom_action_19, androidx.compose.ui.R.id.accessibility_custom_action_20, androidx.compose.ui.R.id.accessibility_custom_action_21, androidx.compose.ui.R.id.accessibility_custom_action_22, androidx.compose.ui.R.id.accessibility_custom_action_23, androidx.compose.ui.R.id.accessibility_custom_action_24, androidx.compose.ui.R.id.accessibility_custom_action_25, androidx.compose.ui.R.id.accessibility_custom_action_26, androidx.compose.ui.R.id.accessibility_custom_action_27, androidx.compose.ui.R.id.accessibility_custom_action_28, androidx.compose.ui.R.id.accessibility_custom_action_29, androidx.compose.ui.R.id.accessibility_custom_action_30, androidx.compose.ui.R.id.accessibility_custom_action_31});
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int r1) {
        this.hoveredVirtualViewId = r1;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> r1) {
        this.onSendAccessibilityEvent = r1;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean value) {
        this.accessibilityForceEnabledForTesting = value;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui_release() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long r1) {
        this.SendRecurringAccessibilityEventsIntervalMillis = r1;
    }

    static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean enabled) {
        if (enabled == false) goto L4;
        List<AccessibilityServiceInfo> r0 = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    L5:
        this$0.enabledServices = r0;
        return;
    L4:
        r0 = CollectionsKt.emptyList();
        goto L5
    }

    static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean it) {
        this$0.enabledServices = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting == false) goto L5;
    L10:
        return true;
    L5:
        if (this.accessibilityManager.isEnabled() == true) goto L7;
    L9:
        return false;
    L7:
        if (this.enabledServices.isEmpty() == true) goto L9;
        goto L9
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting == false) goto L5;
    L10:
        return true;
    L5:
        if (this.accessibilityManager.isEnabled() == true) goto L7;
    L9:
        return false;
    L7:
        if (this.accessibilityManager.isTouchExplorationEnabled() == false) goto L9;
        goto L9
    }

    private final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated == false) goto L8;
        this.currentSemanticsNodesInvalidated = false;
        this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
        if (isEnabled$ui_release() == false) goto L8;
        AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
    L8:
        return this.currentSemanticsNodes;
    }

    public final MutableIntIntMap getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(MutableIntIntMap r1) {
        this.idToBeforeMap = r1;
    }

    public final MutableIntIntMap getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(MutableIntIntMap r1) {
        this.idToAfterMap = r1;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m6093canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread()) == true) goto L7;
        return false;
    L7:
        return m6092canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
    }

    /* JADX INFO: renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m6092canScrollmoWRBKg(IntObjectMap<SemanticsNodeWithAdjustedBounds> r30, boolean vertical, int direction, long position) {
        if (Offset.m4122equalsimpl0(position, Offset.Companion.m4140getUnspecifiedF1C5BW0()) == true) goto L63;
        long v$iv = 9223372034707292159L & position;
        if (((InlineClassHelperKt.DualLoadedSignificand + v$iv) & (-9223372034707292160L)) != 0) goto L7;
        int r4 = 1;
    L8:
        if (r4 != 0) goto L11;
        return false;
    L11:
        if (vertical != true) goto L13;
        SemanticsPropertyKey<ScrollAxisRange> r5 = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
    L15:
        boolean foundNode = false;
        Object[] v$iv2 = r30.values;
        long[] m$iv$iv = r30.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L60;
    L17:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean foundNode2 = foundNode;
        Object[] v$iv3 = v$iv2;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L54;
        int r6 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L20:
        if (j$iv$iv >= bitCount$iv$iv) goto L52;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L24;
        int $i$f$isFull = 1;
    L25:
        if ($i$f$isFull == 0) goto L49;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        SemanticsNodeWithAdjustedBounds node = (SemanticsNodeWithAdjustedBounds) v$iv3[index$iv$iv];
        int r27 = r6;
        if (RectHelper_androidKt.toComposeRect(node.getAdjustedBounds()).m4151containsk4lQ0M(position) == false) goto L50;
        ScrollAxisRange scrollRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(node.getSemanticsNode().getUnmergedConfig$ui_release(), r5);
        if (scrollRange == null) goto L50;
        if (scrollRange.getReverseScrolling() == false) goto L35;
        int actualDirection = -direction;
    L36:
        if (direction == 0) goto L38;
    L40:
        if (actualDirection >= 0) goto L45;
        if (scrollRange.getValue().invoke().floatValue() <= 0.0f) goto L50;
        foundNode2 = true;
        goto L50
    L45:
        if (scrollRange.getValue().invoke().floatValue() >= scrollRange.getMaxValue().invoke().floatValue()) goto L50;
        foundNode2 = true;
        goto L50
    L38:
        if (scrollRange.getReverseScrolling() == false) goto L40;
        actualDirection = -1;
        goto L40
    L35:
        actualDirection = direction;
    L50:
        slot$iv$iv = slot$iv$iv >> r27;
        j$iv$iv = j$iv$iv + 1;
        r6 = r27;
        goto L20
    L49:
        r27 = r6;
        goto L50
    L24:
        $i$f$isFull = 0;
        goto L25
    L52:
        if (bitCount$iv$iv != r6) goto L75;
        foundNode = foundNode2;
    L55:
        if (i$iv$iv == lastIndex$iv$iv) goto L60;
        i$iv$iv = i$iv$iv + 1;
        v$iv2 = v$iv3;
        goto L17
    L75:
        return foundNode2;
    L54:
        foundNode = foundNode2;
    L60:
        return foundNode;
    L13:
        if (vertical == true) goto L62;
        r5 = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        goto L15
    L62:
        throw new NoWhenBranchMatchedException();
    L7:
        r4 = 0;
        goto L8
    L63:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AccessibilityNodeInfoCompat createNodeInfo(int r9) {
        AndroidComposeView.ViewTreeOwners r0 = this.view.getViewTreeOwners();
        Integer r1 = null;
        View r2 = null;
        if (r0 == null) goto L9;
        LifecycleOwner r3 = r0.getLifecycleOwner();
        if (r3 == null) goto L9;
        Lifecycle r4 = r3.getLifecycle();
        if (r4 == null) goto L9;
        Lifecycle.State r5 = r4.getCurrentState();
    L11:
        if (r5 != Lifecycle.State.DESTROYED) goto L13;
        return null;
    L13:
        AccessibilityNodeInfoCompat r6 = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds r7 = getCurrentSemanticsNodes().get(r9);
        if (r7 != null) goto L16;
        return null;
    L16:
        SemanticsNode r8 = r7.getSemanticsNode();
        if (r9 != (-1)) goto L22;
        ViewParent r10 = this.view.getParentForAccessibility();
        if ((r10 instanceof View) == false) goto L21;
        r2 = (View) r10;
    L21:
        r6.setParent(r2);
    L31:
        r6.setSource(this.view, r9);
        r6.setBoundsInScreen(boundsInScreen(r7));
        populateAccessibilityNodeInfoProperties(r9, r6, r8);
        return r6;
    L22:
        SemanticsNode r11 = r8.getParent();
        if (r11 == null) goto L26;
        r1 = Integer.valueOf(r11.getId());
    L26:
        if (r1 == null) goto L33;
        int r12 = r1.intValue();
        if (r12 != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L30;
        r12 = -1;
    L30:
        r6.setParent(this.view, r12);
        goto L31
    L33:
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + r9 + " has null parent");
        throw new KotlinNothingValueException();
    L9:
        r5 = null;
        goto L11
    }

    private final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds node) {
        Rect boundsInRoot = node.getAdjustedBounds();
        AndroidComposeView r2 = this.view;
        float x$iv = boundsInRoot.left;
        float y$iv = boundsInRoot.top;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long topLeftInScreen = r2.mo5669localToScreenMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        AndroidComposeView r4 = this.view;
        float x$iv2 = boundsInRoot.right;
        float y$iv2 = boundsInRoot.bottom;
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long bottomRightInScreen = r4.mo5669localToScreenMKHz9U(Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)));
        int bits$iv$iv$iv = (int) (topLeftInScreen >> 32);
        int bits$iv$iv$iv2 = (int) (topLeftInScreen & 4294967295L);
        int bits$iv$iv$iv3 = (int) (bottomRightInScreen >> 32);
        int bits$iv$iv$iv4 = (int) (bottomRightInScreen & 4294967295L);
        return new Rect((int) Math.floor(Float.intBitsToFloat(bits$iv$iv$iv)), (int) Math.floor(Float.intBitsToFloat(bits$iv$iv$iv2)), (int) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv3)), (int) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv4)));
    }

    private final void populateAccessibilityNodeInfoProperties(int virtualViewId, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        Resources resources = this.view.getContext().getResources();
        info.setClassName(ClassName);
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()) == false) goto L6;
        info.setClassName(TextFieldClassName);
    L6:
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getText()) == false) goto L8;
        info.setClassName(TextClassName);
    L8:
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (role == null) goto L28;
        role.m6180unboximpl();
        if (semanticsNode.isFake$ui_release() == true) goto L15;
        if (semanticsNode.getReplacedChildren$ui_release().isEmpty() == true) goto L15;
    L27:
        Unit r6 = Unit.INSTANCE;
        Unit r7 = Unit.INSTANCE;
    L15:
        if (Role.m6177equalsimpl0(role.m6180unboximpl(), Role.Companion.m6188getTabo7Vup1c()) == false) goto L18;
        info.setRoleDescription(resources.getString(androidx.compose.ui.R.string.tab));
        goto L27
    L18:
        if (Role.m6177equalsimpl0(role.m6180unboximpl(), Role.Companion.m6187getSwitcho7Vup1c()) == false) goto L20;
        info.setRoleDescription(resources.getString(androidx.compose.ui.R.string.switch_role));
        goto L27
    L20:
        String className = SemanticsUtils_androidKt.m6157toLegacyClassNameV4PA4sw(role.m6180unboximpl());
        if (Role.m6177equalsimpl0(role.m6180unboximpl(), Role.Companion.m6185getImageo7Vup1c()) == true) goto L23;
    L26:
        info.setClassName(className);
        goto L27
    L23:
        if (semanticsNode.isUnmergedLeafNode$ui_release() == true) goto L26;
        if (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() == false) goto L27;
    L28:
        info.setPackageName(this.view.getContext().getPackageName());
        info.setImportantForAccessibility(SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode));
        List<SemanticsNode> r8 = semanticsNode.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r9 = r8.size();
    L30:
        if (index$iv >= r9) goto L42;
        Object item$iv = r8.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r14 = getCurrentSemanticsNodes();
        int key$iv = child.getId();
        if (r14.containsKey(key$iv) == false) goto L40;
        AndroidViewHolder holder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(child.getLayoutNode$ui_release());
        if (child.getId() == (-1)) goto L40;
        if (holder == null) goto L38;
        info.addChild(holder);
        goto L40
    L38:
        info.addChild(this.view, child.getId());
    L40:
        index$iv = index$iv + 1;
        goto L30
    L42:
        if (virtualViewId != this.accessibilityFocusedVirtualViewId) goto L44;
        info.setAccessibilityFocused(true);
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
    L45:
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        info.setStateDescription(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getInfoStateDescriptionOrNull(semanticsNode, resources));
        info.setCheckable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getInfoIsCheckable(semanticsNode));
        ToggleableState toggleState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleState != null) goto L48;
    L54:
        Boolean r10 = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (r10 == null) goto L65;
        boolean it = r10.booleanValue();
        int r12 = Role.Companion.m6188getTabo7Vup1c();
        if (role != null) goto L59;
        boolean r13 = false;
    L60:
        if (r13 == false) goto L62;
        info.setSelected(it);
    L63:
        Unit r11 = Unit.INSTANCE;
        Unit r15 = Unit.INSTANCE;
        goto L65
    L62:
        info.setChecked(it);
        goto L63
    L59:
        r13 = Role.m6177equalsimpl0(role.m6180unboximpl(), r12);
    L65:
        if (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() == true) goto L67;
    L69:
        List r16 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (r16 == null) goto L72;
        String r17 = (String) CollectionsKt.firstOrNull(r16);
    L73:
        info.setContentDescription(r17);
    L74:
        String testTag = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
        if (testTag == null) goto L85;
        boolean testTagsAsResourceId = false;
        SemanticsNode current = semanticsNode;
    L77:
        if (current == null) goto L82;
        if (current.getUnmergedConfig$ui_release().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId()) == true) goto L80;
        current = current.getParent();
        goto L77
    L80:
        testTagsAsResourceId = ((Boolean) current.getUnmergedConfig$ui_release().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue();
    L82:
        if (testTagsAsResourceId == false) goto L85;
        info.setViewIdResourceName(testTag);
    L85:
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHeading())) == null) goto L87;
        info.setHeading(true);
        Unit it2 = Unit.INSTANCE;
        Unit r18 = Unit.INSTANCE;
    L87:
        info.setPassword(semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword()));
        info.setEditable(semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getIsEditable()));
        Integer r19 = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getMaxTextLength());
        if (r19 == null) goto L90;
        int r110 = r19.intValue();
    L91:
        info.setMaxTextLength(r110);
        info.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode));
        info.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getFocused()));
        int r111 = 2;
        if (info.isFocusable() == false) goto L97;
        info.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
        if (info.isFocused() == false) goto L96;
        info.addAction(2);
        this.focusedVirtualViewId = virtualViewId;
        goto L97
    L96:
        info.addAction(1);
    L97:
        info.setVisibleToUser(!SemanticsUtils_androidKt.isHidden(semanticsNode));
        LiveRegionMode r112 = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (r112 == null) goto L107;
        int it3 = r112.m6171unboximpl();
        if (LiveRegionMode.m6168equalsimpl0(it3, LiveRegionMode.Companion.m6173getPolite0phEisY()) == false) goto L103;
        r111 = 1;
    L106:
        info.setLiveRegion(r111);
        Unit r113 = Unit.INSTANCE;
        Unit r114 = Unit.INSTANCE;
        goto L107
    L103:
        if (LiveRegionMode.m6168equalsimpl0(it3, LiveRegionMode.Companion.m6172getAssertive0phEisY()) == true) goto L106;
        r111 = 1;
    L107:
        info.setClickable(false);
        AccessibilityAction it4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
        if (it4 == null) goto L134;
        boolean isSelected = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected()), true);
        int r115 = Role.Companion.m6188getTabo7Vup1c();
        if (role != null) goto L112;
        boolean r116 = false;
    L113:
        if (r116 == true) goto L121;
        int r117 = Role.Companion.m6186getRadioButtono7Vup1c();
        if (role != null) goto L117;
        boolean r118 = false;
    L118:
        if (r118 == true) goto L121;
        boolean isRadioButtonOrTab = false;
    L122:
        if (isRadioButtonOrTab == false) goto L127;
        if (isRadioButtonOrTab == false) goto L126;
        if (isSelected == false) goto L127;
    L126:
        boolean r119 = false;
    L128:
        info.setClickable(r119);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == true) goto L131;
    L133:
        Unit r20 = Unit.INSTANCE;
        Unit r21 = Unit.INSTANCE;
        goto L134
    L131:
        if (info.isClickable() == false) goto L133;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, it4.getLabel()));
    L127:
        r119 = true;
        goto L128
    L117:
        r118 = Role.m6177equalsimpl0(role.m6180unboximpl(), r117);
    L121:
        isRadioButtonOrTab = true;
        goto L122
    L112:
        r116 = Role.m6177equalsimpl0(role.m6180unboximpl(), r115);
    L134:
        info.setLongClickable(false);
        AccessibilityAction it5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
        if (it5 == null) goto L140;
        info.setLongClickable(true);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L139;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, it5.getLabel()));
    L139:
        Unit r22 = Unit.INSTANCE;
        Unit r23 = Unit.INSTANCE;
    L140:
        AccessibilityAction it6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
        if (it6 == null) goto L144;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, it6.getLabel()));
        Unit r24 = Unit.INSTANCE;
        Unit r25 = Unit.INSTANCE;
    L144:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L162;
        AccessibilityAction it7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
        if (it7 == null) goto L148;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, it7.getLabel()));
        Unit r26 = Unit.INSTANCE;
        Unit r27 = Unit.INSTANCE;
    L148:
        AccessibilityAction it8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnImeAction());
        if (it8 == null) goto L151;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionImeEnter, it8.getLabel()));
        Unit r28 = Unit.INSTANCE;
        Unit r29 = Unit.INSTANCE;
    L151:
        AccessibilityAction it9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
        if (it9 == null) goto L154;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, it9.getLabel()));
        Unit r30 = Unit.INSTANCE;
        Unit r31 = Unit.INSTANCE;
    L154:
        AccessibilityAction it10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
        if (it10 == null) goto L162;
        if (info.isFocused() == true) goto L159;
    L161:
        Unit r32 = Unit.INSTANCE;
        Unit r33 = Unit.INSTANCE;
        goto L162
    L159:
        if (this.view.getClipboardManager().hasText() == false) goto L161;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, it10.getLabel()));
    L162:
        String text = getIterableTextForAccessibility(semanticsNode);
        String r120 = text;
        if (r120 != null) goto L165;
    L168:
        boolean r121 = true;
    L169:
        if (r121 == true) goto L187;
        info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
        AccessibilityAction setSelectionAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetSelection());
        if (setSelectionAction == null) goto L173;
        String r122 = setSelectionAction.getLabel();
    L174:
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, r122));
        info.addAction(256);
        info.addAction(512);
        info.setMovementGranularities(11);
        List contentDescription = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        List r123 = contentDescription;
        if (r123 != null) goto L177;
    L180:
        boolean r124 = true;
    L181:
        if (r124 == false) goto L187;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) == false) goto L187;
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$excludeLineAndPageGranularities(semanticsNode) == true) goto L187;
        info.setMovementGranularities((info.getMovementGranularities() | 4) | 16);
        goto L187
    L177:
        if (r123.isEmpty() == true) goto L180;
        r124 = false;
        goto L181
    L173:
        r122 = null;
    L187:
        List extraDataKeys = new ArrayList();
        extraDataKeys.add(ExtraDataIdKey);
        CharSequence r125 = info.getText();
        if (r125 != null) goto L190;
    L193:
        boolean r126 = true;
    L194:
        if (r126 == true) goto L199;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) == false) goto L199;
        extraDataKeys.add(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
    L199:
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag()) == false) goto L201;
        extraDataKeys.add(ExtraDataTestTagKey);
    L201:
        info.setAvailableExtraData(extraDataKeys);
        ProgressBarRangeInfo rangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (rangeInfo != null) goto L204;
    L220:
        Api24Impl.addSetProgressAction(info, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, info);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange xScrollState = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction scrollAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
        if (xScrollState == null) goto L245;
        if (scrollAction == null) goto L245;
        if (CollectionInfo_androidKt.hasCollectionInfo(semanticsNode) == true) goto L227;
        info.setClassName("android.widget.HorizontalScrollView");
    L227:
        if (xScrollState.getMaxValue().invoke().floatValue() <= 0.0f) goto L230;
        info.setScrollable(true);
    L230:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L245;
        if (populateAccessibilityNodeInfoProperties$canScrollForward(xScrollState) == false) goto L239;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode) == true) goto L236;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat r127 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
    L237:
        info.addAction(r127);
        goto L239
    L236:
        r127 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
    L239:
        if (populateAccessibilityNodeInfoProperties$canScrollBackward(xScrollState) == false) goto L245;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(semanticsNode) == true) goto L243;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat r128 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
    L244:
        info.addAction(r128);
        goto L245
    L243:
        r128 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
    L245:
        ScrollAxisRange yScrollState = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (yScrollState == null) goto L263;
        if (scrollAction == null) goto L263;
        if (CollectionInfo_androidKt.hasCollectionInfo(semanticsNode) == true) goto L252;
        info.setClassName("android.widget.ScrollView");
    L252:
        if (yScrollState.getMaxValue().invoke().floatValue() <= 0.0f) goto L255;
        info.setScrollable(true);
    L255:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L263;
        if (populateAccessibilityNodeInfoProperties$canScrollForward(yScrollState) == false) goto L260;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
    L260:
        if (populateAccessibilityNodeInfoProperties$canScrollBackward(yScrollState) == false) goto L263;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
    L263:
        if (Build.VERSION.SDK_INT < 29) goto L265;
        Api29Impl.addPageActions(info, semanticsNode);
    L265:
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L306;
        AccessibilityAction it11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
        if (it11 == null) goto L271;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, it11.getLabel()));
        Unit r5 = Unit.INSTANCE;
        Unit r34 = Unit.INSTANCE;
    L271:
        AccessibilityAction it12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
        if (it12 == null) goto L274;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, it12.getLabel()));
        Unit r35 = Unit.INSTANCE;
        Unit r36 = Unit.INSTANCE;
    L274:
        AccessibilityAction it13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
        if (it13 == null) goto L278;
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, it13.getLabel()));
        Unit r37 = Unit.INSTANCE;
        Unit r38 = Unit.INSTANCE;
    L278:
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getCustomActions()) == false) goto L306;
        List $this$fastForEachIndexed$iv = (List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
        int r39 = $this$fastForEachIndexed$iv.size();
        IntList this_$iv = AccessibilityActionsResourceIds;
        if (r39 >= this_$iv._size) goto L302;
        SparseArrayCompat<CharSequence> r40 = new SparseArrayCompat(0, 1, null);
        MutableObjectIntMap<CharSequence> r41 = ObjectIntMapKt.mutableObjectIntMapOf();
        if (this.labelToActionId.containsKey(virtualViewId) == false) goto L297;
        ObjectIntMap r129 = (MutableObjectIntMap) this.labelToActionId.get(virtualViewId);
        MutableIntList $this$populateAccessibilityNodeInfoProperties_u24lambda_u2421 = new MutableIntList(0, 1, null);
        IntList this_$iv2 = AccessibilityActionsResourceIds;
        int[] content$iv = this_$iv2.content;
        int r42 = this_$iv2._size;
        int i$iv = 0;
    L284:
        if (i$iv >= r42) goto L286;
        $this$populateAccessibilityNodeInfoProperties_u24lambda_u2421.add(content$iv[i$iv]);
        i$iv = i$iv + 1;
        r42 = r42;
        goto L284
    L286:
        MutableIntList availableIds = $this$populateAccessibilityNodeInfoProperties_u24lambda_u2421;
        List unassignedActions = new ArrayList();
        List $this$fastForEach$iv = $this$fastForEachIndexed$iv;
        int index$iv2 = 0;
        int $i$f$fastForEach = $this$fastForEach$iv.size();
    L287:
        if (index$iv2 >= $i$f$fastForEach) goto L293;
        Object item$iv2 = $this$fastForEach$iv.get(index$iv2);
        List $this$fastForEach$iv2 = $this$fastForEach$iv;
        CustomAccessibilityAction action = (CustomAccessibilityAction) item$iv2;
        Intrinsics.checkNotNull(r129);
        int r210 = $i$f$fastForEach;
        ObjectIntMap this_$iv3 = r129;
        ScrollAxisRange xScrollState2 = xScrollState;
        if (this_$iv3.containsKey(action.getLabel()) == false) goto L291;
        int actionId = r129.get(action.getLabel());
        r40.put(actionId, action.getLabel());
        r41.set(action.getLabel(), actionId);
        availableIds.remove(actionId);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(actionId, action.getLabel()));
    L292:
        index$iv2 = index$iv2 + 1;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        $i$f$fastForEach = r210;
        scrollAction = scrollAction;
        xScrollState = xScrollState2;
        goto L287
    L291:
        unassignedActions.add(action);
        goto L292
    L293:
        List $this$fastForEachIndexed$iv2 = unassignedActions;
        int index$iv3 = 0;
        int r130 = $this$fastForEachIndexed$iv2.size();
    L294:
        if (index$iv3 >= r130) goto L301;
        Object item$iv3 = $this$fastForEachIndexed$iv2.get(index$iv3);
        CustomAccessibilityAction action2 = (CustomAccessibilityAction) item$iv3;
        int index = index$iv3;
        List $this$fastForEachIndexed$iv3 = $this$fastForEachIndexed$iv2;
        int actionId2 = availableIds.get(index);
        r40.put(actionId2, action2.getLabel());
        r41.set(action2.getLabel(), actionId2);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(actionId2, action2.getLabel()));
        index$iv3 = index$iv3 + 1;
        $this$fastForEachIndexed$iv2 = $this$fastForEachIndexed$iv3;
        unassignedActions = unassignedActions;
        availableIds = availableIds;
    L301:
        this.actionIdToLabel.put(virtualViewId, r40);
        this.labelToActionId.put(virtualViewId, r41);
        goto L306
    L297:
        String text2 = null;
        int index$iv4 = 0;
        int r131 = $this$fastForEachIndexed$iv.size();
    L298:
        if (index$iv4 >= r131) goto L301;
        Object item$iv4 = $this$fastForEachIndexed$iv.get(index$iv4);
        CustomAccessibilityAction action3 = (CustomAccessibilityAction) item$iv4;
        int index2 = index$iv4;
        List $this$fastForEachIndexed$iv4 = $this$fastForEachIndexed$iv;
        int actionId3 = AccessibilityActionsResourceIds.get(index2);
        r40.put(actionId3, action3.getLabel());
        r41.set(action3.getLabel(), actionId3);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(actionId3, action3.getLabel()));
        index$iv4 = index$iv4 + 1;
        $this$fastForEachIndexed$iv = $this$fastForEachIndexed$iv4;
        text2 = text2;
        goto L298
    L302:
        StringBuilder r43 = new StringBuilder().append("Can't have more than ");
        IntList this_$iv4 = AccessibilityActionsResourceIds;
        throw new IllegalStateException(r43.append(this_$iv4._size).append(" custom actions for one widget").toString());
    L306:
        info.setScreenReaderFocusable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isScreenReaderFocusable(semanticsNode, resources));
        int beforeId = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
        if (beforeId == (-1)) goto L313;
        View beforeView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), beforeId);
        if (beforeView == null) goto L311;
        info.setTraversalBefore(beforeView);
    L312:
        addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        goto L313
    L311:
        info.setTraversalBefore(this.view, beforeId);
    L313:
        int afterId = this.idToAfterMap.getOrDefault(virtualViewId, -1);
        if (afterId == (-1)) goto L332;
        View afterView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), afterId);
        if (afterView == null) goto L333;
        info.setTraversalAfter(afterView);
        addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
        return;
    L333:
        return;
    L332:
        return;
    L204:
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress()) == false) goto L206;
        info.setClassName("android.widget.SeekBar");
    L208:
        if (rangeInfo == ProgressBarRangeInfo.Companion.getIndeterminate()) goto L211;
        info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, rangeInfo.getRange().getStart().floatValue(), rangeInfo.getRange().getEndInclusive().floatValue(), rangeInfo.getCurrent()));
    L211:
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress()) == false) goto L220;
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode) == false) goto L220;
        if (rangeInfo.getCurrent() >= RangesKt.coerceAtLeast(rangeInfo.getRange().getEndInclusive().floatValue(), rangeInfo.getRange().getStart().floatValue())) goto L218;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
    L218:
        if (rangeInfo.getCurrent() <= RangesKt.coerceAtMost(rangeInfo.getRange().getStart().floatValue(), rangeInfo.getRange().getEndInclusive().floatValue())) goto L220;
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
        goto L220
    L206:
        info.setClassName("android.widget.ProgressBar");
        goto L208
    L190:
        if (r125.length() == 0) goto L193;
        r126 = false;
        goto L194
    L165:
        if (r120.length() == 0) goto L168;
        r121 = false;
        goto L169
    L90:
        r110 = -1;
        goto L91
    L72:
        r17 = null;
        goto L73
    L67:
        if (semanticsNode.getReplacedChildren$ui_release().isEmpty() == false) goto L74;
    L48:
        if (toggleState != ToggleableState.On) goto L51;
        info.setChecked(true);
    L53:
        Unit r44 = Unit.INSTANCE;
        Unit r45 = Unit.INSTANCE;
        goto L54
    L51:
        if (toggleState != ToggleableState.Off) goto L53;
        info.setChecked(false);
        goto L53
    L44:
        info.setAccessibilityFocused(false);
        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        goto L45
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange $this$populateAccessibilityNodeInfoProperties_u24canScrollForward) {
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollForward.getValue().invoke().floatValue() >= $this$populateAccessibilityNodeInfoProperties_u24canScrollForward.getMaxValue().invoke().floatValue()) goto L7;
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollForward.getReverseScrolling() == true) goto L7;
    L10:
        return true;
    L7:
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollForward.getValue().invoke().floatValue() > 0.0f) goto L9;
    L11:
        return false;
    L9:
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollForward.getReverseScrolling() == false) goto L11;
        goto L10
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange $this$populateAccessibilityNodeInfoProperties_u24canScrollBackward) {
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollBackward.getValue().invoke().floatValue() <= 0.0f) goto L7;
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollBackward.getReverseScrolling() == true) goto L7;
    L10:
        return true;
    L7:
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollBackward.getValue().invoke().floatValue() < $this$populateAccessibilityNodeInfoProperties_u24canScrollBackward.getMaxValue().invoke().floatValue()) goto L9;
    L11:
        return false;
    L9:
        if ($this$populateAccessibilityNodeInfoProperties_u24canScrollBackward.getReverseScrolling() == false) goto L11;
        goto L10
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getError()) == false) goto L6;
        info.setContentInvalid(true);
        info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getError()));
        return;
    }

    private final SpannableString toSpannableString(AnnotatedString $this$toSpannableString) {
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString($this$toSpannableString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache), ParcelSafeTextLength);
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString r0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$getInfoText(node);
        if (r0 == null) goto L5;
        SpannableString r1 = toSpannableString(r0);
    L6:
        info.setText(r1);
        return;
    L5:
        r1 = null;
        goto L6
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        if (this.accessibilityFocusedVirtualViewId != virtualViewId) goto L5;
        return true;
    L5:
        return false;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (isTouchExplorationEnabled() == true) goto L6;
        return false;
    L6:
        if (isAccessibilityFocused(virtualViewId) == false) goto L8;
        return false;
    L8:
        if (this.accessibilityFocusedVirtualViewId == Integer.MIN_VALUE) goto L10;
        sendEventForVirtualView$default(this, this.accessibilityFocusedVirtualViewId, 65536, null, null, 12, null);
    L10:
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat r1, int r2, int r3, Integer r4, List r5, int r6, Object r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r6 & 8) == 0) goto L9;
        r5 = null;
    L9:
        return r1.sendEventForVirtualView(r2, r3, r4, r5);
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> r15) {
        if (virtualViewId == Integer.MIN_VALUE) goto L16;
        if (isEnabled$ui_release() == false) goto L18;
        AccessibilityEvent event = createEvent(virtualViewId, eventType);
        if (contentChangeType == null) goto L10;
        event.setContentChangeTypes(contentChangeType.intValue());
    L10:
        if (r15 == null) goto L14;
        event.setContentDescription(ListUtilsKt.fastJoinToString$default(r15, ",", null, null, 0, null, null, 62, null));
    L14:
        return sendEvent(event);
    L18:
        return false;
    L16:
        return false;
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (isEnabled$ui_release() == true) goto L6;
        return false;
    L6:
        if (event.getEventType() != 2048) goto L8;
    L9:
        this.sendingFocusAffectingEvent = true;
    L17:
        boolean r0 = this.onSendAccessibilityEvent.invoke(event).booleanValue();     // Catch: Throwable -> L14
        this.sendingFocusAffectingEvent = false;
        return r0;
    L14:
        th = move-exception;
        this.sendingFocusAffectingEvent = false;
        throw th;
    L8:
        if (event.getEventType() != 32768) goto L17;
        goto L9
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        event.setEnabled(true);
        event.setClassName(ClassName);
        event.setPackageName(this.view.getContext().getPackageName());
        event.setSource(this.view, virtualViewId);
        if (isEnabled$ui_release() == false) goto L7;
        SemanticsNodeWithAdjustedBounds it = getCurrentSemanticsNodes().get(virtualViewId);
        if (it == null) goto L7;
        event.setPassword(it.getSemanticsNode().getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword()));
    L7:
        return event;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent $this$createTextSelectionChangedEvent_u24lambda_u2430 = createEvent(virtualViewId, 8192);
        if (fromIndex == null) goto L5;
        int it = fromIndex.intValue();
        $this$createTextSelectionChangedEvent_u24lambda_u2430.setFromIndex(it);
    L5:
        if (toIndex == null) goto L7;
        int it2 = toIndex.intValue();
        $this$createTextSelectionChangedEvent_u24lambda_u2430.setToIndex(it2);
    L7:
        if (itemCount == null) goto L9;
        int it3 = itemCount.intValue();
        $this$createTextSelectionChangedEvent_u24lambda_u2430.setItemCount(it3);
    L9:
        if (text == null) goto L12;
        $this$createTextSelectionChangedEvent_u24lambda_u2430.getText().add(text);
    L12:
        return $this$createTextSelectionChangedEvent_u24lambda_u2430;
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (isAccessibilityFocused(virtualViewId) == false) goto L7;
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    L7:
        return false;
    }

    private final boolean performActionHelper(int virtualViewId, int action, Bundle arguments) {
        SemanticsNodeWithAdjustedBounds r1 = getCurrentSemanticsNodes().get(virtualViewId);
        boolean r10 = false;
        if (r1 == null) goto L382;
        SemanticsNode node = r1.getSemanticsNode();
        if (node != null) goto L8;
        return false;
    L8:
        switch(action) {
            case 64: goto L41;
            case 128: goto L39;
            case 256: goto L31;
            case 512: goto L31;
            case 16384: goto L24;
            case 131072: goto L12;
            default: goto L10;
        };
    L12:
        int r2 = -1;
        if (arguments == null) goto L15;
        int r3 = arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1);
    L16:
        int start = r3;
        if (arguments == null) goto L20;
        r2 = arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1);
    L20:
        int end = r2;
        boolean success = setAccessibilitySelection(node, start, end, false);
        if (success == false) goto L23;
        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), 0, null, null, 12, null);
    L23:
        return success;
    L15:
        r3 = -1;
        goto L16
    L24:
        AccessibilityAction r4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
        if (r4 == null) goto L390;
        Function0 r5 = (Function0) r4.getAction();
        if (r5 != null) goto L30;
        return false;
    L30:
        return ((Boolean) r5.invoke()).booleanValue();
    L390:
        return false;
    L31:
        if (arguments == null) goto L37;
        int granularity = arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        boolean extendSelection = arguments.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        if (action != 256) goto L36;
        r10 = true;
    L36:
        return traverseAtGranularity(node, granularity, r10, extendSelection);
    L37:
        return false;
    L10:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(node) == true) goto L42;
        return false;
    L42:
        Boolean r6 = null;
        switch(action) {
            case 1: goto L359;
            case 2: goto L355;
            case 16: goto L345;
            case 32: goto L338;
            case 4096: goto L192;
            case 8192: goto L192;
            case 32768: goto L184;
            case 65536: goto L177;
            case 262144: goto L170;
            case 524288: goto L163;
            case 1048576: goto L156;
            case 2097152: goto L142;
            case 16908342: goto L93;
            case 16908344: goto L192;
            case 16908345: goto L192;
            case 16908346: goto L192;
            case 16908347: goto L192;
            case 16908349: goto L81;
            case 16908358: goto L74;
            case 16908359: goto L68;
            case 16908360: goto L62;
            case 16908361: goto L56;
            case 16908372: goto L49;
            default: goto L44;
        };
    L44:
        SparseArrayCompat<CharSequence> r7 = this.actionIdToLabel.get(virtualViewId);
        if (r7 == null) goto L379;
        CharSequence label = r7.get(action);
        if (label != null) goto L366;
        return false;
    L366:
        List customActions = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCustomActions());
        if (customActions != null) goto L370;
        return false;
    L370:
        int index$iv = 0;
        int r8 = customActions.size();
    L371:
        if (index$iv >= r8) goto L377;
        Object item$iv = customActions.get(index$iv);
        CustomAccessibilityAction customAction = (CustomAccessibilityAction) item$iv;
        if (Intrinsics.areEqual(customAction.getLabel(), label) == true) goto L375;
        index$iv = index$iv + 1;
        goto L371
    L375:
        return customAction.getAction().invoke().booleanValue();
    L377:
        return false;
    L379:
        return false;
    L49:
        AccessibilityAction r9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnImeAction());
        if (r9 == null) goto L392;
        Function0 r11 = (Function0) r9.getAction();
        if (r11 != null) goto L55;
        return false;
    L55:
        return ((Boolean) r11.invoke()).booleanValue();
    L392:
        return false;
    L56:
        AccessibilityAction pageAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
        if (pageAction == null) goto L394;
        Function0 r12 = (Function0) pageAction.getAction();
        if (r12 != null) goto L61;
        return false;
    L61:
        return ((Boolean) r12.invoke()).booleanValue();
    L394:
        return false;
    L62:
        AccessibilityAction pageAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
        if (pageAction2 == null) goto L396;
        Function0 r13 = (Function0) pageAction2.getAction();
        if (r13 != null) goto L67;
        return false;
    L67:
        return ((Boolean) r13.invoke()).booleanValue();
    L396:
        return false;
    L68:
        AccessibilityAction pageAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
        if (pageAction3 == null) goto L398;
        Function0 r14 = (Function0) pageAction3.getAction();
        if (r14 != null) goto L73;
        return false;
    L73:
        return ((Boolean) r14.invoke()).booleanValue();
    L398:
        return false;
    L74:
        AccessibilityAction pageAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
        if (pageAction4 == null) goto L400;
        Function0 r15 = (Function0) pageAction4.getAction();
        if (r15 != null) goto L79;
        return false;
    L79:
        return ((Boolean) r15.invoke()).booleanValue();
    L400:
        return false;
    L93:
        SemanticsNode scrollableAncestor = node.getParent();
        if (scrollableAncestor == null) goto L98;
        SemanticsConfiguration r16 = scrollableAncestor.getUnmergedConfig$ui_release();
        if (r16 == null) goto L98;
        AccessibilityAction scrollAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(r16, SemanticsActions.INSTANCE.getScrollBy());
    L100:
        if (scrollableAncestor == null) goto L110;
        if (scrollAction != null) goto L110;
        scrollableAncestor = scrollableAncestor.getParent();
        if (scrollableAncestor == null) goto L108;
        SemanticsConfiguration r17 = scrollableAncestor.getUnmergedConfig$ui_release();
        if (r17 == null) goto L108;
        AccessibilityAction r18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(r17, SemanticsActions.INSTANCE.getScrollBy());
    L109:
        scrollAction = r18;
    L108:
        r18 = null;
    L110:
        if (scrollableAncestor != null) goto L112;
        return false;
    L112:
        androidx.compose.ui.geometry.Rect viewportInParent = LayoutCoordinatesKt.boundsInParent(scrollableAncestor.getLayoutInfo().getCoordinates());
        LayoutCoordinates r19 = scrollableAncestor.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
        if (r19 == null) goto L115;
        long parentInRoot = LayoutCoordinatesKt.positionInRoot(r19);
    L116:
        androidx.compose.ui.geometry.Rect viewport = viewportInParent.m4162translatek4lQ0M(parentInRoot);
        androidx.compose.ui.geometry.Rect target = RectKt.m4165Recttz77jQw(node.m6191getPositionInRootF1C5BW0(), IntSizeKt.m7156toSizeozmzZPI(node.m6194getSizeYbymL2g()));
        ScrollAxisRange xScrollState = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(scrollableAncestor.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        ScrollAxisRange yScrollState = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(scrollableAncestor.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        float dx = performActionHelper$scrollDelta(target.getLeft() - viewport.getLeft(), target.getRight() - viewport.getRight());
        if (xScrollState != null) goto L119;
    L121:
        boolean r110 = false;
    L122:
        if (r110 == false) goto L125;
        dx = -dx;
    L125:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(node) == false) goto L127;
        dx = -dx;
    L127:
        float dy = performActionHelper$scrollDelta(target.getTop() - viewport.getTop(), target.getBottom() - viewport.getBottom());
        if (yScrollState != null) goto L130;
    L132:
        boolean r20 = false;
    L133:
        if (r20 == false) goto L135;
        dy = -dy;
    L135:
        if (scrollAction == null) goto L140;
        Function2 r0 = (Function2) scrollAction.getAction();
        if (r0 == null) goto L140;
        return ((Boolean) r0.invoke(Float.valueOf(dx), Float.valueOf(dy))).booleanValue();
    L140:
        return false;
    L130:
        if (yScrollState.getReverseScrolling() != true) goto L132;
        r20 = true;
        goto L133
    L119:
        if (xScrollState.getReverseScrolling() != true) goto L121;
        r110 = true;
        goto L122
    L115:
        parentInRoot = Offset.Companion.m4141getZeroF1C5BW0();
    L98:
        scrollAction = null;
        goto L100
    L156:
        AccessibilityAction r21 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
        if (r21 == null) goto L162;
        Function0 r22 = (Function0) r21.getAction();
        if (r22 == null) goto L162;
        return ((Boolean) r22.invoke()).booleanValue();
    L162:
        return false;
    L163:
        AccessibilityAction r23 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
        if (r23 == null) goto L169;
        Function0 r24 = (Function0) r23.getAction();
        if (r24 == null) goto L169;
        return ((Boolean) r24.invoke()).booleanValue();
    L169:
        return false;
    L170:
        AccessibilityAction r25 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
        if (r25 == null) goto L176;
        Function0 r26 = (Function0) r25.getAction();
        if (r26 == null) goto L176;
        return ((Boolean) r26.invoke()).booleanValue();
    L176:
        return false;
    L177:
        AccessibilityAction r27 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
        if (r27 == null) goto L183;
        Function0 r28 = (Function0) r27.getAction();
        if (r28 == null) goto L183;
        return ((Boolean) r28.invoke()).booleanValue();
    L183:
        return false;
    L184:
        AccessibilityAction r29 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
        if (r29 == null) goto L190;
        Function0 r30 = (Function0) r29.getAction();
        if (r30 == null) goto L190;
        return ((Boolean) r30.invoke()).booleanValue();
    L190:
        return false;
    L338:
        AccessibilityAction r31 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
        if (r31 == null) goto L344;
        Function0 r32 = (Function0) r31.getAction();
        if (r32 == null) goto L344;
        return ((Boolean) r32.invoke()).booleanValue();
    L344:
        return false;
    L345:
        AccessibilityAction r33 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
        if (r33 == null) goto L350;
        Function0 r34 = (Function0) r33.getAction();
        if (r34 == null) goto L350;
        r6 = (Boolean) r34.invoke();
    L350:
        Boolean result = r6;
        sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
        if (result != null) goto L353;
        return false;
    L353:
        return result.booleanValue();
    L359:
        AccessibilityAction r35 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getRequestFocus());
        if (r35 == null) goto L364;
        Function0 r36 = (Function0) r35.getAction();
        if (r36 == null) goto L364;
        return ((Boolean) r36.invoke()).booleanValue();
    L364:
        return false;
    L81:
        if (arguments != null) goto L83;
    L92:
        return false;
    L83:
        if (arguments.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) == false) goto L92;
        AccessibilityAction r37 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
        if (r37 == null) goto L402;
        Function1 r38 = (Function1) r37.getAction();
        if (r38 != null) goto L91;
        return false;
    L91:
        return ((Boolean) r38.invoke(Float.valueOf(arguments.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
    L402:
        return false;
    L142:
        if (arguments == null) goto L144;
        String text = arguments.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
    L145:
        AccessibilityAction r39 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
        if (r39 == null) goto L155;
        Function1 r40 = (Function1) r39.getAction();
        if (r40 == null) goto L155;
        if (text != null) goto L152;
        String r41 = "";
    L405:
        return ((Boolean) r40.invoke(new AnnotatedString(r41, null, 2, null))).booleanValue();
    L152:
        r41 = text;
    L155:
        return false;
    L144:
        text = null;
        goto L145
    L192:
        if (action != 4096) goto L194;
        boolean scrollForward = true;
    L196:
        if (action != 8192) goto L198;
        boolean scrollBackward = true;
    L200:
        if (action != 16908345) goto L202;
        boolean scrollLeft = true;
    L204:
        if (action != 16908347) goto L206;
        boolean scrollRight = true;
    L208:
        if (action != 16908344) goto L210;
        boolean scrollUp = true;
    L212:
        if (action != 16908346) goto L214;
        boolean scrollDown = true;
    L215:
        if (scrollLeft == true) goto L221;
        if (scrollRight == true) goto L221;
        if (scrollForward == true) goto L221;
        if (scrollBackward == true) goto L221;
        boolean scrollHorizontal = false;
    L222:
        if (scrollUp == true) goto L228;
        if (scrollDown == true) goto L228;
        if (scrollForward == true) goto L228;
        if (scrollBackward == true) goto L228;
        boolean scrollVertical = false;
    L229:
        if (scrollForward == true) goto L233;
        if (scrollBackward == true) goto L233;
    L249:
        long value$iv$iv = LayoutCoordinatesKt.boundsInParent(node.getLayoutInfo().getCoordinates()).m4158getSizeNHjbRc();
        Float activeViewPortForScroll = SemanticsUtils_androidKt.getScrollViewportLength(node.getUnmergedConfig$ui_release());
        AccessibilityAction scrollAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAction2 != null) goto L252;
        return false;
    L252:
        ScrollAxisRange xScrollState2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        if (xScrollState2 == null) goto L297;
        if (scrollHorizontal == false) goto L297;
        if (activeViewPortForScroll == null) goto L257;
        float amountToScroll = activeViewPortForScroll.floatValue();
        float r210 = 0.0f;
    L259:
        if (scrollLeft == true) goto L261;
        if (scrollBackward == true) goto L261;
    L263:
        if (xScrollState2.getReverseScrolling() == false) goto L266;
        amountToScroll = -amountToScroll;
    L266:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isRtl(node) == false) goto L271;
        if (scrollLeft == true) goto L269;
        if (scrollRight == false) goto L271;
    L269:
        amountToScroll = -amountToScroll;
    L271:
        if (performActionHelper$canScroll(xScrollState2, amountToScroll) == false) goto L298;
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getPageLeft()) == false) goto L275;
    L278:
        boolean canPageHorizontally = true;
    L280:
        if (canPageHorizontally == true) goto L282;
        Function2 r42 = (Function2) scrollAction2.getAction();
        if (r42 == null) goto L295;
        return ((Boolean) r42.invoke(Float.valueOf(amountToScroll), Float.valueOf(r210))).booleanValue();
    L295:
        return false;
    L282:
        if (amountToScroll <= r210) goto L284;
        AccessibilityAction horizontalPageAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
    L286:
        if (horizontalPageAction == null) goto L413;
        Function0 r111 = (Function0) horizontalPageAction.getAction();
        if (r111 == null) goto L413;
        return ((Boolean) r111.invoke()).booleanValue();
    L413:
        return false;
    L284:
        horizontalPageAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
        goto L286
    L275:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getPageRight()) == true) goto L278;
        canPageHorizontally = false;
    L298:
        ScrollAxisRange yScrollState2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (yScrollState2 == null) goto L337;
        if (scrollVertical == false) goto L337;
        if (activeViewPortForScroll == null) goto L303;
        float amountToScroll2 = activeViewPortForScroll.floatValue();
    L305:
        if (scrollUp == true) goto L307;
        if (scrollBackward != 0) goto L307;
    L309:
        if (yScrollState2.getReverseScrolling() == false) goto L312;
        amountToScroll2 = -amountToScroll2;
    L312:
        if (performActionHelper$canScroll(yScrollState2, amountToScroll2) == false) goto L337;
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getPageUp()) == false) goto L316;
    L319:
        boolean canPageVertically = true;
    L321:
        if (canPageVertically == true) goto L323;
        Function2 r43 = (Function2) scrollAction2.getAction();
        if (r43 != null) goto L335;
        return false;
    L335:
        return ((Boolean) r43.invoke(Float.valueOf(r210), Float.valueOf(amountToScroll2))).booleanValue();
    L323:
        if (amountToScroll2 <= r210) goto L325;
        AccessibilityAction verticalPageAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
    L327:
        if (verticalPageAction == null) goto L417;
        Function0 r112 = (Function0) verticalPageAction.getAction();
        if (r112 != null) goto L415;
        return false;
    L415:
        return ((Boolean) r112.invoke()).booleanValue();
    L417:
        return false;
    L325:
        verticalPageAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
        goto L327
    L316:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getPageDown()) == true) goto L319;
        canPageVertically = false;
    L307:
        amountToScroll2 = -amountToScroll2;
        goto L309
    L303:
        int bits$iv$iv$iv = (int) (value$iv$iv & 4294967295L);
        amountToScroll2 = Float.intBitsToFloat(bits$iv$iv$iv);
    L337:
        return false;
    L261:
        amountToScroll = -amountToScroll;
        goto L263
    L257:
        r210 = 0.0f;
        int bits$iv$iv$iv2 = (int) (value$iv$iv >> 32);
        amountToScroll = Float.intBitsToFloat(bits$iv$iv$iv2);
    L297:
        r210 = 0.0f;
    L233:
        ProgressBarRangeInfo rangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        AccessibilityAction setProgressAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
        if (rangeInfo == null) goto L249;
        if (setProgressAction == null) goto L249;
        float max = RangesKt.coerceAtLeast(rangeInfo.getRange().getEndInclusive().floatValue(), rangeInfo.getRange().getStart().floatValue());
        float min = RangesKt.coerceAtMost(rangeInfo.getRange().getStart().floatValue(), rangeInfo.getRange().getEndInclusive().floatValue());
        if (rangeInfo.getSteps() <= 0) goto L239;
        float increment = (max - min) / (rangeInfo.getSteps() + 1);
    L241:
        if (scrollBackward == false) goto L243;
        increment = -increment;
    L243:
        Function1 r44 = (Function1) setProgressAction.getAction();
        if (r44 == null) goto L247;
        return ((Boolean) r44.invoke(Float.valueOf(rangeInfo.getCurrent() + increment))).booleanValue();
    L247:
        return false;
    L239:
        increment = (max - min) / 20.0f;
    L228:
        scrollVertical = true;
    L221:
        scrollHorizontal = true;
        goto L222
    L214:
        scrollDown = false;
        goto L215
    L210:
        scrollUp = false;
        goto L212
    L206:
        scrollRight = false;
        goto L208
    L202:
        scrollLeft = false;
        goto L204
    L198:
        scrollBackward = false;
        goto L200
    L194:
        scrollForward = false;
        goto L196
    L355:
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), true) == false) goto L357;
        this.view.getFocusOwner().mo4024clearFocusI7lrPNg(false, true, true, FocusDirection.Companion.m4015getExitdhqQ8s());
        return true;
    L357:
        return false;
    L39:
        return clearAccessibilityFocus(virtualViewId);
    L41:
        return requestAccessibilityFocus(virtualViewId);
    L382:
        return false;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange $this$performActionHelper_u24canScroll, float amount) {
        if (amount >= 0.0f) goto L7;
        if ($this$performActionHelper_u24canScroll.getValue().invoke().floatValue() <= 0.0f) goto L7;
    L10:
        return true;
    L7:
        if (amount > 0.0f) goto L9;
    L11:
        return false;
    L9:
        if ($this$performActionHelper_u24canScroll.getValue().invoke().floatValue() >= $this$performActionHelper_u24canScroll.getMaxValue().invoke().floatValue()) goto L11;
        goto L10
    }

    private static final float performActionHelper$scrollDelta(float a, float b) {
        if (Math.signum(a) != Math.signum(b)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return 0.0f;
    L8:
        if (Math.abs(a) >= Math.abs(b)) goto L14;
        return a;
    L14:
        return b;
    L5:
        r0 = false;
        goto L6
    }

    private final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        SemanticsNodeWithAdjustedBounds r0 = getCurrentSemanticsNodes().get(virtualViewId);
        if (r0 == null) goto L57;
        SemanticsNode node = r0.getSemanticsNode();
        if (node == null) goto L69;
        String text = getIterableTextForAccessibility(node);
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal) == false) goto L14;
        int it = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
        if (it == (-1)) goto L66;
        info.getExtras().putInt(extraDataKey, it);
        return;
    L66:
        return;
    L14:
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal) == false) goto L20;
        int it2 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
        if (it2 == (-1)) goto L68;
        info.getExtras().putInt(extraDataKey, it2);
        return;
    L68:
        return;
    L20:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) == false) goto L46;
        if (arguments == null) goto L46;
        if (Intrinsics.areEqual(extraDataKey, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY) == false) goto L46;
        int positionInfoStartIndex = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
        int positionInfoLength = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
        if (positionInfoLength <= 0) goto L43;
        if (positionInfoStartIndex < 0) goto L43;
        if (text == null) goto L29;
        int r4 = text.length();
    L30:
        if (positionInfoStartIndex >= r4) goto L43;
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig$ui_release());
        if (textLayoutResult != null) goto L35;
        return;
    L35:
        List boundingRects = new ArrayList();
        int i = 0;
    L36:
        if (i >= positionInfoLength) goto L42;
        if ((positionInfoStartIndex + i) < textLayoutResult.getLayoutInput().getText().length()) goto L40;
        boundingRects.add(null);
    L41:
        i = i + 1;
        goto L36
    L40:
        androidx.compose.ui.geometry.Rect bounds = textLayoutResult.getBoundingBox(positionInfoStartIndex + i);
        RectF boundsOnScreen = toScreenCoords(node, bounds);
        boundingRects.add(boundsOnScreen);
        goto L41
    L42:
        List $this$toTypedArray$iv = boundingRects;
        info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) $this$toTypedArray$iv.toArray(new RectF[0]));
        return;
    L29:
        r4 = Integer.MAX_VALUE;
    L43:
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
        return;
    L46:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag()) == false) goto L54;
        if (arguments == null) goto L54;
        if (Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey) == false) goto L54;
        String testTag = (String) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
        if (testTag == null) goto L62;
        info.getExtras().putCharSequence(extraDataKey, testTag);
        return;
    L62:
        return;
    L54:
        if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey) == false) goto L64;
        info.getExtras().putInt(extraDataKey, node.getId());
        return;
    L64:
        return;
    L69:
        return;
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode != null) goto L5;
        return null;
    L5:
        androidx.compose.ui.geometry.Rect boundsInRoot = bounds.m4162translatek4lQ0M(textNode.m6191getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect textNodeBoundsInRoot = textNode.getBoundsInRoot();
        if (boundsInRoot.overlaps(textNodeBoundsInRoot) == false) goto L8;
        androidx.compose.ui.geometry.Rect visibleBounds = boundsInRoot.intersect(textNodeBoundsInRoot);
    L10:
        if (visibleBounds == null) goto L13;
        AndroidComposeView r1 = this.view;
        float x$iv = visibleBounds.getLeft();
        float y$iv = visibleBounds.getTop();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long topLeftInScreen = r1.mo5669localToScreenMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        AndroidComposeView r2 = this.view;
        float x$iv2 = visibleBounds.getRight();
        float y$iv2 = visibleBounds.getBottom();
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long bottomRightInScreen = r2.mo5669localToScreenMKHz9U(Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)));
        int bits$iv$iv$iv = (int) (topLeftInScreen >> 32);
        int bits$iv$iv$iv2 = (int) (topLeftInScreen & 4294967295L);
        int bits$iv$iv$iv3 = (int) (bottomRightInScreen >> 32);
        int bits$iv$iv$iv4 = (int) (bottomRightInScreen & 4294967295L);
        return new RectF(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
    L13:
        return null;
    L8:
        visibleBounds = null;
        goto L10
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent event) {
        if (isTouchExplorationEnabled() == true) goto L6;
        return false;
    L6:
        switch(event.getAction()) {
            case 7: goto L13;
            case 8: goto L7;
            case 9: goto L13;
            case 10: goto L9;
            default: goto L7;
        };
    L7:
        return false;
    L13:
        int virtualViewId = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
        boolean handled = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        updateHoveredVirtualView(virtualViewId);
        if (virtualViewId == Integer.MIN_VALUE) goto L16;
        return true;
    L16:
        return handled;
    L9:
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) goto L12;
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    L12:
        return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
    }

    public final int hitTestSemanticsAt$ui_release(float x, float y) {
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitSemanticsEntities = new HitTestResult();
        LayoutNode r4 = this.view.getRoot();
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        LayoutNode.m5885hitTestSemantics6fMxITs$ui_release$default(r4, Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)), hitSemanticsEntities, 0, false, 12, null);
        int i = CollectionsKt.getLastIndex(hitSemanticsEntities);
    L4:
        if ((-1) >= i) goto L18;
        LayoutNode layoutNode = DelegatableNodeKt.requireLayoutNode(hitSemanticsEntities.get(i));
        AndroidViewHolder androidView = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode);
        if (androidView != null) goto L7;
        if (layoutNode.getNodes$ui_release().m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L16;
        int virtualViewId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNode.getSemanticsId());
        SemanticsNode semanticsNode = SemanticsNodeKt.SemanticsNode(layoutNode, false);
        if (SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode) == false) goto L16;
        if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker()) == true) goto L16;
        return virtualViewId;
    L16:
        i = i - 1;
        goto L4
    L7:
        return Integer.MIN_VALUE;
    L18:
        return Integer.MIN_VALUE;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        if (this.hoveredVirtualViewId != virtualViewId) goto L5;
        return;
    L5:
        int previousVirtualViewId = this.hoveredVirtualViewId;
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, previousVirtualViewId, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T r5, int r6) {
        boolean r1 = true;
        if (r6 <= 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L26;
        int r3 = r6;
        if (r5 != null) goto L10;
    L13:
        if (r1 == false) goto L15;
    L24:
        return r5;
    L15:
        if (r5.length() <= r6) goto L24;
        if (Character.isHighSurrogate(r5.charAt(r6 - 1)) == true) goto L20;
    L22:
        T r0 = (T) r5.subSequence(0, r3);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return r0;
    L20:
        if (Character.isLowSurrogate(r5.charAt(r6)) == false) goto L22;
        r3 = r6 - 1;
        goto L22
    L10:
        if (r5.length() == 0) goto L13;
        r1 = false;
        goto L13
    L26:
        throw new IllegalArgumentException("size should be greater than 0".toString());
    L5:
        r2 = false;
        goto L6
    }

    static final void semanticsChangeChecker$lambda$37(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Trace.beginSection("measureAndLayout");
        Owner.measureAndLayout$default(this$0.view, false, 1, null);     // Catch: Throwable -> L11
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        Trace.endSection();
        Trace.beginSection("checkForSemanticsChanges");
        this$0.checkForSemanticsChanges();     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        Trace.endSection();
        this$0.checkingForSemanticsChanges = false;
        return;
    L8:
        th = move-exception;
        Trace.endSection();
        throw th;
    L11:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        if (this.checkingForSemanticsChanges == true) goto L9;
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
        return;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00de -> B:20:0x0068). Please report as a decompilation issue!!! */
    public final Object boundsUpdatesEventLoop$ui_release(Continuation<? super Unit> r12) {
        if ((r12 instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) == false) goto L7;
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L18;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator<Unit> r3 = (ChannelIterator) r0.L$2;
        MutableIntSet subtreeChangedSemanticsNodesIds = (MutableIntSet) r0.L$1;
        AndroidComposeViewAccessibilityDelegateCompat r6 = (AndroidComposeViewAccessibilityDelegateCompat) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L43
        ChannelIterator<Unit> r5 = r3;
        MutableIntSet subtreeChangedSemanticsNodesIds2 = subtreeChangedSemanticsNodesIds;
    L20:
        r0.L$0 = r6;     // Catch: Throwable -> L43
        r0.L$1 = subtreeChangedSemanticsNodesIds2;     // Catch: Throwable -> L43
        r0.L$2 = r5;     // Catch: Throwable -> L43
        r0.label = 1;     // Catch: Throwable -> L43
        Object r7 = r5.hasNext(r0);     // Catch: Throwable -> L43
        if (r7 != $result2) goto L23;
        return $result2;
    L23:
        Object r10 = $result2;
        Object $result3 = $result;
        $result = r7;
        AndroidComposeViewAccessibilityDelegateCompat r8 = r6;
        MutableIntSet subtreeChangedSemanticsNodesIds3 = subtreeChangedSemanticsNodesIds2;
        Object r4 = r10;
    L48:
        if (((Boolean) $result).booleanValue() == false) goto L39;
        r5.next();     // Catch: Throwable -> L41
        if (r8.isEnabled$ui_release() == false) goto L34;
        int i = 0;
        int r9 = r8.subtreeChangedLayoutNodes.size();     // Catch: Throwable -> L41
    L29:
        if (i >= r9) goto L31;
        LayoutNode layoutNode = r8.subtreeChangedLayoutNodes.valueAt(i);     // Catch: Throwable -> L41
        r8.sendSubtreeChangeAccessibilityEvents(layoutNode, subtreeChangedSemanticsNodesIds3);     // Catch: Throwable -> L41
        r8.sendTypeViewScrolledAccessibilityEvent(layoutNode);     // Catch: Throwable -> L41
        i = i + 1;     // Catch: Throwable -> L41
        goto L29
    L31:
        subtreeChangedSemanticsNodesIds3.clear();     // Catch: Throwable -> L41
        if (r8.checkingForSemanticsChanges == true) goto L34;
        r8.checkingForSemanticsChanges = true;     // Catch: Throwable -> L41
        r8.handler.post(r8.semanticsChangeChecker);     // Catch: Throwable -> L41
    L34:
        r8.subtreeChangedLayoutNodes.clear();     // Catch: Throwable -> L41
        r8.pendingHorizontalScrollEvents.clear();     // Catch: Throwable -> L41
        r8.pendingVerticalScrollEvents.clear();     // Catch: Throwable -> L41
        long r11 = r8.SendRecurringAccessibilityEventsIntervalMillis;     // Catch: Throwable -> L41
        r0.L$0 = r8;     // Catch: Throwable -> L41
        r0.L$1 = subtreeChangedSemanticsNodesIds3;     // Catch: Throwable -> L41
        r0.L$2 = r5;     // Catch: Throwable -> L41
        r0.label = 2;     // Catch: Throwable -> L41
        if (DelayKt.delay(r11, r0) != r4) goto L37;
        return r4;
    L37:
        $result = $result3;
        $result2 = r4;
        subtreeChangedSemanticsNodesIds2 = subtreeChangedSemanticsNodesIds3;
        r6 = r8;
        goto L20
    L39:
        r8.subtreeChangedLayoutNodes.clear();
        return Unit.INSTANCE;
    L41:
        th = move-exception;
        th = th;
        r6 = r8;
    L44:
        r6.subtreeChangedLayoutNodes.clear();
        throw th;
    L15:
        ChannelIterator<Unit> r13 = (ChannelIterator) r0.L$2;
        MutableIntSet subtreeChangedSemanticsNodesIds4 = (MutableIntSet) r0.L$1;
        AndroidComposeViewAccessibilityDelegateCompat r14 = (AndroidComposeViewAccessibilityDelegateCompat) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L43
        r8 = r14;
        subtreeChangedSemanticsNodesIds3 = subtreeChangedSemanticsNodesIds4;
        r5 = r13;
        r4 = $result2;
        $result3 = $result;
        goto L48
    L18:
        ResultKt.throwOnFailure($result);
        r6 = this;
        subtreeChangedSemanticsNodesIds2 = new MutableIntSet(0, 1, null);     // Catch: Throwable -> L43
        r5 = r6.boundsUpdateChannel.iterator();     // Catch: Throwable -> L43
        goto L20
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L43:
        th = th;
    L7:
        r0 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, r12);
        goto L8
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode) == false) goto L6;
        this.boundsUpdateChannel.mo8915trySendJP2dKIU(Unit.INSTANCE);
        return;
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() == true) goto L6;
        return;
    L6:
        if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode) == false) goto L8;
        return;
    L8:
        int id = layoutNode.getSemanticsId();
        ScrollAxisRange pendingHorizontalScroll = this.pendingHorizontalScrollEvents.get(id);
        ScrollAxisRange pendingVerticalScroll = this.pendingVerticalScrollEvents.get(id);
        if (pendingHorizontalScroll != null) goto L12;
        if (pendingVerticalScroll != null) goto L12;
        return;
    L12:
        AccessibilityEvent event = createEvent(id, 4096);
        if (pendingHorizontalScroll == null) goto L15;
        event.setScrollX((int) pendingHorizontalScroll.getValue().invoke().floatValue());
        event.setMaxScrollX((int) pendingHorizontalScroll.getMaxValue().invoke().floatValue());
    L15:
        if (pendingVerticalScroll == null) goto L17;
        event.setScrollY((int) pendingVerticalScroll.getValue().invoke().floatValue());
        event.setMaxScrollY((int) pendingVerticalScroll.getMaxValue().invoke().floatValue());
    L17:
        sendEvent(event);
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet subtreeChangedSemanticsNodesIds) {
        if (layoutNode.isAttached() == true) goto L6;
        return;
    L6:
        if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode) == false) goto L9;
        return;
    L9:
        if (layoutNode.getNodes$ui_release().m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L11;
        LayoutNode r1 = layoutNode;
    L13:
        if (r1 == null) goto L29;
        SemanticsConfiguration config = r1.getSemanticsConfiguration();
        if (config != null) goto L18;
        return;
    L18:
        if (config.isMergingSemanticsOfDescendants() == true) goto L22;
        LayoutNode it = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r1, C06511.INSTANCE);
        if (it == null) goto L22;
        r1 = it;
    L22:
        if (r1 == null) goto L28;
        int id = r1.getSemanticsId();
        if (subtreeChangedSemanticsNodesIds.add(id) == true) goto L26;
        return;
    L26:
        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(id), 2048, 1, null, 8, null);
        return;
    L28:
        return;
    L29:
        return;
    L11:
        r1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE);
        goto L13
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
    L19:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        if (isEnabled$ui_release() == false) goto L6;
        sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);     // Catch: Throwable -> L19
    L6:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L19
        Trace.endSection();
        Trace.beginSection("sendSemanticsPropertyChangeEvents");
        sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());     // Catch: Throwable -> L16
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L16
        Trace.endSection();
        Trace.beginSection("updateSemanticsNodesCopyAndPanes");
        updateSemanticsNodesCopyAndPanes();     // Catch: Throwable -> L13
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L13
        Trace.endSection();
        return;
    L13:
        th = move-exception;
        Trace.endSection();
        throw th;
    L16:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        MutableIntSet toRemove = new MutableIntSet(0, 1, null);
        IntSet this_$iv = this.paneDisplayed;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        long r15 = 255;
        int r2 = 8;
        if (0 > lastIndex$iv$iv) goto L39;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = 128;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == (-9187201950435737472L)) goto L36;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L33;
        long value$iv$iv$iv = slot$iv$iv & r15;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L31;
        long r26 = r15;
        int id = k$iv[(i$iv$iv << 3) + j$iv$iv];
        int r28 = r2;
        SemanticsNodeWithAdjustedBounds r3 = getCurrentSemanticsNodes().get(id);
        if (r3 == null) goto L16;
        SemanticsNode currentNode = r3.getSemanticsNode();
    L18:
        if (currentNode == null) goto L22;
        int j$iv$iv2 = j$iv$iv;
        if (currentNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPaneTitle()) == true) goto L32;
    L23:
        toRemove.add(id);
        SemanticsNodeCopy r4 = this.previousSemanticsNodes.get(id);
        if (r4 == null) goto L28;
        SemanticsConfiguration r5 = r4.getUnmergedConfig();
        if (r5 == null) goto L28;
        String r6 = (String) SemanticsConfigurationKt.getOrNull(r5, SemanticsProperties.INSTANCE.getPaneTitle());
    L29:
        sendPaneChangeEvents(id, 32, r6);
    L28:
        r6 = null;
    L32:
        slot$iv$iv = slot$iv$iv >> r28;
        j$iv$iv = j$iv$iv2 + 1;
        r15 = r26;
        r2 = r28;
        goto L7
    L22:
        j$iv$iv2 = j$iv$iv;
        goto L23
    L16:
        currentNode = null;
        goto L18
    L31:
        r28 = r2;
        j$iv$iv2 = j$iv$iv;
        r26 = r15;
        goto L32
    L11:
        r13 = false;
        goto L12
    L33:
        long r27 = r15;
        if (bitCount$iv$iv != r2) goto L41;
    L37:
        if (i$iv$iv == lastIndex$iv$iv) goto L41;
        i$iv$iv = i$iv$iv + 1;
        r15 = r27;
        r2 = 8;
    L41:
        this.paneDisplayed.removeAll(toRemove);
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r7 = getCurrentSemanticsNodes();
        int $i$f$forEach = 0;
        int[] k$iv2 = r7.keys;
        Object[] v$iv = r7.values;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r8 = r7;
        long[] m$iv$iv2 = r8.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L68;
    L43:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        MutableIntSet toRemove2 = toRemove;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r20 = r7;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L63;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv3 = 0;
    L46:
        if (j$iv$iv3 >= bitCount$iv$iv2) goto L60;
        long value$iv$iv$iv2 = slot$iv$iv2 & r27;
        if (value$iv$iv$iv2 >= $this$maskEmptyOrDeleted$iv$iv$iv) goto L50;
        boolean r14 = true;
    L51:
        if (r14 == false) goto L59;
        int index$iv$iv = (i$iv$iv2 << 3) + j$iv$iv3;
        int j$iv$iv4 = k$iv2[index$iv$iv];
        SemanticsNodeWithAdjustedBounds value = (SemanticsNodeWithAdjustedBounds) v$iv[index$iv$iv];
        if (value.getSemanticsNode().getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPaneTitle()) == true) goto L55;
    L57:
        this.previousSemanticsNodes.set(j$iv$iv4, new SemanticsNodeCopy(value.getSemanticsNode(), getCurrentSemanticsNodes()));
        goto L59
    L55:
        if (this.paneDisplayed.add(j$iv$iv4) == false) goto L57;
        sendPaneChangeEvents(j$iv$iv4, 16, (String) value.getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
    L59:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv3 = j$iv$iv3 + 1;
        v$iv = v$iv;
        $i$f$forEach = $i$f$forEach;
        k$iv2 = k$iv2;
        r8 = r8;
        goto L46
    L50:
        r14 = false;
        goto L51
    L60:
        int $i$f$forEach2 = $i$f$forEach;
        int[] k$iv3 = k$iv2;
        Object[] v$iv2 = v$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r32 = r8;
        if (bitCount$iv$iv2 != 8) goto L68;
    L64:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L68;
        i$iv$iv2 = i$iv$iv2 + 1;
        toRemove = toRemove2;
        r7 = r20;
        v$iv = v$iv2;
        $i$f$forEach = $i$f$forEach2;
        k$iv2 = k$iv3;
        r8 = r32;
        goto L43
    L63:
        $i$f$forEach2 = $i$f$forEach;
        k$iv3 = k$iv2;
        v$iv2 = v$iv;
        r32 = r8;
    L68:
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
        return;
    L36:
        r27 = r15;
        goto L37
    L39:
        r27 = 255;
        $this$maskEmptyOrDeleted$iv$iv$iv = 128;
        goto L41
    }

    private final void sendSemanticsPropertyChangeEvents(IntObjectMap<SemanticsNodeWithAdjustedBounds> r75) {
        AndroidComposeViewAccessibilityDelegateCompat r0 = this;
        ArrayList oldScrollObservationScopes = new ArrayList(r0.scrollObservationScopes);
        r0.scrollObservationScopes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r8 = r75;
        int i$iv$iv = 0;
        int[] k$iv = r8.keys;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r11 = r8;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = r11.metadata;
        int r14 = 2;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv) goto L224;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv2];
        int r16 = r14;
        int lastIndex$iv$iv2 = lastIndex$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L217;
        int r15 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        long slot$iv$iv2 = slot$iv$iv;
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L214;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r3 = true;
    L12:
        if (r3 == false) goto L212;
        int id = k$iv[(i$iv$iv2 << 3) + j$iv$iv];
        SemanticsNodeCopy oldNode = r0.previousSemanticsNodes.get(id);
        if (oldNode != null) goto L16;
        int i$iv$iv3 = i$iv$iv2;
        int j$iv$iv2 = j$iv$iv;
        ArrayList oldScrollObservationScopes2 = oldScrollObservationScopes;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r38 = r8;
        int $i$f$forEachKey = i$iv$iv;
        int[] k$iv2 = k$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r58 = r11;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        long[] m$iv$iv2 = m$iv$iv;
    L213:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        r15 = 8;
        oldScrollObservationScopes = oldScrollObservationScopes2;
        r8 = r38;
        i$iv$iv = $i$f$forEachKey;
        k$iv = k$iv2;
        r11 = r58;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv2;
        i$iv$iv2 = i$iv$iv3;
        j$iv$iv = j$iv$iv2 + 1;
        r0 = this;
        goto L7
    L16:
        SemanticsNodeWithAdjustedBounds r5 = r75.get(id);
        if (r5 == null) goto L19;
        SemanticsNode newNode = r5.getSemanticsNode();
    L21:
        if (newNode == null) goto L210;
        boolean propertyChanged = false;
        int j$iv$iv3 = j$iv$iv;
        ScatterMap this_$iv$iv = newNode.getUnmergedConfig$ui_release().getProps$ui_release();
        Object[] k$iv3 = this_$iv$iv.keys;
        Object[] k$iv4 = k$iv3;
        Object[] k$iv5 = this_$iv$iv.values;
        ScatterMap this_$iv = this_$iv$iv;
        Object[] v$iv = k$iv5;
        long[] m$iv$iv3 = this_$iv$iv.metadata;
        int r41 = r15;
        int lastIndex$iv$iv3 = m$iv$iv3.length - 2;
        int i$iv$iv4 = i$iv$iv2;
        int i$iv$iv5 = 0;
        if (0 > lastIndex$iv$iv3) goto L200;
    L24:
        long slot$iv$iv3 = m$iv$iv3[i$iv$iv5];
        int i$iv$iv6 = i$iv$iv5;
        ScatterMap this_$iv2 = this_$iv$iv;
        long[] m$iv$iv4 = m$iv$iv3;
        SemanticsNode newNode2 = newNode;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv3) << 7) & slot$iv$iv3) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == (-9187201950435737472L)) goto L197;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv6 - lastIndex$iv$iv3)) >>> 31);
        int j$iv$iv4 = 0;
        long slot$iv$iv4 = slot$iv$iv3;
        boolean propertyChanged2 = propertyChanged;
    L27:
        if (j$iv$iv4 >= bitCount$iv$iv2) goto L194;
        long value$iv$iv$iv2 = slot$iv$iv4 & 255;
        if (value$iv$iv$iv2 >= 128) goto L31;
        boolean r4 = true;
    L32:
        if (r4 == false) goto L192;
        int index$iv$iv = (i$iv$iv6 << 3) + j$iv$iv4;
        Object r6 = k$iv4[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        SemanticsPropertyKey key = (SemanticsPropertyKey) r6;
        int bitCount$iv$iv3 = bitCount$iv$iv2;
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) == false) goto L36;
    L39:
        boolean newlyObservingScroll = r0.registerScrollingId(id, oldScrollObservationScopes);
        boolean newlyObservingScroll2 = newlyObservingScroll;
    L40:
        if (newlyObservingScroll2 == true) goto L45;
        if (Intrinsics.areEqual(value, SemanticsConfigurationKt.getOrNull(oldNode.getUnmergedConfig(), key)) == false) goto L45;
        int j$iv$iv5 = j$iv$iv4;
        int[] k$iv6 = k$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r59 = r11;
        int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        long[] m$iv$iv5 = m$iv$iv;
        int i$iv$iv7 = i$iv$iv4;
        int bitCount$iv$iv4 = bitCount$iv$iv3;
        int bitCount$iv$iv5 = i$iv$iv;
        Object[] v$iv2 = v$iv;
        int $i$f$forEachKey2 = i$iv$iv6;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r39 = r8;
        long[] m$iv$iv6 = m$iv$iv4;
        ScatterMap this_$iv$iv2 = this_$iv2;
        int id2 = id;
        ScatterMap this_$iv$iv3 = this_$iv;
        Object[] k$iv7 = k$iv4;
        int j$iv$iv6 = j$iv$iv3;
        ArrayList oldScrollObservationScopes3 = oldScrollObservationScopes;
    L193:
        slot$iv$iv4 = slot$iv$iv4 >> 8;
        r41 = 8;
        id = id2;
        oldScrollObservationScopes = oldScrollObservationScopes3;
        j$iv$iv3 = j$iv$iv6;
        r8 = r39;
        k$iv4 = k$iv7;
        v$iv = v$iv2;
        this_$iv = this_$iv$iv3;
        r11 = r59;
        $i$f$forEachIndexed = $i$f$forEachIndexed3;
        m$iv$iv = m$iv$iv5;
        i$iv$iv4 = i$iv$iv7;
        j$iv$iv4 = j$iv$iv5 + 1;
        bitCount$iv$iv2 = bitCount$iv$iv4;
        this_$iv2 = this_$iv$iv2;
        m$iv$iv4 = m$iv$iv6;
        k$iv = k$iv6;
        i$iv$iv6 = $i$f$forEachKey2;
        i$iv$iv = bitCount$iv$iv5;
    L45:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getPaneTitle()) == false) goto L50;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
        String paneTitle = (String) value;
        j$iv$iv5 = j$iv$iv4;
        if (oldNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle()) == false) goto L49;
        r0.sendPaneChangeEvents(id, r41, paneTitle);
        k$iv6 = k$iv;
        r59 = r11;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        m$iv$iv5 = m$iv$iv;
        i$iv$iv7 = i$iv$iv4;
        bitCount$iv$iv4 = bitCount$iv$iv3;
        bitCount$iv$iv5 = i$iv$iv;
        v$iv2 = v$iv;
        $i$f$forEachKey2 = i$iv$iv6;
        r39 = r8;
        m$iv$iv6 = m$iv$iv4;
        this_$iv$iv2 = this_$iv2;
        id2 = id;
        this_$iv$iv3 = this_$iv;
        k$iv7 = k$iv4;
        j$iv$iv6 = j$iv$iv3;
        oldScrollObservationScopes3 = oldScrollObservationScopes;
        goto L193
    L49:
        k$iv6 = k$iv;
        r59 = r11;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        m$iv$iv5 = m$iv$iv;
        i$iv$iv7 = i$iv$iv4;
        bitCount$iv$iv4 = bitCount$iv$iv3;
        bitCount$iv$iv5 = i$iv$iv;
        v$iv2 = v$iv;
        $i$f$forEachKey2 = i$iv$iv6;
        r39 = r8;
        m$iv$iv6 = m$iv$iv4;
        this_$iv$iv2 = this_$iv2;
        id2 = id;
        this_$iv$iv3 = this_$iv;
        k$iv7 = k$iv4;
        j$iv$iv6 = j$iv$iv3;
        oldScrollObservationScopes3 = oldScrollObservationScopes;
        goto L193
    L50:
        j$iv$iv5 = j$iv$iv4;
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getStateDescription()) == false) goto L53;
        boolean r1 = true;
    L55:
        if (r1 == false) goto L57;
        int r73 = j$iv$iv3;
        oldScrollObservationScopes3 = oldScrollObservationScopes;
        int i$iv$iv8 = i$iv$iv4;
        v$iv2 = v$iv;
        r39 = r8;
        id2 = id;
        k$iv6 = k$iv;
        bitCount$iv$iv4 = bitCount$iv$iv3;
        bitCount$iv$iv5 = i$iv$iv;
        $i$f$forEachKey2 = i$iv$iv6;
        m$iv$iv6 = m$iv$iv4;
        this_$iv$iv2 = this_$iv2;
        this_$iv$iv3 = this_$iv;
        k$iv7 = k$iv4;
        j$iv$iv6 = r73;
        r59 = r11;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id), 2048, 64, null, 8, null);
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 0, null, 8, null);
        i$iv$iv7 = i$iv$iv8;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L57:
        k$iv6 = k$iv;
        r59 = r11;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        bitCount$iv$iv4 = bitCount$iv$iv3;
        bitCount$iv$iv5 = i$iv$iv;
        $i$f$forEachKey2 = i$iv$iv6;
        m$iv$iv6 = m$iv$iv4;
        this_$iv$iv2 = this_$iv2;
        this_$iv$iv3 = this_$iv;
        k$iv7 = k$iv4;
        j$iv$iv6 = j$iv$iv3;
        oldScrollObservationScopes3 = oldScrollObservationScopes;
        int i$iv$iv9 = i$iv$iv4;
        v$iv2 = v$iv;
        r39 = r8;
        id2 = id;
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getProgressBarRangeInfo()) == false) goto L61;
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 64, null, 8, null);
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 0, null, 8, null);
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L61:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getSelected()) == false) goto L87;
        Role r2 = (Role) SemanticsConfigurationKt.getOrNull(newNode2.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        int r7 = Role.Companion.m6188getTabo7Vup1c();
        if (r2 != null) goto L65;
        boolean r9 = false;
    L66:
        if (r9 == true) goto L68;
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 64, null, 8, null);
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 0, null, 8, null);
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L68:
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(newNode2.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected()), true) == false) goto L84;
        AccessibilityEvent event = r0.createEvent(r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 4);
        SemanticsNode mergedNode = newNode2.copyWithMergingEnabled$ui_release();
        List r60 = (List) SemanticsConfigurationKt.getOrNull(mergedNode.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        if (r60 == null) goto L72;
        String contentDescription = ListUtilsKt.fastJoinToString$default(r60, ",", null, null, 0, null, null, 62, null);
    L73:
        List r61 = (List) SemanticsConfigurationKt.getOrNull(mergedNode.getConfig(), SemanticsProperties.INSTANCE.getText());
        if (r61 == null) goto L76;
        String text = ListUtilsKt.fastJoinToString$default(r61, ",", null, null, 0, null, null, 62, null);
    L78:
        if (contentDescription == null) goto L81;
        String it = contentDescription;
        event.setContentDescription(it);
        Unit r10 = Unit.INSTANCE;
        Unit r12 = Unit.INSTANCE;
    L81:
        if (text == null) goto L83;
        String it2 = text;
        Boolean.valueOf(event.getText().add(it2));
    L83:
        r0.sendEvent(event);
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L76:
        text = null;
        goto L78
    L72:
        contentDescription = null;
        goto L73
    L84:
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, 0, null, 8, null);
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L65:
        r9 = Role.m6177equalsimpl0(r2.m6180unboximpl(), r7);
        goto L66
    L87:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getContentDescription()) == false) goto L89;
        int r13 = r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2);
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        r0.sendEventForVirtualView(r13, 2048, 4, (List) value);
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        goto L193
    L89:
        String r17 = "";
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getEditableText()) == true) goto L92;
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getTextSelectionRange()) == false) goto L150;
        AnnotatedString r18 = r0.getTextForTextField(newNode2.getUnmergedConfig$ui_release());
        if (r18 == null) goto L148;
        String r19 = r18.getText();
        if (r19 == null) goto L148;
        r17 = r19;
    L148:
        String newText = r17;
        long textRange = ((TextRange) newNode2.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6421unboximpl();
        r0.sendEvent(r0.createTextSelectionChangedEvent(r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), Integer.valueOf(TextRange.m6417getStartimpl(textRange)), Integer.valueOf(TextRange.m6412getEndimpl(textRange)), Integer.valueOf(newText.length()), r0.trimToSize(newText, ParcelSafeTextLength)));
        r0.sendPendingTextTraversedAtGranularityEvent(newNode2.getId());
        goto L193
    L150:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) == false) goto L152;
        boolean r20 = true;
    L153:
        if (r20 == false) goto L156;
        r0.notifySubtreeAccessibilityStateChangedIfNeeded(newNode2.getLayoutNode$ui_release());
        ScrollObservationScope scope = SemanticsUtils_androidKt.findById(r0.scrollObservationScopes, id2);
        Intrinsics.checkNotNull(scope);
        scope.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(newNode2.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
        scope.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(newNode2.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
        r0.scheduleScrollEventIfNeeded(scope);
        goto L193
    L156:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getFocused()) == false) goto L162;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) value).booleanValue() == false) goto L160;
        r0.sendEvent(r0.createEvent(r0.semanticsNodeIdToAccessibilityVirtualNodeId(newNode2.getId()), 8));
    L160:
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(newNode2.getId()), 2048, 0, null, 8, null);
        goto L193
    L162:
        if (Intrinsics.areEqual(key, SemanticsActions.INSTANCE.getCustomActions()) == false) goto L183;
        List actions = (List) newNode2.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
        List oldActions = (List) SemanticsConfigurationKt.getOrNull(oldNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
        if (oldActions == null) goto L180;
        Set labels = new LinkedHashSet();
        int index$iv = 0;
        int r21 = actions.size();
    L166:
        if (index$iv >= r21) goto L168;
        Object item$iv = actions.get(index$iv);
        CustomAccessibilityAction action = (CustomAccessibilityAction) item$iv;
        labels.add(action.getLabel());
        index$iv = index$iv + 1;
        actions = actions;
        goto L166
    L168:
        Set oldLabels = new LinkedHashSet();
        int index$iv2 = 0;
        int r22 = oldActions.size();
    L169:
        if (index$iv2 >= r22) goto L172;
        Object item$iv2 = oldActions.get(index$iv2);
        CustomAccessibilityAction action2 = (CustomAccessibilityAction) item$iv2;
        oldLabels.add(action2.getLabel());
        index$iv2 = index$iv2 + 1;
        oldActions = oldActions;
        goto L169
    L172:
        if (labels.containsAll(oldLabels) == true) goto L174;
    L177:
        boolean r23 = true;
    L178:
        propertyChanged2 = r23;
        goto L193
    L174:
        if (oldLabels.containsAll(labels) == false) goto L177;
        r23 = false;
        goto L178
    L180:
        if (actions.isEmpty() == true) goto L193;
        propertyChanged2 = true;
        goto L193
    L183:
        if ((value instanceof AccessibilityAction) == true) goto L185;
        boolean r24 = true;
    L189:
        propertyChanged2 = r24;
        goto L193
    L185:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$accessibilityEquals((AccessibilityAction) value, SemanticsConfigurationKt.getOrNull(oldNode.getUnmergedConfig(), key)) == true) goto L187;
        r24 = true;
        goto L189
    L187:
        r24 = false;
        goto L189
    L152:
        r20 = Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        goto L153
    L92:
        if (newNode2.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText()) == false) goto L139;
        AnnotatedString r25 = r0.getTextForTextField(oldNode.getUnmergedConfig());
        if (r25 == null) goto L96;
        CharSequence r26 = r25;
    L97:
        CharSequence oldText = r26;
        AnnotatedString r27 = r0.getTextForTextField(newNode2.getUnmergedConfig$ui_release());
        if (r27 == null) goto L100;
        String newText2 = r27;
    L101:
        CharSequence trimmedNewText = r0.trimToSize(newText2, ParcelSafeTextLength);
        int startCount = 0;
        int endCount = 0;
        int oldTextLen = oldText.length();
        m$iv$iv5 = m$iv$iv;
        int newTextLen = newText2.length();
        i$iv$iv7 = i$iv$iv9;
        int minLength = RangesKt.coerceAtMost(oldTextLen, newTextLen);
    L102:
        if (startCount >= minLength) goto L107;
        int endCount2 = endCount;
        int endCount3 = oldText.charAt(startCount);
        int oldTextLen2 = oldTextLen;
        if (endCount3 != newText2.charAt(startCount)) goto L108;
        startCount = startCount + 1;
        endCount = endCount2;
        oldTextLen = oldTextLen2;
    L108:
        int endCount4 = endCount2;
    L110:
        if (endCount4 >= (minLength - startCount)) goto L115;
        int endCount5 = endCount4;
        if (oldText.charAt((oldTextLen2 - 1) - endCount4) != newText2.charAt((newTextLen - 1) - endCount5)) goto L116;
        endCount4 = endCount5 + 1;
    L116:
        int removedCount = (oldTextLen2 - endCount5) - startCount;
        int addedCount = (newTextLen - endCount5) - startCount;
        boolean oldNodeIsPassword = oldNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
        boolean newNodeIsPassword = newNode2.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword());
        boolean oldNodeIsTextfield = oldNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
        if (oldNodeIsTextfield == false) goto L121;
        if (oldNodeIsPassword == true) goto L121;
        if (newNodeIsPassword == false) goto L121;
        boolean r28 = true;
    L122:
        boolean becamePasswordNode = r28;
        if (oldNodeIsTextfield == false) goto L127;
        if (oldNodeIsPassword == false) goto L127;
        if (newNodeIsPassword == true) goto L127;
        boolean r29 = true;
    L128:
        boolean becameNotPasswordNode = r29;
        if (becamePasswordNode == true) goto L134;
        if (becameNotPasswordNode == true) goto L134;
        AccessibilityEvent $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449 = r0.createEvent(r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 16);
        $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449.setFromIndex(startCount);
        $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449.setRemovedCount(removedCount);
        $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449.setAddedCount(addedCount);
        $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449.setBeforeText(oldText);
        $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449.getText().add(trimmedNewText);
        AccessibilityEvent event2 = $this$sendSemanticsPropertyChangeEvents_u24lambda_u2453_u24lambda_u2452_u24lambda_u2449;
    L135:
        event2.setClassName(TextFieldClassName);
        r0.sendEvent(event2);
        if (becamePasswordNode == true) goto L138;
        if (becameNotPasswordNode == false) goto L193;
    L138:
        long textRange2 = ((TextRange) newNode2.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6421unboximpl();
        event2.setFromIndex(TextRange.m6417getStartimpl(textRange2));
        event2.setToIndex(TextRange.m6412getEndimpl(textRange2));
        r0.sendEvent(event2);
    L134:
        event2 = r0.createTextSelectionChangedEvent(r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 0, 0, Integer.valueOf(newTextLen), trimmedNewText);
    L127:
        r29 = false;
    L121:
        r28 = false;
        goto L122
    L115:
        endCount5 = endCount4;
        goto L116
    L107:
        endCount2 = endCount;
        oldTextLen2 = oldTextLen;
        goto L108
    L100:
        goto L101
    L96:
        goto L97
    L139:
        i$iv$iv7 = i$iv$iv9;
        m$iv$iv5 = m$iv$iv;
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id2), 2048, Integer.valueOf(r16), null, 8, null);
        goto L193
    L53:
        r1 = Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getToggleableState());
        goto L55
    L36:
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()) == true) goto L39;
        newlyObservingScroll2 = false;
        goto L40
    L192:
        j$iv$iv5 = j$iv$iv4;
        bitCount$iv$iv5 = i$iv$iv;
        k$iv6 = k$iv;
        r59 = r11;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        m$iv$iv5 = m$iv$iv;
        i$iv$iv7 = i$iv$iv4;
        $i$f$forEachKey2 = i$iv$iv6;
        bitCount$iv$iv4 = bitCount$iv$iv2;
        v$iv2 = v$iv;
        m$iv$iv6 = m$iv$iv4;
        this_$iv$iv2 = this_$iv2;
        r39 = r8;
        this_$iv$iv3 = this_$iv;
        id2 = id;
        k$iv7 = k$iv4;
        j$iv$iv6 = j$iv$iv3;
        oldScrollObservationScopes3 = oldScrollObservationScopes;
        goto L193
    L31:
        r4 = false;
        goto L32
    L194:
        $i$f$forEachKey = i$iv$iv;
        k$iv2 = k$iv;
        r58 = r11;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv2 = m$iv$iv;
        int j$iv$iv7 = r41;
        i$iv$iv3 = i$iv$iv4;
        int $i$f$forEachKey3 = i$iv$iv6;
        Object[] v$iv3 = v$iv;
        long[] m$iv$iv7 = m$iv$iv4;
        ScatterMap this_$iv$iv4 = this_$iv2;
        r38 = r8;
        ScatterMap this_$iv$iv5 = this_$iv;
        int id3 = id;
        Object[] k$iv8 = k$iv4;
        j$iv$iv2 = j$iv$iv3;
        oldScrollObservationScopes2 = oldScrollObservationScopes;
        if (bitCount$iv$iv2 != j$iv$iv7) goto L203;
        propertyChanged = propertyChanged2;
    L198:
        if ($i$f$forEachKey3 == lastIndex$iv$iv3) goto L201;
        i$iv$iv5 = $i$f$forEachKey3 + 1;
        id = id3;
        oldScrollObservationScopes = oldScrollObservationScopes2;
        j$iv$iv3 = j$iv$iv2;
        r8 = r38;
        k$iv4 = k$iv8;
        v$iv = v$iv3;
        newNode = newNode2;
        this_$iv$iv = this_$iv$iv4;
        this_$iv = this_$iv$iv5;
        m$iv$iv3 = m$iv$iv7;
        i$iv$iv = $i$f$forEachKey;
        k$iv = k$iv2;
        r11 = r58;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv2;
        i$iv$iv4 = i$iv$iv3;
        r41 = 8;
    L201:
        propertyChanged2 = propertyChanged;
    L203:
        if (propertyChanged2 == true) goto L206;
        propertyChanged2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$propertiesDeleted(newNode2, oldNode.getUnmergedConfig());
    L206:
        if (propertyChanged2 == false) goto L213;
        sendEventForVirtualView$default(r0, r0.semanticsNodeIdToAccessibilityVirtualNodeId(id3), 2048, 0, null, 8, null);
        goto L213
    L197:
        $i$f$forEachKey = i$iv$iv;
        k$iv2 = k$iv;
        r58 = r11;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv2 = m$iv$iv;
        i$iv$iv3 = i$iv$iv4;
        $i$f$forEachKey3 = i$iv$iv6;
        v$iv3 = v$iv;
        m$iv$iv7 = m$iv$iv4;
        this_$iv$iv4 = this_$iv2;
        r38 = r8;
        this_$iv$iv5 = this_$iv;
        id3 = id;
        k$iv8 = k$iv4;
        j$iv$iv2 = j$iv$iv3;
        oldScrollObservationScopes2 = oldScrollObservationScopes;
        goto L198
    L200:
        newNode2 = newNode;
        $i$f$forEachKey = i$iv$iv;
        k$iv2 = k$iv;
        r58 = r11;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv2 = m$iv$iv;
        i$iv$iv3 = i$iv$iv4;
        r38 = r8;
        j$iv$iv2 = j$iv$iv3;
        id3 = id;
        oldScrollObservationScopes2 = oldScrollObservationScopes;
        goto L201
    L210:
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
        throw new KotlinNothingValueException();
    L19:
        newNode = null;
        goto L21
    L212:
        i$iv$iv3 = i$iv$iv2;
        j$iv$iv2 = j$iv$iv;
        oldScrollObservationScopes2 = oldScrollObservationScopes;
        r38 = r8;
        $i$f$forEachKey = i$iv$iv;
        k$iv2 = k$iv;
        r58 = r11;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv2 = m$iv$iv;
        goto L213
    L11:
        r3 = false;
        goto L12
    L214:
        int i$iv$iv10 = i$iv$iv2;
        ArrayList oldScrollObservationScopes4 = oldScrollObservationScopes;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r310 = r8;
        int $i$f$forEachKey4 = i$iv$iv;
        int[] k$iv9 = k$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r510 = r11;
        int $i$f$forEachIndexed4 = $i$f$forEachIndexed;
        long[] m$iv$iv8 = m$iv$iv;
        int j$iv$iv8 = r15;
        if (bitCount$iv$iv != j$iv$iv8) goto L262;
    L218:
        int i$iv$iv11 = i$iv$iv10;
        if (i$iv$iv11 == lastIndex$iv$iv2) goto L263;
        i$iv$iv2 = i$iv$iv11 + 1;
        lastIndex$iv$iv = lastIndex$iv$iv2;
        r14 = r16;
        oldScrollObservationScopes = oldScrollObservationScopes4;
        r8 = r310;
        i$iv$iv = $i$f$forEachKey4;
        k$iv = k$iv9;
        r11 = r510;
        $i$f$forEachIndexed = $i$f$forEachIndexed4;
        m$iv$iv = m$iv$iv8;
        r0 = this;
        goto L4
    L263:
        return;
    L262:
        return;
    L217:
        i$iv$iv10 = i$iv$iv2;
        oldScrollObservationScopes4 = oldScrollObservationScopes;
        r310 = r8;
        $i$f$forEachKey4 = i$iv$iv;
        k$iv9 = k$iv;
        r510 = r11;
        $i$f$forEachIndexed4 = $i$f$forEachIndexed;
        m$iv$iv8 = m$iv$iv;
        goto L218
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> r11) {
        boolean newlyObservingScroll = false;
        ScrollObservationScope oldScope = SemanticsUtils_androidKt.findById(r11, id);
        if (oldScope == null) goto L5;
        ScrollObservationScope newScope = oldScope;
    L6:
        this.scrollObservationScopes.add(newScope);
        return newlyObservingScroll;
    L5:
        newlyObservingScroll = true;
        newScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
        goto L6
    }

    private final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope() == true) goto L5;
        return;
    L5:
        this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new C06501(scrollObservationScope, this));
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent event = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        event.setContentChangeTypes(contentChangeType);
        if (title == null) goto L5;
        event.getText().add(title);
    L5:
        sendEvent(event);
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        MutableIntSet newChildren = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> r2 = newNode.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r5 = r2.size();
    L3:
        if (index$iv >= r5) goto L12;
        Object item$iv = r2.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r9 = getCurrentSemanticsNodes();
        int key$iv = child.getId();
        if (r9.containsKey(key$iv) == false) goto L11;
        if (oldNode.getChildren().contains(child.getId()) == false) goto L8;
        newChildren.add(child.getId());
        goto L11
    L8:
        notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode$ui_release());
        return;
    L11:
        index$iv = index$iv + 1;
        goto L3
    L12:
        IntSet this_$iv = oldNode.getChildren();
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L38;
    L14:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        IntSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L33;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L17:
        if (j$iv$iv >= bitCount$iv$iv) goto L30;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L21;
        boolean r18 = true;
    L22:
        if (r18 == false) goto L29;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        if (newChildren.contains(k$iv[index$iv$iv]) == true) goto L29;
        notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode$ui_release());
        return;
    L29:
        slot$iv$iv = slot$iv$iv >> r3;
        j$iv$iv = j$iv$iv + 1;
        r3 = r3;
        newChildren = newChildren;
        goto L17
    L21:
        r18 = false;
        goto L22
    L30:
        MutableIntSet newChildren2 = newChildren;
        if (bitCount$iv$iv != r3) goto L38;
    L34:
        if (i$iv$iv == lastIndex$iv$iv) goto L38;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        newChildren = newChildren2;
        goto L14
    L33:
        newChildren2 = newChildren;
    L38:
        List<SemanticsNode> r1 = newNode.getReplacedChildren$ui_release();
        int index$iv2 = 0;
        int r4 = r1.size();
    L39:
        if (index$iv2 >= r4) goto L45;
        Object item$iv2 = r1.get(index$iv2);
        SemanticsNode child2 = (SemanticsNode) item$iv2;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r8 = getCurrentSemanticsNodes();
        int key$iv2 = child2.getId();
        if (r8.containsKey(key$iv2) == false) goto L43;
        SemanticsNodeCopy r10 = this.previousSemanticsNodes.get(child2.getId());
        Intrinsics.checkNotNull(r10);
        sendAccessibilitySemanticsStructureChangeEvents(child2, r10);
    L43:
        index$iv2 = index$iv2 + 1;
        goto L39
    }

    private final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L6;
        return -1;
    L6:
        return id;
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int r1 = node.getId();
        Integer r2 = this.previousTraversedNode;
        if (r2 != null) goto L6;
    L7:
        this.accessibilityCursorPosition = -1;
        this.previousTraversedNode = Integer.valueOf(node.getId());
    L8:
        String text = getIterableTextForAccessibility(node);
        String r3 = text;
        if (r3 != null) goto L11;
    L14:
        boolean r4 = true;
    L15:
        if (r4 == false) goto L17;
        return false;
    L17:
        AccessibilityIterators.TextSegmentIterator iterator = getIteratorForGranularity(node, granularity);
        if (iterator != null) goto L20;
        return false;
    L20:
        int current = getAccessibilitySelectionEnd(node);
        if (current != (-1)) goto L26;
        if (forward == false) goto L24;
        int r7 = 0;
    L25:
        current = r7;
        goto L26
    L24:
        r7 = text.length();
    L26:
        if (forward == false) goto L28;
        int[] range = iterator.following(current);
    L29:
        if (range != null) goto L31;
        return false;
    L31:
        int segmentStart = range[0];
        int segmentEnd = range[1];
        if (extendSelection == true) goto L34;
    L45:
        if (forward == false) goto L47;
        int selectionEnd = segmentEnd;
    L48:
        int selectionStart = selectionEnd;
    L49:
        if (forward == false) goto L51;
        int action = 256;
    L52:
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, action, granularity, segmentStart, segmentEnd, SystemClock.uptimeMillis());
        setAccessibilitySelection(node, selectionStart, selectionEnd, true);
        return true;
    L51:
        action = 512;
        goto L52
    L47:
        selectionEnd = segmentStart;
        goto L48
    L34:
        if (isAccessibilitySelectionExtendable(node) == false) goto L45;
        selectionStart = getAccessibilitySelectionStart(node);
        if (selectionStart != (-1)) goto L41;
        if (forward == false) goto L39;
        int r5 = segmentStart;
    L40:
        selectionStart = r5;
        goto L41
    L39:
        r5 = segmentEnd;
    L41:
        if (forward == false) goto L43;
        selectionEnd = segmentEnd;
        goto L49
    L43:
        selectionEnd = segmentStart;
        goto L49
    L28:
        range = iterator.preceding(current);
        goto L29
    L11:
        if (r3.length() == 0) goto L14;
        r4 = false;
        goto L15
    L6:
        if (r1 == r2.intValue()) goto L8;
        goto L7
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent it = this.pendingTextTraversedEvent;
        if (it != null) goto L5;
    L11:
        this.pendingTextTraversedEvent = null;
        return;
    L5:
        if (semanticsNodeId == it.getNode().getId()) goto L8;
        return;
    L8:
        if ((SystemClock.uptimeMillis() - it.getTraverseTime()) > 1000) goto L11;
        AccessibilityEvent event = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(it.getNode().getId()), 131072);
        event.setFromIndex(it.getFromIndex());
        event.setToIndex(it.getToIndex());
        event.setAction(it.getAction());
        event.setMovementGranularity(it.getGranularity());
        event.getText().add(getIterableTextForAccessibility(it.getNode()));
        sendEvent(event);
        goto L11
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        boolean nonEmptyText = false;
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetSelection()) == true) goto L5;
    L10:
        if (start == end) goto L12;
    L14:
        String text = getIterableTextForAccessibility(node);
        if (text != null) goto L18;
        return false;
    L18:
        if (start < 0) goto L23;
        if (start != end) goto L23;
        if (end > text.length()) goto L23;
        int r2 = start;
    L24:
        this.accessibilityCursorPosition = r2;
        if (text.length() <= 0) goto L27;
        nonEmptyText = true;
    L27:
        int r5 = semanticsNodeIdToAccessibilityVirtualNodeId(node.getId());
        Integer r3 = null;
        if (nonEmptyText == false) goto L30;
        Integer r6 = Integer.valueOf(this.accessibilityCursorPosition);
    L31:
        if (nonEmptyText == false) goto L33;
        Integer r7 = Integer.valueOf(this.accessibilityCursorPosition);
    L34:
        if (nonEmptyText == false) goto L36;
        r3 = Integer.valueOf(text.length());
    L36:
        AccessibilityEvent event = createTextSelectionChangedEvent(r5, r6, r7, r3, text);
        sendEvent(event);
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    L33:
        r7 = null;
        goto L34
    L30:
        r6 = null;
    L23:
        r2 = -1;
        goto L24
    L12:
        if (end != this.accessibilityCursorPosition) goto L14;
        return false;
    L5:
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(node) == false) goto L10;
        Function3 r0 = (Function3) ((AccessibilityAction) node.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
        if (r0 != null) goto L9;
        return false;
    L9:
        return ((Boolean) r0.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) == true) goto L9;
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) == false) goto L9;
        return TextRange.m6417getStartimpl(((TextRange) node.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6421unboximpl());
    L9:
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) == true) goto L9;
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange()) == false) goto L9;
        return TextRange.m6412getEndimpl(((TextRange) node.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6421unboximpl());
    L9:
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) == false) goto L5;
    L7:
        return false;
    L5:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()) == false) goto L7;
        return true;
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        if (node != null) goto L5;
        return null;
    L5:
        String text = getIterableTextForAccessibility(node);
        String r2 = text;
        if (r2 != null) goto L8;
    L11:
        boolean r3 = true;
    L12:
        if (r3 == false) goto L15;
        return null;
    L15:
        switch(granularity) {
            case 1: goto L29;
            case 2: goto L28;
            case 4: goto L19;
            case 8: goto L17;
            case 16: goto L19;
            default: goto L16;
        };
    L16:
        return null;
    L17:
        AccessibilityIterators.AbstractTextSegmentIterator iterator = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
        iterator.initialize(text);
    L31:
        return iterator;
    L28:
        iterator = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
        iterator.initialize(text);
        goto L31
    L29:
        iterator = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
        iterator.initialize(text);
        goto L31
    L19:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) == true) goto L21;
        return null;
    L21:
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig$ui_release());
        if (textLayoutResult != null) goto L25;
        return null;
    L25:
        if (granularity != 4) goto L27;
        iterator = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
        ((AccessibilityIterators.LineTextSegmentIterator) iterator).initialize(text, textLayoutResult);
        goto L31
    L27:
        iterator = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
        ((AccessibilityIterators.PageTextSegmentIterator) iterator).initialize(text, textLayoutResult, node);
        goto L31
    L8:
        if (r2.length() == 0) goto L11;
        r3 = false;
        goto L12
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        if (node != null) goto L6;
        return null;
    L6:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) == false) goto L10;
        return ListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
    L10:
        if (node.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText()) == false) goto L15;
        AnnotatedString r1 = getTextForTextField(node.getUnmergedConfig$ui_release());
        if (r1 != null) goto L14;
        return null;
    L14:
        return r1.getText();
    L15:
        List r2 = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (r2 == null) goto L22;
        AnnotatedString r3 = (AnnotatedString) CollectionsKt.firstOrNull(r2);
        if (r3 != null) goto L20;
        return null;
    L20:
        return r3.getText();
    L22:
        return null;
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration $this$getTextForTextField) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull($this$getTextForTextField, SemanticsProperties.INSTANCE.getEditableText());
    }
}
