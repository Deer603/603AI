package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ax\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0007\u001a\u007f\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u007f\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u007f\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010A\u001a\u0092\u0001\u0010D\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u007f\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010=\u001a£\u0001\u0010M\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aµ\u0001\u0010]\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010X\u001a\u00020\u00012\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010_\u001a\u00020F2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010?\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a+\u0010b\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010c\u001a+\u0010d\u001a\u00020e2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010f\u001a>\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010o\u001a>\u0010p\u001a\u00020h2\u0006\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010q\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r²\u0006\n\u0010s\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "scrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "CenterAlignedTopAppBar", "title", "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "expandedHeight", "CenterAlignedTopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "collapsedHeight", "LargeTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumTopAppBar", "MediumTopAppBar-oKE7A98", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "SingleRowTopAppBar-cJHQLPU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-GHTll3U", "TopAppBarLayout", "scrolledOffset", "Landroidx/compose/material3/ScrolledOffset;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "TwoRowsTopAppBar-nS6u9G4", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release", "colorTransitionFraction", "appBarContainerColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding = 0.0f;
    private static final float BottomAppBarVerticalPadding = 0.0f;
    private static final float FABHorizontalPadding = 0.0f;
    private static final float FABVerticalPadding = 0.0f;
    private static final float LargeTitleBottomPadding = 0.0f;
    private static final float MediumTitleBottomPadding = 0.0f;
    private static final float TopAppBarHorizontalPadding = 0.0f;
    private static final float TopAppBarTitleInset = 0.0f;
    private static final CubicBezierEasing TopTitleAlphaEasing = null;

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {2501, 2515}, m = "settleAppBar", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C04741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04741(Continuation<? super C04741> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.access$settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1803, 1817}, m = "settleAppBarBottom", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C04761 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04761(Continuation<? super C04761> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.access$settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: renamed from: access$SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    public static final /* synthetic */ void m1904access$SingleRowTopAppBarcJHQLPU(Modifier modifier, Function2 title, TextStyle titleTextStyle, boolean centeredTitle, Function2 navigationIcon, Function3 actions, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, int $changed, int $default) {
        m1900SingleRowTopAppBarcJHQLPU(modifier, title, titleTextStyle, centeredTitle, navigationIcon, actions, expandedHeight, windowInsets, colors, scrollBehavior, $composer, $changed, $default);
    }

    /* JADX INFO: renamed from: access$TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final /* synthetic */ void m1905access$TopAppBarLayoutkXwM9vE(Modifier modifier, ScrolledOffset scrolledOffset, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, Function2 title, TextStyle titleTextStyle, float titleAlpha, Arrangement.Vertical titleVerticalArrangement, Arrangement.Horizontal titleHorizontalArrangement, int titleBottomPadding, boolean hideTitleSemantics, Function2 navigationIcon, Function2 actions, Composer $composer, int $changed, int $changed1) {
        m1902TopAppBarLayoutkXwM9vE(modifier, scrolledOffset, navigationIconContentColor, titleContentColor, actionIconContentColor, title, titleTextStyle, titleAlpha, titleVerticalArrangement, titleHorizontalArrangement, titleBottomPadding, hideTitleSemantics, navigationIcon, actions, $composer, $changed, $changed1);
    }

    /* JADX INFO: renamed from: access$TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    public static final /* synthetic */ void m1906access$TwoRowsTopAppBarnS6u9G4(Modifier modifier, Function2 title, TextStyle titleTextStyle, float titleBottomPadding, Function2 smallTitle, TextStyle smallTitleTextStyle, Function2 navigationIcon, Function3 actions, float collapsedHeight, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, int $changed, int $changed1, int $default) {
        m1903TwoRowsTopAppBarnS6u9G4(modifier, title, titleTextStyle, titleBottomPadding, smallTitle, smallTitleTextStyle, navigationIcon, actions, collapsedHeight, expandedHeight, windowInsets, colors, scrollBehavior, $composer, $changed, $changed1, $default);
    }

    public static final /* synthetic */ float access$getBottomAppBarHorizontalPadding$p() {
        return BottomAppBarHorizontalPadding;
    }

    public static final /* synthetic */ float access$getFABHorizontalPadding$p() {
        return FABHorizontalPadding;
    }

    public static final /* synthetic */ float access$getFABVerticalPadding$p() {
        return FABVerticalPadding;
    }

    public static final /* synthetic */ float access$getTopAppBarTitleInset$p() {
        return TopAppBarTitleInset;
    }

    public static final /* synthetic */ Object access$settleAppBar(TopAppBarState state, float velocity, DecayAnimationSpec flingAnimationSpec, AnimationSpec snapAnimationSpec, Continuation $completion) {
        return settleAppBar(state, velocity, flingAnimationSpec, snapAnimationSpec, $completion);
    }

    public static final /* synthetic */ Object access$settleAppBarBottom(BottomAppBarState state, float velocity, DecayAnimationSpec flingAnimationSpec, AnimationSpec snapAnimationSpec, Continuation $completion) {
        return settleAppBarBottom(state, velocity, flingAnimationSpec, snapAnimationSpec, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with expandedHeight parameter")
    public static final /* synthetic */ void TopAppBar(final Function2 title, Modifier modifier, Function2 navigationIcon, Function3 actions, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(5,2,3!1,6)142@6819L12,143@6881L17,146@6960L306:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r29 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2 r9 = title;
    L13:
        int r3 = r29 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r29 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2 navigationIcon2 = navigationIcon;
    L35:
        int r7 = r29 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3 actions2 = actions;
    L47:
        if (($changed & 24576) == 0) goto L49;
        WindowInsets windowInsets2 = windowInsets;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        TopAppBarColors colors2 = colors;
    L68:
        int r13 = r29 & 64;
        if (r13 == 0) goto L72;
        $dirty = $dirty | 1572864;
        TopAppBarScrollBehavior r14 = scrollBehavior;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r3 == 0) goto L99;
        Modifier.Companion modifier2 = Modifier.Companion;
    L100:
        if (r5 == 0) goto L102;
        navigationIcon2 = ComposableSingletons$AppBarKt.INSTANCE.m2067getLambda1$material3_release();
    L102:
        if (r7 == 0) goto L105;
        actions2 = ComposableSingletons$AppBarKt.INSTANCE.m2077getLambda2$material3_release();
    L105:
        if ((r29 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L108:
        if ((r29 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
        colors2 = TopAppBarDefaults.INSTANCE.topAppBarColors($composer2, 6);
    L110:
        if (r13 == 0) goto L112;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2 navigationIcon3 = navigationIcon2;
        Function3 actions3 = actions2;
        Modifier modifier3 = modifier2;
        int r0 = 1906353009;
    L113:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
    L116:
        Composer $composer3 = $composer2;
        m1901TopAppBarGHTll3U(r9, modifier3, navigationIcon3, actions3, TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, colors3, scrollBehavior2, $composer3, ((((((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 3) & 458752)) | (($dirty << 3) & 3670016)) | (29360128 & ($dirty << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventEnd();
    L119:
        final Modifier modifier4 = modifier3;
        final Function2 navigationIcon4 = navigationIcon3;
        final Function3 actions4 = actions3;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
    L120:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L124;
        r11.updateScope(new C04721(title, modifier4, navigationIcon4, actions4, windowInsets4, colors4, scrollBehavior3, $changed, r29));
        return;
    L124:
        return;
    L112:
        colors3 = colors2;
        scrollBehavior2 = r14;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = modifier2;
        navigationIcon3 = navigationIcon2;
        r0 = 1906353009;
        goto L113
    L99:
        modifier2 = r4;
        goto L100
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r29 & 16) == 0) goto L94;
        $dirty = $dirty & (-57345);
    L94:
        if ((r29 & 32) == 0) goto L96;
        $dirty = $dirty & (-458753);
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = 1906353009;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = r4;
        navigationIcon3 = navigationIcon2;
        goto L113
    L96:
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = 1906353009;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = r4;
        navigationIcon3 = navigationIcon2;
        goto L113
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        actions4 = actions2;
        $composer3 = $composer2;
        navigationIcon4 = navigationIcon2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = r14;
        goto L120
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = scrollBehavior;
        if ($composer2.changed(r14) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L78:
        r14 = scrollBehavior;
        goto L80
    L60:
        if ((r29 & 32) != 0) goto L64;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        colors2 = colors;
        goto L65
    L49:
        if ((r29 & 16) != 0) goto L53;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        windowInsets2 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        actions2 = actions;
        if ($composer2.changedInstance(actions2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        actions2 = actions;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        navigationIcon2 = navigationIcon;
        if ($composer2.changedInstance(navigationIcon2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        navigationIcon2 = navigationIcon;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = title;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        r9 = title;
        goto L13
    }

    /* JADX INFO: renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    public static final void m1901TopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> r24, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r27, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(226148675);
        ComposerKt.sourceInformation($composer2, "C(TopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)204@9890L12,205@9952L17,211@10162L5,208@10031L579:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r12 = r24;
    L13:
        int r3 = r34 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r34 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r26;
    L35:
        int r7 = r34 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r8 = r27;
    L46:
        int r11 = r34 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        float expandedHeight2 = expandedHeight;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets windowInsets2 = windowInsets;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        TopAppBarColors colors2 = colors;
    L79:
        int r0 = r34 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L109:
        if (r3 == 0) goto L111;
        Modifier.Companion modifier2 = Modifier.Companion;
    L112:
        if (r5 == 0) goto L114;
        r6 = ComposableSingletons$AppBarKt.INSTANCE.m2078getLambda3$material3_release();
    L114:
        if (r7 == 0) goto L116;
        r8 = ComposableSingletons$AppBarKt.INSTANCE.m2079getLambda4$material3_release();
    L116:
        if (r11 == 0) goto L119;
        expandedHeight2 = TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM();
    L119:
        if ((r34 & 32) == 0) goto L121;
        int $dirty3 = $dirty2 & (-458753);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L123:
        if ((r34 & 64) == 0) goto L125;
        $dirty3 = $dirty3 & (-3670017);
        colors2 = TopAppBarDefaults.INSTANCE.topAppBarColors($composer2, 6);
    L125:
        if (r0 == 0) goto L127;
        Modifier modifier3 = modifier2;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r16 = r8;
        float expandedHeight3 = expandedHeight2;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        int r9 = 226148675;
        Function2<? super Composer, ? super Integer, Unit> r15 = r6;
    L128:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L131;
        ComposerKt.traceEventStart(r9, $dirty3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
    L131:
        TextStyle r13 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L134;
    L137:
        float r17 = TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM();
    L138:
        Composer $composer3 = $composer2;
        m1900SingleRowTopAppBarcJHQLPU(modifier3, r12, r13, false, r15, r16, r17, windowInsets3, colors3, scrollBehavior2, $composer3, (((((((($dirty3 >> 3) & 14) | 3072) | (($dirty3 << 3) & 112)) | (($dirty3 << 6) & 57344)) | (($dirty3 << 6) & 458752)) | (($dirty3 << 6) & 29360128)) | (($dirty3 << 6) & 234881024)) | (($dirty3 << 6) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final float expandedHeight4 = expandedHeight3;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r15;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r14 = r16;
    L142:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L146;
        r18.updateScope(new C04732(r24, modifier4, r10, r14, expandedHeight4, windowInsets4, colors4, scrollBehavior3, $changed, r34));
        return;
    L146:
        return;
    L134:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L137;
        r17 = expandedHeight3;
        goto L138
    L127:
        scrollBehavior2 = scrollBehavior;
        modifier3 = modifier2;
        r16 = r8;
        expandedHeight3 = expandedHeight2;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r9 = 226148675;
        r15 = r6;
        goto L128
    L121:
        $dirty3 = $dirty2;
        goto L123
    L111:
        modifier2 = r4;
        goto L112
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L109;
        $composer2.skipToGroupEnd();
        if ((r34 & 32) == 0) goto L104;
        int $dirty4 = $dirty2 & (-458753);
    L106:
        if ((r34 & 64) == 0) goto L108;
        $dirty4 = $dirty4 & (-3670017);
    L108:
        scrollBehavior2 = scrollBehavior;
        modifier3 = r4;
        r16 = r8;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r9 = 226148675;
        $dirty3 = $dirty4;
        r15 = r6;
        expandedHeight3 = expandedHeight2;
        goto L128
    L104:
        $dirty4 = $dirty2;
        goto L106
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r4;
        r10 = r6;
        r14 = r8;
        expandedHeight4 = expandedHeight2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = scrollBehavior;
        goto L142
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(scrollBehavior) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L71:
        if ((r34 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
    L76:
        r110 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r34 & 32) != 0) goto L64;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
    L65:
        r111 = 65536;
        goto L66
    L64:
        windowInsets2 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        expandedHeight2 = expandedHeight;
        if ($composer2.changed(expandedHeight2) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L58
    L54:
        r112 = 8192;
        goto L55
    L56:
        expandedHeight2 = expandedHeight;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r27;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r113 = 2048;
    L44:
        $dirty = $dirty | r113;
        goto L46
    L43:
        r113 = 1024;
        goto L44
    L45:
        r8 = r27;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r26;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        r6 = r26;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = r24;
        if ($composer2.changedInstance(r12) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r12 = r24;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with expandedHeight parameter")
    public static final /* synthetic */ void CenterAlignedTopAppBar(final Function2 title, Modifier modifier, Function2 navigationIcon, Function3 actions, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r29) {
        Composer $composer2 = $composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation($composer2, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)269@12968L12,270@13030L30,273@13122L319:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r29 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2 r9 = title;
    L13:
        int r3 = r29 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r29 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2 navigationIcon2 = navigationIcon;
    L35:
        int r7 = r29 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3 actions2 = actions;
    L47:
        if (($changed & 24576) == 0) goto L49;
        WindowInsets windowInsets2 = windowInsets;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        TopAppBarColors colors2 = colors;
    L68:
        int r13 = r29 & 64;
        if (r13 == 0) goto L72;
        $dirty = $dirty | 1572864;
        TopAppBarScrollBehavior r14 = scrollBehavior;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r3 == 0) goto L99;
        Modifier.Companion modifier2 = Modifier.Companion;
    L100:
        if (r5 == 0) goto L102;
        navigationIcon2 = ComposableSingletons$AppBarKt.INSTANCE.m2080getLambda5$material3_release();
    L102:
        if (r7 == 0) goto L105;
        actions2 = ComposableSingletons$AppBarKt.INSTANCE.m2081getLambda6$material3_release();
    L105:
        if ((r29 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L108:
        if ((r29 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
        colors2 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors($composer2, 6);
    L110:
        if (r13 == 0) goto L112;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2 navigationIcon3 = navigationIcon2;
        Function3 actions3 = actions2;
        Modifier modifier3 = modifier2;
        int r0 = -2139286460;
    L113:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
    L116:
        Composer $composer3 = $composer2;
        m1897CenterAlignedTopAppBarGHTll3U(r9, modifier3, navigationIcon3, actions3, TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, colors3, scrollBehavior2, $composer3, ((((((($dirty & 14) | 24576) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 3) & 458752)) | (($dirty << 3) & 3670016)) | (29360128 & ($dirty << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventEnd();
    L119:
        final Modifier modifier4 = modifier3;
        final Function2 navigationIcon4 = navigationIcon3;
        final Function3 actions4 = actions3;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
    L120:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L124;
        r11.updateScope(new AnonymousClass1(title, modifier4, navigationIcon4, actions4, windowInsets4, colors4, scrollBehavior3, $changed, r29));
        return;
    L124:
        return;
    L112:
        colors3 = colors2;
        scrollBehavior2 = r14;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = modifier2;
        navigationIcon3 = navigationIcon2;
        r0 = -2139286460;
        goto L113
    L99:
        modifier2 = r4;
        goto L100
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r29 & 16) == 0) goto L94;
        $dirty = $dirty & (-57345);
    L94:
        if ((r29 & 32) == 0) goto L96;
        $dirty = $dirty & (-458753);
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = -2139286460;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = r4;
        navigationIcon3 = navigationIcon2;
        goto L113
    L96:
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = -2139286460;
        actions3 = actions2;
        windowInsets3 = windowInsets2;
        modifier3 = r4;
        navigationIcon3 = navigationIcon2;
        goto L113
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        actions4 = actions2;
        $composer3 = $composer2;
        navigationIcon4 = navigationIcon2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = r14;
        goto L120
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = scrollBehavior;
        if ($composer2.changed(r14) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L78:
        r14 = scrollBehavior;
        goto L80
    L60:
        if ((r29 & 32) != 0) goto L64;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        colors2 = colors;
        goto L65
    L49:
        if ((r29 & 16) != 0) goto L53;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        windowInsets2 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        actions2 = actions;
        if ($composer2.changedInstance(actions2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        actions2 = actions;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        navigationIcon2 = navigationIcon;
        if ($composer2.changedInstance(navigationIcon2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        navigationIcon2 = navigationIcon;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = title;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        r9 = title;
        goto L13
    }

    /* JADX INFO: renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    public static final void m1897CenterAlignedTopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> r24, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r26, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r27, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1952988048);
        ComposerKt.sourceInformation($composer2, "C(CenterAlignedTopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)328@16080L12,329@16142L30,335@16365L5,332@16234L578:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r12 = r24;
    L13:
        int r3 = r34 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r34 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r26;
    L35:
        int r7 = r34 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r8 = r27;
    L46:
        int r11 = r34 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
        float expandedHeight2 = expandedHeight;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets windowInsets2 = windowInsets;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        TopAppBarColors colors2 = colors;
    L79:
        int r0 = r34 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L109:
        if (r3 == 0) goto L111;
        Modifier.Companion modifier2 = Modifier.Companion;
    L112:
        if (r5 == 0) goto L114;
        r6 = ComposableSingletons$AppBarKt.INSTANCE.m2082getLambda7$material3_release();
    L114:
        if (r7 == 0) goto L116;
        r8 = ComposableSingletons$AppBarKt.INSTANCE.m2083getLambda8$material3_release();
    L116:
        if (r11 == 0) goto L119;
        expandedHeight2 = TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM();
    L119:
        if ((r34 & 32) == 0) goto L121;
        int $dirty3 = $dirty2 & (-458753);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L123:
        if ((r34 & 64) == 0) goto L125;
        $dirty3 = $dirty3 & (-3670017);
        colors2 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors($composer2, 6);
    L125:
        if (r0 == 0) goto L127;
        Modifier modifier3 = modifier2;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r16 = r8;
        float expandedHeight3 = expandedHeight2;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        int r9 = 1952988048;
        Function2<? super Composer, ? super Integer, Unit> r15 = r6;
    L128:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L131;
        ComposerKt.traceEventStart(r9, $dirty3, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
    L131:
        TextStyle r13 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L134;
    L137:
        float r17 = TopAppBarDefaults.INSTANCE.m2988getTopAppBarExpandedHeightD9Ej5fM();
    L138:
        Composer $composer3 = $composer2;
        m1900SingleRowTopAppBarcJHQLPU(modifier3, r12, r13, true, r15, r16, r17, windowInsets3, colors3, scrollBehavior2, $composer3, (((((((($dirty3 >> 3) & 14) | 3072) | (($dirty3 << 3) & 112)) | (($dirty3 << 6) & 57344)) | (($dirty3 << 6) & 458752)) | (($dirty3 << 6) & 29360128)) | (($dirty3 << 6) & 234881024)) | (($dirty3 << 6) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final float expandedHeight4 = expandedHeight3;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r15;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r14 = r16;
    L142:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L146;
        r18.updateScope(new AnonymousClass2(r24, modifier4, r10, r14, expandedHeight4, windowInsets4, colors4, scrollBehavior3, $changed, r34));
        return;
    L146:
        return;
    L134:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L137;
        r17 = expandedHeight3;
        goto L138
    L127:
        scrollBehavior2 = scrollBehavior;
        modifier3 = modifier2;
        r16 = r8;
        expandedHeight3 = expandedHeight2;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r9 = 1952988048;
        r15 = r6;
        goto L128
    L121:
        $dirty3 = $dirty2;
        goto L123
    L111:
        modifier2 = r4;
        goto L112
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L109;
        $composer2.skipToGroupEnd();
        if ((r34 & 32) == 0) goto L104;
        int $dirty4 = $dirty2 & (-458753);
    L106:
        if ((r34 & 64) == 0) goto L108;
        $dirty4 = $dirty4 & (-3670017);
    L108:
        scrollBehavior2 = scrollBehavior;
        modifier3 = r4;
        r16 = r8;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r9 = 1952988048;
        $dirty3 = $dirty4;
        r15 = r6;
        expandedHeight3 = expandedHeight2;
        goto L128
    L104:
        $dirty4 = $dirty2;
        goto L106
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r4;
        r10 = r6;
        r14 = r8;
        expandedHeight4 = expandedHeight2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = scrollBehavior;
        goto L142
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(scrollBehavior) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L71:
        if ((r34 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
    L76:
        r110 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r34 & 32) != 0) goto L64;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
    L65:
        r111 = 65536;
        goto L66
    L64:
        windowInsets2 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        expandedHeight2 = expandedHeight;
        if ($composer2.changed(expandedHeight2) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L58
    L54:
        r112 = 8192;
        goto L55
    L56:
        expandedHeight2 = expandedHeight;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r27;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r113 = 2048;
    L44:
        $dirty = $dirty | r113;
        goto L46
    L43:
        r113 = 1024;
        goto L44
    L45:
        r8 = r27;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r26;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        r6 = r26;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = r24;
        if ($composer2.changedInstance(r12) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r12 = r24;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of MediumTopAppBar with collapsedHeight and expandedHeight parameters")
    public static final /* synthetic */ void MediumTopAppBar(final Function2 title, Modifier modifier, Function2 navigationIcon, Function3 actions, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation($composer2, "C(MediumTopAppBar)P(5,2,3!1,6)396@19336L12,397@19398L23,400@19483L388:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2 r9 = title;
    L13:
        int r3 = r30 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r30 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2 navigationIcon2 = navigationIcon;
    L35:
        int r7 = r30 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3 actions2 = actions;
    L47:
        if (($changed & 24576) == 0) goto L49;
        WindowInsets windowInsets2 = windowInsets;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        TopAppBarColors colors2 = colors;
    L68:
        int r13 = r30 & 64;
        if (r13 == 0) goto L72;
        $dirty = $dirty | 1572864;
        TopAppBarScrollBehavior r14 = scrollBehavior;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r3 == 0) goto L99;
        Modifier.Companion modifier2 = Modifier.Companion;
    L100:
        if (r5 == 0) goto L102;
        navigationIcon2 = ComposableSingletons$AppBarKt.INSTANCE.m2084getLambda9$material3_release();
    L102:
        if (r7 == 0) goto L105;
        actions2 = ComposableSingletons$AppBarKt.INSTANCE.m2068getLambda10$material3_release();
    L105:
        if ((r30 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L108:
        if ((r30 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
        colors2 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors($composer2, 6);
    L110:
        if (r13 == 0) goto L112;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2 navigationIcon3 = navigationIcon2;
        Function3 actions3 = actions2;
        Modifier modifier3 = modifier2;
        int r0 = 1805417862;
    L113:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
    L116:
        Composer $composer3 = $composer2;
        m1899MediumTopAppBaroKE7A98(r9, modifier3, navigationIcon3, actions3, TopAppBarDefaults.INSTANCE.m2986getMediumAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2987getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets3, colors3, scrollBehavior2, $composer3, ((((((($dirty & 14) | 221184) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 6) & 3670016)) | (($dirty << 6) & 29360128)) | (($dirty << 6) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventEnd();
    L119:
        final Modifier modifier4 = modifier3;
        final Function2 navigationIcon4 = navigationIcon3;
        final Function3 actions4 = actions3;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
    L120:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L124;
        r11.updateScope(new C04701(title, modifier4, navigationIcon4, actions4, windowInsets4, colors4, scrollBehavior3, $changed, r30));
        return;
    L124:
        return;
    L112:
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = modifier2;
        r0 = 1805417862;
        goto L113
    L99:
        modifier2 = r4;
        goto L100
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r30 & 16) == 0) goto L94;
        $dirty = $dirty & (-57345);
    L94:
        if ((r30 & 32) == 0) goto L96;
        $dirty = $dirty & (-458753);
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = 1805417862;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = r4;
        goto L113
    L96:
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = 1805417862;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = r4;
        goto L113
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        actions4 = actions2;
        $composer3 = $composer2;
        navigationIcon4 = navigationIcon2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = r14;
        goto L120
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = scrollBehavior;
        if ($composer2.changed(r14) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L78:
        r14 = scrollBehavior;
        goto L80
    L60:
        if ((r30 & 32) != 0) goto L64;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        colors2 = colors;
        goto L65
    L49:
        if ((r30 & 16) != 0) goto L53;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        windowInsets2 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        actions2 = actions;
        if ($composer2.changedInstance(actions2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        actions2 = actions;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        navigationIcon2 = navigationIcon;
        if ($composer2.changedInstance(navigationIcon2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        navigationIcon2 = navigationIcon;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = title;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        r9 = title;
        goto L13
    }

    /* JADX INFO: renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    public static final void m1899MediumTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> r29, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r31, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, float collapsedHeight, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1879191686);
        ComposerKt.sourceInformation($composer2, "C(MediumTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)465@23246L12,466@23308L23,472@23523L5,473@23594L5,469@23393L947:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r13 = r29;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r40 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r31;
    L35:
        int r7 = r40 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r8 = r32;
    L46:
        int r9 = r40 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        float collapsedHeight2 = collapsedHeight;
    L57:
        int r14 = r40 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float expandedHeight2 = expandedHeight;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r40 & 64) != 0) goto L76;
        if ($composer2.changed(windowInsets) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
    L76:
        r17 = 524288;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
    L87:
        r18 = 4194304;
    L90:
        int r0 = r40 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L120:
        if (r3 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r5 == 0) goto L124;
        r6 = ComposableSingletons$AppBarKt.INSTANCE.m2069getLambda11$material3_release();
    L124:
        if (r7 == 0) goto L126;
        r8 = ComposableSingletons$AppBarKt.INSTANCE.m2070getLambda12$material3_release();
    L126:
        if (r9 == 0) goto L128;
        collapsedHeight2 = TopAppBarDefaults.INSTANCE.m2986getMediumAppBarCollapsedHeightD9Ej5fM();
    L128:
        if (r14 == 0) goto L131;
        expandedHeight2 = TopAppBarDefaults.INSTANCE.m2987getMediumAppBarExpandedHeightD9Ej5fM();
    L131:
        if ((r40 & 64) == 0) goto L133;
        WindowInsets windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        int $dirty3 = $dirty2 & (-3670017);
    L135:
        if ((r40 & 128) == 0) goto L137;
        TopAppBarColors colors2 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors($composer2, 6);
        $dirty3 = $dirty3 & (-29360129);
    L138:
        if (r0 == 0) goto L140;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r19 = r6;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r110 = r8;
        float collapsedHeight3 = collapsedHeight2;
        Modifier modifier3 = modifier2;
        int $dirty4 = $dirty3;
        float expandedHeight3 = expandedHeight2;
    L141:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventStart(1879191686, $dirty4, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
    L144:
        TextStyle r15 = TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        TextStyle r111 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        float r16 = MediumTitleBottomPadding;
        if (Dp.m6978equalsimpl0(collapsedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L147;
    L150:
        float r20 = TopAppBarDefaults.INSTANCE.m2986getMediumAppBarCollapsedHeightD9Ej5fM();
    L152:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L154;
    L157:
        float r21 = TopAppBarDefaults.INSTANCE.m2987getMediumAppBarExpandedHeightD9Ej5fM();
    L158:
        Composer $composer3 = $composer2;
        m1903TwoRowsTopAppBarnS6u9G4(modifier3, r13, r15, r16, r29, r111, r19, r110, r20, r21, windowInsets3, colors3, scrollBehavior2, $composer3, (((((($dirty4 >> 3) & 14) | 3072) | (($dirty4 << 3) & 112)) | (($dirty4 << 12) & 57344)) | (($dirty4 << 12) & 3670016)) | (29360128 & ($dirty4 << 12)), ((($dirty4 >> 18) & 14) | (($dirty4 >> 18) & 112)) | (($dirty4 >> 18) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventEnd();
    L161:
        final float collapsedHeight4 = collapsedHeight3;
        final float expandedHeight4 = expandedHeight3;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r19;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r10 = r110;
    L162:
        ScopeUpdateScope r112 = $composer3.endRestartGroup();
        if (r112 == null) goto L166;
        r112.updateScope(new C04712(r29, modifier4, r4, r10, collapsedHeight4, expandedHeight4, windowInsets4, colors4, scrollBehavior3, $changed, r40));
        return;
    L166:
        return;
    L154:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L157;
        r21 = expandedHeight3;
        goto L158
    L147:
        if (Dp.m6978equalsimpl0(collapsedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L150;
        r20 = collapsedHeight3;
        goto L152
    L140:
        scrollBehavior2 = scrollBehavior;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r19 = r6;
        r110 = r8;
        collapsedHeight3 = collapsedHeight2;
        modifier3 = modifier2;
        $dirty4 = $dirty3;
        expandedHeight3 = expandedHeight2;
        goto L141
    L137:
        colors2 = colors;
        goto L138
    L133:
        windowInsets2 = windowInsets;
        $dirty3 = $dirty2;
        goto L135
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r40 & 64) == 0) goto L115;
        int $dirty5 = $dirty2 & (-3670017);
    L117:
        if ((r40 & 128) == 0) goto L119;
        $dirty5 = $dirty5 & (-29360129);
    L119:
        Modifier r11 = modifier2;
        $dirty4 = $dirty5;
        collapsedHeight3 = collapsedHeight2;
        modifier3 = r11;
        windowInsets3 = windowInsets;
        colors3 = colors;
        scrollBehavior2 = scrollBehavior;
        r19 = r6;
        r110 = r8;
        expandedHeight3 = expandedHeight2;
        goto L141
    L115:
        $dirty5 = $dirty2;
        goto L117
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        windowInsets4 = windowInsets;
        scrollBehavior3 = scrollBehavior;
        $composer3 = $composer2;
        modifier4 = modifier2;
        r4 = r6;
        r10 = r8;
        collapsedHeight4 = collapsedHeight2;
        expandedHeight4 = expandedHeight2;
        colors4 = colors;
        goto L162
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(scrollBehavior) == false) goto L98;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r113;
        goto L101
    L98:
        r113 = 33554432;
        goto L99
    L61:
        if ((196608 & $changed) != 0) goto L67;
        expandedHeight2 = expandedHeight;
        if ($composer2.changed(expandedHeight2) == false) goto L65;
        int r114 = 131072;
    L66:
        $dirty = $dirty | r114;
        goto L69
    L65:
        r114 = 65536;
        goto L66
    L67:
        expandedHeight2 = expandedHeight;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        collapsedHeight2 = collapsedHeight;
        if ($composer2.changed(collapsedHeight2) == false) goto L54;
        int r115 = 16384;
    L55:
        $dirty = $dirty | r115;
        goto L57
    L54:
        r115 = 8192;
        goto L55
    L56:
        collapsedHeight2 = collapsedHeight;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r32;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        r8 = r32;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r31;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        r6 = r31;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L24
    L21:
        r23 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r29;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    L12:
        r13 = r29;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of LargeTopAppBar with collapsedHeight and expandedHeight parameters")
    public static final /* synthetic */ void LargeTopAppBar(final Function2 title, Modifier modifier, Function2 navigationIcon, Function3 actions, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation($composer2, "C(LargeTopAppBar)P(5,2,3!1,6)541@26855L12,542@26917L22,545@27001L385:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2 r9 = title;
    L13:
        int r3 = r30 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r30 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2 navigationIcon2 = navigationIcon;
    L35:
        int r7 = r30 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3 actions2 = actions;
    L47:
        if (($changed & 24576) == 0) goto L49;
        WindowInsets windowInsets2 = windowInsets;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        TopAppBarColors colors2 = colors;
    L68:
        int r13 = r30 & 64;
        if (r13 == 0) goto L72;
        $dirty = $dirty | 1572864;
        TopAppBarScrollBehavior r14 = scrollBehavior;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r3 == 0) goto L99;
        Modifier.Companion modifier2 = Modifier.Companion;
    L100:
        if (r5 == 0) goto L102;
        navigationIcon2 = ComposableSingletons$AppBarKt.INSTANCE.m2071getLambda13$material3_release();
    L102:
        if (r7 == 0) goto L105;
        actions2 = ComposableSingletons$AppBarKt.INSTANCE.m2072getLambda14$material3_release();
    L105:
        if ((r30 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L108:
        if ((r30 & 32) == 0) goto L110;
        $dirty = $dirty & (-458753);
        colors2 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors($composer2, 6);
    L110:
        if (r13 == 0) goto L112;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2 navigationIcon3 = navigationIcon2;
        Function3 actions3 = actions2;
        Modifier modifier3 = modifier2;
        int r0 = -474540752;
    L113:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
    L116:
        Composer $composer3 = $composer2;
        m1898LargeTopAppBaroKE7A98(r9, modifier3, navigationIcon3, actions3, TopAppBarDefaults.INSTANCE.m2984getLargeAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2985getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets3, colors3, scrollBehavior2, $composer3, ((((((($dirty & 14) | 221184) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty << 6) & 3670016)) | (($dirty << 6) & 29360128)) | (($dirty << 6) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L119;
        ComposerKt.traceEventEnd();
    L119:
        final Modifier modifier4 = modifier3;
        final Function2 navigationIcon4 = navigationIcon3;
        final Function3 actions4 = actions3;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
    L120:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L124;
        r11.updateScope(new C04681(title, modifier4, navigationIcon4, actions4, windowInsets4, colors4, scrollBehavior3, $changed, r30));
        return;
    L124:
        return;
    L112:
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = modifier2;
        r0 = -474540752;
        goto L113
    L99:
        modifier2 = r4;
        goto L100
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r30 & 16) == 0) goto L94;
        $dirty = $dirty & (-57345);
    L94:
        if ((r30 & 32) == 0) goto L96;
        $dirty = $dirty & (-458753);
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = -474540752;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = r4;
        goto L113
    L96:
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        scrollBehavior2 = r14;
        r0 = -474540752;
        navigationIcon3 = navigationIcon2;
        actions3 = actions2;
        modifier3 = r4;
        goto L113
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        actions4 = actions2;
        $composer3 = $composer2;
        navigationIcon4 = navigationIcon2;
        windowInsets4 = windowInsets2;
        colors4 = colors2;
        scrollBehavior3 = r14;
        goto L120
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r14 = scrollBehavior;
        if ($composer2.changed(r14) == false) goto L76;
        int r15 = 1048576;
    L77:
        $dirty = $dirty | r15;
        goto L80
    L76:
        r15 = 524288;
        goto L77
    L78:
        r14 = scrollBehavior;
        goto L80
    L60:
        if ((r30 & 32) != 0) goto L64;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
    L65:
        r16 = 65536;
        goto L66
    L64:
        colors2 = colors;
        goto L65
    L49:
        if ((r30 & 16) != 0) goto L53;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        windowInsets2 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        actions2 = actions;
        if ($composer2.changedInstance(actions2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        actions2 = actions;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        navigationIcon2 = navigationIcon;
        if ($composer2.changedInstance(navigationIcon2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        navigationIcon2 = navigationIcon;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = title;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        r9 = title;
        goto L13
    }

    /* JADX INFO: renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    public static final void m1898LargeTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> r29, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r31, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, float collapsedHeight, float expandedHeight, WindowInsets windowInsets, TopAppBarColors colors, TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-630005584);
        ComposerKt.sourceInformation($composer2, "C(LargeTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)610@30747L12,611@30809L22,616@30993L5,617@31064L5,614@30893L943:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function2<? super Composer, ? super Integer, Unit> r13 = r29;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r40 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r31;
    L35:
        int r7 = r40 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r8 = r32;
    L46:
        int r9 = r40 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        float collapsedHeight2 = collapsedHeight;
    L57:
        int r14 = r40 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float expandedHeight2 = expandedHeight;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r40 & 64) != 0) goto L76;
        if ($composer2.changed(windowInsets) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
    L76:
        r17 = 524288;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
    L87:
        r18 = 4194304;
    L90:
        int r0 = r40 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L120:
        if (r3 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r5 == 0) goto L124;
        r6 = ComposableSingletons$AppBarKt.INSTANCE.m2073getLambda15$material3_release();
    L124:
        if (r7 == 0) goto L126;
        r8 = ComposableSingletons$AppBarKt.INSTANCE.m2074getLambda16$material3_release();
    L126:
        if (r9 == 0) goto L128;
        collapsedHeight2 = TopAppBarDefaults.INSTANCE.m2984getLargeAppBarCollapsedHeightD9Ej5fM();
    L128:
        if (r14 == 0) goto L131;
        expandedHeight2 = TopAppBarDefaults.INSTANCE.m2985getLargeAppBarExpandedHeightD9Ej5fM();
    L131:
        if ((r40 & 64) == 0) goto L133;
        WindowInsets windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        int $dirty3 = $dirty2 & (-3670017);
    L135:
        if ((r40 & 128) == 0) goto L137;
        TopAppBarColors colors2 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors($composer2, 6);
        $dirty3 = $dirty3 & (-29360129);
    L138:
        if (r0 == 0) goto L140;
        WindowInsets windowInsets3 = windowInsets2;
        TopAppBarColors colors3 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r19 = r6;
        TopAppBarScrollBehavior scrollBehavior2 = null;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r110 = r8;
        float collapsedHeight3 = collapsedHeight2;
        Modifier modifier3 = modifier2;
        int $dirty4 = $dirty3;
        float expandedHeight3 = expandedHeight2;
    L141:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventStart(-630005584, $dirty4, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
    L144:
        TextStyle r15 = TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        TextStyle r111 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), $composer2, 6);
        float r16 = LargeTitleBottomPadding;
        if (Dp.m6978equalsimpl0(collapsedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L147;
    L150:
        float r20 = TopAppBarDefaults.INSTANCE.m2984getLargeAppBarCollapsedHeightD9Ej5fM();
    L152:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6993getUnspecifiedD9Ej5fM()) == false) goto L154;
    L157:
        float r21 = TopAppBarDefaults.INSTANCE.m2985getLargeAppBarExpandedHeightD9Ej5fM();
    L158:
        Composer $composer3 = $composer2;
        m1903TwoRowsTopAppBarnS6u9G4(modifier3, r13, r15, r16, r29, r111, r19, r110, r20, r21, windowInsets3, colors3, scrollBehavior2, $composer3, (((((($dirty4 >> 3) & 14) | 3072) | (($dirty4 << 3) & 112)) | (($dirty4 << 12) & 57344)) | (($dirty4 << 12) & 3670016)) | (29360128 & ($dirty4 << 12)), ((($dirty4 >> 18) & 14) | (($dirty4 >> 18) & 112)) | (($dirty4 >> 18) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L161;
        ComposerKt.traceEventEnd();
    L161:
        final float collapsedHeight4 = collapsedHeight3;
        final float expandedHeight4 = expandedHeight3;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r19;
        final WindowInsets windowInsets4 = windowInsets3;
        final TopAppBarColors colors4 = colors3;
        final TopAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r10 = r110;
    L162:
        ScopeUpdateScope r112 = $composer3.endRestartGroup();
        if (r112 == null) goto L166;
        r112.updateScope(new C04692(r29, modifier4, r4, r10, collapsedHeight4, expandedHeight4, windowInsets4, colors4, scrollBehavior3, $changed, r40));
        return;
    L166:
        return;
    L154:
        if (Dp.m6978equalsimpl0(expandedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L157;
        r21 = expandedHeight3;
        goto L158
    L147:
        if (Dp.m6978equalsimpl0(collapsedHeight3, Dp.Companion.m6992getInfinityD9Ej5fM()) == true) goto L150;
        r20 = collapsedHeight3;
        goto L152
    L140:
        scrollBehavior2 = scrollBehavior;
        windowInsets3 = windowInsets2;
        colors3 = colors2;
        r19 = r6;
        r110 = r8;
        collapsedHeight3 = collapsedHeight2;
        modifier3 = modifier2;
        $dirty4 = $dirty3;
        expandedHeight3 = expandedHeight2;
        goto L141
    L137:
        colors2 = colors;
        goto L138
    L133:
        windowInsets2 = windowInsets;
        $dirty3 = $dirty2;
        goto L135
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r40 & 64) == 0) goto L115;
        int $dirty5 = $dirty2 & (-3670017);
    L117:
        if ((r40 & 128) == 0) goto L119;
        $dirty5 = $dirty5 & (-29360129);
    L119:
        Modifier r11 = modifier2;
        $dirty4 = $dirty5;
        collapsedHeight3 = collapsedHeight2;
        modifier3 = r11;
        windowInsets3 = windowInsets;
        colors3 = colors;
        scrollBehavior2 = scrollBehavior;
        r19 = r6;
        r110 = r8;
        expandedHeight3 = expandedHeight2;
        goto L141
    L115:
        $dirty5 = $dirty2;
        goto L117
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        windowInsets4 = windowInsets;
        scrollBehavior3 = scrollBehavior;
        $composer3 = $composer2;
        modifier4 = modifier2;
        r4 = r6;
        r10 = r8;
        collapsedHeight4 = collapsedHeight2;
        expandedHeight4 = expandedHeight2;
        colors4 = colors;
        goto L162
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(scrollBehavior) == false) goto L98;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r113;
        goto L101
    L98:
        r113 = 33554432;
        goto L99
    L61:
        if ((196608 & $changed) != 0) goto L67;
        expandedHeight2 = expandedHeight;
        if ($composer2.changed(expandedHeight2) == false) goto L65;
        int r114 = 131072;
    L66:
        $dirty = $dirty | r114;
        goto L69
    L65:
        r114 = 65536;
        goto L66
    L67:
        expandedHeight2 = expandedHeight;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        collapsedHeight2 = collapsedHeight;
        if ($composer2.changed(collapsedHeight2) == false) goto L54;
        int r115 = 16384;
    L55:
        $dirty = $dirty | r115;
        goto L57
    L54:
        r115 = 8192;
        goto L55
    L56:
        collapsedHeight2 = collapsedHeight;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = r32;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        r8 = r32;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r31;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        r6 = r31;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L24
    L21:
        r23 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r29;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    L12:
        r13 = r29;
        goto L13
    }

    /* JADX INFO: renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    public static final void m1894BottomAppBarSnr_uVM(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r27, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r29, long containerColor, long contentColor, float tonalElevation, PaddingValues contentPadding, WindowInsets windowInsets, Composer $composer, final int $changed, final int r39) {
        Composer $composer2 = $composer.startRestartGroup(2141738945);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)678@33855L14,679@33897L31,682@34123L12,684@34145L355:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r39 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r13 = r27;
    L13:
        int r3 = r39 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r39 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r6 = r29;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long containerColor2 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long contentColor2 = contentColor;
    L57:
        int r14 = r39 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float tonalElevation2 = tonalElevation;
    L68:
        int r16 = r39 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($changed & 12582912) != 0) goto L91;
        if ((r39 & 128) != 0) goto L87;
        if ($composer2.changed(windowInsets) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
    L87:
        r18 = 4194304;
    L91:
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L111:
        if (r3 == 0) goto L113;
        modifier2 = Modifier.Companion;
    L113:
        if (r5 == 0) goto L116;
        r6 = null;
    L116:
        if ((r39 & 8) == 0) goto L119;
        containerColor2 = BottomAppBarDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L119:
        if ((r39 & 16) == 0) goto L121;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty >> 9) & 14);
        $dirty = $dirty & (-57345);
    L121:
        if (r14 == 0) goto L123;
        tonalElevation2 = BottomAppBarDefaults.INSTANCE.m1917getContainerElevationD9Ej5fM();
    L123:
        if (r16 == 0) goto L125;
        PaddingValues contentPadding2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
    L127:
        if ((r39 & 128) == 0) goto L129;
        $dirty = $dirty & (-29360129);
        PaddingValues contentPadding3 = contentPadding2;
        Modifier modifier3 = modifier2;
        WindowInsets windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        long containerColor3 = containerColor2;
        long contentColor3 = contentColor2;
        float tonalElevation3 = tonalElevation2;
        int r0 = 2141738945;
        Function2<? super Composer, ? super Integer, Unit> r15 = r6;
    L130:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:684)");
    L133:
        Composer $composer3 = $composer2;
        m1896BottomAppBarqhFBPw4(r13, modifier3, r15, containerColor3, contentColor3, tonalElevation3, contentPadding3, windowInsets2, null, $composer3, (((((((($dirty & 14) | 100663296) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventEnd();
    L136:
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r15;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
        final float tonalElevation4 = tonalElevation3;
        final PaddingValues contentPadding4 = contentPadding3;
        final WindowInsets windowInsets3 = windowInsets2;
    L137:
        ScopeUpdateScope r17 = $composer3.endRestartGroup();
        if (r17 == null) goto L141;
        r17.updateScope(new AppBarKt$BottomAppBar$1(r27, modifier4, r4, containerColor4, contentColor4, tonalElevation4, contentPadding4, windowInsets3, $changed, r39));
        return;
    L141:
        return;
    L129:
        windowInsets2 = windowInsets;
        contentPadding3 = contentPadding2;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        r0 = 2141738945;
        r15 = r6;
        goto L130
    L125:
        contentPadding2 = contentPadding;
        goto L127
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L111;
        $composer2.skipToGroupEnd();
        if ((r39 & 8) == 0) goto L105;
        $dirty = $dirty & (-7169);
    L105:
        if ((r39 & 16) == 0) goto L108;
        $dirty = $dirty & (-57345);
    L108:
        if ((r39 & 128) == 0) goto L110;
        contentPadding3 = contentPadding;
        windowInsets2 = windowInsets;
        $dirty = $dirty & (-29360129);
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        r0 = 2141738945;
        r15 = r6;
        goto L130
    L110:
        contentPadding3 = contentPadding;
        windowInsets2 = windowInsets;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        r0 = 2141738945;
        r15 = r6;
        goto L130
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        r4 = r6;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        tonalElevation4 = tonalElevation2;
        contentPadding4 = contentPadding;
        windowInsets3 = windowInsets;
        goto L137
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(contentPadding) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L80
    L76:
        r19 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L67:
        tonalElevation2 = tonalElevation;
        goto L68
    L49:
        if ((r39 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
    L54:
        r111 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r39 & 8) != 0) goto L42;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
    L43:
        r9 = 1024;
        goto L44
    L42:
        containerColor2 = containerColor;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = r29;
        if ($composer2.changedInstance(r6) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L36
    L32:
        r7 = 128;
        goto L33
    L34:
        r6 = r29;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = r27;
        if ($composer2.changedInstance(r13) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L13
    L10:
        r10 = 2;
        goto L11
    L12:
        r13 = r27;
        goto L13
    }

    /* JADX INFO: renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    public static final void m1896BottomAppBarqhFBPw4(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r27, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r29, long containerColor, long contentColor, float tonalElevation, PaddingValues contentPadding, WindowInsets windowInsets, BottomAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-1044837119);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,7:c#ui.unit.Dp!1,8)743@37109L14,744@37151L31,747@37377L12,758@37741L539,750@37455L825:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r40 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r6 = r40 & 4;
        if (r6 == 0) goto L27;
        $dirty = $dirty | 384;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r29;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long containerColor2 = containerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long contentColor2 = contentColor;
    L56:
        int r14 = r40 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float tonalElevation2 = tonalElevation;
    L67:
        int r16 = r40 & 64;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($changed & 12582912) != 0) goto L89;
        if ((r40 & 128) != 0) goto L86;
        if ($composer2.changed(windowInsets) == false) goto L86;
        int r19 = 8388608;
    L87:
        $dirty = $dirty | r19;
    L86:
        r19 = 4194304;
    L89:
        int r0 = r40 & 256;
        if (r0 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L121:
        if (r4 == 0) goto L123;
        modifier2 = Modifier.Companion;
    L123:
        if (r6 == 0) goto L126;
        r7 = null;
    L126:
        if ((r40 & 8) == 0) goto L129;
        containerColor2 = BottomAppBarDefaults.INSTANCE.getContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L129:
        if ((r40 & 16) == 0) goto L131;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty >> 9) & 14);
        $dirty = $dirty & (-57345);
    L131:
        if (r14 == 0) goto L133;
        tonalElevation2 = BottomAppBarDefaults.INSTANCE.m1917getContainerElevationD9Ej5fM();
    L133:
        if (r16 == 0) goto L135;
        PaddingValues contentPadding2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
    L137:
        if ((r40 & 128) == 0) goto L139;
        WindowInsets windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        $dirty = $dirty & (-29360129);
    L140:
        if (r0 == 0) goto L142;
        PaddingValues contentPadding3 = contentPadding2;
        BottomAppBarScrollBehavior scrollBehavior2 = null;
        Modifier modifier3 = modifier2;
        WindowInsets windowInsets3 = windowInsets2;
        float tonalElevation3 = tonalElevation2;
        int r5 = -1044837119;
        long containerColor3 = containerColor2;
        long contentColor3 = contentColor2;
    L143:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventStart(r5, $dirty, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
    L146:
        Composer $composer3 = $composer2;
        m1895BottomAppBare3WI5M(modifier3, containerColor3, contentColor3, tonalElevation3, contentPadding3, windowInsets3, scrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new AppBarKt$BottomAppBar$2(r27, r7), $composer2, 54), $composer3, ((((((12582912 | (($dirty >> 3) & 14)) | (($dirty >> 6) & 112)) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 7168)) | (($dirty >> 6) & 57344)) | (($dirty >> 6) & 458752)) | (($dirty >> 6) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventEnd();
    L149:
        final Modifier modifier4 = modifier3;
        final long containerColor4 = containerColor3;
        final float tonalElevation4 = tonalElevation3;
        final PaddingValues contentPadding4 = contentPadding3;
        final WindowInsets windowInsets4 = windowInsets3;
        final BottomAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final Function2<? super Composer, ? super Integer, Unit> r3 = r7;
        final long contentColor4 = contentColor3;
    L150:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L154;
        r15.updateScope(new AppBarKt$BottomAppBar$3(r27, modifier4, r3, containerColor4, contentColor4, tonalElevation4, contentPadding4, windowInsets4, scrollBehavior3, $changed, r40));
        return;
    L154:
        return;
    L142:
        scrollBehavior2 = scrollBehavior;
        contentPadding3 = contentPadding2;
        modifier3 = modifier2;
        windowInsets3 = windowInsets2;
        tonalElevation3 = tonalElevation2;
        r5 = -1044837119;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L143
    L139:
        windowInsets2 = windowInsets;
        goto L140
    L135:
        contentPadding2 = contentPadding;
        goto L137
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r40 & 8) == 0) goto L115;
        $dirty = $dirty & (-7169);
    L115:
        if ((r40 & 16) == 0) goto L118;
        $dirty = $dirty & (-57345);
    L118:
        if ((r40 & 128) == 0) goto L120;
        contentPadding3 = contentPadding;
        windowInsets3 = windowInsets;
        scrollBehavior2 = scrollBehavior;
        $dirty = $dirty & (-29360129);
        modifier3 = modifier2;
        tonalElevation3 = tonalElevation2;
        r5 = -1044837119;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L143
    L120:
        contentPadding3 = contentPadding;
        windowInsets3 = windowInsets;
        scrollBehavior2 = scrollBehavior;
        modifier3 = modifier2;
        tonalElevation3 = tonalElevation2;
        r5 = -1044837119;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L143
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        r3 = r7;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        tonalElevation4 = tonalElevation2;
        contentPadding4 = contentPadding;
        windowInsets4 = windowInsets;
        scrollBehavior3 = scrollBehavior;
        goto L150
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(scrollBehavior) == false) goto L97;
        int r20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r20;
        goto L101
    L97:
        r20 = 33554432;
        goto L98
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(contentPadding) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
        goto L79
    L75:
        r18 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
        goto L67
    L64:
        r17 = 65536;
        goto L65
    L66:
        tonalElevation2 = tonalElevation;
        goto L67
    L48:
        if ((r40 & 16) != 0) goto L52;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
    L53:
        r110 = 8192;
        goto L54
    L52:
        contentColor2 = contentColor;
        goto L53
    L37:
        if ((r40 & 8) != 0) goto L41;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L42;
        int r10 = 2048;
    L43:
        $dirty = $dirty | r10;
    L42:
        r10 = 1024;
        goto L43
    L41:
        containerColor2 = containerColor;
        goto L42
    L27:
        if (($changed & 384) != 0) goto L33;
        r7 = r29;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r8 = 256;
    L32:
        $dirty = $dirty | r8;
        goto L35
    L31:
        r8 = 128;
        goto L32
    L33:
        r7 = r29;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L23
    L20:
        r9 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r27) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L12
    L10:
        r11 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    public static final void m1893BottomAppBar1oL4kX8(Modifier modifier, long containerColor, long contentColor, float tonalElevation, PaddingValues contentPadding, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)807@39959L14,808@40001L31,811@40227L12,814@40294L302:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r35 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long containerColor2 = containerColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r9 = r35 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        float tonalElevation2 = tonalElevation;
    L46:
        int r12 = r35 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        PaddingValues contentPadding2 = contentPadding;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        WindowInsets r14 = windowInsets;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = $dirty;
        if (($dirty & 599187) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L101:
        if (r3 == 0) goto L104;
        modifier2 = Modifier.Companion;
    L104:
        if ((r35 & 2) == 0) goto L106;
        containerColor2 = BottomAppBarDefaults.INSTANCE.getContainerColor($composer2, 6);
        int $dirty3 = $dirty2 & (-113);
    L108:
        if ((r35 & 4) == 0) goto L111;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty3 >> 3) & 14);
        $dirty3 = $dirty3 & (-897);
    L111:
        if (r9 == 0) goto L113;
        tonalElevation2 = BottomAppBarDefaults.INSTANCE.m1917getContainerElevationD9Ej5fM();
    L113:
        if (r12 == 0) goto L116;
        contentPadding2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
    L116:
        if ((r35 & 32) == 0) goto L118;
        WindowInsets windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        long contentColor3 = contentColor2;
        PaddingValues contentPadding3 = contentPadding2;
        int r4 = -1391700845;
        int $dirty4 = $dirty3 & (-458753);
        long containerColor3 = containerColor2;
        float tonalElevation3 = tonalElevation2;
        Modifier modifier3 = modifier2;
    L119:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventStart(r4, $dirty4, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
    L122:
        Composer $composer3 = $composer2;
        m1895BottomAppBare3WI5M(modifier3, containerColor3, contentColor3, tonalElevation3, contentPadding3, windowInsets2, null, r32, $composer3, ((((((1572864 | ($dirty4 & 14)) | ($dirty4 & 112)) | ($dirty4 & 896)) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (458752 & $dirty4)) | (29360128 & ($dirty4 << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
    L125:
        final long containerColor4 = containerColor3;
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final float tonalElevation4 = tonalElevation3;
        final PaddingValues contentPadding4 = contentPadding3;
        final WindowInsets windowInsets3 = windowInsets2;
    L126:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L130;
        r13.updateScope(new AppBarKt$BottomAppBar$4(modifier4, containerColor4, contentColor4, tonalElevation4, contentPadding4, windowInsets3, r32, $changed, r35));
        return;
    L130:
        return;
    L118:
        $dirty4 = $dirty3;
        contentPadding3 = contentPadding2;
        windowInsets2 = r14;
        r4 = -1391700845;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        modifier3 = modifier2;
        goto L119
    L106:
        $dirty3 = $dirty2;
        goto L108
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L101;
        $composer2.skipToGroupEnd();
        if ((r35 & 2) == 0) goto L93;
        int $dirty5 = $dirty2 & (-113);
    L95:
        if ((r35 & 4) == 0) goto L98;
        $dirty5 = $dirty5 & (-897);
    L98:
        if ((r35 & 32) == 0) goto L100;
        $dirty4 = $dirty5 & (-458753);
        contentPadding3 = contentPadding2;
        windowInsets2 = r14;
        r4 = -1391700845;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        modifier3 = modifier2;
        goto L119
    L100:
        $dirty4 = $dirty5;
        contentPadding3 = contentPadding2;
        windowInsets2 = r14;
        r4 = -1391700845;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        modifier3 = modifier2;
        goto L119
    L93:
        $dirty5 = $dirty2;
        goto L95
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        tonalElevation4 = tonalElevation2;
        contentPadding4 = contentPadding2;
        windowInsets3 = r14;
        goto L126
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L79
    L76:
        r17 = 524288;
        goto L77
    L60:
        if ((r35 & 32) != 0) goto L64;
        r14 = windowInsets;
        if ($composer2.changed(r14) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
    L65:
        r15 = 65536;
        goto L66
    L64:
        r14 = windowInsets;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        contentPadding2 = contentPadding;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L46
    L43:
        r18 = 1024;
        goto L44
    L45:
        tonalElevation2 = tonalElevation;
        goto L46
    L27:
        if ((r35 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r35 & 2) != 0) goto L20;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        containerColor2 = containerColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    public static final void m1895BottomAppBare3WI5M(Modifier modifier, long containerColor, long contentColor, float tonalElevation, PaddingValues contentPadding, WindowInsets windowInsets, BottomAppBarScrollBehavior scrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(422438773);
        ComposerKt.sourceInformation($composer2, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp,3,7,5)860@42630L14,861@42672L31,864@42898L12,896@44292L5,899@44363L596,911@45008L364,891@44025L1347:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r44 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long containerColor2 = containerColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r9 = r44 & 8;
        if (r9 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r13 = tonalElevation;
    L46:
        int r14 = r44 & 16;
        if (r14 == 0) goto L50;
        $dirty = $dirty | 24576;
        PaddingValues r15 = contentPadding;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ((r44 & 32) != 0) goto L65;
        if ($composer2.changed(windowInsets) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
    L68:
        int r18 = r44 & 64;
        if (r18 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r44 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L89:
        int $dirty2 = $dirty;
        if ((4793491 & $dirty) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L111:
        if (r3 == 0) goto L114;
        modifier2 = Modifier.Companion;
    L114:
        if ((r44 & 2) == 0) goto L116;
        containerColor2 = BottomAppBarDefaults.INSTANCE.getContainerColor($composer2, 6);
        int $dirty3 = $dirty2 & (-113);
    L118:
        if ((r44 & 4) == 0) goto L120;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty3 >> 3) & 14);
        $dirty3 = $dirty3 & (-897);
    L120:
        if (r9 == 0) goto L122;
        float tonalElevation2 = BottomAppBarDefaults.INSTANCE.m1917getContainerElevationD9Ej5fM();
    L123:
        if (r14 == 0) goto L125;
        final PaddingValues contentPadding2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
    L127:
        if ((r44 & 32) == 0) goto L129;
        WindowInsets windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        $dirty3 = $dirty3 & (-458753);
    L130:
        if (r18 == 0) goto L132;
        float tonalElevation3 = tonalElevation2;
        long containerColor3 = containerColor2;
        final BottomAppBarScrollBehavior scrollBehavior2 = null;
        int $dirty4 = $dirty3;
        long contentColor3 = contentColor2;
        final WindowInsets windowInsets3 = windowInsets2;
        int r7 = 422438773;
    L133:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventStart(r7, $dirty4, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
    L136:
        $composer2.startReplaceGroup(1393560009);
        ComposerKt.sourceInformation($composer2, "874@43358L55,874@43335L78,875@43447L289");
        if (scrollBehavior2 != null) goto L139;
    L163:
        $dirty4 = $dirty4;
        int r33 = 3670016;
        Modifier.Companion appBarDragModifier = Modifier.Companion;
    L164:
        $composer2.endReplaceGroup();
        Shape r16 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), $composer2, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, 1393598804, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty4 & r33) != 1048576) goto L167;
        boolean invalid$iv = true;
    L168:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L175;
        if (it$iv == Composer.Companion.getEmpty()) goto L175;
        Object value$iv = it$iv;
    L176:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(LayoutModifierKt.layout(modifier2, (Function3) value$iv).then(appBarDragModifier), r16, containerColor3, contentColor3, tonalElevation3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new AppBarKt$BottomAppBar$6(windowInsets3, contentPadding2, r41), $composer2, 54), $composer3, (((($dirty4 << 3) & 896) | 12582912) | (($dirty4 << 3) & 7168)) | (57344 & ($dirty4 << 3)), 96);
        if (ComposerKt.isTraceInProgress() == false) goto L179;
        ComposerKt.traceEventEnd();
    L179:
        final WindowInsets windowInsets4 = windowInsets3;
        final Modifier modifier3 = modifier2;
        final PaddingValues contentPadding3 = contentPadding2;
        final long contentColor4 = contentColor3;
        final float tonalElevation4 = tonalElevation3;
        final BottomAppBarScrollBehavior scrollBehavior3 = scrollBehavior2;
        final long containerColor4 = containerColor3;
    L180:
        ScopeUpdateScope r19 = $composer3.endRestartGroup();
        if (r19 == null) goto L184;
        r19.updateScope(new AppBarKt$BottomAppBar$7(modifier3, containerColor4, contentColor4, tonalElevation4, contentPadding3, windowInsets4, scrollBehavior3, r41, $changed, r44));
        return;
    L184:
        return;
    L175:
        value$iv = (Function3) new AppBarKt$BottomAppBar$5$1(scrollBehavior2);
        $composer2.updateRememberedValue(value$iv);
        goto L176
    L167:
        invalid$iv = false;
        goto L168
    L139:
        if (scrollBehavior2.isPinned() == true) goto L163;
        Modifier.Companion r20 = Modifier.Companion;
        Orientation r23 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart($composer2, 1393566103, "CC(remember):AppBar.kt#9igjgp");
        r33 = 3670016;
        if (($dirty4 & 3670016) != 1048576) goto L143;
        boolean invalid$iv2 = true;
    L144:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L147;
    L150:
        Object value$iv2 = (Function1) new AppBarKt$BottomAppBar$appBarDragModifier$1$1(scrollBehavior2);
        $composer2.updateRememberedValue(value$iv2);
    L151:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DraggableState r22 = DraggableKt.rememberDraggableState((Function1) value$iv2, $composer2, 0);
        Modifier.Companion r21 = r20;
        ComposerKt.sourceInformationMarkerStart($composer2, 1393569185, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty4 & 3670016) != 1048576) goto L154;
        boolean invalid$iv3 = true;
    L155:
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L158;
    L161:
        AppBarKt$BottomAppBar$appBarDragModifier$2$1 value$iv3 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(scrollBehavior2, null);
        $composer2.updateRememberedValue(value$iv3);
    L162:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        appBarDragModifier = DraggableKt.draggable$default(r21, r22, r23, false, null, false, null, (Function3) value$iv3, false, 188, null);
        goto L164
    L158:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L161;
        value$iv3 = it$iv3;
        goto L162
    L154:
        invalid$iv3 = false;
        goto L155
    L147:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L150;
        value$iv2 = it$iv2;
        goto L151
    L143:
        invalid$iv2 = false;
        goto L144
    L132:
        tonalElevation3 = tonalElevation2;
        containerColor3 = containerColor2;
        scrollBehavior2 = scrollBehavior;
        $dirty4 = $dirty3;
        contentColor3 = contentColor2;
        windowInsets3 = windowInsets2;
        r7 = 422438773;
        goto L133
    L129:
        windowInsets2 = windowInsets;
        goto L130
    L125:
        contentPadding2 = r15;
        goto L127
    L122:
        tonalElevation2 = r13;
        goto L123
    L116:
        $dirty3 = $dirty2;
        goto L118
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L111;
        $composer2.skipToGroupEnd();
        if ((r44 & 2) == 0) goto L103;
        int $dirty5 = $dirty2 & (-113);
    L105:
        if ((r44 & 4) == 0) goto L108;
        $dirty5 = $dirty5 & (-897);
    L108:
        if ((r44 & 32) == 0) goto L110;
        $dirty5 = $dirty5 & (-458753);
    L110:
        scrollBehavior2 = scrollBehavior;
        tonalElevation3 = r13;
        contentPadding2 = r15;
        containerColor3 = containerColor2;
        $dirty4 = $dirty5;
        contentColor3 = contentColor2;
        r7 = 422438773;
        windowInsets3 = windowInsets;
        goto L133
    L103:
        $dirty5 = $dirty2;
        goto L105
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        scrollBehavior3 = scrollBehavior;
        $composer3 = $composer2;
        modifier3 = modifier2;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        tonalElevation4 = r13;
        contentPadding3 = r15;
        windowInsets4 = windowInsets;
        goto L180
    L83:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changedInstance(r41) == false) goto L87;
        int r0 = 8388608;
    L88:
        $dirty = $dirty | r0;
        goto L89
    L87:
        r0 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(scrollBehavior) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L50:
        if (($changed & 24576) != 0) goto L56;
        r15 = contentPadding;
        if ($composer2.changed(r15) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L58
    L54:
        r111 = 8192;
        goto L55
    L56:
        r15 = contentPadding;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r13 = tonalElevation;
        if ($composer2.changed(r13) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L46
    L43:
        r112 = 1024;
        goto L44
    L45:
        r13 = tonalElevation;
        goto L46
    L27:
        if ((r44 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
    L32:
        r10 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r44 & 2) != 0) goto L20;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        containerColor2 = containerColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    public static final TopAppBarState rememberTopAppBarState(final float initialHeightOffsetLimit, final float initialHeightOffset, final float initialContentOffset, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 1801969826, "C(rememberTopAppBarState)P(2,1)1292@62790L99,1292@62743L146:AppBar.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L6;
        initialHeightOffsetLimit = -3.4028235E38f;
    L6:
        if ((r14 & 2) == 0) goto L9;
        initialHeightOffset = 0.0f;
    L9:
        if ((r14 & 4) == 0) goto L12;
        initialContentOffset = 0.0f;
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(1801969826, $changed, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
    L14:
        boolean r15 = false;
        Object[] r2 = new Object[0];
        Saver<TopAppBarState, ?> r3 = TopAppBarState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, 1949255933, "CC(remember):AppBar.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L19;
        if ($composer.changed(initialHeightOffsetLimit) == false) goto L19;
    L20:
        boolean r0 = true;
    L23:
        if ((($changed & 112) ^ 48) <= 32) goto L27;
        if ($composer.changed(initialHeightOffset) == false) goto L27;
    L28:
        boolean r1 = true;
    L30:
        boolean r4 = r0 | r1;
        if ((($changed & 896) ^ 384) <= 256) goto L35;
        if ($composer.changed(initialContentOffset) == false) goto L35;
    L36:
        r15 = true;
    L37:
        boolean invalid$iv = r15 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L40;
    L43:
        Object value$iv = (Function0) new AppBarKt$rememberTopAppBarState$1$1(initialHeightOffsetLimit, initialHeightOffset, initialContentOffset);
        $composer.updateRememberedValue(value$iv);
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        TopAppBarState r12 = (TopAppBarState) RememberSaveableKt.m3923rememberSaveable(r2, r3, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L40:
        if (it$iv == Composer.Companion.getEmpty()) goto L43;
        value$iv = it$iv;
    L35:
        if (($changed & 384) != 256) goto L37;
    L27:
        if (($changed & 48) == 32) goto L28;
        r1 = false;
    L19:
        if (($changed & 6) == 4) goto L20;
        r0 = false;
        goto L23
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float initialHeightOffsetLimit, final float initialHeightOffset, final float initialContentOffset, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 1420874240, "C(rememberBottomAppBarState)P(2,1)1611@75546L102,1611@75496L152:AppBar.kt#uh7d8r");
        if ((r14 & 1) == 0) goto L6;
        initialHeightOffsetLimit = -3.4028235E38f;
    L6:
        if ((r14 & 2) == 0) goto L9;
        initialHeightOffset = 0.0f;
    L9:
        if ((r14 & 4) == 0) goto L12;
        initialContentOffset = 0.0f;
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(1420874240, $changed, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
    L14:
        boolean r15 = false;
        Object[] r2 = new Object[0];
        Saver<BottomAppBarState, ?> r3 = BottomAppBarState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, -1399214710, "CC(remember):AppBar.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L19;
        if ($composer.changed(initialHeightOffsetLimit) == false) goto L19;
    L20:
        boolean r0 = true;
    L23:
        if ((($changed & 112) ^ 48) <= 32) goto L27;
        if ($composer.changed(initialHeightOffset) == false) goto L27;
    L28:
        boolean r1 = true;
    L30:
        boolean r4 = r0 | r1;
        if ((($changed & 896) ^ 384) <= 256) goto L35;
        if ($composer.changed(initialContentOffset) == false) goto L35;
    L36:
        r15 = true;
    L37:
        boolean invalid$iv = r15 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L40;
    L43:
        Object value$iv = (Function0) new AppBarKt$rememberBottomAppBarState$1$1(initialHeightOffsetLimit, initialHeightOffset, initialContentOffset);
        $composer.updateRememberedValue(value$iv);
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        BottomAppBarState r12 = (BottomAppBarState) RememberSaveableKt.m3923rememberSaveable(r2, r3, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L40:
        if (it$iv == Composer.Companion.getEmpty()) goto L43;
        value$iv = it$iv;
    L35:
        if (($changed & 384) != 256) goto L37;
    L27:
        if (($changed & 48) == 32) goto L28;
        r1 = false;
    L19:
        if (($changed & 6) == 4) goto L20;
        r0 = false;
        goto L23
    }

    public static final BottomAppBarState BottomAppBarState(float initialHeightOffsetLimit, float initialHeightOffset, float initialContentOffset) {
        return new BottomAppBarStateImpl(initialHeightOffsetLimit, initialHeightOffset, initialContentOffset);
    }

    private static final Object settleAppBarBottom(final BottomAppBarState state, float velocity, DecayAnimationSpec<Float> r25, AnimationSpec<Float> r26, Continuation<? super Velocity> r27) {
        if ((r27 instanceof C04761) == false) goto L7;
        C04761 r1 = (C04761) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        C04761 r6 = r1;
        Object $result = r6.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Ref.FloatRef remainingVelocity = (Ref.FloatRef) r6.L$0;
        ResultKt.throwOnFailure($result);
    L45:
        Ref.FloatRef remainingVelocity2 = remainingVelocity;
    L47:
        return Velocity.m7202boximpl(VelocityKt.Velocity(0.0f, remainingVelocity2.element));
    L13:
        Ref.FloatRef remainingVelocity3 = (Ref.FloatRef) r6.L$2;
        AnimationSpec<Float> r3 = (AnimationSpec) r6.L$1;
        BottomAppBarState state2 = (BottomAppBarState) r6.L$0;
        ResultKt.throwOnFailure($result);
    L30:
        remainingVelocity2 = remainingVelocity3;
        final BottomAppBarState state3 = state2;
        AnimationSpec<Float> r4 = r3;
    L32:
        if (r4 == null) goto L47;
        if (state3.getHeightOffset() >= 0.0f) goto L47;
        if (state3.getHeightOffset() <= state3.getHeightOffsetLimit()) goto L47;
        AnimationState r5 = AnimationStateKt.AnimationState$default(state3.getHeightOffset(), 0.0f, 0, 0, false, 30, null);
        if (state3.getCollapsedFraction() >= 0.5f) goto L40;
        float r7 = 0.0f;
    L41:
        Float r8 = Boxing.boxFloat(r7);
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r9 = new C04783(state3);
        r6.L$0 = remainingVelocity2;
        r6.L$1 = null;
        r6.L$2 = null;
        r6.label = 2;
        if (SuspendAnimationKt.animateTo$default(r5, r8, r4, false, r9, r6, 4, null) != r2) goto L44;
        return r2;
    L44:
        remainingVelocity = remainingVelocity2;
        goto L45
    L40:
        r7 = state3.getHeightOffsetLimit();
        goto L41
    L14:
        ResultKt.throwOnFailure($result);
        if (state.getCollapsedFraction() < 0.01f) goto L50;
        if (state.getCollapsedFraction() != 1.0f) goto L19;
        boolean r10 = true;
    L20:
        if (r10 == true) goto L50;
        final Ref.FloatRef remainingVelocity4 = new Ref.FloatRef();
        remainingVelocity4.element = velocity;
        if (r25 != null) goto L25;
    L31:
        remainingVelocity2 = remainingVelocity4;
        state3 = state;
        r4 = r26;
        goto L32
    L25:
        if (Math.abs(velocity) <= 1.0f) goto L31;
        final Ref.FloatRef lastValue = new Ref.FloatRef();
        AnimationState r11 = AnimationStateKt.AnimationState$default(0.0f, velocity, 0, 0, false, 28, null);
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r12 = new C04772(lastValue, state, remainingVelocity4);
        r6.L$0 = state;
        r6.L$1 = r26;
        r6.L$2 = remainingVelocity4;
        r6.label = 1;
        if (SuspendAnimationKt.animateDecay$default(r11, r25, false, r12, r6, 2, null) != r2) goto L29;
        return r2;
    L29:
        state2 = state;
        remainingVelocity3 = remainingVelocity4;
        r3 = r26;
        goto L30
    L19:
        r10 = false;
    L50:
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C04761(r27);
        goto L8
    }

    static {
        float arg0$iv = Dp.m6973constructorimpl(16);
        float other$iv = Dp.m6973constructorimpl(12);
        BottomAppBarHorizontalPadding = Dp.m6973constructorimpl(arg0$iv - other$iv);
        float arg0$iv2 = Dp.m6973constructorimpl(16);
        float other$iv2 = Dp.m6973constructorimpl(12);
        BottomAppBarVerticalPadding = Dp.m6973constructorimpl(arg0$iv2 - other$iv2);
        float arg0$iv3 = Dp.m6973constructorimpl(16);
        float other$iv3 = BottomAppBarHorizontalPadding;
        FABHorizontalPadding = Dp.m6973constructorimpl(arg0$iv3 - other$iv3);
        float arg0$iv4 = Dp.m6973constructorimpl(12);
        float other$iv4 = BottomAppBarVerticalPadding;
        FABVerticalPadding = Dp.m6973constructorimpl(arg0$iv4 - other$iv4);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6973constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6973constructorimpl(28);
        TopAppBarHorizontalPadding = Dp.m6973constructorimpl(4);
        float arg0$iv5 = Dp.m6973constructorimpl(16);
        float other$iv5 = TopAppBarHorizontalPadding;
        TopAppBarTitleInset = Dp.m6973constructorimpl(arg0$iv5 - other$iv5);
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    private static final void m1900SingleRowTopAppBarcJHQLPU(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r36, final TextStyle titleTextStyle, final boolean centeredTitle, final Function2<? super Composer, ? super Integer, Unit> r39, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r40, final float expandedHeight, final WindowInsets windowInsets, final TopAppBarColors colors, final TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int r47) {
        Composer $composer2 = $composer.startRestartGroup(-342194911);
        ComposerKt.sourceInformation($composer2, "C(SingleRowTopAppBar)P(4,7,8,1,5!1,3:c#ui.unit.Dp,9)*1865@85622L7,1866@85690L284,1866@85679L295,1879@86382L321,1887@86744L178,1894@87005L197,1926@88369L1014,1926@88285L1098:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        int r5 = r47 & 1;
        if (r5 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r8 = modifier;
    L14:
        if ((r47 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if ((r47 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L36:
        if ((r47 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L47:
        if ((r47 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if ((r47 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((r47 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        if ((r47 & 128) == 0) goto L81;
        $dirty = $dirty | 12582912;
    L89:
        if ((r47 & 256) == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        if ((r47 & 512) == 0) goto L103;
        int r2 = 805306368;
    L101:
        $dirty = $dirty | r2;
    L108:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty2) == 306783378) goto L111;
    L114:
        if (r5 == 0) goto L116;
        Modifier.Companion modifier2 = Modifier.Companion;
    L118:
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventStart(-342194911, $dirty2, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
    L121:
        if (Float.isNaN(expandedHeight) == false) goto L123;
    L128:
        boolean r14 = false;
    L129:
        if (r14 == false) goto L191;
        ProvidableCompositionLocal<Density> r15 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r15);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$SingleRowTopAppBar_cJHQLPU_u24lambda_u246 = (Density) r6;
        final float expandedHeightPx = RangesKt.coerceAtLeast($this$SingleRowTopAppBar_cJHQLPU_u24lambda_u246.mo376toPx0680j_4(expandedHeight), 0.0f);
        ComposerKt.sourceInformationMarkerStart($composer2, -1193658092, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty2 & 1879048192) != 536870912) goto L133;
        boolean r7 = true;
    L134:
        boolean invalid$iv = r7 | $composer2.changed(expandedHeightPx);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L140;
        int $dirty3 = $dirty2;
        if (value$iv != Composer.Companion.getEmpty()) goto L142;
    L141:
        value$iv = (Function0) new AppBarKt$SingleRowTopAppBar$2$1(scrollBehavior, expandedHeightPx);
        $composer2.updateRememberedValue(value$iv);
    L142:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -1193635911, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 1879048192) != 536870912) goto L145;
        boolean invalid$iv2 = true;
    L146:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L153;
        if (it$iv == Composer.Companion.getEmpty()) goto L153;
        Object value$iv2 = it$iv;
    L154:
        State colorTransitionFraction$delegate = (State) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        State<Color> r1 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(colors.m2976containerColorvNxB06k$material3_release(SingleRowTopAppBar_cJHQLPU$lambda$9(colorTransitionFraction$delegate)), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, $composer2, 48, 12);
        Function2 actionsRow = ComposableLambdaKt.rememberComposableLambda(1370231018, true, new AppBarKt$SingleRowTopAppBar$actionsRow$1(r40), $composer2, 54);
        $composer2.startReplaceGroup(-1193605157);
        ComposerKt.sourceInformation($composer2, "1908@87542L55,1908@87519L78,1909@87631L283");
        if (scrollBehavior != null) goto L157;
    L181:
        Modifier.Companion appBarDragModifier = Modifier.Companion;
    L182:
        $composer2.endReplaceGroup();
        SurfaceKt.m2670SurfaceT9BRK9s(modifier2.then(appBarDragModifier), null, SingleRowTopAppBar_cJHQLPU$lambda$10(r1), 0, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, expandedHeight, scrollBehavior, colors, r36, titleTextStyle, centeredTitle, r39, actionsRow), $composer2, 54), $composer2, 12582912, 122);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L185;
        ComposerKt.traceEventEnd();
    L185:
        final Modifier modifier3 = modifier2;
    L186:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L192;
        r13.updateScope(new AppBarKt$SingleRowTopAppBar$4(modifier3, r36, titleTextStyle, centeredTitle, r39, r40, expandedHeight, windowInsets, colors, scrollBehavior, $changed, r47));
        return;
    L192:
        return;
    L157:
        if (scrollBehavior.isPinned() == true) goto L181;
        Modifier.Companion r3 = Modifier.Companion;
        Orientation r26 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart($composer2, -1193599057, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 1879048192) != 536870912) goto L161;
        boolean invalid$iv3 = true;
    L162:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L165;
    L168:
        Object value$iv3 = (Function1) new AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1(scrollBehavior);
        $composer2.updateRememberedValue(value$iv3);
    L169:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DraggableState r25 = DraggableKt.rememberDraggableState((Function1) value$iv3, $composer2, 0);
        Modifier.Companion r24 = r3;
        ComposerKt.sourceInformationMarkerStart($composer2, -1193595981, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 1879048192) != 536870912) goto L172;
        boolean invalid$iv4 = true;
    L173:
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L176;
    L179:
        AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 value$iv4 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(scrollBehavior, null);
        $composer2.updateRememberedValue(value$iv4);
    L180:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        appBarDragModifier = DraggableKt.draggable$default(r24, r25, r26, false, null, false, null, (Function3) value$iv4, false, 188, null);
        goto L182
    L176:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L179;
        value$iv4 = it$iv3;
        goto L180
    L172:
        invalid$iv4 = false;
        goto L173
    L165:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L168;
        value$iv3 = it$iv2;
        goto L169
    L161:
        invalid$iv3 = false;
    L153:
        value$iv2 = SnapshotStateKt.derivedStateOf(new AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1(scrollBehavior));
        $composer2.updateRememberedValue(value$iv2);
        goto L154
    L145:
        invalid$iv2 = false;
        goto L146
    L140:
        $dirty3 = $dirty2;
        goto L141
    L133:
        r7 = false;
        goto L134
    L191:
        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
    L123:
        if (expandedHeight != Float.POSITIVE_INFINITY) goto L125;
        boolean r17 = true;
    L126:
        if (r17 == true) goto L128;
        r14 = true;
        goto L129
    L125:
        r17 = false;
        goto L126
    L116:
        modifier2 = r8;
        goto L118
    L111:
        if ($composer2.getSkipping() == false) goto L114;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r8;
        goto L186
    L103:
        if ((805306368 & $changed) != 0) goto L108;
        if ($composer2.changed(scrollBehavior) == false) goto L107;
        r2 = 536870912;
        goto L101
    L107:
        r2 = 268435456;
        goto L101
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changed(colors) == false) goto L96;
        int r4 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r4;
        goto L99
    L96:
        r4 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(windowInsets) == false) goto L85;
        int r16 = 8388608;
    L86:
        $dirty = $dirty | r16;
        goto L89
    L85:
        r16 = 4194304;
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changed(expandedHeight) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
        goto L78
    L75:
        r18 = 524288;
        goto L76
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r40) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
        goto L68
    L65:
        r19 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changedInstance(r39) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
        goto L58
    L54:
        r110 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L47;
        if ($composer2.changed(centeredTitle) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L47
    L43:
        r111 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L36;
        if ($composer2.changed(titleTextStyle) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L36
    L32:
        r112 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changedInstance(r36) == false) goto L21;
        int r12 = 32;
    L22:
        $dirty = $dirty | r12;
        goto L25
    L21:
        r12 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L14
    L10:
        r11 = 2;
        goto L11
    L12:
        r8 = modifier;
        goto L14
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> r4) {
        return r4.getValue().m4376unboximpl();
    }

    /* JADX INFO: renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    private static final void m1903TwoRowsTopAppBarnS6u9G4(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r44, final TextStyle titleTextStyle, final float titleBottomPadding, final Function2<? super Composer, ? super Integer, Unit> r47, final TextStyle smallTitleTextStyle, final Function2<? super Composer, ? super Integer, Unit> r49, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r50, final float collapsedHeight, final float expandedHeight, final WindowInsets windowInsets, final TopAppBarColors colors, final TopAppBarScrollBehavior scrollBehavior, Composer $composer, final int $changed, final int $changed1, final int r59) {
        Composer $composer2 = $composer.startRestartGroup(1169193376);
        ComposerKt.sourceInformation($composer2, "C(TwoRowsTopAppBar)P(4,9,11,10:c#ui.unit.Dp,7,8,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,12)*1984@90586L7,1992@90915L205,1992@90904L216,2008@91751L197,2042@93233L2309,2042@93149L2393:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int r11 = r59 & 1;
        if (r11 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r14 = modifier;
    L13:
        int r17 = 32;
        if ((r59 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r15 = r44;
    L24:
        int r20 = 128;
        if ((r59 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L36:
        if ((r59 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        if ((r59 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L57:
        if ((r59 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((r59 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if ((r59 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        if ((r59 & 256) == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        if ((r59 & 512) == 0) goto L103;
        int r0 = 805306368;
    L101:
        $dirty = $dirty | r0;
    L108:
        int $dirty2 = $dirty;
        if ((r59 & 1024) == 0) goto L112;
        $dirty1 = $dirty1 | 6;
    L120:
        if ((r59 & 2048) == 0) goto L123;
        $dirty1 = $dirty1 | 48;
    L130:
        if ((r59 & 4096) == 0) goto L133;
        $dirty1 = $dirty1 | 384;
    L138:
        int $dirty3 = $dirty1;
        if ((306783379 & $dirty2) == 306783378) goto L141;
    L146:
        if (r11 == 0) goto L148;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L150:
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventStart(1169193376, $dirty2, $dirty3, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
    L153:
        if (Float.isNaN(collapsedHeight) == false) goto L155;
    L160:
        boolean r16 = false;
    L161:
        if (r16 == false) goto L242;
        if (Float.isNaN(expandedHeight) == false) goto L165;
    L170:
        boolean r18 = false;
    L171:
        if (r18 == false) goto L240;
        if (Dp.m6972compareTo0680j_4(expandedHeight, collapsedHeight) < 0) goto L175;
        boolean r19 = true;
    L176:
        if (r19 == false) goto L238;
        final Ref.FloatRef expandedHeightPx = new Ref.FloatRef();
        final Ref.FloatRef collapsedHeightPx = new Ref.FloatRef();
        Ref.IntRef titleBottomPaddingPx = new Ref.IntRef();
        ProvidableCompositionLocal<Density> r12 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$TwoRowsTopAppBar_nS6u9G4_u24lambda_u2416 = (Density) r1;
        expandedHeightPx.element = $this$TwoRowsTopAppBar_nS6u9G4_u24lambda_u2416.mo376toPx0680j_4(expandedHeight);
        collapsedHeightPx.element = $this$TwoRowsTopAppBar_nS6u9G4_u24lambda_u2416.mo376toPx0680j_4(collapsedHeight);
        titleBottomPaddingPx.element = $this$TwoRowsTopAppBar_nS6u9G4_u24lambda_u2416.mo370roundToPx0680j_4(titleBottomPadding);
        Unit r7 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1641215730, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 896) != 256) goto L180;
        boolean r2 = true;
    L181:
        boolean invalid$iv = (r2 | $composer2.changed(collapsedHeightPx.element)) | $composer2.changed(expandedHeightPx.element);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L184;
    L187:
        value$iv = (Function0) new AppBarKt$TwoRowsTopAppBar$5$1(scrollBehavior, collapsedHeightPx, expandedHeightPx);
        $composer2.updateRememberedValue(value$iv);
    L188:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv, $composer2, 0);
        if (scrollBehavior == null) goto L193;
        TopAppBarState r3 = scrollBehavior.getState();
        if (r3 == null) goto L193;
        float colorTransitionFraction = r3.getCollapsedFraction();
    L194:
        long appBarContainerColor = colors.m2976containerColorvNxB06k$material3_release(colorTransitionFraction);
        Function2 actionsRow = ComposableLambdaKt.rememberComposableLambda(-89435287, true, new AppBarKt$TwoRowsTopAppBar$actionsRow$1(r50), $composer2, 54);
        float topTitleAlpha = TopTitleAlphaEasing.transform(colorTransitionFraction);
        float bottomTitleAlpha = 1.0f - colorTransitionFraction;
        if (colorTransitionFraction >= 0.5f) goto L197;
        boolean hideTopRowSemantics = true;
    L198:
        if (hideTopRowSemantics == true) goto L200;
        boolean hideBottomRowSemantics = true;
    L201:
        $composer2.startReplaceGroup(1641266888);
        ComposerKt.sourceInformation($composer2, "2028@92709L55,2028@92686L78,2029@92798L283");
        if (scrollBehavior != null) goto L204;
    L229:
        float topTitleAlpha2 = topTitleAlpha;
        Modifier.Companion appBarDragModifier = Modifier.Companion;
    L230:
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier2.then(appBarDragModifier), null, appBarContainerColor, 0, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets, collapsedHeight, colors, r47, smallTitleTextStyle, topTitleAlpha2, hideTopRowSemantics, r49, actionsRow, expandedHeight, scrollBehavior, r15, titleTextStyle, bottomTitleAlpha, titleBottomPaddingPx, hideBottomRowSemantics), $composer2, 54), $composer3, 12582912, 122);
        if (ComposerKt.isTraceInProgress() == false) goto L233;
        ComposerKt.traceEventEnd();
    L233:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L243;
        r4.updateScope(new AppBarKt$TwoRowsTopAppBar$7(modifier2, r44, titleTextStyle, titleBottomPadding, r47, smallTitleTextStyle, r49, r50, collapsedHeight, expandedHeight, windowInsets, colors, scrollBehavior, $changed, $changed1, r59));
        return;
    L243:
        return;
    L204:
        if (scrollBehavior.isPinned() == true) goto L229;
        Modifier.Companion r5 = Modifier.Companion;
        Orientation r31 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart($composer2, 1641272988, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 896) != 256) goto L208;
        boolean invalid$iv2 = true;
    L209:
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L215;
        topTitleAlpha2 = topTitleAlpha;
        if (value$iv2 != Composer.Companion.getEmpty()) goto L217;
    L216:
        value$iv2 = (Function1) new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1(scrollBehavior);
        $composer2.updateRememberedValue(value$iv2);
    L217:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DraggableState r30 = DraggableKt.rememberDraggableState((Function1) value$iv2, $composer2, 0);
        Modifier.Companion r29 = r5;
        ComposerKt.sourceInformationMarkerStart($composer2, 1641276064, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty3 & 896) != 256) goto L220;
        boolean invalid$iv3 = true;
    L221:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L224;
    L227:
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 value$iv3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(scrollBehavior, null);
        $composer2.updateRememberedValue(value$iv3);
    L228:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        appBarDragModifier = DraggableKt.draggable$default(r29, r30, r31, false, null, false, null, (Function3) value$iv3, false, 188, null);
        goto L230
    L224:
        if (it$iv == Composer.Companion.getEmpty()) goto L227;
        value$iv3 = it$iv;
        goto L228
    L220:
        invalid$iv3 = false;
        goto L221
    L215:
        topTitleAlpha2 = topTitleAlpha;
        goto L216
    L208:
        invalid$iv2 = false;
        goto L209
    L200:
        hideBottomRowSemantics = false;
        goto L201
    L197:
        hideTopRowSemantics = false;
    L193:
        colorTransitionFraction = 0.0f;
        goto L194
    L184:
        if (value$iv != Composer.Companion.getEmpty()) goto L188;
    L180:
        r2 = false;
        goto L181
    L238:
        throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
    L175:
        r19 = false;
        goto L176
    L240:
        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
    L165:
        if (expandedHeight != Float.POSITIVE_INFINITY) goto L167;
        boolean r110 = true;
    L168:
        if (r110 == true) goto L170;
        r18 = true;
        goto L171
    L167:
        r110 = false;
        goto L168
    L242:
        throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
    L155:
        if (collapsedHeight != Float.POSITIVE_INFINITY) goto L157;
        boolean r111 = true;
    L158:
        if (r111 == true) goto L160;
        r16 = true;
        goto L161
    L157:
        r111 = false;
        goto L158
    L148:
        modifier2 = r14;
        goto L150
    L141:
        if (($dirty3 & 147) != 146) goto L146;
        if ($composer2.getSkipping() == false) goto L146;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier2 = r14;
        goto L233
    L133:
        if (($changed1 & 384) != 0) goto L138;
        if ($composer2.changed(scrollBehavior) == false) goto L137;
        r20 = 256;
    L137:
        $dirty1 = $dirty1 | r20;
        goto L138
    L123:
        if (($changed1 & 48) != 0) goto L130;
        if ($composer2.changed(colors) == true) goto L128;
        r17 = 16;
    L128:
        $dirty1 = $dirty1 | r17;
        goto L130
    L112:
        if (($changed1 & 6) != 0) goto L120;
        if ($composer2.changed(windowInsets) == false) goto L116;
        int r112 = 4;
    L117:
        $dirty1 = $dirty1 | r112;
        goto L120
    L116:
        r112 = 2;
        goto L117
    L103:
        if (($changed & 805306368) != 0) goto L108;
        if ($composer2.changed(expandedHeight) == false) goto L107;
        r0 = 536870912;
        goto L101
    L107:
        r0 = 268435456;
        goto L101
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changed(collapsedHeight) == false) goto L96;
        int r6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r6;
        goto L99
    L96:
        r6 = 33554432;
        goto L97
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changedInstance(r50) == false) goto L86;
        int r8 = 8388608;
    L87:
        $dirty = $dirty | r8;
        goto L89
    L86:
        r8 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r49) == false) goto L75;
        int r22 = 1048576;
    L76:
        $dirty = $dirty | r22;
        goto L79
    L75:
        r22 = 524288;
        goto L76
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(smallTitleTextStyle) == false) goto L64;
        int r23 = 131072;
    L65:
        $dirty = $dirty | r23;
        goto L68
    L64:
        r23 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changedInstance(r47) == false) goto L53;
        int r24 = 16384;
    L54:
        $dirty = $dirty | r24;
        goto L57
    L53:
        r24 = 8192;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(titleBottomPadding) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
        goto L46
    L43:
        r9 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L36;
        if ($composer2.changed(titleTextStyle) == false) goto L32;
        int r25 = 256;
    L33:
        $dirty = $dirty | r25;
        goto L36
    L32:
        r25 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r15 = r44;
        if ($composer2.changedInstance(r15) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L23:
        r15 = r44;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = modifier;
        if ($composer2.changed(r14) == false) goto L10;
        int r114 = 4;
    L11:
        $dirty = $dirty | r114;
        goto L13
    L10:
        r114 = 2;
        goto L11
    L12:
        r14 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    private static final void m1902TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, long navigationIconContentColor, final long titleContentColor, final long actionIconContentColor, final Function2<? super Composer, ? super Integer, Unit> r67, final TextStyle titleTextStyle, final float titleAlpha, final Arrangement.Vertical titleVerticalArrangement, final Arrangement.Horizontal titleHorizontalArrangement, final int titleBottomPadding, final boolean hideTitleSemantics, final Function2<? super Composer, ? super Integer, Unit> r74, final Function2<? super Composer, ? super Integer, Unit> r75, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-742442296);
        ComposerKt.sourceInformation($composer2, "C(TopAppBarLayout)P(3,6,5:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,2,4)2163@98873L5882,2135@97725L7030:AppBar.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r10 = 4;
    L8:
        $dirty = $dirty | r10;
        goto L10
    L7:
        r10 = 2;
    L10:
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r11 = $composer2.changed(scrolledOffset);
    L15:
        if (r11 == false) goto L17;
        int r12 = 32;
    L18:
        $dirty = $dirty | r12;
        goto L20
    L17:
        r12 = 16;
        goto L18
    L14:
        r11 = $composer2.changedInstance(scrolledOffset);
    L20:
        if (($changed & 384) != 0) goto L26;
        long r13 = navigationIconContentColor;
        if ($composer2.changed(r13) == false) goto L24;
        int r17 = 256;
    L25:
        $dirty = $dirty | r17;
    L28:
        if (($changed & 3072) != 0) goto L34;
        int $dirty2 = $dirty;
        if ($composer2.changed(titleContentColor) == false) goto L32;
        int r19 = 2048;
    L33:
        int $dirty3 = $dirty2 | r19;
    L36:
        if (($changed & 24576) != 0) goto L44;
        if ($composer2.changed(actionIconContentColor) == false) goto L40;
        int r6 = 16384;
    L41:
        $dirty3 = $dirty3 | r6;
        goto L44
    L40:
        r6 = 8192;
    L44:
        if ((196608 & $changed) != 0) goto L52;
        if ($composer2.changedInstance(r67) == false) goto L48;
        int r20 = 131072;
    L49:
        $dirty3 = $dirty3 | r20;
        goto L52
    L48:
        r20 = 65536;
    L52:
        if (($changed & 1572864) != 0) goto L60;
        if ($composer2.changed(titleTextStyle) == false) goto L56;
        int r21 = 1048576;
    L57:
        $dirty3 = $dirty3 | r21;
        goto L60
    L56:
        r21 = 524288;
    L60:
        if (($changed & 12582912) != 0) goto L68;
        if ($composer2.changed(titleAlpha) == false) goto L64;
        int r22 = 8388608;
    L65:
        $dirty3 = $dirty3 | r22;
        goto L68
    L64:
        r22 = 4194304;
    L68:
        if (($changed & 100663296) != 0) goto L74;
        final Arrangement.Vertical r4 = titleVerticalArrangement;
        if ($composer2.changed(r4) == false) goto L72;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L73:
        $dirty3 = $dirty3 | r23;
    L76:
        if (($changed & 805306368) == 0) goto L78;
    L82:
        int $dirty4 = $dirty3;
        if (($changed1 & 6) != 0) goto L90;
        if ($composer2.changed(titleBottomPadding) == false) goto L87;
        int r18 = 4;
    L88:
        $dirty1 = $dirty1 | r18;
        goto L90
    L87:
        r18 = 2;
    L90:
        if (($changed1 & 48) != 0) goto L97;
        if ($composer2.changed(hideTitleSemantics) == false) goto L94;
        int r110 = 32;
    L95:
        $dirty1 = $dirty1 | r110;
        goto L97
    L94:
        r110 = 16;
    L97:
        if (($changed1 & 384) != 0) goto L104;
        if ($composer2.changedInstance(r74) == false) goto L101;
        int r8 = 256;
    L102:
        $dirty1 = $dirty1 | r8;
        goto L104
    L101:
        r8 = 128;
    L104:
        if (($changed1 & 3072) == 0) goto L106;
    L110:
        int $dirty5 = $dirty1;
        if ((306783379 & $dirty4) != 306783378) goto L119;
        if (($dirty5 & 1171) != 1170) goto L119;
        if ($composer2.getSkipping() == false) goto L119;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L216:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L220;
        final long r3 = r13;
        r0.updateScope(new AppBarKt$TopAppBarLayout$3(modifier, scrolledOffset, r3, titleContentColor, actionIconContentColor, r67, titleTextStyle, titleAlpha, titleVerticalArrangement, titleHorizontalArrangement, titleBottomPadding, hideTitleSemantics, r74, r75, $changed, $changed1));
        return;
    L220:
        return;
    L119:
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventStart(-742442296, $dirty4, $dirty5, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
    L121:
        ComposerKt.sourceInformationMarkerStart($composer2, 1539011656, "CC(remember):AppBar.kt#9igjgp");
        if (($dirty4 & 112) != 32) goto L124;
    L129:
        boolean r9 = true;
    L131:
        if ((1879048192 & $dirty4) != 536870912) goto L133;
        boolean r5 = true;
    L134:
        boolean r7 = r5 | r9;
        if ((234881024 & $dirty4) != 67108864) goto L137;
        boolean r14 = true;
    L138:
        boolean r15 = r7 | r14;
        if (($dirty5 & 14) != 4) goto L141;
        boolean r16 = true;
    L142:
        boolean invalid$iv = r15 | r16;
        MeasurePolicy value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L148;
        int $dirty6 = $dirty4;
        if (value$iv != Composer.Companion.getEmpty()) goto L150;
    L149:
        value$iv = new AppBarKt$TopAppBarLayout$2$1(scrolledOffset, titleHorizontalArrangement, r4, titleBottomPadding);
        $composer2.updateRememberedValue(value$iv);
    L150:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = ($dirty6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L153;
        ComposablesKt.invalidApplier();
    L153:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L156;
        Function0<ComposeUiNode> r1 = r111;
        $composer2.createNode(r1);
    L157:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L163;
        int $dirty7 = $dirty5;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L165;
    L164:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r24);
    L165:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 9049318, "C2137@97755L280,2143@98048L502,2155@98563L264:AppBar.kt#uh7d8r");
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "navigationIcon"), TopAppBarHorizontalPadding, 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
        Function0<ComposeUiNode> r25 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L168;
        ComposablesKt.invalidApplier();
    L168:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L171;
        Function0<ComposeUiNode> r26 = r25;
        $composer3.createNode(r26);
    L172:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r112 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L179;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L179;
    L180:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r27 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r30 = BoxScopeInstance.INSTANCE;
        int r31 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 249765716, "C2138@97858L163:AppBar.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(r13)), r74, $composer3, ProvidedValue.$stable | (($dirty7 >> 3) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r28 = PaddingKt.m727paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "title"), TopAppBarHorizontalPadding, 0.0f, 2, null);
        Modifier.Companion r29 = Modifier.Companion;
        if (hideTitleSemantics == false) goto L183;
        r29 = SemanticsModifierKt.clearAndSetSemantics(r29, AppBarKt$TopAppBarLayout$1$2.INSTANCE);
    L183:
        Modifier modifier$iv2 = GraphicsLayerModifierKt.m4526graphicsLayerAp8cVGQ$default(r28.then(r29), 0.0f, 0.0f, titleAlpha, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, false, null, 0, 0, 0, 131067, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r113 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L186;
        ComposablesKt.invalidApplier();
    L186:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L189;
        Function0<ComposeUiNode> r32 = r113;
        $composer3.createNode(r32);
    L190:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r114 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L197;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L197;
    L198:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r33 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r115 = BoxScopeInstance.INSTANCE;
        int r36 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 250255454, "C2149@98351L185:AppBar.kt#uh7d8r");
        ProvideContentColorTextStyleKt.m3029ProvideContentColorTextStyle3JVO9M(titleContentColor, titleTextStyle, r67, $composer3, ((($dirty6 >> 9) & 14) | (($dirty6 >> 15) & 112)) | (($dirty6 >> 9) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv3 = PaddingKt.m729paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "actionIcons"), 0.0f, 0.0f, TopAppBarHorizontalPadding, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv4 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L201;
        ComposablesKt.invalidApplier();
    L201:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L204;
        Function0<ComposeUiNode> r34 = r210;
        $composer3.createNode(r34);
    L205:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r35 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L211;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L213;
    L212:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r35);
    L213:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r37 = ($changed$iv$iv$iv3 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r38 = BoxScopeInstance.INSTANCE;
        int r39 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 250561951, "C2156@98661L152:AppBar.kt#uh7d8r");
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(actionIconContentColor)), r75, $composer$iv, ProvidedValue.$stable | (($dirty7 >> 6) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L216;
        ComposerKt.traceEventEnd();
        goto L216
    L211:
        $composer4 = $composer3;
        goto L212
    L204:
        r34 = r210;
        $composer3.useNode();
    L197:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r114);
        goto L198
    L189:
        r32 = r113;
        $composer3.useNode();
    L179:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r112);
        goto L180
    L171:
        r26 = r25;
        $composer3.useNode();
        goto L172
    L163:
        $dirty7 = $dirty5;
        goto L164
    L156:
        r1 = r111;
        $composer2.useNode();
        goto L157
    L148:
        $dirty6 = $dirty4;
        goto L149
    L141:
        r16 = false;
        goto L142
    L137:
        r14 = false;
        goto L138
    L133:
        r5 = false;
        goto L134
    L124:
        if (($dirty4 & 64) != 0) goto L126;
    L128:
        r9 = false;
        goto L131
    L126:
        if ($composer2.changedInstance(scrolledOffset) == false) goto L128;
    L106:
        if ($composer2.changedInstance(r75) == false) goto L108;
        int r40 = 2048;
    L109:
        $dirty1 = $dirty1 | r40;
        goto L110
    L108:
        r40 = 1024;
        goto L109
    L78:
        if ($composer2.changed(titleHorizontalArrangement) == false) goto L80;
        int r211 = 536870912;
    L81:
        $dirty3 = $dirty3 | r211;
        goto L82
    L80:
        r211 = 268435456;
        goto L81
    L72:
        r23 = 33554432;
        goto L73
    L74:
        r4 = titleVerticalArrangement;
        goto L76
    L32:
        r19 = 1024;
        goto L33
    L34:
        $dirty3 = $dirty;
        goto L36
    L24:
        r17 = 128;
        goto L25
    L26:
        r13 = navigationIconContentColor;
        goto L28
    }

    private static final Object settleAppBar(final TopAppBarState state, float velocity, DecayAnimationSpec<Float> r25, AnimationSpec<Float> r26, Continuation<? super Velocity> r27) {
        if ((r27 instanceof C04741) == false) goto L7;
        C04741 r1 = (C04741) r27;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        C04741 r6 = r1;
        Object $result = r6.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Ref.FloatRef remainingVelocity = (Ref.FloatRef) r6.L$0;
        ResultKt.throwOnFailure($result);
    L45:
        Ref.FloatRef remainingVelocity2 = remainingVelocity;
    L47:
        return Velocity.m7202boximpl(VelocityKt.Velocity(0.0f, remainingVelocity2.element));
    L13:
        Ref.FloatRef remainingVelocity3 = (Ref.FloatRef) r6.L$2;
        AnimationSpec<Float> r3 = (AnimationSpec) r6.L$1;
        TopAppBarState state2 = (TopAppBarState) r6.L$0;
        ResultKt.throwOnFailure($result);
    L30:
        remainingVelocity2 = remainingVelocity3;
        final TopAppBarState state3 = state2;
        AnimationSpec<Float> r4 = r3;
    L32:
        if (r4 == null) goto L47;
        if (state3.getHeightOffset() >= 0.0f) goto L47;
        if (state3.getHeightOffset() <= state3.getHeightOffsetLimit()) goto L47;
        AnimationState r5 = AnimationStateKt.AnimationState$default(state3.getHeightOffset(), 0.0f, 0, 0, false, 30, null);
        if (state3.getCollapsedFraction() >= 0.5f) goto L40;
        float r7 = 0.0f;
    L41:
        Float r8 = Boxing.boxFloat(r7);
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r9 = new AnonymousClass3(state3);
        r6.L$0 = remainingVelocity2;
        r6.L$1 = null;
        r6.L$2 = null;
        r6.label = 2;
        if (SuspendAnimationKt.animateTo$default(r5, r8, r4, false, r9, r6, 4, null) != r2) goto L44;
        return r2;
    L44:
        remainingVelocity = remainingVelocity2;
        goto L45
    L40:
        r7 = state3.getHeightOffsetLimit();
        goto L41
    L14:
        ResultKt.throwOnFailure($result);
        if (state.getCollapsedFraction() < 0.01f) goto L50;
        if (state.getCollapsedFraction() != 1.0f) goto L19;
        boolean r10 = true;
    L20:
        if (r10 == true) goto L50;
        final Ref.FloatRef remainingVelocity4 = new Ref.FloatRef();
        remainingVelocity4.element = velocity;
        if (r25 != null) goto L25;
    L31:
        remainingVelocity2 = remainingVelocity4;
        state3 = state;
        r4 = r26;
        goto L32
    L25:
        if (Math.abs(velocity) <= 1.0f) goto L31;
        final Ref.FloatRef lastValue = new Ref.FloatRef();
        AnimationState r11 = AnimationStateKt.AnimationState$default(0.0f, velocity, 0, 0, false, 28, null);
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r12 = new C04752(lastValue, state, remainingVelocity4);
        r6.L$0 = state;
        r6.L$1 = r26;
        r6.L$2 = remainingVelocity4;
        r6.label = 1;
        if (SuspendAnimationKt.animateDecay$default(r11, r25, false, r12, r6, 2, null) != r2) goto L29;
        return r2;
    L29:
        state2 = state;
        remainingVelocity3 = remainingVelocity4;
        r3 = r26;
        goto L30
    L19:
        r10 = false;
    L50:
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C04741(r27);
        goto L8
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }
}
