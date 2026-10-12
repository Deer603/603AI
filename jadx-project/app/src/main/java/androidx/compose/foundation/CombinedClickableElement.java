package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\f\u0010\u001d\u001a\u00020\u000f*\u00020\u001eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/CombinedClickableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final Function0<Unit> onClick;
    private final String onClickLabel;
    private final Function0<Unit> onDoubleClick;
    private final Function0<Unit> onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource r1, IndicationNodeFactory r2, boolean r3, String r4, Role r5, Function0 r6, String r7, Function0 r8, Function0 r9, boolean r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((CombinedClickableNode) node);
    }

    private CombinedClickableElement(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> r6, String onLongClickLabel, Function0<Unit> r8, Function0<Unit> r9, boolean hapticFeedbackEnabled) {
        this.interactionSource = interactionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = enabled;
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.onClick = r6;
        this.onLongClickLabel = onLongClickLabel;
        this.onLongClick = r8;
        this.onDoubleClick = r9;
        this.hapticFeedbackEnabled = hapticFeedbackEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    public void update(CombinedClickableNode node) {
        node.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        node.m283updatenSzSaCc(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("combinedClickable");
        $this$inspectableProperties.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        $this$inspectableProperties.getProperties().set("interactionSource", this.interactionSource);
        $this$inspectableProperties.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        $this$inspectableProperties.getProperties().set("onClickLabel", this.onClickLabel);
        $this$inspectableProperties.getProperties().set("role", this.role);
        $this$inspectableProperties.getProperties().set("onClick", this.onClick);
        $this$inspectableProperties.getProperties().set("onDoubleClick", this.onDoubleClick);
        $this$inspectableProperties.getProperties().set("onLongClick", this.onLongClick);
        $this$inspectableProperties.getProperties().set("onLongClickLabel", this.onLongClickLabel);
        $this$inspectableProperties.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.hapticFeedbackEnabled));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if (getClass() == other.getClass()) goto L11;
        return false;
    L11:
        CombinedClickableElement r2 = (CombinedClickableElement) other;
        if (Intrinsics.areEqual(this.interactionSource, ((CombinedClickableElement) other).interactionSource) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.indicationNodeFactory, ((CombinedClickableElement) other).indicationNodeFactory) == true) goto L18;
        return false;
    L18:
        if (this.enabled == ((CombinedClickableElement) other).enabled) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.onClickLabel, ((CombinedClickableElement) other).onClickLabel) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.role, ((CombinedClickableElement) other).role) == true) goto L27;
        return false;
    L27:
        if (this.onClick == ((CombinedClickableElement) other).onClick) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.onLongClickLabel, ((CombinedClickableElement) other).onLongClickLabel) == true) goto L33;
        return false;
    L33:
        if (this.onLongClick == ((CombinedClickableElement) other).onLongClick) goto L36;
        return false;
    L36:
        if (this.onDoubleClick == ((CombinedClickableElement) other).onDoubleClick) goto L39;
        return false;
    L39:
        if (this.hapticFeedbackEnabled == ((CombinedClickableElement) other).hapticFeedbackEnabled) goto L41;
        return false;
    L41:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource r0 = this.interactionSource;
        int r1 = 0;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L6:
        int r2 = result * 31;
        IndicationNodeFactory r3 = this.indicationNodeFactory;
        if (r3 == null) goto L9;
        int r4 = r3.hashCode();
    L10:
        int result2 = r2 + r4;
        int result3 = ((result2 * 31) + Boolean.hashCode(this.enabled)) * 31;
        String r5 = this.onClickLabel;
        if (r5 == null) goto L13;
        int r6 = r5.hashCode();
    L14:
        int result4 = (result3 + r6) * 31;
        Role r7 = this.role;
        if (r7 == null) goto L17;
        int r8 = Role.m6178hashCodeimpl(r7.m6180unboximpl());
    L18:
        int result5 = (((result4 + r8) * 31) + this.onClick.hashCode()) * 31;
        String r9 = this.onLongClickLabel;
        if (r9 == null) goto L21;
        int r10 = r9.hashCode();
    L22:
        int result6 = (result5 + r10) * 31;
        Function0<Unit> r11 = this.onLongClick;
        if (r11 == null) goto L25;
        int r12 = r11.hashCode();
    L26:
        int result7 = (result6 + r12) * 31;
        Function0<Unit> r13 = this.onDoubleClick;
        if (r13 == null) goto L30;
        r1 = r13.hashCode();
    L30:
        return ((result7 + r1) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    L25:
        r12 = 0;
        goto L26
    L21:
        r10 = 0;
        goto L22
    L17:
        r8 = 0;
        goto L18
    L13:
        r6 = 0;
        goto L14
    L9:
        r4 = 0;
        goto L10
    L5:
        result = 0;
        goto L6
    }
}
