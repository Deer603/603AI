package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 ´\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002´\u0001B7\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0012\u0010c\u001a\u00020\u001b2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010f\u001a\u00020gH\u0016J\u000e\u0010h\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`iJ\n\u0010j\u001a\u0004\u0018\u00010kH\u0016J\b\u0010l\u001a\u00020\u000bH\u0016J\u0010\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010p\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J~\u0010q\u001a\u0002Hr\"\u0004\b\u0000\u0010r2\u0006\u0010\u0013\u001a\u0002Hr2`\u0010s\u001a\\\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(y\u0012\u0013\u0012\u00110\u000b¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(z\u0012\u0004\u0012\u0002Hr0tH\u0082\b¢\u0006\u0002\u0010{J\u001e\u0010|\u001a\u0004\u0018\u00010}2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u0007\u0010\u0080\u0001\u001a\u000209J\t\u0010\u0081\u0001\u001a\u00020\u001bH\u0016J$\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u000bH\u0002J\u001a\u0010\u0086\u0001\u001a\u00020\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u0088\u0001\u001a\u000209H\u0014J\t\u0010\u0089\u0001\u001a\u000209H\u0016J\u001b\u0010\u008a\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u008d\u0001\u001a\u000209H\u0014J2\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u008f\u0001\u001a\u00020\u001b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010z\u001a\u00020\u000bH\u0014J\u001b\u0010\u0090\u0001\u001a\u0002092\u0007\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000bH\u0014J/\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u001bH\u0016J&\u0010\u0098\u0001\u001a\u00020\u001b2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016J6\u0010\u0099\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J?\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016JH\u0010\u009d\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u000b2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0007\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010¡\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020.H\u0016J-\u0010¢\u0001\u001a\u0002092\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\t\u0010¤\u0001\u001a\u000209H\u0016J\t\u0010¥\u0001\u001a\u000209H\u0016J-\u0010¦\u0001\u001a\u00020\u001b2\u0007\u0010\u008b\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\u000b2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u001b\u0010§\u0001\u001a\u0002092\u0007\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u009c\u0001\u001a\u00020\u000bH\u0016J\u0012\u0010¨\u0001\u001a\u0002092\u0007\u0010©\u0001\u001a\u00020\u000bH\u0014J\u0007\u0010ª\u0001\u001a\u000209J\u0012\u0010«\u0001\u001a\u0002092\u0007\u0010¬\u0001\u001a\u00020\u001bH\u0016J\t\u0010\u00ad\u0001\u001a\u00020\u001bH\u0016J3\u0010®\u0001\u001a\u00030¯\u0001*\u00030¯\u00012\u0007\u0010°\u0001\u001a\u00020\u000b2\u0007\u0010±\u0001\u001a\u00020\u000b2\u0007\u0010²\u0001\u001a\u00020\u000b2\u0007\u0010³\u0001\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0013\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R(\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010G\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010L\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u0014\u0010O\u001a\b\u0012\u0004\u0012\u0002090FX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u0002090FX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u0013\u001a\u0004\u0018\u00010Q@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020XX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010YR\u0014\u0010Z\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R0\u0010^\u001a\b\u0012\u0004\u0012\u0002090F2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002090F@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010I\"\u0004\b`\u0010KR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006µ\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "compositeKeyHash", "", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "view", "Landroid/view/View;", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "isDrawing", "isValidOwnerScope", "()Z", "lastHeightMeasureSpec", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "location", "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "onDensityChanged", "Lkotlin/Function1;", "", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "position", "<set-?>", "Lkotlin/Function0;", "release", "getRelease", "()Lkotlin/jvm/functions/Function0;", "setRelease", "(Lkotlin/jvm/functions/Function0;)V", "reset", "getReset", "setReset", "runInvalidate", "runUpdate", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "update", "getUpdate", "setUpdate", "getView", "()Landroid/view/View;", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getAccessibilityClassName", "", "getInteropView", "Landroidx/compose/ui/viewinterop/InteropView;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getNestedScrollAxes", "insetBounds", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "insetToLayoutPosition", "insetValue", "T", "block", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "l", "t", "r", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "invalidateOrDefer", "isNestedScrollingEnabled", "obtainMeasureSpec", "min", "max", "preferred", "onApplyWindowInsets", "v", "onAttachedToWindow", "onDeactivate", "onDescendantInvalidated", "child", "target", "onDetachedFromWindow", "onLayout", "changed", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "axes", "onRelease", "onReuse", "onStartNestedScroll", "onStopNestedScroll", "onWindowVisibilityChanged", "visibility", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "shouldDelayChildPressedState", "inset", "Landroidx/core/graphics/Insets;", "left", "top", "right", "bottom", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = null;
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private Function0<Unit> release;
    private Function0<Unit> reset;
    private final Function0<Unit> runInvalidate;
    private final Function0<Unit> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private Function0<Unit> update;
    private final View view;

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;", "", "()V", "OnCommitAffectingUpdate", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {639, 641}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        AnonymousClass1(boolean r2, AndroidViewHolder r3, long r4, Continuation<? super AnonymousClass1> r6) {
            this.$consumed = r2;
            this.this$0 = r3;
            this.$viewVelocity = r4;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, r8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L19:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            goto L19
        L8:
            ResultKt.throwOnFailure($result);
            boolean r1 = this.$consumed;
            AndroidViewHolder r2 = this.this$0;
            if (r1 == true) goto L14;
            this.label = 1;
            if (AndroidViewHolder.access$getDispatcher$p(r2).m5463dispatchPostFlingRZ2iAVY(Velocity.Companion.m7222getZero9UxMQ8M(), this.$viewVelocity, this) != r0) goto L19;
            return r0;
        L14:
            this.label = 2;
            if (AndroidViewHolder.access$getDispatcher$p(r2).m5463dispatchPostFlingRZ2iAVY(this.$viewVelocity, Velocity.Companion.m7222getZero9UxMQ8M(), this) != r0) goto L19;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
    static final class C06771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        C06771(AndroidViewHolder r2, long r3, Continuation<? super C06771> r5) {
            this.this$0 = r2;
            this.$toBeConsumed = r3;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new C06771(this.this$0, this.$toBeConsumed, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C06771) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (AndroidViewHolder.access$getDispatcher$p(this.this$0).m5465dispatchPreFlingQWom1Mo(this.$toBeConsumed, this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ NestedScrollDispatcher access$getDispatcher$p(AndroidViewHolder $this) {
        return $this.dispatcher;
    }

    public static final /* synthetic */ boolean access$getHasUpdateBlock$p(AndroidViewHolder $this) {
        return $this.hasUpdateBlock;
    }

    public static final /* synthetic */ WindowInsetsCompat access$getInsets$p(AndroidViewHolder $this) {
        return $this.insets;
    }

    public static final /* synthetic */ Function1 access$getOnCommitAffectingUpdate$cp() {
        return OnCommitAffectingUpdate;
    }

    public static final /* synthetic */ Owner access$getOwner$p(AndroidViewHolder $this) {
        return $this.owner;
    }

    public static final /* synthetic */ int[] access$getPosition$p(AndroidViewHolder $this) {
        return $this.position;
    }

    public static final /* synthetic */ Function0 access$getRunUpdate$p(AndroidViewHolder $this) {
        return $this.runUpdate;
    }

    public static final /* synthetic */ long access$getSize$p(AndroidViewHolder $this) {
        return $this.size;
    }

    public static final /* synthetic */ OwnerSnapshotObserver access$getSnapshotObserver(AndroidViewHolder $this) {
        return $this.getSnapshotObserver();
    }

    public static final /* synthetic */ WindowInsetsAnimationCompat.BoundsCompat access$insetBounds(AndroidViewHolder $this, WindowInsetsAnimationCompat.BoundsCompat bounds) {
        return $this.insetBounds(bounds);
    }

    public static final /* synthetic */ WindowInsetsCompat access$insetToLayoutPosition(AndroidViewHolder $this, WindowInsetsCompat insets) {
        return $this.insetToLayoutPosition(insets);
    }

    public static final /* synthetic */ int access$obtainMeasureSpec(AndroidViewHolder $this, int min, int max, int preferred) {
        return $this.obtainMeasureSpec(min, max, preferred);
    }

    public static final /* synthetic */ void access$setDrawing$p(AndroidViewHolder $this, boolean r1) {
        $this.isDrawing = r1;
    }

    public static final /* synthetic */ void access$setSize$p(AndroidViewHolder $this, long r1) {
        $this.size = r1;
    }

    public final View getView() {
        return this.view;
    }

    public AndroidViewHolder(Context context, CompositionContext parentContext, int compositeKeyHash, NestedScrollDispatcher dispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = compositeKeyHash;
        this.dispatcher = dispatcher;
        this.view = view;
        this.owner = owner;
        if (parentContext == null) goto L5;
        WindowRecomposer_androidKt.setCompositionContext(this, parentContext);
    L5:
        setSaveFromParentEnabled(false);
        addView(this.view);
        ViewCompat.setWindowInsetsAnimationCallback(this, new AnonymousClass2(this));
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        this.modifier = Modifier.Companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final AndroidViewHolder $this$layoutNode_u24lambda_u243 = this;
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setForceUseOldLayers(true);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier coreModifier = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m4526graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(Modifier.Companion, AndroidViewHolder_androidKt.access$getNoOpScrollConnection$p(), $this$layoutNode_u24lambda_u243.dispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), $this$layoutNode_u24lambda_u243), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, false, null, 0, 0, 0, 131071, null), new AndroidViewHolder$layoutNode$1$coreModifier$2($this$layoutNode_u24lambda_u243, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3($this$layoutNode_u24lambda_u243, layoutNode));
        layoutNode.setCompositeKeyHash($this$layoutNode_u24lambda_u243.compositeKeyHash);
        layoutNode.setModifier($this$layoutNode_u24lambda_u243.modifier.then(coreModifier));
        $this$layoutNode_u24lambda_u243.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, coreModifier);
        layoutNode.setDensity($this$layoutNode_u24lambda_u243.density);
        $this$layoutNode_u24lambda_u243.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui_release(new AndroidViewHolder$layoutNode$1$3($this$layoutNode_u24lambda_u243, layoutNode));
        layoutNode.setOnDetach$ui_release(new AndroidViewHolder$layoutNode$1$4($this$layoutNode_u24lambda_u243));
        layoutNode.setMeasurePolicy(new AndroidViewHolder$layoutNode$1$5($this$layoutNode_u24lambda_u243, layoutNode));
        this.layoutNode = layoutNode;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    protected final void setUpdate(Function0<Unit> r2) {
        this.update = r2;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    protected final void setReset(Function0<Unit> r1) {
        this.reset = r1;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    protected final void setRelease(Function0<Unit> r1) {
        this.release = r1;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(Modifier value) {
        if (value == this.modifier) goto L8;
        this.modifier = value;
        Function1<? super Modifier, Unit> r0 = this.onModifierChanged;
        if (r0 == null) goto L9;
        r0.invoke(value);
        return;
    L9:
        return;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> r1) {
        this.onModifierChanged = r1;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity(Density value) {
        if (value == this.density) goto L8;
        this.density = value;
        Function1<? super Density, Unit> r0 = this.onDensityChanged;
        if (r0 == null) goto L9;
        r0.invoke(value);
        return;
    L9:
        return;
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> r1) {
        this.onDensityChanged = r1;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(LifecycleOwner value) {
        if (value == this.lifecycleOwner) goto L6;
        this.lifecycleOwner = value;
        ViewTreeLifecycleOwner.set(this, value);
        return;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner value) {
        if (value == this.savedStateRegistryOwner) goto L6;
        this.savedStateRegistryOwner = value;
        ViewTreeSavedStateRegistryOwner.set(this, value);
        return;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        boolean value$iv = isAttachedToWindow();
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
    L6:
        return this.owner.getSnapshotObserver();
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> r1) {
        this.onRequestDisallowInterceptTouchEvent = r1;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() == this) goto L5;
        addView(this.view);
        return;
    L5:
        this.reset.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled == true) goto L5;
    L11:
        removeAllViewsInLayout();
        return;
    L5:
        if (hasFocus() == false) goto L11;
        if (isInTouchMode() == false) goto L11;
        if (Build.VERSION.SDK_INT <= 28) goto L11;
        findFocus().clearFocus();
        goto L11
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() == this) goto L7;
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        return;
    L7:
        if (this.view.getVisibility() != 8) goto L10;
        setMeasuredDimension(0, 0);
        return;
    L10:
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    public final void remeasure() {
        if (this.lastWidthMeasureSpec != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.lastHeightMeasureSpec == Integer.MIN_VALUE) goto L10;
        measure(this.lastWidthMeasureSpec, this.lastHeightMeasureSpec);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams r0 = this.view.getLayoutParams();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> r0 = this.onRequestDisallowInterceptTouchEvent;
        if (r0 == null) goto L5;
        r0.invoke(Boolean.valueOf(disallowIntercept));
    L5:
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing == false) goto L5;
        View r0 = this.view;
        final Function0<Unit> r1 = this.runInvalidate;
        r0.postOnAnimation(new AndroidViewHolder$$ExternalSyntheticLambda0(r1));
        return;
    L5:
        this.layoutNode.invalidateLayer$ui_release();
    }

    static final void invalidateOrDefer$lambda$2(Function0 $tmp0) {
        $tmp0.invoke();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region != null) goto L5;
        return true;
    L5:
        getLocationInWindow(this.location);
        region.op(this.location[0], this.location[1], this.location[0] + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    private final int obtainMeasureSpec(int min, int max, int preferred) {
        if (preferred >= 0) goto L16;
        if (min == max) goto L16;
        if (preferred != (-2)) goto L11;
        if (max == Integer.MAX_VALUE) goto L11;
        return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    L11:
        if (preferred != (-1)) goto L19;
        if (max == Integer.MAX_VALUE) goto L19;
        return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
    L19:
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    L16:
        return View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(preferred, min, max), 1073741824);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        if ((axes & 2) == 0) goto L5;
    L8:
        return true;
    L5:
        if ((axes & 1) != 0) goto L8;
        return false;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View target, int type) {
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled() == true) goto L5;
        return;
    L5:
        NestedScrollDispatcher r1 = this.dispatcher;
        float x$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed);
        float y$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long r2 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        float x$iv2 = AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed);
        float y$iv2 = AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed);
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long r4 = Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
        int $i$f$Offset = AndroidViewHolder_androidKt.access$toNestedScrollSource(type);
        long consumedByParent = r1.m5464dispatchPostScrollDzOQY0M(r2, r4, $i$f$Offset);
        int bits$iv$iv$iv = (int) (consumedByParent >> 32);
        consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (consumedByParent & 4294967295L);
        consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled() == true) goto L5;
        return;
    L5:
        NestedScrollDispatcher r1 = this.dispatcher;
        float x$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed);
        float y$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long r2 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        float x$iv2 = AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed);
        float y$iv2 = AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed);
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv2);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
        long r4 = Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (4294967295L & v2$iv$iv2));
        int $i$f$Offset = AndroidViewHolder_androidKt.access$toNestedScrollSource(type);
        r1.m5464dispatchPostScrollDzOQY0M(r2, r4, $i$f$Offset);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled() == true) goto L5;
        return;
    L5:
        NestedScrollDispatcher r1 = this.dispatcher;
        float x$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dx);
        float y$iv = AndroidViewHolder_androidKt.access$toComposeOffset(dy);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long r2 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        int $i$f$Offset = AndroidViewHolder_androidKt.access$toNestedScrollSource(type);
        long consumedByParent = r1.m5466dispatchPreScrollOzD1aCk(r2, $i$f$Offset);
        int bits$iv$iv$iv = (int) (consumedByParent >> 32);
        consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (consumedByParent & 4294967295L);
        consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (isNestedScrollingEnabled() == true) goto L5;
        return false;
    L5:
        long viewVelocity = VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY));
        BuildersKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(consumed, this, viewVelocity, null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (isNestedScrollingEnabled() == true) goto L5;
        return false;
    L5:
        long toBeConsumed = VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY));
        BuildersKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new C06771(this, toBeConsumed, null), 3, null);
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        this.insets = new WindowInsetsCompat(insets);
        return insetToLayoutPosition(insets);
    }

    private final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat insets) {
        if (insets.hasInsets() == true) goto L5;
        return insets;
    L5:
        NodeCoordinator coordinates$iv = this.layoutNode.getInnerCoordinator$ui_release();
        if (coordinates$iv.isAttached() == false) goto L28;
        long topLeft$iv = IntOffsetKt.m7118roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates$iv));
        int $this$fastCoerceAtLeast$iv$iv = IntOffset.m7101getXimpl(topLeft$iv);
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L11;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L11:
        int $this$fastCoerceAtLeast$iv$iv2 = IntOffset.m7102getYimpl(topLeft$iv);
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = 0;
    L14:
        long value$iv$iv$iv$iv = LayoutCoordinatesKt.findRootCoordinates(coordinates$iv).mo5722getSizeYbymL2g();
        int rootWidth$iv = (int) (value$iv$iv$iv$iv >> 32);
        int rootHeight$iv = (int) (value$iv$iv$iv$iv & 4294967295L);
        long value$iv$iv$iv$iv2 = coordinates$iv.mo5722getSizeYbymL2g();
        int width$iv = (int) (value$iv$iv$iv$iv2 >> 32);
        int height$iv = (int) (value$iv$iv$iv$iv2 & 4294967295L);
        float x$iv$iv = width$iv;
        float y$iv$iv = height$iv;
        long v1$iv$iv$iv = Float.floatToRawIntBits(x$iv$iv);
        long v2$iv$iv$iv = Float.floatToRawIntBits(y$iv$iv);
        long bottomRight$iv = IntOffsetKt.m7118roundk4lQ0M(coordinates$iv.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv$iv << 32) | (v2$iv$iv$iv & 4294967295L))));
        int $this$fastCoerceAtLeast$iv$iv3 = rootWidth$iv - IntOffset.m7101getXimpl(bottomRight$iv);
        if ($this$fastCoerceAtLeast$iv$iv3 >= 0) goto L17;
        $this$fastCoerceAtLeast$iv$iv3 = 0;
    L17:
        int $this$fastCoerceAtLeast$iv$iv4 = rootHeight$iv - IntOffset.m7102getYimpl(bottomRight$iv);
        if ($this$fastCoerceAtLeast$iv$iv4 >= 0) goto L21;
        $this$fastCoerceAtLeast$iv$iv4 = 0;
    L21:
        if ($this$fastCoerceAtLeast$iv$iv != 0) goto L26;
        if ($this$fastCoerceAtLeast$iv$iv2 != 0) goto L26;
        if ($this$fastCoerceAtLeast$iv$iv3 != 0) goto L26;
        if ($this$fastCoerceAtLeast$iv$iv4 != 0) goto L26;
        return insets;
    L26:
        int l = $this$fastCoerceAtLeast$iv$iv;
        int t = $this$fastCoerceAtLeast$iv$iv2;
        int b = $this$fastCoerceAtLeast$iv$iv4;
        int r = $this$fastCoerceAtLeast$iv$iv3;
        return insets.inset(l, t, r, b);
    L28:
        return insets;
    }

    private final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat bounds) {
        NodeCoordinator coordinates$iv = this.layoutNode.getInnerCoordinator$ui_release();
        if (coordinates$iv.isAttached() == false) goto L25;
        long topLeft$iv = IntOffsetKt.m7118roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates$iv));
        int $this$fastCoerceAtLeast$iv$iv = IntOffset.m7101getXimpl(topLeft$iv);
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L8:
        int $this$fastCoerceAtLeast$iv$iv2 = IntOffset.m7102getYimpl(topLeft$iv);
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0) goto L11;
        $this$fastCoerceAtLeast$iv$iv2 = 0;
    L11:
        long value$iv$iv$iv$iv = LayoutCoordinatesKt.findRootCoordinates(coordinates$iv).mo5722getSizeYbymL2g();
        int rootWidth$iv = (int) (value$iv$iv$iv$iv >> 32);
        int rootHeight$iv = (int) (value$iv$iv$iv$iv & 4294967295L);
        long value$iv$iv$iv$iv2 = coordinates$iv.mo5722getSizeYbymL2g();
        int width$iv = (int) (value$iv$iv$iv$iv2 >> 32);
        int height$iv = (int) (value$iv$iv$iv$iv2 & 4294967295L);
        float x$iv$iv = width$iv;
        float y$iv$iv = height$iv;
        long v1$iv$iv$iv = Float.floatToRawIntBits(x$iv$iv);
        long v2$iv$iv$iv = Float.floatToRawIntBits(y$iv$iv);
        long bottomRight$iv = IntOffsetKt.m7118roundk4lQ0M(coordinates$iv.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv$iv << 32) | (v2$iv$iv$iv & 4294967295L))));
        int $this$fastCoerceAtLeast$iv$iv3 = rootWidth$iv - IntOffset.m7101getXimpl(bottomRight$iv);
        if ($this$fastCoerceAtLeast$iv$iv3 >= 0) goto L14;
        $this$fastCoerceAtLeast$iv$iv3 = 0;
    L14:
        int $this$fastCoerceAtLeast$iv$iv4 = rootHeight$iv - IntOffset.m7102getYimpl(bottomRight$iv);
        if ($this$fastCoerceAtLeast$iv$iv4 >= 0) goto L18;
        $this$fastCoerceAtLeast$iv$iv4 = 0;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv != 0) goto L23;
        if ($this$fastCoerceAtLeast$iv$iv2 != 0) goto L23;
        if ($this$fastCoerceAtLeast$iv$iv3 != 0) goto L23;
        if ($this$fastCoerceAtLeast$iv$iv4 != 0) goto L23;
        return bounds;
    L23:
        int l = $this$fastCoerceAtLeast$iv$iv;
        int t = $this$fastCoerceAtLeast$iv$iv2;
        int b = $this$fastCoerceAtLeast$iv$iv4;
        int r = $this$fastCoerceAtLeast$iv$iv3;
        return new WindowInsetsAnimationCompat.BoundsCompat(inset(bounds.getLowerBound(), l, t, r, b), inset(bounds.getUpperBound(), l, t, r, b));
    L25:
        return bounds;
    }

    private final <T> T insetValue(T r23, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> r24) {
        NodeCoordinator coordinates = this.layoutNode.getInnerCoordinator$ui_release();
        if (coordinates.isAttached() == true) goto L5;
        return r23;
    L5:
        long topLeft = IntOffsetKt.m7118roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates));
        int $this$fastCoerceAtLeast$iv = IntOffset.m7101getXimpl(topLeft);
        if ($this$fastCoerceAtLeast$iv >= 0) goto L8;
        $this$fastCoerceAtLeast$iv = 0;
    L8:
        int $this$fastCoerceAtLeast$iv2 = IntOffset.m7102getYimpl(topLeft);
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L11;
        $this$fastCoerceAtLeast$iv2 = 0;
    L11:
        long value$iv$iv$iv = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo5722getSizeYbymL2g();
        int rootWidth = (int) (value$iv$iv$iv >> 32);
        int rootHeight = (int) (value$iv$iv$iv & 4294967295L);
        long value$iv$iv$iv2 = coordinates.mo5722getSizeYbymL2g();
        int width = (int) (value$iv$iv$iv2 >> 32);
        int height = (int) (value$iv$iv$iv2 & 4294967295L);
        float x$iv = width;
        float y$iv = height;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long bottomRight = IntOffsetKt.m7118roundk4lQ0M(coordinates.mo5725localToRootMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L))));
        int $this$fastCoerceAtLeast$iv3 = rootWidth - IntOffset.m7101getXimpl(bottomRight);
        if ($this$fastCoerceAtLeast$iv3 >= 0) goto L14;
        $this$fastCoerceAtLeast$iv3 = 0;
    L14:
        int $this$fastCoerceAtLeast$iv4 = rootHeight - IntOffset.m7102getYimpl(bottomRight);
        if ($this$fastCoerceAtLeast$iv4 >= 0) goto L18;
        $this$fastCoerceAtLeast$iv4 = 0;
    L18:
        if ($this$fastCoerceAtLeast$iv != 0) goto L24;
        if ($this$fastCoerceAtLeast$iv2 != 0) goto L24;
        if ($this$fastCoerceAtLeast$iv3 != 0) goto L24;
        if ($this$fastCoerceAtLeast$iv4 != 0) goto L24;
        return r23;
    L24:
        return r24.invoke(Integer.valueOf($this$fastCoerceAtLeast$iv), Integer.valueOf($this$fastCoerceAtLeast$iv2), Integer.valueOf($this$fastCoerceAtLeast$iv3), Integer.valueOf($this$fastCoerceAtLeast$iv4));
    }

    private final Insets inset(Insets $this$inset, int left, int top, int right, int bottom) {
        int $this$fastCoerceAtLeast$iv = $this$inset.left - left;
        if ($this$fastCoerceAtLeast$iv >= 0) goto L5;
        $this$fastCoerceAtLeast$iv = 0;
    L5:
        int minimumValue$iv = $this$inset.top;
        int $this$fastCoerceAtLeast$iv2 = minimumValue$iv - top;
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L8;
        $this$fastCoerceAtLeast$iv2 = 0;
    L8:
        int minimumValue$iv2 = $this$inset.right;
        int $this$fastCoerceAtLeast$iv3 = minimumValue$iv2 - right;
        if ($this$fastCoerceAtLeast$iv3 >= 0) goto L11;
        $this$fastCoerceAtLeast$iv3 = 0;
    L11:
        int minimumValue$iv3 = $this$inset.bottom;
        int $this$fastCoerceAtLeast$iv4 = minimumValue$iv3 - bottom;
        if ($this$fastCoerceAtLeast$iv4 >= 0) goto L15;
        $this$fastCoerceAtLeast$iv4 = 0;
    L15:
        return Insets.of($this$fastCoerceAtLeast$iv, $this$fastCoerceAtLeast$iv2, $this$fastCoerceAtLeast$iv3, $this$fastCoerceAtLeast$iv4);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;
    }
}
