package androidx.compose.animation;

import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SharedElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0013\u0010d\u001a\u00020eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u00106J\u0010\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0016J\b\u0010k\u001a\u00020hH\u0016J\b\u0010l\u001a\u00020hH\u0016J\b\u0010m\u001a\u00020hH\u0016R+\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0013\u001a\u0004\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00103\u001a\u0002048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R+\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0019\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010<\u001a\u0004\u0018\u00010\u0000X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0019\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u0019\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R+\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u0019\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\u0019\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\"R\u0014\u0010S\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\"R\u0011\u0010U\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010\"R\u0011\u0010W\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bX\u0010\"R+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0019\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R+\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "sharedElement", "Landroidx/compose/animation/SharedElement;", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "", "overlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "renderInOverlayDuringTransition", "userState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "zIndex", "", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "<set-?>", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "boundsAnimation$delegate", "Landroidx/compose/runtime/MutableState;", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation_release", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation_release", "(Landroidx/compose/ui/graphics/Path;)V", "firstFrameDrawn", "getFirstFrameDrawn$animation_release", "()Z", "setFirstFrameDrawn$animation_release", "(Z)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer$delegate", "lookaheadCoords", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLookaheadCoords", "()Lkotlin/jvm/functions/Function0;", "setLookaheadCoords", "(Lkotlin/jvm/functions/Function0;)V", "nonNullLookaheadSize", "Landroidx/compose/ui/geometry/Size;", "getNonNullLookaheadSize-NH-jbRc", "()J", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "overlayClip$delegate", "parentState", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "placeHolderSize$delegate", "getRenderInOverlayDuringTransition", "setRenderInOverlayDuringTransition", "renderInOverlayDuringTransition$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "renderOnlyWhenVisible$delegate", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "sharedElement$delegate", "shouldRenderBasedOnTarget", "getShouldRenderBasedOnTarget", "shouldRenderInOverlay", "getShouldRenderInOverlay$animation_release", "shouldRenderInPlace", "getShouldRenderInPlace", "target", "getTarget", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "userState$delegate", "getZIndex", "()F", "setZIndex", "(F)V", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "calculateLookaheadOffset", "Landroidx/compose/ui/geometry/Offset;", "calculateLookaheadOffset-F1C5BW0", "drawInOverlay", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onAbandoned", "onForgotten", "onRemembered", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 0;
    private final MutableState boundsAnimation$delegate;
    private Path clipPathInOverlay;
    private boolean firstFrameDrawn;
    private final MutableState layer$delegate;
    private Function0<? extends LayoutCoordinates> lookaheadCoords;
    private final MutableState overlayClip$delegate;
    private SharedElementInternalState parentState;
    private final MutableState placeHolderSize$delegate;
    private final MutableState renderInOverlayDuringTransition$delegate;
    private final MutableState renderOnlyWhenVisible$delegate;
    private final MutableState sharedElement$delegate;
    private final MutableState userState$delegate;
    private final MutableFloatState zIndex$delegate;

    static {
        $stable = 8;
    }

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, SharedTransitionScope.OverlayClip overlayClip, boolean renderInOverlayDuringTransition, SharedTransitionScope.SharedContentState userState, float zIndex) {
        this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(zIndex);
        this.renderInOverlayDuringTransition$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(renderInOverlayDuringTransition), null, 2, null);
        this.sharedElement$delegate = SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation$delegate = SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize$delegate = SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(renderOnlyWhenVisible), null, 2, null);
        this.overlayClip$delegate = SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState$delegate = SnapshotStateKt.mutableStateOf$default(userState, null, 2, null);
        this.lookaheadCoords = SharedElementInternalState$lookaheadCoords$1.INSTANCE;
        this.layer$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final boolean getFirstFrameDrawn$animation_release() {
        return this.firstFrameDrawn;
    }

    public final void setFirstFrameDrawn$animation_release(boolean r1) {
        this.firstFrameDrawn = r1;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        FloatState $this$getValue$iv = this.zIndex$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public void setZIndex(float r4) {
        MutableFloatState $this$setValue$iv = this.zIndex$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final boolean getRenderInOverlayDuringTransition() {
        State $this$getValue$iv = this.renderInOverlayDuringTransition$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setRenderInOverlayDuringTransition(boolean r5) {
        MutableState $this$setValue$iv = this.renderInOverlayDuringTransition$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final SharedElement getSharedElement() {
        State $this$getValue$iv = this.sharedElement$delegate;
        return (SharedElement) $this$getValue$iv.getValue();
    }

    public final void setSharedElement(SharedElement r4) {
        MutableState $this$setValue$iv = this.sharedElement$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final BoundsAnimation getBoundsAnimation() {
        State $this$getValue$iv = this.boundsAnimation$delegate;
        return (BoundsAnimation) $this$getValue$iv.getValue();
    }

    public final void setBoundsAnimation(BoundsAnimation r4) {
        MutableState $this$setValue$iv = this.boundsAnimation$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        State $this$getValue$iv = this.placeHolderSize$delegate;
        return (SharedTransitionScope.PlaceHolderSize) $this$getValue$iv.getValue();
    }

    public final void setPlaceHolderSize(SharedTransitionScope.PlaceHolderSize r4) {
        MutableState $this$setValue$iv = this.placeHolderSize$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final boolean getRenderOnlyWhenVisible() {
        State $this$getValue$iv = this.renderOnlyWhenVisible$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setRenderOnlyWhenVisible(boolean r5) {
        MutableState $this$setValue$iv = this.renderOnlyWhenVisible$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        State $this$getValue$iv = this.overlayClip$delegate;
        return (SharedTransitionScope.OverlayClip) $this$getValue$iv.getValue();
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip r4) {
        MutableState $this$setValue$iv = this.overlayClip$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final SharedTransitionScope.SharedContentState getUserState() {
        State $this$getValue$iv = this.userState$delegate;
        return (SharedTransitionScope.SharedContentState) $this$getValue$iv.getValue();
    }

    public final void setUserState(SharedTransitionScope.SharedContentState r4) {
        MutableState $this$setValue$iv = this.userState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Path getClipPathInOverlay$animation_release() {
        return this.clipPathInOverlay;
    }

    public final void setClipPathInOverlay$animation_release(Path r1) {
        this.clipPathInOverlay = r1;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer != null) goto L6;
        return;
    L6:
        if (this.firstFrameDrawn == true) goto L8;
        return;
    L8:
        if (getShouldRenderInOverlay$animation_release() == true) goto L10;
        return;
    L10:
        if (getSharedElement().getCurrentBounds() == null) goto L45;
        Rect r0 = getSharedElement().getCurrentBounds();
        Unit r5 = null;
        if (r0 == null) goto L14;
        Offset r1 = Offset.m4114boximpl(r0.m4160getTopLeftF1C5BW0());
    L15:
        Intrinsics.checkNotNull(r1);
        long value$iv$iv$iv = r1.m4135unboximpl();
        int bits$iv$iv$iv$iv = (int) (value$iv$iv$iv >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (4294967295L & value$iv$iv$iv);
        float y = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        Path it = this.clipPathInOverlay;
        if (it == null) goto L36;
        int clipOp$iv = ClipOp.Companion.m4355getIntersectrtfAjoo();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = drawScope.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$clipPath_KD09W0M_u24lambda_u245$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L31
        $this$clipPath_KD09W0M_u24lambda_u245$iv.mo4840clipPathmtrdDE(it, clipOp$iv);     // Catch: Throwable -> L31
        drawScope.getDrawContext().getTransform().translate(x, y);     // Catch: Throwable -> L31
        GraphicsLayerKt.drawLayer(drawScope, layer);     // Catch: Throwable -> L25
        drawScope.getDrawContext().getTransform().translate(-x, -y);     // Catch: Throwable -> L29
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        r5 = Unit.INSTANCE;
        goto L36
    L25:
        th = move-exception;
        drawScope.getDrawContext().getTransform().translate(-x, -y);     // Catch: Throwable -> L29
        throw th;     // Catch: Throwable -> L29
    L29:
        th = th;
    L33:
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        throw th;
    L31:
        th = th;
    L36:
        if (r5 != null) goto L54;
        drawScope.getDrawContext().getTransform().translate(x, y);
        GraphicsLayerKt.drawLayer(drawScope, layer);     // Catch: Throwable -> L40
        drawScope.getDrawContext().getTransform().translate(-x, -y);
        return;
    L40:
        th = move-exception;
        drawScope.getDrawContext().getTransform().translate(-x, -y);
        throw th;
    L54:
        return;
    L14:
        r1 = null;
        goto L15
    L45:
        throw new IllegalArgumentException("Error: current bounds not set yet.".toString());
    }

    /* JADX INFO: renamed from: getNonNullLookaheadSize-NH-jbRc, reason: not valid java name */
    public final long m106getNonNullLookaheadSizeNHjbRc() {
        LayoutCoordinates r0 = this.lookaheadCoords.invoke();
        if (r0 == null) goto L7;
        return IntSizeKt.m7156toSizeozmzZPI(r0.mo5722getSizeYbymL2g());
    L7:
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.').toString());
    }

    public final Function0<LayoutCoordinates> getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    public final void setLookaheadCoords(Function0<? extends LayoutCoordinates> r1) {
        this.lookaheadCoords = r1;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public void setParentState(SharedElementInternalState r1) {
        this.parentState = r1;
    }

    /* JADX INFO: renamed from: calculateLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m105calculateLookaheadOffsetF1C5BW0() {
        LayoutCoordinates r0 = this.lookaheadCoords.invoke();
        if (r0 == null) goto L7;
        LayoutCoordinates c = r0;
        return getSharedElement().getScope().getLookaheadRoot$animation_release().mo5723localPositionOfR5De75A(c, Offset.Companion.m4141getZeroF1C5BW0());
    L7:
        throw new IllegalArgumentException("Error: lookahead coordinates is null.".toString());
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    public final GraphicsLayer getLayer() {
        State $this$getValue$iv = this.layer$delegate;
        return (GraphicsLayer) $this$getValue$iv.getValue();
    }

    public final void setLayer(GraphicsLayer r4) {
        MutableState $this$setValue$iv = this.layer$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        if (Intrinsics.areEqual(getSharedElement().getTargetBoundsProvider$animation_release(), this) == false) goto L5;
    L8:
        return true;
    L5:
        if (getRenderOnlyWhenVisible() == false) goto L8;
        return false;
    }

    public final boolean getShouldRenderInOverlay$animation_release() {
        if (getShouldRenderBasedOnTarget() == true) goto L5;
    L9:
        return false;
    L5:
        if (getSharedElement().getFoundMatch() == false) goto L9;
        if (getRenderInOverlayDuringTransition() == false) goto L9;
        return true;
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getFoundMatch() == true) goto L5;
    L10:
        return true;
    L5:
        if (getShouldRenderInOverlay$animation_release() == false) goto L7;
    L9:
        return false;
    L7:
        if (getShouldRenderBasedOnTarget() == false) goto L9;
        goto L9
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
