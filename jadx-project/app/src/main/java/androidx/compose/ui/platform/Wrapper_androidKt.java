package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0002\u0010\u0010\u001a,\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "createApplier", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "container", "doSetContent", "Landroidx/compose/runtime/Composition;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "parent", "Landroidx/compose/runtime/CompositionContext;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "setContent", "Landroidx/compose/ui/platform/AbstractComposeView;", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = null;

    public static final AbstractApplier<LayoutNode> createApplier(LayoutNode container) {
        return new UiApplier(container);
    }

    public static final Composition setContent(AbstractComposeView $this$setContent, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r7) {
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView it = null;
        if ($this$setContent.getChildCount() <= 0) goto L7;
        View r0 = $this$setContent.getChildAt(0);
        if ((r0 instanceof AndroidComposeView) == false) goto L8;
        it = (AndroidComposeView) r0;
    L8:
        if (it != null) goto L11;
        it = new AndroidComposeView($this$setContent.getContext(), parent.getEffectCoroutineContext());
        $this$setContent.addView(it.getView(), DefaultLayoutParams);
    L11:
        return doSetContent(it, parent, r7);
    L7:
        $this$setContent.removeAllViews();
        goto L8
    }

    private static final Composition doSetContent(AndroidComposeView owner, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r7) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == true) goto L5;
    L7:
        Object r0 = owner.getView().getTag(R.id.wrapped_composition_tag);
        if ((r0 instanceof WrappedComposition) == false) goto L10;
        WrappedComposition it = (WrappedComposition) r0;
    L11:
        if (it != null) goto L13;
        it = new WrappedComposition(owner, CompositionKt.Composition(new UiApplier(owner.getRoot()), parent));
        owner.getView().setTag(R.id.wrapped_composition_tag, it);
    L13:
        it.setContent(r7);
        if (Intrinsics.areEqual(owner.getCoroutineContext(), parent.getEffectCoroutineContext()) == true) goto L17;
        owner.setCoroutineContext(parent.getEffectCoroutineContext());
    L17:
        return it;
    L10:
        it = null;
        goto L11
    L5:
        if (owner.getTag(R.id.inspection_slot_table_set) != null) goto L7;
        owner.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        goto L7
    }

    static {
        DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    }
}
