package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0099\u0001\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\b\u0010R\u001a\u00020\u000eH\u0016J\b\u0010S\u001a\u00020\u000eH\u0016J\u0010\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020/H\u0016J\b\u0010V\u001a\u00020\u000eH\u0016J\b\u0010W\u001a\u00020\u000eH\u0002J\u0092\u0001\u0010X\u001a\u00020\u000e2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00122\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\b\u0010[\u001a\u00020\u000eH\u0002J\b\u0010\\\u001a\u00020\u000eH\u0002J\f\u0010]\u001a\u00020\u000e*\u00020^H\u0016J\f\u0010_\u001a\u00020\u000e*\u00020`H\u0016R\u001a\u0010\u001b\u001a\u00020\t8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0014\u001a\u00020\u0015X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010)\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u00020\u0015X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R/\u00100\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010/8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u00020\rX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010GR+\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010:\"\u0004\bJ\u0010<R\u0016\u0010K\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010HR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "", "useTextDefault", "", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorPositionInRoot", "getAnchorPositionInRoot-F1C5BW0", "()J", "anchorPositionInRootState", "Landroidx/compose/runtime/State;", "getClippingEnabled", "()Z", "setClippingEnabled", "(Z)V", "getCornerRadius-D9Ej5fM", "()F", "setCornerRadius-0680j_4", "(F)V", "F", "density", "drawSignalChannel", "Lkotlinx/coroutines/channels/Channel;", "getElevation-D9Ej5fM", "setElevation-0680j_4", "<set-?>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "magnifier", "Landroidx/compose/foundation/PlatformMagnifier;", "getMagnifierCenter", "()Lkotlin/jvm/functions/Function1;", "setMagnifierCenter", "(Lkotlin/jvm/functions/Function1;)V", "getOnSizeChanged", "setOnSizeChanged", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "previousSize", "Landroidx/compose/ui/unit/IntSize;", "getSize-MYxV2XQ", "setSize-EaSLcWc", "(J)V", "J", "getSourceCenter", "setSourceCenter", "sourceCenterInRoot", "getUseTextDefault", "setUseTextDefault", "view", "Landroid/view/View;", "getZoom", "setZoom", "onAttach", "onDetach", "onGloballyPositioned", "coordinates", "onObservedReadsChanged", "recreateMagnifier", "update", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "updateMagnifier", "updateSizeIfNecessary", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 0;
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private Channel<Unit> drawSignalChannel;
    private float elevation;
    private final MutableState layoutCoordinates$delegate;
    private PlatformMagnifier magnifier;
    private Function1<? super Density, Offset> magnifierCenter;
    private Function1<? super DpSize, Unit> onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private Function1<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {382, 386}, m = "invokeSuspend", n = {}, s = {})
    static final class C02181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MagnifierNode this$0;

        C02181(MagnifierNode r2, Continuation<? super C02181> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C02181(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02181) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003c -> B:9:0x001f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:19:0x004f). Please report as a decompilation issue!!! */
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
            C02181 r1 = this;
        L19:
            PlatformMagnifier r2 = MagnifierNode.access$getMagnifier$p(r1.this$0);
            if (r2 != null) goto L21;
        L9:
            Channel r3 = MagnifierNode.access$getDrawSignalChannel$p(r1.this$0);
            if (r3 == null) goto L15;
            r1.label = 1;
            if (r3.receive(r1) != r0) goto L15;
            return r0;
        L15:
            if (MagnifierNode.access$getMagnifier$p(r1.this$0) == null) goto L9;
            r1.label = 2;
            if (MonotonicFrameClockKt.withFrameMillis(C00111.INSTANCE, r1) != r0) goto L19;
            return r0;
        L21:
            r2.updateContent();
            goto L9
        L7:
            ResultKt.throwOnFailure($result);
            r1 = this;
            goto L15
        L8:
            ResultKt.throwOnFailure($result);
            r1 = this;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ MagnifierNode(Function1 r1, Function1 r2, Function1 r3, float r4, boolean r5, long r6, float r8, float r9, boolean r10, PlatformMagnifierFactory r11, DefaultConstructorMarker r12) {
        this(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11);
    }

    public /* synthetic */ MagnifierNode(Function1 r17, Function1 r18, Function1 r19, float r20, boolean r21, long r22, float r24, float r25, boolean r26, PlatformMagnifierFactory r27, int r28, DefaultConstructorMarker r29) {
        if ((r28 & 2) == 0) goto L5;
        Function1 r5 = null;
    L7:
        if ((r28 & 4) == 0) goto L9;
        Function1 r6 = null;
    L11:
        if ((r28 & 8) == 0) goto L13;
        float r7 = Float.NaN;
    L15:
        if ((r28 & 16) == 0) goto L17;
        boolean r8 = false;
    L19:
        if ((r28 & 32) == 0) goto L21;
        long r9 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
    L23:
        if ((r28 & 64) == 0) goto L25;
        float r11 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L27:
        if ((r28 & 128) == 0) goto L29;
        float r12 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L31:
        if ((r28 & 256) == 0) goto L33;
        boolean r13 = true;
    L35:
        if ((r28 & 512) == 0) goto L37;
        PlatformMagnifierFactory r14 = PlatformMagnifierFactory.Companion.getForCurrentPlatform();
    L38:
        this(r17, r5, r6, r7, r8, r9, r11, r12, r13, r14, null);
        return;
    L37:
        r14 = r27;
        goto L38
    L33:
        r13 = r26;
        goto L35
    L29:
        r12 = r25;
        goto L31
    L25:
        r11 = r24;
        goto L27
    L21:
        r9 = r22;
        goto L23
    L17:
        r8 = r21;
        goto L19
    L13:
        r7 = r20;
        goto L15
    L9:
        r6 = r19;
        goto L11
    L5:
        r5 = r18;
        goto L7
    }

    public static final /* synthetic */ Channel access$getDrawSignalChannel$p(MagnifierNode $this) {
        return $this.drawSignalChannel;
    }

    public static final /* synthetic */ LayoutCoordinates access$getLayoutCoordinates(MagnifierNode $this) {
        return $this.getLayoutCoordinates();
    }

    public static final /* synthetic */ PlatformMagnifier access$getMagnifier$p(MagnifierNode $this) {
        return $this.magnifier;
    }

    public static final /* synthetic */ long access$getSourceCenterInRoot$p(MagnifierNode $this) {
        return $this.sourceCenterInRoot;
    }

    public static final /* synthetic */ void access$updateMagnifier(MagnifierNode $this) {
        $this.updateMagnifier();
    }

    public final Function1<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final void setSourceCenter(Function1<? super Density, Offset> r1) {
        this.sourceCenter = r1;
    }

    public final Function1<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final void setMagnifierCenter(Function1<? super Density, Offset> r1) {
        this.magnifierCenter = r1;
    }

    public final Function1<DpSize, Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final void setOnSizeChanged(Function1<? super DpSize, Unit> r1) {
        this.onSizeChanged = r1;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float r1) {
        this.zoom = r1;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final void setUseTextDefault(boolean r1) {
        this.useTextDefault = r1;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m295getSizeMYxV2XQ() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m298setSizeEaSLcWc(long r1) {
        this.size = r1;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m293getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m296setCornerRadius0680j_4(float r1) {
        this.cornerRadius = r1;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m294getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m297setElevation0680j_4(float r1) {
        this.elevation = r1;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final void setClippingEnabled(boolean r1) {
        this.clippingEnabled = r1;
    }

    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    public final void setPlatformMagnifierFactory(PlatformMagnifierFactory r1) {
        this.platformMagnifierFactory = r1;
    }

    private MagnifierNode(Function1<? super Density, Offset> r3, Function1<? super Density, Offset> r4, Function1<? super DpSize, Unit> r5, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = r3;
        this.magnifierCenter = r4;
        this.onSizeChanged = r5;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    private final LayoutCoordinates getLayoutCoordinates() {
        State $this$getValue$iv = this.layoutCoordinates$delegate;
        return (LayoutCoordinates) $this$getValue$iv.getValue();
    }

    private final void setLayoutCoordinates(LayoutCoordinates r4) {
        MutableState $this$setValue$iv = this.layoutCoordinates$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m292getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState != null) goto L5;
        this.anchorPositionInRootState = SnapshotStateKt.derivedStateOf(new MagnifierNode$anchorPositionInRoot$1(this));
    L5:
        State<Offset> r0 = this.anchorPositionInRootState;
        if (r0 == null) goto L9;
        return r0.getValue().m4135unboximpl();
    L9:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m299update5F03MCQ(Function1<? super Density, Offset> r23, Function1<? super Density, Offset> r24, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Function1<? super DpSize, Unit> r32, PlatformMagnifierFactory platformMagnifierFactory) {
        float previousZoom = this.zoom;
        long previousSize = this.size;
        float previousCornerRadius = this.cornerRadius;
        boolean previousUseTextDefault = this.useTextDefault;
        float previousElevation = this.elevation;
        boolean previousClippingEnabled = this.clippingEnabled;
        PlatformMagnifierFactory previousPlatformMagnifierFactory = this.platformMagnifierFactory;
        View previousView = this.view;
        Density previousDensity = this.density;
        this.sourceCenter = r23;
        this.magnifierCenter = r24;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = r32;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View view = DelegatableNode_androidKt.requireView(this);
        Density density = DelegatableNodeKt.requireDensity(this);
        if (this.magnifier == null) goto L35;
        if (Magnifier_androidKt.equalsIncludingNaN(zoom, previousZoom) == true) goto L11;
        if (platformMagnifierFactory.getCanUpdateZoom() == true) goto L11;
    L33:
        boolean previousClippingEnabled2 = true;
    L37:
        if (previousClippingEnabled2 == false) goto L39;
        recreateMagnifier();
    L39:
        updateMagnifier();
        return;
    L11:
        if (DpSize.m7068equalsimpl0(size, previousSize) == false) goto L33;
        if (Dp.m6978equalsimpl0(cornerRadius, previousCornerRadius) == false) goto L33;
        if (Dp.m6978equalsimpl0(elevation, previousElevation) == false) goto L33;
        if (useTextDefault != previousUseTextDefault) goto L33;
        if (clippingEnabled != previousClippingEnabled) goto L33;
        if (Intrinsics.areEqual(platformMagnifierFactory, previousPlatformMagnifierFactory) == false) goto L33;
        if (Intrinsics.areEqual(view, previousView) == false) goto L33;
        if (Intrinsics.areEqual(density, previousDensity) == false) goto L33;
    L35:
        previousClippingEnabled2 = false;
        goto L37
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new C02181(this, null), 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier r0 = this.magnifier;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new C02191(this));
    }

    private final void recreateMagnifier() {
        PlatformMagnifier r0 = this.magnifier;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        View r1 = this.view;
        if (r1 != null) goto L8;
        r1 = DelegatableNode_androidKt.requireView(this);
    L8:
        View it = r1;
        this.view = it;
        View view = r1;
        Density r2 = this.density;
        if (r2 != null) goto L11;
        r2 = DelegatableNodeKt.requireDensity(this);
    L11:
        Density density = r2;
        this.density = density;
        this.magnifier = this.platformMagnifierFactory.mo326createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    private final void updateMagnifier() {
        Density it = this.density;
        if (it != null) goto L5;
        it = DelegatableNodeKt.requireDensity(this);
        this.density = it;
    L5:
        long sourceCenterOffset = this.sourceCenter.invoke(it).m4135unboximpl();
        boolean r10 = true;
        if ((sourceCenterOffset & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L8;
        boolean r4 = true;
    L9:
        if (r4 == false) goto L36;
        long $this$isSpecified$iv = m292getAnchorPositionInRootF1C5BW0();
        if (($this$isSpecified$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L13;
        boolean r5 = true;
    L14:
        if (r5 == false) goto L36;
        this.sourceCenterInRoot = Offset.m4130plusMKHz9U(m292getAnchorPositionInRootF1C5BW0(), sourceCenterOffset);
        Function1<? super Density, Offset> r6 = this.magnifierCenter;
        if (r6 == null) goto L27;
        Offset r7 = Offset.m4114boximpl(r6.invoke(it).m4135unboximpl());
        if ((9223372034707292159L & r7.m4135unboximpl()) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L22;
        r10 = false;
    L22:
        if (r10 == true) goto L25;
        r7 = null;
    L25:
        if (r7 == null) goto L27;
        long it2 = Offset.m4130plusMKHz9U(m292getAnchorPositionInRootF1C5BW0(), r7.m4135unboximpl());
    L28:
        long magnifierCenter = it2;
        if (this.magnifier != null) goto L31;
        recreateMagnifier();
    L31:
        PlatformMagnifier r8 = this.magnifier;
        if (r8 == null) goto L34;
        r8.mo325updateWko1d7g(this.sourceCenterInRoot, magnifierCenter, this.zoom);
    L34:
        updateSizeIfNecessary();
        return;
    L27:
        it2 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        goto L28
    L13:
        r5 = false;
    L36:
        this.sourceCenterInRoot = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        PlatformMagnifier r9 = this.magnifier;
        if (r9 == null) goto L40;
        r9.dismiss();
        return;
    L40:
        return;
    L8:
        r4 = false;
        goto L9
    }

    private final void updateSizeIfNecessary() {
        PlatformMagnifier magnifier = this.magnifier;
        if (magnifier != null) goto L5;
        return;
    L5:
        Density density = this.density;
        if (density != null) goto L9;
        return;
    L9:
        if (IntSize.m7141equalsimpl(magnifier.mo324getSizeYbymL2g(), this.previousSize) == true) goto L15;
        Function1<? super DpSize, Unit> r2 = this.onSizeChanged;
        if (r2 == null) goto L13;
        r2.invoke(DpSize.m7059boximpl(density.mo374toDpSizekrfVVM(IntSizeKt.m7156toSizeozmzZPI(magnifier.mo324getSizeYbymL2g()))));
    L13:
        this.previousSize = IntSize.m7136boximpl(magnifier.mo324getSizeYbymL2g());
        return;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        $this$draw.drawContent();
        Channel<Unit> r0 = this.drawSignalChannel;
        if (r0 == null) goto L6;
        ChannelResult.m8926boximpl(r0.mo8915trySendJP2dKIU(Unit.INSTANCE));
        return;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        setLayoutCoordinates(coordinates);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        $this$applySemantics.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new AnonymousClass1(this));
    }
}
