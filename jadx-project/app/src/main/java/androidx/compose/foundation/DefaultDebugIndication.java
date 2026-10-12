package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "()V", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "equals", "", "other", "", "hashCode", "", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultDebugIndication implements IndicationNodeFactory {
    public static final DefaultDebugIndication INSTANCE = null;

    /* JADX INFO: compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\u000b*\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "isFocused", "", "isHovered", "isPressed", "onAttach", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {
        private final InteractionSource interactionSource;
        private boolean isFocused;
        private boolean isHovered;
        private boolean isPressed;

        public static final /* synthetic */ InteractionSource access$getInteractionSource$p(DefaultDebugIndicationInstance $this) {
            return $this.interactionSource;
        }

        public static final /* synthetic */ boolean access$isFocused$p(DefaultDebugIndicationInstance $this) {
            return $this.isFocused;
        }

        public static final /* synthetic */ boolean access$isHovered$p(DefaultDebugIndicationInstance $this) {
            return $this.isHovered;
        }

        public static final /* synthetic */ boolean access$isPressed$p(DefaultDebugIndicationInstance $this) {
            return $this.isPressed;
        }

        public static final /* synthetic */ void access$setFocused$p(DefaultDebugIndicationInstance $this, boolean r1) {
            $this.isFocused = r1;
        }

        public static final /* synthetic */ void access$setHovered$p(DefaultDebugIndicationInstance $this, boolean r1) {
            $this.isHovered = r1;
        }

        public static final /* synthetic */ void access$setPressed$p(DefaultDebugIndicationInstance $this, boolean r1) {
            $this.isPressed = r1;
        }

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.interactionSource = interactionSource;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            BuildersKt.launch$default(getCoroutineScope(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope $this$draw) {
            $this$draw.drawContent();
            if (this.isPressed == false) goto L6;
            DrawScope.m4911drawRectnJ9OG0$default($this$draw, Color.m4365copywmQWz5c$default(Color.Companion.m4392getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0, $this$draw.mo4917getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            return;
        L6:
            if (this.isHovered == false) goto L8;
        L9:
            DrawScope.m4911drawRectnJ9OG0$default($this$draw, Color.m4365copywmQWz5c$default(Color.Companion.m4392getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0, $this$draw.mo4917getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            return;
        L8:
            if (this.isFocused == true) goto L9;
        }
    }

    static {
        INSTANCE = new DefaultDebugIndication();
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        if (other != this) goto L4;
        return true;
    L4:
        return false;
    }
}
