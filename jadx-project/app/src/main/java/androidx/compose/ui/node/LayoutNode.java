package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\bI\b\u0000\u0018\u0000 \u008f\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u008f\u0003\u0090\u0003\u0091\u0003\u0092\u0003B\u0019\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0013\u0010\u0081\u0002\u001a\u00030È\u00012\u0007\u0010µ\u0001\u001a\u00020\u0018H\u0002J\u001a\u0010\u0082\u0002\u001a\u00030È\u00012\b\u0010Ø\u0001\u001a\u00030Ç\u0001H\u0000¢\u0006\u0003\b\u0083\u0002J\t\u0010\u0084\u0002\u001a\u00020\u001aH\u0002J\u0010\u0010\u0085\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u0086\u0002J\n\u0010\u0087\u0002\u001a\u00030È\u0001H\u0002J\u0014\u0010\u0088\u0002\u001a\u00030\u0089\u00022\b\b\u0002\u0010I\u001a\u00020\fH\u0002J\u0010\u0010\u008a\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008b\u0002J\u0010\u0010\u008c\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008d\u0002J&\u0010\u008e\u0002\u001a\u00030È\u00012\b\u0010\u008f\u0002\u001a\u00030\u0090\u00022\n\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u0092\u0002H\u0000¢\u0006\u0003\b\u0093\u0002J\u0013\u0010\u0094\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u0095\u0002\u001a\u00020\u0000H\u0002J\"\u0010\u0096\u0002\u001a\u00030È\u00012\u0015\u0010\u0097\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0086\bJ(\u0010\u0098\u0002\u001a\u00030È\u00012\u001b\u0010\u0097\u0002\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030È\u00010\u0099\u0002H\u0086\bJ)\u0010\u009a\u0002\u001a\u00030È\u00012\u0016\u0010\u0097\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u009b\u0002\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0080\b¢\u0006\u0003\b\u009c\u0002J(\u0010\u009d\u0002\u001a\u00030È\u00012\u0015\u0010\u0097\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0005\u0012\u00030È\u00010Æ\u0001H\u0080\b¢\u0006\u0003\b\u009e\u0002J\n\u0010\u009f\u0002\u001a\u00030È\u0001H\u0016J\u0013\u0010 \u0002\u001a\f\u0018\u00010¡\u0002j\u0005\u0018\u0001`¢\u0002H\u0017J\u0010\u0010£\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020)H\u0016J\t\u0010¥\u0002\u001a\u00020fH\u0002JA\u0010¦\u0002\u001a\u00030È\u00012\b\u0010§\u0002\u001a\u00030¨\u00022\b\u0010©\u0002\u001a\u00030ª\u00022\n\b\u0002\u0010«\u0002\u001a\u00030¬\u00022\t\b\u0002\u0010\u00ad\u0002\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0006\b®\u0002\u0010¯\u0002JA\u0010°\u0002\u001a\u00030È\u00012\b\u0010§\u0002\u001a\u00030¨\u00022\b\u0010±\u0002\u001a\u00030ª\u00022\n\b\u0002\u0010«\u0002\u001a\u00030¬\u00022\t\b\u0002\u0010\u00ad\u0002\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0006\b²\u0002\u0010¯\u0002J!\u0010U\u001a\u00030È\u00012\u000f\u0010\u0097\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00010³\u0002H\u0080\b¢\u0006\u0003\b´\u0002J\"\u0010µ\u0002\u001a\u00030È\u00012\u0007\u0010¶\u0002\u001a\u00020\f2\u0007\u0010\u0095\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b·\u0002J\u0010\u0010¸\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b¹\u0002J\u0010\u0010º\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b»\u0002J\u0010\u0010¼\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b½\u0002J\u0010\u0010¾\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b¿\u0002J\u0010\u0010À\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÁ\u0002J\u0010\u0010Â\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÃ\u0002J\u0013\u0010Ä\u0002\u001a\u00030È\u00012\t\b\u0002\u0010Å\u0002\u001a\u00020\nJ\n\u0010Æ\u0002\u001a\u00030È\u0001H\u0002J\t\u0010Ç\u0002\u001a\u00020\nH\u0016J \u0010È\u0002\u001a\u00020\n2\f\b\u0002\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\bË\u0002J\u0010\u0010Ì\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÍ\u0002J\u0010\u0010Î\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÏ\u0002J\u0010\u0010Ð\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÑ\u0002J\u0010\u0010Ò\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÓ\u0002J\u0010\u0010Ô\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bÕ\u0002J\u0010\u0010Ö\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010×\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ø\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Ù\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ú\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Û\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ\u0010\u0010Ü\u0002\u001a\u00020\f2\u0007\u0010÷\u0001\u001a\u00020\fJ\u000f\u0010Ý\u0002\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fJ+\u0010Þ\u0002\u001a\u00030È\u00012\u0007\u0010ß\u0002\u001a\u00020\f2\u0007\u0010à\u0002\u001a\u00020\f2\u0007\u0010á\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bâ\u0002J\u0013\u0010ã\u0002\u001a\u00030È\u00012\u0007\u0010ä\u0002\u001a\u00020\u0000H\u0002J\n\u0010å\u0002\u001a\u00030È\u0001H\u0016J\n\u0010æ\u0002\u001a\u00030È\u0001H\u0002J\n\u0010ç\u0002\u001a\u00030È\u0001H\u0016J\n\u0010è\u0002\u001a\u00030È\u0001H\u0016J\n\u0010é\u0002\u001a\u00030È\u0001H\u0016J\u0010\u0010ê\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bë\u0002J\"\u0010ì\u0002\u001a\u00030È\u00012\u0007\u0010í\u0002\u001a\u00020\f2\u0007\u0010î\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bï\u0002J\n\u0010ð\u0002\u001a\u00030È\u0001H\u0002J \u0010ñ\u0002\u001a\u00020\n2\f\b\u0002\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u0002H\u0000ø\u0001\u0000¢\u0006\u0003\bò\u0002J\u0010\u0010ó\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bô\u0002J\"\u0010õ\u0002\u001a\u00030È\u00012\u0007\u0010¶\u0002\u001a\u00020\f2\u0007\u0010á\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\bö\u0002J\u0010\u0010÷\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bø\u0002J\u0010\u0010ù\u0002\u001a\u00030È\u0001H\u0000¢\u0006\u0003\bú\u0002J\u001b\u0010û\u0002\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\nH\u0000¢\u0006\u0003\bý\u0002J1\u0010þ\u0002\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\n2\t\b\u0002\u0010ÿ\u0002\u001a\u00020\n2\t\b\u0002\u0010\u0080\u0003\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0081\u0003J\u001b\u0010\u0082\u0003\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0083\u0003J1\u0010\u0084\u0003\u001a\u00030È\u00012\t\b\u0002\u0010ü\u0002\u001a\u00020\n2\t\b\u0002\u0010ÿ\u0002\u001a\u00020\n2\t\b\u0002\u0010\u0080\u0003\u001a\u00020\nH\u0000¢\u0006\u0003\b\u0085\u0003J\u0019\u0010\u0086\u0003\u001a\u00030È\u00012\u0007\u0010\u0087\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0088\u0003J\n\u0010\u0089\u0003\u001a\u00030È\u0001H\u0002J\u0010\u0010\u008a\u0003\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008b\u0003J\n\u0010\u008c\u0003\u001a\u00030\u0089\u0002H\u0016J\u0010\u0010\u008d\u0003\u001a\u00030È\u0001H\u0000¢\u0006\u0003\b\u008e\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR$\u0010\"\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00000)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u001a\u00103\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u0002092\u0006\u00108\u001a\u000209@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010D\u001a\u00020C2\u0006\u00108\u001a\u00020C@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010,R\u001a\u0010N\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010'R\u0014\u0010Q\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u001fR\u0014\u0010S\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00105R\u000e\u0010U\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u001a\u0010[\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010'R\"\u0010^\u001a\n\u0018\u00010_j\u0004\u0018\u0001``X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u00020hX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u001fR\u000e\u0010n\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010p\u001a\u00020\n2\u0006\u0010o\u001a\u00020\n@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u001fR\u0014\u0010q\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u001fR\u0011\u0010r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\br\u0010\u001fR\u0013\u0010s\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001a\u0010u\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u001f\"\u0004\bw\u0010'R\u0014\u0010x\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010y\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u001f\"\u0004\b{\u0010'R%\u0010|\u001a\u00020}X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0003\u0010\u0082\u0001\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u00108\u001a\u00030\u0087\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u001fR\u0018\u0010\u008f\u0001\u001a\u00030\u0090\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u001fR\u0016\u0010\u0095\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010\u001fR\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R.\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¡\u0001\u001a\u00030¢\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030¦\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010©\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u001fR+\u0010¬\u0001\u001a\u00030«\u00012\u0007\u00108\u001a\u00030«\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010±\u0001\u001a\u00020h8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010jR\u0016\u0010³\u0001\u001a\u00020h8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010jR)\u0010µ\u0001\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u001d\u0010º\u0001\u001a\u00020\nX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010\u001f\"\u0005\b¼\u0001\u0010'R\u0018\u0010½\u0001\u001a\u00030¾\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001R(\u0010Á\u0001\u001a\u00030Â\u0001X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0003\u0010\u0082\u0001\u001a\u0005\bÃ\u0001\u0010\u007f\"\u0006\bÄ\u0001\u0010\u0081\u0001R0\u0010Å\u0001\u001a\u0013\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R0\u0010Í\u0001\u001a\u0013\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Æ\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R\u0016\u0010Ð\u0001\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010XR(\u0010Ò\u0001\u001a\u00030Â\u0001X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0003\u0010\u0082\u0001\u001a\u0005\bÓ\u0001\u0010\u007f\"\u0006\bÔ\u0001\u0010\u0081\u0001R\u001d\u0010Õ\u0001\u001a\u00020\nX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u001f\"\u0005\b×\u0001\u0010'R'\u0010Ø\u0001\u001a\u0005\u0018\u00010Ç\u00012\t\u0010o\u001a\u0005\u0018\u00010Ç\u0001@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010\u009e\u0001R\u0019\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0011\u0010à\u0001\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010á\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u00105R\u000f\u0010ã\u0001\u001a\u00020hX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010ä\u0001\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u00105\"\u0005\bè\u0001\u00107R\"\u0010é\u0001\u001a\u0005\u0018\u00010ê\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R\u000f\u0010ï\u0001\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010ñ\u0001\u001a\u00030ð\u00012\u0007\u00108\u001a\u00030ð\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u000f\u0010ö\u0001\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010÷\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u00105R\u0018\u0010ù\u0001\u001a\u00030ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R#\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bþ\u0001\u0010$\u001a\u0005\bÿ\u0001\u0010\u0011R\u000f\u0010\u0080\u0002\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_modifier", "Landroidx/compose/ui/Modifier;", "_semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "applyingModifierOnAttach", "getApplyingModifierOnAttach$ui_release", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", "children", "getChildren$ui_release", "childrenInfo", "getChildrenInfo", "compositeKeyHash", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "value", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "setDepth$ui_release", "foldedChildren", "getFoldedChildren$ui_release", "forceUseOldLayers", "getForceUseOldLayers", "setForceUseOldLayers", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator$ui_release", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isCurrentlyCalculatingSemanticsConfiguration", "<set-?>", "isDeactivated", "isPlaced", "isPlacedByParent", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isSemanticsInvalidated", "isSemanticsInvalidated$ui_release", "setSemanticsInvalidated$ui_release", "isValidOwnerScope", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "setVirtualLookaheadRoot$ui_release", "lastSize", "Landroidx/compose/ui/unit/IntSize;", "getLastSize-YbymL2g$ui_release", "()J", "setLastSize-ozmzZPI$ui_release", "(J)V", "J", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "newRoot", "lookaheadRoot", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "measurePassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "offsetFromRoot", "Landroidx/compose/ui/unit/IntOffset;", "getOffsetFromRoot-nOcc-ac$ui_release", "setOffsetFromRoot--gyyYBs$ui_release", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "outerToInnerOffset", "getOuterToInnerOffset-nOcc-ac$ui_release", "setOuterToInnerOffset--gyyYBs$ui_release", "outerToInnerOffsetDirty", "getOuterToInnerOffsetDirty$ui_release", "setOuterToInnerOffsetDirty$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "pendingModifier", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "semanticsConfiguration", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsId", "setSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "zIndex", "", "getZIndex", "()F", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "applyModifier", "attach", "attach$ui_release", "calculateSemanticsConfiguration", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw$ui_release", "exceptionMessageForParentingOrOwnership", "instance", "forEachChild", "block", "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinatorIncludingInner", "forEachCoordinatorIncludingInner$ui_release", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "getOrCreateIntrinsicsPolicy", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "hitTest-6fMxITs$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTestSemantics", "hitSemanticsEntities", "hitTestSemantics-6fMxITs$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", "index", "insertAt$ui_release", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateOnPositioned", "invalidateOnPositioned$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSemantics", "invalidateSemantics$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "isTransparent", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "maxIntrinsicHeight", "maxIntrinsicWidth", "maxLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "minIntrinsicHeight", "minIntrinsicWidth", "minLookaheadIntrinsicHeight", "minLookaheadIntrinsicWidth", "move", "from", "to", "count", "move$ui_release", "onChildRemoved", "child", "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestAutofill", "requestAutofill$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "scheduleMeasureAndLayout", "invalidateIntrinsics", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Function0<LayoutNode> Constructor = null;
    private static final ViewConfiguration DummyViewConfiguration = null;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = null;
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private static final Comparator<LayoutNode> ZComparator = null;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private boolean forceUseOldLayers;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private long lastSize;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnPositionedDispatch;
    private final NodeChain nodes;
    private long offsetFromRoot;
    private Function1<? super Owner, Unit> onAttach;
    private Function1<? super Owner, Unit> onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "getNotPlacedPlaceOrder$ui_release$annotations", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        private Companion() {
        }

        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.access$getConstructor$cp();
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.access$getDummyViewConfiguration$cp();
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.access$getZComparator$cp();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum LayoutState extends Enum<LayoutState> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ LayoutState[] $VALUES = null;
        public static final LayoutState Idle = null;
        public static final LayoutState LayingOut = null;
        public static final LayoutState LookaheadLayingOut = null;
        public static final LayoutState LookaheadMeasuring = null;
        public static final LayoutState Measuring = null;

        private static final /* synthetic */ LayoutState[] $values() {
            return new LayoutState[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        public static EnumEntries<LayoutState> getEntries() {
            return $ENTRIES;
        }

        public static LayoutState valueOf(String r1) {
            return (LayoutState) Enum.valueOf(LayoutState.class, r1);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }

        private LayoutState(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            Measuring = new LayoutState("Measuring", 0);
            LookaheadMeasuring = new LayoutState("LookaheadMeasuring", 1);
            LayingOut = new LayoutState("LayingOut", 2);
            LookaheadLayingOut = new LayoutState("LookaheadLayingOut", 3);
            Idle = new LayoutState("Idle", 4);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        static {
        }

        public NoIntrinsicsMeasurePolicy(String error) {
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List measurables, int width) {
            return ((Number) m5900maxIntrinsicHeight($this$maxIntrinsicHeight, measurables, width)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List measurables, int height) {
            return ((Number) m5901maxIntrinsicWidth($this$maxIntrinsicWidth, measurables, height)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List measurables, int width) {
            return ((Number) m5902minIntrinsicHeight($this$minIntrinsicHeight, measurables, width)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List measurables, int height) {
            return ((Number) m5903minIntrinsicWidth($this$minIntrinsicWidth, measurables, height)).intValue();
        }

        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m5903minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r4, int height) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m5902minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> r4, int width) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m5901maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r4, int height) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m5900maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r4, int width) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum UsageByParent extends Enum<UsageByParent> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ UsageByParent[] $VALUES = null;
        public static final UsageByParent InLayoutBlock = null;
        public static final UsageByParent InMeasureBlock = null;
        public static final UsageByParent NotUsed = null;

        private static final /* synthetic */ UsageByParent[] $values() {
            return new UsageByParent[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        public static EnumEntries<UsageByParent> getEntries() {
            return $ENTRIES;
        }

        public static UsageByParent valueOf(String r1) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, r1);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }

        private UsageByParent(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            InMeasureBlock = new UsageByParent("InMeasureBlock", 0);
            InLayoutBlock = new UsageByParent("InLayoutBlock", 1);
            NotUsed = new UsageByParent("NotUsed", 2);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutState.values().length];
            r0[LayoutState.Idle.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L6:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        boolean r2 = false;
        Object[] r3 = 0 == true ? 1 : 0;
        this(r2, r3, 3, null);
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public LayoutNode(boolean isVirtual, int semanticsId) {
        this.isVirtual = isVirtual;
        this.semanticsId = semanticsId;
        this.offsetFromRoot = IntOffset.Companion.m7111getMaxnOccac();
        this.lastSize = IntSize.Companion.m7149getZeroYbymL2g();
        this.outerToInnerOffset = IntOffset.Companion.m7111getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.access$getDefaultDensity$p();
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        this.previousIntrinsicsUsageByParent = UsageByParent.NotUsed;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    public static final /* synthetic */ Function0 access$getConstructor$cp() {
        return Constructor;
    }

    public static final /* synthetic */ ViewConfiguration access$getDummyViewConfiguration$cp() {
        return DummyViewConfiguration;
    }

    public static final /* synthetic */ Comparator access$getZComparator$cp() {
        return ZComparator;
    }

    public static final /* synthetic */ void access$setIgnoreRemeasureRequests$p(LayoutNode $this, boolean r1) {
        $this.ignoreRemeasureRequests = r1;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public /* bridge */ /* synthetic */ LayoutInfo getParentInfo() {
        return getParentInfo();
    }

    public /* synthetic */ LayoutNode(boolean r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = SemanticsModifierKt.generateSemanticsId();
    L8:
        this(r1, r2);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public void setSemanticsId(int r1) {
        this.semanticsId = r1;
    }

    /* JADX INFO: renamed from: getOffsetFromRoot-nOcc-ac$ui_release, reason: not valid java name */
    public final long m5889getOffsetFromRootnOccac$ui_release() {
        return this.offsetFromRoot;
    }

    /* JADX INFO: renamed from: setOffsetFromRoot--gyyYBs$ui_release, reason: not valid java name */
    public final void m5896setOffsetFromRootgyyYBs$ui_release(long r1) {
        this.offsetFromRoot = r1;
    }

    /* JADX INFO: renamed from: getLastSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m5888getLastSizeYbymL2g$ui_release() {
        return this.lastSize;
    }

    /* JADX INFO: renamed from: setLastSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m5895setLastSizeozmzZPI$ui_release(long r1) {
        this.lastSize = r1;
    }

    /* JADX INFO: renamed from: getOuterToInnerOffset-nOcc-ac$ui_release, reason: not valid java name */
    public final long m5890getOuterToInnerOffsetnOccac$ui_release() {
        return this.outerToInnerOffset;
    }

    /* JADX INFO: renamed from: setOuterToInnerOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m5897setOuterToInnerOffsetgyyYBs$ui_release(long r1) {
        this.outerToInnerOffset = r1;
    }

    public final boolean getOuterToInnerOffsetDirty$ui_release() {
        return this.outerToInnerOffsetDirty;
    }

    public final void setOuterToInnerOffsetDirty$ui_release(boolean r1) {
        this.outerToInnerOffsetDirty = r1;
    }

    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    public final void setForceUseOldLayers(boolean r1) {
        this.forceUseOldLayers = r1;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositeKeyHash(int r1) {
        this.compositeKeyHash = r1;
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean r1) {
        this.isVirtualLookaheadRoot = r1;
    }

    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    private final void setLookaheadRoot(LayoutNode newRoot) {
        if (Intrinsics.areEqual(newRoot, this.lookaheadRoot) == true) goto L17;
        this.lookaheadRoot = newRoot;
        LayoutNodeLayoutDelegate r0 = this.layoutDelegate;
        if (newRoot == null) goto L12;
        r0.ensureLookaheadDelegateCreated$ui_release();
        NodeCoordinator delegate$iv = getOuterCoordinator$ui_release();
        NodeCoordinator final$iv = getInnerCoordinator$ui_release().getWrapped$ui_release();
    L8:
        if (Intrinsics.areEqual(delegate$iv, final$iv) == true) goto L13;
        if (delegate$iv == null) goto L13;
        NodeCoordinator it = delegate$iv;
        it.ensureLookaheadDelegateCreated();
        delegate$iv = delegate$iv.getWrapped$ui_release();
    L13:
        invalidateMeasurements$ui_release();
        return;
    L12:
        r0.clearLookaheadDelegate();
        goto L13
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate r0 = getLookaheadPassDelegate$ui_release();
        if (r0 != null) goto L7;
        return null;
    L7:
        return Boolean.valueOf(r0.isPlaced());
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.getVector().asMutableList();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty == false) goto L19;
        this.unfoldedVirtualChildrenListDirty = false;
        MutableVector<LayoutNode> r1 = this._unfoldedChildren;
        if (r1 != null) goto L7;
        MutableVector<LayoutNode> r4 = new MutableVector(new LayoutNode[16], 0);
        this._unfoldedChildren = r4;
        r1 = r4;
    L7:
        r1.clear();
        MutableVector<LayoutNode> r3 = this._foldedChildren.getVector();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L8:
        if (i$iv$iv >= size$iv$iv) goto L14;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (it.isVirtual == false) goto L12;
        MutableVector<LayoutNode> r10 = it.get_children$ui_release();
        MutableVector<LayoutNode> r11 = r1;
        r11.addAll(r11.getSize(), r10);
    L13:
        i$iv$iv = i$iv$iv + 1;
        goto L8
    L12:
        r1.add(it);
        goto L13
    L14:
        this.layoutDelegate.markChildrenDirty();
        return;
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate r0 = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r0);
        return r0.getChildDelegates$ui_release();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        if (this.virtualChildrenCount <= 0) goto L6;
        this.unfoldedVirtualChildrenListDirty = true;
    L6:
        if (this.isVirtual == false) goto L11;
        LayoutNode r0 = this._foldedParent;
        if (r0 == null) goto L12;
        r0.invalidateUnfoldedVirtualChildren();
        return;
    L12:
        return;
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) goto L7;
        MutableVector<LayoutNode> r0 = this._unfoldedChildren;
        Intrinsics.checkNotNull(r0);
        return r0;
    L7:
        return this._foldedChildren.getVector();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount <= 0) goto L6;
        recreateUnfoldedChildrenIfDirty();
        return;
    }

    public final void forEachChild(Function1<? super LayoutNode, Unit> r8) {
        MutableVector<LayoutNode> r1 = get_children$ui_release();
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        r8.invoke(content$iv[i$iv]);
        i$iv = i$iv + 1;
        goto L3
    }

    public final void forEachChildIndexed(Function2<? super Integer, ? super LayoutNode, Unit> r9) {
        MutableVector<LayoutNode> r1 = get_children$ui_release();
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        r9.invoke(Integer.valueOf(i$iv), content$iv[i$iv]);
        i$iv = i$iv + 1;
        goto L3
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode parent = this._foldedParent;
    L3:
        boolean r1 = false;
        if (parent != null) goto L6;
    L8:
        if (r1 == false) goto L10;
        parent = parent._foldedParent;
        goto L3
    L10:
        return parent;
    L6:
        if (parent.isVirtual != true) goto L8;
        r1 = true;
        goto L8
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder r1) {
        this.interopViewFactoryHolder = r1;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    public View getInteropView() {
        AndroidViewHolder r0 = this.interopViewFactoryHolder;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getInteropView();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        if (this.owner == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final void setDepth$ui_release(int r1) {
        this.depth = r1;
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final void insertAt$ui_release(int index, LayoutNode instance) {
        if (instance._foldedParent != null) goto L5;
    L8:
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(instance));
    L12:
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.isVirtual == false) goto L15;
        this.virtualChildrenCount++;
    L15:
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner == null) goto L19;
        instance.attach$ui_release(owner);
    L19:
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) goto L22;
        LayoutNodeLayoutDelegate r2 = this.layoutDelegate;
        r2.setChildrenAccessingCoordinatesDuringPlacement(r2.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        return;
    L22:
        return;
    L5:
        if (instance.owner == null) goto L8;
        value$iv = false;
        goto L10
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode instance) {
        String r3 = null;
        StringBuilder r0 = new StringBuilder().append("Cannot insert ").append(instance).append(" because it already has a parent or an owner. This tree: ").append(debugTreeToString$default(this, 0, 1, null)).append(" Other tree: ");
        LayoutNode r4 = instance._foldedParent;
        if (r4 == null) goto L6;
        r3 = debugTreeToString$default(r4, 0, 1, null);
    L6:
        return r0.append(r3).toString();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual == false) goto L7;
        LayoutNode r0 = getParent$ui_release();
        if (r0 == null) goto L9;
        r0.onZSortedChildrenInvalidated$ui_release();
        return;
    L9:
        return;
    L7:
        this.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int index, int count) {
        if (count < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("count (" + count + ") must be greater than 0");
    L9:
        int i = (index + count) - 1;
        if (index > i) goto L14;
    L11:
        onChildRemoved(this._foldedChildren.getVector().content[i]);
        LayoutNode r0 = this._foldedChildren.removeAt(i);
        if (i == index) goto L16;
        i = i - 1;
        goto L11
    L16:
        return;
    L14:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void removeAll$ui_release() {
        int i = this._foldedChildren.getVector().getSize();
    L3:
        i = i - 1;
        if ((-1) >= i) goto L6;
        onChildRemoved(this._foldedChildren.getVector().content[i]);
        goto L3
    L6:
        this._foldedChildren.clear();
    }

    private final void onChildRemoved(LayoutNode child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) goto L6;
        LayoutNodeLayoutDelegate r0 = this.layoutDelegate;
        r0.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
    L6:
        if (this.owner == null) goto L8;
        child.detach$ui_release();
    L8:
        child._foldedParent = null;
        child.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (child.isVirtual == false) goto L14;
        this.virtualChildrenCount--;
        MutableVector<LayoutNode> r3 = child._foldedChildren.getVector();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L11:
        if (i$iv$iv >= size$iv$iv) goto L14;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        it.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        i$iv$iv = i$iv$iv + 1;
    L14:
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from != to) goto L4;
        return;
    L4:
        int i = 0;
    L5:
        if (i >= count) goto L13;
        if (from <= to) goto L8;
        int fromIndex = from + i;
    L9:
        if (from <= to) goto L11;
        int toIndex = to + i;
    L12:
        LayoutNode child = this._foldedChildren.removeAt(fromIndex);
        this._foldedChildren.add(toIndex, child);
        i = i + 1;
        goto L5
    L11:
        toIndex = (to + count) - 2;
        goto L12
    L8:
        fromIndex = from;
        goto L9
    L13:
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    public final boolean isSemanticsInvalidated$ui_release() {
        return this.isSemanticsInvalidated;
    }

    public final void setSemanticsInvalidated$ui_release(boolean r1) {
        this.isSemanticsInvalidated = r1;
    }

    public final void requestAutofill$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration == false) goto L5;
        return;
    L5:
        Owner owner = LayoutNodeKt.requireOwner(this);
        owner.requestAutofill(this);
    }

    public final void invalidateSemantics$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration == false) goto L6;
        return;
    L6:
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L9;
        this._semanticsConfiguration = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
        return;
    L9:
        if (this.nodes.isUpdating$ui_release() == false) goto L11;
    L14:
        this.isSemanticsInvalidated = true;
        return;
    L11:
        if (getApplyingModifierOnAttach$ui_release() == true) goto L14;
        SemanticsConfiguration prev = this._semanticsConfiguration;
        this._semanticsConfiguration = calculateSemanticsConfiguration();
        this.isSemanticsInvalidated = false;
        Owner owner = LayoutNodeKt.requireOwner(this);
        owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, prev);
        owner.onSemanticsChange();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (isAttached() == true) goto L5;
        return null;
    L5:
        if (isDeactivated() == false) goto L7;
        return null;
    L7:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == true) goto L10;
        return null;
    L10:
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L15;
        if (this._semanticsConfiguration != null) goto L15;
        this._semanticsConfiguration = calculateSemanticsConfiguration();
    L15:
        return this._semanticsConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final kotlin.jvm.internal.Ref.ObjectRef config = new kotlin.jvm.internal.Ref.ObjectRef();
        config.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new AnonymousClass1(this, config));
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) config.element;
    }

    public final void attach$ui_release(Owner owner) {
        if (this.owner != null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null));
    L10:
        if (this._foldedParent == null) goto L19;
        LayoutNode r0 = this._foldedParent;
        if (r0 == null) goto L14;
        Owner r1 = r0.owner;
    L16:
        if (Intrinsics.areEqual(r1, owner) == true) goto L19;
        boolean value$iv2 = false;
    L21:
        if (value$iv2 == true) goto L31;
        StringBuilder r6 = new StringBuilder().append("Attaching to a different owner(").append(owner).append(") than the parent's owner(");
        LayoutNode r7 = getParent$ui_release();
        if (r7 == null) goto L25;
        Owner r8 = r7.owner;
    L26:
        StringBuilder r9 = r6.append(r8).append("). This tree: ").append(debugTreeToString$default(this, 0, 1, null)).append(" Parent tree: ");
        LayoutNode r10 = this._foldedParent;
        if (r10 == null) goto L29;
        String r2 = debugTreeToString$default(r10, 0, 1, null);
    L30:
        InlineClassHelperKt.throwIllegalStateException(r9.append(r2).toString());
        goto L31
    L29:
        r2 = null;
        goto L30
    L25:
        r8 = null;
    L31:
        LayoutNode parent = getParent$ui_release();
        if (parent != null) goto L36;
        getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
        LookaheadPassDelegate r3 = getLookaheadPassDelegate$ui_release();
        if (r3 == null) goto L36;
        r3.onAttachedToNullParent();
    L36:
        NodeCoordinator r4 = getOuterCoordinator$ui_release();
        if (parent == null) goto L39;
        NodeCoordinator r5 = parent.getInnerCoordinator$ui_release();
    L40:
        r4.setWrappedBy$ui_release(r5);
        this.owner = owner;
        if (parent == null) goto L43;
        int r11 = parent.depth;
    L44:
        this.depth = r11 + 1;
        Modifier it = this.pendingModifier;
        if (it == null) goto L47;
        applyModifier(it);
    L47:
        this.pendingModifier = null;
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L50;
    L52:
        owner.onPreAttach(this);
        if (this.isVirtualLookaheadRoot == false) goto L55;
        setLookaheadRoot(this);
    L66:
        if (isDeactivated() == true) goto L68;
        this.nodes.markAsAttached();
    L68:
        MutableVector<LayoutNode> r12 = this._foldedChildren.getVector();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r12.content;
        int size$iv$iv = r12.getSize();
    L69:
        if (i$iv$iv >= size$iv$iv) goto L72;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        child.attach$ui_release(owner);
        i$iv$iv = i$iv$iv + 1;
        goto L69
    L72:
        if (isDeactivated() == true) goto L74;
        this.nodes.runAttachLifecycle();
    L74:
        invalidateMeasurements$ui_release();
        if (parent == null) goto L77;
        parent.invalidateMeasurements$ui_release();
    L77:
        NodeCoordinator delegate$iv = getOuterCoordinator$ui_release();
        NodeCoordinator final$iv = getInnerCoordinator$ui_release().getWrapped$ui_release();
    L79:
        if (Intrinsics.areEqual(delegate$iv, final$iv) == true) goto L82;
        if (delegate$iv == null) goto L82;
        delegate$iv.onLayoutNodeAttach();
        delegate$iv = delegate$iv.getWrapped$ui_release();
    L82:
        Function1<? super Owner, Unit> r13 = this.onAttach;
        if (r13 == null) goto L85;
        r13.invoke(owner);
    L85:
        this.layoutDelegate.updateParentData();
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L88;
    L92:
        owner.onPostAttach(this);
        return;
    L88:
        if (isDeactivated() == true) goto L92;
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L92;
        invalidateSemantics$ui_release();
        goto L92
    L55:
        LayoutNode r14 = this._foldedParent;
        if (r14 == null) goto L59;
        LayoutNode r15 = r14.lookaheadRoot;
        if (r15 == null) goto L59;
    L60:
        setLookaheadRoot(r15);
        if (this.lookaheadRoot != null) goto L66;
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(512)) == false) goto L66;
        setLookaheadRoot(this);
    L59:
        r15 = this.lookaheadRoot;
        goto L60
    L50:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L52;
        invalidateSemantics$ui_release();
        goto L52
    L43:
        r11 = -1;
        goto L44
    L39:
        r5 = null;
        goto L40
    L14:
        r1 = null;
    L19:
        value$iv2 = true;
        goto L21
    L5:
        value$iv = false;
        goto L7
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        String r5 = null;
        if (owner != null) goto L9;
        StringBuilder r7 = new StringBuilder().append("Cannot detach node that is already detached!  Tree: ");
        LayoutNode r8 = getParent$ui_release();
        if (r8 == null) goto L7;
        r5 = debugTreeToString$default(r8, 0, 1, null);
    L7:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(r7.append(r5).toString());
        throw new KotlinNothingValueException();
    L9:
        LayoutNode parent = getParent$ui_release();
        if (parent == null) goto L14;
        parent.invalidateLayer$ui_release();
        parent.invalidateMeasurements$ui_release();
        getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(UsageByParent.NotUsed);
        LookaheadPassDelegate it = getLookaheadPassDelegate$ui_release();
        if (it == null) goto L14;
        it.setMeasuredByParent$ui_release(UsageByParent.NotUsed);
    L14:
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> r6 = this.onDetach;
        if (r6 == null) goto L18;
        r6.invoke(owner);
    L18:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L20;
    L22:
        this.nodes.runDetachLifecycle$ui_release();
        access$setIgnoreRemeasureRequests$p(this, true);
        MutableVector<LayoutNode> r11 = this._foldedChildren.getVector();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r11.content;
        int size$iv$iv = r11.getSize();
    L23:
        if (i$iv$iv >= size$iv$iv) goto L25;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        child.detach$ui_release();
        i$iv$iv = i$iv$iv + 1;
        goto L23
    L25:
        access$setIgnoreRemeasureRequests$p(this, false);
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate r3 = getLookaheadPassDelegate$ui_release();
        if (r3 == null) goto L29;
        r3.onNodeDetached();
    L29:
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L31;
        return;
    L31:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L36;
        SemanticsConfiguration prev = this._semanticsConfiguration;
        this._semanticsConfiguration = null;
        this.isSemanticsInvalidated = false;
        owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, prev);
        owner.onSemanticsChange();
        return;
    L36:
        return;
    L20:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L22;
        invalidateSemantics$ui_release();
        goto L22
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated == false) goto L6;
        this._zSortedChildren.clear();
        MutableVector<LayoutNode> r0 = this._zSortedChildren;
        MutableVector<LayoutNode> r1 = get_children$ui_release();
        r0.addAll(r0.getSize(), r1);
        this._zSortedChildren.sortWith(ZComparator);
        this.zSortedChildrenInvalidated = false;
    L6:
        return this._zSortedChildren;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long innerContentConstraints = getInnerCoordinator$ui_release().m5960getLastMeasurementConstraintsmsEJaDk$ui_release();
        if (Constraints.m6924getHasFixedWidthimpl(innerContentConstraints) == true) goto L5;
    L7:
        return false;
    L5:
        if (Constraints.m6923getHasFixedHeightimpl(innerContentConstraints) == false) goto L7;
        return true;
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.debugTreeToString(r1);
    }

    private final String debugTreeToString(int depth) {
        StringBuilder tree = new StringBuilder();
        int i = 0;
    L3:
        if (i >= depth) goto L5;
        tree.append("  ");
        i = i + 1;
        goto L3
    L5:
        tree.append("|-");
        tree.append(toString());
        tree.append('\n');
        MutableVector<LayoutNode> r3 = get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L6:
        if (i$iv$iv >= size$iv$iv) goto L8;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        tree.append(child.debugTreeToString(depth + 1));
        i$iv$iv = i$iv$iv + 1;
        goto L6
    L8:
        String treeString = tree.toString();
        if (depth != 0) goto L14;
        String treeString2 = treeString.substring(0, treeString.length() - 1);
        Intrinsics.checkNotNullExpressionValue(treeString2, "substring(...)");
        return treeString2;
    L14:
        return treeString;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy value) {
        if (Intrinsics.areEqual(this.measurePolicy, value) == true) goto L9;
        this.measurePolicy = value;
        IntrinsicsPolicy r0 = this.intrinsicsPolicy;
        if (r0 == null) goto L7;
        r0.updateFrom(getMeasurePolicy());
    L7:
        invalidateMeasurements$ui_release();
        return;
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy r0 = this.intrinsicsPolicy;
        if (r0 != null) goto L6;
        IntrinsicsPolicy it = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = it;
        return it;
    L6:
        return r0;
    }

    public final int minLookaheadIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(height);
    }

    public final int minLookaheadIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(width);
    }

    public final int maxLookaheadIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(height);
    }

    public final int maxLookaheadIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(width);
    }

    public final int minIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    public final int minIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    public final int maxIntrinsicWidth(int height) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    public final int maxIntrinsicHeight(int width) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density value) {
        if (Intrinsics.areEqual(this.density, value) == true) goto L8;
        this.density = value;
        onDensityOrLayoutDirectionChanged();
        NodeChain this_$iv = this.nodes;
        Modifier.Node node$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv == null) goto L10;
        Modifier.Node it = node$iv;
        it.onDensityChange();
        node$iv = node$iv.getChild$ui_release();
        goto L5
    L10:
        return;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection value) {
        if (this.layoutDirection == value) goto L8;
        this.layoutDirection = value;
        onDensityOrLayoutDirectionChanged();
        NodeChain this_$iv = this.nodes;
        Modifier.Node node$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv == null) goto L10;
        Modifier.Node it = node$iv;
        it.onLayoutDirectionChange();
        node$iv = node$iv.getChild$ui_release();
        goto L5
    L10:
        return;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration value) {
        if (Intrinsics.areEqual(this.viewConfiguration, value) == true) goto L61;
        this.viewConfiguration = value;
        NodeChain this_$iv = this.nodes;
        int r3 = NodeKind.m5976constructorimpl(16);
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & r3) == 0) goto L77;
        Modifier.Node node$iv$iv$iv = this_$iv.getHead$ui_release();
    L7:
        if (node$iv$iv$iv == null) goto L78;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        if ((it$iv$iv.getKindSet$ui_release() & r3) == 0) goto L54;
        MutableVector r17 = null;
        Modifier.Node r0 = it$iv$iv;
    L11:
        if (r0 == null) goto L53;
        if ((r0 instanceof PointerInputModifierNode) == true) goto L14;
        Modifier.Node this_$iv$iv$iv = r0;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r3) == 0) goto L18;
        int r18 = 1;
    L19:
        if (r18 == 0) goto L51;
        if ((r0 instanceof DelegatingNode) == false) goto L51;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r0;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L23:
        if (node$iv$iv$iv2 == null) goto L47;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & r3) == 0) goto L27;
        boolean r24 = true;
    L28:
        if (r24 == false) goto L45;
        count$iv$iv = count$iv$iv + 1;
        Modifier.Node r25 = r0;
        if (count$iv$iv != 1) goto L32;
        this_$iv = this_$iv;
        MutableVector r2 = r17;
        Modifier.Node r19 = next$iv$iv;
    L46:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        r0 = r19;
        r17 = r2;
        this_$iv = this_$iv;
        goto L23
    L32:
        if (r17 != null) goto L34;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L36:
        if (r25 == null) goto L40;
        if (r1 == null) goto L39;
        r1.add(r25);
    L39:
        r19 = null;
    L41:
        if (r1 == null) goto L44;
        r1.add(next$iv$iv);
    L44:
        r2 = r1;
        count$iv$iv = count$iv$iv;
        goto L46
    L40:
        r19 = r25;
        goto L41
    L34:
        r1 = r17;
        goto L36
    L45:
        this_$iv = this_$iv;
        r2 = r17;
        r19 = r0;
        goto L46
    L27:
        r24 = false;
        goto L28
    L47:
        Modifier.Node r26 = r0;
        NodeChain this_$iv2 = this_$iv;
        if (count$iv$iv != 1) goto L52;
        r0 = r26;
        this_$iv = this_$iv2;
    L52:
        r0 = DelegatableNodeKt.access$pop(r17);
        this_$iv = this_$iv2;
    L51:
        this_$iv2 = this_$iv;
        goto L52
    L18:
        r18 = 0;
        goto L19
    L14:
        PointerInputModifierNode it = (PointerInputModifierNode) r0;
        it.onViewConfigurationChange();
        this_$iv2 = this_$iv;
        goto L52
    L53:
        NodeChain this_$iv3 = this_$iv;
    L56:
        if ((it$iv$iv.getAggregateChildKindSet$ui_release() & r3) == 0) goto L79;
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv3;
        goto L7
    L79:
        return;
    L54:
        this_$iv3 = this_$iv;
        goto L56
    L78:
        return;
    L77:
        return;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(CompositionLocalMap value) {
        this.compositionLocalMap = value;
        setDensity((Density) value.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) value.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) value.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain this_$iv = this.nodes;
        int r3 = NodeKind.m5976constructorimpl(32768);
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & r3) == 0) goto L62;
        Modifier.Node node$iv$iv$iv = this_$iv.getHead$ui_release();
    L5:
        if (node$iv$iv$iv == null) goto L78;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        if ((it$iv$iv.getKindSet$ui_release() & r3) == 0) goto L55;
        MutableVector r17 = null;
        Modifier.Node r0 = it$iv$iv;
    L9:
        if (r0 == null) goto L54;
        if ((r0 instanceof CompositionLocalConsumerModifierNode) == true) goto L12;
        NodeChain this_$iv2 = this_$iv;
        Modifier.Node this_$iv$iv$iv = r0;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r3) == 0) goto L20;
        int r2 = 1;
    L21:
        if (r2 == 0) goto L53;
        if ((r0 instanceof DelegatingNode) == false) goto L53;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r0;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L25:
        if (node$iv$iv$iv2 == null) goto L49;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & r3) == 0) goto L29;
        boolean r24 = true;
    L30:
        if (r24 == false) goto L47;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L34;
        MutableVector r1 = r17;
        Modifier.Node r18 = next$iv$iv;
    L48:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        r0 = r18;
        r17 = r1;
        goto L25
    L34:
        if (r17 != null) goto L36;
        r1 = new MutableVector(new Modifier.Node[16], 0);
    L37:
        Modifier.Node theNode$iv$iv = r0;
        if (theNode$iv$iv == null) goto L42;
        if (r1 == null) goto L41;
        r1.add(theNode$iv$iv);
    L41:
        r18 = null;
    L43:
        if (r1 == null) goto L46;
        r1.add(next$iv$iv);
    L46:
        count$iv$iv = count$iv$iv;
        goto L48
    L42:
        r18 = r0;
        goto L43
    L36:
        r1 = r17;
        goto L37
    L47:
        r1 = r17;
        r18 = r0;
        goto L48
    L29:
        r24 = false;
        goto L30
    L49:
        Modifier.Node r25 = r0;
        if (count$iv$iv != 1) goto L53;
        this_$iv = this_$iv2;
        r0 = r25;
    L53:
        r0 = DelegatableNodeKt.access$pop(r17);
        this_$iv = this_$iv2;
        goto L9
    L20:
        r2 = 0;
        goto L21
    L12:
        CompositionLocalConsumerModifierNode modifierNode = (CompositionLocalConsumerModifierNode) r0;
        Modifier.Node delegatedNode = modifierNode.getNode();
        if (delegatedNode.isAttached() == false) goto L15;
        NodeKindKt.autoInvalidateUpdatedNode(delegatedNode);
        this_$iv2 = this_$iv;
        goto L53
    L15:
        this_$iv2 = this_$iv;
        delegatedNode.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        goto L53
    L54:
        NodeChain this_$iv3 = this_$iv;
    L57:
        if ((it$iv$iv.getAggregateChildKindSet$ui_release() & r3) == 0) goto L79;
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv3;
        goto L5
    L79:
        return;
    L55:
        this_$iv3 = this_$iv;
        goto L57
    L78:
        return;
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode r0 = getParent$ui_release();
        if (r0 == null) goto L5;
        r0.invalidateLayer$ui_release();
    L5:
        invalidateLayers$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        LayoutNodeLayoutDelegate $this$_get_alignmentLinesRequired__u24lambda_u2421 = this.layoutDelegate;
        if ($this$_get_alignmentLinesRequired__u24lambda_u2421.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() == true) goto L18;
        AlignmentLinesOwner r2 = $this$_get_alignmentLinesRequired__u24lambda_u2421.getLookaheadAlignmentLinesOwner$ui_release();
        if (r2 == null) goto L11;
        AlignmentLines r3 = r2.getAlignmentLines();
        if (r3 == null) goto L11;
        if (r3.getRequired$ui_release() != true) goto L11;
        boolean r4 = true;
    L12:
        if (r4 == false) goto L17;
        return true;
    L17:
        return false;
    L11:
        r4 = false;
        goto L12
    L18:
        return true;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        LookaheadPassDelegate r0 = getLookaheadPassDelegate$ui_release();
        if (r0 == null) goto L7;
        UsageByParent r1 = r0.getMeasuredByParent$ui_release();
        if (r1 == null) goto L7;
        return r1;
    L7:
        return UsageByParent.NotUsed;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent r1) {
        this.intrinsicsUsageByParent = r1;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public final void setCanMultiMeasure$ui_release(boolean r1) {
        this.canMultiMeasure = r1;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState r1) {
        this.subcompositionsState = r1;
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean r1) {
        this.innerLayerCoordinatorIsDirty = r1;
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui_release() {
        if (this.innerLayerCoordinatorIsDirty == false) goto L16;
        NodeCoordinator coordinator = getInnerCoordinator$ui_release();
        NodeCoordinator r1 = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        this._innerLayerCoordinator = null;
    L6:
        if (Intrinsics.areEqual(coordinator, r1) == true) goto L16;
        if (coordinator == null) goto L9;
        OwnedLayer r3 = coordinator.getLayer();
    L10:
        if (r3 != null) goto L11;
        if (coordinator == null) goto L14;
        NodeCoordinator r4 = coordinator.getWrappedBy$ui_release();
    L15:
        coordinator = r4;
        goto L6
    L14:
        r4 = null;
        goto L15
    L11:
        this._innerLayerCoordinator = coordinator;
        goto L16
    L9:
        r3 = null;
    L16:
        NodeCoordinator coordinator2 = this._innerLayerCoordinator;
        if (coordinator2 == null) goto L23;
        Object value$iv = coordinator2.getLayer();
        if (value$iv != null) goto L23;
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    L23:
        return coordinator2;
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator$ui_release();
        if (innerLayerCoordinator == null) goto L5;
        innerLayerCoordinator.invalidateLayer();
        return;
    L5:
        LayoutNode parent = getParent$ui_release();
        if (parent == null) goto L10;
        parent.invalidateLayer$ui_release();
        return;
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        if (this.pendingModifier == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this._modifier;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier value) {
        if (this.isVirtual == true) goto L5;
    L8:
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
    L12:
        boolean value$iv2 = isDeactivated();
        if ((!value$iv2) == true) goto L15;
        InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
    L15:
        boolean value$iv3 = isAttached();
        if (value$iv3 == false) goto L20;
        applyModifier(value);
        if (this.isSemanticsInvalidated == false) goto L22;
        invalidateSemantics$ui_release();
        return;
    L22:
        return;
    L20:
        this.pendingModifier = value;
        return;
    L5:
        if (getModifier() == Modifier.Companion) goto L8;
        value$iv = false;
        goto L10
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        this.nodes.updateFrom$ui_release(modifier);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null) goto L5;
        return;
    L5:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(512)) == false) goto L9;
        setLookaheadRoot(this);
        return;
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, Unit> r1) {
        this.onAttach = r1;
    }

    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, Unit> r1) {
        this.onDetach = r1;
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean r1) {
        this.needsOnPositionedDispatch = r1;
    }

    public final void place$ui_release(int x, int y) {
        if (this.intrinsicsUsageByParent != UsageByParent.NotUsed) goto L5;
        clearSubtreePlacementIntrinsicsUsage();
    L5:
        LayoutNode r0 = getParent$ui_release();
        if (r0 == null) goto L11;
        NodeCoordinator r1 = r0.getInnerCoordinator$ui_release();
        if (r1 == null) goto L11;
        Placeable.PlacementScope r2 = r1.getPlacementScope();
        if (r2 == null) goto L11;
    L12:
        Placeable.PlacementScope $this$place_u24lambda_u2425 = r2;
        Placeable.PlacementScope.placeRelative$default($this$place_u24lambda_u2425, getMeasurePassDelegate$ui_release(), x, y, 0.0f, 4, null);
        return;
    L11:
        r2 = LayoutNodeKt.requireOwner(this).getPlacementScope();
        goto L12
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent != UsageByParent.NotUsed) goto L5;
        clearSubtreePlacementIntrinsicsUsage();
    L5:
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent != UsageByParent.NotUsed) goto L5;
        clearSubtreePlacementIntrinsicsUsage();
    L5:
        LookaheadPassDelegate r0 = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r0);
        r0.replace();
    }

    public final void draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().draw(canvas, graphicsLayer);
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m5884hitTest6fMxITs$ui_release$default(LayoutNode r6, long r7, HitTestResult r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        int r4 = PointerType.Companion.m5668getUnknownT8wyACA();
    L7:
        if ((r12 & 8) == 0) goto L9;
        boolean r5 = true;
    L10:
        r6.m5891hitTest6fMxITs$ui_release(r7, r9, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui_release, reason: not valid java name */
    public final void m5891hitTest6fMxITs$ui_release(long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        long positionInWrapped = NodeCoordinator.m5945fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null);
        getOuterCoordinator$ui_release().m5963hitTestqzLsGqo(NodeCoordinator.Companion.getPointerInputSource(), positionInWrapped, hitTestResult, pointerType, isInLayer);
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m5885hitTestSemantics6fMxITs$ui_release$default(LayoutNode r6, long r7, HitTestResult r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        int r4 = PointerType.Companion.m5667getTouchT8wyACA();
    L7:
        if ((r12 & 8) == 0) goto L9;
        boolean r5 = true;
    L10:
        r6.m5892hitTestSemantics6fMxITs$ui_release(r7, r9, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui_release, reason: not valid java name */
    public final void m5892hitTestSemantics6fMxITs$ui_release(long pointerPosition, HitTestResult hitSemanticsEntities, int pointerType, boolean isInLayer) {
        long positionInWrapped = NodeCoordinator.m5945fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null);
        getOuterCoordinator$ui_release().m5963hitTestqzLsGqo(NodeCoordinator.Companion.getSemanticsSource(), positionInWrapped, hitSemanticsEntities, PointerType.Companion.m5667getTouchT8wyACA(), isInLayer);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode it) {
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] != 1) goto L18;
        if (it.getLookaheadMeasurePending$ui_release() == false) goto L8;
        requestLookaheadRemeasure$ui_release$default(it, true, false, false, 6, null);
        return;
    L8:
        if (it.getLookaheadLayoutPending$ui_release() == false) goto L11;
        it.requestLookaheadRelayout$ui_release(true);
    L11:
        if (it.getMeasurePending$ui_release() == false) goto L14;
        requestRemeasure$ui_release$default(it, true, false, false, 6, null);
        return;
    L14:
        if (it.getLayoutPending$ui_release() == false) goto L21;
        it.requestRelayout$ui_release(true);
        return;
    L21:
        return;
    L18:
        throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode r1, boolean r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = true;
    L11:
        r1.requestRemeasure$ui_release(r2, r3, r4);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (this.ignoreRemeasureRequests == true) goto L13;
        if (this.isVirtual == true) goto L13;
        Owner owner = this.owner;
        if (owner != null) goto L9;
        return;
    L9:
        Owner.onRequestMeasure$default(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics == false) goto L14;
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(forceRequest);
        return;
    L14:
        return;
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode r1, boolean r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = true;
    L11:
        r1.requestLookaheadRemeasure$ui_release(r2, r3, r4);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (this.lookaheadRoot == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
    L9:
        Owner owner = this.owner;
        if (owner != null) goto L13;
        return;
    L13:
        if (this.ignoreRemeasureRequests == false) goto L15;
        return;
    L15:
        if (this.isVirtual == true) goto L21;
        owner.onRequestMeasure(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics == false) goto L22;
        LookaheadPassDelegate r1 = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r1);
        r1.invalidateIntrinsicsParent(forceRequest);
        return;
    L22:
        return;
    L21:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void invalidateMeasurements$ui_release() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot == null) goto L5;
        requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        return;
    L5:
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() == false) goto L5;
        return;
    L5:
        if (getMeasurePending$ui_release() == false) goto L7;
        return;
    L7:
        if (this.needsOnPositionedDispatch == true) goto L13;
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
        return;
    }

    public final void ignoreRemeasureRequests$ui_release(Function0<Unit> r3) {
        access$setIgnoreRemeasureRequests$p(this, true);
        r3.invoke();
        access$setIgnoreRemeasureRequests$p(this, false);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.requestRelayout$ui_release(r1);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual == true) goto L9;
        Owner r1 = this.owner;
        if (r1 == null) goto L11;
        Owner.onRequestRelayout$default(r1, this, false, forceRequest, 2, null);
        return;
    L11:
        return;
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.requestLookaheadRelayout$ui_release(r1);
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        if (this.isVirtual == true) goto L8;
        Owner r0 = this.owner;
        if (r0 == null) goto L9;
        r0.onRequestRelayout(this, true, forceRequest);
        return;
    L9:
        return;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() == LayoutState.Idle) goto L5;
        return;
    L5:
        if (getLayoutPending$ui_release() == false) goto L7;
        return;
    L7:
        if (getMeasurePending$ui_release() == false) goto L9;
        return;
    L9:
        if (isDeactivated() == false) goto L12;
        return;
    L12:
        if (isPlaced() == true) goto L14;
        return;
    L14:
        NodeChain this_$iv = this.nodes;
        int r3 = 256;
        int type$iv = NodeKind.m5976constructorimpl(256);
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & type$iv) == 0) goto L68;
        Modifier.Node node$iv$iv$iv = this_$iv.getHead$ui_release();
    L17:
        if (node$iv$iv$iv == null) goto L85;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        if ((it$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L61;
        MutableVector r17 = null;
        int r18 = r3;
        Modifier.Node this_$iv$iv$iv = it$iv$iv;
    L21:
        if (this_$iv$iv$iv == null) goto L60;
        if ((this_$iv$iv$iv instanceof GlobalPositionAwareModifierNode) == true) goto L24;
        NodeChain this_$iv2 = this_$iv;
        int type$iv2 = type$iv;
        int r0 = 1;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L28;
        int r1 = 1;
    L29:
        if (r1 == 0) goto L59;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L59;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L33:
        if (node$iv$iv$iv2 == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L37;
        int r26 = r0;
    L38:
        if (r26 == 0) goto L54;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r0) goto L42;
        this_$iv$iv$iv = next$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
    L55:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        r0 = 1;
        goto L33
    L42:
        if (r17 != null) goto L44;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L45:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L50;
        if (r2 == null) goto L49;
        r2.add(theNode$iv$iv);
    L49:
        this_$iv$iv$iv = null;
    L50:
        if (r2 == null) goto L53;
        r2.add(next$iv$iv);
    L53:
        r17 = r2;
        count$iv$iv = count$iv$iv;
        goto L55
    L44:
        r2 = r17;
        goto L45
    L54:
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        goto L55
    L37:
        r26 = 0;
        goto L38
    L57:
        if (count$iv$iv != 1) goto L59;
        this_$iv = this_$iv2;
        type$iv = type$iv2;
    L59:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r17);
        this_$iv = this_$iv2;
        type$iv = type$iv2;
        goto L21
    L28:
        r1 = 0;
        goto L29
    L24:
        GlobalPositionAwareModifierNode it = (GlobalPositionAwareModifierNode) this_$iv$iv$iv;
        this_$iv2 = this_$iv;
        type$iv2 = type$iv;
        it.onGloballyPositioned(DelegatableNodeKt.m5836requireCoordinator64DMado(it, NodeKind.m5976constructorimpl(r18)));
        goto L59
    L60:
        NodeChain this_$iv3 = this_$iv;
        int type$iv3 = type$iv;
    L63:
        if ((it$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L86;
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r3 = r18;
        this_$iv = this_$iv3;
        type$iv = type$iv3;
        goto L17
    L86:
        return;
    L61:
        this_$iv3 = this_$iv;
        type$iv3 = type$iv;
        r18 = r3;
        goto L63
    L85:
        return;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator coordinator$iv = getOuterCoordinator$ui_release();
        NodeCoordinator inner$iv = getInnerCoordinator$ui_release();
    L3:
        if (coordinator$iv == inner$iv) goto L8;
        Intrinsics.checkNotNull(coordinator$iv, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
        LayoutModifierNodeCoordinator coordinator = (LayoutModifierNodeCoordinator) coordinator$iv;
        OwnedLayer r6 = coordinator.getLayer();
        if (r6 == null) goto L7;
        r6.invalidate();
    L7:
        coordinator$iv = coordinator$iv.getWrapped$ui_release();
        goto L3
    L8:
        OwnedLayer r0 = getInnerCoordinator$ui_release().getLayer();
        if (r0 == null) goto L15;
        r0.invalidate();
        return;
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m5886lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode r0, Constraints r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.layoutDelegate.m5907getLastLookaheadConstraintsDWUhwKw();
    L6:
        return r0.m5893lookaheadRemeasure_Sx5XlM$ui_release(r1);
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m5893lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints != null) goto L4;
    L6:
        return false;
    L4:
        if (this.lookaheadRoot == null) goto L6;
        LookaheadPassDelegate r0 = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r0);
        return r0.m5921remeasureBRTryo0(constraints.m6932unboximpl());
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m5887remeasure_Sx5XlM$ui_release$default(LayoutNode r0, Constraints r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.layoutDelegate.m5906getLastConstraintsDWUhwKw();
    L6:
        return r0.m5894remeasure_Sx5XlM$ui_release(r1);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m5894remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints != null) goto L4;
        return false;
    L4:
        if (this.intrinsicsUsageByParent != UsageByParent.NotUsed) goto L9;
        clearSubtreeIntrinsicsUsage$ui_release();
    L9:
        return getMeasurePassDelegate$ui_release().m5932remeasureBRTryo0(constraints.m6932unboximpl());
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.invalidateSubtree(r1);
    }

    public final void invalidateSubtree(boolean isRootOfInvalidation) {
        if (isRootOfInvalidation == false) goto L6;
        LayoutNode r0 = getParent$ui_release();
        if (r0 == null) goto L6;
        r0.invalidateLayer$ui_release();
    L6:
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain this_$iv = this.nodes;
        int r3 = 2;
        int type$iv = NodeKind.m5976constructorimpl(2);
        if ((NodeChain.access$getAggregateChildKindSet(this_$iv) & type$iv) == 0) goto L63;
        Modifier.Node node$iv$iv$iv = this_$iv.getHead$ui_release();
    L9:
        if (node$iv$iv$iv == null) goto L63;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        if ((it$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L57;
        MutableVector r18 = null;
        int r19 = r3;
        Modifier.Node r4 = it$iv$iv;
    L13:
        if (r4 == null) goto L56;
        if ((r4 instanceof LayoutModifierNode) == true) goto L16;
        NodeChain this_$iv2 = this_$iv;
        Modifier.Node this_$iv$iv$iv = r4;
        int r9 = this_$iv$iv$iv.getKindSet$ui_release() & type$iv;
        int r1 = 1;
        if (r9 == 0) goto L23;
        int r2 = 1;
    L24:
        if (r2 == 0) goto L54;
        if ((r4 instanceof DelegatingNode) == false) goto L54;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r4;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate$ui_release();
    L28:
        if (node$iv$iv$iv2 == null) goto L51;
        Modifier.Node next$iv$iv = node$iv$iv$iv2;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L32;
        int r25 = r1;
    L33:
        if (r25 == 0) goto L49;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r1) goto L37;
        r4 = next$iv$iv;
        type$iv = type$iv;
    L50:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        type$iv = type$iv;
        r1 = 1;
        goto L28
    L37:
        if (r18 != null) goto L39;
        MutableVector r5 = new MutableVector(new Modifier.Node[16], 0);
    L40:
        Modifier.Node theNode$iv$iv = r4;
        if (theNode$iv$iv == null) goto L45;
        if (r5 == null) goto L44;
        r5.add(theNode$iv$iv);
    L44:
        r4 = null;
    L45:
        if (r5 == null) goto L48;
        r5.add(next$iv$iv);
    L48:
        r18 = r5;
        count$iv$iv = count$iv$iv;
        goto L50
    L39:
        r5 = r18;
        goto L40
    L49:
        type$iv = type$iv;
        goto L50
    L32:
        r25 = 0;
        goto L33
    L51:
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L55;
        this_$iv = this_$iv2;
        type$iv = type$iv2;
    L55:
        r4 = DelegatableNodeKt.access$pop(r18);
        this_$iv = this_$iv2;
        type$iv = type$iv2;
    L54:
        type$iv2 = type$iv;
        goto L55
    L23:
        r2 = 0;
        goto L24
    L16:
        LayoutModifierNode it = (LayoutModifierNode) r4;
        this_$iv2 = this_$iv;
        OwnedLayer r6 = DelegatableNodeKt.m5836requireCoordinator64DMado(it, NodeKind.m5976constructorimpl(r19)).getLayer();
        if (r6 == null) goto L19;
        r6.invalidate();
    L19:
        type$iv2 = type$iv;
        goto L55
    L56:
        NodeChain this_$iv3 = this_$iv;
        int type$iv3 = type$iv;
    L59:
        if ((it$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L63;
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r3 = r19;
        this_$iv = this_$iv3;
        type$iv = type$iv3;
        goto L9
    L57:
        this_$iv3 = this_$iv;
        type$iv3 = type$iv;
        r19 = r3;
    L63:
        MutableVector<LayoutNode> r7 = get_children$ui_release();
        int i$iv = 0;
        Object[] content$iv = r7.content;
        int size$iv = r7.getSize();
    L64:
        if (i$iv >= size$iv) goto L67;
        LayoutNode it2 = (LayoutNode) content$iv[i$iv];
        it2.invalidateSubtree(false);
        i$iv = i$iv + 1;
        goto L64
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot == null) goto L5;
        requestLookaheadRemeasure$ui_release$default(this, false, false, false, 5, null);
    L6:
        Constraints lastConstraints = this.layoutDelegate.m5906getLastConstraintsDWUhwKw();
        Owner r1 = this.owner;
        if (lastConstraints == null) goto L10;
        if (r1 == null) goto L13;
        r1.mo6037measureAndLayout0kLqBqw(this, lastConstraints.m6932unboximpl());
        return;
    L13:
        return;
    L10:
        if (r1 == null) goto L15;
        Owner.measureAndLayout$default(r1, false, 1, null);
        return;
    L15:
        return;
    L5:
        requestRemeasure$ui_release$default(this, false, false, false, 5, null);
        goto L6
    }

    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator this_$iv = getInnerCoordinator$ui_release();
        int type$iv = NodeKind.m5976constructorimpl(128);
        int r2 = 0;
        boolean includeTail$iv$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type$iv);
        Modifier.Node stopNode$iv$iv = this_$iv.getTail();
        if (includeTail$iv$iv == true) goto L8;
        stopNode$iv$iv = stopNode$iv$iv.getParent$ui_release();
        if (stopNode$iv$iv != null) goto L8;
        return;
    L8:
        Modifier.Node node$iv$iv = NodeCoordinator.access$headNode(this_$iv, includeTail$iv$iv);
    L9:
        if (node$iv$iv == null) goto L82;
        if ((node$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L81;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L55;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r13 = null;
        Modifier.Node r14 = it$iv;
    L15:
        if (r14 == null) goto L54;
        if ((r14 instanceof LayoutAwareModifierNode) == true) goto L18;
        NodeCoordinator this_$iv2 = this_$iv;
        Modifier.Node this_$iv$iv$iv = r14;
        int r16 = this_$iv$iv$iv.getKindSet$ui_release() & type$iv;
        int r0 = 1;
        if (r16 == 0) goto L22;
        int r15 = 1;
    L23:
        if (r15 == 0) goto L52;
        if ((r14 instanceof DelegatingNode) == false) goto L52;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L27:
        if (node$iv$iv$iv == null) goto L49;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L31;
        int r22 = r0;
    L32:
        if (r22 == 0) goto L47;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r0) goto L36;
        r14 = next$iv$iv;
        type$iv = type$iv;
        r2 = r2;
    L48:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv;
        r2 = r2;
        r0 = 1;
        goto L27
    L36:
        if (r13 != null) goto L38;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L39:
        r13 = r1;
        Modifier.Node theNode$iv$iv = r14;
        if (theNode$iv$iv == null) goto L44;
        if (r13 == null) goto L43;
        r13.add(theNode$iv$iv);
    L43:
        r14 = null;
    L44:
        if (r13 == null) goto L48;
        r13.add(next$iv$iv);
        goto L48
    L38:
        r1 = r13;
        goto L39
    L47:
        type$iv = type$iv;
        r2 = r2;
        goto L48
    L31:
        r22 = 0;
        goto L32
    L49:
        int type$iv2 = type$iv;
        int r26 = r2;
        if (count$iv$iv != 1) goto L53;
        this_$iv = this_$iv2;
        type$iv = type$iv2;
        r2 = r26;
    L53:
        r14 = DelegatableNodeKt.access$pop(r13);
        this_$iv = this_$iv2;
        type$iv = type$iv2;
        r2 = r26;
    L52:
        type$iv2 = type$iv;
        r26 = r2;
        goto L53
    L22:
        r15 = 0;
        goto L23
    L18:
        LayoutAwareModifierNode it = (LayoutAwareModifierNode) r14;
        this_$iv2 = this_$iv;
        it.onPlaced(getInnerCoordinator$ui_release());
        type$iv2 = type$iv;
        r26 = r2;
        goto L53
    L54:
        NodeCoordinator this_$iv3 = this_$iv;
        int type$iv3 = type$iv;
        int r27 = r2;
    L57:
        if (node$iv$iv == stopNode$iv$iv) goto L83;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        this_$iv = this_$iv3;
        type$iv = type$iv3;
        r2 = r27;
        goto L9
    L83:
        return;
    L55:
        this_$iv3 = this_$iv;
        type$iv3 = type$iv;
        r27 = r2;
        goto L57
    L81:
        return;
    }

    public final void forEachCoordinator$ui_release(Function1<? super LayoutModifierNodeCoordinator, Unit> r5) {
        NodeCoordinator coordinator = getOuterCoordinator$ui_release();
        NodeCoordinator inner = getInnerCoordinator$ui_release();
    L3:
        if (coordinator == inner) goto L5;
        Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
        r5.invoke((LayoutModifierNodeCoordinator) coordinator);
        coordinator = coordinator.getWrapped$ui_release();
        goto L3
    }

    public final void forEachCoordinatorIncludingInner$ui_release(Function1<? super NodeCoordinator, Unit> r5) {
        NodeCoordinator delegate = getOuterCoordinator$ui_release();
        NodeCoordinator r2 = getInnerCoordinator$ui_release().getWrapped$ui_release();
    L4:
        if (Intrinsics.areEqual(delegate, r2) == true) goto L7;
        if (delegate == null) goto L10;
        r5.invoke(delegate);
        delegate = delegate.getWrapped$ui_release();
        goto L4
    L10:
        return;
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> r2 = get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L9;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (it.intrinsicsUsageByParent == UsageByParent.NotUsed) goto L7;
        it.clearSubtreeIntrinsicsUsage$ui_release();
    L7:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> r2 = get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L9;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (it.intrinsicsUsageByParent != UsageByParent.InLayoutBlock) goto L7;
        it.clearSubtreePlacementIntrinsicsUsage();
    L7:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> r2 = get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L9;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        it.intrinsicsUsageByParent = it.previousIntrinsicsUsageByParent;
        if (it.intrinsicsUsageByParent == UsageByParent.NotUsed) goto L7;
        it.resetSubtreeIntrinsicsUsage$ui_release();
    L7:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public SemanticsInfo getParentInfo() {
        return getParent$ui_release();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
    L5:
        boolean value$iv2 = ComposeUiFlags.isRemoveFocusedViewFixEnabled;
        if (value$iv2 == true) goto L13;
        AndroidViewHolder r0 = this.interopViewFactoryHolder;
        if (r0 == null) goto L10;
        r0.onReuse();
    L10:
        LayoutNodeSubcompositionsState r1 = this.subcompositionsState;
        if (r1 == null) goto L13;
        r1.onReuse();
    L13:
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (isDeactivated() == false) goto L18;
        this.isDeactivated = false;
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L19;
        invalidateSemantics$ui_release();
    L19:
        int oldSemanticsId = getSemanticsId();
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner r2 = this.owner;
        if (r2 == null) goto L23;
        r2.onPreLayoutNodeReused(this, oldSemanticsId);
    L23:
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == false) goto L30;
        AndroidViewHolder r3 = this.interopViewFactoryHolder;
        if (r3 == null) goto L27;
        r3.onReuse();
    L27:
        LayoutNodeSubcompositionsState r4 = this.subcompositionsState;
        if (r4 == null) goto L30;
        r4.onReuse();
    L30:
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L33;
    L35:
        rescheduleRemeasureOrRelayout$ui_release(this);
        Owner r5 = this.owner;
        if (r5 == null) goto L39;
        r5.onPostLayoutNodeReused(this, oldSemanticsId);
        return;
    L39:
        return;
    L33:
        if (this.nodes.m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(8)) == false) goto L35;
        invalidateSemantics$ui_release();
        goto L35
    L18:
        resetModifierState();
        goto L19
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == true) goto L10;
        AndroidViewHolder r0 = this.interopViewFactoryHolder;
        if (r0 == null) goto L7;
        r0.onDeactivate();
    L7:
        LayoutNodeSubcompositionsState r1 = this.subcompositionsState;
        if (r1 == null) goto L10;
        r1.onDeactivate();
    L10:
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached() == true) goto L13;
    L16:
        Owner r2 = this.owner;
        if (r2 == null) goto L20;
        r2.onLayoutNodeDeactivated(this);
    L20:
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == false) goto L28;
        AndroidViewHolder r3 = this.interopViewFactoryHolder;
        if (r3 == null) goto L24;
        r3.onDeactivate();
    L24:
        LayoutNodeSubcompositionsState r4 = this.subcompositionsState;
        if (r4 == null) goto L29;
        r4.onDeactivate();
        return;
    L29:
        return;
    L28:
        return;
    L13:
        if (ComposeUiFlags.isSemanticAutofillEnabled == true) goto L15;
        invalidateSemantics$ui_release();
        goto L16
    L15:
        this._semanticsConfiguration = null;
        this.isSemanticsInvalidated = false;
        goto L16
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == true) goto L10;
        AndroidViewHolder r0 = this.interopViewFactoryHolder;
        if (r0 == null) goto L7;
        r0.onRelease();
    L7:
        LayoutNodeSubcompositionsState r1 = this.subcompositionsState;
        if (r1 == null) goto L10;
        r1.onRelease();
    L10:
        NodeCoordinator delegate$iv = getOuterCoordinator$ui_release();
        NodeCoordinator final$iv = getInnerCoordinator$ui_release().getWrapped$ui_release();
    L12:
        if (Intrinsics.areEqual(delegate$iv, final$iv) == true) goto L16;
        if (delegate$iv == null) goto L16;
        NodeCoordinator it = delegate$iv;
        it.onRelease();
        delegate$iv = delegate$iv.getWrapped$ui_release();
    L16:
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == false) goto L26;
        AndroidViewHolder r2 = this.interopViewFactoryHolder;
        if (r2 == null) goto L20;
        r2.onRelease();
    L20:
        LayoutNodeSubcompositionsState r3 = this.subcompositionsState;
        if (r3 == null) goto L27;
        r3.onRelease();
        return;
    L27:
        return;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        ErrorMeasurePolicy = new LayoutNode$Companion$ErrorMeasurePolicy$1();
        Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
        DummyViewConfiguration = new LayoutNode$Companion$DummyViewConfiguration$1();
        ZComparator = new LayoutNode$$ExternalSyntheticLambda0();
    }

    static final int ZComparator$lambda$37(LayoutNode node1, LayoutNode node2) {
        if (node1.getZIndex() != node2.getZIndex()) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return Intrinsics.compare(node1.getPlaceOrder$ui_release(), node2.getPlaceOrder$ui_release());
    L9:
        return Float.compare(node1.getZIndex(), node2.getZIndex());
    L5:
        r0 = false;
        goto L6
    }
}
