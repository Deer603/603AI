package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b-\b \u0018\u0000 ¼\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¼\u0002½\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u0097\u0001\u001a\u00020\f2\u0007\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020\u00102\u0007\u0010\u009a\u0001\u001a\u00020(H\u0002J2\u0010\u0097\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u00002\b\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009d\u0001\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001d\u0010 \u0001\u001a\u00020c2\u0006\u0010b\u001a\u00020cH\u0004ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J'\u0010£\u0001\u001a\u00020\u001c2\b\u0010¤\u0001\u001a\u00030\u009b\u00012\u0006\u0010b\u001a\u00020cH\u0004ø\u0001\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001b\u0010§\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\n2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010ª\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\n2\b\u0010«\u0001\u001a\u00030¬\u0001H\u0004J\u001d\u0010\u00ad\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\n2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\t\u0010®\u0001\u001a\u00020\fH&J\u0018\u0010¯\u0001\u001a\u00020\u00002\u0007\u0010°\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b±\u0001J*\u0010²\u0001\u001a\u00030\u009b\u00012\u0007\u0010s\u001a\u00030\u009b\u00012\t\b\u0002\u0010\u009d\u0001\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001b\u0010µ\u0001\u001a\u00020\f2\u0007\u0010¶\u0001\u001a\u00020\u00102\u0007\u0010\u009a\u0001\u001a\u00020(H\u0002J#\u0010·\u0001\u001a\u00020(2\f\u0010¸\u0001\u001a\u0007\u0012\u0002\b\u00030¹\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001J$\u0010¼\u0001\u001a\u0005\u0018\u00010\u0088\u00012\f\u0010¸\u0001\u001a\u0007\u0012\u0002\b\u00030¹\u0001ø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0015\u0010¿\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010À\u0001\u001a\u00020(H\u0002JD\u0010Á\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(ø\u0001\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JF\u0010Ë\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0006\bÌ\u0001\u0010Ê\u0001J\t\u0010Í\u0001\u001a\u00020\fH\u0016J\u001f\u0010Î\u0001\u001a\u00020(2\b\u0010¤\u0001\u001a\u00030\u009b\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0007\u0010Ñ\u0001\u001a\u00020(J\u001c\u0010Ò\u0001\u001a\u00030Ó\u00012\u0007\u0010Ô\u0001\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u00020(H\u0016J)\u0010Õ\u0001\u001a\u00030\u009b\u00012\u0007\u0010Ô\u0001\u001a\u00020\u00032\b\u0010Ö\u0001\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b×\u0001\u0010Ø\u0001J2\u0010Õ\u0001\u001a\u00030\u009b\u00012\u0007\u0010Ô\u0001\u001a\u00020\u00032\b\u0010Ö\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009d\u0001\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J \u0010Û\u0001\u001a\u00030\u009b\u00012\b\u0010Ü\u0001\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÝ\u0001\u0010¢\u0001J \u0010Þ\u0001\u001a\u00030\u009b\u00012\b\u0010Ü\u0001\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bß\u0001\u0010¢\u0001J \u0010à\u0001\u001a\u00030\u009b\u00012\b\u0010Ü\u0001\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bá\u0001\u0010¢\u0001J \u0010â\u0001\u001a\u00030\u009b\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bã\u0001\u0010¢\u0001J\u0007\u0010ä\u0001\u001a\u00020\fJ\u000f\u0010å\u0001\u001a\u00020\fH\u0000¢\u0006\u0003\bæ\u0001J\u0007\u0010ç\u0001\u001a\u00020\fJ\t\u0010è\u0001\u001a\u00020\fH\u0016J\u0007\u0010é\u0001\u001a\u00020\fJ\u001d\u0010ê\u0001\u001a\u00020\f2\b\u0010ë\u0001\u001a\u00030ì\u00012\b\u0010í\u0001\u001a\u00030ì\u0001H\u0014J\u0007\u0010î\u0001\u001a\u00020\fJ\u0007\u0010ï\u0001\u001a\u00020\fJ\u0007\u0010ð\u0001\u001a\u00020\fJ\u0007\u0010ñ\u0001\u001a\u00020\fJ\u001d\u0010ò\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\n2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u000bH\u0016J2\u0010ó\u0001\u001a\u00030ô\u00012\u0007\u0010õ\u0001\u001a\u00020>2\u0010\b\u0004\u0010ö\u0001\u001a\t\u0012\u0005\u0012\u00030ô\u000105H\u0084\bø\u0001\u0000¢\u0006\u0006\b÷\u0001\u0010ø\u0001JA\u0010ù\u0001\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0019\u0010H\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bGH\u0014ø\u0001\u0000¢\u0006\u0006\bú\u0001\u0010û\u0001J.\u0010ù\u0001\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u000bH\u0014ø\u0001\u0000¢\u0006\u0006\bú\u0001\u0010ü\u0001JK\u0010ý\u0001\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0019\u0010H\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bG2\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002ø\u0001\u0000¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001JI\u0010\u0080\u0002\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0019\u0010H\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bG2\b\u0010B\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0006\b\u0081\u0002\u0010ÿ\u0001J,\u0010\u0082\u0002\u001a\u00020\f2\u0007\u0010¶\u0001\u001a\u00020\u00102\u0007\u0010\u009a\u0001\u001a\u00020(2\t\b\u0002\u0010\u0083\u0002\u001a\u00020(H\u0000¢\u0006\u0003\b\u0084\u0002J\u0007\u0010\u0085\u0002\u001a\u00020\fJ\u000f\u0010\u0086\u0002\u001a\u00020\fH\u0010¢\u0006\u0003\b\u0087\u0002J \u0010\u0088\u0002\u001a\u00030\u009b\u00012\b\u0010\u0089\u0002\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010¢\u0001J\u0007\u0010\u008b\u0002\u001a\u00020(J*\u0010\u008c\u0002\u001a\u00030\u009b\u00012\u0007\u0010s\u001a\u00030\u009b\u00012\t\b\u0002\u0010\u009d\u0001\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008d\u0002\u0010´\u0001J\b\u0010\u008e\u0002\u001a\u00030Ó\u0001J(\u0010\u008f\u0002\u001a\u00020\f2\u0007\u0010Ô\u0001\u001a\u00020\u00032\b\u0010\u0090\u0002\u001a\u00030\u0091\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J(\u0010\u0094\u0002\u001a\u00020\f2\u0007\u0010\u0098\u0001\u001a\u00020\u00002\b\u0010\u0090\u0002\u001a\u00030\u0091\u0002H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J(\u0010\u0097\u0002\u001a\u00020\f2\u0007\u0010\u0098\u0001\u001a\u00020\u00002\b\u0010\u0090\u0002\u001a\u00030\u0091\u0002H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0098\u0002\u0010\u0096\u0002J\u001f\u0010\u0099\u0002\u001a\u00020\f2\b\u0010\u0090\u0002\u001a\u00030\u0091\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J-\u0010\u009c\u0002\u001a\u00020\f2\u0019\u0010H\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bG2\t\b\u0002\u0010\u009d\u0002\u001a\u00020(J\u0014\u0010\u009e\u0002\u001a\u00020(2\t\b\u0002\u0010\u009f\u0002\u001a\u00020(H\u0002JF\u0010 \u0002\u001a\u00020\f\"\u0007\b\u0000\u0010¡\u0002\u0018\u00012\u000f\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u0003H¡\u00020¹\u00012\u0014\u0010ö\u0001\u001a\u000f\u0012\u0005\u0012\u0003H¡\u0002\u0012\u0004\u0012\u00020\f0EH\u0086\bø\u0001\u0000¢\u0006\u0006\b¢\u0002\u0010£\u0002J3\u0010 \u0002\u001a\u00020\f2\b\u0010¤\u0002\u001a\u00030ì\u00012\u0007\u0010À\u0001\u001a\u00020(2\u0014\u0010ö\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\f0EH\u0086\bJ \u0010¥\u0002\u001a\u00030\u009b\u00012\b\u0010¦\u0002\u001a\u00030\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b§\u0002\u0010¢\u0001J(\u0010¨\u0002\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\n2\u0013\u0010ö\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0EH\u0084\bJ\u001f\u0010©\u0002\u001a\u00020(2\b\u0010¤\u0001\u001a\u00030\u009b\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\bª\u0002\u0010Ð\u0001JM\u0010«\u0002\u001a\u00020\f*\u0005\u0018\u00010\u0088\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0006\b¬\u0002\u0010\u00ad\u0002JV\u0010®\u0002\u001a\u00020\f*\u0005\u0018\u00010\u0088\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(2\u0007\u0010¯\u0002\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0006\b°\u0002\u0010±\u0002J0\u0010²\u0002\u001a\u00020(*\u0005\u0018\u00010\u0088\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b³\u0002\u0010´\u0002J_\u0010µ\u0002\u001a\u00020\f*\u0005\u0018\u00010\u0088\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(2\u0007\u0010¯\u0002\u001a\u00020\u001c2\u0007\u0010¶\u0002\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0006\b·\u0002\u0010¸\u0002JV\u0010¹\u0002\u001a\u00020\f*\u0005\u0018\u00010\u0088\u00012\b\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030\u009b\u00012\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020(2\u0007\u0010¯\u0002\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0006\bº\u0002\u0010±\u0002J\r\u0010»\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002R$\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u001a\u0010'\u001a\u00020(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0014\u00100\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010*R\u0014\u00102\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\f05X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010*R\u000e\u00107\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010*R\u000e\u00109\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020(2\u0006\u0010:\u001a\u00020(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u001a\u0010=\u001a\u00020>8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010@R\"\u0010B\u001a\u0004\u0018\u00010A2\b\u0010:\u001a\u0004\u0018\u00010A@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DRD\u0010H\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bG2\u0019\u0010:\u001a\u0015\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\f\u0018\u00010E¢\u0006\u0002\bG@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR&\u0010W\u001a\u0004\u0018\u00010V2\b\u0010:\u001a\u0004\u0018\u00010V@dX¦\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\u000e8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0017\u0010b\u001a\u00020c8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bd\u0010@R\u0016\u0010e\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010h\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0017R\u0013\u0010j\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u001aR\u0016\u0010l\u001a\u0004\u0018\u00010m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010p\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u001aR,\u0010s\u001a\u00020r2\u0006\u0010:\u001a\u00020r@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010w\u001a\u0004\bt\u0010@\"\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020g0y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u000e\u0010\u007f\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0080\u0001\u001a\u00030\u0081\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010@R\u0018\u0010\u0083\u0001\u001a\u00030\u0084\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0087\u0001\u001a\u00030\u0088\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001\"\u0006\b\u0092\u0001\u0010\u008f\u0001R(\u0010\u0093\u0001\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u001e\"\u0006\b\u0095\u0001\u0010\u0096\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¾\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "density", "", "getDensity", "()F", "drawBlock", "getDrawBlock", "()Lkotlin/jvm/functions/Function2;", "drawBlockCanvas", "drawBlockParentLayer", "explicitLayer", "fontScale", "getFontScale", "forceMeasureWithLookaheadConstraints", "", "getForceMeasureWithLookaheadConstraints$ui_release", "()Z", "setForceMeasureWithLookaheadConstraints$ui_release", "(Z)V", "forcePlaceWithLookaheadOffset", "getForcePlaceWithLookaheadOffset$ui_release", "setForcePlaceWithLookaheadOffset$ui_release", "hasMeasureResult", "getHasMeasureResult", "introducesMotionFrameOfReference", "getIntroducesMotionFrameOfReference", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isValidOwnerScope", "lastLayerAlpha", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui_release", "()J", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "value", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "oldAlignmentLines", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "parent", "getParent", "parentCoordinates", "getParentCoordinates", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "released", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "zIndex", "getZIndex", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "includeMotionFrameOfReference", "ancestorToLocal-S_NoaFU", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "graphicsLayer", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "ensureLookaheadDelegateCreated", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "fromParentPosition", "fromParentPosition-8S9VItk", "(JZ)J", "fromParentRect", "bounds", "hasNode", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "hasNode-H91voCI", "(I)Z", "head", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "headNode", "includeTail", "hitTest", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "hitTest-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTestChild", "hitTestChild-qzLsGqo", "invalidateLayer", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToScreen", "localToScreen-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onAttach", "onCoordinatesUsed", "onCoordinatesUsed$ui_release", "onDetach", "onLayoutModifierNodeChanged", "onLayoutNodeAttach", "onMeasureResultChanged", "width", "", "height", "onMeasured", "onPlaced", "onRelease", "onUnplaced", "performDraw", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelf", "placeSelf-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset-MLgxB_4", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "releaseLayer", "replace", "replace$ui_release", "screenToLocal", "relativeToScreen", "screenToLocal-MK-Hz9U", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-8S9VItk", "touchBoundsInRoot", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformToAncestor-EL8BTi8", "transformToScreen", "transformToScreen-58bKbWc", "([F)V", "updateLayerBlock", "forceUpdateLayerParameters", "updateLayerParameters", "invokeOnLayoutChange", "visitNodes", "T", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "mask", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "hit", "hit-5ShdDok", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitNear", "distanceFromEdge", "hitNear-Fh5PU_I", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "isInExpandedTouchBounds", "isInExpandedTouchBounds-ThD-n1k", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "outOfBoundsHit", "isHitInMinimumTouchTargetBetter", "outOfBoundsHit-8NAm7pk", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "speculativeHit", "speculativeHit-Fh5PU_I", "toCoordinator", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    private static final HitTestSource PointerInputSource = null;
    private static final HitTestSource SemanticsSource = null;
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private static final ReusableGraphicsLayerScope graphicsLayerScope = null;
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = null;
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = null;
    private static final LayerPositionalProperties tmpLayerPositionalProperties = null;
    private static final float[] tmpMatrix = null;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private long position;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.access$getPointerInputSource$cp();
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.access$getSemanticsSource$cp();
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0005H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "", "childHitTest-qzLsGqo", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        void mo5971childHitTestqzLsGqo(LayoutNode r1, long r2, HitTestResult r4, int r5, boolean r6);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo5972entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node r1);

        boolean shouldHitTestChildren(LayoutNode r1);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract LookaheadDelegate getLookaheadDelegate();

    public abstract Modifier.Node getTail();

    protected abstract void setLookaheadDelegate(LookaheadDelegate r1);

    public static final /* synthetic */ void access$drawContainedDrawModifiers(NodeCoordinator $this, Canvas canvas, GraphicsLayer graphicsLayer) {
        $this.drawContainedDrawModifiers(canvas, graphicsLayer);
    }

    public static final /* synthetic */ Canvas access$getDrawBlockCanvas$p(NodeCoordinator $this) {
        return $this.drawBlockCanvas;
    }

    public static final /* synthetic */ GraphicsLayer access$getDrawBlockParentLayer$p(NodeCoordinator $this) {
        return $this.drawBlockParentLayer;
    }

    public static final /* synthetic */ ReusableGraphicsLayerScope access$getGraphicsLayerScope$cp() {
        return graphicsLayerScope;
    }

    public static final /* synthetic */ Function1 access$getOnCommitAffectingLayer$cp() {
        return onCommitAffectingLayer;
    }

    public static final /* synthetic */ HitTestSource access$getPointerInputSource$cp() {
        return PointerInputSource;
    }

    public static final /* synthetic */ HitTestSource access$getSemanticsSource$cp() {
        return SemanticsSource;
    }

    public static final /* synthetic */ OwnerSnapshotObserver access$getSnapshotObserver(NodeCoordinator $this) {
        return $this.getSnapshotObserver();
    }

    public static final /* synthetic */ Modifier.Node access$headNode(NodeCoordinator $this, boolean includeTail) {
        return $this.headNode(includeTail);
    }

    /* JADX INFO: renamed from: access$outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public static final /* synthetic */ void m5942access$outOfBoundsHit8NAm7pk(NodeCoordinator $this, Modifier.Node $receiver, HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer, float distanceFromEdge, boolean isHitInMinimumTouchTargetBetter) {
        $this.m5951outOfBoundsHit8NAm7pk($receiver, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge, isHitInMinimumTouchTargetBetter);
    }

    public static final /* synthetic */ void access$setDrawBlockCanvas$p(NodeCoordinator $this, Canvas r1) {
        $this.drawBlockCanvas = r1;
    }

    public static final /* synthetic */ void access$setDrawBlockParentLayer$p(NodeCoordinator $this, GraphicsLayer r1) {
        $this.drawBlockParentLayer = r1;
    }

    public static final /* synthetic */ void access$setLastLayerDrawingWasSkipped$p(NodeCoordinator $this, boolean r1) {
        $this.lastLayerDrawingWasSkipped = r1;
    }

    /* JADX INFO: renamed from: access$setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public static final /* synthetic */ void m5943access$setMeasurementConstraintsBRTryo0(NodeCoordinator $this, long value) {
        $this.m5777setMeasurementConstraintsBRTryo0(value);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.Companion.m7112getZeronOccac();
        this.invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.forcePlaceWithLookaheadOffset;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean r1) {
        this.forcePlaceWithLookaheadOffset = r1;
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean r1) {
        this.forceMeasureWithLookaheadConstraints = r1;
    }

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final void setWrapped$ui_release(NodeCoordinator r1) {
        this.wrapped = r1;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator r1) {
        this.wrappedBy = r1;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    private final Modifier.Node headNode(boolean includeTail) {
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) goto L16;
        NodeCoordinator r0 = this.wrappedBy;
        if (includeTail == false) goto L12;
        if (r0 == null) goto L18;
        Modifier.Node r1 = r0.getTail();
        if (r1 == null) goto L18;
        return r1.getChild$ui_release();
    L18:
        return null;
    L12:
        if (r0 == null) goto L15;
        return r0.getTail();
    L15:
        return null;
    L16:
        return getLayoutNode().getNodes$ui_release().getHead$ui_release();
    }

    public final void visitNodes(int mask, boolean includeTail, Function1<? super Modifier.Node, Unit> r7) {
        Modifier.Node stopNode = getTail();
        if (includeTail == true) goto L8;
        stopNode = stopNode.getParent$ui_release();
        if (stopNode != null) goto L8;
        return;
    L8:
        Modifier.Node node = access$headNode(this, includeTail);
    L9:
        if (node == null) goto L22;
        if ((node.getAggregateChildKindSet$ui_release() & mask) == 0) goto L12;
        if ((node.getKindSet$ui_release() & mask) == 0) goto L16;
        r7.invoke(node);
    L16:
        if (node == stopNode) goto L18;
        node = node.getChild$ui_release();
        goto L9
    L18:
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m5969visitNodesaLcG6gQ(int type, Function1<? super T, Unit> r28) {
        int r0 = 0;
        boolean includeTail$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type);
        NodeCoordinator this_$iv = this;
        int mask$iv = type;
        Modifier.Node stopNode$iv = this_$iv.getTail();
        if (includeTail$iv == true) goto L8;
        stopNode$iv = stopNode$iv.getParent$ui_release();
        if (stopNode$iv != null) goto L8;
        return;
    L8:
        Modifier.Node node$iv = access$headNode(this_$iv, includeTail$iv);
    L9:
        if (node$iv == null) goto L83;
        if ((node$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L82;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L57;
        Object it = node$iv;
        Object stack$iv = null;
        Object node$iv2 = it;
    L15:
        if (node$iv2 == null) goto L56;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((node$iv2 instanceof Object) == true) goto L18;
        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
        int r17 = r0;
        if ((this_$iv$iv.getKindSet$ui_release() & type) == 0) goto L22;
        boolean r14 = true;
    L23:
        if (r14 == false) goto L54;
        if ((node$iv2 instanceof DelegatingNode) == false) goto L54;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L27:
        if (node$iv$iv == null) goto L51;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & type) == 0) goto L31;
        boolean r20 = true;
    L32:
        if (r20 == false) goto L49;
        count$iv = count$iv + 1;
        boolean includeTail$iv2 = includeTail$iv;
        if (count$iv != 1) goto L36;
        node$iv2 = next$iv;
        this_$iv = this_$iv;
        mask$iv = mask$iv;
    L50:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        includeTail$iv = includeTail$iv2;
        this_$iv = this_$iv;
        mask$iv = mask$iv;
        goto L27
    L36:
        Object r1 = (MutableVector) stack$iv;
        if (r1 != null) goto L39;
        Object r2 = new MutableVector(new Modifier.Node[16], 0);
        MutableVector r3 = (MutableVector) r2;
    L40:
        stack$iv = r2;
        Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
        if (theNode$iv == null) goto L46;
        MutableVector r4 = (MutableVector) stack$iv;
        if (r4 == null) goto L45;
        r4.add(theNode$iv);
    L45:
        node$iv2 = null;
    L46:
        MutableVector r5 = (MutableVector) stack$iv;
        if (r5 == null) goto L50;
        r5.add(next$iv);
        goto L50
    L39:
        r2 = r1;
        goto L40
    L49:
        includeTail$iv2 = includeTail$iv;
        this_$iv = this_$iv;
        mask$iv = mask$iv;
        goto L50
    L31:
        r20 = false;
        goto L32
    L51:
        boolean includeTail$iv3 = includeTail$iv;
        NodeCoordinator this_$iv2 = this_$iv;
        int mask$iv2 = mask$iv;
        if (count$iv != 1) goto L55;
        r0 = r17;
        includeTail$iv = includeTail$iv3;
        this_$iv = this_$iv2;
        mask$iv = mask$iv2;
    L55:
        node$iv2 = DelegatableNodeKt.access$pop((MutableVector) stack$iv);
        r0 = r17;
        includeTail$iv = includeTail$iv3;
        this_$iv = this_$iv2;
        mask$iv = mask$iv2;
    L54:
        includeTail$iv3 = includeTail$iv;
        this_$iv2 = this_$iv;
        mask$iv2 = mask$iv;
        goto L55
    L22:
        r14 = false;
        goto L23
    L18:
        r28.invoke(node$iv2);
        r17 = r0;
        includeTail$iv3 = includeTail$iv;
        this_$iv2 = this_$iv;
        mask$iv2 = mask$iv;
        goto L55
    L56:
        int r18 = r0;
        boolean includeTail$iv4 = includeTail$iv;
        NodeCoordinator this_$iv3 = this_$iv;
        int mask$iv3 = mask$iv;
    L59:
        if (node$iv == stopNode$iv) goto L84;
        node$iv = node$iv.getChild$ui_release();
        r0 = r18;
        includeTail$iv = includeTail$iv4;
        this_$iv = this_$iv3;
        mask$iv = mask$iv3;
        goto L9
    L84:
        return;
    L57:
        r18 = r0;
        includeTail$iv4 = includeTail$iv;
        this_$iv3 = this_$iv;
        mask$iv3 = mask$iv;
        goto L59
    L82:
        return;
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m5946hasNodeH91voCI(int type) {
        Modifier.Node r0 = headNode(NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type));
        if (r0 != null) goto L5;
        return false;
    L5:
        if (DelegatableNodeKt.m5834has64DMado(r0, type) == true) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m5962headH91voCI(int type) {
        boolean includeTail$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node stopNode$iv = getTail();
        if (includeTail$iv == true) goto L8;
        stopNode$iv = stopNode$iv.getParent$ui_release();
        if (stopNode$iv != null) goto L8;
        return null;
    L8:
        Modifier.Node node$iv = access$headNode(this, includeTail$iv);
    L9:
        if (node$iv == null) goto L26;
        if ((node$iv.getAggregateChildKindSet$ui_release() & type) == 0) goto L27;
        if ((node$iv.getKindSet$ui_release() & type) != 0) goto L14;
        if (node$iv == stopNode$iv) goto L25;
        node$iv = node$iv.getChild$ui_release();
        goto L9
    L25:
        return null;
    L14:
        Modifier.Node it = node$iv;
        return it;
    L27:
        return null;
    L26:
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo5722getSizeYbymL2g() {
        return m5773getMeasuredSizeYbymL2g();
    }

    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer != null) goto L5;
    L8:
        NodeCoordinator r0 = this.wrappedBy;
        if (r0 != null) goto L11;
        return false;
    L11:
        return r0.isTransparent();
    L5:
        if (this.lastLayerAlpha > 0.0f) goto L8;
        return true;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer explicitLayer = this.explicitLayer;
        if (explicitLayer == null) goto L5;
        mo5775placeAtf8xVGno(mo5909getPositionnOccac(), this.zIndex, explicitLayer);
        return;
    L5:
        mo5715placeAtf8xVGno(mo5909getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this._measureResult == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult r0 = this._measureResult;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    public void setMeasureResult$ui_release(MeasureResult value) {
        MeasureResult old = this._measureResult;
        if (value == old) goto L27;
        this._measureResult = value;
        if (old != null) goto L7;
    L10:
        onMeasureResultChanged(value.getWidth(), value.getHeight());
    L12:
        if (this.oldAlignmentLines == null) goto L16;
        MutableObjectIntMap<AlignmentLine> r1 = this.oldAlignmentLines;
        Intrinsics.checkNotNull(r1);
        if (r1.isNotEmpty() == false) goto L16;
    L18:
        if (NodeCoordinatorKt.access$compareEquals(this.oldAlignmentLines, value.getAlignmentLines()) == true) goto L30;
        getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
        MutableObjectIntMap<AlignmentLine> r2 = this.oldAlignmentLines;
        if (r2 != null) goto L22;
        r2 = ObjectIntMapKt.mutableObjectIntMapOf();
        this.oldAlignmentLines = r2;
    L22:
        r2.clear();
        Iterator<Map.Entry<AlignmentLine, Integer>> r4 = value.getAlignmentLines().entrySet().iterator();
    L24:
        if (r4.hasNext() == false) goto L31;
        Map.Entry<AlignmentLine, Integer> r5 = r4.next();
        r2.set(r5.getKey(), r5.getValue().intValue());
        goto L24
    L31:
        return;
    L30:
        return;
    L16:
        if (value.getAlignmentLines().isEmpty() == false) goto L18;
        return;
    L7:
        if (value.getWidth() != old.getWidth()) goto L10;
        if (value.getHeight() == old.getHeight()) goto L12;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Set set = null;
        NodeCoordinator coordinator = this;
    L3:
        if (coordinator == null) goto L18;
        MeasureResult r2 = coordinator._measureResult;
        if (r2 == null) goto L7;
        Map<AlignmentLine, Integer> r3 = r2.getAlignmentLines();
    L8:
        boolean r4 = false;
        if (r3 != null) goto L11;
    L13:
        if (r4 == false) goto L17;
        if (set != null) goto L16;
        Set set2 = new LinkedHashSet();
        set = set2;
    L16:
        set.addAll(r3.keySet());
    L17:
        coordinator = coordinator.wrapped;
        goto L3
    L11:
        if ((!r3.isEmpty()) != true) goto L13;
        r4 = true;
        goto L13
    L7:
        r3 = null;
        goto L8
    L18:
        if (set != null) goto L21;
        return SetsKt.emptySet();
    L21:
        return set;
    }

    protected void onMeasureResultChanged(int width, int height) {
        OwnedLayer layer = this.layer;
        if (layer == null) goto L6;
        layer.mo6032resizeozmzZPI(IntSize.m7139constructorimpl((((long) width) << 32) | (((long) height) & 4294967295L)));
    L10:
        m5776setMeasuredSizeozmzZPI(IntSize.m7139constructorimpl((4294967295L & ((long) height)) | (((long) width) << 32)));
        OwnedLayer r5 = null;
        if (this.layerBlock == null) goto L13;
        updateLayerParameters(false);
    L13:
        int r4 = NodeKind.m5976constructorimpl(4);
        boolean includeTail$iv$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(r4);
        Modifier.Node stopNode$iv$iv = getTail();
        if (includeTail$iv$iv == true) goto L19;
        stopNode$iv$iv = stopNode$iv$iv.getParent$ui_release();
        if (stopNode$iv$iv != null) goto L19;
    L74:
        Owner r0 = getLayoutNode().getOwner$ui_release();
        if (r0 == null) goto L94;
        r0.onLayoutChange(getLayoutNode());
        return;
    L94:
        return;
    L19:
        Modifier.Node node$iv$iv = access$headNode(this, includeTail$iv$iv);
    L20:
        if (node$iv$iv == null) goto L74;
        if ((node$iv$iv.getAggregateChildKindSet$ui_release() & r4) == 0) goto L74;
        if ((node$iv$iv.getKindSet$ui_release() & r4) == 0) goto L67;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node r6 = it$iv;
    L26:
        if (r6 == null) goto L66;
        if ((r6 instanceof DrawModifierNode) == true) goto L29;
        Modifier.Node this_$iv$iv$iv = r6;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r4) == 0) goto L33;
        int r20 = 1;
    L34:
        if (r20 == 0) goto L64;
        if ((r6 instanceof DelegatingNode) == false) goto L64;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r6;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L38:
        if (node$iv$iv$iv == null) goto L61;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r4) == 0) goto L42;
        boolean r26 = true;
    L43:
        if (r26 == false) goto L59;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L47;
        r6 = next$iv$iv;
        layer = layer;
    L60:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        layer = layer;
        goto L38
    L47:
        if (r18 != null) goto L49;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L50:
        Modifier.Node theNode$iv$iv = r6;
        if (theNode$iv$iv == null) goto L55;
        if (r1 == null) goto L54;
        r1.add(theNode$iv$iv);
    L54:
        r6 = null;
    L55:
        if (r1 == null) goto L58;
        r1.add(next$iv$iv);
    L58:
        r18 = r1;
        count$iv$iv = count$iv$iv;
        goto L60
    L49:
        r1 = r18;
        goto L50
    L59:
        layer = layer;
        goto L60
    L42:
        r26 = false;
        goto L43
    L61:
        OwnedLayer layer2 = layer;
        if (count$iv$iv != 1) goto L65;
        layer = layer2;
    L65:
        r6 = DelegatableNodeKt.access$pop(r18);
        layer = layer2;
    L64:
        layer2 = layer;
        goto L65
    L33:
        r20 = 0;
        goto L34
    L29:
        DrawModifierNode it = (DrawModifierNode) r6;
        it.onMeasureResultChanged();
        layer2 = layer;
        goto L65
    L66:
        OwnedLayer layer3 = layer;
        OwnedLayer layer4 = null;
    L69:
        if (node$iv$iv == stopNode$iv$iv) goto L74;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r5 = layer4;
        layer = layer3;
        goto L20
    L67:
        layer3 = layer;
        layer4 = r5;
        goto L69
    L6:
        if (getLayoutNode().isPlaced() == false) goto L10;
        NodeCoordinator r7 = this.wrappedBy;
        if (r7 == null) goto L10;
        r7.invalidateLayer();
        goto L10
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo5909getPositionnOccac() {
        return this.position;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m5967setPositiongyyYBs(long r1) {
        this.position = r1;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float r1) {
        this.zIndex = r1;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        int r2 = 64;
        if (getLayoutNode().getNodes$ui_release().m5937hasH91voCI$ui_release(NodeKind.m5976constructorimpl(64)) == false) goto L59;
        Modifier.Node thisNode = getTail();
        kotlin.jvm.internal.Ref.ObjectRef data = new kotlin.jvm.internal.Ref.ObjectRef();
        NodeChain this_$iv = getLayoutNode().getNodes$ui_release();
        int $i$f$tailToHead$ui_release = 0;
        Modifier.Node node$iv = this_$iv.getTail$ui_release();
    L5:
        if (node$iv == null) goto L58;
        Modifier.Node node = node$iv;
        if ((node.getKindSet$ui_release() & NodeKind.m5976constructorimpl(r2)) == 0) goto L9;
        int kind$iv = 1;
    L10:
        if (kind$iv == 0) goto L53;
        int r8 = NodeKind.m5976constructorimpl(r2);
        MutableVector r11 = null;
        Modifier.Node r14 = node;
    L12:
        if (r14 == null) goto L52;
        if ((r14 instanceof ParentDataModifierNode) == true) goto L15;
        Modifier.Node this_$iv$iv = r14;
        if ((this_$iv$iv.getKindSet$ui_release() & r8) == 0) goto L19;
        boolean r3 = true;
    L20:
        if (r3 == false) goto L50;
        if ((r14 instanceof DelegatingNode) == false) goto L50;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L24:
        if (node$iv$iv == null) goto L47;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & r8) == 0) goto L28;
        boolean r18 = true;
    L29:
        if (r18 == false) goto L45;
        count$iv = count$iv + 1;
        NodeChain this_$iv2 = this_$iv;
        if (count$iv != 1) goto L33;
        r14 = next$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        node$iv = node$iv;
    L46:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        this_$iv = this_$iv2;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        node$iv = node$iv;
        goto L24
    L33:
        if (r11 != null) goto L35;
        MutableVector r4 = new MutableVector(new Modifier.Node[16], 0);
    L36:
        r11 = r4;
        Modifier.Node theNode$iv = r14;
        if (theNode$iv == null) goto L41;
        if (r11 == null) goto L40;
        r11.add(theNode$iv);
    L40:
        r14 = null;
    L41:
        if (r11 == null) goto L44;
        r11.add(next$iv);
    L44:
        count$iv = count$iv;
        goto L46
    L35:
        r4 = r11;
        goto L36
    L45:
        this_$iv2 = this_$iv;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release;
        node$iv = node$iv;
        goto L46
    L28:
        r18 = false;
        goto L29
    L47:
        NodeChain this_$iv3 = this_$iv;
        int $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
        Modifier.Node node$iv2 = node$iv;
        if (count$iv != 1) goto L51;
        this_$iv = this_$iv3;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release2;
        node$iv = node$iv2;
    L51:
        r14 = DelegatableNodeKt.access$pop(r11);
        this_$iv = this_$iv3;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release2;
        node$iv = node$iv2;
    L50:
        this_$iv3 = this_$iv;
        $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
        node$iv2 = node$iv;
        goto L51
    L19:
        r3 = false;
        goto L20
    L15:
        ParentDataModifierNode it = (ParentDataModifierNode) r14;
        data.element = it.modifyParentData(getLayoutNode().getDensity(), data.element);
        this_$iv3 = this_$iv;
        $i$f$tailToHead$ui_release2 = $i$f$tailToHead$ui_release;
        node$iv2 = node$iv;
        goto L51
    L52:
        NodeChain this_$iv4 = this_$iv;
        int $i$f$tailToHead$ui_release3 = $i$f$tailToHead$ui_release;
        Modifier.Node node$iv3 = node$iv;
    L54:
        if (node != thisNode) goto L56;
    L56:
        node$iv = node$iv3.getParent$ui_release();
        this_$iv = this_$iv4;
        $i$f$tailToHead$ui_release = $i$f$tailToHead$ui_release3;
        r2 = 64;
        goto L5
    L53:
        this_$iv4 = this_$iv;
        $i$f$tailToHead$ui_release3 = $i$f$tailToHead$ui_release;
        node$iv3 = node$iv;
        goto L54
    L9:
        kind$iv = 0;
        goto L10
    L58:
        return data.element;
    L59:
        return null;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    protected final MutableRect getRectCache() {
        MutableRect r0 = this._rectCache;
        if (r0 != null) goto L6;
        MutableRect it = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = it;
        return it;
    L6:
        return r0;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m5960getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m5774getMeasurementConstraintsmsEJaDk();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final Placeable m5965performingMeasureK40F9xA(long constraints, Function0<? extends Placeable> r5) {
        m5943access$setMeasurementConstraintsBRTryo0(this, constraints);
        return r5.invoke();
    }

    public final void onMeasured() {
        NodeCoordinator this = this;
        if (this.m5946hasNodeH91voCI(NodeKind.m5976constructorimpl(128)) == false) goto L75;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L7;
        Function1<Object, Unit> r0 = previousSnapshot$iv.getReadObserver();
    L8:
        Function1<Object, Unit> r6 = r0;
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        int r1 = 0;
        int type$iv = NodeKind.m5976constructorimpl(128);     // Catch: Throwable -> L72
        NodeCoordinator this_$iv2 = this;
        int r9 = 0;
        boolean includeTail$iv$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type$iv);     // Catch: Throwable -> L72
        if (includeTail$iv$iv == false) goto L12;
        Modifier.Node stopNode$iv$iv = this_$iv2.getTail();     // Catch: Throwable -> L72
    L15:
        Modifier.Node node$iv$iv = access$headNode(this_$iv2, includeTail$iv$iv);     // Catch: Throwable -> L72
    L16:
        if (node$iv$iv == null) goto L70;
        if ((node$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L70;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L63;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r20 = null;
        Modifier.Node r2 = it$iv;
    L22:
        if (r2 == null) goto L62;
        type$iv = type$iv;
        if ((r2 instanceof LayoutAwareModifierNode) == true) goto L25;
        NodeCoordinator this_$iv3 = this_$iv2;
        int r25 = r9;
        Modifier.Node this_$iv$iv$iv = r2;
        int r10 = this_$iv$iv$iv.getKindSet$ui_release() & type$iv;     // Catch: Throwable -> L72
        int r3 = 1;
        if (r10 == 0) goto L29;
        int r8 = 1;
    L30:
        if (r8 == 0) goto L61;
        if ((r2 instanceof DelegatingNode) == false) goto L61;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r2;     // Catch: Throwable -> L72
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();     // Catch: Throwable -> L72
    L34:
        if (node$iv$iv$iv == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L38;
        int r29 = r3;
    L39:
        if (r29 == 0) goto L56;
        count$iv$iv = count$iv$iv + 1;     // Catch: Throwable -> L72
        if (count$iv$iv != r3) goto L43;
        r2 = next$iv$iv;
        goto L56
    L43:
        if (r20 != null) goto L45;
        MutableVector r4 = new MutableVector(new Modifier.Node[16], 0);     // Catch: Throwable -> L72
    L46:
        Modifier.Node theNode$iv$iv = r2;
        if (theNode$iv$iv == null) goto L51;
        if (r4 == null) goto L50;
        r4.add(theNode$iv$iv);     // Catch: Throwable -> L72
    L50:
        r2 = null;
    L51:
        if (r4 == null) goto L54;
        r4.add(next$iv$iv);     // Catch: Throwable -> L72
    L54:
        r20 = r4;
        r2 = r2;
        goto L56
    L45:
        r4 = r20;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();     // Catch: Throwable -> L72
        r3 = 1;
        goto L34
    L38:
        r29 = 0;
        goto L39
    L57:
        Modifier.Node r32 = r2;
        if (count$iv$iv != 1) goto L61;
        this_$iv2 = this_$iv3;
        r9 = r25;
        r2 = r32;
    L61:
        r2 = DelegatableNodeKt.access$pop(r20);     // Catch: Throwable -> L72
        this_$iv2 = this_$iv3;
        r9 = r25;
        goto L22
    L29:
        r8 = 0;
        goto L30
    L25:
        LayoutAwareModifierNode it = (LayoutAwareModifierNode) r2;     // Catch: Throwable -> L72
        this_$iv3 = this_$iv2;
        r25 = r9;
        it.mo364onRemeasuredozmzZPI(this.m5773getMeasuredSizeYbymL2g());     // Catch: Throwable -> L72
        goto L61
    L62:
        int type$iv2 = type$iv;
        NodeCoordinator this_$iv4 = this_$iv2;
        int r26 = r9;
    L65:
        if (node$iv$iv == stopNode$iv$iv) goto L70;
        node$iv$iv = node$iv$iv.getChild$ui_release();     // Catch: Throwable -> L72
        this = this;
        r1 = r1;
        type$iv = type$iv2;
        this_$iv2 = this_$iv4;
        r9 = r26;
        goto L16
    L63:
        type$iv2 = type$iv;
        this_$iv4 = this_$iv2;
        r26 = r9;
    L70:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L72
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r6);
        return;
    L12:
        stopNode$iv$iv = this_$iv2.getTail().getParent$ui_release();     // Catch: Throwable -> L72
        if (stopNode$iv$iv != null) goto L15;
    L72:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r6);
        throw th;
    L7:
        r0 = null;
        goto L8
    }

    public final void onUnplaced() {
        if (m5946hasNodeH91voCI(NodeKind.m5976constructorimpl(1048576)) == false) goto L66;
        int type$iv = NodeKind.m5976constructorimpl(1048576);
        NodeCoordinator this_$iv = this;
        int r3 = 0;
        boolean includeTail$iv$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type$iv);
        Modifier.Node stopNode$iv$iv = this_$iv.getTail();
        if (includeTail$iv$iv == true) goto L10;
        stopNode$iv$iv = stopNode$iv$iv.getParent$ui_release();
        if (stopNode$iv$iv != null) goto L10;
        return;
    L10:
        Modifier.Node node$iv$iv = access$headNode(this_$iv, includeTail$iv$iv);
    L11:
        if (node$iv$iv == null) goto L85;
        if ((node$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L84;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L58;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L17:
        if (r15 == null) goto L57;
        type$iv = type$iv;
        if ((r15 instanceof OnUnplacedModifierNode) == true) goto L20;
        Modifier.Node this_$iv$iv$iv = r15;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L24;
        int r17 = 1;
    L25:
        if (r17 == 0) goto L55;
        if ((r15 instanceof DelegatingNode) == false) goto L55;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L29:
        if (node$iv$iv$iv == null) goto L52;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L33;
        boolean r23 = true;
    L34:
        if (r23 == false) goto L50;
        count$iv$iv = count$iv$iv + 1;
        NodeCoordinator this_$iv2 = this_$iv;
        if (count$iv$iv != 1) goto L38;
        r15 = next$iv$iv;
        r3 = r3;
    L51:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv2;
        r3 = r3;
        goto L29
    L38:
        if (r14 != null) goto L40;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L41:
        r14 = r1;
        Modifier.Node theNode$iv$iv = r15;
        if (theNode$iv$iv == null) goto L46;
        if (r14 == null) goto L45;
        r14.add(theNode$iv$iv);
    L45:
        r15 = null;
    L46:
        if (r14 == null) goto L49;
        r14.add(next$iv$iv);
    L49:
        count$iv$iv = count$iv$iv;
        goto L51
    L40:
        r1 = r14;
        goto L41
    L50:
        this_$iv2 = this_$iv;
        r3 = r3;
        goto L51
    L33:
        r23 = false;
        goto L34
    L52:
        NodeCoordinator this_$iv3 = this_$iv;
        int r27 = r3;
        if (count$iv$iv != 1) goto L56;
        this_$iv = this_$iv3;
        r3 = r27;
    L56:
        r15 = DelegatableNodeKt.access$pop(r14);
        this_$iv = this_$iv3;
        r3 = r27;
    L55:
        this_$iv3 = this_$iv;
        r27 = r3;
        goto L56
    L24:
        r17 = 0;
        goto L25
    L20:
        OnUnplacedModifierNode it = (OnUnplacedModifierNode) r15;
        it.onUnplaced();
        this_$iv3 = this_$iv;
        r27 = r3;
        goto L56
    L57:
        int type$iv2 = type$iv;
        NodeCoordinator this_$iv4 = this_$iv;
        int r28 = r3;
    L60:
        if (node$iv$iv == stopNode$iv$iv) goto L86;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        this_$iv = this_$iv4;
        r3 = r28;
        goto L11
    L86:
        return;
    L58:
        type$iv2 = type$iv;
        this_$iv4 = this_$iv;
        r28 = r3;
        goto L60
    L84:
        return;
    L85:
        return;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5715placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r10) {
        if (this.forcePlaceWithLookaheadOffset == false) goto L5;
        LookaheadDelegate r1 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        m5952placeSelfMLgxB_4(r1.mo5909getPositionnOccac(), zIndex, r10, null);
        return;
    L5:
        m5952placeSelfMLgxB_4(position, zIndex, r10, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5775placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        if (this.forcePlaceWithLookaheadOffset == false) goto L5;
        LookaheadDelegate r1 = getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        m5952placeSelfMLgxB_4(r1.mo5909getPositionnOccac(), zIndex, null, layer);
        return;
    L5:
        m5952placeSelfMLgxB_4(position, zIndex, null, layer);
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m5952placeSelfMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r13, GraphicsLayer explicitLayer) {
        if (explicitLayer == null) goto L18;
        if (r13 != null) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
    L12:
        if (this.explicitLayer == explicitLayer) goto L15;
        this.explicitLayer = null;
        updateLayerBlock$default(this, null, false, 2, null);
        this.explicitLayer = explicitLayer;
    L15:
        if (this.layer != null) goto L22;
        OwnedLayer $this$placeSelf_MLgxB_4_u24lambda_u2415 = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, explicitLayer, false, 8, null);
        $this$placeSelf_MLgxB_4_u24lambda_u2415.mo6032resizeozmzZPI(m5773getMeasuredSizeYbymL2g());
        $this$placeSelf_MLgxB_4_u24lambda_u2415.mo6031movegyyYBs(position);
        this.layer = $this$placeSelf_MLgxB_4_u24lambda_u2415;
        getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    L22:
        if (IntOffset.m7100equalsimpl0(mo5909getPositionnOccac(), position) == true) goto L32;
        m5967setPositiongyyYBs(position);
        getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
        OwnedLayer layer = this.layer;
        if (layer == null) goto L26;
        layer.mo6031movegyyYBs(position);
    L29:
        invalidateAlignmentLinesFromPositionChange(this);
        Owner r2 = getLayoutNode().getOwner$ui_release();
        if (r2 == null) goto L32;
        r2.onLayoutChange(getLayoutNode());
        goto L32
    L26:
        NodeCoordinator r3 = this.wrappedBy;
        if (r3 == null) goto L29;
        r3.invalidateLayer();
    L32:
        this.zIndex = zIndex;
        if (isPlacingForAlignment$ui_release() == true) goto L36;
        captureRulers$ui_release(getMeasureResult$ui_release());
        return;
    L36:
        return;
    L7:
        value$iv = false;
        goto L9
    L18:
        if (this.explicitLayer == null) goto L20;
        this.explicitLayer = null;
        updateLayerBlock$default(this, null, false, 2, null);
    L20:
        updateLayerBlock$default(this, r13, false, 2, null);
        goto L22
    }

    public final void releaseLayer() {
        if (this.layer != null) goto L5;
        return;
    L5:
        if (this.explicitLayer == null) goto L7;
        this.explicitLayer = null;
    L7:
        updateLayerBlock$default(this, null, false, 2, null);
        LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m5966placeSelfApparentToRealOffsetMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r12, GraphicsLayer layer) {
        m5952placeSelfMLgxB_4(IntOffset.m7105plusqkQi6aY(position, m5772getApparentToRealOffsetnOccac()), zIndex, r12, layer);
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer layer = this.layer;
        if (layer == null) goto L5;
        layer.drawLayer(canvas, graphicsLayer);
        return;
    L5:
        float x = IntOffset.m7101getXimpl(mo5909getPositionnOccac());
        float y = IntOffset.m7102getYimpl(mo5909getPositionnOccac());
        canvas.translate(x, y);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-x, -y);
    }

    private final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node head = m5962headH91voCI(NodeKind.m5976constructorimpl(4));
        if (head != null) goto L5;
        performDraw(canvas, graphicsLayer);
        return;
    L5:
        LayoutNodeDrawScope drawScope = getLayoutNode().getMDrawScope$ui_release();
        drawScope.m5904draweZhPAX0$ui_release(canvas, IntSizeKt.m7156toSizeozmzZPI(mo5722getSizeYbymL2g()), this, head, graphicsLayer);
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator r0 = this.wrapped;
        if (r0 == null) goto L6;
        r0.draw(canvas, graphicsLayer);
        return;
    }

    public final void onPlaced() {
        int type$iv = NodeKind.m5976constructorimpl(128);
        NodeCoordinator this_$iv = this;
        int r2 = 0;
        boolean includeTail$iv$iv = NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(type$iv);
        Modifier.Node stopNode$iv$iv = this_$iv.getTail();
        if (includeTail$iv$iv == true) goto L8;
        stopNode$iv$iv = stopNode$iv$iv.getParent$ui_release();
        if (stopNode$iv$iv != null) goto L8;
        return;
    L8:
        Modifier.Node node$iv$iv = access$headNode(this_$iv, includeTail$iv$iv);
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
        int type$iv2 = type$iv;
        Modifier.Node this_$iv$iv$iv = r14;
        int r16 = this_$iv$iv$iv.getKindSet$ui_release() & type$iv2;
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
        if ((next$iv$iv.getKindSet$ui_release() & type$iv2) == 0) goto L31;
        int r22 = r0;
    L32:
        if (r22 == 0) goto L47;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r0) goto L36;
        r14 = next$iv$iv;
        this_$iv = this_$iv;
        r2 = r2;
    L48:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv = this_$iv;
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
        this_$iv = this_$iv;
        r2 = r2;
        goto L48
    L31:
        r22 = 0;
        goto L32
    L49:
        NodeCoordinator this_$iv2 = this_$iv;
        int r26 = r2;
        if (count$iv$iv != 1) goto L53;
        type$iv = type$iv2;
        this_$iv = this_$iv2;
        r2 = r26;
    L53:
        r14 = DelegatableNodeKt.access$pop(r13);
        type$iv = type$iv2;
        this_$iv = this_$iv2;
        r2 = r26;
    L52:
        this_$iv2 = this_$iv;
        r26 = r2;
        goto L53
    L22:
        r15 = 0;
        goto L23
    L18:
        LayoutAwareModifierNode it = (LayoutAwareModifierNode) r14;
        type$iv2 = type$iv;
        it.onPlaced(this);
        this_$iv2 = this_$iv;
        r26 = r2;
        goto L53
    L54:
        int type$iv3 = type$iv;
        NodeCoordinator this_$iv3 = this_$iv;
        int r27 = r2;
    L57:
        if (node$iv$iv == stopNode$iv$iv) goto L83;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        type$iv = type$iv3;
        this_$iv = this_$iv3;
        r2 = r27;
        goto L9
    L83:
        return;
    L55:
        type$iv3 = type$iv;
        this_$iv3 = this_$iv;
        r27 = r2;
        goto L57
    L81:
        return;
    }

    private final Function2<Canvas, GraphicsLayer, Unit> getDrawBlock() {
        Function2 block = this._drawBlock;
        if (block != null) goto L6;
        final Function0<Unit> r1 = new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this);
        Function2<Canvas, GraphicsLayer, Unit> r0 = new NodeCoordinator$drawBlock$1(this, r1);
        this._drawBlock = r0;
        return r0;
    L6:
        return block;
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator r0, Function1 r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        r0.updateLayerBlock(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> r14, boolean forceUpdateLayerParameters) {
        if (r14 != null) goto L5;
    L8:
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
    L12:
        LayoutNode layoutNode = getLayoutNode();
        if (forceUpdateLayerParameters == false) goto L15;
    L22:
        boolean updateParameters = true;
    L23:
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() == false) goto L33;
        if (r14 == null) goto L33;
        this.layerBlock = r14;
        if (this.layer != null) goto L29;
        OwnedLayer $this$updateLayerBlock_u24lambda_u2418 = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        $this$updateLayerBlock_u24lambda_u2418.mo6032resizeozmzZPI(m5773getMeasuredSizeYbymL2g());
        $this$updateLayerBlock_u24lambda_u2418.mo6031movegyyYBs(mo5909getPositionnOccac());
        this.layer = $this$updateLayerBlock_u24lambda_u2418;
        updateLayerParameters$default(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
        return;
    L29:
        if (updateParameters == false) goto L46;
        boolean positionalPropertiesChanged = updateLayerParameters$default(this, false, 1, null);
        if (positionalPropertiesChanged == false) goto L47;
        LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
        return;
    L47:
        return;
    L46:
        return;
    L33:
        this.layerBlock = null;
        OwnedLayer it = this.layer;
        if (it == null) goto L43;
        it.destroy();
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
        if (isAttached() == false) goto L43;
        if (layoutNode.isPlaced() == false) goto L43;
        Owner r1 = layoutNode.getOwner$ui_release();
        if (r1 == null) goto L43;
        r1.onLayoutChange(layoutNode);
    L43:
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
        return;
    L15:
        if (this.layerBlock != r14) goto L22;
        if (Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) == false) goto L22;
        if (this.layerLayoutDirection != layoutNode.getLayoutDirection()) goto L22;
        updateParameters = false;
        goto L23
    L5:
        if (this.explicitLayer == null) goto L8;
        value$iv = false;
        goto L10
    }

    static /* synthetic */ boolean updateLayerParameters$default(NodeCoordinator r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = true;
    L7:
        return r0.updateLayerParameters(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    private final boolean updateLayerParameters(boolean invokeOnLayoutChange) {
        if (this.explicitLayer == null) goto L5;
        return false;
    L5:
        OwnedLayer layer = this.layer;
        boolean value$iv = true;
        if (layer == null) goto L24;
        final Function1<? super GraphicsLayerScope, Unit> r1 = this.layerBlock;
        if (r1 == null) goto L21;
        graphicsLayerScope.reset();
        graphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        graphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
        graphicsLayerScope.m4678setSizeuvyYCjk(IntSizeKt.m7156toSizeozmzZPI(mo5722getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new AnonymousClass1(r1));
        LayerPositionalProperties it = this.layerPositionalProperties;
        if (it != null) goto L12;
        it = new LayerPositionalProperties();
        this.layerPositionalProperties = it;
    L12:
        tmpLayerPositionalProperties.copyFrom(it);
        it.copyFrom(graphicsLayerScope);
        layer.updateLayerProperties(graphicsLayerScope);
        boolean wasClipping = this.isClipping;
        this.isClipping = graphicsLayerScope.getClip();
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        boolean positionalPropertiesChanged = true ^ tmpLayerPositionalProperties.hasSameValuesAs(it);
        if (invokeOnLayoutChange == false) goto L20;
        if (positionalPropertiesChanged == false) goto L16;
    L17:
        Owner r5 = getLayoutNode().getOwner$ui_release();
        if (r5 == null) goto L20;
        r5.onLayoutChange(getLayoutNode());
        goto L20
    L16:
        if (wasClipping != this.isClipping) goto L17;
    L20:
        return positionalPropertiesChanged;
    L21:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
        throw new KotlinNothingValueException();
    L24:
        if (this.layerBlock == null) goto L28;
        value$iv = false;
    L28:
        if (value$iv == true) goto L31;
        InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
    L31:
        return false;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        if (this.layer != null) goto L5;
    L9:
        return false;
    L5:
        if (this.released == true) goto L9;
        if (getLayoutNode().isAttached() == false) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m5961getMinimumTouchTargetSizeNHjbRc() {
        Density $this$getMinimumTouchTargetSize_NH_jbRc_u24lambda_u2423 = this.layerDensity;
        return $this$getMinimumTouchTargetSize_NH_jbRc_u24lambda_u2423.mo377toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo5898getMinimumTouchTargetSizeMYxV2XQ());
    }

    public final void onAttach() {
        if (this.layer == null) goto L5;
        return;
    L5:
        if (this.layerBlock == null) goto L9;
        OwnedLayer $this$onAttach_u24lambda_u2424 = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        $this$onAttach_u24lambda_u2424.mo6032resizeozmzZPI(m5773getMeasuredSizeYbymL2g());
        $this$onAttach_u24lambda_u2424.mo6031movegyyYBs(mo5909getPositionnOccac());
        $this$onAttach_u24lambda_u2424.invalidate();
        this.layer = $this$onAttach_u24lambda_u2424;
        return;
    }

    public final void onDetach() {
        OwnedLayer r0 = this.layer;
        if (r0 == null) goto L5;
        r0.destroy();
    L5:
        this.layer = null;
    }

    /* JADX INFO: renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m5963hitTestqzLsGqo(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        Modifier.Node head = m5962headH91voCI(hitTestSource.mo5972entityTypeOLwlOKw());
        boolean r8 = true;
        boolean isHitInMinimumTouchTargetBetter = false;
        if (m5970withinLayerBoundsk4lQ0M(pointerPosition) == false) goto L5;
        if (head != null) goto L19;
        mo5880hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L19:
        if (m5964isPointerInBoundsk4lQ0M(pointerPosition) == false) goto L22;
        m5947hit5ShdDok(head, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L22:
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5667getTouchT8wyACA()) == true) goto L24;
        float distanceFromEdge = Float.POSITIVE_INFINITY;
    L25:
        float $this$fastIsFinite$iv = distanceFromEdge;
        if ((Integer.MAX_VALUE & Float.floatToRawIntBits($this$fastIsFinite$iv)) >= 2139095040) goto L28;
        boolean r2 = true;
    L29:
        if (r2 == false) goto L33;
        boolean r7 = isInLayer;
        if (hitTestResult.isHitInMinimumTouchTargetBetter(distanceFromEdge, r7) == false) goto L35;
        isHitInMinimumTouchTargetBetter = true;
    L35:
        m5951outOfBoundsHit8NAm7pk(head, hitTestSource, pointerPosition, hitTestResult, pointerType, r7, distanceFromEdge, isHitInMinimumTouchTargetBetter);
        return;
    L33:
        r7 = isInLayer;
        goto L35
    L28:
        r2 = false;
        goto L29
    L24:
        distanceFromEdge = m5958distanceInMinimumTouchTargettz77jQw(pointerPosition, m5961getMinimumTouchTargetSizeNHjbRc());
        goto L25
    L5:
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5667getTouchT8wyACA()) == false) goto L37;
        float distanceFromEdge2 = m5958distanceInMinimumTouchTargettz77jQw(pointerPosition, m5961getMinimumTouchTargetSizeNHjbRc());
        if ((Integer.MAX_VALUE & Float.floatToRawIntBits(distanceFromEdge2)) < 2139095040) goto L10;
        r8 = false;
    L10:
        if (r8 == false) goto L40;
        if (hitTestResult.isHitInMinimumTouchTargetBetter(distanceFromEdge2, false) == false) goto L39;
        m5948hitNearFh5PU_I(head, hitTestSource, pointerPosition, hitTestResult, pointerType, false, distanceFromEdge2);
        return;
    L39:
        return;
    L40:
        return;
    }

    /* JADX INFO: renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m5947hit5ShdDok(Modifier.Node $this$hit_u2d5ShdDok, HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        if ($this$hit_u2d5ShdDok != null) goto L5;
        mo5880hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L5:
        int startDepth$iv$iv$iv = HitTestResult.access$getHitDepth$p(hitTestResult);
        HitTestResult.access$removeNodesInRange(hitTestResult, HitTestResult.access$getHitDepth$p(hitTestResult) + 1, hitTestResult.size());
        HitTestResult.access$setHitDepth$p(hitTestResult, HitTestResult.access$getHitDepth$p(hitTestResult) + 1);
        HitTestResult.access$getValues$p(hitTestResult).add($this$hit_u2d5ShdDok);
        HitTestResult.access$getDistanceFromEdgeAndFlags$p(hitTestResult).add(HitTestResultKt.access$DistanceAndFlags(-1.0f, isInLayer, false));
        m5947hit5ShdDok(NodeCoordinatorKt.m5973access$nextUntilhw7D004($this$hit_u2d5ShdDok, hitTestSource.mo5972entityTypeOLwlOKw(), NodeKind.m5976constructorimpl(2)), hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        HitTestResult.access$setHitDepth$p(hitTestResult, startDepth$iv$iv$iv);
    }

    /* JADX INFO: renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    private final void m5951outOfBoundsHit8NAm7pk(final Modifier.Node $this$outOfBoundsHit_u2d8NAm7pk, final HitTestSource hitTestSource, final long pointerPosition, final HitTestResult hitTestResult, final int pointerType, final boolean isInLayer, final float distanceFromEdge, final boolean isHitInMinimumTouchTargetBetter) {
        if ($this$outOfBoundsHit_u2d8NAm7pk != null) goto L5;
        mo5880hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L5:
        if (m5949isInExpandedTouchBoundsThDn1k($this$outOfBoundsHit_u2d8NAm7pk, pointerPosition, pointerType) == false) goto L8;
        hitTestResult.hitExpandedTouchBounds($this$outOfBoundsHit_u2d8NAm7pk, isInLayer, new NodeCoordinator$outOfBoundsHit$1(this, $this$outOfBoundsHit_u2d8NAm7pk, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge, isHitInMinimumTouchTargetBetter));
        return;
    L8:
        if (isHitInMinimumTouchTargetBetter == false) goto L10;
        m5948hitNearFh5PU_I($this$outOfBoundsHit_u2d8NAm7pk, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge);
        return;
    L10:
        m5953speculativeHitFh5PU_I($this$outOfBoundsHit_u2d8NAm7pk, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge);
    }

    /* JADX INFO: renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m5948hitNearFh5PU_I(Modifier.Node $this$hitNear_u2dFh5PU_I, HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer, float distanceFromEdge) {
        if ($this$hitNear_u2dFh5PU_I != null) goto L5;
        mo5880hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L5:
        int startDepth$iv$iv = HitTestResult.access$getHitDepth$p(hitTestResult);
        HitTestResult.access$removeNodesInRange(hitTestResult, HitTestResult.access$getHitDepth$p(hitTestResult) + 1, hitTestResult.size());
        HitTestResult.access$setHitDepth$p(hitTestResult, HitTestResult.access$getHitDepth$p(hitTestResult) + 1);
        HitTestResult.access$getValues$p(hitTestResult).add($this$hitNear_u2dFh5PU_I);
        HitTestResult.access$getDistanceFromEdgeAndFlags$p(hitTestResult).add(HitTestResultKt.access$DistanceAndFlags(distanceFromEdge, isInLayer, false));
        m5951outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5973access$nextUntilhw7D004($this$hitNear_u2dFh5PU_I, hitTestSource.mo5972entityTypeOLwlOKw(), NodeKind.m5976constructorimpl(2)), hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge, true);
        HitTestResult.access$setHitDepth$p(hitTestResult, startDepth$iv$iv);
    }

    /* JADX INFO: renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m5953speculativeHitFh5PU_I(final Modifier.Node $this$speculativeHit_u2dFh5PU_I, final HitTestSource hitTestSource, final long pointerPosition, final HitTestResult hitTestResult, final int pointerType, final boolean isInLayer, final float distanceFromEdge) {
        if ($this$speculativeHit_u2dFh5PU_I != null) goto L5;
        mo5880hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
        return;
    L5:
        if (hitTestSource.interceptOutOfBoundsChildEvents($this$speculativeHit_u2dFh5PU_I) == false) goto L7;
        hitTestResult.speculativeHit($this$speculativeHit_u2dFh5PU_I, distanceFromEdge, isInLayer, new NodeCoordinator$speculativeHit$1(this, $this$speculativeHit_u2dFh5PU_I, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge));
        return;
    L7:
        m5951outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5973access$nextUntilhw7D004($this$speculativeHit_u2dFh5PU_I, hitTestSource.mo5972entityTypeOLwlOKw(), NodeKind.m5976constructorimpl(2)), hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer, distanceFromEdge, false);
    }

    /* JADX INFO: renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m5949isInExpandedTouchBoundsThDn1k(Modifier.Node $this$isInExpandedTouchBounds_u2dThD_u2dn1k, long pointerPosition, int pointerType) {
        if ($this$isInExpandedTouchBounds_u2dThD_u2dn1k != null) goto L6;
        return false;
    L6:
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5666getStylusT8wyACA()) == false) goto L8;
    L10:
        int kind$iv = NodeKind.m5976constructorimpl(16);
        MutableVector r5 = null;
        Modifier.Node r6 = $this$isInExpandedTouchBounds_u2dThD_u2dn1k;
    L11:
        if (r6 == null) goto L57;
        int r8 = 1;
        if ((r6 instanceof PointerInputModifierNode) == true) goto L14;
        kind$iv = kind$iv;
        Modifier.Node this_$iv$iv = r6;
        if ((this_$iv$iv.getKindSet$ui_release() & kind$iv) == 0) goto L28;
        boolean r1 = true;
    L29:
        if (r1 == false) goto L56;
        if ((r6 instanceof DelegatingNode) == false) goto L56;
        int count$iv = 0;
        DelegatingNode this_$iv$iv2 = (DelegatingNode) r6;
        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate$ui_release();
    L33:
        if (node$iv$iv == null) goto L54;
        Modifier.Node next$iv = node$iv$iv;
        if ((next$iv.getKindSet$ui_release() & kind$iv) == 0) goto L37;
        int r12 = r8;
    L38:
        if (r12 == 0) goto L52;
        count$iv = count$iv + 1;
        if (count$iv != r8) goto L42;
        r6 = next$iv;
        goto L52
    L42:
        if (r5 != null) goto L44;
        MutableVector r15 = new MutableVector(new Modifier.Node[16], 0);
    L45:
        r5 = r15;
        Modifier.Node theNode$iv = r6;
        if (theNode$iv == null) goto L50;
        if (r5 == null) goto L49;
        r5.add(theNode$iv);
    L49:
        r6 = null;
    L50:
        if (r5 == null) goto L52;
        r5.add(next$iv);
        goto L52
    L44:
        r15 = r5;
    L52:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r8 = 1;
        goto L33
    L37:
        r12 = 0;
        goto L38
    L54:
        if (count$iv == 1) goto L11;
    L56:
        r6 = DelegatableNodeKt.access$pop(r5);
        goto L11
    L28:
        r1 = false;
        goto L29
    L14:
        PointerInputModifierNode it = (PointerInputModifierNode) r6;
        long expansion = it.mo1174getTouchBoundsExpansionRZrCHBk();
        int bits$iv$iv$iv = (int) (pointerPosition >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) < (-TouchBoundsExpansion.m6056computeLeftimpl$ui_release(expansion, getLayoutDirection()))) goto L23;
        int bits$iv$iv$iv2 = (int) (pointerPosition >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) >= (getMeasuredWidth() + TouchBoundsExpansion.m6057computeRightimpl$ui_release(expansion, getLayoutDirection()))) goto L23;
        int bits$iv$iv$iv3 = (int) (pointerPosition & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) < (-TouchBoundsExpansion.m6064getTopimpl(expansion))) goto L23;
        int bits$iv$iv$iv4 = (int) (pointerPosition & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) >= (getMeasuredHeight() + TouchBoundsExpansion.m6061getBottomimpl(expansion))) goto L23;
        return true;
    L23:
        return false;
    L57:
        return false;
    L8:
        if (PointerType.m5660equalsimpl0(pointerType, PointerType.Companion.m5664getEraserT8wyACA()) == true) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: hitTestChild-qzLsGqo */
    public void mo5880hitTestChildqzLsGqo(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator wrapped = this.wrapped;
        if (wrapped == null) goto L6;
        long positionInWrapped = m5945fromParentPosition8S9VItk$default(wrapped, pointerPosition, false, 2, null);
        wrapped.m5963hitTestqzLsGqo(hitTestSource, positionInWrapped, hitTestResult, pointerType, isInLayer);
        return;
    }

    public final Rect touchBoundsInRoot() {
        if (isAttached() == false) goto L5;
        LayoutCoordinates root = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect bounds = getRectCache();
        long padding = m5957calculateMinimumTouchTargetPaddingE7KxVPU(m5961getMinimumTouchTargetSizeNHjbRc());
        int bits$iv$iv$iv = (int) (padding >> 32);
        bounds.setLeft(-Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (padding & 4294967295L);
        bounds.setTop(-Float.intBitsToFloat(bits$iv$iv$iv2));
        int bits$iv$iv$iv3 = (int) (padding >> 32);
        bounds.setRight(getMeasuredWidth() + Float.intBitsToFloat(bits$iv$iv$iv3));
        int bits$iv$iv$iv4 = (int) (4294967295L & padding);
        bounds.setBottom(getMeasuredHeight() + Float.intBitsToFloat(bits$iv$iv$iv4));
        NodeCoordinator coordinator = this;
    L7:
        if (coordinator == root) goto L14;
        coordinator.rectInParent$ui_release(bounds, false, true);
        if (bounds.isEmpty() == true) goto L11;
        NodeCoordinator r5 = coordinator.wrappedBy;
        Intrinsics.checkNotNull(r5);
        coordinator = r5;
        goto L7
    L11:
        return Rect.Companion.getZero();
    L14:
        return MutableRectKt.toRect(bounds);
    L5:
        return Rect.Companion.getZero();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5728screenToLocalMKHz9U(long relativeToScreen) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        long positionInRoot = owner.mo5670screenToLocalMKHz9U(relativeToScreen);
        LayoutCoordinates root = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo5723localPositionOfR5De75A(root, positionInRoot);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5726localToScreenMKHz9U(long relativeToLocal) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        long positionInRoot = mo5725localToRootMKHz9U(relativeToLocal);
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        return owner.mo5669localToScreenMKHz9U(positionInRoot);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo5731windowToLocalMKHz9U(long relativeToWindow) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        LayoutCoordinates root = LayoutCoordinatesKt.findRootCoordinates(this);
        long positionInRoot = Offset.m4129minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo6034calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(root));
        return mo5723localPositionOfR5De75A(root, positionInRoot);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo5727localToWindowMKHz9U(long relativeToLocal) {
        long positionInRoot = mo5725localToRootMKHz9U(relativeToLocal);
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        return owner.mo6035calculatePositionInWindowMKHz9U(positionInRoot);
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates $this$toCoordinator) {
        if (($this$toCoordinator instanceof LookaheadLayoutCoordinates) == false) goto L5;
        LookaheadLayoutCoordinates r0 = (LookaheadLayoutCoordinates) $this$toCoordinator;
    L6:
        if (r0 == null) goto L9;
        NodeCoordinator r1 = r0.getCoordinator();
        if (r1 == null) goto L9;
        return r1;
    L9:
        Intrinsics.checkNotNull($this$toCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) $this$toCoordinator;
    L5:
        r0 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo5723localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo5724localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo5724localPositionOfS_NoaFU(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if ((sourceCoordinates instanceof LookaheadLayoutCoordinates) == false) goto L6;
        ((LookaheadLayoutCoordinates) sourceCoordinates).getCoordinator().onCoordinatesUsed$ui_release();
        long arg0$iv = sourceCoordinates.mo5724localPositionOfS_NoaFU(this, Offset.m4117constructorimpl(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference);
        return Offset.m4117constructorimpl((-9223372034707292160L) ^ arg0$iv);
    L6:
        NodeCoordinator nodeCoordinator = toCoordinator(sourceCoordinates);
        nodeCoordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator commonAncestor = findCommonAncestor$ui_release(nodeCoordinator);
        long position = relativeToSource;
        NodeCoordinator coordinator = nodeCoordinator;
    L7:
        if (coordinator == commonAncestor) goto L10;
        position = coordinator.m5968toParentPosition8S9VItk(position, includeMotionFrameOfReference);
        NodeCoordinator r5 = coordinator.wrappedBy;
        Intrinsics.checkNotNull(r5);
        coordinator = r5;
        goto L7
    L10:
        return m5944ancestorToLocalS_NoaFU(commonAncestor, position, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo5729transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator commonAncestor = findCommonAncestor$ui_release(coordinator);
        Matrix.m4605resetimpl(matrix);
        coordinator.m5956transformToAncestorEL8BTi8(commonAncestor, matrix);
        m5955transformFromAncestorEL8BTi8(commonAncestor, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo5730transformToScreen58bKbWc(float[] matrix) {
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator rootCoordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m5956transformToAncestorEL8BTi8(rootCoordinator, matrix);
        if ((owner instanceof MatrixPositionCalculator) == false) goto L5;
        ((MatrixPositionCalculator) owner).mo5518localToScreen58bKbWc(matrix);
        return;
    L5:
        long screenPosition = LayoutCoordinatesKt.positionOnScreen(rootCoordinator);
        if ((9223372034707292159L & screenPosition) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) goto L8;
        boolean r7 = true;
    L9:
        if (r7 == false) goto L13;
        int bits$iv$iv$iv = (int) (screenPosition >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & screenPosition);
        Matrix.m4617translateimpl(matrix, Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), 0.0f);
        return;
    L13:
        return;
    L8:
        r7 = false;
        goto L9
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m5956transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator wrapper = this;
    L4:
        if (Intrinsics.areEqual(wrapper, ancestor) == true) goto L12;
        OwnedLayer r1 = wrapper.layer;
        if (r1 == null) goto L8;
        r1.mo6033transform58bKbWc(matrix);
    L8:
        long position = wrapper.mo5909getPositionnOccac();
        if (IntOffset.m7100equalsimpl0(position, IntOffset.Companion.m7112getZeronOccac()) == true) goto L11;
        Matrix.m4605resetimpl(tmpMatrix);
        Matrix.m4618translateimpl$default(tmpMatrix, IntOffset.m7101getXimpl(position), IntOffset.m7102getYimpl(position), 0.0f, 4, null);
        Matrix.m4615timesAssign58bKbWc(matrix, tmpMatrix);
    L11:
        NodeCoordinator r3 = wrapper.wrappedBy;
        Intrinsics.checkNotNull(r3);
        wrapper = r3;
        goto L4
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m5955transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.areEqual(ancestor, this) == true) goto L11;
        NodeCoordinator r0 = this.wrappedBy;
        Intrinsics.checkNotNull(r0);
        r0.m5955transformFromAncestorEL8BTi8(ancestor, matrix);
        if (IntOffset.m7100equalsimpl0(mo5909getPositionnOccac(), IntOffset.Companion.m7112getZeronOccac()) == true) goto L7;
        Matrix.m4605resetimpl(tmpMatrix);
        Matrix.m4618translateimpl$default(tmpMatrix, -IntOffset.m7101getXimpl(mo5909getPositionnOccac()), -IntOffset.m7102getYimpl(mo5909getPositionnOccac()), 0.0f, 4, null);
        Matrix.m4615timesAssign58bKbWc(matrix, tmpMatrix);
    L7:
        OwnedLayer r1 = this.layer;
        if (r1 == null) goto L12;
        r1.mo6028inverseTransform58bKbWc(matrix);
        return;
    L12:
        return;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        boolean value$iv2 = sourceCoordinates.isAttached();
        if (value$iv2 == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + sourceCoordinates + " is not attached!");
    L8:
        NodeCoordinator srcCoordinator = toCoordinator(sourceCoordinates);
        srcCoordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator commonAncestor = findCommonAncestor$ui_release(srcCoordinator);
        MutableRect bounds = getRectCache();
        bounds.setLeft(0.0f);
        bounds.setTop(0.0f);
        long arg0$iv = sourceCoordinates.mo5722getSizeYbymL2g();
        bounds.setRight((int) (arg0$iv >> 32));
        long arg0$iv2 = sourceCoordinates.mo5722getSizeYbymL2g();
        bounds.setBottom((int) (4294967295L & arg0$iv2));
        NodeCoordinator coordinator = srcCoordinator;
    L9:
        if (coordinator == commonAncestor) goto L15;
        boolean clipBounds2 = clipBounds;
        rectInParent$ui_release$default(coordinator, bounds, clipBounds2, false, 4, null);
        if (bounds.isEmpty() == true) goto L13;
        NodeCoordinator r13 = coordinator.wrappedBy;
        Intrinsics.checkNotNull(r13);
        coordinator = r13;
        clipBounds = clipBounds2;
        goto L9
    L13:
        return Rect.Companion.getZero();
    L15:
        ancestorToLocal(commonAncestor, bounds, clipBounds);
        return MutableRectKt.toRect(bounds);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m5944ancestorToLocalS_NoaFU(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor != this) goto L4;
        return offset;
    L4:
        NodeCoordinator wrappedBy = this.wrappedBy;
        if (wrappedBy == null) goto L12;
        if (Intrinsics.areEqual(ancestor, wrappedBy) == true) goto L12;
        return m5959fromParentPosition8S9VItk(wrappedBy.m5944ancestorToLocalS_NoaFU(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    L12:
        return m5959fromParentPosition8S9VItk(offset, includeMotionFrameOfReference);
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor != this) goto L4;
        return;
    L4:
        NodeCoordinator r0 = this.wrappedBy;
        if (r0 == null) goto L7;
        r0.ancestorToLocal(ancestor, rect, clipBounds);
    L7:
        fromParentRect(rect, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo5725localToRootMKHz9U(long relativeToLocal) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
    L5:
        onCoordinatesUsed$ui_release();
        NodeCoordinator coordinator = this;
        long position = relativeToLocal;
    L6:
        if (coordinator == null) goto L8;
        position = m5954toParentPosition8S9VItk$default(coordinator, position, false, 2, null);
        coordinator = coordinator.wrappedBy;
        goto L6
    L8:
        return position;
    }

    protected final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, Unit> r7) {
        float x = IntOffset.m7101getXimpl(mo5909getPositionnOccac());
        float y = IntOffset.m7102getYimpl(mo5909getPositionnOccac());
        canvas.translate(x, y);
        r7.invoke(canvas);
        canvas.translate(-x, -y);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m5954toParentPosition8S9VItk$default(NodeCoordinator r0, long r1, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r3 = true;
    L7:
        return r0.m5968toParentPosition8S9VItk(r1, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m5968toParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer layer = this.layer;
        if (layer == null) goto L5;
        long targetPosition = layer.mo6030mapOffset8S9VItk(position, false);
    L6:
        if (includeMotionFrameOfReference == true) goto L11;
        if (isPlacedUnderMotionFrameOfReference() == false) goto L11;
        return targetPosition;
    L11:
        return IntOffsetKt.m7116plusNvtHpc(targetPosition, mo5909getPositionnOccac());
    L5:
        targetPosition = position;
        goto L6
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m5945fromParentPosition8S9VItk$default(NodeCoordinator r0, long r1, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r3 = true;
    L7:
        return r0.m5959fromParentPosition8S9VItk(r1, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m5959fromParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference == false) goto L4;
    L6:
        long relativeToPosition = IntOffsetKt.m7114minusNvtHpc(position, mo5909getPositionnOccac());
    L7:
        OwnedLayer layer = this.layer;
        if (layer == null) goto L11;
        return layer.mo6030mapOffset8S9VItk(relativeToPosition, true);
    L11:
        return relativeToPosition;
    L4:
        if (isPlacedUnderMotionFrameOfReference() == false) goto L6;
        relativeToPosition = position;
        goto L7
    }

    protected final void drawBorder(Canvas canvas, Paint paint) {
        long arg0$iv = m5773getMeasuredSizeYbymL2g();
        long arg0$iv2 = m5773getMeasuredSizeYbymL2g();
        int $i$f$unpackInt2 = (int) (4294967295L & arg0$iv2);
        canvas.drawRect(0.5f, 0.5f, ((int) (arg0$iv >> 32)) - 0.5f, $i$f$unpackInt2 - 0.5f, paint);
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer r0 = this.layer;
        if (r0 == null) goto L6;
        r0.invalidate();
        return;
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator r0, MutableRect r1, boolean r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        r0.rectInParent$ui_release(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    public final void rectInParent$ui_release(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer layer = this.layer;
        if (layer != null) goto L5;
    L16:
        int x = IntOffset.m7101getXimpl(mo5909getPositionnOccac());
        bounds.setLeft(bounds.getLeft() + x);
        bounds.setRight(bounds.getRight() + x);
        int y = IntOffset.m7102getYimpl(mo5909getPositionnOccac());
        bounds.setTop(bounds.getTop() + y);
        bounds.setBottom(bounds.getBottom() + y);
        return;
    L5:
        if (this.isClipping == true) goto L7;
    L15:
        layer.mapBounds(bounds, false);
        goto L16
    L7:
        if (clipToMinimumTouchTargetSize == false) goto L10;
        long minTouch = m5961getMinimumTouchTargetSizeNHjbRc();
        int bits$iv$iv$iv = (int) (minTouch >> 32);
        float horz = Float.intBitsToFloat(bits$iv$iv$iv) / 2.0f;
        int bits$iv$iv$iv2 = (int) (minTouch & 4294967295L);
        float vert = Float.intBitsToFloat(bits$iv$iv$iv2) / 2.0f;
        long arg0$iv = mo5722getSizeYbymL2g();
        long arg0$iv2 = mo5722getSizeYbymL2g();
        bounds.intersect(-horz, -vert, ((int) (arg0$iv >> 32)) + horz, ((int) (arg0$iv2 & 4294967295L)) + vert);
    L13:
        if (bounds.isEmpty() == false) goto L15;
        return;
    L10:
        if (clipBounds == false) goto L13;
        long arg0$iv3 = mo5722getSizeYbymL2g();
        long arg0$iv4 = mo5722getSizeYbymL2g();
        bounds.intersect(0.0f, 0.0f, (int) (arg0$iv3 >> 32), (int) (arg0$iv4 & 4294967295L));
        goto L13
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        int x = IntOffset.m7101getXimpl(mo5909getPositionnOccac());
        bounds.setLeft(bounds.getLeft() - x);
        bounds.setRight(bounds.getRight() - x);
        int y = IntOffset.m7102getYimpl(mo5909getPositionnOccac());
        bounds.setTop(bounds.getTop() - y);
        bounds.setBottom(bounds.getBottom() - y);
        OwnedLayer layer = this.layer;
        if (layer == null) goto L10;
        layer.mapBounds(bounds, true);
        if (this.isClipping == false) goto L11;
        if (clipBounds == false) goto L12;
        long arg0$iv = mo5722getSizeYbymL2g();
        long arg0$iv2 = mo5722getSizeYbymL2g();
        bounds.intersect(0.0f, 0.0f, (int) (arg0$iv >> 32), (int) (4294967295L & arg0$iv2));
        if (bounds.isEmpty() == false) goto L13;
        return;
    L13:
        return;
    L12:
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m5970withinLayerBoundsk4lQ0M(long pointerPosition) {
        long v$iv = androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (pointerPosition & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase);
        if (((v$iv - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return false;
    L8:
        OwnedLayer layer = this.layer;
        if (layer != null) goto L11;
        return true;
    L11:
        if (this.isClipping == true) goto L13;
        return true;
    L13:
        if (layer.mo6029isInLayerk4lQ0M(pointerPosition) == false) goto L16;
        return true;
    L16:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m5964isPointerInBoundsk4lQ0M(long pointerPosition) {
        int bits$iv$iv$iv = (int) (pointerPosition >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & pointerPosition);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (x >= 0.0f) goto L5;
    L11:
        return false;
    L5:
        if (y < 0.0f) goto L11;
        if (x >= getMeasuredWidth()) goto L11;
        if (y >= getMeasuredHeight()) goto L11;
        return true;
    }

    public void invalidateLayer() {
        OwnedLayer layer = this.layer;
        if (layer == null) goto L5;
        layer.invalidate();
        return;
    L5:
        NodeCoordinator r1 = this.wrappedBy;
        if (r1 == null) goto L10;
        r1.invalidateLayer();
        return;
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer r0 = this.layer;
        if (r0 == null) goto L6;
        r0.invalidate();
        return;
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator other) {
        LayoutNode ancestor1 = other.getLayoutNode();
        LayoutNode ancestor2 = getLayoutNode();
        if (ancestor1 != ancestor2) goto L19;
        Modifier.Node otherNode = other.getTail();
        DelegatableNode $this$visitLocalAncestors$iv = getTail();
        int r4 = NodeKind.m5976constructorimpl(2);
        boolean value$iv$iv = $this$visitLocalAncestors$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L7;
        InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
    L7:
        Modifier.Node next$iv = $this$visitLocalAncestors$iv.getNode().getParent$ui_release();
    L8:
        if (next$iv == null) goto L17;
        if ((next$iv.getKindSet$ui_release() & r4) == 0) goto L15;
        Modifier.Node it = next$iv;
        if (it != otherNode) goto L15;
        return other;
    L15:
        next$iv = next$iv.getParent$ui_release();
        goto L8
    L17:
        return this;
    L19:
        if (ancestor1.getDepth$ui_release() <= ancestor2.getDepth$ui_release()) goto L22;
        LayoutNode r2 = ancestor1.getParent$ui_release();
        Intrinsics.checkNotNull(r2);
        ancestor1 = r2;
    L22:
        if (ancestor2.getDepth$ui_release() <= ancestor1.getDepth$ui_release()) goto L24;
        LayoutNode r3 = ancestor2.getParent$ui_release();
        Intrinsics.checkNotNull(r3);
        ancestor2 = r3;
    L24:
        if (ancestor1 == ancestor2) goto L32;
        LayoutNode parent1 = ancestor1.getParent$ui_release();
        LayoutNode parent2 = ancestor2.getParent$ui_release();
        if (parent1 == null) goto L30;
        if (parent2 == null) goto L30;
        ancestor1 = parent1;
        ancestor2 = parent2;
    L30:
        throw new IllegalArgumentException("layouts are not part of the same hierarchy");
    L32:
        if (ancestor2 != getLayoutNode()) goto L35;
        return this;
    L35:
        if (ancestor1 != other.getLayoutNode()) goto L38;
        return other;
    L38:
        return ancestor1.getInnerCoordinator$ui_release();
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node start = headNode(NodeKindKt.m5985getIncludeSelfInTraversalH91voCI(NodeKind.m5976constructorimpl(16)));
        if (start != null) goto L6;
        return false;
    L6:
        if (start.isAttached() == false) goto L67;
        Modifier.Node $this$visitSelfAndLocalDescendants_u2d6rFNWt0$iv = start;
        int type$iv = NodeKind.m5976constructorimpl(16);
        boolean value$iv$iv$iv = $this$visitSelfAndLocalDescendants_u2d6rFNWt0$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
    L10:
        Modifier.Node self$iv$iv = $this$visitSelfAndLocalDescendants_u2d6rFNWt0$iv.getNode();
        if ((self$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L85;
        Modifier.Node next$iv$iv = self$iv$iv;
    L13:
        if (next$iv$iv == null) goto L86;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L62;
        Modifier.Node it$iv = next$iv$iv;
        MutableVector r16 = null;
        Modifier.Node r3 = it$iv;
    L17:
        if (r3 == null) goto L62;
        start = start;
        if ((r3 instanceof PointerInputModifierNode) == true) goto L20;
        Modifier.Node this_$iv$iv$iv = r3;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L27;
        boolean r19 = true;
    L28:
        if (r19 == false) goto L58;
        if ((r3 instanceof DelegatingNode) == false) goto L58;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r3;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L32:
        if (node$iv$iv$iv == null) goto L55;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L36;
        boolean r25 = true;
    L37:
        if (r25 == false) goto L53;
        count$iv$iv = count$iv$iv + 1;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L41;
        r3 = next$iv$iv2;
    L54:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        goto L32
    L41:
        if (r16 != null) goto L43;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L44:
        Modifier.Node theNode$iv$iv = r3;
        if (theNode$iv$iv == null) goto L49;
        if (r1 == null) goto L48;
        r1.add(theNode$iv$iv);
    L48:
        r3 = null;
    L49:
        if (r1 == null) goto L52;
        r1.add(next$iv$iv2);
    L52:
        r16 = r1;
        count$iv$iv = count$iv$iv;
        goto L54
    L43:
        r1 = r16;
        goto L44
    L53:
        type$iv2 = type$iv;
        goto L54
    L36:
        r25 = false;
        goto L37
    L55:
        int type$iv3 = type$iv;
        if (count$iv$iv != 1) goto L59;
        type$iv = type$iv3;
    L59:
        r3 = DelegatableNodeKt.access$pop(r16);
        type$iv = type$iv3;
    L58:
        type$iv3 = type$iv;
        goto L59
    L27:
        r19 = false;
        goto L28
    L20:
        PointerInputModifierNode it = (PointerInputModifierNode) r3;
        if (it.sharePointerInputWithSiblings() == true) goto L22;
        type$iv3 = type$iv;
        goto L59
    L22:
        return true;
    L62:
        next$iv$iv = next$iv$iv.getChild$ui_release();
        start = start;
        type$iv = type$iv;
        goto L13
    L86:
        return false;
    L85:
        return false;
    L67:
        return false;
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m5950offsetFromEdgeMKHz9U(long pointerPosition) {
        int bits$iv$iv$iv = (int) (pointerPosition >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        if (x >= 0.0f) goto L5;
        float r1 = -x;
    L6:
        float horizontal = Math.max(0.0f, r1);
        int bits$iv$iv$iv2 = (int) (pointerPosition & 4294967295L);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (y >= 0.0f) goto L9;
        float r2 = -y;
    L10:
        float vertical = Math.max(0.0f, r2);
        long v1$iv$iv = Float.floatToRawIntBits(horizontal);
        long v2$iv$iv = Float.floatToRawIntBits(vertical);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L9:
        r2 = y - getMeasuredHeight();
        goto L10
    L5:
        r1 = x - getMeasuredWidth();
        goto L6
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m5957calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        int bits$iv$iv$iv = (int) (minimumTouchTargetSize >> 32);
        float widthDiff = Float.intBitsToFloat(bits$iv$iv$iv) - getMeasuredWidth();
        int bits$iv$iv$iv2 = (int) (minimumTouchTargetSize & 4294967295L);
        float heightDiff = Float.intBitsToFloat(bits$iv$iv$iv2) - getMeasuredHeight();
        float width$iv = Math.max(0.0f, widthDiff / 2.0f);
        float height$iv = Math.max(0.0f, heightDiff / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m5958distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        int bits$iv$iv$iv = (int) (minimumTouchTargetSize >> 32);
        if (getMeasuredWidth() < Float.intBitsToFloat(bits$iv$iv$iv)) goto L7;
        int bits$iv$iv$iv2 = (int) (minimumTouchTargetSize & 4294967295L);
        if (getMeasuredHeight() < Float.intBitsToFloat(bits$iv$iv$iv2)) goto L7;
        return Float.POSITIVE_INFINITY;
    L7:
        long value$iv$iv$iv = m5957calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        int bits$iv$iv$iv$iv = (int) (value$iv$iv$iv >> 32);
        float width = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (value$iv$iv$iv & 4294967295L);
        float height = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        long offsetFromEdge = m5950offsetFromEdgeMKHz9U(pointerPosition);
        if (width <= 0.0f) goto L10;
    L11:
        int bits$iv$iv$iv3 = (int) (offsetFromEdge >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) > width) goto L16;
        int bits$iv$iv$iv4 = (int) (offsetFromEdge & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) > height) goto L16;
        return Offset.m4124getDistanceSquaredimpl(offsetFromEdge);
    L16:
        return Float.POSITIVE_INFINITY;
    L10:
        if (height <= 0.0f) goto L16;
        goto L11
    }

    static {
        Companion = new Companion(null);
        onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
        onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
        graphicsLayerScope = new ReusableGraphicsLayerScope();
        tmpLayerPositionalProperties = new LayerPositionalProperties();
        tmpMatrix = Matrix.m4596constructorimpl$default(null, 1, null);
        PointerInputSource = new NodeCoordinator$Companion$PointerInputSource$1();
        SemanticsSource = new NodeCoordinator$Companion$SemanticsSource$1();
    }
}
