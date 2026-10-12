package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020\u001eH\u0002J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020<H\u0016J\b\u0010C\u001a\u00020<H\u0016J\b\u0010D\u001a\u00020<H\u0016J\b\u0010E\u001a\u00020<H\u0016J\r\u0010F\u001a\u00020<H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\"H\u0016J\b\u0010M\u001a\u00020<H\u0016J\u0010\u0010N\u001a\u00020<2\u0006\u0010L\u001a\u00020\"H\u0016J*\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u001a\u0010X\u001a\u00020<2\u0006\u00103\u001a\u00020UH\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\b\u0010[\u001a\u00020\u001eH\u0016J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020<H\u0002J\b\u0010_\u001a\u00020<H\u0002J\u0006\u0010`\u001a\u00020<J\u0014\u0010a\u001a\u00020<2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030bH\u0002J\f\u0010c\u001a\u00020<*\u00020dH\u0016J\f\u0010e\u001a\u00020<*\u00020fH\u0016J\u001c\u0010g\u001a\u00020h*\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020hH\u0016J\u001c\u0010m\u001a\u00020h*\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010n\u001a\u00020hH\u0016J&\u0010o\u001a\u00020p*\u00020q2\u0006\u0010j\u001a\u00020r2\u0006\u0010s\u001a\u00020tH\u0016ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\u001c\u0010w\u001a\u00020h*\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020hH\u0016J\u001c\u0010x\u001a\u00020h*\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010n\u001a\u00020hH\u0016J\u0018\u0010y\u001a\u0004\u0018\u00010z*\u00020\u00162\b\u0010{\u001a\u0004\u0018\u00010zH\u0016R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0012R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R2\u0010+\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0,j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-`.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u0002048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u0002H8\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H80-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "element", "Landroidx/compose/ui/Modifier$Element;", "(Landroidx/compose/ui/Modifier$Element;)V", "_providedValues", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "value", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "invalidateCache", "", "isValidOwnerScope", "()Z", "lastOnPlacedCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "readValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "current", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "initializeModifier", "duringAttach", "interceptOutOfBoundsChildEvents", "onAttach", "onCancelPointerInput", "onDensityChange", "onDetach", "onDrawCacheReadsChanged", "onDrawCacheReadsChanged$ui_release", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", "coordinates", "onMeasureResultChanged", "onPlaced", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onRemeasured", "onRemeasured-ozmzZPI", "(J)V", "sharePointerInputWithSiblings", "toString", "", "unInitializeModifier", "updateDrawCache", "updateModifierLocalConsumer", "updateModifierLocalProvider", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "modifyParentData", "", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public static final int $stable = 0;
    private BackwardsCompatLocalMap _providedValues;
    private Modifier.Element element;
    private boolean invalidateCache;
    private LayoutCoordinates lastOnPlacedCoordinates;
    private HashSet<ModifierLocal<?>> readValues;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ LayoutCoordinates access$getLastOnPlacedCoordinates$p(BackwardsCompatNode $this) {
        return $this.lastOnPlacedCoordinates;
    }

    public BackwardsCompatNode(Modifier.Element element) {
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new HashSet();
    }

    public final Modifier.Element getElement() {
        return this.element;
    }

    public final void setElement(Modifier.Element value) {
        if (isAttached() == false) goto L5;
        unInitializeModifier();
    L5:
        this.element = value;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(value));
        if (isAttached() == false) goto L9;
        initializeModifier(false);
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    private final void unInitializeModifier() {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
    L5:
        Modifier.Element element = this.element;
        BackwardsCompatNode this_$iv = this;
        boolean r5 = true;
        if ((this_$iv.getKindSet$ui_release() & NodeKind.m5976constructorimpl(32)) == 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L11;
    L16:
        BackwardsCompatNode this_$iv2 = this;
        if ((this_$iv2.getKindSet$ui_release() & NodeKind.m5976constructorimpl(8)) != 0) goto L20;
        r5 = false;
    L20:
        if (r5 == false) goto L23;
        DelegatableNodeKt.requireOwner(this).onSemanticsChange();
    L23:
        if ((element instanceof FocusRequesterModifier) == false) goto L26;
        ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        return;
    L26:
        return;
    L11:
        if ((element instanceof ModifierLocalProvider) == false) goto L14;
        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element).getKey());
    L14:
        if ((element instanceof ModifierLocalConsumer) == false) goto L16;
        ((ModifierLocalConsumer) element).onModifierLocalsUpdated(BackwardsCompatNodeKt.access$getDetachedModifierLocalReadScope$p());
        goto L16
    L8:
        r1 = false;
        goto L9
    }

    private final void initializeModifier(boolean duringAttach) {
        boolean value$iv = isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
    L5:
        Modifier.Element element = this.element;
        BackwardsCompatNode this_$iv = this;
        boolean r5 = false;
        if ((this_$iv.getKindSet$ui_release() & NodeKind.m5976constructorimpl(32)) == 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L11;
    L16:
        BackwardsCompatNode this_$iv2 = this;
        if ((this_$iv2.getKindSet$ui_release() & NodeKind.m5976constructorimpl(4)) == 0) goto L19;
        boolean r2 = true;
    L20:
        if (r2 == true) goto L22;
    L26:
        BackwardsCompatNode this_$iv3 = this;
        if ((this_$iv3.getKindSet$ui_release() & NodeKind.m5976constructorimpl(2)) == 0) goto L29;
        boolean r3 = true;
    L30:
        if (r3 == false) goto L36;
        boolean isChainUpdate = BackwardsCompatNodeKt.access$isChainUpdate(this);
        if (isChainUpdate == false) goto L34;
        NodeCoordinator coordinator = getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator);
        LayoutModifierNodeCoordinator r4 = (LayoutModifierNodeCoordinator) coordinator;
        ((LayoutModifierNodeCoordinator) coordinator).setLayoutModifierNode$ui_release(this);
        coordinator.onLayoutModifierNodeChanged();
    L34:
        if (duringAttach == true) goto L36;
        LayoutModifierNodeKt.invalidateLayer(this);
        DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
    L36:
        boolean isChainUpdate2 = element instanceof RemeasurementModifier;
        if (isChainUpdate2 == false) goto L39;
        ((RemeasurementModifier) element).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
    L39:
        BackwardsCompatNode this_$iv4 = this;
        if ((this_$iv4.getKindSet$ui_release() & NodeKind.m5976constructorimpl(128)) == 0) goto L42;
        boolean r6 = true;
    L43:
        if (r6 == true) goto L45;
    L54:
        BackwardsCompatNode this_$iv5 = this;
        if ((this_$iv5.getKindSet$ui_release() & NodeKind.m5976constructorimpl(256)) == 0) goto L57;
        boolean r7 = true;
    L58:
        if (r7 == true) goto L60;
    L64:
        boolean isChainUpdate3 = element instanceof FocusRequesterModifier;
        if (isChainUpdate3 == false) goto L67;
        ((FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
    L67:
        BackwardsCompatNode this_$iv6 = this;
        if ((this_$iv6.getKindSet$ui_release() & NodeKind.m5976constructorimpl(16)) == 0) goto L70;
        boolean r8 = true;
    L71:
        if (r8 == true) goto L73;
    L75:
        BackwardsCompatNode this_$iv7 = this;
        if ((this_$iv7.getKindSet$ui_release() & NodeKind.m5976constructorimpl(8)) == 0) goto L78;
        r5 = true;
    L78:
        if (r5 == false) goto L81;
        DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        return;
    L81:
        return;
    L73:
        if ((element instanceof PointerInputModifier) == false) goto L75;
        ((PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
        goto L75
    L70:
        r8 = false;
        goto L71
    L60:
        if ((element instanceof OnGloballyPositionedModifier) == false) goto L64;
        boolean isChainUpdate4 = BackwardsCompatNodeKt.access$isChainUpdate(this);
        if (isChainUpdate4 == false) goto L64;
        DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
        goto L64
    L57:
        r7 = false;
        goto L58
    L45:
        if ((element instanceof OnRemeasuredModifier) == false) goto L49;
        boolean isChainUpdate5 = BackwardsCompatNodeKt.access$isChainUpdate(this);
        if (isChainUpdate5 == false) goto L49;
        DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
    L49:
        boolean isChainUpdate6 = element instanceof OnPlacedModifier;
        if (isChainUpdate6 == false) goto L54;
        this.lastOnPlacedCoordinates = null;
        boolean isChainUpdate7 = BackwardsCompatNodeKt.access$isChainUpdate(this);
        if (isChainUpdate7 == false) goto L54;
        DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new AnonymousClass3(this));
        goto L54
    L42:
        r6 = false;
        goto L43
    L29:
        r3 = false;
        goto L30
    L22:
        if ((element instanceof DrawCacheModifier) == false) goto L24;
        this.invalidateCache = true;
    L24:
        if (duringAttach == true) goto L26;
        LayoutModifierNodeKt.invalidateLayer(this);
        goto L26
    L19:
        r2 = false;
        goto L20
    L11:
        if ((element instanceof ModifierLocalConsumer) == false) goto L14;
        sideEffect(new AnonymousClass2(this));
    L14:
        if ((element instanceof ModifierLocalProvider) == false) goto L16;
        updateModifierLocalProvider((ModifierLocalProvider) element);
        goto L16
    L8:
        r1 = false;
        goto L9
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo3984getSizeNHjbRc() {
        return IntSizeKt.m7156toSizeozmzZPI(DelegatableNodeKt.m5836requireCoordinator64DMado(this, NodeKind.m5976constructorimpl(128)).mo5722getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final void updateDrawCache() {
        final Modifier.Element element = this.element;
        if ((element instanceof DrawCacheModifier) == false) goto L5;
        DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getOnDrawCacheReadsChanged$p(), new AnonymousClass1(element, this));
    L5:
        this.invalidateCache = false;
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    public final void setReadValues(HashSet<ModifierLocal<?>> r1) {
        this.readValues = r1;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap r0 = this._providedValues;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v8 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public <T> T getCurrent(ModifierLocal<T> r31) {
        ModifierLocal<T> r1 = r31;
        this.readValues.add(r1);
        BackwardsCompatNode r2 = this;
        int r3 = NodeKind.m5976constructorimpl(32);
        if (r2.getNode().isAttached() == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node r9 = r2.getNode().getParent$ui_release();
        LayoutNode r10 = DelegatableNodeKt.requireLayoutNode(r2);
    L6:
        if (r10 == null) goto L71;
        if ((r10.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r3) == 0) goto L62;
    L9:
        if (r9 == null) goto L61;
        if ((r9.getKindSet$ui_release() & r3) == 0) goto L60;
        ?? r16 = 0;
        Modifier.Node r0 = r9;
    L13:
        if (r0 == null) goto L60;
        r2 = r2;
        if ((r0 instanceof ModifierLocalModifierNode) == true) goto L16;
        ModifierLocal<T> r20 = r1;
        int r4 = 1;
        if ((r0.getKindSet$ui_release() & r3) == 0) goto L24;
        boolean r5 = true;
    L25:
        if (r5 == false) goto L57;
        if ((r0 instanceof DelegatingNode) == false) goto L57;
        int r6 = 0;
        Modifier.Node r21 = ((DelegatingNode) r0).getDelegate$ui_release();
        r16 = r16;
    L29:
        if (r21 == null) goto L53;
        Modifier.Node r22 = r21;
        if ((r22.getKindSet$ui_release() & r3) == 0) goto L33;
        int r24 = r4;
    L34:
        if (r24 == 0) goto L52;
        r6 = r6 + 1;
        if (r6 != r4) goto L38;
        r0 = r22;
        goto L52
    L38:
        if (r16 != 0) goto L40;
        ?? r7 = new MutableVector(new Modifier.Node[16], 0);
    L41:
        Object r8 = r0;
        if (r8 == null) goto L46;
        if (r7 == 0) goto L45;
        r7.add(r8);
    L45:
        Modifier.Node r17 = null;
    L47:
        if (r7 == 0) goto L50;
        r7.add(r22);
    L50:
        Modifier.Node r11 = r17;
        r16 = r7;
        r0 = r11;
        r6 = r6;
        goto L52
    L46:
        r17 = r0;
        goto L47
    L40:
        r7 = r16;
    L52:
        r21 = r21.getChild$ui_release();
        r4 = 1;
        r16 = r16;
        goto L29
    L33:
        r24 = 0;
        goto L34
    L53:
        Modifier.Node r27 = r0;
        if (r6 != 1) goto L57;
        r1 = r20;
        r0 = r27;
    L57:
        r0 = DelegatableNodeKt.access$pop(r16);
        r1 = r20;
        goto L13
    L24:
        r5 = false;
        goto L25
    L16:
        ModifierLocalModifierNode r12 = (ModifierLocalModifierNode) r0;
        if (r12.getProvidedValues().contains$ui_release(r1) == true) goto L19;
        r20 = r1;
        goto L57
    L19:
        return (T) r12.getProvidedValues().get$ui_release(r1);
    L60:
        r9 = r9.getParent$ui_release();
        r2 = r2;
        r1 = r1;
        goto L9
    L61:
        ModifierLocal<T> r23 = r1;
        BackwardsCompatNode r18 = r2;
    L63:
        r10 = r10.getParent$ui_release();
        if (r10 == null) goto L68;
        NodeChain r13 = r10.getNodes$ui_release();
        if (r13 == null) goto L68;
        Modifier.Node r14 = r13.getTail$ui_release();
    L69:
        r9 = r14;
        r2 = r18;
        r1 = r23;
    L68:
        r14 = null;
        goto L69
    L62:
        r23 = r1;
        r18 = r2;
        goto L63
    L71:
        return r1.getDefaultFactory$ui_release().invoke();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached() == false) goto L6;
        this.readValues.clear();
        DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getUpdateModifierLocalConsumer$p(), new C06391(this));
        return;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> r5) {
        BackwardsCompatLocalMap providedValues = this._providedValues;
        if (providedValues != null) goto L5;
    L7:
        this._providedValues = new BackwardsCompatLocalMap(r5);
        boolean isChainUpdate = BackwardsCompatNodeKt.access$isChainUpdate(this);
        if (isChainUpdate == false) goto L12;
        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, r5.getKey());
        return;
    L12:
        return;
    L5:
        if (providedValues.contains$ui_release(r5.getKey()) == false) goto L7;
        providedValues.setElement(r5);
        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, r5.getKey());
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        LayoutModifier $this$measure_3p2s80s_u24lambda_u243 = (LayoutModifier) r0;
        return $this$measure_3p2s80s_u24lambda_u243.mo645measure3p2s80s($this$measure_u2d3p2s80s, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        LayoutModifier $this$minIntrinsicWidth_u24lambda_u244 = (LayoutModifier) r0;
        return $this$minIntrinsicWidth_u24lambda_u244.minIntrinsicWidth($this$minIntrinsicWidth, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        LayoutModifier $this$minIntrinsicHeight_u24lambda_u245 = (LayoutModifier) r0;
        return $this$minIntrinsicHeight_u24lambda_u245.minIntrinsicHeight($this$minIntrinsicHeight, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        LayoutModifier $this$maxIntrinsicWidth_u24lambda_u246 = (LayoutModifier) r0;
        return $this$maxIntrinsicWidth_u24lambda_u246.maxIntrinsicWidth($this$maxIntrinsicWidth, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        LayoutModifier $this$maxIntrinsicHeight_u24lambda_u247 = (LayoutModifier) r0;
        return $this$maxIntrinsicHeight_u24lambda_u247.maxIntrinsicHeight($this$maxIntrinsicHeight, measurable, width);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        Modifier.Element element = this.element;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier $this$draw_u24lambda_u248 = (DrawModifier) element;
        if (this.invalidateCache == true) goto L5;
    L7:
        $this$draw_u24lambda_u248.draw($this$draw);
        return;
    L5:
        if ((element instanceof DrawCacheModifier) == false) goto L7;
        updateDrawCache();
        goto L7
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration config = ((SemanticsModifier) r0).getSemanticsConfiguration();
        Intrinsics.checkNotNull($this$applySemantics, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        SemanticsConfiguration toMergeInto = (SemanticsConfiguration) $this$applySemantics;
        toMergeInto.collapsePeer$ui_release(config);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        PointerInputModifier $this$onPointerEvent_H0pRuoY_u24lambda_u249 = (PointerInputModifier) r0;
        $this$onPointerEvent_H0pRuoY_u24lambda_u249.getPointerInputFilter().mo5612onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if ((this.element instanceof PointerInputModifier) == false) goto L6;
        onCancelPointerInput();
        return;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        PointerInputModifier $this$onCancelPointerInput_u24lambda_u2410 = (PointerInputModifier) r0;
        $this$onCancelPointerInput_u24lambda_u2410.getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        PointerInputModifier $this$sharePointerInputWithSiblings_u24lambda_u2411 = (PointerInputModifier) r0;
        return $this$sharePointerInputWithSiblings_u24lambda_u2411.getPointerInputFilter().getShareWithSiblings();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        PointerInputModifier $this$interceptOutOfBoundsChildEvents_u24lambda_u2412 = (PointerInputModifier) r0;
        return $this$interceptOutOfBoundsChildEvents_u24lambda_u2412.getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density $this$modifyParentData, Object parentData) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        ParentDataModifier $this$modifyParentData_u24lambda_u2413 = (ParentDataModifier) r0;
        return $this$modifyParentData_u24lambda_u2413.modifyParentData($this$modifyParentData, parentData);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Modifier.Element r0 = this.element;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) r0).onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo364onRemeasuredozmzZPI(long size) {
        Modifier.Element element = this.element;
        if ((element instanceof OnRemeasuredModifier) == false) goto L6;
        ((OnRemeasuredModifier) element).m5768onRemeasuredozmzZPI(size);
        return;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        Modifier.Element element = this.element;
        if ((element instanceof OnPlacedModifier) == false) goto L6;
        ((OnPlacedModifier) element).onPlaced(coordinates);
        return;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Modifier.Element focusEventModifier = this.element;
        boolean value$iv = focusEventModifier instanceof FocusEventModifier;
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
    L5:
        ((FocusEventModifier) focusEventModifier).onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Modifier.Element focusOrderModifier = this.element;
        boolean value$iv = focusOrderModifier instanceof FocusOrderModifier;
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
    L5:
        ((FocusOrderModifier) focusOrderModifier).populateFocusOrder(new FocusOrder(focusProperties));
    }

    public String toString() {
        return this.element.toString();
    }
}
