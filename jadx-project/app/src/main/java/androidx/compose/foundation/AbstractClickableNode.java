package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001aBC\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\b\u00102\u001a\u00020\u000bH\u0002J\b\u00103\u001a\u00020\u0012H\u0004J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\b\u00106\u001a\u00020\u0012H\u0002J\u0006\u00107\u001a\u00020\u0012J\b\u00108\u001a\u00020\u0012H\u0014J\u0006\u00109\u001a\u00020\u0012J\u001a\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H$ø\u0001\u0000¢\u0006\u0004\b@\u0010>J\u0006\u0010A\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u000bH\u0002J\u0018\u0010D\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\bE\u0010>J(\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020Lø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\bP\u0010>J\u000f\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020\u000bH\u0002JN\u0010T\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0002\bUJ\f\u0010V\u001a\u00020\u0012*\u00020WH\u0016J\n\u0010X\u001a\u00020\u0012*\u00020WJ\u0012\u0010Y\u001a\u00020\u0012*\u00020ZH¦@¢\u0006\u0002\u0010[J\u001f\u0010\\\u001a\u00020\u0012*\u00020]2\u0006\u0010^\u001a\u00020\u0015H\u0084@ø\u0001\u0000¢\u0006\u0004\b_\u0010`R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "centerOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "currentKeyPressInteractions", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "<set-?>", "getEnabled", "()Z", "focusableNode", "Landroidx/compose/foundation/FocusableNode;", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "lazilyCreateIndication", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pressInteraction", "shouldAutoInvalidate", "getShouldAutoInvalidate", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "userProvidedInteractionSource", "delayPressInteraction", "disposeInteractions", "emitHoverEnter", "emitHoverExit", "initializeIndicationAndInteractionSourceIfNeeded", "onAttach", "onCancelKeyInput", "onCancelPointerInput", "onClickKeyDownEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "onDetach", "onFocusChange", "isFocused", "onKeyEvent", "onKeyEvent-ZmokQxo", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "resetPointerInputHandler", "()Lkotlin/Unit;", "shouldLazilyCreateIndication", "updateCommon", "updateCommon-QzZPfjk", "applyAdditionalSemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    public static final int $stable = 0;
    public static final TraverseKey TraverseKey = null;
    private long centerOffset;
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;
    private final FocusableNode focusableNode;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private Function0<Unit> onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private MutableInteractionSource userProvidedInteractionSource;

    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker r1) {
            this();
        }

        private TraverseKey() {
        }
    }

    static {
        TraverseKey = new TraverseKey(null);
        $stable = 8;
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource r1, IndicationNodeFactory r2, boolean r3, String r4, Role r5, Function0 r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public abstract Object clickPointerInput(PointerInputScope r1, Continuation<? super Unit> r2);

    /* JADX INFO: renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo201onClickKeyDownEventZmokQxo(KeyEvent r1);

    /* JADX INFO: renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo202onClickKeyUpEventZmokQxo(KeyEvent r1);

    public static final /* synthetic */ boolean access$delayPressInteraction(AbstractClickableNode $this) {
        return $this.delayPressInteraction();
    }

    public static final /* synthetic */ void access$emitHoverEnter(AbstractClickableNode $this) {
        $this.emitHoverEnter();
    }

    public static final /* synthetic */ void access$emitHoverExit(AbstractClickableNode $this) {
        $this.emitHoverExit();
    }

    public static final /* synthetic */ MutableInteractionSource access$getInteractionSource$p(AbstractClickableNode $this) {
        return $this.interactionSource;
    }

    public static final /* synthetic */ PressInteraction.Press access$getPressInteraction$p(AbstractClickableNode $this) {
        return $this.pressInteraction;
    }

    public static final /* synthetic */ void access$onFocusChange(AbstractClickableNode $this, boolean isFocused) {
        $this.onFocusChange(isFocused);
    }

    public static final /* synthetic */ void access$setPressInteraction$p(AbstractClickableNode $this, PressInteraction.Press r1) {
        $this.pressInteraction = r1;
    }

    private AbstractClickableNode(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> r11) {
        this.interactionSource = interactionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.enabled = enabled;
        this.onClick = r11;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.Companion.m4063getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.Companion.m4141getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = TraverseKey;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final boolean shouldLazilyCreateIndication() {
        if (this.userProvidedInteractionSource == null) goto L5;
    L7:
        return false;
    L5:
        if (this.indicationNodeFactory == null) goto L7;
        return true;
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver $this$applyAdditionalSemantics) {
    }

    /* JADX INFO: renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    protected final void m206updateCommonQzZPfjk(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> r9) {
        boolean isIndicationNodeDirty = false;
        if (Intrinsics.areEqual(this.userProvidedInteractionSource, interactionSource) == true) goto L6;
        disposeInteractions();
        this.userProvidedInteractionSource = interactionSource;
        this.interactionSource = interactionSource;
        isIndicationNodeDirty = true;
    L6:
        if (Intrinsics.areEqual(this.indicationNodeFactory, indicationNodeFactory) == true) goto L9;
        this.indicationNodeFactory = indicationNodeFactory;
        isIndicationNodeDirty = true;
    L9:
        if (this.enabled == enabled) goto L16;
        FocusableNode r1 = this.focusableNode;
        if (enabled == false) goto L13;
        delegate(r1);
    L14:
        SemanticsModifierNodeKt.invalidateSemantics(this);
        this.enabled = enabled;
        goto L16
    L13:
        undelegate(r1);
        disposeInteractions();
    L16:
        if (Intrinsics.areEqual(this.onClickLabel, onClickLabel) == true) goto L19;
        this.onClickLabel = onClickLabel;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L19:
        if (Intrinsics.areEqual(this.role, role) == true) goto L21;
        this.role = role;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L21:
        this.onClick = r9;
        if (this.lazilyCreateIndication == shouldLazilyCreateIndication()) goto L28;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        if (this.lazilyCreateIndication == true) goto L28;
        if (this.indicationNode != null) goto L28;
        isIndicationNodeDirty = true;
    L28:
        if (isIndicationNodeDirty == true) goto L30;
    L37:
        this.focusableNode.update(this.interactionSource);
        return;
    L30:
        if (this.indicationNode == null) goto L32;
    L33:
        DelegatableNode it = this.indicationNode;
        if (it == null) goto L36;
        undelegate(it);
    L36:
        this.indicationNode = null;
        initializeIndicationAndInteractionSourceIfNeeded();
        goto L37
    L32:
        if (this.lazilyCreateIndication == true) goto L37;
        goto L33
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (this.lazilyCreateIndication == true) goto L6;
        initializeIndicationAndInteractionSourceIfNeeded();
    L6:
        if (this.enabled == false) goto L9;
        delegate(this.focusableNode);
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource != null) goto L5;
        this.interactionSource = null;
    L5:
        DelegatableNode it = this.indicationNode;
        if (it == null) goto L8;
        undelegate(it);
    L8:
        this.indicationNode = null;
    }

    protected final void disposeInteractions() {
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L33;
        int r2 = 0;
        PressInteraction.Press oldValue = this.pressInteraction;
        if (oldValue == null) goto L7;
        PressInteraction.Cancel interaction = new PressInteraction.Cancel(oldValue);
        interactionSource.tryEmit(interaction);
    L7:
        HoverInteraction.Enter oldValue2 = this.hoverInteraction;
        if (oldValue2 == null) goto L10;
        HoverInteraction.Exit interaction2 = new HoverInteraction.Exit(oldValue2);
        interactionSource.tryEmit(interaction2);
    L10:
        LongObjectMap this_$iv = this.currentKeyPressInteractions;
        int $i$f$forEachValue = 0;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L33;
    L12:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r16 = r2;
        LongObjectMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L15:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L19;
        boolean r19 = true;
    L20:
        if (r19 == false) goto L23;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        PressInteraction.Press it = (PressInteraction.Press) v$iv[index$iv$iv];
        interactionSource.tryEmit(new PressInteraction.Cancel(it));
    L23:
        slot$iv$iv = slot$iv$iv >> r3;
        j$iv$iv = j$iv$iv + 1;
        r3 = r3;
        $i$f$forEachValue = $i$f$forEachValue;
        goto L15
    L19:
        r19 = false;
        goto L20
    L24:
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (bitCount$iv$iv != r3) goto L33;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L33;
        i$iv$iv = i$iv$iv + 1;
        r2 = r16;
        this_$iv = this_$iv2;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L12
    L27:
        $i$f$forEachValue2 = $i$f$forEachValue;
    L33:
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    private final void onFocusChange(boolean isFocused) {
        if (isFocused == false) goto L6;
        initializeIndicationAndInteractionSourceIfNeeded();
        return;
    L6:
        if (this.interactionSource == null) goto L30;
        LongObjectMap this_$iv = this.currentKeyPressInteractions;
        int $i$f$forEachValue = 0;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L30;
    L9:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L12:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L16;
        boolean r17 = true;
    L17:
        if (r17 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        PressInteraction.Press it = (PressInteraction.Press) v$iv[index$iv$iv];
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$1$1(this, it, null), 3, null);
    L20:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        this_$iv = this_$iv;
        $i$f$forEachValue = $i$f$forEachValue;
        goto L12
    L16:
        r17 = false;
        goto L17
    L21:
        LongObjectMap this_$iv2 = this_$iv;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (bitCount$iv$iv != r12) goto L30;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L30;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L9
    L24:
        this_$iv2 = this_$iv;
        $i$f$forEachValue2 = $i$f$forEachValue;
    L30:
        this.currentKeyPressInteractions.clear();
        onCancelKeyInput();
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        if (this.indicationNode == null) goto L5;
        return;
    L5:
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        if (indicationNodeFactory != null) goto L8;
        return;
    L8:
        if (this.interactionSource != null) goto L10;
        this.interactionSource = InteractionSourceKt.MutableInteractionSource();
    L10:
        this.focusableNode.update(this.interactionSource);
        MutableInteractionSource r2 = this.interactionSource;
        Intrinsics.checkNotNull(r2);
        DelegatableNode node = indicationNodeFactory.create(r2);
        delegate(node);
        this.indicationNode = node;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo204onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        long $this$toOffset_u2d_u2dgyyYBs$iv = IntSizeKt.m7150getCenterozmzZPI(bounds);
        float x$iv$iv = IntOffset.m7101getXimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        float y$iv$iv = IntOffset.m7102getYimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        long v1$iv$iv$iv = Float.floatToRawIntBits(x$iv$iv);
        long v2$iv$iv$iv = Float.floatToRawIntBits(y$iv$iv);
        this.centerOffset = Offset.m4117constructorimpl((v1$iv$iv$iv << 32) | (4294967295L & v2$iv$iv$iv));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled == false) goto L13;
        if (pass != PointerEventPass.Main) goto L13;
        int r2 = pointerEvent.m5531getType7fucELk();
        if (PointerEventType.m5538equalsimpl0(r2, PointerEventType.Companion.m5542getEnter7fucELk()) == false) goto L10;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
        goto L13
    L10:
        if (PointerEventType.m5538equalsimpl0(r2, PointerEventType.Companion.m5543getExit7fucELk()) == false) goto L13;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
    L13:
        if (this.pointerInputNode != null) goto L15;
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickableNode$onPointerEvent$3(this)));
    L15:
        SuspendingPointerInputModifierNode r3 = this.pointerInputNode;
        if (r3 == null) goto L19;
        r3.mo204onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        return;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L8;
        HoverInteraction.Enter oldValue = this.hoverInteraction;
        if (oldValue == null) goto L8;
        HoverInteraction.Exit interaction = new HoverInteraction.Exit(oldValue);
        interactionSource.tryEmit(interaction);
    L8:
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode r0 = this.pointerInputNode;
        if (r0 == null) goto L12;
        r0.onCancelPointerInput();
        return;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo203onKeyEventZmokQxo(KeyEvent event) {
        initializeIndicationAndInteractionSourceIfNeeded();
        long keyCode = KeyEvent_androidKt.m5445getKeyZmokQxo(event);
        if (this.enabled == false) goto L18;
        if (ClickableKt.m264access$isPressZmokQxo(event) == false) goto L18;
        boolean wasInteractionHandled = false;
        if (this.currentKeyPressInteractions.containsKey(keyCode) == true) goto L13;
        PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
        this.currentKeyPressInteractions.set(keyCode, press);
        if (this.interactionSource == null) goto L11;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
    L11:
        wasInteractionHandled = true;
    L13:
        if (mo201onClickKeyDownEventZmokQxo(event) == true) goto L32;
        if (wasInteractionHandled == false) goto L33;
        return true;
    L33:
        return false;
    L32:
        return true;
    L18:
        if (this.enabled == false) goto L31;
        if (ClickableKt.m263access$isClickZmokQxo(event) == false) goto L31;
        PressInteraction.Press press2 = this.currentKeyPressInteractions.remove(keyCode);
        if (press2 != null) goto L24;
    L27:
        if (press2 == null) goto L34;
        return true;
    L34:
        return false;
    L24:
        if (this.interactionSource == null) goto L26;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, press2, null), 3, null);
    L26:
        mo202onClickKeyUpEventZmokQxo(event);
    L31:
        return false;
    }

    protected void onCancelKeyInput() {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo205onPreKeyEventZmokQxo(KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        if (this.role == null) goto L5;
        Role r0 = this.role;
        Intrinsics.checkNotNull(r0);
        SemanticsPropertiesKt.m6200setRolekuIjeqM($this$applySemantics, r0.m6180unboximpl());
    L5:
        SemanticsPropertiesKt.onClick($this$applySemantics, this.onClickLabel, new AnonymousClass1(this));
        if (this.enabled == false) goto L8;
        FocusableNode $this$applySemantics_u24lambda_u2410 = this.focusableNode;
        $this$applySemantics_u24lambda_u2410.applySemantics($this$applySemantics);
    L9:
        applyAdditionalSemantics($this$applySemantics);
        return;
    L8:
        SemanticsPropertiesKt.disabled($this$applySemantics);
        goto L9
    }

    protected final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode r0 = this.pointerInputNode;
        if (r0 == null) goto L5;
        r0.resetPointerInputHandler();
        return Unit.INSTANCE;
    L5:
        return null;
    }

    /* JADX INFO: renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    protected final Object m200handlePressInteractiond4ec7I(PressGestureScope $this$handlePressInteraction_u2dd_u2d4ec7I, long offset, Continuation<? super Unit> r12) {
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L10;
        Object r9 = CoroutineScopeKt.coroutineScope(new AbstractClickableNode$handlePressInteraction$2$1($this$handlePressInteraction_u2dd_u2d4ec7I, offset, interactionSource, this, null), r12);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r9;
    L10:
        return Unit.INSTANCE;
    }

    private final boolean delayPressInteraction() {
        if (ClickableKt.hasScrollableContainer(this) == false) goto L5;
    L8:
        return true;
    L5:
        if (Clickable_androidKt.isComposeRootInScrollableContainer(this) == true) goto L8;
        return false;
    }

    private final void emitHoverEnter() {
        if (this.hoverInteraction != null) goto L9;
        HoverInteraction.Enter interaction = new HoverInteraction.Enter();
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L7;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(interactionSource, interaction, null), 3, null);
    L7:
        this.hoverInteraction = interaction;
        return;
    }

    private final void emitHoverExit() {
        HoverInteraction.Enter oldValue = this.hoverInteraction;
        if (oldValue == null) goto L9;
        HoverInteraction.Exit interaction = new HoverInteraction.Exit(oldValue);
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L7;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(interactionSource, interaction, null), 3, null);
    L7:
        this.hoverInteraction = null;
        return;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }
}
