package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\t\u001a\u00020\n*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015ø\u0001\u0000¢\u0006\u0002\b\u0017\u001aB\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015ø\u0001\u0000¢\u0006\u0002\b\u0018\u001aA\u0010\u0019\u001a\u00020\n*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001e\b\u0004\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\n0\u001bH\u0080\b\u001a\u0088\u0001\u0010\u001d\u001a\u00020\n*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007ø\u0001\u0000¢\u0006\u0002\b!\u001a\u0090\u0001\u0010\u001d\u001a\u00020\n*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\"\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015ø\u0001\u0000¢\u0006\u0002\b#\u001at\u0010\u001d\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007ø\u0001\u0000¢\u0006\u0002\b$\u001a|\u0010\u001d\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\"\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015ø\u0001\u0000¢\u0006\u0002\b%\u001a\f\u0010&\u001a\u00020\u0001*\u00020'H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isEnter", "isEnter-ZmokQxo", "isPress", "isPress-ZmokQxo", "clickable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "clickable-O2vRcR0", "clickable-XHw0xAI", "clickableWithIndicationIfNeeded", "createClickable", "Lkotlin/Function2;", "Landroidx/compose/foundation/IndicationNodeFactory;", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "hapticFeedbackEnabled", "combinedClickable-auXiCPI", "combinedClickable-cJG_KMw", "combinedClickable-f5TDLPQ", "hasScrollableContainer", "Landroidx/compose/ui/node/TraversableNode;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ClickableKt {
    /* JADX INFO: renamed from: access$isClick-ZmokQxo, reason: not valid java name */
    public static final /* synthetic */ boolean m263access$isClickZmokQxo(KeyEvent $receiver) {
        return m277isClickZmokQxo($receiver);
    }

    /* JADX INFO: renamed from: access$isPress-ZmokQxo, reason: not valid java name */
    public static final /* synthetic */ boolean m264access$isPressZmokQxo(KeyEvent $receiver) {
        return m279isPressZmokQxo($receiver);
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m268clickableXHw0xAI$default(Modifier r1, boolean r2, String r3, Role r4, Function0 r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        return m267clickableXHw0xAI(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m267clickableXHw0xAI(Modifier $this$clickable_u2dXHw0xAI, final boolean enabled, final String onClickLabel, final Role role, final Function0<Unit> r6) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(enabled, onClickLabel, role, r6);
    L7:
        return ComposedModifierKt.composed($this$clickable_u2dXHw0xAI, r1, new ClickableKt$clickable$2(enabled, onClickLabel, role, r6));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m266clickableO2vRcR0$default(Modifier r7, MutableInteractionSource r8, Indication r9, boolean r10, String r11, Role r12, Function0 r13, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r14 & 8) == 0) goto L9;
        String r4 = null;
    L11:
        if ((r14 & 16) == 0) goto L13;
        Role r5 = null;
    L15:
        return m265clickableO2vRcR0(r7, r8, r9, r3, r4, r5, r13);
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m265clickableO2vRcR0(Modifier $this$clickable_u2dO2vRcR0, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final String onClickLabel, final Role role, final Function0<Unit> r30) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        ClickableElement r8 = new ClickableElement(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, r30, null);
    L11:
        return $this$clickable_u2dO2vRcR0.then(r8);
    L5:
        if (indication != null) goto L7;
        IndicationNodeFactory indicationNodeFactory2 = null;
        r8 = new ClickableElement(interactionSource, indicationNodeFactory2, enabled, onClickLabel, role, r30, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        IndicationNodeFactory indicationNodeFactory3 = null;
        r8 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new ClickableElement(interactionSource, indicationNodeFactory3, enabled, onClickLabel, role, r30, null));
        goto L11
    L9:
        r8 = ComposedModifierKt.composed$default(Modifier.Companion, null, new ClickableKt$clickableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, enabled, onClickLabel, role, r30), 1, null);
        goto L11
    }

    /* JADX INFO: renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m276combinedClickablef5TDLPQ$default(Modifier r2, boolean r3, String r4, Role r5, String r6, Function0 r7, Function0 r8, boolean r9, Function0 r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = true;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = true;
    L24:
        return m275combinedClickablef5TDLPQ(r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    /* JADX INFO: renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final Modifier m275combinedClickablef5TDLPQ(Modifier $this$combinedClickable_u2df5TDLPQ, final boolean enabled, final String onClickLabel, final Role role, final String onLongClickLabel, final Function0<Unit> r17, final Function0<Unit> r18, final boolean hapticFeedbackEnabled, final Function0<Unit> r20) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1(enabled, onClickLabel, role, r20, r18, r17, onLongClickLabel, hapticFeedbackEnabled);
    L7:
        return ComposedModifierKt.composed($this$combinedClickable_u2df5TDLPQ, r2, new ClickableKt$combinedClickable$2(enabled, onClickLabel, role, onLongClickLabel, r17, r18, hapticFeedbackEnabled, r20));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m274combinedClickablecJG_KMw$default(Modifier r1, boolean r2, String r3, Role r4, String r5, Function0 r6, Function0 r7, Function0 r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L20;
        Function0 r11 = null;
    L21:
        Function0 r12 = r6;
        Role r13 = r4;
        return m273combinedClickablecJG_KMw(r1, r2, r3, r13, r5, r12, r11, r8);
    L20:
        r11 = r7;
        goto L21
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m273combinedClickablecJG_KMw(Modifier $this$combinedClickable_u2dcJG_KMw, final boolean enabled, final String onClickLabel, final Role role, final String onLongClickLabel, final Function0 onLongClick, final Function0 onDoubleClick, final Function0 onClick) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(enabled, onClickLabel, role, onClick, onDoubleClick, onLongClick, onLongClickLabel);
    L7:
        return ComposedModifierKt.composed($this$combinedClickable_u2dcJG_KMw, r2, new ClickableKt$combinedClickable$4(enabled, onClickLabel, role, onLongClickLabel, onLongClick, onDoubleClick, onClick));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m272combinedClickableauXiCPI$default(Modifier r2, MutableInteractionSource r3, Indication r4, boolean r5, String r6, Role r7, String r8, Function0 r9, Function0 r10, boolean r11, Function0 r12, int r13, Object r14) {
        if ((r13 & 4) == 0) goto L6;
        r5 = true;
    L6:
        if ((r13 & 8) == 0) goto L9;
        r6 = null;
    L9:
        if ((r13 & 16) == 0) goto L12;
        r7 = null;
    L12:
        if ((r13 & 32) == 0) goto L15;
        r8 = null;
    L15:
        if ((r13 & 64) == 0) goto L18;
        r9 = null;
    L18:
        if ((r13 & 128) == 0) goto L21;
        r10 = null;
    L21:
        if ((r13 & 256) == 0) goto L24;
        r11 = true;
    L24:
        return m271combinedClickableauXiCPI(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    /* JADX INFO: renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m271combinedClickableauXiCPI(Modifier $this$combinedClickable_u2dauXiCPI, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final String onClickLabel, final Role role, final String onLongClickLabel, final Function0<Unit> r43, final Function0<Unit> r44, final boolean hapticFeedbackEnabled, final Function0<Unit> r46) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        CombinedClickableElement r12 = new CombinedClickableElement(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, r46, onLongClickLabel, r43, r44, hapticFeedbackEnabled, null);
    L11:
        return $this$combinedClickable_u2dauXiCPI.then(r12);
    L5:
        if (indication != null) goto L7;
        IndicationNodeFactory indicationNodeFactory2 = null;
        r12 = new CombinedClickableElement(interactionSource, indicationNodeFactory2, enabled, onClickLabel, role, r46, onLongClickLabel, r43, r44, hapticFeedbackEnabled, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        IndicationNodeFactory indicationNodeFactory3 = null;
        r12 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new CombinedClickableElement(interactionSource, indicationNodeFactory3, enabled, onClickLabel, role, r46, onLongClickLabel, r43, r44, hapticFeedbackEnabled, null));
        goto L11
    L9:
        r12 = ComposedModifierKt.composed$default(Modifier.Companion, null, new ClickableKt$combinedClickableauXiCPI$$inlined$clickableWithIndicationIfNeeded$1(indication, enabled, onClickLabel, role, r46, onLongClickLabel, r43, r44, hapticFeedbackEnabled), 1, null);
        goto L11
    }

    /* JADX INFO: renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m270combinedClickableXVZzFYc$default(Modifier r10, MutableInteractionSource r11, Indication r12, boolean r13, String r14, Role r15, String r16, Function0 r17, Function0 r18, Function0 r19, int r20, Object r21) {
        if ((r20 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r20 & 8) == 0) goto L9;
        String r4 = null;
    L11:
        if ((r20 & 16) == 0) goto L13;
        Role r5 = null;
    L15:
        if ((r20 & 32) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r20 & 64) == 0) goto L21;
        Function0 r7 = null;
    L23:
        if ((r20 & 128) == 0) goto L25;
        Function0 r8 = null;
    L27:
        return m269combinedClickableXVZzFYc(r10, r11, r12, r3, r4, r5, r6, r7, r8, r19);
    L25:
        r8 = r18;
        goto L27
    L21:
        r7 = r17;
        goto L23
    L17:
        r6 = r16;
        goto L19
    L13:
        r5 = r15;
        goto L15
    L9:
        r4 = r14;
        goto L11
    L5:
        r3 = r13;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m269combinedClickableXVZzFYc(Modifier $this$combinedClickable_u2dXVZzFYc, MutableInteractionSource interactionSource, final Indication indication, final boolean enabled, final String onClickLabel, final Role role, final String onLongClickLabel, final Function0 onLongClick, final Function0 onDoubleClick, final Function0 onClick) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L5;
        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) indication;
        CombinedClickableElement r11 = new CombinedClickableElement(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick, onLongClickLabel, onLongClick, onDoubleClick, true, null);
    L11:
        return $this$combinedClickable_u2dXVZzFYc.then(r11);
    L5:
        if (indication != null) goto L7;
        IndicationNodeFactory indicationNodeFactory2 = null;
        r11 = new CombinedClickableElement(interactionSource, indicationNodeFactory2, enabled, onClickLabel, role, onClick, onLongClickLabel, onLongClick, onDoubleClick, true, null);
        goto L11
    L7:
        if (interactionSource == null) goto L9;
        IndicationNodeFactory indicationNodeFactory3 = null;
        r11 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(new CombinedClickableElement(interactionSource, indicationNodeFactory3, enabled, onClickLabel, role, onClick, onLongClickLabel, onLongClick, onDoubleClick, true, null));
        goto L11
    L9:
        r11 = ComposedModifierKt.composed$default(Modifier.Companion, null, new ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1(indication, enabled, onClickLabel, role, onClick, onLongClickLabel, onLongClick, onDoubleClick), 1, null);
        goto L11
    }

    public static final Modifier clickableWithIndicationIfNeeded(Modifier $this$clickableWithIndicationIfNeeded, MutableInteractionSource interactionSource, final Indication indication, final Function2<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> r8) {
        if ((indication instanceof IndicationNodeFactory) == false) goto L6;
        Modifier r1 = r8.invoke(interactionSource, indication);
    L12:
        return $this$clickableWithIndicationIfNeeded.then(r1);
    L6:
        if (indication != null) goto L8;
        r1 = r8.invoke(interactionSource, null);
        goto L12
    L8:
        if (interactionSource == null) goto L10;
        r1 = IndicationKt.indication(Modifier.Companion, interactionSource, indication).then(r8.invoke(interactionSource, null));
        goto L12
    L10:
        r1 = ComposedModifierKt.composed$default(Modifier.Companion, null, new AnonymousClass1(indication, r8), 1, null);
        goto L12
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    private static final boolean m279isPressZmokQxo(KeyEvent $this$isPress) {
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo($this$isPress), KeyEventType.Companion.m5442getKeyDownCS__XNY()) == true) goto L5;
    L7:
        return false;
    L5:
        if (m278isEnterZmokQxo($this$isPress) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    private static final boolean m277isClickZmokQxo(KeyEvent $this$isClick) {
        if (KeyEventType.m5438equalsimpl0(KeyEvent_androidKt.m5446getTypeZmokQxo($this$isClick), KeyEventType.Companion.m5443getKeyUpCS__XNY()) == true) goto L5;
    L7:
        return false;
    L5:
        if (m278isEnterZmokQxo($this$isClick) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m278isEnterZmokQxo(KeyEvent $this$isEnter) {
        long r0 = KeyEvent_androidKt.m5445getKeyZmokQxo($this$isEnter);
        if (Key.m5137equalsimpl0(r0, Key.Companion.m5209getDirectionCenterEK5gGoQ()) == false) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        boolean r3 = true;
    L9:
        if (r3 == false) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L16;
        return false;
    L16:
        return true;
    L11:
        r1 = Key.m5137equalsimpl0(r0, Key.Companion.m5361getSpacebarEK5gGoQ());
        goto L12
    L8:
        r3 = Key.m5137equalsimpl0(r0, Key.Companion.m5315getNumPadEnterEK5gGoQ());
        goto L9
    L5:
        r2 = Key.m5137equalsimpl0(r0, Key.Companion.m5223getEnterEK5gGoQ());
        goto L6
    }

    public static final boolean hasScrollableContainer(TraversableNode $this$hasScrollableContainer) {
        final Ref.BooleanRef hasScrollable = new Ref.BooleanRef();
        TraversableNodeKt.traverseAncestors($this$hasScrollableContainer, ScrollableContainerNode.TraverseKey, new C02131(hasScrollable));
        return hasScrollable.element;
    }
}
