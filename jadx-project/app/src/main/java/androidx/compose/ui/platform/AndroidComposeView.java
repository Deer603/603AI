package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.autofill.HintConstants;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Í\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f*\u00034Õ\u0001\b\u0000\u0018\u0000 ®\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004®\u0004¯\u0004B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001b\u0010¯\u0002\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u00022\b\u0010±\u0002\u001a\u00030«\u0001J&\u0010²\u0002\u001a\u00020E2\u0007\u0010³\u0002\u001a\u00020V2\b\u0010´\u0002\u001a\u00030µ\u00022\b\u0010¶\u0002\u001a\u00030·\u0002H\u0002J\u0015\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u0002H\u0016J!\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\n\u0010º\u0002\u001a\u0005\u0018\u00010»\u0002H\u0016J\u001e\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010¼\u0002\u001a\u00020VH\u0016J*\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010¼\u0002\u001a\u00020V2\n\u0010º\u0002\u001a\u0005\u0018\u00010»\u0002H\u0016J'\u0010¸\u0002\u001a\u00020E2\n\u0010¹\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010½\u0002\u001a\u00020V2\u0007\u0010¾\u0002\u001a\u00020VH\u0016J\u0019\u0010'\u001a\u00020E2\u000f\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020À\u0002H\u0016J\t\u0010Â\u0002\u001a\u00020zH\u0002J\u0010\u0010Ã\u0002\u001a\u00020EH\u0086@¢\u0006\u0003\u0010Ä\u0002J\u0010\u0010Å\u0002\u001a\u00020EH\u0086@¢\u0006\u0003\u0010Ä\u0002J \u0010Æ\u0002\u001a\u00030\u0098\u00012\b\u0010Ç\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÈ\u0002\u0010É\u0002J \u0010Ê\u0002\u001a\u00030\u0098\u00012\b\u0010Ë\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÌ\u0002\u0010É\u0002J\u0012\u0010Í\u0002\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010Ï\u0002\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010Ð\u0002\u001a\u00020E2\u0007\u0010Ñ\u0002\u001a\u00020\u0001H\u0002J\"\u0010Ò\u0002\u001a\u00030Ó\u00022\u0007\u0010Ô\u0002\u001a\u00020VH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÕ\u0002\u0010Ö\u0002Jq\u0010×\u0002\u001a\u00020`2B\u0010Ø\u0002\u001a=\u0012\u0017\u0012\u00150Ú\u0002¢\u0006\u000f\bÛ\u0002\u0012\n\bÜ\u0002\u0012\u0005\b\b(Ý\u0002\u0012\u0019\u0012\u0017\u0018\u00010Þ\u0002¢\u0006\u000f\bÛ\u0002\u0012\n\bÜ\u0002\u0012\u0005\b\b(ß\u0002\u0012\u0004\u0012\u00020E0Ù\u00022\r\u0010à\u0002\u001a\b\u0012\u0004\u0012\u00020E0g2\n\u0010á\u0002\u001a\u0005\u0018\u00010Þ\u00022\u0007\u0010â\u0002\u001a\u00020zH\u0016J\t\u0010ã\u0002\u001a\u00020EH\u0016J\u0013\u0010ä\u0002\u001a\u00020E2\b\u0010Ý\u0002\u001a\u00030å\u0002H\u0014J\u0013\u0010æ\u0002\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0016J\u0013\u0010è\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0016J\u0013\u0010ê\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030ë\u0002H\u0016J\u0013\u0010ì\u0002\u001a\u00020z2\b\u0010é\u0002\u001a\u00030ë\u0002H\u0016J\t\u0010í\u0002\u001a\u00020EH\u0002J\u0013\u0010î\u0002\u001a\u00020E2\b\u0010ï\u0002\u001a\u00030ð\u0002H\u0016J\u0013\u0010ñ\u0002\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0016J\u001b\u0010ò\u0002\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u00022\b\u0010Ý\u0002\u001a\u00030å\u0002J\u0015\u0010ó\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010Î\u0002\u001a\u00020VH\u0002J\u001f\u0010ô\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010õ\u0002\u001a\u00020V2\b\u0010ö\u0002\u001a\u00030\u0097\u0002H\u0002J\u0013\u0010÷\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010õ\u0002\u001a\u00020VJ!\u0010ø\u0002\u001a\u0005\u0018\u00010\u0097\u00022\n\u0010ù\u0002\u001a\u0005\u0018\u00010\u0097\u00022\u0007\u0010Î\u0002\u001a\u00020VH\u0016J\u0012\u0010ú\u0002\u001a\u00020E2\u0007\u0010û\u0002\u001a\u00020zH\u0016J\u001c\u0010ü\u0002\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020zH\u0016J\"\u0010þ\u0002\u001a\u0005\u0018\u00010ÿ\u00022\b\u0010\u0080\u0003\u001a\u00030\u0081\u0003H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0003\u0010\u0083\u0003J\u0013\u0010\u0084\u0003\u001a\u00020E2\b\u0010\u0085\u0003\u001a\u00030\u0086\u0003H\u0016J\t\u0010\u0087\u0003\u001a\u00020VH\u0016J#\u0010\u0088\u0003\u001a\u00030\u0089\u00032\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0013\u0010\u008c\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u001d\u0010\u008d\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u00012\b\u0010\u008e\u0003\u001a\u00030Ì\u0001H\u0002J\t\u0010\u008f\u0003\u001a\u00020EH\u0016J\t\u0010\u0090\u0003\u001a\u00020EH\u0016J\u0013\u0010\u0091\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0002J\u0013\u0010\u0093\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0002J\u0013\u0010\u0094\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0095\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0096\u0003\u001a\u00020z2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010\u0097\u0003\u001a\u00020z2\b\u0010é\u0002\u001a\u00030Ì\u0001H\u0002J \u0010\u0098\u0003\u001a\u00030\u0098\u00012\b\u0010Ë\u0002\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0099\u0003\u0010É\u0002J\u001f\u0010\u0098\u0003\u001a\u00020E2\b\u0010\u009a\u0003\u001a\u00030\u0090\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009b\u0003\u0010\u009c\u0003J)\u0010\u009d\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\b\u0010\u009e\u0003\u001a\u00030¾\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J\u0012\u0010\u009d\u0003\u001a\u00020E2\u0007\u0010¡\u0003\u001a\u00020zH\u0016J\t\u0010¢\u0003\u001a\u00020EH\u0016J!\u0010£\u0003\u001a\u00020E2\u0007\u0010¤\u0003\u001a\u00020`2\u0007\u0010¥\u0003\u001a\u00020zH\u0000¢\u0006\u0003\b¦\u0003J\t\u0010§\u0003\u001a\u00020EH\u0014J\t\u0010¨\u0003\u001a\u00020zH\u0016J\t\u0010©\u0003\u001a\u00020EH\u0002J\u0012\u0010ª\u0003\u001a\u00020E2\u0007\u0010«\u0003\u001a\u00020DH\u0014J\u0016\u0010¬\u0003\u001a\u0005\u0018\u00010\u00ad\u00032\b\u0010®\u0003\u001a\u00030¯\u0003H\u0016J0\u0010°\u0003\u001a\u00020E2\b\u0010±\u0003\u001a\u00030²\u00032\b\u0010³\u0003\u001a\u00030\u0093\u00022\u0011\u0010´\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¶\u00030µ\u0003H\u0017J\u0013\u0010·\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\t\u0010¸\u0003\u001a\u00020EH\u0014J\u0013\u0010¹\u0003\u001a\u00020E2\b\u0010Ý\u0002\u001a\u00030å\u0002H\u0014J\t\u0010º\u0003\u001a\u00020EH\u0016J\f\u0010»\u0003\u001a\u0005\u0018\u00010¼\u0003H\u0002J'\u0010½\u0003\u001a\u00020E2\u0007\u0010¾\u0003\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020V2\n\u0010¿\u0003\u001a\u0005\u0018\u00010\u0086\u0003H\u0014J\u0018\u0010À\u0003\u001a\u00020E2\r\u0010\u0096\u0002\u001a\b0\u0097\u0002j\u0003`Á\u0003H\u0016J6\u0010Â\u0003\u001a\u00020E2\u0007\u0010Ã\u0003\u001a\u00020z2\u0007\u0010Ä\u0003\u001a\u00020V2\u0007\u0010Å\u0003\u001a\u00020V2\u0007\u0010Æ\u0003\u001a\u00020V2\u0007\u0010Ç\u0003\u001a\u00020VH\u0014J\u0013\u0010È\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u0013\u0010É\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u001b\u0010Ê\u0003\u001a\u00020E2\u0007\u0010Ë\u0003\u001a\u00020V2\u0007\u0010Ì\u0003\u001a\u00020VH\u0014J\u001f\u0010Í\u0003\u001a\u00020z2\b\u0010Î\u0003\u001a\u00030ÿ\u0002H\u0002ø\u0001\u0000¢\u0006\u0006\bÏ\u0003\u0010Ð\u0003J\u0013\u0010Ñ\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u001c\u0010Ò\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010Ó\u0003\u001a\u00020VH\u0016J\u0013\u0010Ô\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u001c\u0010Õ\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010Ó\u0003\u001a\u00020VH\u0016J\u001e\u0010Ö\u0003\u001a\u00020E2\n\u0010ï\u0002\u001a\u0005\u0018\u00010ð\u00022\u0007\u0010×\u0003\u001a\u00020VH\u0016J*\u0010Ø\u0003\u001a\u00020z2\n\u0010Î\u0003\u001a\u0005\u0018\u00010ÿ\u00022\n\u0010¿\u0003\u001a\u0005\u0018\u00010¼\u0003H\u0002ø\u0001\u0000¢\u0006\u0003\bÙ\u0003J.\u0010Ú\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020z2\u0007\u0010Û\u0003\u001a\u00020z2\u0007\u0010Ü\u0003\u001a\u00020zH\u0016J%\u0010Ý\u0003\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u00012\u0007\u0010ý\u0002\u001a\u00020z2\u0007\u0010Û\u0003\u001a\u00020zH\u0016J\u001d\u0010Þ\u0003\u001a\u00030ß\u00032\b\u0010é\u0002\u001a\u00030Ì\u00012\u0007\u0010à\u0003\u001a\u00020VH\u0017J\u0013\u0010á\u0003\u001a\u00020E2\b\u0010â\u0003\u001a\u00030ã\u0003H\u0016J\u0012\u0010ä\u0003\u001a\u00020E2\u0007\u0010£\u0001\u001a\u00020VH\u0016J.\u0010å\u0003\u001a\u00020E2\b\u0010æ\u0003\u001a\u00030\u0086\u00032\b\u0010ç\u0003\u001a\u00030è\u00032\u000f\u0010é\u0003\u001a\n\u0012\u0005\u0012\u00030ê\u00030µ\u0003H\u0016J\t\u0010ë\u0003\u001a\u00020EH\u0016J\u001c\u0010ì\u0003\u001a\u00020E2\u0011\u0010í\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ï\u00030î\u0003H\u0017J\u0012\u0010ð\u0003\u001a\u00020E2\u0007\u0010ñ\u0003\u001a\u00020zH\u0016J+\u0010ò\u0003\u001a\u00030Ó\u00022\u0007\u0010ó\u0003\u001a\u00020V2\u0007\u0010Ç\u0003\u001a\u00020VH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bô\u0003\u0010õ\u0003J\t\u0010ö\u0003\u001a\u00020EH\u0002J\u0013\u0010ö\u0003\u001a\u00020E2\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002J\t\u0010÷\u0003\u001a\u00020EH\u0002J\u0018\u0010ø\u0003\u001a\u00020z2\u0007\u0010¤\u0003\u001a\u00020`H\u0000¢\u0006\u0003\bù\u0003J\u0018\u0010ú\u0003\u001a\u00020E2\r\u0010û\u0003\u001a\b\u0012\u0004\u0012\u00020E0gH\u0016J\u0013\u0010ü\u0003\u001a\u00020E2\b\u0010û\u0003\u001a\u00030ý\u0003H\u0016J\u0011\u0010þ\u0003\u001a\u00020E2\b\u0010\u0096\u0002\u001a\u00030°\u0002J\u0013\u0010ÿ\u0003\u001a\u00020E2\b\u0010\u0092\u0003\u001a\u00030«\u0001H\u0016J\u0007\u0010\u0080\u0004\u001a\u00020EJ\u001e\u0010\u0081\u0004\u001a\u00020z2\u0007\u0010Î\u0002\u001a\u00020V2\n\u0010¿\u0003\u001a\u0005\u0018\u00010\u0086\u0003H\u0016J\u0013\u0010\u0082\u0004\u001a\u00020E2\b\u0010±\u0002\u001a\u00030«\u0001H\u0016J\u0017\u0010Ü\u0003\u001a\u00020E2\f\b\u0002\u0010\u0083\u0004\u001a\u0005\u0018\u00010«\u0001H\u0002J \u0010\u0084\u0004\u001a\u00030\u0098\u00012\b\u0010\u0085\u0004\u001a\u00030\u0098\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0086\u0004\u0010É\u0002J\u001f\u0010\u0087\u0004\u001a\u00020z2\b\u0010\u0080\u0003\u001a\u00030\u0081\u0003H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0088\u0004\u0010\u0089\u0004J#\u0010\u008a\u0004\u001a\u00030\u0089\u00032\b\u0010ç\u0002\u001a\u00030Ì\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008b\u0004\u0010\u008b\u0003J1\u0010\u008c\u0004\u001a\u00020E2\b\u0010ç\u0002\u001a\u00030Ì\u00012\u0007\u0010\u008d\u0004\u001a\u00020V2\b\u0010\u008e\u0004\u001a\u00030\u009a\u00012\t\b\u0002\u0010\u008f\u0004\u001a\u00020zH\u0002J\u0013\u0010\u0090\u0004\u001a\u00020E2\b\u0010\u0091\u0004\u001a\u00030\u009a\u0001H\u0016J\u001c\u0010\u0092\u0004\u001a\u00020E2\u0013\u0010\u0093\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0CJ\t\u0010\u0094\u0004\u001a\u00020zH\u0016JE\u0010\u0095\u0004\u001a\u00020z2\b\u0010\u0096\u0004\u001a\u00030\u0097\u00042\b\u0010\u0098\u0004\u001a\u00030\u0099\u00042\u001a\u0010\u009a\u0004\u001a\u0015\u0012\u0005\u0012\u00030\u009b\u0004\u0012\u0004\u0012\u00020E0C¢\u0006\u0003\b\u009c\u0004H\u0002ø\u0001\u0000¢\u0006\u0006\b\u009d\u0004\u0010\u009e\u0004JA\u0010\u009f\u0004\u001a\u00030 \u00042.\u0010¡\u0004\u001a)\b\u0001\u0012\u0005\u0012\u00030¢\u0004\u0012\f\u0012\n\u0012\u0005\u0012\u00030 \u00040£\u0004\u0012\u0007\u0012\u0005\u0018\u00010¤\u00040Ù\u0002¢\u0006\u0003\b\u009c\u0004H\u0096@¢\u0006\u0003\u0010¥\u0004J\t\u0010¦\u0004\u001a\u00020EH\u0002J\t\u0010§\u0004\u001a\u00020EH\u0002J\u000e\u0010¨\u0004\u001a\u00020z*\u00030«\u0001H\u0002J\u001b\u0010©\u0004\u001a\u00020V*\u00030Ó\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\bª\u0004\u0010«\u0004J\u001b\u0010¬\u0004\u001a\u00020V*\u00030Ó\u0002H\u0082\nø\u0001\u0000¢\u0006\u0006\b\u00ad\u0004\u0010«\u0004R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0004\n\u0002\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\b\u001a\u00020\t2\u0006\u0010P\u001a\u00020\t@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010X\u001a\u00020W2\u0006\u0010\u0015\u001a\u00020W8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u001d\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u00020bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u001c\u0010e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020E\u0018\u00010g0fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\u00020iX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR+\u0010m\u001a\u00020l2\u0006\u0010\u0015\u001a\u00020l8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\u001d\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010s\u001a\u00020t8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u000e\u0010y\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020|X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010}\u001a\u00020~X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020z8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u000f\u0010\u008b\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u008c\u0001\u001a\u00030\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u000f\u0010\u0090\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0091\u0001\u001a\u00020z8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u000f\u0010\u0092\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0097\u0001\u001a\u00030\u0098\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR+\u0010\u0099\u0001\u001a\u00030\u009a\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b\u009b\u0001\u0010v\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020`0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010\u0015\u001a\u00030¢\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b¨\u0001\u0010\u001d\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0010\u0010®\u0001\u001a\u00030¯\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010°\u0001\u001a\u00030±\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010²\u0001\u001a\u00030³\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010´\u0001\u001a\u00030\u009a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010\u009d\u0001R\u0018\u0010¶\u0001\u001a\u00030·\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0010\u0010º\u0001\u001a\u00030»\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010¼\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001d\u0010¿\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010À\u0001\u001a\u00030Á\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ä\u0001\u001a\u00030Å\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0010\u0010È\u0001\u001a\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Ê\u0001\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Í\u0001\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Î\u0001\u001a\u00030Ï\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0010\u0010Ò\u0001\u001a\u00030\u009a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020E0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010Ô\u0001\u001a\u00030Õ\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010Ö\u0001R\u0018\u0010×\u0001\u001a\u00030«\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Ú\u0001\u001a\u00030Û\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0010\u0010Þ\u0001\u001a\u00030ß\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010à\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010á\u0001\u001a\u0005\u0018\u00010â\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010ã\u0001\u001a\u00020z8@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010\u008a\u0001R\u0010\u0010å\u0001\u001a\u00030æ\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010ç\u0001\u001a\u00030è\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010é\u0001\u001a\u00030ê\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bë\u0001\u0010ì\u0001R\u0010\u0010í\u0001\u001a\u00030î\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010ï\u0001\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010ð\u0001\u001a\u00030ñ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001R&\u0010ô\u0001\u001a\u00020zX\u0096\u000e¢\u0006\u0019\n\u0000\u0012\u0005\bõ\u0001\u0010v\u001a\u0006\bö\u0001\u0010\u008a\u0001\"\u0006\b÷\u0001\u0010ø\u0001R\u0018\u0010ù\u0001\u001a\u00030ú\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010ü\u0001R\u0018\u0010ý\u0001\u001a\u00030þ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u000f\u0010\u0081\u0002\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0082\u0002\u001a\u00030\u0083\u00028\u0016X\u0097\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0002\u0010v\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R \u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030\u0089\u00020\u0088\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u008a\u0002R\u0018\u0010\u008b\u0002\u001a\u00030\u008c\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0019\u0010\u008f\u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R\u0010\u0010\u0092\u0002\u001a\u00030\u0093\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0002\u001a\u00030\u0095\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0096\u0002\u001a\u00030\u0097\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u009b\u0002X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0012\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u009f\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010 \u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R!\u0010¡\u0002\u001a\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b£\u0002\u0010¤\u0002\u001a\u0005\b¢\u0002\u0010\u0019R\u000f\u0010¥\u0002\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010¦\u0002\u001a\u00030§\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u0018\u0010ª\u0002\u001a\u00030\u0098\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u007fR\u0019\u0010«\u0002\u001a\u00030\u0090\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\n\u0003\u0010\u0091\u0002R\u001b\u0010¬\u0002\u001a\u00020V*\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010®\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofillManager", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "get_autofillManager$ui_release", "()Landroidx/compose/ui/autofill/AndroidAutofillManager;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "<set-?>", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "_viewTreeOwners", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners$delegate", "Landroidx/compose/runtime/MutableState;", "_windowInfo", "Landroidx/compose/ui/platform/LazyWindowInfo;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillManager", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "bringIntoViewNode", "androidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1", "Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboard", "Landroidx/compose/ui/platform/AndroidClipboard;", "getClipboard", "()Landroidx/compose/ui/platform/AndroidClipboard;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "value", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "currentFontWeightAdjustment", "", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density$delegate", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "endApplyChangesListeners", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isPendingInteropViewLayoutChangeDispatch", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "keyboardModifiersRequireUpdate", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "layoutNodes", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNodes", "()Landroidx/collection/MutableIntObjectMap;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "processingRequestFocusForNextNonChildView", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "relayoutTime", "resendMotionEventOnLayout", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "rotaryInputModifier", "scrollCapture", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "scrollCaptureInProgress", "getScrollCaptureInProgress$ui_release", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sensitiveComponentCount", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "superclassInitComplete", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "viewTreeOwners", "getViewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "addView", "child", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesAccessibilityEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesContentCaptureEventLoop", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "convertMeasureSpec", "Lkotlin/ULong;", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "createLayer", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "invalidateParentLayer", "explicitLayer", "forceUseOldLayers", "decrementSensitiveComponentCount", "dispatchDraw", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", "motionEvent", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchKeyEventPreIme", "dispatchPendingInteropLayoutCallbacks", "dispatchProvideStructure", "structure", "Landroid/view/ViewStructure;", "dispatchTouchEvent", "drawAndroidView", "findNextNonChildView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "focusSearch", "focused", "forceAccessibilityForTesting", "enable", "forceMeasureTheSubtree", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "getImportantForAutofill", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleRotaryEvent", "hasChangedDevices", "lastEvent", "incrementSensitiveComponentCount", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "localToScreen", "localToScreen-MK-Hz9U", "localTransform", "localToScreen-58bKbWc", "([F)V", "measureAndLayout", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "measureAndLayoutForTest", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttachedToWindow", "onCheckIsTextEditor", "onClearFocusForOwner", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onDetach", "onDetachedFromWindow", "onDraw", "onEndApplyChanges", "onFetchFocusRect", "Landroidx/compose/ui/geometry/Rect;", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "onInteropViewLayoutChange", "Landroidx/compose/ui/viewinterop/InteropView;", "onLayout", "changed", "l", "t", "r", "b", "onLayoutChange", "onLayoutNodeDeactivated", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onMoveFocusInChildren", "focusDirection", "onMoveFocusInChildren-3ESFkO8", "(I)Z", "onPostAttach", "onPostLayoutNodeReused", "oldSemanticsId", "onPreAttach", "onPreLayoutNodeReused", "onProvideAutofillVirtualStructure", "flags", "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", "onResolvePointerIcon", "Landroid/view/PointerIcon;", "pointerIndex", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onScrollCaptureSearch", "localVisibleRect", "windowOffset", "Landroid/graphics/Point;", "targets", "Landroid/view/ScrollCaptureTarget;", "onSemanticsChange", "onVirtualViewTranslationResponses", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onWindowFocusChanged", "hasWindowFocus", "pack", "a", "pack-ZIaKswc", "(II)J", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "registerOnEndApplyChangesListener", "listener", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "removeAndroidView", "requestAutofill", "requestClearInvalidObservations", "requestFocus", "requestOnPositionedCallback", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setAccessibilityEventBatchIntervalMillis", "intervalMillis", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "startDrag", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "textInputSession", "", "session", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePositionCacheAndDispatch", "updateWindowMetrics", "childSizeCanAffectParentSize", "component1", "component1-VKZWuLQ", "(J)I", "component2", "component2-VKZWuLQ", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final InputModeManagerImpl _inputModeManager;
    private final MutableState _viewTreeOwners$delegate;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final AndroidComposeView$bringIntoViewNode$1 bringIntoViewNode;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    private AndroidContentCaptureManager contentCaptureManager;
    private CoroutineContext coroutineContext;
    private int currentFontWeightAdjustment;
    private final MutableState density$delegate;
    private final List<OwnedLayer> dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final MutableObjectList<Function0<Unit>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final MutableIntObjectMap<LayoutNode> layoutNodes;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final Function0<Unit> resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final EmptySemanticsModifier rootSemanticsNode;
    private final Modifier rotaryInputModifier;
    private final ScrollCapture scrollCapture;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference<SessionMutex.Session<T>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ boolean access$getIsShowingLayoutBounds(Companion $this) {
            return $this.getIsShowingLayoutBounds();
        }

        private final boolean getIsShowingLayoutBounds() {
            Boolean r2 = null;
            if (AndroidComposeView.access$getSystemPropertiesClass$cp() != null) goto L10;
            AndroidComposeView.access$setSystemPropertiesClass$cp(Class.forName("android.os.SystemProperties"));     // Catch: Exception -> L20
            Class r1 = AndroidComposeView.access$getSystemPropertiesClass$cp();     // Catch: Exception -> L20
            if (r1 == null) goto L8;
            Method r3 = r1.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});     // Catch: Exception -> L20
        L9:
            AndroidComposeView.access$setGetBooleanMethod$cp(r3);     // Catch: Exception -> L20
            goto L10
        L8:
            r3 = null;
        L10:
            Method r4 = AndroidComposeView.access$getGetBooleanMethod$cp();     // Catch: Exception -> L20
            if (r4 == null) goto L13;
            Object r5 = r4.invoke(null, new Object[]{"debug.layout", false});     // Catch: Exception -> L20
        L15:
            if ((r5 instanceof Boolean) == false) goto L17;
            r2 = (Boolean) r5;     // Catch: Exception -> L20
        L17:
            if (r2 == null) goto L24;
            return r2.booleanValue();
        L24:
            return false;
        L13:
            r5 = null;
        L21:
            return false;
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewTreeOwners {
        public static final int $stable = 0;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        static {
            $stable = 8;
        }

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {739}, m = "textInputSession", n = {}, s = {})
    static final class C06491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AndroidComposeView this$0;

        C06491(AndroidComposeView r1, Continuation<? super C06491> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.textInputSession(null, this);
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static final /* synthetic */ void access$addExtraDataToAccessibilityNodeInfoHelper(AndroidComposeView $this, int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        $this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey);
    }

    public static final /* synthetic */ boolean access$dispatchGenericMotionEvent$s408734394(AndroidComposeView $this, MotionEvent p0) {
        return super.dispatchGenericMotionEvent(p0);
    }

    public static final /* synthetic */ boolean access$dispatchKeyEvent$s408734394(AndroidComposeView $this, KeyEvent p0) {
        return super.dispatchKeyEvent(p0);
    }

    public static final /* synthetic */ View access$findNextNonChildView(AndroidComposeView $this, int direction) {
        return $this.findNextNonChildView(direction);
    }

    public static final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat access$getComposeAccessibilityDelegate$p(AndroidComposeView $this) {
        return $this.composeAccessibilityDelegate;
    }

    public static final /* synthetic */ Method access$getGetBooleanMethod$cp() {
        return getBooleanMethod;
    }

    public static final /* synthetic */ MotionEvent access$getPreviousMotionEvent$p(AndroidComposeView $this) {
        return $this.previousMotionEvent;
    }

    public static final /* synthetic */ long access$getRelayoutTime$p(AndroidComposeView $this) {
        return $this.relayoutTime;
    }

    public static final /* synthetic */ AndroidComposeView$resendMotionEventRunnable$1 access$getResendMotionEventRunnable$p(AndroidComposeView $this) {
        return $this.resendMotionEventRunnable;
    }

    public static final /* synthetic */ Class access$getSystemPropertiesClass$cp() {
        return systemPropertiesClass;
    }

    public static final /* synthetic */ int[] access$getTmpPositionArray$p(AndroidComposeView $this) {
        return $this.tmpPositionArray;
    }

    public static final /* synthetic */ ViewTreeOwners access$get_viewTreeOwners(AndroidComposeView $this) {
        return $this.get_viewTreeOwners();
    }

    public static final /* synthetic */ void access$onClearFocusForOwner(AndroidComposeView $this) {
        $this.onClearFocusForOwner();
    }

    public static final /* synthetic */ Rect access$onFetchFocusRect(AndroidComposeView $this) {
        return $this.onFetchFocusRect();
    }

    /* JADX INFO: renamed from: access$onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    public static final /* synthetic */ boolean m6074access$onMoveFocusInChildren3ESFkO8(AndroidComposeView $this, int focusDirection) {
        return $this.m6081onMoveFocusInChildren3ESFkO8(focusDirection);
    }

    /* JADX INFO: renamed from: access$onRequestFocusForOwner-7o62pno, reason: not valid java name */
    public static final /* synthetic */ boolean m6075access$onRequestFocusForOwner7o62pno(AndroidComposeView $this, FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return $this.m6082onRequestFocusForOwner7o62pno(focusDirection, previouslyFocusedRect);
    }

    public static final /* synthetic */ void access$sendSimulatedEvent(AndroidComposeView $this, MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        $this.sendSimulatedEvent(motionEvent, action, eventTime, forceHover);
    }

    public static final /* synthetic */ void access$setGetBooleanMethod$cp(Method r0) {
        getBooleanMethod = r0;
    }

    public static final /* synthetic */ void access$setLayoutDirection(AndroidComposeView $this, LayoutDirection r1) {
        $this.setLayoutDirection(r1);
    }

    public static final /* synthetic */ void access$setRelayoutTime$p(AndroidComposeView $this, long r1) {
        $this.relayoutTime = r1;
    }

    public static final /* synthetic */ void access$setSystemPropertiesClass$cp(Class r0) {
        systemPropertiesClass = r0;
    }

    /* JADX INFO: renamed from: access$startDrag-12SF9DM, reason: not valid java name */
    public static final /* synthetic */ boolean m6076access$startDrag12SF9DM(AndroidComposeView $this, DragAndDropTransferData transferData, long decorationSize, Function1 drawDragDecoration) {
        return $this.m6085startDrag12SF9DM(transferData, decorationSize, drawDragDecoration);
    }

    @Override // androidx.compose.ui.node.Owner
    public /* bridge */ /* synthetic */ AccessibilityManager getAccessibilityManager() {
        return getAccessibilityManager();
    }

    @Override // androidx.compose.ui.node.Owner
    public /* bridge */ /* synthetic */ Clipboard getClipboard() {
        return getClipboard();
    }

    @Override // androidx.compose.ui.node.Owner
    public /* bridge */ /* synthetic */ ClipboardManager getClipboardManager() {
        return getClipboardManager();
    }

    @Override // androidx.compose.ui.node.Owner
    public /* bridge */ /* synthetic */ DragAndDropManager getDragAndDropManager() {
        return getDragAndDropManager();
    }

    @Override // androidx.compose.ui.node.Owner
    public /* bridge */ /* synthetic */ IntObjectMap getLayoutNodes() {
        return getLayoutNodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    /* JADX WARN: Type inference failed for: r1v66, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context r14, CoroutineContext r15) {
        super(r14);
        this.lastDownPointerPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        int r0 = 1;
        this.superclassInitComplete = true;
        ScrollCapture r2 = null;
        Object[] r3 = 0;
        Object[] r4 = 0;
        Object[] r5 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(0 == true ? 1 : 0, r0, 0 == true ? 1 : 0);
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(r14), SnapshotStateKt.referentialEqualityPolicy());
        this.rootSemanticsNode = new EmptySemanticsModifier();
        this.semanticsModifier = new EmptySemanticsElement(this.rootSemanticsNode);
        this.bringIntoViewNode = new AndroidComposeView$bringIntoViewNode$1(this);
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new AndroidComposeView$focusOwner$6(this));
        this.coroutineContext = r15;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        this.keyInputModifier = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AndroidComposeView$keyInputModifier$1(this));
        this.rotaryInputModifier = RotaryInputModifierKt.onRotaryScrollEvent(Modifier.Companion, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.canvasHolder = new CanvasHolder();
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(r14));
        Object[] r6 = 0;
        Object[] r7 = 0 == true ? 1 : 0;
        LayoutNode r1 = new LayoutNode(false, 0 == true ? 1 : 0, 3, r7);
        r1.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        r1.setDensity(getDensity());
        r1.setViewConfiguration(getViewConfiguration());
        r1.setModifier(Modifier.Companion.then(this.semanticsModifier).then(this.rotaryInputModifier).then(this.keyInputModifier).then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()).then(this.bringIntoViewNode));
        this.root = r1;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), this.rootSemanticsNode, getLayoutNodes());
        this.composeAccessibilityDelegate = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(r14);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (autofillSupported() == false) goto L5;
        AndroidAutofill r8 = new AndroidAutofill(this, getAutofillTree());
    L6:
        this._autofill = r8;
        if (autofillSupported() == false) goto L13;
        AutofillManager r9 = (AutofillManager) r14.getSystemService(AutofillManager.class);
        if (r9 == null) goto L11;
        AndroidAutofillManager r10 = new AndroidAutofillManager(new PlatformAutofillManagerImpl(r9), getSemanticsOwner(), this, getRectManager(), r14.getPackageName());
    L14:
        this._autofillManager = r10;
        this.clipboardManager = new AndroidClipboardManager(r14);
        this.clipboard = new AndroidClipboard(getClipboardManager());
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.globalPosition = IntOffset.m7095constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
        this.tmpPositionArray = new int[]{0, 0};
        this.tmpMatrix = Matrix.m4596constructorimpl$default(null, 1, null);
        this.viewToWindowMatrix = Matrix.m4596constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m4596constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1;
        this.windowPosition = Offset.Companion.m4139getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(this));
        this.globalLayoutListener = new AndroidComposeView$$ExternalSyntheticLambda0(this);
        this.scrollChangedListener = new AndroidComposeView$$ExternalSyntheticLambda1(this);
        this.touchModeChangeListener = new AndroidComposeView$$ExternalSyntheticLambda2(this);
        this.legacyTextInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(this.legacyTextInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m3945constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(r14);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(r14), SnapshotStateKt.referentialEqualityPolicy());
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(r14.getResources().getConfiguration());
        LayoutDirection r11 = FocusInteropUtils_androidKt.toLayoutDirection(r14.getResources().getConfiguration().getLayoutDirection());
        if (r11 != null) goto L17;
        r11 = LayoutDirection.Ltr;
    L17:
        this.layoutDirection$delegate = SnapshotStateKt.mutableStateOf$default(r11, null, 2, null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        if (isInTouchMode() == false) goto L20;
        int r12 = InputMode.Companion.m5128getTouchaOaMEAU();
    L21:
        this._inputModeManager = new InputModeManagerImpl(r12, new AndroidComposeView$_inputModeManager$1(this), r5 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache();
        this.endApplyChangesListeners = new MutableObjectList(r6 == true ? 1 : 0, r0, r4 == true ? 1 : 0);
        this.resendMotionEventRunnable = new AndroidComposeView$resendMotionEventRunnable$1(this);
        this.sendHoverExitEvent = new AndroidComposeView$$ExternalSyntheticLambda3(this);
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        if (Build.VERSION.SDK_INT >= 29) goto L24;
        CalculateMatrixToWindow r13 = new CalculateMatrixToWindowApi21(this.tmpMatrix, r3 == true ? 1 : 0);
    L25:
        this.matrixToWindow = r13;
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, this.composeAccessibilityDelegate);
        Function1<ViewRootForTest, Unit> r16 = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (r16 == null) goto L28;
        r16.invoke(this);
    L28:
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui_release(this);
        if (Build.VERSION.SDK_INT < 29) goto L32;
        AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
    L32:
        if (Build.VERSION.SDK_INT < 31) goto L34;
        r2 = new ScrollCapture();
    L34:
        this.scrollCapture = r2;
        this.pointerIconService = new AndroidComposeView$pointerIconService$1(this);
        return;
    L24:
        r13 = new CalculateMatrixToWindowApi29();
        goto L25
    L20:
        r12 = InputMode.Companion.m5127getKeyboardaOaMEAU();
        goto L21
    L11:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Autofill service could not be located.");
        throw new KotlinNothingValueException();
    L13:
        r10 = null;
        goto L14
    L5:
        r8 = null;
        goto L6
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    private void setDensity(Density r4) {
        MutableState $this$setValue$iv = this.density$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        State $this$getValue$iv = this.density$delegate;
        return (Density) $this$getValue$iv.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public void setCoroutineContext(CoroutineContext value) {
        this.coroutineContext = value;
        DelegatableNode r2 = getRoot().getNodes$ui_release().getHead$ui_release();
        if ((r2 instanceof SuspendingPointerInputModifierNode) == false) goto L5;
        ((SuspendingPointerInputModifierNode) r2).resetPointerInputHandler();
    L5:
        DelegatableNode $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = r2;
        int r4 = NodeKind.m5976constructorimpl(16);
        boolean value$iv$iv$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L8:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L11;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSubtree_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L12:
        boolean r15 = true;
        if (branches$iv$iv.getSize() == 0) goto L15;
        boolean r11 = true;
    L16:
        if (r11 == false) goto L77;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r4) == 0) goto L75;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L20:
        if (node$iv$iv == null) goto L75;
        if ((node$iv$iv.getKindSet$ui_release() & r4) == 0) goto L71;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r19 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L24:
        if (this_$iv$iv$iv == null) goto L67;
        if ((this_$iv$iv$iv instanceof PointerInputModifierNode) == true) goto L27;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r4) == 0) goto L34;
        boolean r0 = true;
    L35:
        if (r0 == false) goto L65;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L65;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L39:
        if (node$iv$iv$iv == null) goto L62;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r4) == 0) goto L43;
        boolean r25 = true;
    L44:
        if (r25 == false) goto L60;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != 1) goto L48;
        this_$iv$iv$iv = next$iv$iv;
        r2 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
    L61:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        r2 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        goto L39
    L48:
        if (r19 != null) goto L50;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L51:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L56;
        if (r1 == null) goto L55;
        r1.add(theNode$iv$iv);
    L55:
        this_$iv$iv$iv = null;
    L56:
        if (r1 == null) goto L59;
        r1.add(next$iv$iv);
    L59:
        r19 = r1;
        count$iv$iv = count$iv$iv;
        goto L61
    L50:
        r1 = r19;
        goto L51
    L60:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        r2 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        goto L61
    L43:
        r25 = false;
        goto L44
    L62:
        DelegatableNode r29 = r2;
        DelegatableNode $this$visitSubtree_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        if (count$iv$iv != 1) goto L66;
        r2 = r29;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv2;
    L66:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r19);
        r2 = r29;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv2;
    L65:
        r29 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        goto L66
    L34:
        r0 = false;
        goto L35
    L27:
        PointerInputModifierNode it = (PointerInputModifierNode) this_$iv$iv$iv;
        if ((it instanceof SuspendingPointerInputModifierNode) == false) goto L30;
        ((SuspendingPointerInputModifierNode) it).resetPointerInputHandler();
    L30:
        r29 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        goto L66
    L67:
        DelegatableNode r210 = r2;
        DelegatableNode $this$visitSubtree_u2dY_u2dYKmho_u24default$iv3 = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        boolean r20 = true;
        if (1 != 0) goto L72;
        r2 = r210;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv3;
    L72:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r15 = r20;
        r2 = r210;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv3;
        goto L20
    L71:
        r210 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv3 = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        r20 = r15;
    L75:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        r2 = r2;
        $this$visitSubtree_u2dY_u2dYKmho_u24default$iv = $this$visitSubtree_u2dY_u2dYKmho_u24default$iv;
        goto L12
    L77:
        return;
    L15:
        r11 = false;
        goto L16
    L11:
        branches$iv$iv.add(child$iv$iv);
        goto L12
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    /* JADX INFO: renamed from: onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    private final boolean m6081onMoveFocusInChildren3ESFkO8(int focusDirection) {
        android.graphics.Rect focusedRect = null;
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L26;
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4014getEnterdhqQ8s()) == false) goto L7;
    L24:
        return false;
    L7:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4015getExitdhqQ8s()) == true) goto L24;
        Integer r0 = FocusInteropUtils_androidKt.m4021toAndroidFocusDirection3ESFkO8(focusDirection);
        if (r0 == null) goto L23;
        int direction = r0.intValue();
        Rect r2 = onFetchFocusRect();
        if (r2 == null) goto L14;
        focusedRect = RectHelper_androidKt.toAndroidRect(r2);
    L14:
        FocusFinder it = FocusFinder.getInstance();
        if (focusedRect != null) goto L17;
        View nextView = it.findNextFocus(this, findFocus(), direction);
    L19:
        if (nextView != null) goto L21;
        return false;
    L21:
        return FocusInteropUtils_androidKt.requestInteropFocus(nextView, Integer.valueOf(direction), focusedRect);
    L17:
        nextView = it.findNextFocusFromRect(this, focusedRect, direction);
        goto L19
    L23:
        throw new IllegalStateException("Invalid focus direction".toString());
    L26:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4014getEnterdhqQ8s()) == false) goto L28;
    L69:
        return false;
    L28:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4015getExitdhqQ8s()) == true) goto L69;
        if (hasFocus() == false) goto L69;
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) goto L35;
        return false;
    L35:
        Integer r4 = FocusInteropUtils_androidKt.m4021toAndroidFocusDirection3ESFkO8(focusDirection);
        if (r4 == null) goto L68;
        int direction2 = r4.intValue();
        View r5 = getRootView();
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup root = (ViewGroup) r5;
        View currentFocus = root.findFocus();
        if (currentFocus == null) goto L66;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (FocusOwnerImplKt.m4033is1dFocusSearch3ESFkO8(focusDirection) == true) goto L42;
    L44:
        Rect r9 = onFetchFocusRect();
        if (r9 == null) goto L47;
        focusedRect = RectHelper_androidKt.toAndroidRect(r9);
    L47:
        View nextView2 = focusFinder.findNextFocusFromRect(root, focusedRect, direction2);
        if (nextView2 == null) goto L50;
        nextView2.getLocationInWindow(this.tmpPositionArray);
    L50:
        int nextPositionX = this.tmpPositionArray[0];
        int nextPositionY = this.tmpPositionArray[1];
        getLocationInWindow(this.tmpPositionArray);
        if (focusedRect == null) goto L53;
        focusedRect.offset(this.tmpPositionArray[0] - nextPositionX, this.tmpPositionArray[1] - nextPositionY);
    L53:
        if (nextView2 == null) goto L64;
        if (nextView2 == currentFocus) goto L64;
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent nextParent = nextView2.getParent();
    L57:
        if (nextParent == null) goto L60;
        if (nextParent == focusedChild) goto L60;
        nextParent = nextParent.getParent();
    L60:
        if (nextParent != null) goto L63;
        return false;
    L63:
        return FocusInteropUtils_androidKt.requestInteropFocus(nextView2, Integer.valueOf(direction2), focusedRect);
    L64:
        return false;
    L42:
        if (androidViewsHandler.hasFocus() == false) goto L44;
        focusedRect = null;
        nextView2 = focusFinder.findNextFocus(root, currentFocus, direction2);
        goto L53
    L66:
        throw new IllegalStateException("view hasFocus but root can't find it".toString());
    L68:
        throw new IllegalStateException("Invalid focus direction".toString());
    }

    private final Rect onFetchFocusRect() {
        if (isFocused() == true) goto L10;
        View r0 = findFocus();
        if (r0 != null) goto L11;
        return null;
    L11:
        return FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(r0, this);
    L10:
        return getFocusOwner().getFocusRect();
    }

    private final View findNextNonChildView(int direction) {
        AndroidComposeView currentView = this;
        FocusFinder focusFinder = FocusFinder.getInstance();
    L3:
        if (currentView == null) goto L9;
        View r2 = getRootView();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type android.view.ViewGroup");
        currentView = focusFinder.findNextFocus((ViewGroup) r2, currentView, direction);
        if (currentView == null) goto L3;
        if (AndroidComposeView_androidKt.access$containsDescendant(this, currentView) == true) goto L3;
        return currentView;
    L9:
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // androidx.compose.ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.contentCaptureManager;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager r1) {
        this.contentCaptureManager = r1;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> r1) {
        this.configurationChangeObserver = r1;
    }

    public final AndroidAutofillManager get_autofillManager$ui_release() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean r1) {
        this.showLayoutBounds = r1;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler != null) goto L5;
        this._androidViewsHandler = new AndroidViewsHandler(getContext());
        addView(this._androidViewsHandler);
        requestLayout();
    L5:
        AndroidViewsHandler r0 = this._androidViewsHandler;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long r1) {
        this.lastMatrixRecalculationAnimationTime = r1;
    }

    private final ViewTreeOwners get_viewTreeOwners() {
        State $this$getValue$iv = this._viewTreeOwners$delegate;
        return (ViewTreeOwners) $this$getValue$iv.getValue();
    }

    private final void set_viewTreeOwners(ViewTreeOwners r4) {
        MutableState $this$setValue$iv = this._viewTreeOwners$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final ViewTreeOwners getViewTreeOwners() {
        State $this$getValue$iv = this.viewTreeOwners$delegate;
        return (ViewTreeOwners) $this$getValue$iv.getValue();
    }

    static final void globalLayoutListener$lambda$6(AndroidComposeView this$0) {
        this$0.updatePositionCacheAndDispatch();
    }

    static final void scrollChangedListener$lambda$7(AndroidComposeView this$0) {
        this$0.updatePositionCacheAndDispatch();
    }

    static final void touchModeChangeListener$lambda$8(AndroidComposeView this$0, boolean touchMode) {
        InputModeManagerImpl r0 = this$0._inputModeManager;
        InputMode.Companion r1 = InputMode.Companion;
        if (touchMode == false) goto L5;
        int r2 = r1.m5128getTouchaOaMEAU();
    L6:
        r0.m5131setInputModeiuPiT84(r2);
        return;
    L5:
        r2 = r1.m5127getKeyboardaOaMEAU();
        goto L6
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public Object textInputSession(Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> r7, Continuation<?> r8) {
        if ((r8 instanceof C06491) == false) goto L7;
        C06491 r0 = (C06491) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L17:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        AtomicReference<SessionMutex.Session<T>> r4 = this.textInputSessionMutex;
        Function1<CoroutineScope, AndroidPlatformTextInputSession> r5 = new AnonymousClass2(this);
        r0.label = 1;
        if (SessionMutex.m3952withSessionCancellingPreviousimpl(r4, r5, r7, r0) != r2) goto L17;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06491(this, r8);
        goto L8
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    private void setFontFamilyResolver(FontFamily.Resolver r4) {
        MutableState $this$setValue$iv = this.fontFamilyResolver$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        State $this$getValue$iv = this.fontFamilyResolver$delegate;
        return (FontFamily.Resolver) $this$getValue$iv.getValue();
    }

    private final int getFontWeightAdjustmentCompat(Configuration $this$fontWeightAdjustmentCompat) {
        if (Build.VERSION.SDK_INT >= 31) goto L7;
        return 0;
    L7:
        return $this$fontWeightAdjustmentCompat.fontWeightAdjustment;
    }

    private void setLayoutDirection(LayoutDirection r4) {
        MutableState $this$setValue$iv = this.layoutDirection$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        State $this$getValue$iv = this.layoutDirection$delegate;
        return (LayoutDirection) $this$getValue$iv.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    static final void sendHoverExitEvent$lambda$10(AndroidComposeView this$0) {
        boolean r0 = false;
        this$0.hoverExitReceived = false;
        MotionEvent lastEvent = this$0.previousMotionEvent;
        Intrinsics.checkNotNull(lastEvent);
        if (lastEvent.getActionMasked() != 10) goto L5;
        r0 = true;
    L5:
        if (r0 == false) goto L9;
        this$0.m6084sendMotionEvent8iAsVTc(lastEvent);
        return;
    L9:
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect focusRect = onFetchFocusRect();
        if (focusRect == null) goto L6;
        float $this$fastRoundToInt$iv = focusRect.getLeft();
        rect.left = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = focusRect.getTop();
        rect.top = Math.round($this$fastRoundToInt$iv2);
        float $this$fastRoundToInt$iv3 = focusRect.getRight();
        rect.right = Math.round($this$fastRoundToInt$iv3);
        float $this$fastRoundToInt$iv4 = focusRect.getBottom();
        rect.bottom = Math.round($this$fastRoundToInt$iv4);
        return;
    L6:
        if (Intrinsics.areEqual(getFocusOwner().mo4027focusSearchULY8qGw(FocusDirection.Companion.m4013getDowndhqQ8s(), null, C06441.INSTANCE), true) == true) goto L8;
        rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        return;
    L8:
        super.getFocusedRect(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(structure, getView());
        return;
    L8:
        super.dispatchProvideStructure(structure);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        if (Build.VERSION.SDK_INT < 31) goto L10;
        ScrollCapture r0 = this.scrollCapture;
        if (r0 != null) goto L9;
        return false;
    L9:
        return r0.getScrollCaptureInProgress();
    L10:
        return false;
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect localVisibleRect, Point windowOffset, Consumer<ScrollCaptureTarget> r7) {
        if (Build.VERSION.SDK_INT < 31) goto L8;
        ScrollCapture r0 = this.scrollCapture;
        if (r0 == null) goto L9;
        r0.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), r7);
        return;
    L9:
        return;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        setShowLayoutBounds(Companion.access$getIsShowingLayoutBounds(Companion));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        if (focused == null) goto L35;
        if (this.measureAndLayoutDelegate.getDuringMeasureLayout$ui_release() == true) goto L35;
        View nextView = FocusFinder.getInstance().findNextFocus(this, focused, direction);
        if (focused != this) goto L11;
        Rect focusedBounds = getFocusOwner().getFocusRect();
        if (focusedBounds != null) goto L12;
        focusedBounds = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(focused, this);
    L12:
        FocusDirection r2 = FocusInteropUtils_androidKt.toFocusDirection(direction);
        if (r2 == null) goto L15;
        int focusDirection = r2.m4012unboximpl();
    L16:
        final Ref.ObjectRef focusTarget = new Ref.ObjectRef();
        Boolean searchResult = getFocusOwner().mo4027focusSearchULY8qGw(focusDirection, focusedBounds, new AndroidComposeView$focusSearch$searchResult$1(focusTarget));
        if (searchResult == null) goto L36;
        if (focusTarget.element != 0) goto L23;
        if (nextView == null) goto L36;
    L33:
        return nextView;
    L23:
        if (nextView != null) goto L26;
        return this;
    L26:
        if (FocusOwnerImplKt.m4033is1dFocusSearch3ESFkO8(focusDirection) == true) goto L38;
        T r5 = focusTarget.element;
        Intrinsics.checkNotNull(r5);
        if (TwoDimensionalFocusSearchKt.m4073isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) r5), FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(nextView, this), focusedBounds, focusDirection) == false) goto L33;
        return this;
    L38:
        return super.focusSearch(focused, direction);
    L36:
        return focused;
    L15:
        focusDirection = FocusDirection.Companion.m4013getDowndhqQ8s();
        goto L16
    L11:
        focusedBounds = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(focused, this);
    L35:
        return super.focusSearch(focused, direction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) {
        Rect r1 = null;
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L21;
        if (isFocused() == false) goto L8;
        return true;
    L8:
        if (getFocusOwner().getRootState().getHasFocus() == true) goto L10;
        FocusDirection r0 = FocusInteropUtils_androidKt.toFocusDirection(direction);
        if (r0 == null) goto L14;
        final int focusDirection = r0.m4012unboximpl();
    L15:
        FocusOwner r2 = getFocusOwner();
        if (previouslyFocusedRect == null) goto L19;
        r1 = RectHelper_androidKt.toComposeRect(previouslyFocusedRect);
    L19:
        return Intrinsics.areEqual(r2.mo4027focusSearchULY8qGw(focusDirection, r1, new C06481(focusDirection)), true);
    L14:
        focusDirection = FocusDirection.Companion.m4014getEnterdhqQ8s();
        goto L15
    L10:
        return super.requestFocus(direction, previouslyFocusedRect);
    L21:
        if (isFocused() == false) goto L24;
        return true;
    L24:
        if (this.processingRequestFocusForNextNonChildView == false) goto L27;
        return false;
    L27:
        if (getFocusOwner().getFocusTransactionManager().getOngoingTransaction() == false) goto L29;
        return false;
    L29:
        FocusDirection r3 = FocusInteropUtils_androidKt.toFocusDirection(direction);
        if (r3 == null) goto L32;
        final int focusDirection2 = r3.m4012unboximpl();
    L34:
        if (hasFocus() == true) goto L36;
    L38:
        final Ref.BooleanRef foundFocusable = new Ref.BooleanRef();
        FocusOwner r6 = getFocusOwner();
        if (previouslyFocusedRect == null) goto L41;
        Rect r7 = RectHelper_androidKt.toComposeRect(previouslyFocusedRect);
    L42:
        Boolean focusSearchResult = r6.mo4027focusSearchULY8qGw(focusDirection2, r7, new AndroidComposeView$requestFocus$focusSearchResult$1(foundFocusable, focusDirection2));
        if (focusSearchResult != null) goto L46;
        return false;
    L46:
        if (focusSearchResult.booleanValue() == false) goto L49;
        return true;
    L49:
        if (foundFocusable.element == false) goto L51;
        return false;
    L51:
        if (previouslyFocusedRect != null) goto L53;
    L57:
        View nextFocusedView = findNextNonChildView(direction);
        if (nextFocusedView == null) goto L63;
        if (nextFocusedView == this) goto L63;
        this.processingRequestFocusForNextNonChildView = true;
        boolean requestFocusResult = nextFocusedView.requestFocus(direction);
        this.processingRequestFocusForNextNonChildView = false;
        return requestFocusResult;
    L63:
        return true;
    L53:
        if (hasFocus() == true) goto L57;
        Boolean altFocus = getFocusOwner().mo4027focusSearchULY8qGw(focusDirection2, null, new AndroidComposeView$requestFocus$altFocus$1(focusDirection2));
        if (Intrinsics.areEqual(altFocus, true) == false) goto L57;
        return true;
    L41:
        r7 = null;
        goto L42
    L36:
        if (m6081onMoveFocusInChildren3ESFkO8(focusDirection2) == false) goto L38;
        return true;
    L32:
        focusDirection2 = FocusDirection.Companion.m4014getEnterdhqQ8s();
        goto L34
    }

    /* JADX INFO: renamed from: onRequestFocusForOwner-7o62pno, reason: not valid java name */
    private final boolean m6082onRequestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        if (isFocused() == false) goto L5;
        return true;
    L5:
        if (hasFocus() == true) goto L20;
        if (focusDirection == null) goto L12;
        Integer r0 = FocusInteropUtils_androidKt.m4021toAndroidFocusDirection3ESFkO8(focusDirection.m4012unboximpl());
        if (r0 == null) goto L12;
        int r1 = r0.intValue();
    L13:
        if (previouslyFocusedRect == null) goto L15;
        android.graphics.Rect r2 = RectHelper_androidKt.toAndroidRect(previouslyFocusedRect);
    L17:
        return super.requestFocus(r1, r2);
    L15:
        r2 = null;
    L12:
        r1 = 130;
        goto L13
    L20:
        return true;
    }

    private final void onClearFocusForOwner() {
        if (isFocused() == false) goto L5;
    L15:
        super.clearFocus();
        return;
    L5:
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L10;
        if (hasFocus() == true) goto L15;
    L10:
        if (hasFocus() == false) goto L17;
        View r0 = findFocus();
        if (r0 == null) goto L14;
        r0.clearFocus();
    L14:
        super.clearFocus();
        return;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus == false) goto L5;
        return;
    L5:
        if (hasFocus() == true) goto L9;
        getFocusOwner().releaseFocus();
        return;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        this._windowInfo.setWindowFocused(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus == false) goto L8;
        boolean newShowLayoutBounds = Companion.access$getIsShowingLayoutBounds(Companion);
        if (getShowLayoutBounds() == newShowLayoutBounds) goto L10;
        setShowLayoutBounds(newShowLayoutBounds);
        invalidateDescendants();
        return;
    L10:
        return;
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo6038sendKeyEventZmokQxo(KeyEvent keyEvent) {
        if (getFocusOwner().mo4025dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) == false) goto L5;
    L8:
        return true;
    L5:
        if (FocusOwner.m4023dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null) == true) goto L8;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (isFocused() == false) goto L12;
        this._windowInfo.m6133setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m5651constructorimpl(event.getMetaState()));
        if (FocusOwner.m4023dispatchKeyEventYhN2O0w$default(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.m5429constructorimpl(event), null, 2, null) == false) goto L7;
    L10:
        return true;
    L7:
        if (super.dispatchKeyEvent(event) == true) goto L10;
        return false;
    L12:
        return getFocusOwner().mo4026dispatchKeyEventYhN2O0w(androidx.compose.ui.input.key.KeyEvent.m5429constructorimpl(event), new C06431(this, event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        if (isFocused() == false) goto L7;
        if (getFocusOwner().mo4025dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m5429constructorimpl(event)) == false) goto L7;
    L8:
        return true;
    L7:
        if (super.dispatchKeyEventPreIme(event) == true) goto L8;
        return false;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean enable) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(enable);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(intervalMillis);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(LayoutNode node) {
        getLayoutNodes().set(node.getSemanticsId(), node);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(LayoutNode node) {
        if (autofillSupported() == true) goto L5;
        return;
    L5:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L11;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L12;
        r0.onPostAttach$ui_release(node);
        return;
    L12:
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode node) {
        getLayoutNodes().remove(node.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
        if (ComposeUiFlags.isRectTrackingEnabled == false) goto L6;
        getRectManager().remove(node);
    L6:
        if (autofillSupported() == true) goto L8;
        return;
    L8:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L14;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L15;
        r0.onDetach$ui_release(node);
        return;
    L15:
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(LayoutNode node) {
        if (autofillSupported() == true) goto L5;
        return;
    L5:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L11;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L12;
        r0.requestAutofill$ui_release(node);
        return;
    L12:
        return;
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested == false) goto L5;
        getSnapshotObserver().clearInvalidObservations$ui_release();
        this.observationClearRequested = false;
    L5:
        AndroidViewsHandler childAndroidViews = this._androidViewsHandler;
        if (childAndroidViews == null) goto L9;
        clearChildInvalidObservations(childAndroidViews);
    L9:
        if (autofillSupported() == false) goto L16;
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L16;
        AndroidAutofillManager r2 = this._autofillManager;
        if (r2 == null) goto L16;
        r2.onEndApplyChanges$ui_release();
    L16:
        if (this.endApplyChangesListeners.isNotEmpty() == false) goto L27;
        if (this.endApplyChangesListeners.get(0) == null) goto L34;
        int size = this.endApplyChangesListeners.getSize();
        int i = 0;
    L20:
        MutableObjectList<Function0<Unit>> r4 = this.endApplyChangesListeners;
        if (i >= size) goto L26;
        Function0<Unit> r5 = r4.get(i);
        this.endApplyChangesListeners.set(i, null);
        if (r5 == null) goto L25;
        r5.invoke();
    L25:
        i = i + 1;
        goto L20
    L26:
        r4.removeRange(0, size);
        goto L16
    L34:
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(Function0<Unit> r3) {
        if (this.endApplyChangesListeners.contains(r3) == true) goto L6;
        this.endApplyChangesListeners.add(r3);
        return;
    }

    /* JADX INFO: renamed from: startDrag-12SF9DM, reason: not valid java name */
    private final boolean m6085startDrag12SF9DM(DragAndDropTransferData transferData, long decorationSize, Function1<? super DrawScope, Unit> r11) {
        Resources $this$startDrag_12SF9DM_u24lambda_u2412 = getContext().getResources();
        Density density = DensityKt.Density($this$startDrag_12SF9DM_u24lambda_u2412.getDisplayMetrics().density, $this$startDrag_12SF9DM_u24lambda_u2412.getConfiguration().fontScale);
        ComposeDragShadowBuilder shadowBuilder = new ComposeDragShadowBuilder(density, decorationSize, r11, null);
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, transferData, shadowBuilder);
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int i = 0;
        int r1 = viewGroup.getChildCount();
    L3:
        if (i >= r1) goto L11;
        View child = viewGroup.getChildAt(i);
        if ((child instanceof AndroidComposeView) == false) goto L8;
        ((AndroidComposeView) child).onEndApplyChanges();
    L10:
        i = i + 1;
        goto L3
    L8:
        if ((child instanceof ViewGroup) == false) goto L10;
        clearChildInvalidObservations((ViewGroup) child);
        goto L10
    }

    private final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        boolean r0 = Intrinsics.areEqual(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release());
        AndroidComposeViewAccessibilityDelegateCompat r1 = this.composeAccessibilityDelegate;
        if (r0 == false) goto L9;
        int it = r1.getIdToBeforeMap$ui_release().getOrDefault(virtualViewId, -1);
        if (it == (-1)) goto L16;
        info.getExtras().putInt(extraDataKey, it);
        return;
    L16:
        return;
    L9:
        if (Intrinsics.areEqual(extraDataKey, r1.getExtraDataTestTraversalAfterVal$ui_release()) == false) goto L14;
        int it2 = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().getOrDefault(virtualViewId, -1);
        if (it2 == (-1)) goto L18;
        info.getExtras().putInt(extraDataKey, it2);
        return;
    L18:
        return;
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        Intrinsics.checkNotNull(child);
        ViewGroup.LayoutParams r0 = child.getLayoutParams();
        if (r0 != null) goto L5;
        r0 = generateDefaultLayoutParams();
    L5:
        addView(child, index, r0);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams it = generateDefaultLayoutParams();
        it.width = width;
        it.height = height;
        Unit r1 = Unit.INSTANCE;
        addView(child, -1, it);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    public final void addAndroidView(AndroidViewHolder view, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(view, new AnonymousClass1(this, layoutNode, this));
    }

    public final void removeAndroidView(final AndroidViewHolder view) {
        registerOnEndApplyChangesListener(new C06471(this, view));
    }

    public final void drawAndroidView(AndroidViewHolder view, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView r0, LayoutNode r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.scheduleMeasureAndLayout(r1);
    }

    private final void scheduleMeasureAndLayout(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() == false) goto L5;
        return;
    L5:
        if (isAttachedToWindow() == false) goto L30;
        if (nodeToRemeasure == null) goto L19;
        LayoutNode node = nodeToRemeasure;
    L8:
        if (node == null) goto L15;
        if (node.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L15;
        if (childSizeCanAffectParentSize(node) == false) goto L15;
        node = node.getParent$ui_release();
    L15:
        if (node != getRoot()) goto L19;
        requestLayout();
        return;
    L19:
        if (getWidth() != 0) goto L21;
    L24:
        requestLayout();
        return;
    L21:
        if (getHeight() == 0) goto L24;
        invalidate();
        return;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode $this$childSizeCanAffectParentSize) {
        if (this.wasMeasuredWithMultipleConstraints == true) goto L15;
        LayoutNode r0 = $this$childSizeCanAffectParentSize.getParent$ui_release();
        if (r0 != null) goto L7;
    L9:
        boolean r1 = false;
    L10:
        if (r1 == false) goto L14;
        return true;
    L14:
        return false;
    L7:
        if (r0.getHasFixedInnerContentConstraints$ui_release() == true) goto L9;
        r1 = true;
        goto L10
    L15:
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() == false) goto L5;
    L6:
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (sendPointerUpdate == true) goto L20;
        Function0<Unit> r4 = null;
    L12:
        boolean rootNodeResized = this.measureAndLayoutDelegate.measureAndLayout(r4);     // Catch: Throwable -> L9
        if (rootNodeResized == false) goto L15;
        requestLayout();     // Catch: Throwable -> L9
    L15:
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);     // Catch: Throwable -> L9
        dispatchPendingInteropLayoutCallbacks();     // Catch: Throwable -> L9
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L9
        Trace.endSection();
        return;
    L9:
        th = move-exception;
        Trace.endSection();
        throw th;
    L20:
        r4 = this.resendMotionEventOnLayout;     // Catch: Throwable -> L9
        goto L12
    L5:
        if (this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks() == true) goto L6;
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo6037measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        this.measureAndLayoutDelegate.m5924measureAndLayout0kLqBqw(layoutNode, constraints);     // Catch: Throwable -> L12
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() == true) goto L7;
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);     // Catch: Throwable -> L12
        dispatchPendingInteropLayoutCallbacks();     // Catch: Throwable -> L12
    L7:
        if (ComposeUiFlags.isRectTrackingEnabled == false) goto L9;
        getRectManager().dispatchCallbacks();     // Catch: Throwable -> L12
    L9:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L12
        Trace.endSection();
        return;
    L12:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch == false) goto L6;
        getViewTreeObserver().dispatchOnGlobalLayout();
        this.isPendingInteropViewLayoutChangeDispatch = false;
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        MeasureAndLayoutDelegate r0 = this.measureAndLayoutDelegate;
        if (affectsLookahead == false) goto L9;
        if (r0.requestLookaheadRemeasure(layoutNode, forceRequest) == false) goto L13;
        if (scheduleMeasureAndLayout == false) goto L14;
        scheduleMeasureAndLayout(layoutNode);
        return;
    L14:
        return;
    L13:
        return;
    L9:
        if (r0.requestRemeasure(layoutNode, forceRequest) == false) goto L16;
        if (scheduleMeasureAndLayout == false) goto L17;
        scheduleMeasureAndLayout(layoutNode);
        return;
    L17:
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        MeasureAndLayoutDelegate r0 = this.measureAndLayoutDelegate;
        if (affectsLookahead == false) goto L8;
        if (r0.requestLookaheadRelayout(layoutNode, forceRequest) == false) goto L11;
        scheduleMeasureAndLayout$default(this, null, 1, null);
        return;
    L11:
        return;
    L8:
        if (r0.requestRelayout(layoutNode, forceRequest) == false) goto L13;
        scheduleMeasureAndLayout$default(this, null, 1, null);
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
    L25:
        th = th;
    L27:
        Trace.endSection();
        throw th;
    L4:
        if (isAttachedToWindow() == true) goto L6;
        invalidateLayoutNodeMeasurement(getRoot());     // Catch: Throwable -> L25
    L6:
        long $this$component2_u2dVKZWuLQ$iv = m6079convertMeasureSpecI7RO_PI(widthMeasureSpec);     // Catch: Throwable -> L25
        int minWidth = (int) ULong.m7599constructorimpl($this$component2_u2dVKZWuLQ$iv >>> 32);     // Catch: Throwable -> L25
        int maxWidth = (int) ULong.m7599constructorimpl($this$component2_u2dVKZWuLQ$iv & 4294967295L);
        long $this$component2_u2dVKZWuLQ$iv2 = m6079convertMeasureSpecI7RO_PI(heightMeasureSpec);     // Catch: Throwable -> L23
        int minHeight = (int) ULong.m7599constructorimpl($this$component2_u2dVKZWuLQ$iv2 >>> 32);     // Catch: Throwable -> L23
        int maxHeight = (int) ULong.m7599constructorimpl($this$component2_u2dVKZWuLQ$iv2 & 4294967295L);     // Catch: Throwable -> L23
        long constraints = Constraints.Companion.m6934fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);     // Catch: Throwable -> L23
        boolean r9 = false;
        if (this.onMeasureConstraints != null) goto L11;
        this.onMeasureConstraints = Constraints.m6913boximpl(constraints);     // Catch: Throwable -> L23
        this.wasMeasuredWithMultipleConstraints = false;     // Catch: Throwable -> L23
    L17:
        this.measureAndLayoutDelegate.m5925updateRootConstraintsBRTryo0(constraints);     // Catch: Throwable -> L23
        this.measureAndLayoutDelegate.measureOnly();     // Catch: Throwable -> L23
        setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());     // Catch: Throwable -> L23
        if (this._androidViewsHandler == null) goto L20;
        getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));     // Catch: Throwable -> L23
    L20:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L23
        Trace.endSection();
        return;
    L11:
        Constraints r7 = this.onMeasureConstraints;     // Catch: Throwable -> L23
        if (r7 == null) goto L15;
        r9 = Constraints.m6919equalsimpl0(r7.m6932unboximpl(), constraints);     // Catch: Throwable -> L23
    L15:
        if (r9 == true) goto L17;
        this.wasMeasuredWithMultipleConstraints = true;     // Catch: Throwable -> L23
    L23:
        th = th;
        goto L27
    }

    /* JADX INFO: renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m6077component1VKZWuLQ(long $this$component1_u2dVKZWuLQ) {
        return (int) ULong.m7599constructorimpl($this$component1_u2dVKZWuLQ >>> 32);
    }

    /* JADX INFO: renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m6078component2VKZWuLQ(long $this$component2_u2dVKZWuLQ) {
        return (int) ULong.m7599constructorimpl(4294967295L & $this$component2_u2dVKZWuLQ);
    }

    /* JADX INFO: renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m6083packZIaKswc(int a, int b) {
        return ULong.m7599constructorimpl(ULong.m7599constructorimpl(ULong.m7599constructorimpl(a) << 32) | ULong.m7599constructorimpl(b));
    }

    /* JADX INFO: renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m6079convertMeasureSpecI7RO_PI(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        switch(mode) {
            case -2147483648: goto L9;
            case 0: goto L11;
            case 1073741824: goto L10;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException();
    L10:
        return m6083packZIaKswc(size, size);
    L11:
        return m6083packZIaKswc(0, Integer.MAX_VALUE);
    L9:
        return m6083packZIaKswc(0, size);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.lastMatrixRecalculationAnimationTime = 0;
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler == null) goto L6;
        getAndroidViewsHandler$ui_release().layout(0, 0, r - l, b - t);
        return;
    }

    private final void updatePositionCacheAndDispatch() {
        boolean positionChanged = false;
        getLocationOnScreen(this.tmpPositionArray);
        long r1 = this.globalPosition;
        int r3 = IntOffset.m7101getXimpl(r1);
        int globalY = IntOffset.m7102getYimpl(r1);
        if (r3 == this.tmpPositionArray[0]) goto L5;
    L8:
        int x$iv = this.tmpPositionArray[0];
        int y$iv = this.tmpPositionArray[1];
        this.globalPosition = IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
        if (r3 == Integer.MAX_VALUE) goto L12;
        if (globalY == Integer.MAX_VALUE) goto L12;
        positionChanged = true;
        getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
    L12:
        recalculateWindowPosition();
        getRectManager().m6206updateOffsetsucfNpQE(this.globalPosition, IntOffsetKt.m7118roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix);
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(positionChanged);
        if (ComposeUiFlags.isRectTrackingEnabled == false) goto L16;
        getRectManager().dispatchCallbacks();
        return;
    L16:
        return;
    L5:
        if (globalY != this.tmpPositionArray[1]) goto L8;
        if (this.lastMatrixRecalculationAnimationTime >= 0) goto L12;
        goto L8
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(Function2<? super androidx.compose.ui.graphics.Canvas, ? super GraphicsLayer, Unit> r10, Function0<Unit> r11, GraphicsLayer explicitLayer, boolean forceUseOldLayers) {
        if (explicitLayer == null) goto L6;
        return new GraphicsLayerOwnerLayer(explicitLayer, null, this, r10, r11);
    L6:
        if (forceUseOldLayers == true) goto L14;
        OwnedLayer layer = this.layerCache.pop();
        if (layer == null) goto L12;
        layer.reuseLayer(r10, r11);
        return layer;
    L12:
        return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, r10, r11);
    L14:
        if (isHardwareAccelerated() == false) goto L22;
        if (this.isRenderNodeCompatible == false) goto L22;
        return new RenderNodeLayer(this, r10, r11);
    L20:
        this.isRenderNodeCompatible = false;
    L22:
        if (this.viewLayersContainer == null) goto L24;
    L31:
        DrawChildContainer r12 = this.viewLayersContainer;
        Intrinsics.checkNotNull(r12);
        return new ViewLayer(this, r12, r10, r11);
    L24:
        if (ViewLayer.Companion.getHasRetrievedMethod() == true) goto L27;
        ViewLayer.Companion.updateDisplayList(new View(getContext()));
    L27:
        if (ViewLayer.Companion.getShouldUseDispatchDraw() == false) goto L29;
        ViewLayerContainer r13 = new DrawChildContainer(getContext());
    L30:
        this.viewLayersContainer = r13;
        addView(this.viewLayersContainer);
        goto L31
    L29:
        r13 = new ViewLayerContainer(getContext());
        goto L30
    }

    public final boolean recycle$ui_release(OwnedLayer layer) {
        if (this.viewLayersContainer == null) goto L8;
        if (ViewLayer.Companion.getShouldUseDispatchDraw() == false) goto L8;
    L8:
        if (1 == 0) goto L10;
        this.layerCache.push(layer);
    L10:
        this.dirtyLayers.remove(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        this.contentCaptureManager.onSemanticsChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled == false) goto L6;
        getRectManager().remove(layoutNode);
    L6:
        if (autofillSupported() == true) goto L8;
        return;
    L8:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L14;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L15;
        r0.onLayoutNodeDeactivated$ui_release(layoutNode);
        return;
    L15:
        return;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
        getLayoutNodes().remove(oldSemanticsId);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
        if (autofillSupported() == true) goto L5;
    L9:
        getRectManager().m6205onLayoutPositionChanged70tqf50(layoutNode, layoutNode.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().m5930getLastPositionnOccac$ui_release(), true);
        return;
    L5:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L9;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L9;
        r0.onPostLayoutNodeReused$ui_release(layoutNode, oldSemanticsId);
        goto L9
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(listener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo6036getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        long r0 = KeyEvent_androidKt.m5445getKeyZmokQxo(keyEvent);
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5373getTabEK5gGoQ()) == false) goto L10;
        if (KeyEvent_androidKt.m5451isShiftPressedZmokQxo(keyEvent) == false) goto L7;
        int r1 = FocusDirection.Companion.m4018getPreviousdhqQ8s();
    L44:
        return FocusDirection.m4006boximpl(r1);
    L7:
        r1 = FocusDirection.Companion.m4017getNextdhqQ8s();
        goto L44
    L10:
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5214getDirectionRightEK5gGoQ()) == false) goto L13;
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4019getRightdhqQ8s());
    L13:
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5213getDirectionLeftEK5gGoQ()) == true) goto L46;
        boolean r3 = true;
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5215getDirectionUpEK5gGoQ()) == false) goto L18;
        boolean r2 = true;
    L19:
        if (r2 == false) goto L22;
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4020getUpdhqQ8s());
    L22:
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5210getDirectionDownEK5gGoQ()) == false) goto L24;
        boolean r4 = true;
    L25:
        if (r4 == false) goto L28;
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4013getDowndhqQ8s());
    L28:
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5209getDirectionCenterEK5gGoQ()) == false) goto L30;
        boolean r5 = true;
    L31:
        if (r5 == false) goto L33;
        boolean r6 = true;
    L34:
        if (r6 == false) goto L37;
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4014getEnterdhqQ8s());
    L37:
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5152getBackEK5gGoQ()) == true) goto L40;
        r3 = Key.m5137equalsimpl0(r0, Key.Companion.m5226getEscapeEK5gGoQ());
    L40:
        if (r3 == true) goto L50;
        return null;
    L50:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4015getExitdhqQ8s());
    L33:
        r6 = Key.m5137equalsimpl0(r0, Key.Companion.m5315getNumPadEnterEK5gGoQ());
        goto L34
    L30:
        r5 = Key.m5137equalsimpl0(r0, Key.Companion.m5223getEnterEK5gGoQ());
        goto L31
    L24:
        r4 = Key.m5137equalsimpl0(r0, Key.Companion.m5325getPageDownEK5gGoQ());
        goto L25
    L18:
        r2 = Key.m5137equalsimpl0(r0, Key.Companion.m5326getPageUpEK5gGoQ());
        goto L19
    L46:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4016getLeftdhqQ8s());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (isAttachedToWindow() == true) goto L5;
        invalidateLayers(getRoot());
    L5:
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.notifyObjectsInitialized();
        this.isDrawingContent = true;
        CanvasHolder this_$iv = this.canvasHolder;
        Canvas previousCanvas$iv = this_$iv.getAndroidCanvas().getInternalCanvas();
        this_$iv.getAndroidCanvas().setInternalCanvas(canvas);
        androidx.compose.ui.graphics.Canvas $this$dispatchDraw_u24lambda_u2419 = this_$iv.getAndroidCanvas();
        getRoot().draw$ui_release($this$dispatchDraw_u24lambda_u2419, null);
        this_$iv.getAndroidCanvas().setInternalCanvas(previousCanvas$iv);
        if (this.dirtyLayers.isEmpty() == true) goto L11;
        int i = 0;
        int r2 = this.dirtyLayers.size();
    L8:
        if (i >= r2) goto L11;
        OwnedLayer layer = this.dirtyLayers.get(i);
        layer.updateDisplayList();
        i = i + 1;
    L11:
        if (ViewLayer.Companion.getShouldUseDispatchDraw() == false) goto L13;
        int saveCount = canvas.save();
        canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(saveCount);
    L13:
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        if (this.postponedDirtyLayers == null) goto L17;
        List<OwnedLayer> r0 = this.postponedDirtyLayers;
        Intrinsics.checkNotNull(r0);
        this.dirtyLayers.addAll(r0);
        r0.clear();
    L17:
        if (ComposeUiFlags.isRectTrackingEnabled == false) goto L21;
        getRectManager().dispatchCallbacks();
        return;
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer layer, boolean isDirty) {
        boolean r0 = this.isDrawingContent;
        if (isDirty == true) goto L8;
        if (r0 == true) goto L15;
        this.dirtyLayers.remove(layer);
        List<OwnedLayer> r1 = this.postponedDirtyLayers;
        if (r1 == null) goto L16;
        r1.remove(layer);
        return;
    L16:
        return;
    L15:
        return;
    L8:
        if (r0 == true) goto L10;
        this.dirtyLayers.add(layer);
        return;
    L10:
        ArrayList r2 = this.postponedDirtyLayers;
        if (r2 != null) goto L13;
        r2 = new ArrayList();
        this.postponedDirtyLayers = r2;
    L13:
        r2.add(layer);
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, Unit> r3) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null) goto L6;
        r3.invoke(viewTreeOwners);
    L6:
        if (isAttachedToWindow() == true) goto L9;
        this.onViewTreeOwnersAvailable = r3;
        return;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(Continuation<? super Unit> r3) {
        Object r0 = this.contentCaptureManager.boundsUpdatesEventLoop$ui_release(r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object boundsUpdatesAccessibilityEventLoop(Continuation<? super Unit> r3) {
        Object r0 = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode node) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        MutableVector<LayoutNode> r2 = node.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        invalidateLayoutNodeMeasurement(it);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    private final void invalidateLayers(LayoutNode node) {
        node.invalidateLayers$ui_release();
        MutableVector<LayoutNode> r2 = node.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        invalidateLayers(it);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new C06461(this));
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() == false) goto L7;
        AndroidAutofill it = this._autofill;
        if (it == null) goto L7;
        AutofillCallback.INSTANCE.register(it);
    L7:
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners oldViewTreeOwners = getViewTreeOwners();
        if (oldViewTreeOwners == null) goto L17;
        if (lifecycleOwner == null) goto L16;
        if (savedStateRegistryOwner == null) goto L16;
        if (lifecycleOwner != oldViewTreeOwners.getLifecycleOwner()) goto L17;
        if (savedStateRegistryOwner != oldViewTreeOwners.getLifecycleOwner()) goto L17;
    L16:
        boolean resetViewTreeOwner = false;
    L18:
        Lifecycle lifecycle = null;
        if (resetViewTreeOwner == false) goto L36;
        if (lifecycleOwner == null) goto L35;
        if (savedStateRegistryOwner == null) goto L33;
        if (oldViewTreeOwners == null) goto L28;
        LifecycleOwner r5 = oldViewTreeOwners.getLifecycleOwner();
        if (r5 == null) goto L28;
        Lifecycle r6 = r5.getLifecycle();
        if (r6 == null) goto L28;
        r6.removeObserver(this);
    L28:
        lifecycleOwner.getLifecycle().addObserver(this);
        ViewTreeOwners viewTreeOwners = new ViewTreeOwners(lifecycleOwner, savedStateRegistryOwner);
        set_viewTreeOwners(viewTreeOwners);
        Function1<? super ViewTreeOwners, Unit> r7 = this.onViewTreeOwnersAvailable;
        if (r7 == null) goto L31;
        r7.invoke(viewTreeOwners);
    L31:
        this.onViewTreeOwnersAvailable = null;
        goto L36
    L33:
        throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
    L35:
        throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
    L36:
        InputModeManagerImpl r8 = this._inputModeManager;
        if (isInTouchMode() == false) goto L39;
        int r9 = InputMode.Companion.m5128getTouchaOaMEAU();
    L40:
        r8.m5131setInputModeiuPiT84(r9);
        ViewTreeOwners r10 = getViewTreeOwners();
        if (r10 == null) goto L46;
        LifecycleOwner r11 = r10.getLifecycleOwner();
        if (r11 == null) goto L46;
        lifecycle = r11.getLifecycle();
    L46:
        if (lifecycle == null) goto L54;
        lifecycle.addObserver(this);
        lifecycle.addObserver(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT < 31) goto L50;
        AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
    L50:
        AndroidAutofillManager it2 = this._autofillManager;
        if (it2 == null) goto L56;
        getFocusOwner().getListeners().add(it2);
        getSemanticsOwner().getListeners$ui_release().add(it2);
        return;
    L56:
        return;
    L54:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    L39:
        r9 = InputMode.Companion.m5127getKeyboardaOaMEAU();
    L17:
        resetViewTreeOwner = true;
        goto L18
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        Lifecycle lifecycle = null;
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners r0 = getViewTreeOwners();
        if (r0 == null) goto L8;
        LifecycleOwner r1 = r0.getLifecycleOwner();
        if (r1 == null) goto L8;
        lifecycle = r1.getLifecycle();
    L8:
        if (lifecycle == null) goto L21;
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        if (autofillSupported() == false) goto L14;
        AndroidAutofill it = this._autofill;
        if (it == null) goto L14;
        AutofillCallback.INSTANCE.unregister(it);
    L14:
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT < 31) goto L17;
        AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
    L17:
        AndroidAutofillManager it2 = this._autofillManager;
        if (it2 == null) goto L23;
        getSemanticsOwner().getListeners$ui_release().remove(it2);
        getFocusOwner().getListeners().remove(it2);
        return;
    L23:
        return;
    L21:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        if (autofillSupported() == false) goto L14;
        if (structure != null) goto L6;
        return;
    L6:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L10;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L10;
        r0.populateViewStructure(structure);
    L10:
        AndroidAutofill r1 = this._autofill;
        if (r1 == null) goto L16;
        AndroidAutofill_androidKt.populateViewStructure(r1, structure);
        return;
    L16:
        return;
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> r2) {
        if (autofillSupported() == true) goto L5;
        return;
    L5:
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L9;
        AndroidAutofillManager r0 = this._autofillManager;
        if (r0 == null) goto L9;
        r0.performAutofill(r2);
    L9:
        AndroidAutofill r1 = this._autofill;
        if (r1 == null) goto L14;
        AndroidAutofill_androidKt.performAutofill(r1, r2);
        return;
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> r4) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui_release(virtualIds, supportedFormats, r4);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> r3) {
        this.contentCaptureManager.onVirtualViewTranslationResponses$ui_release(this.contentCaptureManager, r3);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived == false) goto L9;
        removeCallbacks(this.sendHoverExitEvent);
        if (motionEvent.getActionMasked() != 8) goto L7;
        this.hoverExitReceived = false;
        goto L9
    L7:
        this.sendHoverExitEvent.run();
    L9:
        if (motionEvent.getActionMasked() != 8) goto L24;
        if (isBadMotionEvent(motionEvent) == true) goto L27;
        if (isAttachedToWindow() == false) goto L27;
        if (motionEvent.isFromSource(4194304) == true) goto L25;
        int arg0$iv = m6080handleMotionEvent8iAsVTc(motionEvent);
        if ((arg0$iv & 1) == 0) goto L28;
        return true;
    L28:
        return false;
    L25:
        return handleRotaryEvent(motionEvent);
    L27:
        return super.dispatchGenericMotionEvent(motionEvent);
    L24:
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived == false) goto L12;
        removeCallbacks(this.sendHoverExitEvent);
        MotionEvent lastEvent = this.previousMotionEvent;
        Intrinsics.checkNotNull(lastEvent);
        if (motionEvent.getActionMasked() == 0) goto L7;
    L10:
        this.sendHoverExitEvent.run();
        goto L12
    L7:
        if (hasChangedDevices(motionEvent, lastEvent) == true) goto L10;
        this.hoverExitReceived = false;
    L12:
        if (isBadMotionEvent(motionEvent) == false) goto L14;
    L31:
        return false;
    L14:
        if (isAttachedToWindow() == false) goto L31;
        if (motionEvent.getActionMasked() == 2) goto L19;
    L21:
        int processResult = m6080handleMotionEvent8iAsVTc(motionEvent);
        if ((processResult & 2) == 0) goto L24;
        int r2 = 1;
    L25:
        if (r2 == 0) goto L28;
        getParent().requestDisallowInterceptTouchEvent(true);
    L28:
        if ((processResult & 1) != 0) goto L30;
        return false;
    L30:
        return true;
    L24:
        r2 = 0;
        goto L25
    L19:
        if (isPositionChanged(motionEvent) == true) goto L21;
        return false;
    }

    private final boolean handleRotaryEvent(final MotionEvent event) {
        android.view.ViewConfiguration config = android.view.ViewConfiguration.get(getContext());
        float axisValue = -event.getAxisValue(26);
        RotaryScrollEvent rotaryEvent = new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(config, getContext()) * axisValue, ViewConfigurationCompat.getScaledHorizontalScrollFactor(config, getContext()) * axisValue, event.getEventTime(), event.getDeviceId());
        return getFocusOwner().dispatchRotaryEvent(rotaryEvent, new C06451(this, event));
    }

    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m6080handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        recalculateWindowPosition(motionEvent);     // Catch: Throwable -> L115
        this.forceUseMatrixCache = true;     // Catch: Throwable -> L115
        measureAndLayout(false);     // Catch: Throwable -> L115
        Trace.beginSection("AndroidOwner:onTouch");     // Catch: Throwable -> L115
        int action = motionEvent.getActionMasked();     // Catch: Throwable -> L112
        MotionEvent lastEvent = this.previousMotionEvent;     // Catch: Throwable -> L112
        if (lastEvent != null) goto L8;
    L10:
        boolean r3 = false;
    L11:
        boolean wasMouseEvent = r3;
        if (lastEvent != null) goto L121;
    L24:
        int r0 = 10;
    L26:
        if (motionEvent.getToolType(0) != 3) goto L28;
        boolean r1 = true;
    L29:
        boolean isMouseEvent = r1;
        if (wasMouseEvent == true) goto L43;
        if (isMouseEvent == false) goto L42;
        if (action == 3) goto L41;
        if (action != 9) goto L35;
        AndroidComposeView r2 = this;
    L44:
        if (lastEvent == 0) goto L46;
        lastEvent.recycle();     // Catch: Throwable -> L112
    L46:
        MotionEvent r4 = r2.previousMotionEvent;     // Catch: Throwable -> L112
        if (r4 != null) goto L49;
    L51:
        boolean r5 = false;
    L52:
        if (r5 == false) goto L106;
        MotionEvent r6 = r2.previousMotionEvent;     // Catch: Throwable -> L112
        if (r6 == null) goto L56;
        int previousEventDefaultPointerId = r6.getPointerId(0);     // Catch: Throwable -> L112
    L58:
        if (motionEvent.getAction() != 9) goto L64;
        if (motionEvent.getHistorySize() != 0) goto L64;
        if (previousEventDefaultPointerId < 0) goto L106;
        r2.motionEventAdapter.endStream(previousEventDefaultPointerId);     // Catch: Throwable -> L112
    L64:
        if (motionEvent.getAction() != 0) goto L106;
        if (motionEvent.getHistorySize() != 0) goto L106;
        MotionEvent r7 = r2.previousMotionEvent;     // Catch: Throwable -> L112
        float previousY = Float.NaN;
        if (r7 == null) goto L70;
        float previousX = r7.getX();     // Catch: Throwable -> L112
    L71:
        MotionEvent r8 = r2.previousMotionEvent;     // Catch: Throwable -> L112
        if (r8 == null) goto L74;
        previousY = r8.getY();     // Catch: Throwable -> L112
    L74:
        float currentX = motionEvent.getX();     // Catch: Throwable -> L112
        float currentY = motionEvent.getY();     // Catch: Throwable -> L112
        if (previousX != currentX) goto L77;
        boolean r9 = true;
    L78:
        if (r9 == true) goto L80;
    L86:
        boolean previousAndCurrentCoordinatesDoNotMatch = true;
    L87:
        MotionEvent r10 = r2.previousMotionEvent;     // Catch: Throwable -> L112
        if (r10 == null) goto L90;
        long previousEventTime = r10.getEventTime();     // Catch: Throwable -> L112
    L92:
        if (previousEventTime == motionEvent.getEventTime()) goto L94;
        boolean previousAndCurrentEventTimesDoNotMatch = true;
    L96:
        if (previousAndCurrentCoordinatesDoNotMatch == true) goto L100;
        if (previousAndCurrentEventTimesDoNotMatch == true) goto L100;
        boolean previousHoverEventWasNotSyntheticallyProducedFromADownEvent = false;
    L102:
        if (previousHoverEventWasNotSyntheticallyProducedFromADownEvent == false) goto L106;
        if (previousEventDefaultPointerId < 0) goto L105;
        r2.motionEventAdapter.endStream(previousEventDefaultPointerId);     // Catch: Throwable -> L112
    L105:
        r2.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();     // Catch: Throwable -> L112
    L100:
        previousHoverEventWasNotSyntheticallyProducedFromADownEvent = true;
        goto L102
    L94:
        previousAndCurrentEventTimesDoNotMatch = false;
        goto L96
    L90:
        previousEventTime = -1;
        goto L92
    L80:
        if (previousY != currentY) goto L82;
        boolean r11 = true;
    L83:
        if (r11 == false) goto L86;
        previousAndCurrentCoordinatesDoNotMatch = false;
        goto L87
    L82:
        r11 = false;
        goto L83
    L77:
        r9 = false;
        goto L78
    L70:
        previousX = Float.NaN;
        goto L71
    L56:
        previousEventDefaultPointerId = -1;
    L106:
        r2.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);     // Catch: Throwable -> L112
        int r12 = m6084sendMotionEvent8iAsVTc(motionEvent);     // Catch: Throwable -> L112
        Trace.endSection();     // Catch: Throwable -> L115
        r2.forceUseMatrixCache = false;
        return r12;
    L49:
        if (r4.getAction() != r0) goto L51;
        r5 = true;
        goto L52
    L35:
        if (isInBounds(motionEvent) == false) goto L39;
        r2 = this;
        sendSimulatedEvent$default(r2, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);     // Catch: Throwable -> L112
    L110:
        th = th;
    L113:
        Trace.endSection();     // Catch: Throwable -> L115
        throw th;     // Catch: Throwable -> L115
    L39:
        r2 = this;
        goto L44
    L41:
        r2 = this;
        goto L44
    L42:
        r2 = this;
        goto L44
    L43:
        r2 = this;
        goto L44
    L28:
        r1 = false;
        goto L29
    L121:
        if (hasChangedDevices(motionEvent, lastEvent) == false) goto L24;
        if (isDevicePressEvent(lastEvent) == false) goto L20;
        this.pointerInputEventProcessor.processCancel();     // Catch: Throwable -> L112
        r0 = 10;
        goto L26
    L20:
        if (lastEvent.getActionMasked() == 10) goto L23;
        if (wasMouseEvent == false) goto L23;
        r0 = 10;
        sendSimulatedEvent$default(this, lastEvent, 10, lastEvent.getEventTime(), false, 8, null);     // Catch: Throwable -> L110
    L23:
        r0 = 10;
        goto L26
    L8:
        if (lastEvent.getToolType(0) != 3) goto L10;
        r3 = true;
    L112:
        th = th;
    L115:
        th = move-exception;
        this.forceUseMatrixCache = false;
        throw th;
    }

    private final boolean hasChangedDevices(MotionEvent event, MotionEvent lastEvent) {
        if (lastEvent.getSource() == event.getSource()) goto L5;
    L6:
        return true;
    L5:
        if (lastEvent.getToolType(0) != event.getToolType(0)) goto L6;
        return false;
    }

    private final boolean isDevicePressEvent(MotionEvent event) {
        if (event.getButtonState() == 0) goto L6;
        return true;
    L6:
        switch(event.getActionMasked()) {
            case 0: goto L10;
            case 2: goto L10;
            case 6: goto L10;
            default: goto L7;
        };
    L7:
        return false;
    L10:
        return true;
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m6084sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        boolean r1 = false;
        if (this.keyboardModifiersRequireUpdate == false) goto L5;
        this.keyboardModifiersRequireUpdate = false;
        this._windowInfo.m6133setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m5651constructorimpl(motionEvent.getMetaState()));
    L5:
        PointerInputEvent pointerInputEvent = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (pointerInputEvent == null) goto L27;
        List<PointerInputEventData> r2 = pointerInputEvent.getPointers();
        int r4 = r2.size() - 1;
        if (r4 < 0) goto L13;
    L9:
        int index$iv = r4;
        r4 = r4 - 1;
        Object item$iv = r2.get(index$iv);
        PointerInputEventData it = (PointerInputEventData) item$iv;
        if (it.getDown() == true) goto L14;
        if (r4 >= 0) goto L9;
    L14:
        PointerInputEventData r6 = (PointerInputEventData) item$iv;
        if (r6 == null) goto L17;
        long it2 = r6.m5605getPositionF1C5BW0();
        this.lastDownPointerPosition = it2;
    L17:
        int result = this.pointerInputEventProcessor.m5610processBIzXfog(pointerInputEvent, this, isInBounds(motionEvent));
        int action = motionEvent.getActionMasked();
        if (action == 0) goto L22;
        if (action == 5) goto L22;
        return result;
    L22:
        if ((result & 1) == 0) goto L24;
        r1 = true;
    L24:
        if (r1 == true) goto L34;
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return result;
    L34:
        return result;
    L13:
        item$iv = null;
        goto L14
    L27:
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView r6, MotionEvent r7, int r8, long r9, boolean r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        boolean r5 = true;
    L6:
        r6.sendSimulatedEvent(r7, r8, r9, r5);
        return;
    L5:
        r5 = r11;
        goto L6
    }

    private final void sendSimulatedEvent(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        MotionEvent r1 = motionEvent;
        int upIndex = -1;
        switch(r1.getActionMasked()) {
            case 1: goto L6;
            case 6: goto L5;
            default: goto L8;
        };
    L5:
        upIndex = r1.getActionIndex();
        goto L8
    L6:
        switch(action) {
            case 9: goto L8;
            case 10: goto L8;
            default: goto L7;
        };
    L7:
        upIndex = 0;
    L8:
        int r2 = r1.getPointerCount();
        if (upIndex < 0) goto L11;
        int r6 = 1;
    L12:
        int pointerCount = r2 - r6;
        if (pointerCount != 0) goto L15;
        return;
    L15:
        MotionEvent.PointerProperties[] pointerProperties = new MotionEvent.PointerProperties[pointerCount];
        int r3 = 0;
    L16:
        if (r3 >= pointerCount) goto L18;
        pointerProperties[r3] = new MotionEvent.PointerProperties();
        r3 = r3 + 1;
        goto L16
    L18:
        MotionEvent.PointerCoords[] pointerCoords = new MotionEvent.PointerCoords[pointerCount];
        int r4 = 0;
    L19:
        if (r4 >= pointerCount) goto L21;
        pointerCoords[r4] = new MotionEvent.PointerCoords();
        r4 = r4 + 1;
        goto L19
    L21:
        int i = 0;
    L22:
        if (i >= pointerCount) goto L30;
        if (upIndex < 0) goto L27;
        if (i < upIndex) goto L27;
        int r7 = 1;
    L28:
        int sourceIndex = r7 + i;
        r1.getPointerProperties(sourceIndex, pointerProperties[i]);
        MotionEvent.PointerCoords coords = pointerCoords[i];
        r1.getPointerCoords(sourceIndex, coords);
        float x$iv = coords.x;
        float y$iv = coords.y;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long localPosition = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        long screenPosition = mo5669localToScreenMKHz9U(localPosition);
        long localPosition2 = screenPosition >> 32;
        int bits$iv$iv$iv = (int) localPosition2;
        coords.x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (screenPosition & 4294967295L);
        coords.y = Float.intBitsToFloat(bits$iv$iv$iv2);
        i = i + 1;
        r1 = motionEvent;
    L27:
        r7 = 0;
        goto L28
    L30:
        if (forceHover == false) goto L32;
        int buttonState = 0;
    L34:
        if (motionEvent.getDownTime() != motionEvent.getEventTime()) goto L36;
        long downTime = eventTime;
    L37:
        MotionEvent event = MotionEvent.obtain(downTime, eventTime, action, pointerCount, pointerProperties, pointerCoords, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEvent = this.motionEventAdapter.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(pointerInputEvent);
        this.pointerInputEventProcessor.m5610processBIzXfog(pointerInputEvent, this, true);
        event.recycle();
        return;
    L36:
        downTime = motionEvent.getDownTime();
        goto L37
    L32:
        buttonState = motionEvent.getButtonState();
        goto L34
    L11:
        r6 = 0;
        goto L12
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.m6093canScroll0AR0LA0$ui_release(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.m6093canScroll0AR0LA0$ui_release(true, direction, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x) goto L5;
    L7:
        boolean r3 = false;
    L8:
        if (r3 == false) goto L18;
        if (0.0f <= y) goto L12;
    L14:
        boolean r2 = false;
    L15:
        if (r2 == false) goto L18;
        return true;
    L12:
        if (y > getHeight()) goto L14;
        r2 = true;
    L18:
        return false;
    L5:
        if (x > getWidth()) goto L7;
        r3 = true;
        goto L8
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5669localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long local = Matrix.m4602mapMKHz9U(this.viewToWindowMatrix, localPosition);
        int bits$iv$iv$iv = (int) (local >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv = this.windowPosition;
        int bits$iv$iv$iv2 = (int) (arg0$iv >> 32);
        float x$iv = r10 + Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (local & 4294967295L);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv2 = this.windowPosition;
        int bits$iv$iv$iv4 = (int) (arg0$iv2 & 4294967295L);
        float y$iv = r13 + Float.intBitsToFloat(bits$iv$iv$iv4);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* JADX INFO: renamed from: localToScreen-58bKbWc */
    public void mo5518localToScreen58bKbWc(float[] localTransform) {
        recalculateWindowPosition();
        Matrix.m4615timesAssign58bKbWc(localTransform, this.viewToWindowMatrix);
        long arg0$iv = this.windowPosition;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r6 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = this.windowPosition;
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        AndroidComposeView_androidKt.m6095access$preTranslatecG2Xzmc(localTransform, r6, Float.intBitsToFloat(bits$iv$iv$iv2), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5670screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        int bits$iv$iv$iv = (int) (positionOnScreen >> 32);
        float r5 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv = this.windowPosition;
        int bits$iv$iv$iv2 = (int) (arg0$iv >> 32);
        float x = r5 - Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (positionOnScreen & 4294967295L);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv2 = this.windowPosition;
        int bits$iv$iv$iv4 = (int) (arg0$iv2 & 4294967295L);
        float y = r8 - Float.intBitsToFloat(bits$iv$iv$iv4);
        float[] r0 = this.windowToViewMatrix;
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return Matrix.m4602mapMKHz9U(r0, Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache == true) goto L14;
        long animationTime = AnimationUtils.currentAnimationTimeMillis();
        if (animationTime == this.lastMatrixRecalculationAnimationTime) goto L12;
        this.lastMatrixRecalculationAnimationTime = animationTime;
        recalculateWindowViewTransforms();
        ViewParent viewParent = getParent();
        AndroidComposeView view = this;
    L8:
        if ((viewParent instanceof ViewGroup) == false) goto L10;
        view = (View) viewParent;
        viewParent = ((ViewGroup) view).getParent();
        goto L8
    L10:
        view.getLocationOnScreen(this.tmpPositionArray);
        float screenX = this.tmpPositionArray[0];
        float screenY = this.tmpPositionArray[1];
        view.getLocationInWindow(this.tmpPositionArray);
        float windowX = this.tmpPositionArray[0];
        float windowY = this.tmpPositionArray[1];
        float x$iv = screenX - windowX;
        float y$iv = screenY - windowY;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = (v1$iv$iv << 32) | (((long) Float.floatToRawIntBits(y$iv)) & 4294967295L);
        this.windowPosition = Offset.m4117constructorimpl(v2$iv$iv);
        return;
    L12:
        return;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] r1 = this.viewToWindowMatrix;
        float x$iv = motionEvent.getX();
        float y$iv = motionEvent.getY();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long positionInWindow = Matrix.m4602mapMKHz9U(r1, Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        int bits$iv$iv$iv = (int) (positionInWindow >> 32);
        float x$iv2 = motionEvent.getRawX() - Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (positionInWindow & 4294967295L);
        float y$iv2 = motionEvent.getRawY() - Float.intBitsToFloat(bits$iv$iv$iv2);
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        this.windowPosition = Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (4294967295L & v2$iv$iv2));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo6099calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m6125invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void updateWindowMetrics() {
        LazyWindowInfo this_$iv = this._windowInfo;
        MutableState it$iv = LazyWindowInfo.access$get_containerSize$p(this_$iv);
        if (it$iv == null) goto L7;
        it$iv.setValue(IntSize.m7136boximpl(AndroidWindowInfo_androidKt.calculateWindowSize(this)));
        return;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession parentSession = (AndroidPlatformTextInputSession) SessionMutex.m3949getCurrentSessionimpl(this.textInputSessionMutex);
        if (parentSession != null) goto L7;
        return this.legacyTextInputServiceAndroid.isEditorFocused();
    L7:
        return parentSession.isReadyForConnection();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AndroidPlatformTextInputSession parentSession = (AndroidPlatformTextInputSession) SessionMutex.m3949getCurrentSessionimpl(this.textInputSessionMutex);
        if (parentSession != null) goto L7;
        return this.legacyTextInputServiceAndroid.createInputConnection(outAttrs);
    L7:
        return parentSession.createInputConnection(outAttrs);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo6034calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return Matrix.m4602mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo6035calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return Matrix.m4602mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setDensity(AndroidDensity_androidKt.Density(getContext()));
        updateWindowMetrics();
        if (getFontWeightAdjustmentCompat(newConfig) == this.currentFontWeightAdjustment) goto L5;
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(newConfig);
        setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
    L5:
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete == false) goto L9;
        LayoutDirection r0 = FocusInteropUtils_androidKt.toLayoutDirection(layoutDirection);
        if (r0 != null) goto L7;
        r0 = LayoutDirection.Ltr;
    L7:
        setLayoutDirection(r0);
        return;
    }

    private final boolean autofillSupported() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.hoverExitReceived == false) goto L6;
        removeCallbacks(this.sendHoverExitEvent);
        this.sendHoverExitEvent.run();
    L6:
        if (isBadMotionEvent(event) == false) goto L8;
    L32:
        return false;
    L8:
        if (isAttachedToWindow() == false) goto L32;
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(event);
        switch(event.getActionMasked()) {
            case 7: goto L26;
            case 10: goto L14;
            default: goto L28;
        };
    L28:
        int result = m6080handleMotionEvent8iAsVTc(event);
        if ((result & 1) != 0) goto L31;
        return false;
    L31:
        return true;
    L14:
        if (isInBounds(event) == false) goto L28;
        if (event.getToolType(0) == 3) goto L18;
    L20:
        MotionEvent r0 = this.previousMotionEvent;
        if (r0 == null) goto L23;
        r0.recycle();
    L23:
        this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
        this.hoverExitReceived = true;
        postDelayed(this.sendHoverExitEvent, 8);
        return false;
    L18:
        if (event.getButtonState() == 0) goto L20;
        return false;
    L26:
        if (isPositionChanged(event) == true) goto L28;
        return false;
    }

    private final boolean isBadMotionEvent(MotionEvent event) {
        float $this$fastIsFinite$iv = event.getX();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L24;
        float $this$fastIsFinite$iv2 = event.getY();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv2) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L24;
        float $this$fastIsFinite$iv3 = event.getRawX();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv3) & Integer.MAX_VALUE) >= 2139095040) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L24;
        float $this$fastIsFinite$iv4 = event.getRawY();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv4) & Integer.MAX_VALUE) >= 2139095040) goto L20;
        boolean r3 = true;
    L21:
        if (r3 == false) goto L24;
        boolean eventInvalid = false;
    L26:
        if (eventInvalid == true) goto L49;
        int index = 1;
        int r4 = event.getPointerCount();
    L28:
        if (index >= r4) goto L49;
        float $this$fastIsFinite$iv5 = event.getX(index);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv5) & Integer.MAX_VALUE) >= 2139095040) goto L32;
        boolean r7 = true;
    L33:
        if (r7 == false) goto L45;
        float $this$fastIsFinite$iv6 = event.getY(index);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv6) & Integer.MAX_VALUE) >= 2139095040) goto L37;
        boolean r8 = true;
    L38:
        if (r8 == false) goto L45;
        if (Build.VERSION.SDK_INT >= 29) goto L42;
    L44:
        boolean r9 = false;
    L46:
        eventInvalid = r9;
        if (eventInvalid == true) goto L49;
        index = index + 1;
        goto L28
    L42:
        if (MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(event, index) == true) goto L44;
    L37:
        r8 = false;
    L45:
        r9 = true;
        goto L46
    L32:
        r7 = false;
    L49:
        return eventInvalid;
    L20:
        r3 = false;
        goto L21
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L24:
        eventInvalid = true;
        goto L26
    L5:
        r0 = false;
        goto L6
    }

    private final boolean isPositionChanged(MotionEvent event) {
        if (event.getPointerCount() == 1) goto L5;
        return true;
    L5:
        MotionEvent lastEvent = this.previousMotionEvent;
        if (lastEvent != null) goto L8;
        return true;
    L8:
        if (lastEvent.getPointerCount() == event.getPointerCount()) goto L10;
        return true;
    L10:
        if (event.getRawX() != lastEvent.getRawX()) goto L12;
        boolean r2 = true;
    L13:
        if (r2 == true) goto L15;
        return true;
    L15:
        if (event.getRawY() != lastEvent.getRawY()) goto L17;
        boolean r3 = true;
    L18:
        if (r3 == true) goto L22;
        return true;
    L22:
        return false;
    L17:
        r3 = false;
        goto L18
    L12:
        r2 = false;
        goto L13
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, View currentView) {
        if (Build.VERSION.SDK_INT >= 29) goto L15;
        Method getAccessibilityViewIdMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        getAccessibilityViewIdMethod.setAccessible(true);
        if (Intrinsics.areEqual(getAccessibilityViewIdMethod.invoke(currentView, new Object[0]), Integer.valueOf(accessibilityId)) == false) goto L8;
        return currentView;
    L8:
        if ((currentView instanceof ViewGroup) == false) goto L19;
        int i = 0;
        int r2 = ((ViewGroup) currentView).getChildCount();
    L10:
        if (i >= r2) goto L20;
        View foundView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, ((ViewGroup) currentView).getChildAt(i));
        if (foundView != null) goto L13;
        i = i + 1;
        goto L10
    L13:
        return foundView;
    L20:
        return null;
    L19:
        return null;
    L15:
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        int toolType = event.getToolType(pointerIndex);
        if (event.isFromSource(InputDeviceCompat.SOURCE_MOUSE) == true) goto L15;
        if (event.isFromSource(InputDeviceCompat.SOURCE_STYLUS) == false) goto L15;
        if (toolType != 2) goto L9;
    L10:
        androidx.compose.ui.input.pointer.PointerIcon icon = getPointerIconService().getStylusHoverIcon();
        if (icon == null) goto L15;
        return AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), icon);
    L9:
        if (toolType == 4) goto L10;
    L15:
        return super.onResolvePointerIcon(event, pointerIndex);
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        Method findViewByAccessibilityIdTraversalMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});     // Catch: NoSuchMethodException -> L11
        findViewByAccessibilityIdTraversalMethod.setAccessible(true);     // Catch: NoSuchMethodException -> L11
        Object r2 = findViewByAccessibilityIdTraversalMethod.invoke(this, new Object[]{Integer.valueOf(accessibilityId)});     // Catch: NoSuchMethodException -> L11
        if ((r2 instanceof View) == false) goto L15;
        return (View) r2;
    L15:
        return null;
    L10:
        return findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
    L12:
        return null;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        ViewTreeOwners r0 = getViewTreeOwners();
        if (r0 == null) goto L9;
        LifecycleOwner r1 = r0.getLifecycleOwner();
        if (r1 == null) goto L9;
        Lifecycle r2 = r1.getLifecycle();
        if (r2 == null) goto L9;
        Lifecycle.State r3 = r2.getCurrentState();
    L11:
        if (r3 != Lifecycle.State.RESUMED) goto L13;
        return true;
    L13:
        return false;
    L9:
        r3 = null;
        goto L11
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) goto L5;
        return;
    L5:
        if (this.sensitiveComponentCount != 0) goto L7;
        AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
    L7:
        this.sensitiveComponentCount++;
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) goto L5;
        return;
    L5:
        if (this.sensitiveComponentCount != 1) goto L7;
        AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
    L7:
        this.sensitiveComponentCount--;
    }
}
